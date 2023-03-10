public class Person {
        private  String name;
        private String surname;
        private int quantityTickets;

        public Person(String name, String surname, int quantityTickets) {
            this.name = name;
            this.surname = surname;
            this.quantityTickets = quantityTickets;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getSurname() {
            return surname;
        }
        public void setSurname(String surname) {
            this.surname = surname;
        }
        public int getQuantityTickets() {
            return quantityTickets;
        }
        public void setQuantityTickets(int quantityTickets) {
            this.quantityTickets = quantityTickets;
        }
}
