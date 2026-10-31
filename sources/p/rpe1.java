package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum rpe1 implements v190 {
    UNKNOWN(0),
    STATIC(1),
    SYLLABLE_SYNCED(2),
    SENTENCE_SYNCED(3),
    UNRECOGNIZED(-1);

    public final int a;

    rpe1(int i) {
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
