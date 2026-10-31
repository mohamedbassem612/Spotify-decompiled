package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum g4l implements v190 {
    UNKNOWN_ERROR(0),
    TIMEOUT(1),
    INTERNAL(2),
    GROUP_DEVICE_NOT_FOUND(3),
    MAX_NUMBER_OF_DEVICES_REACHED(4),
    TARGET_NOT_FOUND(5),
    NOT_IMPLEMENTED(6),
    BUSY(13),
    UNRECOGNIZED(-1);

    public final int a;

    g4l(int i) {
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
