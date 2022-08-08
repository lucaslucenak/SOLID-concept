package wrong.lsp;

public class LspApplication {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 15.0);
        System.out.println(rectangle.getArea());

        // That should not be possible, because the rectangle and the square can't replace each other
        Square square = new Square(10.0, 15.0);
        System.out.println(square.getArea());
    }
}
