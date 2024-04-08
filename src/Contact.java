public class Contact {
    private String name;
    private String telephone;

    public Contact() {
        
    }
    public Contact(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void settelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ");
        sb.append(name);
        sb.append(", telefone: ");
        sb.append(telephone);
        sb.append(".");
        return sb.toString();
    }

}
