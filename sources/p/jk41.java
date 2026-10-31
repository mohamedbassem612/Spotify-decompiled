package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum jk41 implements v190 {
    STANDARD_VARIATION_UNSPECIFIED(0),
    UNIFORM(1),
    SCALED(2),
    TILTED(3),
    UNRECOGNIZED(-1);

    public final int a;

    jk41(int i) {
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
