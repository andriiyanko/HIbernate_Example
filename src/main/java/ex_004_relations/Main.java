package ex_004_relations;


import ex_004_relations.entity.Author;
import ex_004_relations.entity.Book;

import java.util.List;

public class Main {


    public static void main(String[] args) {

       Author author = new AuthorHelper().getAuthorById(1);

       List<Book> authorBooks = author.getBooks();

       for (Book book : authorBooks) {
           System.out.println(book.getName() + " " + book.getAuthor().getName()
                   + " " + book.getAuthor().getLastName());
       }

    }

}
