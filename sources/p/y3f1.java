package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum y3f1 implements v190 {
    TOOLTIP_ANCHOR_VIEW_TYPE_UNKNOWN(0),
    TOOLTIP_ANCHOR_VIEW_TYPE_CONNECT_BUTTON(1),
    UNRECOGNIZED(-1);

    public final int a;

    y3f1(int i) {
        this.a = i;
    }

    public static y3f1 a(int i) {
        if (i == 0) {
            return TOOLTIP_ANCHOR_VIEW_TYPE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return TOOLTIP_ANCHOR_VIEW_TYPE_CONNECT_BUTTON;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
