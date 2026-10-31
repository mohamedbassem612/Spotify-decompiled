package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum igc1 implements v190 {
    STREAMING_RULE_NONE(0),
    STREAMING_RULE_DMCA_RADIO(1),
    STREAMING_RULE_PREVIEW(2),
    STREAMING_RULE_WIFI(3),
    STREAMING_RULE_SHUFFLE_MODE(4),
    STREAMING_RULE_TABLET_FREE(5),
    UNRECOGNIZED(-1);

    public final int a;

    igc1(int i2) {
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
