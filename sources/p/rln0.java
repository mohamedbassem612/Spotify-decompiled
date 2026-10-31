package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum rln0 implements v190 {
    RENDER_MODE_UNSET(0),
    RENDER_MODE_VIDEO_AUTOPLAY(1),
    RENDER_MODE_VIDEO_STATIC(2),
    RENDER_MODE_AUDIO_FALLBACK(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    rln0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
