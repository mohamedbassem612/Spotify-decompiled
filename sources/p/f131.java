package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum f131 implements v190 {
    UNKNOWN_RESTRICTION(0),
    FILTER_EXPLICIT_CONTENT(1),
    UNRECOGNIZED(-1);

    public final int a;

    f131(int i) {
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
