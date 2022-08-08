package correct.lsp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square {
    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    public Square() {
    }

    public Double getArea() {
        return Math.pow(side, 2);
    }
}
