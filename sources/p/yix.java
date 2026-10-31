package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum yix implements v190 {
    UNKNOWN_FONT(0),
    HEADLINE_LARGE(1),
    HEADLINE_MEDIUM(2),
    TITLE_LARGE(3),
    TITLE_MEDIUM(4),
    TITLE_SMALL(5),
    BODY_MEDIUM(6),
    BODY_MEDIUM_BOLD(7),
    BODY_SMALL(8),
    BODY_SMALL_BOLD(9),
    MARGINAL(10),
    MARGINAL_BOLD(11),
    UNRECOGNIZED(-1);

    public final int a;

    yix(int i) {
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
