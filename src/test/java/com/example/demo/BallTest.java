package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    void ballEqualsTest() {
        // given
        // 같은 값의 Ball 오브젝트 두 개가 있는 상황에서
        Ball ball1 = new Ball(1, 2);
        Ball ball2 = new Ball(1, 2);

        // when
        boolean result = ball1.equals(ball2);
//        ball1.equals(ball2);

        // then
        // 비교 결과는 true가 나와야 한다
        assertThat(result).isEqualTo(true);
//        assertThat(ball1.equals(ball2)).isEqualTo(true);


    }

    @Test
    void matchStatus (){

        Ball computerBall = new Ball(1, 2);
        Ball userBall = new Ball(1, 2);

        assertThat(computerBall.matchStatus(userBall)).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void incrementCount(){




    }
}
