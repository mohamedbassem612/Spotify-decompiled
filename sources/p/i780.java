package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum i780 implements v190 {
    INACCESSIBLE_REASON_UNSPECIFIED(0),
    REQUIRES_PREMIUM(1),
    UNRECOGNIZED(-1);

    public final int a;

    i780(int i) {
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
