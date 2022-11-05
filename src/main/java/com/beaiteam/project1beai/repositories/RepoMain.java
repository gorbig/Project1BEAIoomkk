package com.beaiteam.project1beai.repositories;

import com.beaiteam.project1beai.entities.Music;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class RepoMain {
    private RepoMain() {
    }

    public MusicRepository getRepo(){
        return new MusicRepository() {
            @Override
            public List<Music> findAll() {
                return null;
            }

            @Override
            public List<Music> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Music> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public <S extends Music> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Music> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Music> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Music> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Music getOne(Long aLong) {
                return null;
            }

            @Override
            public Music getById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Music> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Music> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Music> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Music> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Music> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Music entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Music> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Music> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Music> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Music> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Music> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Music, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        };
    }
}
