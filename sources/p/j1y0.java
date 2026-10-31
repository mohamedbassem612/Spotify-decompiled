package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum j1y0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    PLAYLIST_GENERATION_MODE_UNSPECIFIED(0),
    PLAYLIST_GENERATION_MODE_ITERATIVE_UPDATE(1),
    PLAYLIST_GENERATION_MODE_FULL_GENERATION(2),
    UNRECOGNIZED(-1);

    public final int a;

    j1y0(int i) {
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
