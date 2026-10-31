package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum s8i0 implements v190 {
    MEDIA_TYPE_UNSPECIFIED(0),
    MEDIA_TYPE_IMAGE(1),
    MEDIA_TYPE_VIDEO(2),
    UNRECOGNIZED(-1);

    public final int a;

    s8i0(int i) {
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
