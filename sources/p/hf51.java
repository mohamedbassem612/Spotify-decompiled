package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum hf51 implements v190 {
    FEED_SECTION_KIND_UNSPECIFIED(0),
    FEED_SECTION_KIND_GRID(1),
    FEED_SECTION_KIND_CAROUSEL(2),
    FEED_SECTION_KIND_LIST(3),
    FEED_SECTION_KIND_LIST_HERO(4),
    FEED_SECTION_KIND_LIST_WIDE(5),
    FEED_SECTION_KIND_LIST_DATE_LOCATION(6),
    UNRECOGNIZED(-1);

    public final int a;

    hf51(int i) {
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
