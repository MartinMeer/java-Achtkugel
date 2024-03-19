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
        String checkCase = userName.substring(0,1);
        if (checkCase.toUpperCase().equals(checkCase)) {
            this.userName = userName;
        } else System.out.println("Уважай свое имя, потрудись написать его с большой буквы.\n");
    }
}
