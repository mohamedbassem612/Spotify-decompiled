package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum b1z0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    SUBSCRIPTION_STATUS_NONE(0),
    SUBSCRIPTION_STATUS_PAYWALLED(1),
    SUBSCRIPTION_STATUS_AVAILABLE(2),
    UNRECOGNIZED(-1);

    public final int a;

    b1z0(int i) {
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
