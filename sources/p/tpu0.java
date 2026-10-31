package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum tpu0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    NONE(0),
    SET_AS_AVAILABLE_OFFLINE(1),
    REMOVE_AS_AVAILABLE_OFFLINE(2),
    UNRECOGNIZED(-1);

    public final int a;

    tpu0(int i) {
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
