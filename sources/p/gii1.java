package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum gii1 implements v190 {
    USER_STATUS_UNSPECIFIED(0),
    USER_STATUS_ACTIVE(1),
    USER_STATUS_SUGGESTED_BUT_DISABLED(2),
    USER_STATUS_SUGGESTED(3),
    USER_STATUS_NOT_ACCEPTED(4),
    UNRECOGNIZED(-1);

    public final int a;

    gii1(int i) {
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
