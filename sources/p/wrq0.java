package p;

import android.app.Activity;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wrq0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ asq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wrq0(asq0 asq0Var, byte b) {
        super(2);
        this.a = b;
        this.b = asq0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        qim0 qim0VarD;
        d0r d0rVar;
        byte b = this.a;
        asq0 asq0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = asq0Var.d.a();
                    nim0 nim0Var = nim0.a;
                    if (zA) {
                        x340Var2.i0(723874844);
                        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                        uwr uwrVar = cbx.a;
                        qim0VarD = uyn1.x(dug.f(qim0VarF, cbx.a(x340Var2).a.a.a(), d4o1.a), cbx.b(x340Var2).b.b);
                        z = false;
                        x340Var2.r(false);
                    } else {
                        z = false;
                        x340Var2.i0(724059232);
                        x340Var2.r(false);
                        qim0VarD = u291.d(nim0Var, 1.0f);
                    }
                    gfh0 gfh0VarC = t1c.c(een.h, z);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    xto1.e((qim0) null, 0, 0L, 0L, x340Var2, 0, 15);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var4 = x340Var3;
                boolean zY = x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2);
                rih1 rih1Var = rih1.a;
                if (!zY) {
                    x340Var4.b0();
                    return rih1Var;
                }
                cir0 cir0Var = (cir0) x340Var4.k(k2r0.a);
                d0r d0rVarC = cwl1.C(cir0Var.g());
                jc9 jc9Var = ((gzj) x340Var4.k(hhr0.a)).c;
                boolean zG = x340Var4.g(cir0Var) | x340Var4.g(jc9Var);
                Object objT = x340Var4.T();
                if (zG || objT == m4cVar) {
                    qqp qqpVar = (qqp) asq0Var.c.a.c;
                    bsq0 bsq0Var = (bsq0) qqpVar.d;
                    Activity activity = (Activity) bsq0Var.b.get();
                    c8o.l(activity);
                    psq0 psq0Var = (psq0) qqpVar.e;
                    RetrofitMaker retrofitMaker = (RetrofitMaker) bsq0Var.c.get();
                    c8o.l(retrofitMaker);
                    luk lukVar = (luk) bsq0Var.d.get();
                    c8o.l(lukVar);
                    yqg yqgVar = (yqg) bsq0Var.e.get();
                    c8o.l(yqgVar);
                    t8u0 t8u0Var = (t8u0) bsq0Var.g.get();
                    c8o.l(t8u0Var);
                    Flowable flowable = (Flowable) bsq0Var.h.get();
                    c8o.l(flowable);
                    n9r0 n9r0Var = (n9r0) bsq0Var.j.get();
                    c8o.l(n9r0Var);
                    i8h1 i8h1Var = (i8h1) bsq0Var.k.get();
                    c8o.l(i8h1Var);
                    fns fnsVar = igu.a;
                    c8o.m(fnsVar);
                    qsq0 qsq0Var = new qsq0(activity, psq0Var, retrofitMaker, lukVar, yqgVar, t8u0Var, flowable, n9r0Var, i8h1Var, fnsVar, cir0Var, jc9Var);
                    x340Var4.s0(qsq0Var);
                    objT = qsq0Var;
                }
                qsq0 qsq0Var2 = (qsq0) objT;
                Object objT2 = x340Var4.T();
                if (objT2 == m4cVar) {
                    objT2 = hu20.e(new p1e0(d3p1.F(d0rVarC, w3p1.o(new l4r(pwc0.B, 2, rfq0.Z, new j4r(new cnp0(asq0Var, (byte) 25)), rfq0.N0), rfq0.t), rih1Var), (byte) 27), new xrq0((lnm) null, d0rVarC, (byte) 0));
                    x340Var4.s0(objT2);
                }
                ven0 ven0VarG = rwq.g((mr20) objT2, (Object) null, (o8n) null, x340Var4, 48, 2);
                String str = (String) ven0VarG.getValue();
                boolean zI = x340Var4.i(asq0Var) | x340Var4.i(ven0VarG);
                Object objT3 = x340Var4.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new e3p0(asq0Var, ven0VarG, (lnm) null, (byte) 8);
                    x340Var4.s0(objT3);
                }
                qxd0.t(str, x340Var4, (vu30) objT3);
                boolean zG2 = x340Var4.g(qsq0Var2);
                Object objT4 = x340Var4.T();
                if (zG2 || objT4 == m4cVar) {
                    qsq0Var2.getClass();
                    objT4 = new gxp(qsq0Var2);
                    x340Var4.s0(objT4);
                }
                gxp gxpVar = (gxp) objT4;
                boolean zG3 = x340Var4.g(gxpVar);
                Object objT5 = x340Var4.T();
                if (zG3 || objT5 == m4cVar) {
                    gxp gxpVar2 = (gxp) ((exp) gxpVar.m.get()).a.c;
                    qsq0 qsq0Var3 = gxpVar2.a;
                    psq0 psq0Var2 = qsq0Var3.b;
                    luk lukVar2 = qsq0Var3.d;
                    d0rVar = d0rVarC;
                    osq0 osq0Var = new osq0(psq0Var2, qsq0Var3.j, (ujp) gxpVar2.e.get(), (ri41) gxpVar2.f.get(), gxpVar2.i, new cx0((byte) 12), new nu((byte) 23), (vep) gxpVar2.j.get(), (fxp) gxpVar2.k.get(), qsq0Var3.g, (w9u0) gxpVar2.l.get(), new v8r0(60, lukVar2), new w8r0(false, lukVar2), qsq0Var3.h, new t8r0(qsq0Var3.i, (byte) 19), new ts50(gxpVar2.a.a.getApplicationContext(), qsq0Var3.e), d0rVar);
                    x340Var4.s0(osq0Var);
                    objT5 = osq0Var;
                } else {
                    d0rVar = d0rVarC;
                }
                i1o1.e((osq0) objT5, rih1Var, d0rVar, (qim0) null, (ipb1) null, apo.r(-1027186674, new wrq0(asq0Var, (byte) 0), x340Var4), (xu30) null, 0, (xu30) null, x340Var4, 196656, 236);
                return rih1Var;
        }
    }
}
