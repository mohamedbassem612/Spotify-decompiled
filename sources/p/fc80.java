package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum fc80 implements v190 {
    UNKNOWN(0),
    COPPA(1),
    NON(2),
    IMPLICIT(3),
    EXPLICIT(4),
    UNRECOGNIZED(-1);

    public final int a;

    fc80(int i) {
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
