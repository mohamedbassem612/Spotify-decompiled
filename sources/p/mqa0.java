package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mqa0 {
    public final drr0 a = new drr0(0.0f);
    public final hrr0 b = v8r.q(Boolean.FALSE);
    public final drr0 c = new drr0(0.0f);
    public final o95 d = c97.b(0.0f);
    public faa0 e;
    public boolean f;

    public final boolean a() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final float b(float f, float f2) {
        if (this.f) {
            return 0.0f;
        }
        drr0 drr0Var = this.a;
        float fS = drr0Var.s();
        drr0Var.t(prn1.o(drr0Var.s() + f, f2));
        return drr0Var.s() - fS;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object c(float f, float f2, float f3, fe5 fe5Var, n8b1 n8b1Var, Function0 function0, onm onmVar) throws Throwable {
        kqa0 kqa0Var;
        o95 o95Var;
        float fMax;
        Function0 function1;
        fe5 fe5Var2;
        n8b1 n8b1Var2;
        Float f4;
        lqa0 lqa0Var;
        Function0 function2;
        Float f5;
        lqa0 lqa0Var2;
        kqa0 kqa0Var2;
        float f6;
        float f7 = f;
        float f8 = f2;
        float f9 = f3;
        if (onmVar instanceof kqa0) {
            kqa0Var = (kqa0) onmVar;
            int i = kqa0Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                kqa0Var.t = i - Integer.MIN_VALUE;
            } else {
                kqa0Var = new kqa0(this, onmVar);
            }
        } else {
            kqa0Var = new kqa0(this, onmVar);
        }
        Object obj = kqa0Var.h;
        int i2 = kqa0Var.t;
        o95 o95Var2 = this.d;
        rih1 rih1Var = rih1.a;
        drr0 drr0Var = this.a;
        d9n d9nVar = d9n.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    float f10 = kqa0Var.d;
                    float f11 = kqa0Var.c;
                    float f12 = kqa0Var.b;
                    float f13 = kqa0Var.a;
                    function1 = kqa0Var.g;
                    fe5Var2 = kqa0Var.e;
                    hm5.M(obj);
                    fMax = f10;
                    f7 = f13;
                    f9 = f11;
                    f8 = f12;
                    o95Var = o95Var2;
                    f4 = new Float(fMax);
                    lqa0Var = new lqa0(this, (byte) 0);
                    kqa0Var.e = null;
                    kqa0Var.f = null;
                    kqa0Var.g = function1;
                    kqa0Var.a = f7;
                    kqa0Var.b = f8;
                    kqa0Var.c = f9;
                    kqa0Var.d = fMax;
                    kqa0Var.t = 2;
                    if (o95.b(o95Var, f4, fe5Var2, (Float) null, lqa0Var, kqa0Var, 4) != d9nVar) {
                        function2 = function1;
                    }
                    return d9nVar;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        float f14 = kqa0Var.c;
                        f8 = kqa0Var.b;
                        float f15 = kqa0Var.a;
                        n8b1 n8b1Var3 = kqa0Var.f;
                        hm5.M(obj);
                        f9 = f14;
                        f7 = f15;
                        n8b1Var2 = n8b1Var3;
                        f5 = new Float(0.0f);
                        lqa0Var2 = new lqa0(this, (byte) 1);
                        kqa0Var.e = null;
                        kqa0Var.f = null;
                        kqa0Var.g = null;
                        kqa0Var.a = f7;
                        kqa0Var.b = f8;
                        kqa0Var.c = f9;
                        kqa0Var.t = 4;
                        kqa0Var2 = kqa0Var;
                        try {
                            if (o95.b(o95Var2, f5, n8b1Var2, (Float) null, lqa0Var2, kqa0Var2, 4) != d9nVar) {
                                f6 = 0.0f;
                            }
                            return d9nVar;
                        } catch (Throwable th) {
                            th = th;
                            kqa0Var = kqa0Var2;
                            if (this.e == op71.z(kqa0Var.getContext())) {
                                this.e = null;
                            }
                            throw th;
                        }
                    }
                    if (i2 != 4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    f6 = 0.0f;
                    drr0Var.t(f6);
                    if (this.e == op71.z(kqa0Var.getContext())) {
                        this.e = null;
                    }
                } else {
                    function2 = kqa0Var.g;
                    hm5.M(obj);
                }
                function2.invoke();
                return rih1Var;
            }
            hm5.M(obj);
            if (!this.f && (a() || drr0Var.s() != 0.0f)) {
                this.b.setValue(Boolean.FALSE);
                if (drr0Var.s() > f8 || f7 > f9) {
                    o95Var = o95Var2;
                    this.f = true;
                    faa0 faa0Var = this.e;
                    if (faa0Var != null) {
                        faa0Var.d((CancellationException) null);
                    }
                    this.e = null;
                    fMax = Math.max(this.c.s(), drr0Var.s());
                    Float f16 = new Float(drr0Var.s());
                    kqa0Var.e = fe5Var;
                    kqa0Var.f = null;
                    kqa0Var.g = function0;
                    kqa0Var.a = f7;
                    kqa0Var.b = f8;
                    kqa0Var.c = f9;
                    kqa0Var.d = fMax;
                    kqa0Var.t = 1;
                    if (o95Var.g(f16, kqa0Var) != d9nVar) {
                        function1 = function0;
                        fe5Var2 = fe5Var;
                        f4 = new Float(fMax);
                        lqa0Var = new lqa0(this, (byte) 0);
                        kqa0Var.e = null;
                        kqa0Var.f = null;
                        kqa0Var.g = function1;
                        kqa0Var.a = f7;
                        kqa0Var.b = f8;
                        kqa0Var.c = f9;
                        kqa0Var.d = fMax;
                        kqa0Var.t = 2;
                        if (o95.b(o95Var, f4, fe5Var2, (Float) null, lqa0Var, kqa0Var, 4) != d9nVar) {
                            function2 = function1;
                            function2.invoke();
                            return rih1Var;
                        }
                    }
                } else {
                    faa0 faa0Var2 = this.e;
                    if (faa0Var2 != null) {
                        faa0Var2.d((CancellationException) null);
                    }
                    this.e = op71.z(kqa0Var.getContext());
                    Float f17 = new Float(drr0Var.s());
                    kqa0Var.e = null;
                    n8b1Var2 = n8b1Var;
                    kqa0Var.f = n8b1Var2;
                    kqa0Var.g = null;
                    kqa0Var.a = f7;
                    kqa0Var.b = f8;
                    kqa0Var.c = f9;
                    kqa0Var.t = 3;
                    if (o95Var2.g(f17, kqa0Var) != d9nVar) {
                        f5 = new Float(0.0f);
                        lqa0Var2 = new lqa0(this, (byte) 1);
                        kqa0Var.e = null;
                        kqa0Var.f = null;
                        kqa0Var.g = null;
                        kqa0Var.a = f7;
                        kqa0Var.b = f8;
                        kqa0Var.c = f9;
                        kqa0Var.t = 4;
                        kqa0Var2 = kqa0Var;
                        if (o95.b(o95Var2, f5, n8b1Var2, (Float) null, lqa0Var2, kqa0Var2, 4) != d9nVar) {
                            f6 = 0.0f;
                            drr0Var.t(f6);
                            if (this.e == op71.z(kqa0Var.getContext())) {
                                this.e = null;
                            }
                        }
                    }
                }
                return d9nVar;
            }
            return rih1Var;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
