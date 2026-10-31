package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum mpz implements v190 {
    EMPTY(0),
    TRACK(1),
    EPISODE(2),
    UNRECOGNIZED(-1);

    public final int a;

    mpz(int i) {
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
