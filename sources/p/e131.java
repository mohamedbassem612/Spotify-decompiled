package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum e131 implements v190 {
    NONE(0),
    IS_EXPLICIT(1),
    IS_19_PLUS(2),
    UNRECOGNIZED(-1);

    public final int a;

    e131(int i) {
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
