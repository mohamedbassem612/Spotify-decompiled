package p;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pdf0 extends FutureTask {
    public final /* synthetic */ byte a = 0;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdf0(yi7 yi7Var, sra sraVar) {
        super(sraVar);
        this.b = yi7Var;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        switch (this.a) {
            case 0:
                try {
                    if (!isCancelled()) {
                        try {
                            ((qdf0) this.b).f((odf0) get());
                        } catch (InterruptedException | ExecutionException e) {
                            ((qdf0) this.b).f(new odf0(e));
                        }
                        break;
                    }
                    return;
                } finally {
                    this.b = null;
                }
            default:
                yi7 yi7Var = (yi7) this.b;
                AtomicBoolean atomicBoolean = yi7Var.e;
                try {
                    Object obj = get();
                    if (atomicBoolean.get()) {
                        return;
                    }
                    yi7Var.b(obj);
                    return;
                } catch (InterruptedException unused) {
                    return;
                } catch (CancellationException unused2) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    yi7Var.b(null);
                    return;
                } catch (ExecutionException e2) {
                    bhn0.o("An error occurred while executing doInBackground()", e2.getCause());
                    return;
                } catch (Throwable th) {
                    bhn0.o("An error occurred while executing doInBackground()", th);
                    return;
                }
        }
    }

    public /* synthetic */ pdf0(Callable callable) {
        super(callable);
    }
}
