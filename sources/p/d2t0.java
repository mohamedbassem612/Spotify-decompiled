package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum d2t0 implements v190 {
    UNKNOWN(0),
    PINNED(1),
    NOT_PINNED(2),
    UNRECOGNIZED(-1);

    public final int a;

    d2t0(int i) {
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
