package br.org.generation.projetoIntegrador.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.org.generation.projetoIntegrador.model.Usuario;
import br.org.generation.projetoIntegrador.repository.RepositoryUsuario;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private RepositoryUsuario userRepository;
	
	@Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<Usuario> user = userRepository.findByUsuario(userName);
        user.orElseThrow(() -> new UsernameNotFoundException(userName + " not found. "));
        
        return user.map(UserDetailsImpl::new).get();
    }

}
