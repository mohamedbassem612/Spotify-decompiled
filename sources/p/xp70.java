package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum xp70 implements v190 {
    SIZE_UNKNOWN(0),
    SIZE_DEFAULT(1),
    SIZE_SMALL(2),
    SIZE_LARGE(3),
    SIZE_XLARGE(4),
    UNRECOGNIZED(-1);

    public final int a;

    xp70(int i) {
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
