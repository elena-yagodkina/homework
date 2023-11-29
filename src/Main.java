import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var totalWeight = boxerOne + boxerTwo;
        var differenceWeight = boxerTwo - boxerOne;
        System.out.println(totalWeight);
        System.out.println(differenceWeight);

        var differenceWeight2 = boxerTwo % boxerOne;
        System.out.println(differenceWeight2);

        var totalTime = 640;
        var timeEmployee = 8;
        var totalEmployees = totalTime / timeEmployee;
        System.out.println("Всего работников в компании  - " + totalEmployees + " человек");

        totalEmployees = totalEmployees + 94;
        totalTime = totalEmployees * timeEmployee;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalTime + " часа работы может быть поделено между сотрудниками");

    }
}