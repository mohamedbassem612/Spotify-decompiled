package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum rwt0 implements v190 {
    PLAYBACK_CONTROL_UNSPECIFIED(0),
    PLAYBACK_CONTROL_CHAPTER_SKIP(1),
    PLAYBACK_CONTROL_DEFAULT(2),
    UNRECOGNIZED(-1);

    public final int a;

    rwt0(int i) {
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
