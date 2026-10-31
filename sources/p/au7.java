package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum au7 implements v190 {
    AUDIO_EPISODE_TYPE_UNSPECIFIED(0),
    AUDIO_EPISODE_TYPE_TALK(1),
    AUDIO_EPISODE_TYPE_MUSIC(2),
    UNRECOGNIZED(-1);

    public final int a;

    au7(int i) {
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
