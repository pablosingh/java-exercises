package holdingsPackage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/holdings")
@RequiredArgsConstructor
public class HoldingsController {
    private final HoldingsServices holServices;

    @PostMapping
    public Holdings createHoldings(@RequestBody Holdings holdings) {
        return holServices.createHoldings(holdings);        
    }
    
    @GetMapping("/hola")
    public String getHola(){
        return "Hola Mundo";
    }
    @GetMapping
    public ArrayList<Holdings> getArrayHoldings() {
        return holServices.getHoldings();
    }
}
