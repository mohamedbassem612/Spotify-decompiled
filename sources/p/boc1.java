package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum boc1 implements v190 {
    SUBSCRIPTION_CARD_LAYOUT_UNSPECIFIED(0),
    SUBSCRIPTION_CARD_LAYOUT_STANDARD(1),
    SUBSCRIPTION_CARD_LAYOUT_ICON_HEADING(2),
    UNRECOGNIZED(-1);

    public final int a;

    boc1(int i) {
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
