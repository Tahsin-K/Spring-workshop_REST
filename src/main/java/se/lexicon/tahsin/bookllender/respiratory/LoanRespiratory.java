package se.lexicon.tahsin.bookllender.respiratory;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Loan extends CrudRepository {

    Optional<Loan> findByLoanTakenUserId (Integer userId);

}
