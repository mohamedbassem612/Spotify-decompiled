package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum w461 implements v190 {
    RATING_UNSPECIFIED(0),
    RATING_LIKE(1),
    RATING_DISLIKE(2),
    UNRECOGNIZED(-1);

    public final int a;

    w461(int i) {
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
