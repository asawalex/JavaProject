package com.semicolon.africa.services;

import com.semicolon.africa.data.repositories.BookRepository;
import com.semicolon.africa.dtos.requests.*;
import com.semicolon.africa.dtos.responses.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.semicolon.africa.data.models.BookCategory.JAVA_TEXT_BOOK;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class BookServiceImplTest {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookService bookService;


    @BeforeEach
    void setUp() {
        bookRepository.deleteAll();
    }

    @Test
    public void testThatAddBookIsNotNull() {
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setAuthor("John Doe");
        addBookRequest.setTitle("The Lord of the Rings");
        addBookRequest.setIsbn("978-3-16-148410-0");
        addBookRequest.setCategory(JAVA_TEXT_BOOK);
        AddBookResponse addBookResponse = bookService.addBook(addBookRequest);
        assertThat(addBookResponse.getMessage()).contains("Book added successfully");

    }

    @Test
    public void testThatBookHasBeenDeleted() {
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setAuthor("John Doe");
        addBookRequest.setTitle("The Lord of the Rings");
        addBookRequest.setIsbn("978-3-16-148410-0");
        addBookRequest.setCategory(JAVA_TEXT_BOOK);
        AddBookResponse response = bookService.addBook(addBookRequest);

        DeleteBookRequest deleteBookRequest = new DeleteBookRequest();
        deleteBookRequest.setIsbn("978-3-16-148410-0");

        DeleteBookResponse deleteBookResponse = bookService.deleteBook(deleteBookRequest);
        assertThat(deleteBookResponse.getMessage()).contains("Book deleted successfully");
    }
}
//   //    @Test
//    public void testThatMemberExist(){
//        RegisterRequest registerRequest = new RegisterRequest();
//        registerRequest.setFirstName("wale");
//        registerRequest.setLastName("Doe");
//        registerRequest.setUsername("walet");
//        registerRequest.setEmail("john.doe@gmail.com");
//        registerRequest.setPassword("1234");
//        RegisterResponse response = libraryService.register(registerRequest);
//        assertThat(response.getMessage()).contains("Welcome Asade Digital Library");
//
//    }
//    @Test
//    public void testThatMemberLogIn(){
//        LogInRequest logInRequest = new LogInRequest();
//        logInRequest.setUsername("walet");
//        logInRequest.setPassword("1234");
//        LogInResponse response = libraryService.logIn(logInRequest);
//        assertThat(response.getMessage()).contains("Welcome Asade Digital Library");
//    }
//    @Test
//    public void testThatHasBeenBorrowed(){
//        BorrowBookRequest borrowBookRequest = new BorrowBookRequest();
//        borrowBookRequest.setIsbn("978-3-16-148410-0");
//        borrowBookRequest.setTitle("The Lord of the Rings");
//        BorrowBookResponse response = libraryService.borrowBook(borrowBookRequest);
//        assertThat(response.getMessage()).contains("Book successfully borrowed");
//    }
//    @Test
//    public void testThatHasBeenReturned(){
//        BorrowBookRequest borrowBookRequest = new BorrowBookRequest();
//        borrowBookRequest.setIsbn("978-3-16-148410-0");
//        borrowBookRequest.setTitle("The Lord of the Rings");
//        BorrowBookResponse response = libraryService.borrowBook(borrowBookRequest);
//        ReturnBookRequest returnBookRequest = new ReturnBookRequest();
//        returnBookRequest.setIsbn("978-3-16-148410-0");
//        ReturnBookResponse responses = libraryService.returnBook(returnBookRequest);
//        assertThat(responses.getMessage()).contains("Book successfully returned");
//    }
//    @Test
//    public void testThatBookFound(){
//
//    }
//    @Test
//    public void testToFindBook() {
//        AddBookRequest addBookRequest = new AddBookRequest();
//        addBookRequest.setAuthor("John Doe");
//        addBookRequest.setTitle("The Lord of the Rings");
//        addBookRequest.setIsbn("978-3-16-148410-0");
//        addBookRequest.setCategory(JAVA_TEXT_BOOK);
//        AddBookResponse response = bookService.addBook(addBookRequest);
//
//        FindBookRequest findBookRequest = new FindBookRequest();
//        findBookRequest.setId(response.getIsbn());
//        FindBookResponse findBookResponse = bookService.findBookByIsbn(findBookRequest);
//        assertThat(findBookResponse.getMessage()).contains("Book found");
