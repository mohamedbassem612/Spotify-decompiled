package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum b3d1 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    UNSUPPORTED(1),
    SUPPORTED(2),
    UNRECOGNIZED(-1);

    public final int a;

    b3d1(int i) {
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
