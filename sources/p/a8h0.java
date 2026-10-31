package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum a8h0 implements v190 {
    MASK_UNSPECIFIED(0),
    MASK_CIRCULAR(1),
    UNRECOGNIZED(-1);

    public final int a;

    a8h0(int i) {
        this.a = i;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
