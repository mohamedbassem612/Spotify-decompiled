package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum htf0 implements v190 {
    UNSYNCED(0),
    LINE_SYNCED(1),
    RICH_SYNCED(2),
    UNRECOGNIZED(-1);

    public final int a;

    htf0(int i) {
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
