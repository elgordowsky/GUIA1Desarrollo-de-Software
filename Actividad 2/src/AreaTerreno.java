public class AreaTerreno {

    public static double areaRectangulo(double lado1, double lado2) {
        double arearectangulo = lado1 * lado2;
        System.out.println("Area rectangulo "+arearectangulo);
        return arearectangulo;

    }
    public static double areaTriangulo(double alturaMayor, double alturaMenor, double base) {
        double areatriangulo = (base*(alturaMayor-alturaMenor))/2;
        System.out.println("Area triangulo "+areatriangulo);
        return areatriangulo;
    }
    public static double hipotenusaTriangulo(double alturaMayor, double alturaMenor, double base) {
        double  hipotenusaTriangulo = Math.sqrt((base*base)+Math.pow((alturaMayor-alturaMenor),2));
        System.out.println("Hipotenusa triangulo "+hipotenusaTriangulo);
        return hipotenusaTriangulo;
    }
    public static double perimetroTerreno(double a, double b, double c, double h) {
        double perimetroTerreno = a + b + c + h;
        System.out.println("Perimetro terreno"+perimetroTerreno);
        return perimetroTerreno;
    }

    public static double areaTotal(double aTriangulo, double aRectangulo) {
        System.out.println("Area recttangulo "+ aRectangulo);
        System.out.println("Area triangulo"+aTriangulo);
        System.out.println("Area total: "+(aTriangulo + aRectangulo));
        return aTriangulo + aRectangulo;
    }


}
