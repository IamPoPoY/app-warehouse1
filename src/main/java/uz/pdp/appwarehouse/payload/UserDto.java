package uz.pdp.appwarehouse.payload;

import lombok.Data;
import uz.pdp.appwarehouse.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
public class UserDto {
    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String password;

    private Set<Integer> warehousesId;
}
