package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum hjg1 implements v190 {
    TRANSITION_MODE_UNSPECIFIED(0),
    TRANSITION_MODE_INSTANT(1),
    TRANSITION_MODE_SEAMLESS(2),
    UNRECOGNIZED(-1);

    public final int a;

    hjg1(int i) {
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
