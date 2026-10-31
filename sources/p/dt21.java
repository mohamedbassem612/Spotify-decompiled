package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum dt21 implements v190 {
    RESOLUTION_FAILURE_REASON_UNSPECIFIED(0),
    RESOLUTION_FAILURE_REASON_ELIGIBILITY_TIMEOUT(1),
    RESOLUTION_FAILURE_REASON_CONTENT_RESOLUTION_FAILED(2),
    RESOLUTION_FAILURE_REASON_INTERNAL_ERROR(3),
    UNRECOGNIZED(-1);

    public final int a;

    dt21(int i) {
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
