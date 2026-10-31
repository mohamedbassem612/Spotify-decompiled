package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum n4w0 implements v190 {
    UNSPECIFIED(0),
    PERSONALIZED(1),
    TOP_PRESAVED(2),
    UNRECOGNIZED(-1);

    public final int a;

    n4w0(int i) {
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
