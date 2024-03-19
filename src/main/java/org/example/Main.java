package org.example;


import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
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
        User user = new User();
        Scanner sc = new Scanner(System.in);
        user.setUserName(sc.nextLine());
        while ((user.getUserName() == null) | Objects.equals(user.getUserName(), "")) {
            user.setUserName(sc.nextLine());
        }
        System.out.println("Пиши вопрос в окошке этом," +
                        "\nИ тотчас дам тебе ответы" +
                        "\nО всём что было, есть и будет," +
                        "\nТревожит сердце, мысль волнует." +
                        "\n\nПодумай трижды, не спеши," +
                        "\nК вопросу ключик приложи." +
                        "\nНажми на Enter и внимай" +
                        "\nОтвет - серьёзно принимай." +
                        "\n\nНа все ты вопросы узнаешь ответ - " +
                        "\nКак только проверю - есть ключ или нет." +
                        "\n\nИтак, " + user.getUserName() + ", количество твоих вопросов на сегодня - " + questCount + "!\n\nПиши свой первый вопрос.");
        String question = sc.nextLine();
        boolean questCheck = StringUtils.containsIgnoreCase(question, " ли ");

        if (questCheck) {
            answerIndex = rnd.getAnswerIndex();
            String answer = answers.getAnswerRu(answerIndex);
            System.out.println("Мой ответ: " + answer);
            counter++;
        }else{
            System.out.println("\nКлюча к возможности ответа - " +
                    "\nчастицы \"ли\" - в вопросе нету!");
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