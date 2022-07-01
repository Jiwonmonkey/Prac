
public class Constructor {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);
        int vol = box.BoxTest();
        System.out.println(vol);
    }

    public static class Box {
        int weight;
        int height;
        int depth;
        int vol;

        public Box(int weight, int height, int depth) {
            this.weight = weight;
            this.height = height;
            this.depth = depth;
        }

        public int BoxTest() {
            this.vol = weight * height * depth;
            return this.vol;
        }
    }
}
