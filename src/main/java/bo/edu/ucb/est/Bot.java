/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.ucb.est;

import java.util.List;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
/**
 *
 * @author Usuario
 */
public class Bot extends TelegramLongPollingBot {
    
     @Override
    public String getBotToken() {
        return "2024798596:AAHhJXhXNvlp2FYAssV2h9wbhVSVQ_FezRw";
    }
    
    @Override
    public void onUpdateReceived(Update update){
        if(update.hasMessage()){
            //creo el objeto para enviar un mensaje
            SendMessage message = new SendMessage();
            message.setChatId(update.getMessage().getChatId().toString());//Define a quien le vamos a enviar el mensaje
            message.setText("Bienveninido al Bot Calculadora.\n Seleccione una de las siguientes opciones:\n 1. Sumar dos números.\n 2. Calcular serie de fibonacci.");
            try{
                execute(message); // Envia el mensaje
                if(update.hasMessage()) { // Verificamos que tenga mensaje
                    SendMessage message1 = new SendMessage();
                    SendMessage message3 = new SendMessage();
                    message1.setChatId(update.getMessage().getChatId().toString());
                    message3.setChatId(update.getMessage().getChatId().toString());
                    if(update.getMessage().getText().toString().equals("1")){
                        int a;
                        int b;
                        int c;
                        message1.setText("ingrese numero");
                        a=Integer.parseInt(update.getMessage().getText());
                        try{
                            execute(message1);
                            if(update.hasMessage()){
                                SendMessage message2 = new SendMessage();
                                message2.setChatId(update.getMessage().getChatId().toString());
                                message2.setText("Ingrese segundo número");
                                b = Integer.parseInt(update.getMessage().getText());
                                try{
                                    execute (message2);
                                    c = a+b;
                                    message3.setText("La suma de "+a+" + "+b+" es "+c);
                                    try{
                                        execute (message3);
                                    }catch(TelegramApiException e){
                                        e.printStackTrace();
                                    }
                                }catch(TelegramApiException e){
                                   e.printStackTrace(); 
                                }
                            }
                        }catch(TelegramApiException e){
                            e.printStackTrace();
                        }
                    }else{
                       if(update.getMessage().getText().toString().equals("2")){
                           SendMessage message4 = new SendMessage();
                           message4.setChatId(update.getMessage().getChatId().toString());
                           message4.setText("Funcionalidad no implementada, intente otro día");
                           try {
                                execute(message4);
                           }catch(TelegramApiException e){
                                e.printStackTrace();
                           }
                       } 
                    }
                }
            }catch(TelegramApiException e){
                 e.printStackTrace();
            }
    }   
        

    }
    
    @Override
    public String getBotUsername() {
        return "calcu16_bot";
    }
}
