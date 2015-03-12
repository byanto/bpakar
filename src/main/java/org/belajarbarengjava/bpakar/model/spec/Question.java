package org.belajarbarengjava.bpakar.model.spec;

import java.util.List;

/**
 * This entity interface denotes information stored within a Question.
 * A question, may have multiple possible option to the answer of the question.
 *
 * Created by ferdinand on 3/11/15.
 */
public interface Question extends BaseEntity {

    /**
     * Get the question text.
     *
     * @return Question text
     */
    public String getQuestionText();

    /**
     * Get list of option as possible answer to this question.
     *
     * @return List of Option object.
     */
    public List<Option> getPossibleOption();

    /**
     * Indicate that this question is the first question to start when
     * the expert system start.
     *
     * @return <code>true</code> if this question is the first question to ask. <code>false</code> if otherwise.
     */
    public boolean isStartingQuestion();

}
