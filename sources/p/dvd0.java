package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum dvd0 implements v190 {
    UNRECOGNIZED_CTA_DISPLAY_VALUE(0),
    LOCKED_GET_ON_THE_LIST(1),
    GET_ON_THE_LIST(2),
    ON_THE_LIST(3),
    LOCKED_NOTIFY_ME(4),
    NOTIFY_ME(5),
    WILL_BE_NOTIFIED(6),
    NOTIFY_ME_UPSELL(7),
    UNRECOGNIZED(-1);

    public final int a;

    dvd0(int i) {
        this.a = i;
    }

    public static dvd0 a(int i) {
        switch (i) {
            case 0:
                return UNRECOGNIZED_CTA_DISPLAY_VALUE;
            case 1:
                return LOCKED_GET_ON_THE_LIST;
            case 2:
                return GET_ON_THE_LIST;
            case 3:
                return ON_THE_LIST;
            case 4:
                return LOCKED_NOTIFY_ME;
            case 5:
                return NOTIFY_ME;
            case 6:
                return WILL_BE_NOTIFIED;
            case 7:
                return NOTIFY_ME_UPSELL;
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
