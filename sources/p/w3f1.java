package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum w3f1 implements v190 {
    TOOLTIP_ALIGNMENT_UNKNOWN(0),
    TOOLTIP_ALIGNMENT_HORIZONTAL(1),
    TOOLTIP_ALIGNMENT_STACKED(2),
    UNRECOGNIZED(-1);

    public final int a;

    w3f1(int i) {
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
