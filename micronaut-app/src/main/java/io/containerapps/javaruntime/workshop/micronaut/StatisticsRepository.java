package io.containerapps.javaruntime.workshop.micronaut;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface StatisticsRepository extends CrudRepository<Statistics, Long> {
}
