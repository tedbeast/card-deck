import java.util.Arrays;

public class CardDeckService {

    String[] cards;
    /**
     * A constructor that allows for the instantiation of a CardDeckService with n amount of cards.
     * @param n amount of cards
     */
    public CardDeckService(int n){
        // for instance, String[] cards = new String[10] would create a sequence of 10 Strings in memory.
        // except that the variable n in this case isn't even known until the user inputs the value
        this.cards = new String[n];
    }
    /**
     * set card number n's name to name
     * @param n
     * @param name
     */
    public void setCardName(int n, String name){
        cards[n] = name;
    }
    /**
     * use a for loop to append all of the cards to a string, then return it
     * @return
     */
    public String cardDeckAsString(){
        String buildingString = "";
        // append every single card to the end of a string, iteratively
        for(int i = 0; i < cards.length; i++){
            if(cards[i] != null){
                buildingString = buildingString + cards[i]+", ";   
            }
            //
        }
        // return buildingString;
        // we could use a method provided by Java in the Arrays utility class to do the same thing
         return Arrays.toString(cards);
    }

}