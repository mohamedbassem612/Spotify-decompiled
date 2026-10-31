package p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z241 extends q6 {
    public final SingleEmitter e;

    public z241(o8n o8nVar, SingleEmitter singleEmitter) {
        super(o8nVar, false, true);
        this.e = singleEmitter;
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
            this.e.onSuccess(obj);
        } catch (Throwable th) {
            w0h1.u(th, ((q6) this).d);
        }
    }
}
