package p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rc9 implements gnc1 {
    public pnc1 a;
    public Object b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ ohd e;
    public final /* synthetic */ int f;

    public rc9(ohd ohdVar, int i) {
        this.e = ohdVar;
        this.f = i;
    }

    @Override // p.gnc1
    public final void onComplete() {
        boolean z = this.d;
        ohd ohdVar = this.e;
        if (z) {
            omo1.p(new IllegalStateException("'onComplete' was called after the publisher already signalled being in a terminal state"), ohdVar.e);
            return;
        }
        this.d = true;
        boolean z2 = this.c;
        int i = this.f;
        if (z2) {
            if (i == 2 || i == 1 || !(ohdVar.s() instanceof ago0)) {
                return;
            }
            ohdVar.resumeWith(this.b);
            return;
        }
        if (i == 2 || i == 5) {
            ohdVar.resumeWith(null);
        } else if (ohdVar.s() instanceof ago0) {
            ohdVar.resumeWith(new m231(new NoSuchElementException("No value received via onNext for ".concat(cfm0.u(i)))));
        }
    }

    @Override // p.gnc1
    public final void onError(Throwable th) {
        boolean z = this.d;
        ohd ohdVar = this.e;
        if (z) {
            omo1.p(new IllegalStateException("'onError' was called after the publisher already signalled being in a terminal state"), ohdVar.e);
        } else {
            this.d = true;
            ohdVar.resumeWith(new m231(th));
        }
    }

    @Override // p.gnc1
    public final void onNext(Object obj) {
        pnc1 pnc1Var = this.a;
        ohd ohdVar = this.e;
        if (pnc1Var == null) {
            omo1.p(new IllegalStateException("'onNext' was called before 'onSubscribe'"), ohdVar.e);
            return;
        }
        if (this.d) {
            omo1.p(new IllegalStateException("'onNext' was called after the publisher already signalled being in a terminal state"), ohdVar.e);
            return;
        }
        int iC = l1d.C(this.f);
        if (iC == 0 || iC == 1) {
            if (!this.c) {
                this.c = true;
                synchronized (this) {
                    pnc1Var.cancel();
                }
                this.e.resumeWith(obj);
                return;
            }
            omo1.p(new IllegalStateException("Only a single value was requested in '" + cfm0.u(this.f) + "', but the publisher provided more"), this.e.e);
            return;
        }
        if (iC != 2 && iC != 3 && iC != 4) {
            eg.o();
            return;
        }
        int i = this.f;
        if ((i != 4 && i != 5) || !this.c) {
            this.b = obj;
            this.c = true;
            return;
        }
        synchronized (this) {
            pnc1Var.cancel();
        }
        if (this.e.s() instanceof ago0) {
            this.e.resumeWith(new m231(new IllegalArgumentException("More than one onNext value for ".concat(cfm0.u(this.f)))));
        }
    }

    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        if (this.a != null) {
            synchronized (this) {
                pnc1Var.cancel();
            }
            return;
        }
        this.a = pnc1Var;
        this.e.n(new da(this, pnc1Var, (byte) 8));
        int i = this.f;
        synchronized (this) {
            pnc1Var.request((i == 1 || i == 2) ? 1L : Long.MAX_VALUE);
        }
    }
}
