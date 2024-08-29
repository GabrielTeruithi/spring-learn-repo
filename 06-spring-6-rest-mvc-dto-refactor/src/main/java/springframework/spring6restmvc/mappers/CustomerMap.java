package springframework.spring6restmvc.mappers;

import org.mapstruct.Mapper;
import springframework.spring6restmvc.entities.Customer;
import springframework.spring6restmvc.model.CustomerDTO;

@Mapper
public interface CustomerMap {

    Customer customerDtoToCustomer(CustomerDTO dto);
    CustomerDTO customerToCustomerDTO(Customer customer);

}
