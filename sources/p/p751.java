package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum p751 implements v190 {
    ENTITY_TYPE_UNSPECIFIED(0),
    ENTITY_TYPE_ARTIST(1),
    ENTITY_TYPE_TRACK(2),
    ENTITY_TYPE_ALBUM(3),
    ENTITY_TYPE_PODCAST(4),
    ENTITY_TYPE_EPISODE(5),
    ENTITY_TYPE_AUDIOBOOK(6),
    ENTITY_TYPE_PLAYLIST(7),
    UNRECOGNIZED(-1);

    public final int a;

    p751(int i) {
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
