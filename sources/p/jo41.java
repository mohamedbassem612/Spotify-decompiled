package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum jo41 implements v190 {
    SCORE_THRESHOLD_UNSPECIFIED(0),
    SCORE_THRESHOLD_NO_ANSWER(1),
    SCORE_THRESHOLD_LOW(2),
    SCORE_THRESHOLD_MEDIUM(3),
    SCORE_THRESHOLD_HIGH(4),
    SCORE_THRESHOLD_PERFECT(5),
    SCORE_THRESHOLD_INCORRECT(6),
    UNRECOGNIZED(-1);

    public final int a;

    jo41(int i) {
        this.a = i;
    }

    public static jo41 a(int i) {
        switch (i) {
            case 0:
                return SCORE_THRESHOLD_UNSPECIFIED;
            case 1:
                return SCORE_THRESHOLD_NO_ANSWER;
            case 2:
                return SCORE_THRESHOLD_LOW;
            case 3:
                return SCORE_THRESHOLD_MEDIUM;
            case 4:
                return SCORE_THRESHOLD_HIGH;
            case 5:
                return SCORE_THRESHOLD_PERFECT;
            case 6:
                return SCORE_THRESHOLD_INCORRECT;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
