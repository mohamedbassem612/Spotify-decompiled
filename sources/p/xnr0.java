package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum xnr0 implements v190 {
    headline_large(0),
    headline_medium(1),
    title_large(3),
    title_medium(4),
    title_small(5),
    title_xsmall(17),
    body_medium(6),
    body_medium_bold(7),
    body_small(10),
    body_small_bold(11),
    marginal(13),
    marginal_bold(14),
    body_monospace(18),
    body_small_monospace(19),
    UNRECOGNIZED(-1);

    public final int a;

    xnr0(int i) {
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
