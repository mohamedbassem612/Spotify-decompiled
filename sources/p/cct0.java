package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum cct0 implements v190 {
    PLAN_TIER_UNSPECIFIED(0),
    PLAN_TIER_FREE(1),
    PLAN_TIER_PREMIUM(2),
    PLAN_TIER_NEMO(3),
    UNRECOGNIZED(-1);

    public final int a;

    cct0(int i) {
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
