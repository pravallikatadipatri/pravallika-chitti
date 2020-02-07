
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class NewYearGift {

    private static Chocolate getChocolateGiftDetailsASInput(String chocolateNumber) {
        Chocolate baseChocolateObject = new Chocolate();
        Scanner chocolateType = new Scanner(System.in);
        System.out.print("Enter the name of chocolate " + chocolateNumber + ":");
        baseChocolateObject.setType(chocolateType.next());
        Scanner calories = new Scanner(System.in);
        System.out.print("Enter " + baseChocolateObject.getType() + "\'s current calories content:");
        baseChocolateObject.setCalories(calories.nextFloat());
        Scanner sugarContent = new Scanner(System.in);
        System.out.print("Enter the sugarcontent of " + baseChocolateObject.getType());
        baseChocolateObject.setSugarContent(sugarContent.nextFloat());
        Scanner weight = new Scanner(System.in);
        System.out.print("Enter the weight in grams for " + baseChocolateObject.getType());
        baseChocolateObject.setWeight(weight.nextFloat());
        return baseChocolateObject;
    }

    public static void main(String args[]) 
{
        Scanner numberOfChocolates = new Scanner(System.in);
        System.out.print("Enter the total number of gifts: ");
        int chocolateNumber = numberOfChocolates.nextInt();
        List<Chocolate> chocolateDetails = new ArrayList<>();
        for (int i = 1; i <= chocolateNumber; i++) {
            chocolateDetails.add(getChocolateGiftDetailsASInput(Integer.toString(i)));
        }
        List<Chocolate> sortedChocolateList = chocolateDetails.stream()
                .sorted(Comparator.comparing(Chocolate::getWeight).reversed())
                .collect(Collectors.toList());
        Chocolate.printInvoiceHeader();
        Chocolate.buildInvoice(sortedChocolateList).forEach(Chocolate::printInvoice);
    }


}