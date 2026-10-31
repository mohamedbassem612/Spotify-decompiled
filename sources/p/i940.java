package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum i940 implements v190 {
    GATING_INDICATOR_UNSPECIFIED(0),
    GATING_INDICATOR_PREMIUM(1),
    UNRECOGNIZED(-1);

    public final int a;

    i940(int i) {
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
