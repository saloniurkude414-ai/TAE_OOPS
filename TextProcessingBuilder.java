class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hi");

        sb.append(" Java");
        System.out.println(sb);

        // StringBuilder is faster (not synchronized)
        // StringBuffer is slower (synchronized)
    }
}