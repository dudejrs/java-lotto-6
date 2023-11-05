package lotto.resource;

public class TextResourceProvider {

    // ERROR
    public static final String ERROR_MESSAGE_TAG = "[ERROR]";
    public static final String PURCHASE_AMOUNT_CANNOT_CONVERT_TO_LONG_TEXT = "입력값을 Long 타입으로 변환할 수 없습니다.";
    public static final String PURCHASE_AMOUNT_CANNOT_BE_NEGATIVE_LONG_TEXT = "구입금액은 양수야 합니다.";
    public static final String PURCHASE_AMOUNT_MUST_BE_DIVIDE_BY_LOTTERY_PRICE_TEXT = "구입금액은 1000으로 나눌 수 있어야 합니다.";

    public static final String WINNING_NUMBERS_MUST_BE_SEPARATED_BY_SIX_INTEGER_WITH_DELIMITER_TEXT = "당첨번호는 ','로 구분된 6개의  Integer 타입의 숫자여야 합니다";
    public static final String WINNING_NUMBERS_MUST_BE_BETWEEN_1_AND_45 = "당첨번호는 1과 45 사이의 숫자로 이루어져야 합니다";
    public static final String WINNING_NUMBERS_SHOULD_BE_6_UNIQUE_NUMBERS = "당첨번호는 6개의 중복되지 않는 숫자여야 합니다";

    // TEXT
    public static final String INPUT_PURCHASE_AMOUNT_TEXT = "구입금액을 입력해 주세요.";
    public static final String INPUT_WINNING_NUMBERS_TEXT = "당첨 번호를 입력해 주세요.";
    public static final String INPUT_DELIMITER = ",";
    public static final String INPUT_BONUS_NUMBER_TEXT = "보너스 번호를 입력해 주세요.";
    public static final String OUTPUT_LOTTERY_RESULT = "당첨 통계";
    public static final TextFormat QUANTITY_OUTPUT_TEXT_FORMAT = new TextFormat("%s개를 구매하였습니다.");
    public static final TextFormat LOTTO_NUMBERS_TEXT_FORMAT = new TextFormat("[%s, %s, %s, %s, %s, %s]");
}
