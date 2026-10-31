package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum ru4 implements v190 {
    ANDROID_NOTIFICATION_PERMISSION_UNSPECIFIED(0),
    ANDROID_NOTIFICATION_PERMISSION_NOT_DETERMINED(1),
    ANDROID_NOTIFICATION_PERMISSION_ENABLED(2),
    ANDROID_NOTIFICATION_PERMISSION_DENIED(3),
    ANDROID_NOTIFICATION_PERMISSION_DENIED_CAN_REQUEST_INLINE(4),
    ANDROID_NOTIFICATION_PERMISSION_DENIED_EXPLICIT(5),
    UNRECOGNIZED(-1);

    public final int a;

    ru4(int i2) {
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
