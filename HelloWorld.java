public class HelloWorld {
    public static void main(String[] args) {
        
        // int[][] myIntArray = {{5, 10}, {15, 20, 25}};

        // for (int i=0; i < myIntArray.length; i++) {
        //     for (int j = 0; j < myIntArray[i].length; j++) {
        //         System.out.println(myIntArray[i][j]);
        //     }
        // }

        String catName = "Shane";
        String catName2 = "Shane";
        String catName3 = new String("Shane");
        int shaneAge = 27;

        System.out.println(catName + " is " + shaneAge + " years old.");

        if (catName == "Shane") {
            System.out.println("catName is equal to \"Shane\"");
        } else {
            System.out.println("catName is not equal to \"Shane\"");
        }

        if (catName == catName2) {
            System.out.println("catName is equal to catName2");
        } else {
            System.out.println("catName is not equal to catName2");
        }

        if (catName == catName3) {
            System.out.println("catName is equal to catName3");
        } else {
            System.out.println("catName is not equal to catName3");
        }

        if (catName.equals(catName3)) {
            System.out.println("catName is equal to catName3");
        } else {
            System.out.println("catName is not equal to catName3");
        }
    }
}