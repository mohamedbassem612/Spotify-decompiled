package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum mek implements v190 {
    CARD_KIND_UNSPECIFIED(0),
    CARD_KIND_ROW(1),
    CARD_KIND_SMALL(2),
    CARD_KIND_LARGE(3),
    UNRECOGNIZED(-1);

    public final int a;

    mek(int i) {
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
