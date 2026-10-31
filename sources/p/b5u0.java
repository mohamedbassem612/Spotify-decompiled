package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum b5u0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    BOOMBOX(0),
    BETAMAX(1),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(2),
    UNRECOGNIZED(-1);

    public final int a;

    b5u0(int i) {
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
