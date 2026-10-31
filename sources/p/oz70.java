package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum oz70 implements v190 {
    IMAGE_SHAPE_UNKNOWN(0),
    IMAGE_SHAPE_SQUARE(1),
    IMAGE_SHAPE_ROUND(2),
    UNRECOGNIZED(-1);

    public final int a;

    oz70(int i) {
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
