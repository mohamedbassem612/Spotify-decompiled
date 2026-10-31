package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cuj implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ nda1 a;
    public final /* synthetic */ Thread.UncaughtExceptionHandler b;

    public cuj(nda1 nda1Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = nda1Var;
        this.b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.a.invoke();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
