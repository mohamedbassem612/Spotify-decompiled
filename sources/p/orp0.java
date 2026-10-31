package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum orp0 {
    SUCCESS(0),
    /* JADX INFO: Fake field, exist only in values array */
    OUT_OF_DISK_SPACE(8),
    /* JADX INFO: Fake field, exist only in values array */
    OFFLINE_EXPIRED(14),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_TRACKS(19),
    /* JADX INFO: Fake field, exist only in values array */
    OFFLINE_LICENSE_SERVER_ERROR(21),
    OFFLINE_NOT_ALLOWED(23),
    /* JADX INFO: Fake field, exist only in values array */
    OFFLINE_SYNC_CONNECTION_DISABLED(36),
    /* JADX INFO: Fake field, exist only in values array */
    OFFLINE_DEVICE_LIMIT_REACHED(7028),
    UNKNOWN(-1);

    public final int a;

    orp0(int i) {
        this.a = i;
    }
}
