public class Overloading {
    public void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(10);
        Box box3 = new Box(10, 20);
        Box box4 = new Box(10, 20, 30);
    }
    class Box {
        int w;
        int h;
        int d;

        public Box() {
            this(1, 2, 3);
        }
        public Box(int w) {
            this(w, 1, 2);
        }
        public Box(int w, int h) {
            this(w, h, 3);
        }
        public Box(int w, int h, int d) {
            w = w;
            h = h;
            d = d;
        }
    }
}
