package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum z3f1 implements v190 {
    TOOLTIP_ARROW_DIRECTION_UNKNOWN(0),
    TOOLTIP_ARROW_DIRECTION_TOP(1),
    TOOLTIP_ARROW_DIRECTION_BOTTOM(2),
    TOOLTIP_ARROW_DIRECTION_LEADING(3),
    TOOLTIP_ARROW_DIRECTION_TRAILING(4),
    UNRECOGNIZED(-1);

    public final int a;

    z3f1(int i) {
        this.a = i;
    }

    public static z3f1 a(int i) {
        if (i == 0) {
            return TOOLTIP_ARROW_DIRECTION_UNKNOWN;
        }
        if (i == 1) {
            return TOOLTIP_ARROW_DIRECTION_TOP;
        }
        if (i == 2) {
            return TOOLTIP_ARROW_DIRECTION_BOTTOM;
        }
        if (i == 3) {
            return TOOLTIP_ARROW_DIRECTION_LEADING;
        }
        if (i != 4) {
            return null;
        }
        return TOOLTIP_ARROW_DIRECTION_TRAILING;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
