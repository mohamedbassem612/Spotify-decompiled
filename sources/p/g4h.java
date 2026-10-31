package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum g4h implements v190 {
    UNKNOWN(0),
    SCAN_PRESENT(1),
    SCAN_SKIPPED(2),
    UNRECOGNIZED(-1);

    public final int a;

    g4h(int i) {
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
