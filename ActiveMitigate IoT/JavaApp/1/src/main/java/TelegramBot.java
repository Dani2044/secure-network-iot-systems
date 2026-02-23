import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBot extends TelegramLongPollingBot {

	@Override
    public String getBotUsername() {
        return "AlarmaMetanoBot";
    }

    @Override
    public String getBotToken() {
        String token = System.getenv("TELEGRAM_BOT_TOKEN");
        if (token == null || token.isEmpty()) {
            throw new IllegalStateException(
                "TELEGRAM_BOT_TOKEN environment variable is not set.");
        }
        return token;
    }

    @Override
    public void onUpdateReceived(Update update) {
    	//No se necesita implementar
    }

    SendMessage generateSendMessage(Long chatId, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId.toString());
        sendMessage.setText(text);
        return sendMessage;
    }

    void sendMessage(SendMessage sendMessage) {
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}