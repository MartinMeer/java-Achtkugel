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
        //switch ()
        //String checkCase = userName.substring(0,1);

        if (userName.length() == 1) {
            System.out.println("В тайне имя сохранил -\nНо ответ не получил\n");
        }
        if (userName.substring(0,1).toLowerCase().equals(userName.substring(0,1))) {
            System.out.println("Уважай свое имя, потрудись написать его с большой буквы.");
        }else this.userName = userName;
    }
}
