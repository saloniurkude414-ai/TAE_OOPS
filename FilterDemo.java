interface Filterable {

    void apply_filter(String filter_type);

    void reset_filter();
}

class ImageProcessor implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying image filter: " + filter_type);
    }

    public void reset_filter() {
        System.out.println("Image filters reset.");
    }
}

class DataAnalyzer implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying data filter: " + filter_type);
    }

    public void reset_filter() {
        System.out.println("Data filters reset.");
    }
}

public class FilterDemo {

    public static void main(String[] args) {

        ImageProcessor img = new ImageProcessor();
        DataAnalyzer data = new DataAnalyzer();

        img.apply_filter("Blur");
        img.reset_filter();

        data.apply_filter("Remove Outliers");
        data.reset_filter();
    }
}