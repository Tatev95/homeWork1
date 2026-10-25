package homework;

public class Person {
    public static String nationaliy="Armenia";
    //Heapi mej chi pahvi,
    //kpahvi mMETA SPACE hishoxutyan mej, vory naxatesvac e STATICNERI HAMAR


    private String name;
    private String surName;
    private String phone;

    public Person(String name, String surName, String phone) {
        this.name = name;
        this.surName = surName;
        this.phone = phone;
    }

    public Person( ) {
    }

    public static void PrinNat(){
        System.out.println(nationaliy);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


