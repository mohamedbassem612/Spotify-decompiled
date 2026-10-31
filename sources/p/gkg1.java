package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum gkg1 implements v190 {
    STYLE_BLOCK_TYPE_UNSPECIFIED(0),
    STYLE_BLOCK_TYPE_LOOP(1),
    STYLE_BLOCK_TYPE_SPINBACK(2),
    STYLE_BLOCK_TYPE_VINYL_STOP(3),
    UNRECOGNIZED(-1);

    public final int a;

    gkg1(int i) {
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
