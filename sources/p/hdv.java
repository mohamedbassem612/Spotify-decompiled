package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hdv implements xpw {
    public final boolean X;
    public final psw Y;
    public final ia00 Z;
    public final g431 a;
    public final cdv b;
    public final mr20 c;
    public final kv51 d;
    public final ecp e;
    public final p40 f;
    public final fcp g;
    public final vdv h;
    public final bev i;
    public final e7m0 t;

    public hdv(g431 g431Var, cdv cdvVar, mr20 mr20Var, kv51 kv51Var, ecp ecpVar, p40 p40Var, fcp fcpVar, ydv ydvVar, hcp hcpVar, vdv vdvVar, Scheduler scheduler) {
        ccv ccvVar;
        this.a = g431Var;
        this.b = cdvVar;
        this.c = mr20Var;
        this.d = kv51Var;
        this.e = ecpVar;
        this.f = p40Var;
        this.g = fcpVar;
        this.h = vdvVar;
        bev bevVar = ydvVar.b;
        this.i = bevVar;
        edv edvVar = new edv(this, (byte) 0);
        drm1 drm1Var = new drm1((byte) 13);
        goq goqVar = ydvVar.a;
        switch (hcpVar.a) {
            case 0:
                e93 e93Var = (e93) ((lbp) hcpVar.b).c;
                q8n q8nVar = (q8n) ((udv) e93Var.c).i.get();
                c8o.l(q8nVar);
                lzn0 lzn0Var = (lzn0) ((udv) e93Var.c).a.get();
                c8o.l(lzn0Var);
                esg esgVar = new esg(lzn0Var);
                vbp vbpVar = (vbp) ((jly0) e93Var.O0).get();
                bl3 bl3Var = (bl3) ((udv) e93Var.c).g.get();
                c8o.l(bl3Var);
                ccvVar = new ccv(q8nVar, esgVar, vbpVar, new owf1(bl3Var, (byte) 6), (wbp) ((jly0) e93Var.P0).get(), bevVar, goqVar);
                break;
            case 1:
                thq thqVar = hcpVar.b;
                q8n q8nVar2 = (q8n) thqVar.b.V2.get();
                v5q v5qVar = thqVar.c;
                ccvVar = new ccv(q8nVar2, new esg((lzn0) v5qVar.U0.get()), (vbp) v5qVar.x1.get(), new owf1((bl3) v5qVar.b.q8.get(), (byte) 6), (wbp) v5qVar.y1.get(), bevVar, goqVar);
                break;
            case 2:
                r7q r7qVar = hcpVar.b;
                q8n q8nVar3 = (q8n) r7qVar.b.V2.get();
                s7q s7qVar = r7qVar.d;
                ccvVar = new ccv(q8nVar3, new esg((lzn0) s7qVar.U0.get()), (vbp) s7qVar.B9.get(), new owf1((bl3) s7qVar.b.q8.get(), (byte) 6), (wbp) s7qVar.C9.get(), bevVar, goqVar);
                break;
            default:
                thq thqVar2 = hcpVar.b;
                q8n q8nVar4 = (q8n) thqVar2.b.V2.get();
                teq teqVar = thqVar2.c;
                ccvVar = new ccv(q8nVar4, new esg((lzn0) teqVar.a.b.i.get()), (vbp) teqVar.a.j4.get(), new owf1((bl3) teqVar.a.a.q8.get(), (byte) 6), (wbp) teqVar.a.k4.get(), bevVar, goqVar);
                break;
        }
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        sbv sbvVar = new sbv(ccvVar.b);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kbv.class), runSequentially.a(sbvVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lbv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new xbv(ccvVar.e)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qbv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zbv(ccvVar.c)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rbv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bcv(ccvVar.f)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mbv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tbv(ccvVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nbv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ubv(ccvVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(obv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vbv(ccvVar)));
        this.t = sbl.A(edvVar, drm1Var, new a(ccvVar.a, coroutinesSubtypeEffectHandlerBuilderI), qlt.e1, new wrs(scheduler, this, (byte) 19));
        this.X = cdvVar instanceof adv;
        j2i j2iVar = new j2i(1300973610, new ent(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.Y = new psw(j2iVar, (byte) 0);
        this.Z = n3o1.q(this).a(riu.W0, riu.X0);
    }

    public final rqw a() {
        return this.Z;
    }

    public final jsw c() {
        return this.Y;
    }

    public final void e(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-839643911);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            lia1 lia1Var = (lia1) ven0Var.getValue();
            if (lia1Var == null) {
                x340Var.i0(57938489);
                x340Var.r(false);
            } else {
                x340Var.i0(57938490);
                boolean z = (i2 & 14) == 4;
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new hws(iu30Var, (byte) 14);
                    x340Var.s0(objT2);
                }
                iu30 iu30Var2 = (iu30) objT2;
                boolean zI = x340Var.i(ven0Var);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new iwr(ven0Var, (byte) 9);
                    x340Var.s0(objT3);
                }
                zdv.a(lia1Var, iu30Var2, (Function0) objT3, x340Var, 0);
                x340Var.r(false);
            }
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT4);
            }
            ven0 ven0Var2 = (ven0) objT4;
            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                x340Var.i0(58284233);
                boolean zI2 = x340Var.i(ven0Var2);
                Object objT5 = x340Var.T();
                if (zI2 || objT5 == m4cVar) {
                    objT5 = new iwr(ven0Var2, (byte) 10);
                    x340Var.s0(objT5);
                }
                nho1.g((Function0) objT5, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(58376489);
                x340Var.r(false);
            }
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            boolean zI3 = x340Var.i(this) | x340Var.i(ven0VarS) | x340Var.i(ven0Var2) | x340Var.i(ven0Var);
            Object objT6 = x340Var.T();
            if (zI3 || objT6 == m4cVar) {
                swn swnVar = new swn(this, ven0VarS, ven0Var2, ven0Var, (lnm) null, (byte) 28);
                x340Var.s0(swnVar);
                objT6 = swnVar;
            }
            qxd0.t(this.a, x340Var, (vu30) objT6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o1t(this, iu30Var, i, (byte) 11);
        }
    }

    public final rdv f(ddv ddvVar) {
        List list;
        cns cnsVar;
        if (ddvVar == null || (list = ddvVar.b) == null) {
            list = z6x.a;
        }
        List list2 = list;
        w7x w7xVar = w7x.a;
        if (ddvVar == null || (cnsVar = ddvVar.a) == null) {
            cnsVar = new cns(w7xVar, w7xVar, w7xVar);
        }
        la61 la61Var = new la61(cnsVar);
        ak3 ak3Var = this.h.a;
        lia1 lia1Var = lia1.a;
        fg91 fg91Var = fg91.b;
        return new rdv("", list2, true, 1, false, la61Var, lia1Var, fg91Var, fg91Var, 0, ak3Var, w7xVar);
    }

    public final mqw getBehavior() {
        return this.t;
    }
}
