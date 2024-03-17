package org.example.service;

import org.example.model.Faculty;
import org.example.repository.FacultyRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FacultyService {

//    private final Map<Long, Faculty> facultyMap = new HashMap<>();
//    private long lastId = 0;

    private final FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty createFaculty(Faculty faculty) {
        faculty.setId(null);
        return facultyRepository.save(faculty);
    }

    public Faculty findFaculty(long lastId) {
        return facultyRepository.findById(lastId).orElse(null);
    }

    public Faculty editFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty(long id) {
        facultyRepository.deleteById(id);
    }

    public Collection<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }

    public Collection<Faculty> getFilteredFacultiesByColor(String color) {
        return facultyRepository.findByColor(color);
    }

}
