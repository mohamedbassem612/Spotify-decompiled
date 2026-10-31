package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum mmz implements v190 {
    UNKNOWN(0),
    DEFAULT(1),
    PARROT(2),
    UNRECOGNIZED(-1);

    public final int a;

    mmz(int i) {
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
