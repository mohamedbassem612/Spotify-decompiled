package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum tnz implements v190 {
    UNKNOWN(0),
    LOCAL_FILE(1),
    CACHE(2),
    NETWORK(3),
    UNRECOGNIZED(-1);

    public final int a;

    tnz(int i) {
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
