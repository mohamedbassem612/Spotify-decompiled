package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum lj40 implements v190 {
    GEOBLOCK_BLOCKING_TYPE_UNSPECIFIED(0),
    GEOBLOCK_BLOCKING_TYPE_TITLE(1),
    GEOBLOCK_BLOCKING_TYPE_DESCRIPTION(2),
    GEOBLOCK_BLOCKING_TYPE_IMAGE(3),
    UNRECOGNIZED(-1);

    public final int a;

    lj40(int i) {
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
