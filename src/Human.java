class Human {
    private String name;
    private double height;
    public static double aveHeight;


    public Human(String name, double height) {
        this.name = name;
        this.height = height;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static double getAveHeight() {
        return aveHeight;
    }

    public static void setAveHeight(double aveHeight) {
        Human.aveHeight = aveHeight;
    }


}
