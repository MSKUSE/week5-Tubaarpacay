public class Main {
    public static void main(String[] args) {

        Point p1=new Point();
        String s1= new String("ali");
        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);
        Point p2=new Point(3,4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);
        Point p3=new Point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);

        Point tleft=new Point(3,4);
        Rectangle r1=new Rectangle(
                3,
                4
       );
        Circle c1=new Circle(
                new Point(3,4),
                5
        );
        System.out.println(c1.getRadius());
        c1.setRadius(-21);
        System.out.println(c1.getRadius());

        System.out.println(r1.getSideB());
        System.out.println(r1.getTopLeft());
        System.out.println(r1.getSideA());

    }


}