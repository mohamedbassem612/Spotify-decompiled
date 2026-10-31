package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum pfc implements v190 {
    PRIMARY(0),
    SECONDARY(1),
    TERTIARY(2),
    UNRECOGNIZED(-1);

    public final int a;

    pfc(int i) {
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
