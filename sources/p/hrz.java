package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum hrz implements v190 {
    BACKEND_RPC_GLOBAL(0),
    BACKEND_RPC_REGIONAL(1),
    /* JADX INFO: Fake field, exist only in values array */
    BACKEND_STREAMING(2),
    UNRECOGNIZED(-1);

    public final int a;

    hrz(int i) {
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
