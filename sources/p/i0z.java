package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum i0z implements v190 {
    ENTRY_POINT_LAYOUT_UNSPECIFIED(0),
    ENTRY_POINT_LAYOUT_BUTTON_PRIMARY(1),
    ENTRY_POINT_LAYOUT_BUTTON_SECONDARY(2),
    ENTRY_POINT_LAYOUT_BUTTON_TERTIARY(3),
    ENTRY_POINT_LAYOUT_CARD_STANDARD(4),
    ENTRY_POINT_LAYOUT_CARD_PROGRESS(5),
    ENTRY_POINT_LAYOUT_CARD_EDIT(6),
    UNRECOGNIZED(-1);

    public final int a;

    i0z(int i) {
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
