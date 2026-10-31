package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum knb0 implements x190 {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED_VERTICAL_ALIGNMENT(0),
    TOP(1),
    CENTER_VERTICALLY(2),
    BOTTOM(3),
    UNRECOGNIZED(-1);

    public final int a;

    knb0(int i) {
        this.a = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
