package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum djf1 implements v190 {
    UNKNOWN(0),
    AUDIO_ONLY(1),
    AUDIO_WITH_VIDEO(2),
    VIDEO_MAPPED(3),
    VIDEO_UNMAPPED(4),
    UNRECOGNIZED(-1);

    public final int a;

    djf1(int i) {
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
