package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum fh5 implements v190 {
    ANSWER_SOURCE_UNSPECIFIED(0),
    ANSWER_SOURCE_PRESET(1),
    ANSWER_SOURCE_USER_PROFILE(2),
    ANSWER_SOURCE_USER(3),
    UNRECOGNIZED(-1);

    public final int a;

    fh5(int i) {
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
