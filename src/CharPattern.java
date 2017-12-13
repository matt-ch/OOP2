public class CharPattern {
    public int charSize;

    public CharPattern(int size) {
        charSize = size;
    }

    public void setSize(int size) {
        charSize = size;
    }
    public int getSize() {
        return charSize;
    }

    //method
    public String printPattern(int charSize) {
        int size = this.charSize;
        String output = "";
        String a = "A";
        for (int i = size; i > 0; i--) {
            output = output + a;

            for (int j = i; j <= size; j++) {
                System.out.println(output);
            }
        }
        return output;
    }
}