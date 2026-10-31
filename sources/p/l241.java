package p;

import io.reactivex.rxjava3.core.MaybeEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l241 extends q6 {
    public final MaybeEmitter e;

    public l241(o8n o8nVar, MaybeEmitter maybeEmitter) {
        super(o8nVar, false, true);
        this.e = maybeEmitter;
    }

    @Override // p.q6
    public final void y0(Throwable th, boolean z) {
        try {
            if (this.e.tryOnError(th)) {
                return;
            }
        } catch (Throwable th2) {
            j2h1.h(th, th2);
        }
        w0h1.u(th, this.d);
    }

    @Override // p.q6
    public final void z0(Object obj) {
        MaybeEmitter maybeEmitter = this.e;
        try {
            if (obj == null) {
                maybeEmitter.onComplete();
            } else {
                maybeEmitter.onSuccess(obj);
            }
        } catch (Throwable th) {
            w0h1.u(th, this.d);
        }
    }
}
