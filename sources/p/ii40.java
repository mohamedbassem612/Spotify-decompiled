package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum ii40 implements v190 {
    UNKNOWN(0),
    DEFAULT(1),
    CONTENT(2),
    UNRECOGNIZED(-1);

    public final int a;

    ii40(int i) {
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
