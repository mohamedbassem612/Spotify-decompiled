package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum hjh1 implements v190 {
    UNKNOWN(0),
    ANCHOR_PAYWALL(1),
    OAP_OTP(2),
    OAP_LINKING(3),
    AUDIOBOOK_DIRECT_SALES(4),
    ABP(5),
    AUDIOBOOK_PROMOTION(6),
    LEARNING_DIRECT_SALES(8),
    PREMIUM_KPOP_EARLY_ACCESS(9),
    OPAL(11),
    UNRECOGNIZED(-1);

    public final int a;

    hjh1(int i) {
        this.a = i;
    }

    public static hjh1 a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ANCHOR_PAYWALL;
            case 2:
                return OAP_OTP;
            case 3:
                return OAP_LINKING;
            case 4:
                return AUDIOBOOK_DIRECT_SALES;
            case 5:
                return ABP;
            case 6:
                return AUDIOBOOK_PROMOTION;
            case 7:
            case 10:
            default:
                return null;
            case 8:
                return LEARNING_DIRECT_SALES;
            case 9:
                return PREMIUM_KPOP_EARLY_ACCESS;
            case 11:
                return OPAL;
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
