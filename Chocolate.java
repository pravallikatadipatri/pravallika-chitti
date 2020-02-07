import java.util.ArrayList;
import java.util.List;

public class Chocolate {

    private String type;
    private float Weight;
    private float sugarContent;
    private float calories;

    public Chocolate() {

    }



    public static void printInvoiceHeader() {
        System.out.println(String.format("%15s  %15s  %15s  %15s", "type",
                "Weight", "SugarContent", "Calories"));
        System.out.println(String.format("%s", "---------------------------------------------------------" +
                "-------------------------------------------------------------"));
    }

    public static List<Chocolate> buildInvoice(List<Chocolate> e) {
        List<Chocolate> itemList = new ArrayList<>(e);
        return itemList;
    }

    public void printInvoice() {
        System.out.println(String.format("%10s  %10s  %10s  %10s", this.getType(),
                this.getCalories(), this.getSugarContent(), this.getWeight()));
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public float getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(float sugarContent) {
        this.sugarContent = sugarContent;
    }

    public float getWeight() {
        return Weight;
    }

    public void setWeight(float weight) {
        Weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
