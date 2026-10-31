package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum flj1 implements v190 {
    UNKNOWN(0),
    URL(1),
    MANIFEST_ID(2),
    UNRECOGNIZED(-1);

    public final int a;

    flj1(int i) {
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
