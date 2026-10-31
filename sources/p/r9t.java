package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum r9t implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    DELETION_POLICY_UNSPECIFIED(0),
    DELETION_POLICY_ALL(1),
    /* JADX INFO: Fake field, exist only in values array */
    DELETION_POLICY_SELF(2),
    UNRECOGNIZED(-1);

    public final int a;

    r9t(int i) {
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
