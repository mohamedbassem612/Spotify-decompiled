package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum yn70 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    AUDIENCE_UNSPECIFIED(0),
    AUDIENCE_LOGIN5(1),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIENCE_ACCOUNTS_SSO(2),
    UNRECOGNIZED(-1);

    public final int a;

    yn70(int i) {
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
