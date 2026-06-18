public class LibrarySystem {

    public static void main(String[] args) {

        Searchable e =
                new EBook();

        Searchable p =
                new PhysicalBook();

        e.search("Java");
        p.search("Java");
    }
}