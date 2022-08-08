package correct.lsp;

public class LspApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        System.out.println(rectangle.getArea());
        Square square = new Square(10.0);
        System.out.println(square.getArea());
    }
}
