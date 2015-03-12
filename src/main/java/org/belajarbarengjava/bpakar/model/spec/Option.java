package org.belajarbarengjava.bpakar.model.spec;

/**
 * This entity denote an option to be choosen when one see a question.
 * The answer option would possibly linked to other question or may lead to an answer.
 *
 * Created by ferdinand on 3/11/15.
 */
public interface Option extends BaseEntity {

    /**
     * The text to be shown as the option text.
     *
     * @return The option text
     */
    public String getOptionText();

    /**
     * The next question after answering this text. The application must continue with the question if this option is choosen.
     *
     * @return The next question
     */
    public Question getNextQuestion();

    /**
     * The answer to be displayed if the option is choosen.
     * @return The Answer as the result of choosing this option.
     */
    public Answer getAnswer();

}
