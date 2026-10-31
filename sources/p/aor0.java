package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum aor0 implements v190 {
    story_card_unspecified(0),
    headline_large(1),
    headline_medium(2),
    title_large(3),
    title_medium(4),
    title_small(5),
    title_xsmall(6),
    body_medium(7),
    body_medium_bold(8),
    body_small(9),
    body_small_bold(10),
    marginal(11),
    marginal_bold(12),
    body_monospace(13),
    body_small_monospace(14),
    UNRECOGNIZED(-1);

    public final int a;

    aor0(int i) {
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
