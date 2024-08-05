package net.engineeringdigest.journalApp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;


import net.engineeringdigest.journalApp.entity.JournalEntry;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
// import java.util.stream.collectors;

@RestController
@RequestMapping("/journal") //adding endpoint to the class
public class JournalEntryController {
    
    private  Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @GetMapping("id/{myId}") //localhost:8080/journal/id/1 path variable // localhost:8080/journal/id?id=1 request parameter
    public JournalEntry getJournalById(@PathVariable Long myId){
        return journalEntries.get(myId);
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){//its like saying, hey spring please take the data from the request and turn it into java object that i can use in my code
        journalEntries.put(myEntry.getId(),myEntry);
        return true;
    }

    @DeleteMapping("id/{myId}") //localhost:8080/journal/id/1 path variable // localhost:8080/journal/id?id=1 request parameter
    public JournalEntry deleteJournalById(@PathVariable Long myId){
        return journalEntries.remove(myId);
    }

    @PutMapping("id/{myId}")
    public JournalEntry updateJournalById(@PathVariable Long myId, @RequestBody JournalEntry myEntry){
        return journalEntries.put(myId, myEntry);
    }
}
