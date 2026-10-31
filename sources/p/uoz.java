package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum uoz implements v190 {
    SUCCESS(0),
    GENERIC(1),
    DISK_FULL(8),
    EXPIRED(14),
    TOO_MANY_TRACKS(19),
    NOT_ALLOWED(23),
    CONNECTION_DISABLED(36),
    DEVICE_LIMIT_REACHED(7028),
    UNRECOGNIZED(-1);

    public final int a;

    uoz(int i) {
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
