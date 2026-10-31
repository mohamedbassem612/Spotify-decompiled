package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum ntl implements v190 {
    CONTENT_FILTER_TYPE_UNKNOWN(0),
    CONTENT_FILTER_TYPE_VIDEOS(1),
    CONTENT_FILTER_TYPE_PODCAST(2),
    CONTENT_FILTER_TYPE_LIVE_EVENTS(3),
    UNRECOGNIZED(-1);

    public final int a;

    ntl(int i) {
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
