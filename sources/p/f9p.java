package p;

import android.content.Context;
import android.os.Parcelable;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider;
import com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider;
import com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider;
import com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f9p implements dl4 {
    public final Object N0;
    public final Object O0;
    public final Object P0;
    public final Object Q0;
    public final Object R0;
    public final Object S0;
    public final Object T0;
    public final Object U0;
    public final Object V0;
    public final Object W0;
    public final Object X;
    public final Object X0;
    public final Object Y;
    public final Object Y0;
    public final Object Z;
    public final Object Z0;
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public f9p(e7z e7zVar, g7z g7zVar, q7r0 q7r0Var) {
        this.a = (byte) 1;
        this.t = g7zVar;
        this.X = e7zVar;
        this.Y = q7r0Var;
        this.Z = new lbp(this, 1, (byte) 23);
        this.b = iy81.a(new lbp(this, 0, (byte) 23));
        this.c = iy81.a(new lbp(this, 2, (byte) 23));
        this.d = iy81.a(new lbp(this, 3, (byte) 23));
        this.e = iy81.a(new lbp(this, 5, (byte) 23));
        this.f = iy81.a(new lbp(this, 6, (byte) 23));
        this.g = iy81.a(new lbp(this, 7, (byte) 23));
        this.N0 = new g5t();
        this.O0 = new lbp(this, 10, (byte) 23);
        this.h = xqu.b(new lbp(this, 9, (byte) 23));
        g5t.a((g5t) this.N0, xqu.b(new lbp(this, 8, (byte) 23)));
        this.P0 = new g5t();
        this.i = xqu.b(new lbp(this, 12, (byte) 23));
        g5t.a((g5t) this.P0, xqu.b(new lbp(this, 11, (byte) 23)));
        this.Q0 = iy81.a(new lbp(this, 13, (byte) 23));
        this.R0 = iy81.a(new lbp(this, 14, (byte) 23));
        this.S0 = iy81.a(new lbp(this, 15, (byte) 23));
        this.T0 = iy81.a(new lbp(this, 4, (byte) 23));
        this.U0 = iy81.a(new lbp(this, 16, (byte) 23));
        this.V0 = iy81.a(new lbp(this, 17, (byte) 23));
        this.W0 = xqu.b(new lbp(this, 19, (byte) 23));
        this.X0 = xqu.b(new lbp(this, 18, (byte) 23));
        this.Y0 = iy81.a(new lbp(this, 20, (byte) 23));
        this.Z0 = iy81.a(new lbp(this, 21, (byte) 23));
    }

    public gj5 a() {
        gj5 gj5Var = (gj5) ((vm30) this.t).a.get();
        c8o.l(gj5Var);
        return gj5Var;
    }

    public mh4 b() {
        luk lukVarB = ((e7z) this.X).b();
        c8o.l(lukVarB);
        return new mh4(false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, lukVarB);
    }

    public yy4 c() {
        return new yy4((luk) ((e1o) this.t).f);
    }

    public m85 d() {
        return new m85(false, (luk) ((daq) this.X).L1.get());
    }

    public a42 e() {
        switch (this.a) {
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return new a42((aai0) ((daq) this.X).D9.get(), (byte) 25);
    }

    public zsc f() {
        byte b = this.a;
        Object obj = this.X;
        switch (b) {
            case 4:
                daq daqVar = (daq) obj;
                return new zsc((gw70) daqVar.d8.get(), (rol1) daqVar.Ln.get(), (q8n) daqVar.E1.get());
            case 5:
                daq daqVar2 = (daq) obj;
                return new zsc((gw70) daqVar2.d8.get(), (rol1) daqVar2.Ln.get(), (q8n) daqVar2.E1.get());
            case 6:
                daq daqVar3 = (daq) obj;
                return new zsc((gw70) daqVar3.d8.get(), (rol1) daqVar3.Ln.get(), (q8n) daqVar3.E1.get());
            default:
                daq daqVar4 = (daq) obj;
                return new zsc((gw70) daqVar4.d8.get(), (rol1) daqVar4.Ln.get(), (q8n) daqVar4.E1.get());
        }
    }

    public p8h g() {
        byte b = this.a;
        Object obj = this.X;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.N0;
        switch (b) {
            case 4:
                return s5h.l(xqu.a((p2p) obj4), xqu.a((jly0) obj3), xqu.a((jly0) obj2), new k85((luk) ((daq) obj).L1.get()));
            case 5:
                return s5h.l(xqu.a((s2q) obj4), xqu.a((jly0) obj3), xqu.a((jly0) obj2), new k85((luk) ((daq) obj).L1.get()));
            case 6:
                return s5h.l(xqu.a((s2q) obj4), xqu.a((jly0) obj3), xqu.a((jly0) obj2), new k85((luk) ((daq) obj).L1.get()));
            default:
                return s5h.l(xqu.a((obq) obj4), xqu.a((jly0) obj3), xqu.a((jly0) obj2), new k85((luk) ((daq) obj).L1.get()));
        }
    }

    public s2l1 h() {
        t2l1 t2l1Var = (t2l1) this.t;
        a8e0 a8e0Var = (a8e0) t2l1Var.h.get();
        c8o.l(a8e0Var);
        yuq yuqVar = (yuq) ((jly0) this.Y0).get();
        lzn0 lzn0Var = (lzn0) t2l1Var.j.get();
        c8o.l(lzn0Var);
        return new s2l1(a8e0Var, yuqVar, new ge8(lzn0Var, (byte) 8), (q6e0) ((jly0) this.Z0).get(), (u2l1) this.X);
    }

    public hqo i() {
        vm30 vm30Var = (vm30) this.t;
        t8u0 t8u0Var = (t8u0) vm30Var.p.get();
        c8o.l(t8u0Var);
        ruz ruzVarA = t8u0Var.a(p().getLifecycle()).a();
        iac0 iac0VarP = p();
        Flowable flowable = (Flowable) vm30Var.q.get();
        c8o.l(flowable);
        t8u0 t8u0Var2 = (t8u0) vm30Var.p.get();
        c8o.l(t8u0Var2);
        muz muzVarD = t8u0Var2.a(p().getLifecycle()).d();
        y390 y390Var = (y390) vm30Var.k.get();
        c8o.l(y390Var);
        wr00 wr00VarA = y390Var.a(p(), r6h1.c);
        zr00 zr00Var = (zr00) vm30Var.l.get();
        c8o.l(zr00Var);
        oi oiVar = new oi(wr00VarA, zr00Var, p());
        q7r0 q7r0Var = (q7r0) this.Y;
        hl00 hl00Var = new hl00(new c4n0(q7r0Var), (byte) 13);
        i8h1 i8h1VarZ = u1n0.z(q7r0Var);
        iac0 iac0VarP2 = p();
        b7r0 b7r0Var = (b7r0) vm30Var.m.get();
        c8o.l(b7r0Var);
        gn10 gn10Var = mno1.A;
        String str = (String) vm30Var.D.get();
        c8o.l(str);
        return new hqo(ruzVarA, iac0VarP, flowable, new pjt0(muzVarD, oiVar, hl00Var, i8h1VarZ, iac0VarP2, b7r0Var, d8.b(gn10Var, str, d8.c(new c4n0(q7r0Var)), u1n0.l(q7r0Var))));
    }

    public iir j() {
        e7z e7zVar = (e7z) this.X;
        luk lukVarB = e7zVar.b();
        c8o.l(lukVarB);
        yw7 yw7Var = new yw7(new go4(false, false, false, lukVarB).c(), b().n(), b().j());
        x3v0 x3v0Var = (x3v0) e7zVar.u0.get();
        c8o.l(x3v0Var);
        return new iir(yw7Var, x3v0Var, (byte) 18);
    }

    public aiv k() {
        byte b = this.a;
        Object obj = this.X;
        switch (b) {
            case 4:
                daq daqVar = (daq) obj;
                return new aiv(new xaz0(new jiv((Context) daqVar.x1.a, daq.s1(), daqVar.e0(), (rol1) daqVar.Ln.get()), (byte) 26), new aql1((t2j0) daqVar.f2.get(), new qpj1((ox5) daqVar.Gl.get(), (Context) daqVar.x1.a, (byte) 19)));
            case 5:
                daq daqVar2 = (daq) obj;
                return new aiv(new xaz0(new jiv((Context) daqVar2.x1.a, daq.s1(), daqVar2.e0(), (rol1) daqVar2.Ln.get()), (byte) 26), new aql1((t2j0) daqVar2.f2.get(), new qpj1((ox5) daqVar2.Gl.get(), (Context) daqVar2.x1.a, (byte) 19)));
            case 6:
                daq daqVar3 = (daq) obj;
                return new aiv(new xaz0(new jiv((Context) daqVar3.x1.a, daq.s1(), daqVar3.e0(), (rol1) daqVar3.Ln.get()), (byte) 26), new aql1((t2j0) daqVar3.f2.get(), new qpj1((ox5) daqVar3.Gl.get(), (Context) daqVar3.x1.a, (byte) 19)));
            default:
                daq daqVar4 = (daq) obj;
                Context context = (Context) daqVar4.x1.a;
                h380 h380VarB = j380.b(6);
                h380VarB.e("HOME_SCREEN", upu.v());
                h380VarB.e("LOCK_SCREEN", upu.x());
                h380VarB.e("COVER_SCREEN", new udn(new ulc((byte) 11)));
                h380VarB.e("MIUI_HOME_SCREEN", new yog1(false));
                h380VarB.e("TRANSSION_HOME_SCREEN", new vog1(new vx40((ox5) daqVar4.Gl.get(), daqVar4.e0(), (byte) 25)));
                h380VarB.e("TRANSSION_HOME_SCREEN_CARD", new vog1(new vx40((ox5) daqVar4.Gl.get(), daqVar4.e0(), (byte) 25)));
                return new aiv(new xaz0(new jiv(context, h380VarB.b(true), daqVar4.e0(), (rol1) daqVar4.Ln.get()), (byte) 26), new aql1((t2j0) daqVar4.f2.get(), new qpj1((ox5) daqVar4.Gl.get(), (Context) daqVar4.x1.a, (byte) 19)));
        }
    }

    public wr00 l() {
        y390 y390Var = (y390) ((e7z) this.X).I.get();
        c8o.l(y390Var);
        return y390Var.a(p(), r6h1.c);
    }

    public ae5 m() {
        switch (this.a) {
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return new ae5((t2j0) ((daq) this.X).f2.get());
    }

    public boolean n() {
        vm30 vm30Var = (vm30) this.t;
        luk lukVar = (luk) vm30Var.y.get();
        c8o.l(lukVar);
        return td70.b(new qm4(false, lukVar), ((Boolean) vm30Var.N.get()).booleanValue());
    }

    public bn70 o() {
        g7z g7zVar = (g7z) this.t;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarO3 = yon1.O3();
        Parcelable.Creator creator = lik1.CREATOR;
        return new bn70(p6r0VarO3, new lik1(g7zVar.a), (nar0) null);
    }

    public iac0 p() {
        byte b = this.a;
        Object obj = this.Y;
        switch (b) {
            case 1:
                iac0 iac0Var = ((q7r0) obj).d.c;
                c8o.m(iac0Var);
                return iac0Var;
            default:
                iac0 iac0Var2 = ((q7r0) obj).d.c;
                c8o.m(iac0Var2);
                return iac0Var2;
        }
    }

    public my30 q() {
        t2l1 t2l1Var = (t2l1) this.t;
        yqg yqgVar = (yqg) t2l1Var.b.get();
        c8o.l(yqgVar);
        String str = ((u2l1) this.X).a;
        c8o.m(str);
        String str2 = (String) ((jly0) this.b).get();
        t2j0 t2j0Var = (t2j0) t2l1Var.f.get();
        c8o.l(t2j0Var);
        nfa0 nfa0Var = (nfa0) t2l1Var.i.get();
        c8o.l(nfa0Var);
        return new my30(str, str2, yqgVar.b(), yqgVar, t2j0Var, nfa0Var);
    }

    public aru0 r() {
        e1o e1oVar = (e1o) this.t;
        return new aru0((gw70) e1oVar.c, new m35(false, (luk) e1oVar.f), (ycm) e1oVar.g, (byte) 21);
    }

    public myq0 s() {
        return new myq0((clm) ((d7p) this.Z).get(), xqu.a((d7p) this.T0), (byte) 19);
    }

    public ytp0 t() {
        e1o e1oVar = (e1o) this.t;
        yh2 yh2Var = (yh2) e1oVar.F;
        vb2 vb2Var = (vb2) e1oVar.E;
        return new ytp0(yh2Var, (zr00) e1oVar.G, ((y390) e1oVar.H).a((iac0) e1oVar.C, r6h1.c), (qns0) e1oVar.D, vb2Var, (byte) 11);
    }

    public muz u() {
        t8u0 t8u0Var = (t8u0) ((e7z) this.X).i.get();
        c8o.l(t8u0Var);
        return t8u0Var.a(p().getLifecycle()).d();
    }

    public aru0 v() {
        return new aru0((yqg) ((d7p) this.X).get(), (nwt) ((d7p) this.Y).get(), (clm) ((d7p) this.Z).get(), (byte) 20);
    }

    public void w(Object obj) {
        byte b = this.a;
        Object obj2 = this.T0;
        Object obj3 = this.Y0;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.Z0;
        Object obj7 = this.Z;
        Object obj8 = this.Y;
        Object obj9 = this.X;
        switch (b) {
            case 3:
                AllboardingActivity allboardingActivity = (AllboardingActivity) obj;
                qm3 qm3Var = (qm3) ((p2p) obj8).get();
                zs3 zs3Var = new zs3();
                Object obj10 = this.b;
                oj80 oj80Var = new oj80(new km3(qm3Var, zs3Var, (edr0) ((jly0) obj10).get()), Optional.empty(), (byte) 29);
                daq daqVar = (daq) obj9;
                daqVar.getClass();
                allboardingActivity.a1 = new mu3(new om3(oj80Var, new gs3((dma1) daqVar.C1.get()), new lan1((dp60) daqVar.uc.get(), (byte) 13), new hu3((zle1) daqVar.a3.get()), new g23((uz5) daqVar.Ne.get(), (String) daqVar.Oe.get(), (Context) daqVar.x1.a, (byte) 11)), (Scheduler) daqVar.r3.get(), (Scheduler) daqVar.z1.get(), (qe41) ((jo80) obj7).a);
                allboardingActivity.c1 = (jgu) daqVar.a.g0.get();
                allboardingActivity.h1 = new q59((r2b1) daqVar.al.get(), new w44(false, (luk) daqVar.L1.get()), (byte) 18);
                allboardingActivity.d1 = (rg30) ((jly0) this.f).get();
                allboardingActivity.e1 = (gir0) ((jly0) this.d).get();
                allboardingActivity.g1 = (en3) ((jly0) this.c).get();
                allboardingActivity.f1 = (edr0) ((jly0) obj10).get();
                break;
            case 4:
                CoverScreenWidgetProvider coverScreenWidgetProvider = (CoverScreenWidgetProvider) obj;
                daq daqVar2 = (daq) obj9;
                ((kaa) coverScreenWidgetProvider).d = xqu.a(daqVar2.Ln);
                ((kaa) coverScreenWidgetProvider).c = xqu.a((p2p) obj8);
                ((kaa) coverScreenWidgetProvider).b = new spl1(xqu.a((p2p) obj7), xqu.a((p2p) obj6), xqu.a((p2p) obj5), xqu.a(daqVar2.fm), xqu.a(daqVar2.Il), xqu.a((p2p) obj4), xqu.a((p2p) obj3), xqu.a((p2p) obj2), xqu.a(daqVar2.Hl), xqu.a(daqVar2.Kl), xqu.a(daqVar2.l5), (q8n) daqVar2.r2.get());
                coverScreenWidgetProvider.f = new udn(new ulc((byte) 11));
                break;
            case 5:
                MiuiDynamicNpvWidgetProvider miuiDynamicNpvWidgetProvider = (MiuiDynamicNpvWidgetProvider) obj;
                daq daqVar3 = (daq) obj9;
                ((kaa) miuiDynamicNpvWidgetProvider).d = xqu.a(daqVar3.Ln);
                ((kaa) miuiDynamicNpvWidgetProvider).c = xqu.a((s2q) obj8);
                ((kaa) miuiDynamicNpvWidgetProvider).b = new spl1(xqu.a((s2q) obj7), xqu.a((s2q) obj6), xqu.a((s2q) obj5), xqu.a(daqVar3.fm), xqu.a(daqVar3.Il), xqu.a((s2q) obj4), xqu.a((s2q) obj3), xqu.a((s2q) obj2), xqu.a(daqVar3.Hl), xqu.a(daqVar3.Kl), xqu.a(daqVar3.l5), (q8n) daqVar3.r2.get());
                miuiDynamicNpvWidgetProvider.f = new yog1(false);
                break;
            case 6:
                NpvWidgetProvider npvWidgetProvider = (NpvWidgetProvider) obj;
                daq daqVar4 = (daq) obj9;
                ((kaa) npvWidgetProvider).d = xqu.a(daqVar4.Ln);
                ((kaa) npvWidgetProvider).c = xqu.a((s2q) obj8);
                ((kaa) npvWidgetProvider).b = new spl1(xqu.a((s2q) obj7), xqu.a((s2q) obj6), xqu.a((s2q) obj5), xqu.a(daqVar4.fm), xqu.a(daqVar4.Il), xqu.a((s2q) obj4), xqu.a((s2q) obj3), xqu.a((s2q) obj2), xqu.a(daqVar4.Hl), xqu.a(daqVar4.Kl), xqu.a(daqVar4.l5), (q8n) daqVar4.r2.get());
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                npvWidgetProvider.f = new fiv(yon1.j4().c);
                break;
            default:
                TranssionCardWidgetProvider transsionCardWidgetProvider = (TranssionCardWidgetProvider) obj;
                daq daqVar5 = (daq) obj9;
                ((kaa) transsionCardWidgetProvider).d = xqu.a(daqVar5.Ln);
                ((kaa) transsionCardWidgetProvider).c = xqu.a((obq) obj8);
                ((kaa) transsionCardWidgetProvider).b = new spl1(xqu.a((obq) obj7), xqu.a((obq) obj6), xqu.a((obq) obj5), xqu.a(daqVar5.fm), xqu.a(daqVar5.Il), xqu.a((obq) obj4), xqu.a((obq) obj3), xqu.a((obq) obj2), xqu.a(daqVar5.Hl), xqu.a(daqVar5.Kl), xqu.a(daqVar5.l5), (q8n) daqVar5.r2.get());
                transsionCardWidgetProvider.f = new vog1(new vx40((ox5) daqVar5.Gl.get(), daqVar5.e0(), (byte) 25));
                break;
        }
    }

    public m111 x() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.X;
        switch (b) {
            case 4:
                return ((p85) ((daq) obj3).Il.get()).g() ? (ktc) ((jly0) obj2).get() : (piq0) ((jly0) obj).get();
            case 5:
                return ((p85) ((daq) obj3).Il.get()).g() ? (ktc) ((jly0) obj2).get() : (piq0) ((jly0) obj).get();
            case 6:
                return ((p85) ((daq) obj3).Il.get()).g() ? (ktc) ((jly0) obj2).get() : (piq0) ((jly0) obj).get();
            default:
                return ((p85) ((daq) obj3).Il.get()).g() ? (ktc) ((jly0) obj2).get() : (piq0) ((jly0) obj).get();
        }
    }

    public String y() {
        String str = ((wm30) this.X).a;
        c8o.m(str);
        return str;
    }

    public f9p(t2l1 t2l1Var, u2l1 u2l1Var, q7r0 q7r0Var) {
        this.a = (byte) 8;
        this.t = t2l1Var;
        this.X = u2l1Var;
        this.Y = q7r0Var;
        this.b = xqu.b(new tsq(this, 2, (byte) 23));
        this.c = xqu.b(new tsq(this, 3, (byte) 23));
        this.d = xqu.b(new tsq(this, 6, (byte) 23));
        this.e = xqu.b(new tsq(this, 5, (byte) 23));
        this.f = xqu.b(new tsq(this, 7, (byte) 23));
        this.g = xqu.b(new tsq(this, 4, (byte) 23));
        this.h = xqu.b(new tsq(this, 8, (byte) 23));
        this.i = xqu.b(new tsq(this, 10, (byte) 23));
        this.Z = xqu.b(new tsq(this, 9, (byte) 23));
        this.N0 = xqu.b(new tsq(this, 11, (byte) 23));
        this.O0 = xqu.b(new tsq(this, 12, (byte) 23));
        this.P0 = xqu.b(new tsq(this, 13, (byte) 23));
        this.Q0 = xqu.b(new tsq(this, 14, (byte) 23));
        this.R0 = xqu.b(new tsq(this, 15, (byte) 23));
        this.S0 = xqu.b(new tsq(this, 1, (byte) 23));
        this.T0 = xqu.b(new tsq(this, 17, (byte) 23));
        this.U0 = xqu.b(new tsq(this, 18, (byte) 23));
        this.V0 = xqu.b(new tsq(this, 16, (byte) 23));
        this.W0 = iy81.a(new tsq(this, 19, (byte) 23));
        this.X0 = iy81.a(new tsq(this, 20, (byte) 23));
        this.Y0 = iy81.a(new tsq(this, 0, (byte) 23));
        this.Z0 = xqu.b(new tsq(this, 21, (byte) 23));
    }

    public f9p(e1o e1oVar) {
        this.a = (byte) 0;
        this.t = e1oVar;
        this.X = new d7p(this, 3, (byte) 18);
        this.Y = new d7p(this, 4, (byte) 18);
        this.Z = new d7p(this, 5, (byte) 18);
        this.N0 = new d7p(this, 8, (byte) 18);
        this.O0 = new d7p(this, 7, (byte) 18);
        this.P0 = new d7p(this, 9, (byte) 18);
        this.Q0 = new d7p(this, 10, (byte) 18);
        this.R0 = new d7p(this, 11, (byte) 18);
        this.S0 = new d7p(this, 12, (byte) 18);
        this.T0 = new d7p(this, 6, (byte) 18);
        this.U0 = new d7p(this, 14, (byte) 18);
        this.V0 = new d7p(this, 15, (byte) 18);
        this.W0 = new d7p(this, 18, (byte) 18);
        this.b = xqu.b(new d7p(this, 17, (byte) 18));
        this.c = iy81.a(new d7p(this, 16, (byte) 18));
        this.X0 = new d7p(this, 19, (byte) 18);
        this.d = iy81.a(new d7p(this, 13, (byte) 18));
        this.Y0 = new d7p(this, 20, (byte) 18);
        this.Z0 = new d7p(this, 21, (byte) 18);
        this.e = iy81.a(new d7p(this, 2, (byte) 18));
        this.f = iy81.a(new d7p(this, 22, (byte) 18));
        this.g = iy81.a(new d7p(this, 1, (byte) 18));
        this.h = iy81.a(new d7p(this, 0, (byte) 18));
        this.i = iy81.a(new d7p(this, 23, (byte) 18));
    }

    public f9p(w390 w390Var, yh2 yh2Var, vb2 vb2Var, y5v0 y5v0Var, t740 t740Var, x290 x290Var, i1r0 i1r0Var, o78 o78Var, uu00 uu00Var, kv00 kv00Var, ll30 ll30Var, lzn0 lzn0Var, x1i1 x1i1Var, c9c0 c9c0Var, g0l g0lVar, b9q b9qVar, h9k0 h9k0Var, kt91 kt91Var, yqg yqgVar, xrc0 xrc0Var, e7p0 e7p0Var, h5q h5qVar, b7r0 b7r0Var, Flowable flowable, q8n q8nVar) {
        this.a = (byte) 9;
        this.t = w390Var;
        this.X = yh2Var;
        this.Y = vb2Var;
        this.Z = y5v0Var;
        this.N0 = t740Var;
        this.O0 = x290Var;
        this.P0 = i1r0Var;
        this.Q0 = o78Var;
        this.R0 = uu00Var;
        this.S0 = kv00Var;
        this.T0 = ll30Var;
        this.U0 = lzn0Var;
        this.V0 = x1i1Var;
        this.W0 = c9c0Var;
        this.X0 = g0lVar;
        this.Y0 = b9qVar;
        this.Z0 = h9k0Var;
        this.b = kt91Var;
        this.c = yqgVar;
        this.d = xrc0Var;
        this.e = e7p0Var;
        this.f = h5qVar;
        this.g = b7r0Var;
        this.h = flowable;
        this.i = q8nVar;
    }

    public f9p(vm30 vm30Var, wm30 wm30Var, q7r0 q7r0Var) {
        this.a = (byte) 2;
        this.t = vm30Var;
        this.X = wm30Var;
        this.Y = q7r0Var;
        byte b = 10;
        this.Z = new chp(this, 1, b);
        this.b = xqu.b(new chp(this, 2, b));
        this.c = xqu.b(new chp(this, 5, b));
        this.N0 = new chp(this, 4, b);
        this.O0 = new chp(this, 6, b);
        this.P0 = new chp(this, 7, b);
        this.d = xqu.b(new chp(this, 3, b));
        this.e = xqu.b(new chp(this, 0, b));
        this.f = xqu.b(new chp(this, 11, b));
        this.g = xqu.b(new chp(this, 12, b));
        this.h = iy81.a(new chp(this, 14, b));
        this.i = xqu.b(new chp(this, 13, b));
        this.Q0 = xqu.b(new chp(this, 15, b));
        this.R0 = xqu.b(new chp(this, 16, b));
        this.S0 = new chp(this, 17, b);
        this.T0 = xqu.b(new chp(this, 18, b));
        this.U0 = xqu.b(new chp(this, b, b));
        this.V0 = xqu.b(new chp(this, 19, b));
        this.W0 = xqu.b(new chp(this, 9, b));
        this.X0 = xqu.b(new chp(this, 20, b));
        this.Y0 = xqu.b(new chp(this, 8, b));
        this.Z0 = xqu.b(new chp(this, 21, b));
    }

    public f9p(daq daqVar, AllboardingActivity allboardingActivity) {
        this.a = (byte) 3;
        this.X = daqVar;
        this.t = allboardingActivity;
        byte b = 12;
        this.Y = new p2p(daqVar, this, 0, b);
        this.b = xqu.b(new p2p(daqVar, this, 1, b));
        this.Z = jo80.a(allboardingActivity);
        this.N0 = new p2p(daqVar, this, 3, b);
        this.O0 = new p2p(daqVar, this, 5, b);
        this.P0 = new p2p(daqVar, this, 4, b);
        this.Q0 = new p2p(daqVar, this, 6, b);
        this.R0 = new p2p(daqVar, this, 7, b);
        this.c = xqu.b(new p2p(daqVar, this, 9, b));
        this.S0 = new p2p(daqVar, this, 8, b);
        this.d = xqu.b(new p2p(daqVar, this, 11, b));
        this.e = xqu.b(new p2p(daqVar, this, b, b));
        this.T0 = new p2p(daqVar, this, 14, b);
        new p2p(daqVar, this, 13, b);
        this.U0 = new p2p(daqVar, this, 10, b);
        this.V0 = new p2p(daqVar, this, 15, b);
        this.W0 = new p2p(daqVar, this, 16, b);
        this.X0 = new p2p(daqVar, this, 19, b);
        this.Y0 = new p2p(daqVar, this, 18, b);
        this.Z0 = new p2p(daqVar, this, 17, b);
        this.g = new p2p(daqVar, this, 20, b);
        this.h = new p2p(daqVar, this, 21, b);
        this.i = new p2p(daqVar, this, 22, b);
        this.f = xqu.b(new p2p(daqVar, this, 2, b));
    }

    public f9p(daq daqVar, CoverScreenWidgetProvider coverScreenWidgetProvider) {
        this.a = (byte) 4;
        this.X = daqVar;
        this.t = coverScreenWidgetProvider;
        byte b = 26;
        this.Y = new p2p(daqVar, this, 0, b);
        this.b = xqu.b(new p2p(daqVar, this, 2, b));
        this.Z = new p2p(daqVar, this, 1, b);
        this.c = iy81.a(new p2p(daqVar, this, 6, b));
        this.d = xqu.b(new p2p(daqVar, this, 5, b));
        this.e = xqu.b(new p2p(daqVar, this, 7, b));
        this.N0 = new p2p(daqVar, this, 8, b);
        this.f = xqu.b(new p2p(daqVar, this, 9, b));
        this.O0 = new p2p(daqVar, this, 11, b);
        this.g = xqu.b(new p2p(daqVar, this, 10, b));
        this.P0 = new p2p(daqVar, this, 4, b);
        this.Q0 = new p2p(daqVar, this, 12, b);
        this.R0 = new p2p(daqVar, this, 13, b);
        this.S0 = new p2p(daqVar, this, 14, b);
        this.T0 = new p2p(daqVar, this, 16, b);
        this.U0 = new p2p(daqVar, this, 17, b);
        this.V0 = new p2p(daqVar, this, 18, b);
        this.W0 = new p2p(daqVar, this, 19, b);
        this.X0 = new p2p(daqVar, this, 15, b);
        this.Y0 = new p2p(daqVar, this, 20, b);
        this.Z0 = new p2p(daqVar, this, 3, b);
        this.h = new p2p(daqVar, this, 21, b);
        this.i = new p2p(daqVar, this, 22, b);
    }

    public f9p(daq daqVar, TranssionCardWidgetProvider transsionCardWidgetProvider) {
        this.a = (byte) 7;
        this.X = daqVar;
        this.t = transsionCardWidgetProvider;
        this.Y = new obq(daqVar, this, 0, (byte) 8);
        this.b = xqu.b(new obq(daqVar, this, 2, (byte) 8));
        this.Z = new obq(daqVar, this, 1, (byte) 8);
        this.c = iy81.a(new obq(daqVar, this, 6, (byte) 8));
        this.d = xqu.b(new obq(daqVar, this, 5, (byte) 8));
        this.e = xqu.b(new obq(daqVar, this, 7, (byte) 8));
        this.N0 = new obq(daqVar, this, 8, (byte) 8);
        this.f = xqu.b(new obq(daqVar, this, 9, (byte) 8));
        this.O0 = new obq(daqVar, this, 11, (byte) 8);
        this.g = xqu.b(new obq(daqVar, this, 10, (byte) 8));
        this.P0 = new obq(daqVar, this, 4, (byte) 8);
        this.Q0 = new obq(daqVar, this, 12, (byte) 8);
        this.R0 = new obq(daqVar, this, 13, (byte) 8);
        this.S0 = new obq(daqVar, this, 14, (byte) 8);
        this.T0 = new obq(daqVar, this, 16, (byte) 8);
        this.U0 = new obq(daqVar, this, 17, (byte) 8);
        this.V0 = new obq(daqVar, this, 18, (byte) 8);
        this.W0 = new obq(daqVar, this, 19, (byte) 8);
        this.X0 = new obq(daqVar, this, 15, (byte) 8);
        this.Y0 = new obq(daqVar, this, 20, (byte) 8);
        this.Z0 = new obq(daqVar, this, 3, (byte) 8);
        this.h = new obq(daqVar, this, 21, (byte) 8);
        this.i = new obq(daqVar, this, 22, (byte) 8);
    }

    public f9p(daq daqVar, MiuiDynamicNpvWidgetProvider miuiDynamicNpvWidgetProvider) {
        this.a = (byte) 5;
        this.X = daqVar;
        this.t = miuiDynamicNpvWidgetProvider;
        this.Y = new s2q(daqVar, this, 0, (byte) 15);
        this.b = xqu.b(new s2q(daqVar, this, 2, (byte) 15));
        this.Z = new s2q(daqVar, this, 1, (byte) 15);
        this.c = iy81.a(new s2q(daqVar, this, 6, (byte) 15));
        this.d = xqu.b(new s2q(daqVar, this, 5, (byte) 15));
        this.e = xqu.b(new s2q(daqVar, this, 7, (byte) 15));
        this.N0 = new s2q(daqVar, this, 8, (byte) 15);
        this.f = xqu.b(new s2q(daqVar, this, 9, (byte) 15));
        this.O0 = new s2q(daqVar, this, 11, (byte) 15);
        this.g = xqu.b(new s2q(daqVar, this, 10, (byte) 15));
        this.P0 = new s2q(daqVar, this, 4, (byte) 15);
        this.Q0 = new s2q(daqVar, this, 12, (byte) 15);
        this.R0 = new s2q(daqVar, this, 13, (byte) 15);
        this.S0 = new s2q(daqVar, this, 14, (byte) 15);
        this.T0 = new s2q(daqVar, this, 16, (byte) 15);
        this.U0 = new s2q(daqVar, this, 17, (byte) 15);
        this.V0 = new s2q(daqVar, this, 18, (byte) 15);
        this.W0 = new s2q(daqVar, this, 19, (byte) 15);
        this.X0 = new s2q(daqVar, this, 15, (byte) 15);
        this.Y0 = new s2q(daqVar, this, 20, (byte) 15);
        this.Z0 = new s2q(daqVar, this, 3, (byte) 15);
        this.h = new s2q(daqVar, this, 21, (byte) 15);
        this.i = new s2q(daqVar, this, 22, (byte) 15);
    }

    public f9p(daq daqVar, NpvWidgetProvider npvWidgetProvider) {
        this.a = (byte) 6;
        this.X = daqVar;
        this.t = npvWidgetProvider;
        this.Y = new s2q(daqVar, this, 0, (byte) 18);
        this.b = xqu.b(new s2q(daqVar, this, 2, (byte) 18));
        this.Z = new s2q(daqVar, this, 1, (byte) 18);
        this.c = iy81.a(new s2q(daqVar, this, 6, (byte) 18));
        this.d = xqu.b(new s2q(daqVar, this, 5, (byte) 18));
        this.e = xqu.b(new s2q(daqVar, this, 7, (byte) 18));
        this.N0 = new s2q(daqVar, this, 8, (byte) 18);
        this.f = xqu.b(new s2q(daqVar, this, 9, (byte) 18));
        this.O0 = new s2q(daqVar, this, 11, (byte) 18);
        this.g = xqu.b(new s2q(daqVar, this, 10, (byte) 18));
        this.P0 = new s2q(daqVar, this, 4, (byte) 18);
        this.Q0 = new s2q(daqVar, this, 12, (byte) 18);
        this.R0 = new s2q(daqVar, this, 13, (byte) 18);
        this.S0 = new s2q(daqVar, this, 14, (byte) 18);
        this.T0 = new s2q(daqVar, this, 16, (byte) 18);
        this.U0 = new s2q(daqVar, this, 17, (byte) 18);
        this.V0 = new s2q(daqVar, this, 18, (byte) 18);
        this.W0 = new s2q(daqVar, this, 19, (byte) 18);
        this.X0 = new s2q(daqVar, this, 15, (byte) 18);
        this.Y0 = new s2q(daqVar, this, 20, (byte) 18);
        this.Z0 = new s2q(daqVar, this, 3, (byte) 18);
        this.h = new s2q(daqVar, this, 21, (byte) 18);
        this.i = new s2q(daqVar, this, 22, (byte) 18);
    }
}
