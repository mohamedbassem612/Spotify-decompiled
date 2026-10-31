package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum io21 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_DECISION_UNSPECIFIED(0),
    REQUEST_DECISION_APPROVED(1),
    REQUEST_DECISION_DENIED(2),
    REQUEST_DECISION_RESET(3),
    UNRECOGNIZED(-1);

    public final int a;

    io21(int i) {
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
