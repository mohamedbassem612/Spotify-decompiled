package androidx.startup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class StartupException extends RuntimeException {
    public StartupException() {
        super("Context cannot be null");
    }

    public StartupException(Throwable th) {
        super(th);
    }
}
