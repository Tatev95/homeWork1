package homework;

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        System.out.println("Contructoring Box");
//        width = 10;
//        height = 10;
//        depth = 10;
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }

}

