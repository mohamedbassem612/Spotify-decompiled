package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum ysg0 implements v190 {
    PLAYED(0),
    UNPLAYED(1),
    UNRECOGNIZED(-1);

    public final int a;

    ysg0(int i) {
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
