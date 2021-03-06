package ma.ensa.TraitementBatchDP.mapper;

import ma.ensa.TraitementBatchDP.beans.dto.TransactionDTO;
import ma.ensa.TraitementBatchDP.beans.model.Compte;
import ma.ensa.TraitementBatchDP.beans.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class modelMapper {

    public Transaction getTransactionFromTransactionDTO(TransactionDTO transactionDTO){
        Transaction transaction=new Transaction();
        transaction.setIdTransaction(transactionDTO.getIdTransaction());
        transaction.setDateTransaction(transactionDTO.getDateTransaction());
        transaction.setMontant(transactionDTO.getMontant());
        Compte compte=new Compte();
        compte.setIdCompte(transactionDTO.getIdCompte());
        compte.setMontant(compte.getMontant()-transactionDTO.getMontant());
        transaction.setCompte(compte);
        return  transaction;
    }}
