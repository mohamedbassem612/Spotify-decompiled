package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum osz implements v190 {
    FETCH_TYPE_UNKNOWN(0),
    FETCH_TYPE_NETWORK(1),
    FETCH_TYPE_LOCAL_CACHE(2),
    UNRECOGNIZED(-1);

    public final int a;

    osz(int i) {
        this.a = i;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
