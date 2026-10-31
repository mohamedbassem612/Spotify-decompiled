package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum k79 implements v190 {
    AUTOMATION_VALUE_KIND_UNSPECIFIED(0),
    AUTOMATION_VALUE_KIND_LINEAR_GAIN(1),
    AUTOMATION_VALUE_KIND_EQ_GAIN(2),
    AUTOMATION_VALUE_KIND_FILTER_CUTOFF(3),
    AUTOMATION_VALUE_KIND_DRY_WET(4),
    AUTOMATION_VALUE_KIND_NOISE_COLOR(5),
    UNRECOGNIZED(-1);

    public final int a;

    k79(int i2) {
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
