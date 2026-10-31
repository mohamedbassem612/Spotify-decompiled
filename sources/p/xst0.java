package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum xst0 implements v190 {
    PLAYABILITY_VERDICT_UNSPECIFIED(0),
    PLAYABILITY_VERDICT_PLAYABLE(1),
    PLAYABILITY_VERDICT_COUNTRY_RESTRICTED(2),
    PLAYABILITY_VERDICT_CATALOGUE_RESTRICTED(3),
    PLAYABILITY_VERDICT_UNAVAILABLE(4),
    UNRECOGNIZED(-1);

    public final int a;

    xst0(int i) {
        this.a = i;
    }

    public static xst0 a(int i) {
        if (i == 0) {
            return PLAYABILITY_VERDICT_UNSPECIFIED;
        }
        if (i == 1) {
            return PLAYABILITY_VERDICT_PLAYABLE;
        }
        if (i == 2) {
            return PLAYABILITY_VERDICT_COUNTRY_RESTRICTED;
        }
        if (i == 3) {
            return PLAYABILITY_VERDICT_CATALOGUE_RESTRICTED;
        }
        if (i != 4) {
            return null;
        }
        return PLAYABILITY_VERDICT_UNAVAILABLE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
