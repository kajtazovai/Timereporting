package mk.finki.dr.timereporting.services;

import mk.finki.dr.timereporting.models.Timereport;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TimereportService {
    List<Timereport> findAll();
    Timereport findOne(Integer id);
    void deleteTimereport(Integer id);
    Timereport save (Timereport timereport);
}