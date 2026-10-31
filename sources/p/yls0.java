package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum yls0 implements v190 {
    PERMISSION_LEVEL_STATE_UNSPECIFIED(0),
    PERMISSION_LEVEL_STATE_PENDING(1),
    PERMISSION_LEVEL_STATE_ACCEPTED(2),
    PERMISSION_LEVEL_STATE_REJECTED(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    yls0(int i) {
        this.a = i;
    }

    public static yls0 a(int i) {
        if (i == 0) {
            return PERMISSION_LEVEL_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return PERMISSION_LEVEL_STATE_PENDING;
        }
        if (i == 2) {
            return PERMISSION_LEVEL_STATE_ACCEPTED;
        }
        if (i != 3) {
            return null;
        }
        return PERMISSION_LEVEL_STATE_REJECTED;
    }

    public final int getNumber() {
        return this.a;
    }
}
