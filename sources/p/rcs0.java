package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum rcs0 implements v190 {
    ENCORE_ICON_UNKNOWN(0),
    ENCORE_ICON_CHECK_ALT(1),
    ENCORE_ICON_UNDO(2),
    ENCORE_ICON_EXTERNAL_LINK(3),
    ENCORE_ICON_CAMERA(4),
    ENCORE_ICON_MESSAGES(5),
    UNRECOGNIZED(-1);

    public final int a;

    rcs0(int i2) {
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
