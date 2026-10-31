package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum ypz implements v190 {
    IMMEDIATELY(0),
    ADVANCED_PAST_TRACK(1),
    ADVANCED_PAST_CONTEXT(2),
    UNRECOGNIZED(-1);

    public final int a;

    ypz(int i) {
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
