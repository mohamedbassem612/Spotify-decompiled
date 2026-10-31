package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum mi implements v190 {
    ACCESSORY_CONTENT_SIZE_UNKNOWN(0),
    ACCESSORY_CONTENT_SIZE_LARGE(1),
    ACCESSORY_CONTENT_SIZE_MEDIUM(2),
    ACCESSORY_CONTENT_SIZE_SMALL(3),
    ACCESSORY_CONTENT_SIZE_XSMALL(4),
    UNRECOGNIZED(-1);

    public final int a;

    mi(int i) {
        this.a = i;
    }

    public static mi a(int i) {
        if (i == 0) {
            return ACCESSORY_CONTENT_SIZE_UNKNOWN;
        }
        if (i == 1) {
            return ACCESSORY_CONTENT_SIZE_LARGE;
        }
        if (i == 2) {
            return ACCESSORY_CONTENT_SIZE_MEDIUM;
        }
        if (i == 3) {
            return ACCESSORY_CONTENT_SIZE_SMALL;
        }
        if (i != 4) {
            return null;
        }
        return ACCESSORY_CONTENT_SIZE_XSMALL;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
