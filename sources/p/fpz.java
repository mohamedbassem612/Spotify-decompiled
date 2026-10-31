package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum fpz implements v190 {
    TRACK_TOTALS_STATE_UNSPECIFIED(0),
    TRACK_TOTALS_STATE_RESOLVING(1),
    TRACK_TOTALS_STATE_RESOLVED(2),
    UNRECOGNIZED(-1);

    public final int a;

    fpz(int i) {
        this.a = i;
    }

    public static fpz a(int i) {
        if (i == 0) {
            return TRACK_TOTALS_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return TRACK_TOTALS_STATE_RESOLVING;
        }
        if (i != 2) {
            return null;
        }
        return TRACK_TOTALS_STATE_RESOLVED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
