package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum y15 implements v190 {
    ANDROID_STANDBY_BUCKET_UNSPECIFIED(0),
    ANDROID_STANDBY_BUCKET_ACTIVE(1),
    ANDROID_STANDBY_BUCKET_WORKING_SET(2),
    ANDROID_STANDBY_BUCKET_FREQUENT(3),
    ANDROID_STANDBY_BUCKET_RARE(4),
    ANDROID_STANDBY_BUCKET_RESTRICTED(5),
    UNRECOGNIZED(-1);

    public final int a;

    y15(int i2) {
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
