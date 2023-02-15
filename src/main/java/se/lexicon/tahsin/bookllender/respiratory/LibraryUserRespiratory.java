package se.lexicon.tahsin.bookllender.respiratory;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LibraryUser extends CrudRepository {

   Optional<LibraryUser> findByEmail(String email);
}
