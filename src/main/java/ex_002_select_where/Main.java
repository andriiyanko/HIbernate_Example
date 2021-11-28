package ex_002_select_where;

import ex_002_select_where.entity.Author;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();

        List<Author> authorList = ah.getAuthorList();

        for (Author author : authorList) {
            System.out.println(author.getId() + " " + author.getName() + " " + author.getLastName());
        }


    }

}
