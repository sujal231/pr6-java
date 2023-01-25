import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Pr6 {

    public static ArrayList<PlayerModel> dataList = new ArrayList<>();

    public static void main(String[] args) {

        String select;

        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 = Batsman");
            System.out.println("2 = Bowler");
            System.out.print("Enter Selection = ");
            select = sc.nextLine();

            if (select.equals("1")) {
                Batsman b = new Batsman();
                b.setBatsmanData();
            } else if (select.equals("2")) {
                Bowler b1 = new Bowler();
                b1.setBowlerData();
            } else {
                System.out.println("Error");
            }

        }

        for (int i = 0; i < dataList.size(); i++) {
            System.out.println("Name = " + dataList.get(i).name);
            if (dataList.get(i).isBatsman) {
                System.out.println("Run = " + dataList.get(i).score);
                System.out.println("SR = " + dataList.get(i).skill);

            } else {
                System.out.println("Wicket = " + dataList.get(i).score);
                System.out.println("style = " + dataList.get(i).skill);

            }
        }

    }
}

class PlayerModel {

    String name, score, skill;
    boolean isBatsman;

    public PlayerModel(String name, String score, String skill, boolean isBatsman) {
        this.name = name;
        this.score = score;
        this.skill = skill;
        this.isBatsman = isBatsman;
    }

}

class Cricket {

    String name, run, sr, wicket, style;

}

class Player extends Cricket {

    void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Player Name : ");
        name = sc.nextLine();
    }

    void getName() {
        System.out.println("Name = " + name);
    }

}

class Batsman extends Player {

    void setBatsmanData() {
        setName();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Player Run : ");
        run = sc.nextLine();
        System.out.print("Enter Player SR : ");
        sr = sc.nextLine();

        PlayerModel model = new PlayerModel(name, run, sr, true);
        Pr6.dataList.add(model);
    }
}

class Bowler extends Player {
    void setBowlerData() {
        setName();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Player Wicket : ");
        wicket = sc.nextLine();
        System.out.print("Enter Player Style : ");
        style = sc.nextLine();
        PlayerModel model = new PlayerModel(name, wicket, style, false);
        Pr6.dataList.add(model);
    }
}