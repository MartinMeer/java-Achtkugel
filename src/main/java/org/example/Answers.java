package org.example;

public class Answers {
    private String[] answerEn = {"It is certain.", "It is decidedly so.", "Without a doubt.", "Yes definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes", "Signs point to yes.", "It is certain.", "It is decidedly so.", "Without a doubt.", "Yes definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes", "Signs point to yes.", "Don't count on it.", "My reply is no", "My sources say no.", "Outlook not so good", "Very doubtful."};
    private String[] answerRu = {"Бесспорно.", "Решительно так.", "Никаких сомнений.", "Определённо да.", "Можешь быть уверен в этом.", "По всей видимости - да.", "Вероятнее всего", "Перспективы хорошие.", "Есть верные признаки, что так и есть.", "Да.", "Пока неясно, но есть надежда.", "Об этом спроси позже.", "Будет лучше, если я не отвечу.", "Сейчас об этом рано говорить.", "Подумай еще раз, нужен ли тебе ответ, и попробуй спросить снова.", "Даже не думай об этом.", "Мой ответ - нет.", "Есть верные признаки, что нет.", "Без перспектив.", "Увы, весьма сомнительно"};
    private String[] affirmative = {"It is certain.", "It is decidedly so.", "Without a doubt.", "Yes definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes", "Signs point to yes."};
    private String[] noncommittal = {"Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again."};
    private String[] negative = {"Don't count on it.", "My reply is no", "My sources say no.", "Outlook not so good", "Very doubtful."};


    public String getAnswerEn(int index) {
        return answerEn[index];
    }

    public String getAnswerRu(int index) {
        return answerRu[index];
    }
}