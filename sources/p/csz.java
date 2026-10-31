package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum csz implements v190 {
    BEARER_WIFI(0),
    BEARER_CELLULAR(1),
    BEARER_UNKNOWN(2),
    UNRECOGNIZED(-1);

    public final int a;

    csz(int i) {
        this.a = i;
    }

    public static csz a(int i) {
        if (i == 0) {
            return BEARER_WIFI;
        }
        if (i == 1) {
            return BEARER_CELLULAR;
        }
        if (i != 2) {
            return null;
        }
        return BEARER_UNKNOWN;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
