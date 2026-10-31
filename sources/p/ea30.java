package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum ea30 implements v190 {
    BODY_MEDIUM(0),
    BODY_MEDIUM_BOLD(1),
    TITLE_LARGE(2),
    HEADLINE_MEDIUM_BLACK_WIDE(3),
    HEADLINE_MEDIUM_MEDIUM_WIDE(4),
    TITLE_LARGE_BLACK_WIDE(5),
    TITLE_LARGE_MEDIUM_WIDE(6),
    TITLE_SMALL_MEDIUM_WIDE(7),
    TITLE_SMALL_BLACK_WIDE(8),
    UNRECOGNIZED(-1);

    public final int a;

    ea30(int i) {
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
