package springframework.spring6reactiveplayground.repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import springframework.spring6reactiveplayground.domain.Person;

public class PersonRepositoryImpl implements PersonRepository {

    Person michael = Person.builder().id(1).firstName("Michael").lastName("Jan").build();
    Person fiona = Person.builder().id(1).firstName("Fiona").lastName("Janes").build();
    Person bob = Person.builder().id(1).firstName("Bob").lastName("Jordison").build();
    Person sam = Person.builder().id(1).firstName("Sam").lastName("Jafford").build();

    @Override
    public Mono<Person> getById(Integer id) {
        return Mono.just(michael);
    }

    @Override
    public Flux<Person> findAll() {
        return Flux.just(michael, fiona, bob, sam);
    }
}
