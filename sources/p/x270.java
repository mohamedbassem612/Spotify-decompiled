package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum x270 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    READINESS_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    READY(1),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_READY(2),
    /* JADX INFO: Fake field, exist only in values array */
    FAILED(3),
    UNRECOGNIZED(-1);

    public final int a;

    x270(int i) {
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
