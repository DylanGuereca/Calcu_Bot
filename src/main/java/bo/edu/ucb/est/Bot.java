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
        
    }
    
    @Override
    public String getBotUsername() {
        return "calcu16_bot";
    }
}
