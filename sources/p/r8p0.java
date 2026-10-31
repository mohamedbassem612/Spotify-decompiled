package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum r8p0 implements v190 {
    CONTROLS_MODE_OVERRIDE_UNSPECIFIED(0),
    CONTROLS_MODE_OVERRIDE_CHAPTER_SKIP_ENABLED(1),
    CONTROLS_MODE_OVERRIDE_NPV_CONTENT_LAYER_TAP_SKIP_15S(2),
    UNRECOGNIZED(-1);

    public final int a;

    r8p0(int i) {
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
