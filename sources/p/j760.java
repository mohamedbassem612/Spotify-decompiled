package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum j760 implements v190 {
    UNKNOWN_HERO_VIDEO_EXPERIMENT(0),
    HERO_VIDEO_CONTROL(1),
    HERO_VIDEO(2),
    HERO_STATIC_IMAGE(3),
    UNRECOGNIZED(-1);

    public final int a;

    j760(int i) {
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
