package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum p7d1 implements v190 {
    SURVEY_QUESTION_TYPE_UNKNOWN(0),
    SINGLE_SELECT(1),
    MULTI_SELECT(2),
    UNRECOGNIZED(-1);

    public final int a;

    p7d1(int i) {
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
