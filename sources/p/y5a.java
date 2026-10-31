package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum y5a implements v190 {
    CONTENT_TYPE_UNSPECIFIED(0),
    CONTENT_TYPE_PODCAST(1),
    CONTENT_TYPE_AUDIOBOOK(2),
    CONTENT_TYPE_CREATOR_CHANNEL(3),
    CONTENT_TYPE_COURSE(4),
    CONTENT_TYPE_MEMBERSHIP(5),
    UNRECOGNIZED(-1);

    public final int a;

    y5a(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
