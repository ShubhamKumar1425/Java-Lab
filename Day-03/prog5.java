class RectangleConstructor {
    private double length, breadth;

    public RectangleConstructor() {
        this.length = 0;
        this.breadth = 0;
    }

    public RectangleConstructor(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Area: " + calculateArea());
    }
}

class prog5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter length and breadth of the rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        RectangleConstructor rect = new RectangleConstructor(length, breadth);
        rect.display();

        RectangleConstructor defaultRect = new RectangleConstructor();
        defaultRect.display();
        sc.close();
    }
}
