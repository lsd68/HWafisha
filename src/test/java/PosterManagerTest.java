import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    @Test
    public void AllFilm() {

        PosterManager post = new PosterManager();
        post.addNewPoster("Бладшот");
        post.addNewPoster("Вперёд");
        post.addNewPoster("Отель Белград");
        post.addNewPoster("Джентельмены");
        post.addNewPoster("Человек-невидимка");
        post.addNewPoster("Тролли.Мировой тур");
        post.addNewPoster("Номер один");

        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентельмены", "Человек-невидимка", "Тролли.Мировой тур", "Номер один"};
        String[] actual = post.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void LastAddFilms() {
        PosterManager post = new PosterManager();

        post.addNewPoster("Бладшот");
        post.addNewPoster("Вперёд");
        post.addNewPoster("Отель Белград");
        post.addNewPoster("Джентельмены");
        post.addNewPoster("Человек-невидимка");
        post.addNewPoster("Тролли.Мировой тур");
        post.addNewPoster("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void LimitFilm() {
        PosterManager post = new PosterManager(5);

        post.addNewPoster("Бладшот");
        post.addNewPoster("Вперёд");
        post.addNewPoster("Отель Белград");
        post.addNewPoster("Джентельмены");
        post.addNewPoster("Человек-невидимка");
        post.addNewPoster("Тролли.Мировой тур");
        post.addNewPoster("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MinLimit() {
        PosterManager post = new PosterManager(5);

        post.addNewPoster("Человек-невидимка");
        post.addNewPoster("Тролли.Мировой тур");
        post.addNewPoster("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка"};
        String[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}