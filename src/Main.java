public class Main {
    public static void main(String[] args) {
        // Création de la l'objet queen
        Reine queen = new Reine();
        queen.position = new Position(4, 4);

        // Test d'un déplacement
        Position test = new Position(6, 6);

        if (queen.isValidMove(test)) {
            System.out.println("Yes, I can move there.");
        } else {
            System.out.println("Nope, can't do!");
        }
    }
}
