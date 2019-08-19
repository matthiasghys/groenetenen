package be.vdab.groenetenen.forms;

import org.hibernate.validator.constraints.Range;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.NotNull;

public class VanTotPostcode {

    @NotNull
    @Range(min = 1000, max = 9999)
    private final int van;
    @NotNull
    @Range(min = 1000, max= 9999)
    private final int tot;


    public VanTotPostcode(@NotNull @Range(min = 1000, max = 9999) int van, @NotNull @Range(min = 1000, max = 9999) int tot) {
        this.van = van;
        this.tot = tot;
    }


    public int getVan() {
        return van;
    }

    public int getTot() {
        return tot;
    }
}
