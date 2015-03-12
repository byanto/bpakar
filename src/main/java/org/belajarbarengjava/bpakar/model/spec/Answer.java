package org.belajarbarengjava.bpakar.model.spec;

/**
 * This entity interface denotes an answer to be shown to the user as a result of
 * choosing one option.
 *
 * Created by ferdinand on 3/11/15.
 */
public interface Answer extends BaseEntity {

    public String getAnswerText();
    public int getAnswerLike();
    public int getAnswerDislike();

}
