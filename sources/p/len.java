package p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class len implements Thread.UncaughtExceptionHandler {
    public static final hwb c = new hwb((byte) 3);
    public static len d;
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ len(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.lcd1 */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) throws lcd1 {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Throwable th2 = null;
                for (Throwable cause = th; cause != null && cause != th2; cause = cause.getCause()) {
                    StackTraceElement[] stackTrace = cause.getStackTrace();
                    int length = stackTrace.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            StackTraceElement stackTraceElement = stackTrace[i];
                            if (nhc1.Y(stackTraceElement.getClassName(), "com.facebook", false) || nhc1.Y(stackTraceElement.getClassName(), "com.meta", false)) {
                                dgo1.h(th);
                                v9p1.y(th, cp80.d).b();
                                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
                                if (uncaughtExceptionHandler != null) {
                                    uncaughtExceptionHandler.uncaughtException(thread, th);
                                }
                            } else {
                                i++;
                            }
                        } else {
                            th2 = cause;
                        }
                        break;
                    }
                }
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
                break;
            default:
                hpm0 hpm0Var = (hpm0) obj;
                zwg zwgVar = hpm0Var.e;
                lvc1 lvc1Var = hpm0Var.b;
                if (zwgVar == null || lvc1Var == null) {
                    eg.m("Could not handle exception during sync");
                } else {
                    lvc1Var.a();
                    lvc1Var.L("moving-state", "cancelled");
                    lvc1Var.K();
                    ((AtomicBoolean) zwgVar.e).compareAndSet(true, false);
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = hpm0Var.f;
                    uncaughtExceptionHandler2.getClass();
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
                break;
        }
    }
}
