package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void addFilm() {
        Manager film = new Manager();

        film.addFilm("Бладшот");
        film.addFilm("Вперёд");
        film.addFilm("Отель Белград");
        film.addFilm("Джентльмены");
        film.addFilm("Человек-невидимка");
        film.addFilm("Тролли. Мировой тур");
        film.addFilm("Номер один");

        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентльмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = film.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        Manager film = new Manager();

        film.addFilm("Бладшот");
        film.addFilm("Вперёд");
        film.addFilm("Отель Белград");
        film.addFilm("Джентльмены");
        film.addFilm("Человек-невидимка");
        film.addFilm("Тролли. Мировой тур");
        film.addFilm("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград" };
        String[] actual = film.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastLimit() {
        Manager film = new Manager(3);

        film.addFilm("Бладшот");
        film.addFilm("Вперёд");
        film.addFilm("Отель Белград");
        film.addFilm("Джентльмены");
        film.addFilm("Человек-невидимка");
        film.addFilm("Тролли. Мировой тур");
        film.addFilm("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка" };
        String[] actual = film.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}