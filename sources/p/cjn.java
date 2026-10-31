package p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cjn implements Thread.UncaughtExceptionHandler {
    public final n4b a;
    public final s880 b;
    public final Thread.UncaughtExceptionHandler c;
    public final vhn d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public cjn(n4b n4bVar, s880 s880Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, vhn vhnVar) {
        this.a = n4bVar;
        this.b = s880Var;
        this.c = uncaughtExceptionHandler;
        this.d = vhnVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027 A[Catch: all -> 0x002f, Exception -> 0x0047, Merged into TryCatch #1 {all -> 0x002f, Exception -> 0x0047, blocks: (B:4:0x000d, B:13:0x0027, B:16:0x0031, B:7:0x0014, B:8:0x0018, B:10:0x0020, B:22:0x0047), top: B:33:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[Catch: all -> 0x002f, Exception -> 0x0047, Merged into TryCatch #1 {all -> 0x002f, Exception -> 0x0047, blocks: (B:4:0x000d, B:13:0x0027, B:16:0x0031, B:7:0x0014, B:8:0x0018, B:10:0x0020, B:22:0x0047), top: B:33:0x000b }, TRY_LEAVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        boolean z;
        ws10 ws10Var = ws10.Z;
        AtomicBoolean atomicBoolean = this.e;
        atomicBoolean.set(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        try {
            if (thread != null && th != null) {
                if (this.d.b()) {
                    ws10Var.c();
                } else {
                    z = true;
                }
                if (z) {
                    this.a.w(this.b, thread, th);
                } else {
                    ws10Var.c();
                }
                if (uncaughtExceptionHandler != null) {
                    ws10Var.c();
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                } else {
                    ws10Var.c();
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
            ws10Var.e();
            z = false;
            if (z) {
                this.a.w(this.b, thread, th);
            } else {
                ws10Var.c();
            }
            if (uncaughtExceptionHandler != null) {
                ws10Var.c();
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                ws10Var.c();
                System.exit(1);
            }
            atomicBoolean.set(false);
        } catch (Exception unused) {
            ws10Var.d();
        } finally {
            if (uncaughtExceptionHandler != null) {
                ws10Var.c();
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                ws10Var.c();
                System.exit(1);
            }
            atomicBoolean.set(false);
        }
    }
}
