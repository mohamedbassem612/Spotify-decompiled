package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum lm implements v190 {
    ACCOUNT_KIND_UNSPECIFIED(0),
    ACCOUNT_KIND_CHILD(1),
    ACCOUNT_KIND_TEEN(2),
    UNRECOGNIZED(-1);

    public final int a;

    lm(int i) {
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
