package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum rqz implements v190 {
    FORCED_OFFLINE(0),
    NO_INTERNET(1),
    UNRECOGNIZED(-1);

    public final int a;

    rqz(int i) {
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
