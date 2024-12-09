package com.example.demo;

import java.util.Objects;

public class Ball {

    int position; //자리 저장
    int number; //값 저장

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

    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }
}
