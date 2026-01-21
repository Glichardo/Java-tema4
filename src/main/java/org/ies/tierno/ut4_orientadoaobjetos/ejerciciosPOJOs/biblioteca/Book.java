package org.ies.tierno.ut4_orientadoaobjetos.ejerciciosPOJOs.biblioteca;

public class Book {
    private long isbn;
    private String title;
    private int year;
    private Author[] author;

    public Book(long isbn, String title, int year, Author[] author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }
}
