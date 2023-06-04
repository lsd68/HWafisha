import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class posterManagerTest {
    @Test
    public void AllFilm() {
        posterManager post = new posterManager();
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
        posterManager post = new posterManager();
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
        posterManager post = new posterManager(5);
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
        posterManager post = new posterManager(5);

        post.addNewPoster("Человек-невидимка");
        post.addNewPoster("Тролли.Мировой тур");
        post.addNewPoster("Номер один");
        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка"};
        String[] actual = post.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
