package org.example;


import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String quit = "quit";
        Randomizer rnd = new Randomizer();
        Answers answers = new Answers();
        int questCount = rnd.getRandomNum();
        int answerIndex = rnd.getAnswerIndex();
        int counter = 1;
        System.out.println("\nПриветствую тебя, незнакомец!" +
                        "\nОткрой мне твое имя, а я - отвечу на твои вопросы.");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("\nЯ - Предиктор, и я смогу дать ответ:" +
                        "\n\n- о всём, что творится под Солнцем: бывает ли, и будет ли..;" +
                        "\n- и о тебе самом: можешь ли ты, и станешь ли ты..;" +
                        "\n- и о другом - хочет ли он, боится ли он.." +
                        "\n\nНа все ты вопросы узнаешь ответ - " +
                        "\nКак только проверю - есть ключ или нет." +
                        "\n\nИтак, " + name + ", количество твоих вопросов на сегодня - " + questCount + "!\nПиши свой первый вопрос.");
        String question = sc.nextLine();
        boolean questCheck = StringUtils.containsIgnoreCase(question, " ли ");

        if (questCheck) {
            answerIndex = rnd.getAnswerIndex();
            String answer = answers.getAnswerRu(answerIndex);
            System.out.println("Мой ответ: " + answer);
            counter++;
        }else{
            System.out.println("\nКлюча к возможности ответа, " +
                    "\nчастицы \"ли\"  - в вопросе нету!");
        }

        while (counter < questCount) {
            System.out.println("\nЗадай еще один вопрос.");
            question = sc.nextLine();
            questCheck = StringUtils.contains(question, " ли ");

                if (questCheck) {
                    answerIndex = rnd.getAnswerIndex();
                    String answer = answers.getAnswerRu(answerIndex);
                    System.out.println("\nМой ответ: " + answer);
                    counter++;
                }else{
                    System.out.println("Ключа к возможности ответа, " +
                    "\nчастицы \"ли\"  - в вопросе нету!");
                    counter++;
                }
        }
        System.out.println("\n\n------------------\n\nТы спросил - я дал ответ\nЧто-то - будет, что-то - нет..");

    }
}