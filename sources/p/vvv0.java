package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum vvv0 implements v190 {
    UNKNOWN(0),
    RECURRING_MONTHLY(1),
    TRIAL(2),
    PREPAID(3),
    UNRECOGNIZED(-1);

    public final int a;

    vvv0(int i) {
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
