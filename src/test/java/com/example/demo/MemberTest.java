package com.example.demo;

import ClassList.Member;
import ClassList.MemberResponse;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberTest {

    @Test
    void createMemberResponseTest() {
        Member member = new Member(
                "id",
                "nickname",
                "password");

//        new MemberResponse(member.id, member.nickname)
        MemberResponse memberResponse = new MemberResponse(
                member.getId(),
                member.getNickname());

        assertThat(memberResponse.getLoginId()).isEqualTo(member.getId());
        assertThat(memberResponse.getUsername()).isEqualTo(member.getNickname());

    }


    @Test
    void list(){
        List<Member> memberList = List.of(
                new Member("id", "nickname", "password"),
                new Member("id2", "nickname2", "password2"),
                new Member("id3", "nickname3", "password3"));


        //List<Member> memberList를 반복 (memberList.for)
        // new MemberResponse를 만들고 -> Id, Nickname 넣기
        // 반복문 안에서 list에 넣기

        List<MemberResponse> mamberResponseList = new ArrayList<>();
        for (Member member : memberList) {
            MemberResponse memberResponse = new MemberResponse(
                    member.getId(),
                    member.getNickname());
            mamberResponseList.add(memberResponse);

//        for (int i = 0; i < memberList.size(); i++)
//        MemberResponse memberResponse = new MemberResponse
//                (member.getId(),
//                        member.getNickname());
//        mamberResponseList.add()


        }

    }


    @Test
    void filter(){
        List<Member> memberList = List.of(
                new Member("id", "", "password"),
                new Member("id2", "nickname2", "password2"),
                new Member("id3", "", "password3"));

        ArrayList<MemberResponse> filterList = new ArrayList<>();
        for (Member member : memberList) {
            if(member.getNickname().isEmpty()){  //equals("")
                MemberResponse memberResponse = new MemberResponse(
                        member.getId(),
                        member.getNickname()
                );
            }
        }


    }


    //streamAPI 써보기
    @Test
    void filterUsingStreamAPI(){
        List<Member> memberList = List.of(
        new Member("id", "", "password"),
        new Member("id2", "nickname2", "password2"),
        new Member("id3", "", "password3"));


        List<Member> noNicknameMemberList = memberList.stream()
                .filter((member) -> member.getNickname().isEmpty() )  //equals("")
                .toList();


        ArrayList<MemberResponse> memberResponsesAPI = new ArrayList<>();
        for (Member member : noNicknameMemberList) {
            MemberResponse memberResponse2 = new MemberResponse(
                    member.getId(), member.getNickname()
            );
            memberResponsesAPI.add(memberResponse2);
        }

    }


    @Test
    void stackPractice () {

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);

        integerStack.peek();
        assertThat(integerStack.peek()).isEqualTo(3);

        integerStack.pop();
        assertThat(integerStack.pop()).isEqualTo(2);

        integerStack.peek();
        assertThat(integerStack.peek()).isEqualTo(2);

    }

    @Test
    void queue(){

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        queue.peek();
        assertThat(queue.peek()).isEqualTo(1);

        queue.poll();
        assertThat(queue.peek()).isEqualTo(2);

        queue.peek();
        assertThat(queue.peek()).isEqualTo(2);


    }

    @Test
    void Parenthesis () {
        String s = "";



        boolean solution (String s) {
        boolean answer = true;

        Stack<String> parenthesis = new Stack<>();
        if (s.startsWith(")")) {
            answer = false;
        }
        if (s.startsWith("(")) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.toString(s.charAt(i)).equals("(")) {
                    parenthesis.push("(");
                }
                if (Character.toString(s.charAt(i)).equals(")")) {
                    parenthesis.pop();
                }

            }
            if (parenthesis.size() != 0) {
                answer = false;
            }
            answer = true;
        }
        return answer;

    }
    }




}

