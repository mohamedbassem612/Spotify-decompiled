package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum w37 implements v190 {
    ARTWORK_ROLE_UNSPECIFIED(0),
    ARTWORK_ROLE_SQUARE_COVER(1),
    ARTWORK_ROLE_SIXTEEN_BY_NINE_COVER(2),
    UNRECOGNIZED(-1);

    public final int a;

    w37(int i) {
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
