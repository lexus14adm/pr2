package ru.mirea.lab4;

public class Cloth {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.XXS, 500, "green"),
                new TShirt(Size.L, 700, "total black"),
                new Pants(Size.M, 1500, "white"),
                new Pants(Size.S, 2900, "black"),
                new Tie(Size.L, 8500, "white and blue"),
                new Skirt(Size.S, 3000, "brown")
        };
        Attele attele = new Attele();
        attele.dressMen(clothes);
        System.out.println("------------------");
        attele.dressWomen(clothes);
    }
}
enum Size {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);
    int euroSize;
    String sizeName = "";

    Size(int euroSize) {
        this.euroSize = euroSize;
    }
    public String getDescription(Size size) {
        if(size == XXS) {
            sizeName = "Детский размер";
        }else {
            sizeName = "Взрослый размер";
        }
        return sizeName;
    }
}
interface MenClothing {
    void dressMen();
}

interface WomenClothing {
    void dressWomen();
}

abstract class Clothes {
    Size size;
    int sale;
    String color;
}
class TShirt extends Clothes implements MenClothing, WomenClothing {

    public TShirt(Size size, int sale, String color) {
        this.size = size;
        this.sale = sale;
        this.color = color;
    }
    public void dressMen() {
        System.out.println("Надеваем мужскую футболку размера: " + size +
                ", Цена: " + sale + ", Цвет: " + color);
    }
    public void dressWomen() {
        System.out.println("Надеваем женскую футболку размера: " + size +
                " цена: " + sale + " цвет: " + color);
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {

    public Pants(Size size, int sale, String color) {
        this.size = size;
        this.sale = sale;
        this.color = color;
    }

    public void dressMen() {
        System.out.println("Надеваем мужские штаны размера: " + size +
                ", Цена: " + sale + ", Цвет: " + color);
    }
    public void dressWomen() {
        System.out.println("Надеваем женские штаны размера: " + size +
                ", Цена: " + sale + ", Цвет: " + color);
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, int sale, String color) {
        this.size = size;
        this.sale = sale;
        this.color = color;
    }
    public void dressWomen() {
        System.out.println("Надеваем юбку размера: " + size +
                ", Цена: " + sale + ", Цвет: " + color);
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(Size size, int sale, String color) {
        this.size = size;
        this.sale = sale;
        this.color = color;
    }
    public void dressMen() {
        System.out.println("Надеваем галстук размера: " + size +
                ", Цена: " + sale + ", Цвет: " + color);
    }
}

class Attele {
    void dressMen(Clothes[] clothes) {
        for(Clothes c: clothes) {
            if (c instanceof MenClothing) {
                ((MenClothing) c).dressMen();
            }
        }
    }
    void dressWomen(Clothes[] clothes) {
        for(Clothes c: clothes) {
            if (c instanceof WomenClothing) {
                ((WomenClothing) c).dressWomen();
            }
        }
    }
}