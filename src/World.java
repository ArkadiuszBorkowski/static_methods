class World {
    public static void main(String[] args) {
        Human adam = new Human("Adam", 186.5);
        Human eva = new Human("Eva", 167.5);

        double avg = (adam.getHeight() + eva.getHeight())/ 2;

        System.out.println(adam.getName() + " " + adam.getHeight() + " cm wzrostu");
        System.out.println(eva.getName() + " " + eva.getHeight() + " cm wzrostu");
    }
}
