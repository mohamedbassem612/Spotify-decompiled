package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum oln0 implements v190 {
    FALLBACK_REASONS_LOW_DISTRACTION(0),
    FALLBACK_REASONS_DATA_SAVER_MODE(1),
    FALLBACK_REASONS_CONTENT_RESTRICTED(2),
    FALLBACK_REASONS_MUSIC_VIDEO_DISABLED(3),
    FALLBACK_REASONS_TRAIT_NOT_RESOLVED(4);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    oln0(int i) {
        this.a = i;
    }

    public static oln0 a(int i) {
        if (i == 0) {
            return FALLBACK_REASONS_LOW_DISTRACTION;
        }
        if (i == 1) {
            return FALLBACK_REASONS_DATA_SAVER_MODE;
        }
        if (i == 2) {
            return FALLBACK_REASONS_CONTENT_RESTRICTED;
        }
        if (i == 3) {
            return FALLBACK_REASONS_MUSIC_VIDEO_DISABLED;
        }
        if (i != 4) {
            return null;
        }
        return FALLBACK_REASONS_TRAIT_NOT_RESOLVED;
    }

    public final int getNumber() {
        return this.a;
    }
}
