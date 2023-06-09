package org.example.statistics;
import com.pengrad.telegrambot.model.Update;
import org.example.statistics.model.PlayerStatsNode;
import org.example.statistics.model.UserDTO;

import java.util.Map;

public interface ManagerStatsInterface {

    void incrementCountOfGuessedLetters(Update gameInput); // Количество угаданных букв

    void incrementCountOfUnguessedLetters(Update gameInput); // Количество неугаданных букв

    void incrementCountOfGuessedWholeWords(Update gameInput); // Количество угаданных целых слов

    void incrementCountOfUnguessedWholeWords(Update gameInput); // Количество неугаданных целых слов

    Map<UserDTO, PlayerStatsNode> getStatsNodeHashMap();
}
