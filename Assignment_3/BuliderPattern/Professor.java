public class Professor {
    //required parameters
    private String firstName;
    private String lastName;
    private int id;


    public static class Builder {
        //required parameters
        private String firstName;
        private String lastName;
        private int id;

        public Builder(String firstName, String lastName,int id) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id=id;
        }


        public Professor build() {
            // call the private constructor in the outer class
            return new Professor(firstName, lastName, id);
        }
    }

    public Professor(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id=id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getId() {
        return id;
    }

}


