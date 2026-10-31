package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum xqz0 implements v190 {
    RANK_DIRECTION_SAME(0),
    RANK_DIRECTION_UP(1),
    RANK_DIRECTION_DOWN(2),
    UNRECOGNIZED(-1);

    public final int a;

    xqz0(int i) {
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
