package p;

import android.os.Bundle;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d751 implements c931 {
    public final kdn0 X;
    public final g931 a;
    public final Scheduler b;
    public final yrg0 c;
    public final jb51 d;
    public final hc51 e;
    public z551 f;
    public final wb51 g;
    public final kdn0 h;
    public final kdn0 i;
    public final CompositeDisposable t;

    public d751(y651 y651Var, g931 g931Var, Scheduler scheduler, yrg0 yrg0Var, jb51 jb51Var, gyh gyhVar, hc51 hc51Var, Bundle bundle, sck1 sck1Var) {
        od51 od51Var;
        ib51 ib51Var = jb51Var.a;
        this.a = g931Var;
        this.b = scheduler;
        this.c = yrg0Var;
        this.d = jb51Var;
        this.e = hc51Var;
        kdn0 kdn0Var = new kdn0();
        this.h = kdn0Var;
        this.i = kdn0Var;
        this.t = new CompositeDisposable();
        this.X = new kdn0(l3r.c);
        boolean z = bundle != null;
        String string = z ? bundle != null ? bundle.getString("query") : null : null;
        string = string == null ? y651Var.c : string;
        z551 z551VarA = z551.a(z551.P0, string == null ? "" : string, string == null ? "" : string, 0, null, null, null, null, null, null, 0, null, null, false, new h1z0((gyhVar == null || string == null || string.length() == 0) ? null : gyhVar), false, 24572);
        z551 z551Var = z ? ib51Var.b : z551VarA;
        this.f = z551Var != null ? z551Var : z551VarA;
        if (z && string != null && string.length() != 0 && (od51Var = ib51Var.a) != null) {
            kdn0Var.m(od51Var);
        }
        hc51Var.e(new p4g0(1, (byte) 20));
        if (gyhVar == null) {
            this.g = hc51Var.d(1);
        } else {
            this.g = hc51Var.d(3);
        }
        z551 z551Var2 = this.f;
        kop kopVar = (kop) ((lmp) g931Var.b).a.c;
        Scheduler schedulerP0 = kopVar.a.p0();
        c8o.l(schedulerP0);
        di4 di4VarD = kopVar.d();
        ww41 ww41Var = kopVar.a;
        p551 p551Var = new p551(new jqd0(di4VarD.a(), kopVar.h(), kopVar.d(), (byte) 17), new m39(new ulc((byte) 23), new pob((byte) 9, false), kopVar.d()), new ij01(kopVar.d(), (byte) 17), new xaz0(kopVar.d(), new ejb((byte) 24)), new o551(kopVar.d(), new ejb((byte) 24)), new xgc(new ejb((byte) 24), (byte) 23), new ks21(new ejb((byte) 24), kopVar.d(), (byte) 8), new mhc(new ejb((byte) 24), (byte) 23), new rpv0(kopVar.d(), new ejb((byte) 24)), new khc(new ejb((byte) 24), (byte) 23), new ubc((byte) 23), new nhc((byte) 23), new lhc((byte) 23), new nbc((byte) 23), new vhc((byte) 23));
        ov41 ov41Var = new ov41(kopVar.d(), new ejb((byte) 24));
        z141 z141VarC = ww41Var.C();
        c8o.l(z141VarC);
        Observable observable = (Observable) kopVar.f.get();
        Flowable flowableF = ww41Var.f();
        c8o.l(flowableF);
        zr00 zr00VarL = ww41Var.L();
        c8o.l(zr00VarL);
        yh2 yh2VarW = ww41Var.w();
        c8o.l(yh2VarW);
        o241 o241VarI = ww41Var.i();
        c8o.l(o241VarI);
        y441 y441Var = new y441(z141VarC, observable, flowableF, new g931(zr00VarL, yh2VarW, o241VarI, (byte) 7));
        yon yonVar = new yon(kopVar.a(), new hce1(kopVar.s(), new g2z((String) kopVar.h.get(), (yqg) kopVar.d.get(), kopVar.d(), new pob((byte) 2, false), new o551(kopVar.d()), kopVar.l(), (psc) kopVar.i.get(), kopVar.t()), new vnd1((yqg) kopVar.d.get(), kopVar.d(), (byte) 6), new n0v0((byte) 28), kopVar.t()), (t5h1) kopVar.j.get(), kopVar.u(), (byte) 6);
        yon yonVar2 = new yon(kopVar.a(), new ur00(kopVar.s(), new uu0((String) kopVar.h.get(), (yqg) kopVar.d.get(), kopVar.d(), kopVar.d().u(), new lmw(kopVar.d(), (byte) 15), new o551(kopVar.d()), new pob((byte) 2, false), kopVar.l(), (psc) kopVar.i.get()), new w2z((yqg) kopVar.d.get(), kopVar.d(), (byte) 21), new kp00(kopVar.d(), new o551(kopVar.d()), (byte) 14), new n0v0((byte) 28), (byte) 2), (t5h1) kopVar.j.get(), kopVar.u(), (byte) 5);
        on01 on01VarN0 = ww41Var.N0();
        c8o.l(on01VarN0);
        z211 z211VarP = ww41Var.P();
        c8o.l(z211VarP);
        k4e0 k4e0Var = new k4e0(on01VarN0, z211VarP, kopVar.d(), kopVar.u(), (byte) 0);
        RxRouter rxRouterP = ww41Var.p();
        c8o.l(rxRouterP);
        fwp0 fwp0VarZ = rx31.z(rxRouterP);
        hfb hfbVar = new hfb((byte) 18, false);
        t2b t2bVar = new t2b((byte) 18, false);
        f8b f8bVarE0 = ww41Var.E0();
        c8o.l(f8bVarE0);
        uu00 uu00VarA = ww41Var.A();
        c8o.l(uu00VarA);
        o4e0 o4e0Var = new o4e0(new rzo0(fwp0VarZ, hfbVar, t2bVar, f8bVarE0, new nw41(uu00VarA)), (byte) 13);
        on01 on01VarN1 = ww41Var.N0();
        c8o.l(on01VarN1);
        cz1 cz1Var = new cz1(on01VarN1, (byte) 0);
        o751 o751VarV = kopVar.v();
        q8n q8nVarL0 = ww41Var.l0();
        c8o.l(q8nVarL0);
        phi0 phi0Var = new phi0(o751VarV, q8nVarL0);
        on01 on01VarN2 = ww41Var.N0();
        c8o.l(on01VarN2);
        cz1 cz1Var2 = new cz1(on01VarN2, (byte) 2);
        on01 on01VarN3 = ww41Var.N0();
        c8o.l(on01VarN3);
        cz1 cz1Var3 = new cz1(on01VarN3, (byte) 4);
        on01 on01VarN4 = ww41Var.N0();
        c8o.l(on01VarN4);
        cz1 cz1Var4 = new cz1(on01VarN4, (byte) 3);
        o4e0 o4e0Var2 = new o4e0(kopVar.h(), (byte) 12);
        ew41 ew41VarO0 = ww41Var.O0();
        c8o.l(ew41VarO0);
        bk1 bk1Var = new bk1(ew41VarO0, (byte) 7);
        aas aasVarU0 = ww41Var.U0();
        c8o.l(aasVarU0);
        b7r0 b7r0VarQ0 = ww41Var.Q0();
        c8o.l(b7r0VarQ0);
        qn1 qn1Var = new qn1(aasVarU0, b7r0VarQ0, (byte) 0);
        oj3 oj3VarM = ww41Var.M();
        c8o.l(oj3VarM);
        bk1 bk1Var2 = new bk1(oj3VarM, (byte) 1);
        yon yonVar3 = new yon(kopVar.a(), kopVar.f(), (t5h1) kopVar.j.get(), kopVar.u(), (byte) 4);
        so soVar = new so(kopVar.f(), (t5h1) kopVar.j.get(), (byte) 11);
        yon yonVar4 = new yon(kopVar.a(), new ix7(kopVar.s(), new p39((String) kopVar.h.get(), kopVar.d(), kopVar.d().u(), new m39(kopVar.d()), kopVar.l(), (psc) kopVar.i.get(), kopVar.t()), new mre0((yqg) kopVar.d.get(), (byte) 15), (byte) 16), (t5h1) kopVar.j.get(), kopVar.u(), (byte) 3);
        z211 z211VarP2 = ww41Var.P();
        c8o.l(z211VarP2);
        hce1 hce1Var = new hce1(sck1Var.o(), new y551(schedulerP0, p551Var, ov41Var, y441Var, new ly41(yonVar, yonVar2, k4e0Var, o4e0Var, cz1Var, phi0Var, cz1Var2, cz1Var3, cz1Var4, o4e0Var2, bk1Var, qn1Var, bk1Var2, yonVar3, soVar, yonVar4, new g2x0(z211VarP2, kopVar.u(), (byte) 4), new od30((psc) kopVar.i.get(), (byte) 21)), z551Var2), n9p1.s(sck1Var));
        tka0 tka0VarB = rc11.a.b(u551.class);
        String strO = tka0VarB.o();
        if (strO != null) {
            g931Var.d = hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB);
        } else {
            hhg1.n("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    @Override // p.c931
    public final void c(Bundle bundle) {
        od51 od51Var;
        if (ihc1.y0(this.f.b) || (od51Var = this.d.a.a) == null) {
            return;
        }
        this.h.m(od51Var);
    }

    @Override // p.c931
    public final void clear() {
        u551 u551Var = (u551) this.a.d;
        if (u551Var != null) {
            u551Var.S();
        } else {
            u890.C("mobiusViewModel");
            throw null;
        }
    }

    public final ymd0 getState() {
        return this.X;
    }

    public final Bundle serialize() {
        od51 od51Var = (od51) this.h.e();
        z551 z551Var = this.f;
        ib51 ib51Var = this.d.a;
        ib51Var.b = z551Var;
        if (od51Var != null) {
            ib51Var.a = od51Var;
        }
        Bundle bundle = new Bundle();
        u551 u551Var = (u551) this.a.d;
        if (u551Var != null) {
            bundle.putString("query", ((z551) u551Var.V()).a);
            return bundle;
        }
        u890.C("mobiusViewModel");
        throw null;
    }

    public final void start() {
    }

    public final void stop() {
    }
}
