package ru.qamid66;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingTest {
    @Test
    public void testMeetingTaskTopic () {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Выкатка 3й");

        Assertions.assertTrue(actual);
    }
    @Test
    public void testMeetingTaskProject () {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Приложение");

        Assertions.assertTrue(actual);
    }
    @Test
    public void testMeetingTaskStart () {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Во втоник");

        Assertions.assertFalse(actual);
    }

}