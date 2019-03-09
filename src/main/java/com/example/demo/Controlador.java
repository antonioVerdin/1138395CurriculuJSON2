package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (value = "/cv")

public class Controlador {

    Curriculum nuevo = new Curriculum();

    @GetMapping("/datos")
    public String obtenerDatos(Model model){

        nuevo.setNombre("José Antonio");
        nuevo.setApellido("Verdín García");
        nuevo.setCorreo("antonio.verdin@uabc.edu.mx");
        nuevo.setEdad(23);
        nuevo.setTelefono("6861131012");
        nuevo.setTrayectoria("Escuela Primaria Francisco J. Mujica \n Escuela Secundaria Francisco Zarco #1 \n " +
                "Preparatoria CETIS 75 \n Preparatoria COBACH José Vasconcelos Calderon \n UABC Facultad de Ingenieria ");
        nuevo.setExperiencia("NEW OPTICS Empresa de Capital Coreano nueva creación para Fabricación de Componentes electrónico (Televisores LCD). \n " +
                "TELVISTA proveedor internacional de servicios de Contact Center \n");
        nuevo.setInformatica("Manejo de Microsoft Office Word \n " +
                "Diseño de Interfaz Html \n" +
                "Progamacon basica en C \n " +
                "Programacion basica en Java");
        nuevo.setIdiomas("Español: Alto \n Ingles: Bajo ");
        nuevo.setInteres("Literatura Ciencia ficcion \n Musica tocar la guitarra ");

        model.addAttribute("cv", nuevo);
        return "cv";
    }

}