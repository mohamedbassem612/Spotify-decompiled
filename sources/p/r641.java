package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum r641 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    SAMPLES_OR_COVERS_ISSUE_UNSPECIFIED(0),
    SAMPLES_OR_COVERS_ISSUE_MISSING_SAMPLE_OR_INTERPOLATION(1),
    SAMPLES_OR_COVERS_ISSUE_INCORRECT_SAMPLE_OR_INTERPOLATION(2),
    SAMPLES_OR_COVERS_ISSUE_MISSING_ORIGINAL_SONG(3),
    SAMPLES_OR_COVERS_ISSUE_INCORRECT_ORIGINAL_SONG(4),
    SAMPLES_OR_COVERS_ISSUE_OTHER(5),
    UNRECOGNIZED(-1);

    public final int a;

    r641(int i) {
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
