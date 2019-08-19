package be.vdab.groenetenen.services;

import be.vdab.groenetenen.domain.Filiaal;
import be.vdab.groenetenen.repositories.FiliaalRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true, isolation = Isolation.READ_COMMITTED)
public class DefaultFiliaalService implements FiliaalService {
    private final FiliaalRepository repository;

    public DefaultFiliaalService(FiliaalRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Filiaal> findByPostcode(int van, int tot) {
        return repository.findByAdresPostcodeBetweenOrderByAdresPostcode(van, tot);
    }
}
