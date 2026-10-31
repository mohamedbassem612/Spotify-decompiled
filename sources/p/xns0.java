package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum xns0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    MUSIC_VIDEO_ACCESS_PERMISSION_RESULT_ALLOWED(0),
    /* JADX INFO: Fake field, exist only in values array */
    MUSIC_VIDEO_ACCESS_PERMISSION_RESULT_DISALLOWED(1),
    UNRECOGNIZED(-1);

    public final int a;

    xns0(int i) {
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
