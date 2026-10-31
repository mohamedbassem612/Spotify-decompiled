package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum py implements v190 {
    ACT_UNKNOWN(0),
    ACT_HEADLINER(1),
    ACT_SUPPORTING(2),
    UNRECOGNIZED(-1);

    public final int a;

    py(int i) {
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
