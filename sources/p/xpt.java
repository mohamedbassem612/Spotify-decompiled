package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum xpt implements v190 {
    DEVICE_CAPABILITY_UNSPECIFIED(0),
    DEVICE_CAPABILITY_INLINE_UPSELL(1),
    DEVICE_CAPABILITY_BOTTOMSHEET_UPSELL(2),
    DEVICE_CAPABILITY_GENERIC_CONSIDERATION_PAGE(3),
    DEVICE_CAPABILITY_SIGNIFIER(4),
    DEVICE_CAPABILITY_BOTTOM_SHEET_MEDIA(5),
    UNRECOGNIZED(-1);

    public final int a;

    xpt(int i2) {
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
