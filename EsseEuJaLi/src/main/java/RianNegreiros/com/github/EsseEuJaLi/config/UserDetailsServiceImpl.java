import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    // Look up the user in the database using the username
    User user = ...

    // If the user is not found, throw an exception
    if (user == null) {
      throw new UsernameNotFoundException("User '" + username + "' not found");
    }

    // Return the user details
    return user;
  }
}
