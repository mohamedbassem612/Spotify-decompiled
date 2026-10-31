package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum bjf1 implements v190 {
    CONTENT_ACCESS_NONE(0),
    CONTENT_ACCESS_WINDOWING(1),
    CONTENT_ACCESS_GATED(2),
    UNRECOGNIZED(-1);

    public final int a;

    bjf1(int i) {
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
