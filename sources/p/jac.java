package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum jac implements v190 {
    UNSPECIFIED(0),
    XL(1),
    L(2),
    M(3),
    S(4),
    UNRECOGNIZED(-1);

    public final int a;

    jac(int i) {
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
