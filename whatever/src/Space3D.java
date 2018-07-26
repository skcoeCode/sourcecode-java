
public class Space3D {
    public static double calDistance(Point3D startPoint,Point3D endPoint) {
        double x = startPoint.getX()-endPoint.getX();
        double y = startPoint.getY()-endPoint.getY();
        double z = startPoint.getZ()-endPoint.getZ();
        double exponent = 2;
        double d1 = Math.pow(x, exponent)+Math.pow(y, exponent)+Math.pow(z, exponent);
        double d = Math.sqrt(d1);
        return d;
    }
}
