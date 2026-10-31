package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum ntd1 implements v190 {
    TASTE_MATCH_TYPE_UNSPECIFIED(0),
    TASTE_MATCH_TYPE_TASTE_MATCH(1),
    TASTE_MATCH_TYPE_LEAST_TASTE_MATCH(2),
    TASTE_MATCH_TYPE_MOST_TASTE_MATCH(3),
    UNRECOGNIZED(-1);

    public final int a;

    ntd1(int i) {
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
