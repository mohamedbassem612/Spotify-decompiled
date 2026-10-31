package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class roy0 extends AtomicReference implements gnc1 {
    public final /* synthetic */ soy0 a;

    public roy0(soy0 soy0Var) {
        this.a = soy0Var;
    }

    public final void onComplete() {
        ywx0.m(this.a.Z, this);
    }

    public final void onError(Throwable th) {
        ywx0.m(this.a.Z, this);
        q26.e().b(new gv40(th, (byte) 26));
    }

    public final void onNext(Object obj) {
        this.a.j(obj);
    }

    public final void onSubscribe(pnc1 pnc1Var) {
        if (compareAndSet(null, pnc1Var)) {
            pnc1Var.request(Long.MAX_VALUE);
        } else {
            pnc1Var.cancel();
        }
    }
}
