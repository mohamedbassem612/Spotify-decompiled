package p;

import io.reactivex.rxjava3.core.CompletableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w141 extends q6 {
    public final CompletableEmitter e;

    public w141(o8n o8nVar, CompletableEmitter completableEmitter) {
        super(o8nVar, false, true);
        this.e = completableEmitter;
    }

    public final void y0(Throwable th, boolean z) {
        try {
            if (this.e.tryOnError(th)) {
                return;
            }
        } catch (Throwable th2) {
            j2h1.h(th, th2);
        }
        w0h1.u(th, ((q6) this).d);
    }

    public final void z0(Object obj) {
        try {
            this.e.onComplete();
        } catch (Throwable th) {
            w0h1.u(th, ((q6) this).d);
        }
    }
}
