package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum t0i1 implements v190 {
    UPSELL_RESULT_UNSPECIFIED(0),
    UPSELL_RESULT_HAS_UPSELL(1),
    UPSELL_RESULT_NO_UPSELL(2),
    UNRECOGNIZED(-1);

    public final int a;

    t0i1(int i) {
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
