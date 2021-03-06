package emcon.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by graham on 2015/04/26.
 */
@Embeddable
public class EmergencyType implements Serializable {
    private String description;
    private String ice;

    public EmergencyType(Builder builder){
        description = builder.description;
        ice = builder.ice;
    }

    public String getDescription(){
        return description;
    }

    public String getIce(){
        return ice;
    }


    public static class Builder {
        private String description;
        private String ice;

        public Builder(String description) {
            this.description = description;
        }


        public Builder ice(String value) {
            this.ice = value;
            return this;
        }


        public EmergencyType build() {
            return new EmergencyType(this);
        }
    }
}

