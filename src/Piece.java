//creation la de la classe Piece
public class Piece {
    Position position;

    public boolean isValidMove(Position newPosition) {
        if (newPosition.ligne > 0 && newPosition.ligne <= 8 &&
                newPosition.colone > 0 && newPosition.colone <= 8) {
            return true;
        } else {
            return false;
        }
    }
}
