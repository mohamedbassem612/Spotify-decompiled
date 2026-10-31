package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum twt0 implements v190 {
    PLAYBACK_CONTROL_UNSPECIFIED(0),
    PLAYBACK_CONTROL_CHAPTER_SKIP(1),
    PLAYBACK_CONTROL_DEFAULT(2),
    UNRECOGNIZED(-1);

    public final int a;

    twt0(int i) {
        this.a = i;
    }

    public static twt0 a(int i) {
        if (i == 0) {
            return PLAYBACK_CONTROL_UNSPECIFIED;
        }
        if (i == 1) {
            return PLAYBACK_CONTROL_CHAPTER_SKIP;
        }
        if (i != 2) {
            return null;
        }
        return PLAYBACK_CONTROL_DEFAULT;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
