package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum kax implements v190 {
    ENABLED_STATE_UNSPECIFIED(0),
    ENABLED_STATE_TRUE(1),
    ENABLED_STATE_FALSE(2),
    UNRECOGNIZED(-1);

    public final int a;

    kax(int i) {
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
