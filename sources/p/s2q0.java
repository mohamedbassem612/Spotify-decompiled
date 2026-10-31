package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum s2q0 implements v190 {
    UNKNOWN(0),
    NOT_ON_DEMAND(1),
    ON_DEMAND(2),
    ON_DEMAND_EPISODES_ONLY(3),
    ON_DEMAND_NON_MUSIC_ONLY(4);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    s2q0(int i) {
        this.a = i;
    }

    public static s2q0 a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NOT_ON_DEMAND;
        }
        if (i == 2) {
            return ON_DEMAND;
        }
        if (i == 3) {
            return ON_DEMAND_EPISODES_ONLY;
        }
        if (i != 4) {
            return null;
        }
        return ON_DEMAND_NON_MUSIC_ONLY;
    }

    public final int getNumber() {
        return this.a;
    }
}
