package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r24 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;
    public Object k;

    public r24(o8v o8vVar, j6 j6Var, hx4 hx4Var, fe5 fe5Var, iu30 iu30Var) {
        this.a = j6Var;
        this.b = hx4Var;
        this.c = iu30Var;
        this.d = new k590();
        new q24(this);
        this.e = xto.t(o8vVar);
        xto.l(new b24(this, (byte) 0));
        this.h = xto.l(new b24(this, (byte) 1));
        this.i = exd0.u(Float.NaN);
        xto.m(new b24(this, (byte) 2));
        this.j = exd0.u(0.0f);
        this.f = xto.t((Object) null);
        this.g = xto.t(c921.n());
        this.k = new m24(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object a(hfn0 hfn0Var, ew0 ew0Var, onm onmVar) {
        f24 f24Var;
        iu30 iu30Var = (iu30) this.c;
        drr0 drr0Var = (drr0) this.i;
        if (onmVar instanceof f24) {
            f24Var = (f24) onmVar;
            int i = f24Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f24Var.c = i - Integer.MIN_VALUE;
            } else {
                f24Var = new f24(this, onmVar);
            }
        } else {
            f24Var = new f24(this, onmVar);
        }
        Object obj = f24Var.a;
        int i2 = f24Var.c;
        lnm lnmVar = null;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                k590 k590Var = (k590) this.d;
                h24 h24Var = new h24(this, ew0Var, lnmVar, (byte) 0);
                f24Var.c = 1;
                Object objA = k590Var.a(hfn0Var, h24Var, f24Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            Object objA2 = b().a(drr0Var.s());
            if (objA2 != null && Math.abs(drr0Var.s() - b().c(objA2)) <= 0.5f && ((Boolean) iu30Var.invoke(objA2)).booleanValue()) {
                c(objA2);
            }
            return rih1.a;
        } catch (Throwable th) {
            Object objA3 = b().a(drr0Var.s());
            if (objA3 != null && Math.abs(drr0Var.s() - b().c(objA3)) <= 0.5f && ((Boolean) iu30Var.invoke(objA3)).booleanValue()) {
                c(objA3);
            }
            throw th;
        }
    }

    public ang0 b() {
        return (ang0) ((hrr0) this.g).getValue();
    }

    public void c(Object obj) {
        ((hrr0) this.e).setValue(obj);
    }

    public r24(rzo0 rzo0Var, p4p0 p4p0Var, ynb0 ynb0Var, Flowable flowable, Scheduler scheduler, Scheduler scheduler2, w4p0 w4p0Var, vu4 vu4Var) {
        this.a = rzo0Var;
        this.b = p4p0Var;
        this.c = ynb0Var;
        this.d = flowable;
        this.e = scheduler;
        this.f = scheduler2;
        this.g = w4p0Var;
        this.h = vu4Var;
        this.i = new rku();
    }
}
