package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum nqj1 implements v190 {
    VIDEO_MEDIA_FORMAT_UNSPECIFIED(0),
    VIDEO_MEDIA_FORMAT_ADAPTIVE(1),
    UNRECOGNIZED(-1);

    public final int a;

    nqj1(int i) {
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
