package correct.lsp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle {
    private Double side;
    private Double breadth;

    public Rectangle(Double side, Double breadth) {
        this.side = side;
        this.breadth = breadth;
    }

    public Rectangle() {
    }

    public Double getArea() {
        return side * breadth;
    }
}
