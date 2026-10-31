package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum xto0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    NOTIFICATION_TYPE_UNSPECIFIED(0),
    SEARCH_RESCUE(1),
    UNRECOGNIZED(-1);

    public final int a;

    xto0(int i) {
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
