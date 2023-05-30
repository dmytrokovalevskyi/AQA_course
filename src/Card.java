public class Card {
    private int id;
    private String number;
    private String expireDate;
    private int cvv;
    private CardTypeEnum cardType;
    protected static int idCounter = 1;

    //constructor
    public Card(String number, String expireDate, int cvv, CardTypeEnum cardType) {
        switch (cardType) {
            case VISA -> this.cardType = cardType;
            case MASTERCARD -> this.cardType = cardType;
        }
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.id = idCounter;
        idCounter += 1;
    }

    //getters and setters

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public CardTypeEnum getCardType() {
        return cardType;
    }

    public void setCardType(CardTypeEnum cardType) {
        this.cardType = cardType;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", cvv=" + cvv +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
