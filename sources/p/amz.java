package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum amz implements v190 {
    GPRS(0),
    EDGE(1),
    THREE_G(2),
    FOUR_G(3),
    FIVE_G(4),
    UNKNOWN_SUBTYPE(5),
    UNRECOGNIZED(-1);

    public final int a;

    amz(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
