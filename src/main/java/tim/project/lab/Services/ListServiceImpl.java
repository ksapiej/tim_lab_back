package tim.project.lab.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ListServiceImpl implements ListServiceInterface {
    ArrayList<Integer> l;
    private Random r = new Random();
    @Override
    public List<Integer> getList(int x){
        l = new ArrayList<>(x);
        for(int i = 0; i<x; i++){
            l.add(r.nextInt(10) + 1);
        }
        return l;
    }
    public ArrayList<Integer> getAL(){
        return l;
    }
}
