package ma.ensa.TraitementBatchDP.beans.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TransactionDTO {
    private Long idTransaction;
    private Date dateTransaction;
    private Long idCompte;
    private Float montant;


}
