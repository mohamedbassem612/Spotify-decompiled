package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum omz implements v190 {
    UNKNOWN(0),
    LOW(1),
    NORMAL(2),
    HIGH(3),
    VERY_HIGH(4),
    HIFI(5),
    HIFI24(6),
    PETREL(7),
    UNRECOGNIZED(-1);

    public final int a;

    omz(int i) {
        this.a = i;
    }

    public static omz a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return LOW;
            case 2:
                return NORMAL;
            case 3:
                return HIGH;
            case 4:
                return VERY_HIGH;
            case 5:
                return HIFI;
            case 6:
                return HIFI24;
            case 7:
                return PETREL;
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
