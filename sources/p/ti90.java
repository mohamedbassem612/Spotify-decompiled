package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum ti90 implements v190 {
    ITEM_CHANGE_TYPE_UNSPECIFIED(0),
    ITEM_CHANGE_TYPE_ADDED(1),
    ITEM_CHANGE_TYPE_REMOVED(2),
    ITEM_CHANGE_TYPE_REORDERED(3),
    UNRECOGNIZED(-1);

    public final int a;

    ti90(int i) {
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
