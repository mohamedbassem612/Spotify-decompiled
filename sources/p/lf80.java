package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum lf80 implements v190 {
    UNKNOWN(0),
    MESSAGING_AUDIOBOOK_SUBFEED(1),
    UNRECOGNIZED(-1);

    public final int a;

    lf80(int i) {
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
