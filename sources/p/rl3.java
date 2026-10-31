package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum rl3 implements v190 {
    ALIGNMENT_UNKNOWN(0),
    CENTER(1),
    LEADING(2),
    UNRECOGNIZED(-1);

    public final int a;

    rl3(int i) {
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
