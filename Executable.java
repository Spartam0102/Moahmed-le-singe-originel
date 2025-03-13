public class Executable {
    public static void main(String[] args) {
        Personne Davy = new Personne("Davy",37);
        Personne Gaby = new Personne("Gaby",24);
        Personne Elie = new Personne("Elie",27);
        Personne Anna = new Personne("Anna",31);

        Personne Billy = new Personne("Billy",16);
        Personne Sasha = new Personne("Sasha",21);
        Personne Béatrice = new Personne("Béatrice",67);

        WeekEnd mai = new WeekEnd("mai");
        WeekEnd juin = new WeekEnd("juin");

        mai.ajouteParticipant("Davy",37);
        mai.ajouteParticipant("Gaby",24);
        mai.ajouteParticipant("Elie",27);
        mai.ajouteParticipant("Anna",31);

        juin.ajouteParticipant("Billy",16);
        juin.ajouteParticipant("Sasha",21);
        juin.ajouteParticipant("Béatrice",67);
        juin.ajouteParticipant("Davy",37);
        juin.ajouteParticipant("Gaby",24);
        juin.ajouteParticipant("Anna",31);

        mai.ajouteDepense(12,"Pain","Davy");
        mai.ajouteDepense(100,"Pizza","Elie");
        mai.ajouteDepense(70,"Essence","Davy");
        mai.ajouteDepense(15,"Vin","Gaby");
        mai.ajouteDepense(10,"Vin","Elie");

        juin.ajouteDepense(15,"Fromage","Davy");
        juin.ajouteDepense(12,"Pain","Davy");
        juin.ajouteDepense(20,"Vin","Gaby");
        juin.ajouteDepense(34,"Glaces","Gaby");
        juin.ajouteDepense(52,"Pizza","Anna");
        juin.ajouteDepense(8,"Pistache","Béatrice");
        juin.ajouteDepense(8,"Film","Davy");
        juin.ajouteDepense(3,"Popcorn","Davy");
        
    }
}
