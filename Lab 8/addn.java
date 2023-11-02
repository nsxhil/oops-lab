interface Sports {
    int getNumberOfGoals();
    void dispTeam();
}

class Hockey implements Sports {
    @Override
    public int getNumberOfGoals() {
        int goalno = 5 ;
        return goalno;
    }

    @Override
    public void dispTeam() {
        System.out.println("Hockey: Team consists of six players on the ice.");
    }
}

class Football implements Sports {
    @Override
    public int getNumberOfGoals() {
        System.out.println("Football: Usually, one or two goals are scored in a match.");
        return 5;
    }

    @Override
    public void dispTeam() {
        System.out.println("Football: Team consists of eleven players on the field.");
    }
}

public class addn {
    public static void main(String[] args) {
        Sports hockey = new Hockey();
        Sports football = new Football();

        hockey.getNumberOfGoals();
        hockey.dispTeam();

        football.getNumberOfGoals();
        football.dispTeam();
    }
}
