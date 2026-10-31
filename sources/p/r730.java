package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum r730 implements v190 {
    NONE(0),
    CAN_BE_FOLLOWED(1),
    CAN_BE_UNFOLLOWED(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    r730(int i) {
        this.a = i;
    }

    public static r730 a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return CAN_BE_FOLLOWED;
        }
        if (i != 2) {
            return null;
        }
        return CAN_BE_UNFOLLOWED;
    }

    public final int getNumber() {
        return this.a;
    }
}
