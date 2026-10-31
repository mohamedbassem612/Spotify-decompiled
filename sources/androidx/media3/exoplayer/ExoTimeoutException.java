package androidx.media3.exoplayer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ExoTimeoutException extends RuntimeException {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public ExoTimeoutException(int i) {
        super(i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
        this.a = i;
    }
}
