package builder;

public class Card {
    private int cvv;
    private int number;
    private String nameCardHolder;

    public int getCvv() {
        return cvv;
    }

    public int getNumber() {
        return number;
    }

    public String getNameCardHolder() {
        return nameCardHolder;
    }

    private Card() {
    }
    public static Builder getBuilder(){
        return new Card().new Builder();
    }

    public class Builder {
        private Builder (){}
        public Builder setCvv(int cvv){
            Card.this.cvv=cvv;
            return this;
        }
        public Builder setNumber(int number){
            Card.this.number=number;
            return this;
        }
        public Builder setCardholder(String name){
            Card.this.nameCardHolder=nameCardHolder;
            return this;
        }
        public Card build(){
            return Card.this;
        }
    }
}
