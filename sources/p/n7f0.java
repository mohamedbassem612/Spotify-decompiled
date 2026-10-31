package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum n7f0 implements v190 {
    UNSPECIFIED(0),
    ARTWORK(1),
    FULL_SCREEN(2),
    UNRECOGNIZED(-1);

    public final int a;

    n7f0(int i) {
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
