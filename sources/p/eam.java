package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum eam implements v190 {
    CONTENT_TYPE_UNSPECIFIED(0),
    CONTENT_TYPE_MUSIC(1),
    CONTENT_TYPE_PODCASTS(2),
    CONTENT_TYPE_AUDIOBOOKS(3),
    UNRECOGNIZED(-1);

    public final int a;

    eam(int i) {
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
