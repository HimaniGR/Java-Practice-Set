public class PhysicalBook implements Searchable {

    @Override
    public void search(String keyword) {
        System.out.println(
                "Searching Physical Book for "
                        + keyword);
    }
}