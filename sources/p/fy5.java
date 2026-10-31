package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fy5 implements m8n {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ ssw0 b;

    public fy5(AtomicReference atomicReference, ssw0 ssw0Var) {
        this.a = atomicReference;
        this.b = ssw0Var;
    }

    public final m8n A(n8n n8nVar) {
        return ilo1.u(this, n8nVar);
    }

    public final o8n C(n8n n8nVar) {
        return ilo1.z(this, n8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void b(vu30 vu30Var, onm onmVar) {
        ey5 ey5Var;
        if (onmVar instanceof ey5) {
            ey5Var = (ey5) onmVar;
            int i = ey5Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                ey5Var.c = i - os00.INVALID_ID;
            } else {
                ey5Var = new ey5(this, onmVar);
            }
        } else {
            ey5Var = new ey5(this, onmVar);
        }
        Object obj = ey5Var.a;
        int i2 = ey5Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            ey5Var.c = 1;
            ohd ohdVar = new ohd(1, aym.t(ey5Var));
            ohdVar.t();
            ssw0 ssw0Var = this.b;
            ohdVar.n(new dy5(ssw0Var, (byte) 0));
            mhd mhdVar = (mhd) this.a.getAndSet(ohdVar);
            if (mhdVar != null) {
                mhdVar.q((Throwable) null);
            }
            ssw0Var.l(vu30Var);
            if (ohdVar.r() == d9n.a) {
                return;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            hm5.M(obj);
        }
        jah.d();
    }

    public n8n getKey() {
        return mm10.Y0;
    }

    public final Object o(Object obj, vu30 vu30Var) {
        return vu30Var.invoke(obj, this);
    }

    public final o8n y(o8n o8nVar) {
        return flo1.l(this, o8nVar);
    }
}
