package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ltn0 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltn0(float f, Function0 function0, boolean z) {
        super(3);
        this.a = f;
        this.b = function0;
        this.c = z;
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        x340Var.i0(1271646495);
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        boolean z = this.c;
        if (objT == m4cVar) {
            objT = c97.b(z ? 0.0f : 1.0f);
            x340Var.s0(objT);
        }
        o95 o95Var = (o95) objT;
        Object objT2 = x340Var.T();
        float f = this.a;
        if (objT2 == m4cVar) {
            objT2 = new o95(new p3v(z ? 0.0f : f), rno1.c, (Object) null, 12);
            x340Var.s0(objT2);
        }
        o95 o95Var2 = (o95) objT2;
        uwr uwrVar = cbx.a;
        long j = cbx.c(x340Var).b.a;
        long j2 = cbx.c(x340Var).b.b;
        ceo ceoVar = ((jhx) cbx.c(x340Var).a.b).a;
        p3v p3vVar = new p3v(f);
        boolean zG = x340Var.g(ceoVar) | x340Var.d(f) | x340Var.i(o95Var) | x340Var.f(j2) | x340Var.f(j) | x340Var.i(o95Var2);
        Object objT3 = x340Var.T();
        if (zG || objT3 == m4cVar) {
            ktn0 ktn0Var = new ktn0(this.a, o95Var, j2, j, o95Var2, ceoVar, null);
            x340Var.s0(ktn0Var);
            objT3 = ktn0Var;
        }
        qxd0.t(p3vVar, x340Var, (vu30) objT3);
        if (p3v.c(((p3v) o95Var2.e()).a, 0.0f)) {
            x340Var.i0(2010281738);
            Function0 function0 = this.b;
            boolean zG2 = x340Var.g(function0);
            Object objT4 = x340Var.T();
            if (zG2 || objT4 == m4cVar) {
                objT4 = new to1(function0, (lnm) 0, (byte) 16);
                x340Var.s0(objT4);
            }
            qxd0.t(function0, x340Var, (vu30) objT4);
            x340Var.r(false);
        } else {
            x340Var.i0(2010336515);
            x340Var.r(false);
        }
        qim0 qim0VarK = d9y0.k(u291.v(nim0.a, ((p3v) o95Var2.e()).a), ((Number) o95Var.e()).floatValue());
        x340Var.r(false);
        return qim0VarK;
    }
}
