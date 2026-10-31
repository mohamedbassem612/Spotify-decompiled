package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum atm1 implements v190 {
    UNKNOWN(0),
    NO(1),
    YES(2),
    DOWNLOADING(3),
    WAITING(4),
    UNRECOGNIZED(-1);

    public final int a;

    atm1(int i) {
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
