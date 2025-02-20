package com.evilcorp.spring;

import org.wildfly.iiop.openjdk.rmi.ir.InterfaceRepository;

public class UsuarioService implements InterfaceRepository {

    //UsuarioRepository rep = new UsuarioRepository();
    UsuarioRepositoryAPI rep = new UsuarioRepositoryAPI();
    public void obterUsuario(){
        rep.obterDados();
    }
}
