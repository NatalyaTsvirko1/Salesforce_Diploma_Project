package models;

import enums.AccessType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Groups {

    private String name;
    private String description;
    private String information;
    private AccessType accessType;

}
