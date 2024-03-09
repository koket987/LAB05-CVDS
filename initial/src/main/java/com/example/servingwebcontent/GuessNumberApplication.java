package com.example.servingwebcontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class GuessNumberApplication {

    private int prize = 100000;
    private int randomNumber;
    private void generateRandomNumber() {
        Random random = new Random();
        randomNumber = random.nextInt(10) + 1;
    }


    @GetMapping("/guess")
    public String guess(Model model) {
        prize = 0;
        generateRandomNumber();
        model.addAttribute("prize", prize);
        return "guess";
    }

    // Ruta para procesar el formulario
    @PostMapping("/guess")
    public String checkGuess(@RequestParam("numero") int number, Model model) {
        if (number == randomNumber) {
            model.addAttribute("message", "¡Felicidades! ¡Has adivinado el número y te quedas con $100000!");
            prize = 100000;
        } else {
            prize -= 10000; // Reduce el premio por intento fallido
            model.addAttribute("message", "¡Lo siento! El número a adivinar era " + randomNumber + ". Inténtalo de nuevo.");
        }
        generateRandomNumber();
        model.addAttribute("prize", prize);
        return "guess";
    }
    @GetMapping("/reset")
    public String reset() {
        prize = 0;
        return "redirect:/guess";
    }

    public static void main(String[] args) {
        SpringApplication.run(GuessNumberApplication.class, args);
    }
}