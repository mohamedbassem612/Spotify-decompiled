package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum vgy implements v190 {
    UNSPECIFIED(0),
    TRACK(1),
    ARTIST(2),
    ALBUM(3),
    SHOW(4),
    AUDIOBOOK(5),
    PLAYLIST(6),
    UNRECOGNIZED(-1);

    public final int a;

    vgy(int i) {
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
