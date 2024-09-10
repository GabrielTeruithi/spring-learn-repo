package springframework.spring6restmvc.mappers;

import springframework.spring6restmvc.entities.Beer;
import springframework.spring6restmvc.model.BeerDTO;
import org.mapstruct.Mapper;

/**
 * Created by jt, Spring Framework Guru.
 */
@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}
