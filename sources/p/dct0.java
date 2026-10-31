package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum dct0 implements v190 {
    PLAN_TIER_UNSPECIFIED(0),
    PLAN_TIER_FREE(1),
    PLAN_TIER_PREMIUM(2),
    PLAN_TIER_NEMO(3),
    PLAN_TIER_YOPLAIT(4),
    PLAN_TIER_ASTRO(5),
    UNRECOGNIZED(-1);

    public final int a;

    dct0(int i2) {
        this.a = i2;
    }

    public static dct0 a(int i2) {
        if (i2 == 0) {
            return PLAN_TIER_UNSPECIFIED;
        }
        if (i2 == 1) {
            return PLAN_TIER_FREE;
        }
        if (i2 == 2) {
            return PLAN_TIER_PREMIUM;
        }
        if (i2 == 3) {
            return PLAN_TIER_NEMO;
        }
        if (i2 == 4) {
            return PLAN_TIER_YOPLAIT;
        }
        if (i2 != 5) {
            return null;
        }
        return PLAN_TIER_ASTRO;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
