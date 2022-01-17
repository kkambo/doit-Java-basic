package ch07;

import ch07.Domain.Book;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤르만 헤세"));
        library.add(new Book("어떻게 살 것인가", "유시민"));
        library.add(new Book("토지", "박경리"));
        library.add(new Book("어린왕자", "생택쥐페리"));

        for(int i = 0 ; i < library.size() ; i++){
            Book book = library.get(i);
            System.out.println(book.toString());
        }

        System.out.println();

        System.out.println("=== 항상된 for 문 사용 ===");
        for(Book book : library){
            System.out.println(book.toString());
        }
    }
}
