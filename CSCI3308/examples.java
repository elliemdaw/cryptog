public class examples {

    public static void simple_bar_graph(String[] names, double[] data, int num_of_elements, String title){
        System.out.println(title);
        for(int state = 0; state < num_of_elements; state++) {
            System.out.print(names[state] + "\t");
            for(double i = 0.0; i < data[state]; i+=1.0)
                System.out.print("*");
            System.out.println("");
        }
    }

    public static void main(String args[]){
        String TITLE = "Gun Death Rate";
        String[] names = {"California", "Connecticut", "New Jersey", "Maryland", "New York", "Massachusetts", "Hawaii   ", "Illinois",
                            "Rhode Island", "Delaware", "Pennsylvania", "Minnesota", "Washington", "Michigan", "Colorado", "Iowa     ",
                            "Wisconsin", "Oregon  ", "Ohio     ", "Virginia", "Nebraska", "New Hampshire", "Indiana  ",
                            "Alabama  ", "Florida  ", "Maine   ", "West Virginia", "Georgia  ", "North Dakota", "Tennessee",
                            "North Carolina", "Nevada  ", "Texas    ", "Arkansas", "Oklahoma", "South Carlina", "Idaho   ",
                            "New Mexico", "Missouri", "Louisiana", "Utah     ", "Montana ", "Kentucky", "Kansas  ", "Mississippi",
                            "Vermont  ", "South Dakota", "Wyoming ", "Alaska  ", "Arizona "};
        double[] data = {7.7, 5.8, 5.2, 9.3, 5.1, 4.0, 3.2, 8.2, 4.6, 9.9, 10.1, 6.7, 8.9, 11.0, 10.7, 6.8, 8.5, 11.3, 9.9, 10.7,
                            8.2, 8.2, 10.8, 16.2, 11.4, 7.9, 14.2, 12.6, 9.6, 14.4, 11.6, 14.5, 10.9, 14.4, 14.3, 13.9, 12.7,
                            14.8, 13.9, 19.1, 12.2, 15.6, 12.5, 10.4, 16.1, 12.2, 10.2, 9.2, 15.5, 20.5, 14.5};
        int num_of_elements = 50;
        simple_bar_graph(names, data, num_of_elements, TITLE);
    }
}