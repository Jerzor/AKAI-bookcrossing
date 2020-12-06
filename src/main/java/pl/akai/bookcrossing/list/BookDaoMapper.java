package pl.akai.bookcrossing.list;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import pl.akai.bookcrossing.model.Book;
import pl.akai.bookcrossing.model.BookRentRequest;
import pl.akai.bookcrossing.model.Tag;

import java.util.List;


@Mapper
public interface BookDaoMapper {

    List<Book> getAllBooks();

    Book getBookById(@Param("id") int id);

    int getInsertedBookIdByUserId(@Param("user_id") int id);

    void insertBook(@Param("book") Book book);

    void insertTag(@Param("tag") Tag tag);

    List<Book> getBooksByOwnerId(@Param("user_id") int id);

    List<Book> getBooksByReaderId(@Param("user_id") int id);

    List<Tag> getTagsByBookId(@Param("id") int id);

    List<Book> getBooksByTagId(@Param("id") int id);

    List<Tag> getAllTags();

    Tag getTagByName(@Param("name") String tagName);

    void insertBookTag(@Param("bookId") int bookId, @Param("tagId") int tagId);

    void updateReader(@Param("bookId") int bookId, @Param("readerId") int readerId);

    void insertBookUserRequest(@Param("bookRentRequest") BookRentRequest bookRentRequest);

    List<BookRentRequest> getBookRentRequestsByOwnerId(@Param("ownerId") int ownerId);

    BookRentRequest getBookRentRequestsById(@Param("id") int id);

    void deleteBookRentRequestsById(@Param("id") int id);

    Integer getBookRentRequestByOwnerAndBookIds(@Param("requesterId") int requesterId, @Param("bookId") int bookId);

    void updateAvailable(@Param("bookId") int bookId, @Param("available") boolean available);

    List<Book> filterBooksByKeyword(@Param("keyword") String keyword);
}
