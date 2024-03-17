package org.example;

import java.util.Random;

public class Randomizer {
    private Random random = new Random();
    private int randomNum;
    private int answerIndex;

    public int getRandomNum() {
        randomNum = random.nextInt(1,10);
        return randomNum;
    }


    public int getAnswerIndex() {
        answerIndex = random.nextInt(20);
        return answerIndex;
    }
}
