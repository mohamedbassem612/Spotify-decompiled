package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum cj51 implements v190 {
    SECTION_TYPE_DEFAULT(0),
    SECTION_TYPE_SHELF(1),
    SECTION_TYPE_CATEGORIES(2),
    SECTION_TYPE_WATCH_FEED(3),
    SECTION_TYPE_VIDEO_RECOMMENDATIONS(4),
    SECTION_TYPE_SEE_OTHER(5),
    SECTION_TYPE_SINGLE_CONTENT_COMPONENT(6),
    UNRECOGNIZED(-1);

    public final int a;

    cj51(int i) {
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
