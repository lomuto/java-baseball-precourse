package baseball.Result;

public class NothingResult extends ResultBase {
    public NothingResult() {
        super("낫싱" + System.lineSeparator());
    }

    @Override
    public final String getMessage(int strikeCount, int ballCount) {
            return message;
    }
}
