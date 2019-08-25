package com.spring.mvc;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class lottoCtrl {
 
   
 
    // Method to test the angular fetch call.
    @CrossOrigin(origins="http://localhost:4200")  // @CrossOrigin is used to handle the request from a difference origin.
    @RequestMapping(value= "/getLottoNumbers", method= RequestMethod.GET) 
    public List<LottoBall> getAllWinningNumbers() {
    	List<LottoBall> winningNumnbers = new ArrayList<LottoBall>();
    	winningNumnbers.add(new LottoBall(10));
    	winningNumnbers.add(new LottoBall(15));
    	winningNumnbers.add(new LottoBall(20));
    	winningNumnbers.add(new LottoBall(15));
    	winningNumnbers.add(new LottoBall(30));
    	winningNumnbers.add(new LottoBall(35));
        return winningNumnbers;
    }
}