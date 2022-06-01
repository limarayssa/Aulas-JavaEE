package br.com.senai.rayssalima.application.config;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;
//força o eclipse a usar essa versão do jsf
@FacesConfig(version = Version.JSF_2_3) 
//dura enquanto o programa estiver sendo executado
@ApplicationScoped
public class Config {
}
