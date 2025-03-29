import java.util.*;
class Multiply {
    public static void main(String args[]) {
        int arr[] = {1, 2, 1, 1, 1, 1, 0, 1, 3, 5, 4, -1, 5, 6, 2, 2, 2};
        int target = 5;

        // Initialize a map to store the product of elements and their indices
        Map<Integer, Integer> productMap = new HashMap<>();
        productMap.put(1, -1);  // Handle the case where product is equal to the target at the very beginning

        int product = 1;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                // Reset product and map if a zero is encountered
                product = 1;
                productMap.clear();
                productMap.put(1, i); // Start a new subarray after zero
                continue;
            }

            product *= arr[i]; // Update the cumulative product
            
            // If the product divided by target is already present in the map,
            // it means we have found a subarray with a product equal to the target
            if (product % target == 0 && productMap.containsKey(product / target)) {
                maxLength = Math.max(maxLength, i - productMap.get(product / target)); // Update max length
            }
            
            // If the product is not already in the map, add it along with the current index
            if (!productMap.containsKey(product)) {
                productMap.put(product, i);
            }
        }

        // Output the result
        System.out.println("Maximum length of subarray with product equal to target is: " + maxLength);
    }
}
