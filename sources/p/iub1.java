package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum iub1 implements v190 {
    INVALID_STATUS_CODE(0),
    SUCCESS(1),
    EVENT_SENDER_ERROR(2),
    INVALID_STREAM_HANDLE(3),
    PENDING_EVENTS_ERROR(4),
    IGNORED(5),
    UNRECOGNIZED(-1);

    public final int a;

    iub1(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
