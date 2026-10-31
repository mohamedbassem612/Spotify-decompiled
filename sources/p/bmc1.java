package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum bmc1 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_PROVIDER_UNKNOWN(0),
    BILLING_PROVIDER_GPB(1),
    BILLING_PROVIDER_SPOTIFY(2),
    UNRECOGNIZED(-1);

    public final int a;

    bmc1(int i) {
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
