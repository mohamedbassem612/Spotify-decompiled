package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum qn10 implements v190 {
    FEATURE_REQUEST_ACTION_UNSPECIFIED(0),
    FEATURE_REQUEST_ACTION_REQUEST_FEATURE(1),
    UNRECOGNIZED(-1);

    public final int a;

    qn10(int i) {
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
