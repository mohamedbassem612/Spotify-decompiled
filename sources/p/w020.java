package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum w020 implements v190 {
    UNKNOWN(0),
    NETWORK(1),
    LOCALCACHE(2),
    UNRECOGNIZED(-1);

    public final int a;

    w020(int i) {
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
