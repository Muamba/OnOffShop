package biz.cput.domain.admin;

import java.util.Date;

import javax.persistence.*;


@Entity
public class Account {

    @Id
    private String id;

    @Column(name = "address")
    private String address;

    @Column(name = "status")
    private boolean is_closed;

    @Column(name = "Date-Open")
    private Date open;
    
    @Column(name = "Date-Close")
    private Date closed;

    private Account() {
    }

    public Account(Builder builder) {
        this.id = builder.id;
        this.is_closed = builder.is_closed;
        this.open = builder.open;
        this.closed = builder.closed;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public boolean isIs_closed() {
        return is_closed;
    }

    public Date getOpen() {
        return open;
    }

    public Date getClosed() {
        return closed;
    }

    public static class Builder {
        private String id;
        private String address;
        private boolean is_closed;
        private Date open;
        private Date closed;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder is_closed(boolean is_closed) {
            this.is_closed = is_closed;
            return this;
        }

        public Builder open(Date open) {
            this.open = open;
            return this;
        }

        public Builder closed(Date closed) {
            this.closed = closed;
            return this;
        }

        public Builder copy(Account account) {

            this.id = account.id;
            this.address = account.address;
            this.is_closed = account.is_closed;
            this.open = account.open;
            this.closed = account.closed;
            return this;
        }

        public Account build() {
            return new Account(this);
        } 
    }

    @Override
    public String toString() {
        return "Account [id=" + id + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
}
