package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum nz1 implements v190 {
    TYPE_UNSPECIFIED(0),
    TRANSIENT(1),
    PERMANENT(2),
    UNRECOGNIZED(-1);

    public final int a;

    nz1(int i) {
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
