package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum jtm1 implements v190 {
    MESSAGE_STATUS_UNKNOWN(0),
    MESSAGE_STATUS_SUCCESS(1),
    MESSAGE_STATUS_QUEUED(2),
    MESSAGE_STATUS_PROCESSING(3),
    MESSAGE_STATUS_ERROR(4),
    UNRECOGNIZED(-1);

    public final int a;

    jtm1(int i) {
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
