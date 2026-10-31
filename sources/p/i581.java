package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum i581 implements v190 {
    SHOW_GATED_VALUE_PROP_UNKNOWN(0),
    SHOW_GATED_VALUE_PROP_UNSPECIFIED(1),
    SHOW_GATED_VALUE_PROP_AD_FREE(2),
    SHOW_GATED_VALUE_PROP_EXTENDED(3),
    SHOW_GATED_VALUE_PROP_EARLY_ACCESS(4),
    SHOW_GATED_VALUE_PROP_VIDEO(5),
    SHOW_GATED_VALUE_PROP_FULL_LENGTH_EPISODES(6),
    SHOW_GATED_VALUE_PROP_BONUS(7),
    UNRECOGNIZED(-1);

    public final int a;

    i581(int i) {
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
