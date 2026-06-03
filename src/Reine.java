//creation la de la classe Reine
public class Reine extends Piece {

    @Override
    public boolean isValidMove(Position newPosition) {
        // Vérification de la case est dans l'échiquier
        if (!super.isValidMove(newPosition)) {
            return false;
        }

        // Vérifier qu'on ne reste pas sur place
        if (newPosition.ligne == this.position.ligne &&
                newPosition.colone == this.position.colone) {
            return false;
        }

        // 3. Calculer les différences
        int deltaRow = Math.abs(newPosition.ligne - this.position.ligne);
        int deltaCol = Math.abs(newPosition.colone - this.position.colone);

        // 4. Mouvement de la reine
        boolean horizontal = (deltaRow == 0 && deltaCol > 0);
        boolean vertical = (deltaCol == 0 && deltaRow > 0);
        boolean diagonal = (deltaRow == deltaCol && deltaRow > 0);

        return horizontal || vertical || diagonal;
    }
}
