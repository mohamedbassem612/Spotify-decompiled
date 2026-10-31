package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum kjh0 implements v190 {
    MEDIA_CARD_MEDIA_TYPE_UNSPECIFIED(0),
    IMAGE(1),
    CANVAS(2),
    UNRECOGNIZED(-1);

    public final int a;

    kjh0(int i) {
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
