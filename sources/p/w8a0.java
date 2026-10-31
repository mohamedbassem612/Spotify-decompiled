package p;

import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class w8a0 extends UploadDataSink {
    public final AtomicInteger a = new AtomicInteger(3);
    public final u8a0 b;
    public final Executor c;
    public final axh1 d;
    public ByteBuffer e;
    public long f;
    public long g;
    public int h;

    public w8a0(Executor executor, Executor executor2, axh1 axh1Var) {
        this.b = new u8a0(this, executor);
        this.c = executor2;
        this.d = new axh1(axh1Var, (byte) 1);
    }

    public final void a(z8a0 z8a0Var, String str) {
        eo41.a("JavaUploadDataSinkBase#executeOnExecutor ".concat(str));
        try {
            this.c.execute(new ag20(str, z8a0Var, (byte) 9));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(j9a0 j9a0Var, String str) {
        try {
            eo41.a("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor ".concat(str));
            try {
                this.b.execute(new c45((Object) this, (Object) str, (Object) j9a0Var, (byte) 22));
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RejectedExecutionException e) {
            c(e);
        }
    }

    public abstract void c(Exception exc);

    public final void onReadError(Exception exc) {
        c(exc);
    }

    public final void onReadSucceeded(boolean z) {
        AtomicInteger atomicInteger = this.a;
        if (!atomicInteger.compareAndSet(0, 2)) {
            eg.m(f4i1.c(atomicInteger.get(), "onReadSucceeded() called when not awaiting a read result; in state: "));
        } else {
            a(new z8a0(((g9a0) this).m, new s7s(this, z, (byte) 3), (byte) 2), "onReadSucceeded");
        }
    }

    public final void onRewindError(Exception exc) {
        c(exc);
    }

    public final void onRewindSucceeded() {
        AtomicInteger atomicInteger = this.a;
        if (!atomicInteger.compareAndSet(1, 2)) {
            eg.m(f4i1.c(atomicInteger.get(), "onRewindSucceeded() called when not awaiting a rewind; in state: "));
        } else {
            a(new z8a0(((g9a0) this).m, new v8a0(this, (byte) 0), (byte) 2), "startRead");
        }
    }
}
