package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum wn10 implements v190 {
    FEATURED_CARD_MEDIA_TYPE_UNSPECIFIED(0),
    FEATURED_CARD_IMAGE(1),
    FEATURED_CARD_VIDEO(2),
    UNRECOGNIZED(-1);

    public final int a;

    wn10(int i) {
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
