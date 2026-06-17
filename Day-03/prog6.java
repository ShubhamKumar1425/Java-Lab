class Area {
    public double calculate(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculate(double base, double height) {
        return 0.5 * base * height;
    }

    public double calculate(int side) {
        return side * side;
    }
}

class prog6 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Area area = new Area();

        System.out.println("Enter radius of the circle:");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + area.calculate(radius));

        System.out.println("Enter base and height of the triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of Triangle: " + area.calculate(base, height));

        System.out.println("Enter side of the square:");
        int side = sc.nextInt();
        System.out.println("Area of Square: " + area.calculate(side));
        sc.close();
    }
}
