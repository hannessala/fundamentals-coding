package author.poem;

public class Main {


    public static void main(String[] args) {

        Author author = new Author();
        author.setSurname("Mike");
        author.setNationality("Italy");

        Poem poem = new Poem();
        poem.setCreator(author);
        poem.setStropheNumbers(25);

        Author author1 = new Author();
        author1.setSurname("Panusen");
        author1.setNationality("Finland");

        Poem poem1 = new Poem();
        poem1.setCreator(author1);
        poem1.setStropheNumbers(76);

        Author author2 = new Author();
        author2.setSurname("Joosep");
        author2.setNationality("Estonia");

        Poem poem2 = new Poem();
        poem2.setCreator(author2);
        poem2.setStropheNumbers(10);

        Poem[] poems = {poem, poem1, poem2};
        Author bestAuthor = getBestAuthor(poems);
        System.out.printf("\n%s has written the longest poem", bestAuthor.getSurname());

    }

    private static Author getBestAuthor(Poem[] poems) {
        int counter = 0;

        for (int i = 1; i < poems.length; i++) {
            if (poems[counter].getStropheNumbers() < poems[i].getStropheNumbers()) {
                counter = i;
            }
        }
        return poems[counter].getCreator();


    }

}
