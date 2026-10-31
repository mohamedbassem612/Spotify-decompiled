package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum w270 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    FAILURE_REASON_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    FAILURE_REASON_TRANSCODE_ERROR(1),
    /* JADX INFO: Fake field, exist only in values array */
    FAILURE_REASON_CONTENT_REMOVAL(2),
    /* JADX INFO: Fake field, exist only in values array */
    FAILURE_REASON_TIMEOUT(3),
    /* JADX INFO: Fake field, exist only in values array */
    FAILURE_REASON_UPLOAD_FAILED(4),
    UNRECOGNIZED(-1);

    public final int a;

    w270(int i) {
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
