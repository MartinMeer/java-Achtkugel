package org.example;


import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String exit = "Спасибо!";
        Randomizer rnd = new Randomizer();
        Answers answers = new Answers();
        int questCount = rnd.getRandomNum();
        int answerIndex;
        int counter = 1;
        System.out.println("\nПриветствую тебя, незнакомец!" +
                        "\nОткрой мне твое имя, а я - отвечу на твои вопросы.\n");
        Scanner sc = new Scanner(System.in);
        User user = new User();
        //user.setUserName(sc.nextLine());
        while (user.getUserName() == null) {
            user.setUserName(sc.nextLine());
        }
        System.out.println("\n\n----- * * * -----" +
                        "\n\nПиши вопрос в окошке этом," +
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
        System.out.println("\n\n------ * * * ------" +
                "\n\nНу что ж, " + user.getUserName() + " пора нам прощаться." +
                "\n\nНа вопросы дал ответы.\nЧто-то - будет, что-то - нет..");
        System.out.println("\n\nСкажи \"Спасибо!\" на прощанье" +
                           "\nИ будет тёплым расставанье..\n\n");
        while (true) {
        if (sc.nextLine().equals(exit)) {
            System.out.println("Всегда рад! До встречи!");
            System.exit(0);
            }
        }
    }
}