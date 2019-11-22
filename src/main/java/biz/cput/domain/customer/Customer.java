package biz.cput.domain.customer;

public class Customer {

    private String id;
    private String address;
    private String phone;
    private String email;
   
    private Customer() {}

    public Customer(Builder builder) {
        this.id = builder.id;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder {
        public String email;
        public String phone;
        private String id;
        private String address;
       
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        

        public Builder copy(Customer customer) {

            this.id = customer.id;
            this.address = customer.address;
            this.phone = customer.phone;
            this.email = customer.email;
          
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}