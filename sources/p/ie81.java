package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum ie81 implements v190 {
    UNSET(0),
    SHOWCASE_DEFAULT(1),
    SHOWCASE_VIDEO(2),
    SHOWCASE_PRERELEASE(3),
    SHOWCASE_MUSIC_VIDEO(4),
    UNRECOGNIZED(-1);

    public final int a;

    ie81(int i) {
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
