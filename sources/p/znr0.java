package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum znr0 implements v190 {
    share_card_unspecified(0),
    share_headline_large(1),
    share_headline_medium(2),
    share_headline_small(3),
    share_headline_tiny_bold(4),
    share_headline_tiny(5),
    share_body_title_bold(6),
    share_body_title(7),
    share_body_deco(8),
    share_body_bold(9),
    share_body(10),
    numerals(11),
    UNRECOGNIZED(-1);

    public final int a;

    znr0(int i) {
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
