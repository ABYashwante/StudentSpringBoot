package net.engineeringdigest.journalApp.Controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

@RestController
public class HealthCheck {


    Map<Integer, String> mp = new HashMap<>();

    @GetMapping("/health-check")
    public String healthCheck()
    {
        return "ok";
    }

    @PostMapping("/msg")
    public JournalEntry message(@RequestBody JournalEntry je)
    {
        return je;
    }

    @PostMapping("/msg1")
    public String message1(@RequestBody JournalEntry j)
    {
        return j.getContent();
    }

    @PutMapping("/update/{key}")
    public Map<Integer, String> getMp(@PathVariable Integer key, @RequestBody String st) {
        mp.put(1,"A");
        mp.put(2,"B");
        mp.put(3,"C");
        mp.put(4,"D");
        mp.put(5,"E");

        if(mp.containsKey(key))
        {
            mp.replace(key, st);
        }
        return mp;
    }
    @DeleteMapping("/delete/{key}")
    public Map<Integer, String> deleteMp(@PathVariable Integer key) {
        mp.put(1,"A");
        mp.put(2,"B");
        mp.put(3,"C");
        mp.put(4,"D");
        mp.put(5,"E");

        if(mp.containsKey(key))
        {
            mp.remove(key);
        }
        return mp;
    }
}
