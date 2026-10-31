package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum l960 implements v190 {
    UNSPECIFIED__OVERLAP_STYLE(0),
    LINEAR(1),
    DIAGONAL(2),
    UNRECOGNIZED(-1);

    public final int a;

    l960(int i) {
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
