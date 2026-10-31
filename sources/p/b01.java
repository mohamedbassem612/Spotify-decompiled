package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum b01 implements v190 {
    BOTTOM_SHEET_TRIGGERED(0),
    OFFER_SHOWN(1),
    PREMIUM_UPGRADE_SELECTED(2),
    OPT_IN(3),
    OFFER_DISMISSED(4),
    AD_STARTED(5),
    FORCE_QUIT(6),
    CAP_REFRESH_TIMEED_OUT(7),
    CAP_REFRESH_REQUESTED(8),
    CAP_REFRESH_SUCCESS(9),
    CAP_REFRESH_FAILURE(10);

    private static final y190 internalValueMap = new icx0((byte) 27);
    private final int value;

    b01(int i) {
        this.value = i;
    }

    public static b01 a(int i) {
        switch (i) {
            case 0:
                return BOTTOM_SHEET_TRIGGERED;
            case 1:
                return OFFER_SHOWN;
            case 2:
                return PREMIUM_UPGRADE_SELECTED;
            case 3:
                return OPT_IN;
            case 4:
                return OFFER_DISMISSED;
            case 5:
                return AD_STARTED;
            case 6:
                return FORCE_QUIT;
            case 7:
                return CAP_REFRESH_TIMEED_OUT;
            case 8:
                return CAP_REFRESH_REQUESTED;
            case 9:
                return CAP_REFRESH_SUCCESS;
            case 10:
                return CAP_REFRESH_FAILURE;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.value;
    }
}
