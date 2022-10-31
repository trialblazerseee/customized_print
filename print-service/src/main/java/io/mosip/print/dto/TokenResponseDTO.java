package io.mosip.print.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Data
@Getter
@Setter
public class TokenResponseDTO {
	
    String id;
    String version;
    String responsetime;
    String metadata;
    Response response;
    Errors[] errors;
    public Errors[] getErrors() {
                   if(errors != null) {
                   return Arrays.copyOf(errors, errors.length);
                   }else {
                                  return null;
                   }
    }

    public void setErrors(Errors[] errors) {
                   this.errors = errors!=null?errors:null;
    }

}