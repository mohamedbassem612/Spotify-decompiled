package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum trz implements v190 {
    UNKNOWN(0),
    MALE(1),
    FEMALE(2),
    NEUTRAL(3),
    UNRECOGNIZED(-1);

    public final int a;

    trz(int i) {
        this.a = i;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
