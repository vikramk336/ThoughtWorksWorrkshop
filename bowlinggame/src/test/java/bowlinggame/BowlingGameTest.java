package bowlinggame;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

    private Game bowlingGame;
    
    @Before
    public void setUp() throws Exception {
        bowlingGame = new Game();
    }

    @Test
    public void shouldScoreGutterGame() {
        rollMany(20, 0);

        assertThat(bowlingGame.score(), is(0));
    }

    @Test
    public void shouldScoreAllOnes() {
        rollMany(20, 1);

        assertThat(bowlingGame.score(), is(20));
    }

    @Test
    public void shouldScoreOneSpare() {
        rollSpare();
        bowlingGame.roll(3);
        rollMany(17, 0);

        assertThat(bowlingGame.score(), is(16));
    }
    
    @Test
    public void shouldScoreOneStrike() {
        rollStrike();
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        rollMany(16, 0);

        assertThat(bowlingGame.score(), is(24));
    }

    @Test
    public void shouldScorePerfectGame() {
        rollMany(12, 10);

        assertThat(bowlingGame.score(), is(300));
    }

    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++)
            bowlingGame.roll(pins);
    }

    private void rollSpare() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
    }

    private void rollStrike() {
        bowlingGame.roll(10);
    }
}