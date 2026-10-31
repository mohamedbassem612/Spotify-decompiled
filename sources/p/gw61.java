package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum gw61 implements v190 {
    ROUND(0),
    SQUARE(1),
    NINE_TO_SIXTEEN(2),
    SIXTEEN_TO_NINE(3),
    UNRECOGNIZED(-1);

    public final int a;

    gw61(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
