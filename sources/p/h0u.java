package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum h0u implements v190 {
    UNKNOWN_DEVICE_TYPE(0),
    COMPUTER(1),
    SMARTPHONE(2),
    SMALL_TABLET(3),
    TABLET(4),
    SPEAKER(5),
    SMART_DISPLAY(6),
    WEARABLE(7),
    AUTOMOBILE(8),
    TV(9),
    UNRECOGNIZED(-1);

    public final int a;

    h0u(int i) {
        this.a = i;
    }

    public static h0u a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_DEVICE_TYPE;
            case 1:
                return COMPUTER;
            case 2:
                return SMARTPHONE;
            case 3:
                return SMALL_TABLET;
            case 4:
                return TABLET;
            case 5:
                return SPEAKER;
            case 6:
                return SMART_DISPLAY;
            case 7:
                return WEARABLE;
            case 8:
                return AUTOMOBILE;
            case 9:
                return TV;
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
