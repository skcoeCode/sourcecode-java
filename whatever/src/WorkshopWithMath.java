
public class WorkshopWithMath {

    public static void main(String[] args) {
        Point3D endPoint = new Point3D(2, 1, 3);
        Point3D startPoint = new Point3D(0, 0, 6);
        double distance = Space3D.calDistance(startPoint, endPoint);
        System.out.println(distance);
    }

}
