import org.launchcode.questions.*;

public class SurveyRunner {

    private static final Survey survey = new Survey();

    public static void main(String[] args){

        //Create questions
Choice[] trueAndFalse = {
        new Choice("True"),
        new Choice("False")
};

        TrueOrFalse lactoseIntolerant = new TrueOrFalse("I am lactose-intolerant and need a non-dairy alternative.", trueAndFalse);
        TrueOrFalse diabetic = new TrueOrFalse("I am diabetic and need a no-sugar-added alternative.", trueAndFalse);

        Choice[] flavorChoices = {
                new Choice("Vanilla"),
                new Choice("Chocolate"),
                new Choice("Strawberry")
        };

        MultipleChoice flavor = new MultipleChoice("what flavor of ice cream would you like?", flavorChoices);

        LinearScale numScopes = new LinearScale("How many scoopes of ice cream would you like?", 3);

        Choice[] toppingChoices = {
new Choice("Oreo crumbles"),
        new Choice("Fresh strawberry slices"),
        new Choice("M&Ms"),
        new Choice("Hot caramel syrup"),
        new Choice("Pecans")
        };

        Checkbox toppings = new Checkbox("Select some toppings:", toppingChoices);

        ShortAnswer flavorSuggestion = new ShortAnswer("What flavor of ice cream would you like to see aded to our model?");

        Paragraph comments = new Paragraph("Any other questions or comments?");
        // Add questions to survey
survey.addQuestions(new Question[]{lactoseIntolerant, diabetic, flavor, numScopes, toppings, flavorSuggestion,comments});
        // Interact with user (intro, run survey outro)

String newLine = System.lineSeparator();
System.out.println("Thank you for registering for our meetup! We will be serving dessert and would like tto know your preferences ahead of time." + newLine);
survey.run();
        System.out.println(newLine + "Thank you! Your preferences have been noted for the upcoming event." +
                newLine+ "\t" + String.join(newLine + "\t", survey.getAllResponses()) + newLine);


    }
}

