package ma.ensa.TraitementBatchDP.repositories;

import ma.ensa.TraitementBatchDP.beans.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo extends JpaRepository<Transaction,Long> {
}
