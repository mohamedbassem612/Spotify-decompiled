package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum tp10 implements v190 {
    FEED_ENTITY_SOURCE_UNSPECIFIED(0),
    FEED_ENTITY_SOURCE_DM(1),
    FEED_ENTITY_SOURCE_GROUP(2),
    FEED_ENTITY_SOURCE_FOLLOWING(3),
    UNRECOGNIZED(-1);

    public final int a;

    tp10(int i) {
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
