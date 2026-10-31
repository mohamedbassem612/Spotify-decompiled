package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum s4l implements v190 {
    UNKNOWN_ERROR(0),
    TIMEOUT(1),
    INTERNAL(2),
    GROUP_DEVICE_NOT_FOUND(3),
    TARGET_NOT_FOUND(4),
    NOT_IMPLEMENTED(5),
    BUSY(12),
    UNRECOGNIZED(-1);

    public final int a;

    s4l(int i) {
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
