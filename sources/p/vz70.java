package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum vz70 implements v190 {
    IMAGE_SIZE_UNSPECIFIED(0),
    IMAGE_SIZE_SMALL(1),
    IMAGE_SIZE_DEFAULT(2),
    IMAGE_SIZE_LARGE(3),
    IMAGE_SIZE_XLARGE(4),
    IMAGE_SIZE_XXLARGE(5),
    UNRECOGNIZED(-1);

    public final int a;

    vz70(int i2) {
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
