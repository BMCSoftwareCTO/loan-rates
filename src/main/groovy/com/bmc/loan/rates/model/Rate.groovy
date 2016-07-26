package com.bmc.loan.rates.model

import io.swagger.annotations.ApiModelProperty

import com.fasterxml.jackson.annotation.JsonProperty
class Rate {
    private String percentage
    private String term
    
    Rate(String percentage, String term) {
        this.percentage = percentage
        this.term = term
    }
 
    /**
     **/
    @ApiModelProperty(value = '')
    @JsonProperty('percentage')
    String getPercentage() {
        return percentage
    }
    void setPercentage(String percentage) {
        this.percentage = percentage
    }
    
    /**
     **/
    @ApiModelProperty(value = '')
    @JsonProperty('term')
    String getTerm() {
        return term
    }
    void setTerm(String term) {
        this.term = term
    }

    @Override
    boolean equals(Object o) {
        if (this == o) {
            return true
        }
        if (o == null || getClass() != o.getClass()) {
            return false
        }
        Rate rate = (Rate) o
        return Objects.equals(percentage, rate.percentage) &&
                Objects.equals(term, rate.term)
    }

    @Override
    int hashCode() {
        return Objects.hash(percentage, term)
    }

    @Override
    String toString()  {
        StringBuilder sb = new StringBuilder()
        sb.append('class Rate {\n')

        sb.append('  percentage: ').append(percentage).append('\n')
        sb.append('  term: ').append(term).append('\n')
        sb.append('}\n')
        return sb.toString()
    }
}
