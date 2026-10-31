package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum ik41 implements v190 {
    IMAGE_LAYOUT_UNSPECIFIED(0),
    IMAGE_LAYOUT_SINGLE(1),
    IMAGE_LAYOUT_IDENTITY(2),
    IMAGE_LAYOUT_MULTI_3(3),
    IMAGE_LAYOUT_MULTI_4(4),
    UNRECOGNIZED(-1);

    public final int a;

    ik41(int i) {
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
