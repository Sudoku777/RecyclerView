package agent.shop.recyclerview;

public class Contact {
    private  String name;
    private String phone;
    private int photo;

    public Contact() {
    }

    public Contact(String name, String phone, int photo) {
        this.name = name;
        this.phone = phone;
        this.photo = photo;
    }

    //Getter


    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getPhoto() {
        return photo;
    }

    //Setter


    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
