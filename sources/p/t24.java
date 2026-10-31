package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t24 {
    public final iu30 a;
    public iu30 b;
    public Function0 c;
    public fe5 d;
    public e9r e;
    public final hrr0 g;
    public final hrr0 h;
    public final drr0 k;
    public final hrr0 l;
    public final hrr0 m;
    public final o24 n;
    public final pfn0 f = new pfn0();
    public final mdt i = xto.l(new d24(this, (byte) 0));
    public final drr0 j = exd0.u(Float.NaN);

    public t24(iu30 iu30Var, Object obj) {
        this.a = new z9((byte) 7);
        this.g = xto.t(obj);
        this.h = xto.t(obj);
        xto.m(new d24(this, (byte) 1));
        this.k = exd0.u(0.0f);
        this.l = xto.t((Object) null);
        this.m = xto.t(wm5.r());
        this.n = new o24(this);
        this.a = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, hfn0 hfn0Var, zu30 zu30Var, onm onmVar) {
        k24 k24Var;
        if (onmVar instanceof k24) {
            k24Var = (k24) onmVar;
            int i = k24Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k24Var.c = i - Integer.MIN_VALUE;
            } else {
                k24Var = new k24(this, onmVar);
            }
        } else {
            k24Var = new k24(this, onmVar);
        }
        Object obj2 = k24Var.a;
        int i2 = k24Var.c;
        hrr0 hrr0Var = this.l;
        try {
            if (i2 == 0) {
                hm5.M(obj2);
                if (c().c(obj)) {
                    pfn0 pfn0Var = this.f;
                    l24 l24Var = new l24(this, obj, zu30Var, (lnm) null, (byte) 1);
                    k24Var.c = 1;
                    Object objA = pfn0Var.a(hfn0Var, l24Var, k24Var);
                    d9n d9nVar = d9n.a;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else if (((Boolean) this.a.invoke(obj)).booleanValue()) {
                    this.h.setValue(obj);
                    this.g.setValue(obj);
                }
                return rih1.a;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
            hrr0Var.setValue(null);
            return rih1.a;
        } catch (Throwable th) {
            hrr0Var.setValue(null);
            throw th;
        }
    }

    public final float b(float f) {
        float fE = e(f);
        float fG = fE - g();
        o24.b(this.n, fE);
        return fG;
    }

    public final wvr c() {
        return (wvr) this.m.getValue();
    }

    public final boolean d() {
        return (this.b == null || this.c == null || this.d == null || this.e == null) ? false : true;
    }

    public final float e(float f) {
        drr0 drr0Var = this.j;
        return yoi1.o((Float.isNaN(drr0Var.s()) ? 0.0f : drr0Var.s()) + f, c().e(), c().d());
    }

    public final float f(Object obj) {
        float f = c().f(w3v.b);
        float f2 = c().f(obj);
        float fO = (yoi1.o(this.j.s(), Math.min(f, f2), Math.max(f, f2)) - f) / (f2 - f);
        if (Float.isNaN(fO)) {
            return 1.0f;
        }
        if (fO < 1.0E-6f) {
            return 0.0f;
        }
        if (fO > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(fO);
    }

    public final float g() {
        drr0 drr0Var = this.j;
        if (Float.isNaN(drr0Var.s())) {
            tf80.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return drr0Var.s();
    }

    public final Object h(float f, onm onmVar) {
        if (!d()) {
            tf80.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        Object value = this.g.getValue();
        wvr wvrVarC = c();
        float fG = g();
        iu30 iu30Var = this.b;
        if (iu30Var == null) {
            u890.C("positionalThreshold");
            throw null;
        }
        Function0 function0 = this.c;
        if (function0 != null) {
            Object objQ = wm5.q(wvrVarC, fG, f, iu30Var, function0);
            return ((Boolean) this.a.invoke(objQ)).booleanValue() ? wm5.w(this, objQ, f, onmVar) : wm5.w(this, value, f, onmVar);
        }
        u890.C("velocityThreshold");
        throw null;
    }

    public final boolean i(Object obj) {
        pfn0 pfn0Var = this.f;
        xgn0 xgn0Var = pfn0Var.b;
        xgn0 xgn0Var2 = pfn0Var.b;
        boolean zN0 = fdg1.n0(xgn0Var);
        if (!zN0) {
            return zN0;
        }
        try {
            o24 o24Var = this.n;
            float f = c().f(obj);
            if (!Float.isNaN(f)) {
                o24.b(o24Var, f);
                this.l.setValue(null);
            }
            this.g.setValue(obj);
            this.h.setValue(obj);
            return zN0;
        } finally {
            fdg1.o0(xgn0Var2);
        }
    }

    public final void j(wvr wvrVar, Object obj) {
        if (u890.j(c(), wvrVar)) {
            return;
        }
        this.m.setValue(wvrVar);
        if (i(obj)) {
            return;
        }
        this.l.setValue(obj);
    }
}
