package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum n4l implements v190 {
    OUTPUT_PERIPHERAL_CATEGORY_UNKNOWN(0),
    OUTPUT_PERIPHERAL_CATEGORY_CAR(1),
    OUTPUT_PERIPHERAL_CATEGORY_HEADPHONES(2),
    OUTPUT_PERIPHERAL_CATEGORY_SPEAKER(3),
    OUTPUT_PERIPHERAL_CATEGORY_WEARABLE(4),
    OUTPUT_PERIPHERAL_CATEGORY_GLASSES(5),
    OUTPUT_PERIPHERAL_CATEGORY_APP(6),
    UNRECOGNIZED(-1);

    public final int a;

    n4l(int i) {
        this.a = i;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
