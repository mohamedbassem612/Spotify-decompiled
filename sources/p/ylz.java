package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum ylz implements v190 {
    OS_INTERNET_VALIDATION_UNKNOWN(0),
    OS_INTERNET_VALIDATED(1),
    OS_INTERNET_NOT_VALIDATED(2),
    UNRECOGNIZED(-1);

    public final int a;

    ylz(int i) {
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
