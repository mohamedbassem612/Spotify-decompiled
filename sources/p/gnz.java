package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum gnz implements v190 {
    INTERACTIVE(0),
    PREFETCH(1),
    OTHER(2),
    UNRECOGNIZED(-1);

    public final int a;

    gnz(int i) {
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
