package ma.ensa.TraitementBatchDP.config;

import ma.ensa.TraitementBatchDP.beans.model.Transaction;
import ma.ensa.TraitementBatchDP.repositories.TransactionRepo;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TransactionWriter implements ItemWriter<Transaction> {
    @Autowired
    private TransactionRepo transactionRepository;
    @Override
    public void write(List<? extends Transaction> items) throws Exception {
        System.out.println("Saving Transactions");
        transactionRepository.saveAll(items);

    }
}
