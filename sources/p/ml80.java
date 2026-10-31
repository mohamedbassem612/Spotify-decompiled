package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum ml80 implements v190 {
    INSIGHT_TASTE_MATCH_TIER_UNSPECIFIED(0),
    INSIGHT_TASTE_MATCH_TIER_VERY_LOW(1),
    INSIGHT_TASTE_MATCH_TIER_LOW(2),
    INSIGHT_TASTE_MATCH_TIER_MEDIUM(3),
    INSIGHT_TASTE_MATCH_TIER_HIGH(4),
    INSIGHT_TASTE_MATCH_TIER_VERY_HIGH(5),
    UNRECOGNIZED(-1);

    public final int a;

    ml80(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
