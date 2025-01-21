package com.jrubiiio.foro.services;

import com.jrubiiio.foro.modelos.topicos;
import com.jrubiiio.foro.repositorios.ITopicoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicoServiceImpl implements CRUD {

    private final ITopicoRepositorio repositorio;
    private Integer id;

    @Override
    public List<topicos> findAll() {
        return repositorio.findAll();
    }

    @Override
    public topicos findByID(Integer id) {
        return null;
    }

    @Override
    public topicos save(topicos topicos) {
        return repositorio.findById(id).orElseThrow();
    }

    @Override
    public topicos update(Integer id, topicos topicos) {
        topicos.setId(id);
        return repositorio.save(topicos);
    }

    @Override
    public void deleteById(Integer id) {
        repositorio.deleteById(id);
    }
}