package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum j860 implements v190 {
    HIDDEN_STATE_UNSPECIFIED(0),
    VISIBLE_CAN_HIDE(1),
    HIDDEN_CAN_UNHIDE(2),
    NOT_ELIGIBLE(3),
    UNRECOGNIZED(-1);

    public final int a;

    j860(int i) {
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
