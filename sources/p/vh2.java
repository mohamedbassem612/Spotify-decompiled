package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum vh2 implements v190 {
    AGE_RATING_UNSPECIFIED(0),
    AGE_RATING_Y(1),
    AGE_RATING_G(2),
    AGE_RATING_PG(3),
    AGE_RATING_PG13(4),
    AGE_RATING_R(5),
    UNRECOGNIZED(-1);

    public final int a;

    vh2(int i2) {
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
