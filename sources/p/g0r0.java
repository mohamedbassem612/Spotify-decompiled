package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum g0r0 implements v190 {
    PAGE_UNSPECIFIED(0),
    CHALLENGE_PAGE(1),
    QUIZ_PAGE(2),
    RESULTS_PAGE_SOLO(3),
    ROUND_ERROR(4),
    Q_AND_A(5),
    CHALLENGE_RESULT(6),
    UNRECOGNIZED(-1);

    public final int a;

    g0r0(int i) {
        this.a = i;
    }

    public static g0r0 a(int i) {
        switch (i) {
            case 0:
                return PAGE_UNSPECIFIED;
            case 1:
                return CHALLENGE_PAGE;
            case 2:
                return QUIZ_PAGE;
            case 3:
                return RESULTS_PAGE_SOLO;
            case 4:
                return ROUND_ERROR;
            case 5:
                return Q_AND_A;
            case 6:
                return CHALLENGE_RESULT;
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
