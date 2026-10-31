package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum m1i implements v190 {
    UNKNOWN(0),
    HEADER(1),
    HEADER_CTA(2),
    LEGAL_TEXT(3),
    BENEFITS(4),
    SECTION_HEADER(5),
    OFFER_CARD(6),
    GROUPED_OFFER_CARDS(7),
    FEATURE_CARD(8),
    UNRECOGNIZED(-1);

    public final int a;

    m1i(int i) {
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
