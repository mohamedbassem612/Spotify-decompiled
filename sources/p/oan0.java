package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum oan0 implements v190 {
    MV_RELATED_ASSOCIATION_RELATION_TYPE_UNKNOWN(0),
    MV_RELATED_ASSOCIATION_RELATION_TYPE_UNSPECIFIED(1),
    MV_RELATED_ASSOCIATION_RELATION_TYPE_OFFICIAL_MIX(2),
    UNRECOGNIZED(-1);

    public final int a;

    oan0(int i) {
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
