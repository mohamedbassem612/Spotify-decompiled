package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum ub00 implements v190 {
    ACCEPTED(0),
    AD_NOT_FOUND(1),
    UNRECOGNIZED(-1);

    public final int a;

    ub00(int i) {
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
