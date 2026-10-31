package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum cj90 implements v190 {
    ITEM_COUNT_UNIT_UNKNOWN(0),
    ITEM_COUNT_UNIT_SONGS(1),
    ITEM_COUNT_UNIT_BOOKS(2),
    ITEM_COUNT_UNIT_EPISODES(3),
    ITEM_COUNT_UNIT_ITEMS(4),
    UNRECOGNIZED(-1);

    public final int a;

    cj90(int i) {
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
