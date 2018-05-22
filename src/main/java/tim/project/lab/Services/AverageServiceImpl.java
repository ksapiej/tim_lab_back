package tim.project.lab.Services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AverageServiceImpl implements AverageServiceInterface {

    @Override
    public double average(List<Integer> l) {
        double result = 0;
        for (int i = 0; i < l.size(); i++) {
            result += l.get(i);
        }
        return (result / l.size());
    }
}
