package com.example.demo;

import java.util.Objects;

public class Ball {

    private int position; //자리 저장
    private int number; //값 저장



    //Override
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, number);
    }


    //생성자
    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }


    //generate -> Getter
    public int getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    void ball (){
        System.out.println(getPosition());  //출력
        System.out.println(getNumber());
    }


    //generate -> Setter
    public void setPosition(int position) {
        if(position > 3 || position < 1){
            throw new IllegalArgumentException("Error!");
        }

        this.position = position;
    }



    //ball 비교 함수
    public BallStatus matchStatus(Ball other) { //Ball이 데이터타입, otherBall이 변수 이름
        if (this.equals(other)
//                this.number == other.number && this.position == other.position)
        )
        {  //변수이름.number, 변수이름.position
            return BallStatus.STRIKE;
        } else if (this.number == other.number) {
            return BallStatus.BALL;

        }return BallStatus.NOTHING;

    }








}
