package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();


        zofka.penUp();
        zofka.move(335);
        zofka.turnLeft(90);
        zofka.move(400);

        nakresliSlunicko();
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(170);
        zofka.turnRight(90);

        for (int i = 0; i < 5; i++) {
            zofka.penDown();
            nakresliDomecek();
            zofka.penUp();
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnLeft(90);
        }
        zofka.turnRight(180);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(250);
        zofka.turnRight(90);
        nakresliDomecek();
        zofka.turnLeft(90);
        zofka.move(650);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnRight(90);
        nakresliPrasatko();
        zofka.move(650);
        zofka.turnRight(90);
        zofka.move(150);
        nakresliDomecek();
        zofka.turnRight(30);
        zofka.move(630);
        zofka.turnLeft(30);
        nakresliT();
        zofka.move(mezeraMeziPismeny);
        nakresliE();
        zofka.move(mezeraMeziPismeny);
        nakresliR();
        zofka.move(mezeraMeziPismeny);
        nakresliE();
        zofka.move(mezeraMeziPismeny);
        nakresliZ();
        zofka.move(mezeraMeziPismeny);
        nakresliA();
        zofka.move(mezeraMeziPismeny);

    }


    public void nakresliSlunicko() {
        double pocetPaprsku = 15;
        zofka.penDown();
        for (int i = 0; i < pocetPaprsku; i++) {
            zofka.turnRight(360 / pocetPaprsku);
            zofka.move(10);
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnRight(180);
            zofka.move(30);
            zofka.turnLeft(90);
            zofka.move(10);
        }
        zofka.penUp();
    }

    public void nakresliCtverecek(int delkaStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(delkaStrany);
        }
    }

    public void nakresliDomecek() {
        zofka.penDown();
        nakresliCtverecek(150);
        zofka.turnRight(45);
        zofka.move(106);
        zofka.turnRight(90);
        zofka.move(106);
        zofka.turnLeft(135);
        zofka.penUp();
    }

    public void nakresliLeziciDomecek() {
        nakresliCtverecek(150);
        zofka.turnRight(45);
        zofka.move(106);
        zofka.turnRight(90);
        zofka.move(106);
        zofka.turnLeft(135);
        zofka.penUp();
    }

    public void nakresliNohu() {
        zofka.turnRight(30);
        zofka.move(40);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(30);
    }

    public void nakresli2Nohy() {
        nakresliNohu();
        zofka.turnLeft(240);
        zofka.penDown();
        nakresliNohu();
        zofka.turnLeft(30);
    }

    public void nakresliPrasatko() {
        zofka.penDown();
        nakresliLeziciDomecek();
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.penDown();
        nakresli2Nohy();
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(150);
        zofka.turnRight(90);
        zofka.penDown();
        nakresli2Nohy();
    }

    int mezeraMeziPismeny = 30;
    double vyskaPismena = 90;
    double sirkaPismena = 70;

    public void nakresliT() {
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(sirkaPismena / 2);
        zofka.turnRight(90);
        zofka.move(vyskaPismena);
        zofka.turnRight(180);
        zofka.move(vyskaPismena);
        zofka.turnRight(90);
        zofka.move(sirkaPismena / 2);
        zofka.penUp();
    }

    public void nakresliE() {
        zofka.penDown();
        zofka.move(sirkaPismena);
        zofka.turnRight(180);
        zofka.move(sirkaPismena);
        zofka.turnLeft(90);
        zofka.move(vyskaPismena / 2);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(vyskaPismena / 2);
        zofka.turnLeft(90);
        zofka.move(sirkaPismena);
        zofka.turnLeft(180);
        zofka.move(sirkaPismena);
        zofka.turnRight(90);
        zofka.move(vyskaPismena);
        zofka.turnRight(90);
        zofka.move(sirkaPismena);
        zofka.penUp();
    }

    double otocka = 9;
    double delkaKroku = 9;

    public void nakresliR() {
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(vyskaPismena);
        zofka.turnRight(180);
        zofka.move(vyskaPismena);
        zofka.turnRight(90);
        zofka.move(delkaKroku * 3);
        for (int i = 0; i < otocka; i++) {
            zofka.move(delkaKroku);
            zofka.turnRight(180 / otocka);
        }
        zofka.move(delkaKroku * 4);
        zofka.turnRight(180);

        zofka.move(delkaKroku * 3);
        zofka.turnRight(50);
        zofka.move(delkaKroku * 6);
        zofka.turnLeft(140);
        zofka.penUp();
        zofka.move(vyskaPismena);
        zofka.turnRight(90);
    }

    public void nakresliZ() {
        zofka.penDown();
        zofka.move(sirkaPismena);
        zofka.turnRight(127);
        zofka.move(115);
        zofka.turnLeft(127);
        zofka.move(sirkaPismena);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(vyskaPismena);
        zofka.turnRight(90);
        zofka.penUp();
    }

    public void nakresliA() {
        zofka.move(sirkaPismena / 2);
        zofka.penDown();
        zofka.turnRight(112);
        zofka.move(99);
        zofka.turnRight(180);
        zofka.move(99);
        zofka.turnRight(180 - 44);
        zofka.move(99);
        zofka.turnRight(180);
        zofka.move(vyskaPismena / 2);
        zofka.turnLeft(70);
        zofka.move(36);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(vyskaPismena / 2);
        zofka.turnRight(90);
        zofka.move(sirkaPismena / 2);
    }
}

