package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum cjf1 implements v190 {
    TRACK_CLASSIFICATION_UNKNOWN(0),
    TRACK_CLASSIFICATION_PERFORMANCE(1),
    TRACK_CLASSIFICATION_MTV(2),
    UNRECOGNIZED(-1);

    public final int a;

    cjf1(int i) {
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
