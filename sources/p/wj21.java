package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum wj21 implements v190 {
    ANSWER_STATE_UNSPECIFIED(0),
    CORRECT(1),
    WRONG(2),
    TIME_RAN_OUT(3),
    UNRECOGNIZED(-1);

    public final int a;

    wj21(int i) {
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
