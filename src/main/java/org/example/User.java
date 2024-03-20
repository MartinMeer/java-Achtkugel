package org.example;

public class User {
    private int id;
    private String userName;

    public User() {

    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        //String checkCase = userName.substring(0,1);
        if (userName.isBlank()) {
            System.out.println("В тайне имя сохранил -\nНо ответ не получил.\n");
        } else if (userName.length() == 1) {
            System.out.println("В тайне имя сохранил -\nНо ответ не получил.\n");
        } else if (userName.substring(0,1).toLowerCase().equals(userName.substring(0,1))) {
            System.out.println("Уважай свое имя, потрудись написать его с большой буквы!");
        } else this.userName = userName;
    }
}
