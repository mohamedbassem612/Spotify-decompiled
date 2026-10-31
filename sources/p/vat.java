package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum vat implements v190 {
    UNDEFINED(0),
    SPARSE(1),
    NORMAL(2),
    DENSE(3),
    UNRECOGNIZED(-1);

    public final int a;

    vat(int i) {
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
