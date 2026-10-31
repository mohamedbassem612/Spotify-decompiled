package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum tz70 implements v190 {
    IMAGE_SIZE_UNSPECIFIED(0),
    IMAGE_SIZE_DEFAULT(1),
    IMAGE_SIZE_SMALL(2),
    IMAGE_SIZE_LARGE(3),
    IMAGE_SIZE_XLARGE(4),
    UNRECOGNIZED(-1);

    public final int a;

    tz70(int i) {
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
