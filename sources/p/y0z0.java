package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum y0z0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_STATUS_NONE(0),
    COLLECTION_STATUS_IN_YOUR_EPISODES(1),
    UNRECOGNIZED(-1);

    public final int a;

    y0z0(int i) {
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
