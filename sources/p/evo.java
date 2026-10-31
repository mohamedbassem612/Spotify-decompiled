package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class evo implements h0r0 {
    public final qyj a;
    public final hvo b;
    public final ham c;
    public final Flowable d;
    public final dg0 e;
    public final o7r0 f;
    public final oap g;
    public final q7r0 h;
    public final ien0 i;
    public final cbr0 j;

    public evo(qyj qyjVar, hvo hvoVar, ham hamVar, Flowable flowable, dg0 dg0Var, o7r0 o7r0Var, oap oapVar, q7r0 q7r0Var, e5b0 e5b0Var) {
        this.a = qyjVar;
        this.b = hvoVar;
        this.c = hamVar;
        this.d = flowable;
        this.e = dg0Var;
        this.f = o7r0Var;
        this.g = oapVar;
        this.h = q7r0Var;
        ien0 ien0Var = new ien0((Object) null);
        this.i = ien0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.j = new cbr0(new dbr0[]{new bn70(yon1.r1(), nik1.K1, (nar0) null), new a6o0(ien0Var), new t1r0(true), new s9h1(14, true, false, false), e5b0Var}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.j;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-303887717, new dvo(this, (byte) 3), true));
    }

    public final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1549277011);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = xto.t((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(this) | x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == obj) {
                objT2 = new y0o(this, ven0Var, (byte) 10);
                x340Var.s0(objT2);
            }
            qxd0.i(this.d, (iu30) objT2, x340Var);
            Object objT3 = x340Var.T();
            if (objT3 == obj) {
                objT3 = xto.t((Object) null);
                x340Var.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == obj) {
                objT4 = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT4);
            }
            c9n c9nVar = (c9n) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == obj) {
                objT5 = this.g.a(c9nVar, new hnf(ven0Var2, (byte) 21));
                x340Var.s0(objT5);
            }
            gvo gvoVar = (gvo) objT5;
            if (ven0Var.getValue() != null) {
                x340Var.i0(793481471);
                hvo hvoVar = this.b;
                bab1 bab1VarR = prn1.r(new hyn0(hvoVar.b(), hvoVar.a()), x340Var, 0);
                boolean zI2 = x340Var.i(ven0Var2) | x340Var.i(bab1VarR);
                Object objT6 = x340Var.T();
                if (zI2 || objT6 == obj) {
                    objT6 = new ja2(bab1VarR, ven0Var2, (lnm) null, (byte) 2);
                    x340Var.s0(objT6);
                }
                qxd0.t(bab1VarR, x340Var, (vu30) objT6);
                boolean zA = bab1VarR.a();
                boolean zI3 = x340Var.i(gvoVar);
                Object objT7 = x340Var.T();
                if (zI3 || objT7 == obj) {
                    objT7 = new d4e(gvoVar, (byte) 11);
                    x340Var.s0(objT7);
                }
                q3p1.b(0, 0, (Function0) objT7, x340Var, zA);
                w9b1.a(bab1VarR, (qim0) null, apo.r(310168374, new nzd(ven0Var, this, gvoVar, (byte) 13), x340Var), x340Var, 384, 2);
                x340Var.r(false);
            } else {
                x340Var.i0(795126703);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dvo(this, i);
        }
    }
}
