package springframework.spring6reactiveplayground.repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import springframework.spring6reactiveplayground.domain.Person;

public interface PersonRepository {
    Mono<Person> getById(Integer id);

    Flux<Person> findAll();
}
