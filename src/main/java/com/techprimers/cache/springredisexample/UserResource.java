package com.techprimers.cache.springredisexample;


//import com.techprimers.cache.springredisexample.Repository.RegisterationRepository;
/*import com.techprimers.cache.springredisexample.Request.RegisterationRequest;
import com.techprimers.cache.springredisexample.model.Registeration;*/
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    private UserRepository userRepository;

   /* @Autowired
    private RegisterationRepository registerationRepository;*/

    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/add/{id}/{name}")
    public User add(@PathVariable("id") final String id,
                    @PathVariable("name") final String name) {
        userRepository.save(new User(id, name, 20000L));
        return userRepository.findById(id);
    }

    @GetMapping("/update/{id}/{name}")
    public User update(@PathVariable("id") final String id,
                       @PathVariable("name") final String name) {
        userRepository.update(new User(id, name, 1000L));
        return userRepository.findById(id);
    }

    @GetMapping("/delete/{id}")
    public Map<String, User> delete(@PathVariable("id") final String id) {
        userRepository.delete(id);
        return all();
    }

    @GetMapping("/all")
    public Map<String, User> all() {
        return userRepository.findAll();
    }


   /* @PostMapping(value = "/saveUser")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> registrationUser(@RequestBody RegisterationRequest request) throws Exception {
        try{
            List<Registeration> users = registerationRepository.findByUsername(request.getUsername());
            if(users.size()==0) {
                Registeration registeration = new Registeration(request.getUsername(), request.getFirstName(), request.getLasttName(), request.getPassword(), request.getEmailId(), request.getMobile(), request.getTotalWorkExp(),request.getId(),request.getAge());
                registerationRepository.save(registeration);
            }
            else
                return ResponseEntity.badRequest().build();
        }
        catch(Exception ex){
            ex.printStackTrace();
            throw new Exception();
        }
        return ResponseEntity.ok().build();
    }*/

}
