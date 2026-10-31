package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum ul51 implements v190 {
    SEED_SEARCH_ENTITY_TYPE_UNSPECIFIED(0),
    ARTIST(1),
    TRACK(2),
    ALBUM(3),
    PLAYLIST(4),
    UNRECOGNIZED(-1);

    public final int a;

    ul51(int i) {
        this.a = i;
    }

    public static ul51 a(int i) {
        if (i == 0) {
            return SEED_SEARCH_ENTITY_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ARTIST;
        }
        if (i == 2) {
            return TRACK;
        }
        if (i == 3) {
            return ALBUM;
        }
        if (i != 4) {
            return null;
        }
        return PLAYLIST;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
