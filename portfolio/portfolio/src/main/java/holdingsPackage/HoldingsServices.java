package holdingsPackage;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HoldingsServices {
    private final HoldingInterface holdingsRepo;

    public Holdings createHoldings(Holdings holdings){
        return holdingsRepo.save(holdings);
    }
    public ArrayList<Holdings> getHoldings(){
        return (ArrayList<Holdings>) holdingsRepo.findAll();
    }
}
