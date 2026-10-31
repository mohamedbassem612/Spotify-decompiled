package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum tqe1 implements v190 {
    BEHAVIOR_UNSPECIFIED(0),
    EXTERNAL_PURCHASE(1),
    CURATE(2),
    CANT_ATTEND(3),
    NOT_INTERESTED(4),
    SEE_ALL_SHOWS(5),
    NAVIGATE(6),
    SHARE(7),
    UNRECOGNIZED(-1);

    public final int a;

    tqe1(int i) {
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
