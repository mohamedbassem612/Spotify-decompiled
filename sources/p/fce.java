package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum fce implements v190 {
    OUTCOME_UNSPECIFIED(0),
    DRAW(1),
    WIN(2),
    LOSS(3),
    PERFECT_TIE(4),
    UNRECOGNIZED(-1);

    public final int a;

    fce(int i) {
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
