package ma.ensa.TraitementBatchDP.config;

import ma.ensa.TraitementBatchDP.beans.dto.TransactionDTO;
import ma.ensa.TraitementBatchDP.beans.model.Transaction;
import ma.ensa.TraitementBatchDP.mapper.modelMapper;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

public class TransactionProcessus implements ItemProcessor<TransactionDTO,Transaction> {

    @Autowired
    modelMapper mapper;
    @Override
    public Transaction process(TransactionDTO item) throws Exception {
        return mapper.getTransactionFromTransactionDTO(item);
    }
}
