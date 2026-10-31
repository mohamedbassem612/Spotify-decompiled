package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum btw0 implements v190 {
    DEFAULT_TIER(0),
    PREMIUM_TIER(1),
    BASIC_TIER(3),
    PREMIUM_LITE_TIER(4),
    PREMIUM_MINI_TIER(5),
    PREMIUM_BASIC_TIER(6),
    AUDIOBOOK_ACCESS_TIER(8),
    NO_FREE_TIER(9),
    UNKNOWN_TIER(10),
    MFT_TIER(11),
    MFT_PLUS_TIER(12),
    FREE_TIER_DISABLED_TIER(13),
    ON_DEMAND_TRIAL_TIER(14),
    PLATINUM_TIER(15),
    LITE_TIER(18),
    STANDARD_TIER(19),
    BASIC_PLATINUM_TIER(20),
    UNRECOGNIZED(-1);

    public final int a;

    btw0(int i) {
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
