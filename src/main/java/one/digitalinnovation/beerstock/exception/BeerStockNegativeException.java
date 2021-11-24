package one.digitalinnovation.beerstock.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockNegativeException extends Exception{

    public BeerStockNegativeException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed is lower than the quantity on stock %s", id, quantityToDecrement));
    }
}
