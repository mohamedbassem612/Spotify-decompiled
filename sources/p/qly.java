package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum qly implements v190 {
    ENTITY_MATCH_TYPE_UNSPECIFIED(0),
    ENTITY_MATCH_TYPE_ARTIST(1),
    ENTITY_MATCH_TYPE_SONG(2),
    UNRECOGNIZED(-1);

    public final int a;

    qly(int i) {
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
