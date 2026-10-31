package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum sln0 implements v190 {
    UNSET(0),
    SHOWCASE_DEFAULT(1),
    SHOWCASE_VIDEO(2),
    SHOWCASE_PRERELEASE(3),
    SHOWCASE_MUSIC_VIDEO(4);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    sln0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
