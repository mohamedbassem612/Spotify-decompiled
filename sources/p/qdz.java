package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum qdz implements v190 {
    ALBUM_TYPE_UNSPECIFIED(0),
    ALBUM_TYPE_ALBUM(1),
    ALBUM_TYPE_SINGLE(2),
    ALBUM_TYPE_EP(3),
    UNRECOGNIZED(-1);

    public final int a;

    qdz(int i) {
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
