package p;

import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pn31 implements c4h1, q0r {
    public final ttj a;
    public final d0r b;
    public final llm c;
    public final uq8 d;
    public final xe01 e;
    public final v3h1 f;
    public final ArrayList g;
    public final rhg0 h;

    public pn31(c9n c9nVar, j2i j2iVar, ttj ttjVar, d0r d0rVar) {
        this.a = ttjVar;
        this.b = d0rVar;
        llm llmVarE = smo1.e(c9nVar.J().y(new gaa0(c9nVar.J().A(fkj0.W0))));
        this.c = llmVarE;
        uq8 uq8Var = new uq8((byte) 28);
        this.d = uq8Var;
        lnm lnmVar = null;
        tzj tzjVar = new tzj(null, 3);
        bpb1 bpb1VarB = gio1.b(new kam(tzjVar));
        p311 p311Var = new p311(llmVarE.a);
        h4k h4kVar = new h4k(p311Var, new wzj(tzjVar));
        byte b = 1;
        h4kVar.A(new j2i(1525986131, new mzj(d0rVar, uq8Var, j2iVar, (byte) 14), true));
        byte b2 = 0;
        fn31.T(llmVarE, (o8n) null, 0, new cuk(p311Var, h4kVar, (lnm) null, (byte) 8), 3);
        v1k v1kVar = new v1k(llmVarE, bpb1VarB, tzjVar, (byte) 9);
        synchronized (h4kVar.d) {
            oi oiVar = h4kVar.T0;
            oiVar.c = v1kVar;
            oiVar.b = true;
        }
        vll vllVar = vll.S0;
        synchronized (pv91.c) {
            pv91.i = o7h.O0(vllVar, pv91.i);
        }
        pv91.c();
        op71.z(llmVarE.a).L(new kjk(new iv91(vllVar, (byte) 1), p311Var, (byte) 10));
        xe01 xe01VarH = d5p1.h(bpb1VarB);
        this.e = xe01VarH;
        this.h = new rhg0(d0rVar, (ukj0) null);
        if (!u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            hhg1.n("RootContentHost must be created on the Main thread.");
            throw null;
        }
        d0rVar.a(this);
        ArrayList arrayList = new ArrayList();
        vzj vzjVar = ((kam) xe01VarH.a.getValue()).b;
        if ((vzjVar instanceof tzj ? (tzj) vzjVar : null) == null) {
            eg.m("ContentDSL shouldn't produce top level item.");
            throw null;
        }
        tzj tzjVar2 = (tzj) vzjVar;
        v3h1 v3h1VarP = q0o1.p(new z2k(tzjVar2), tzjVar2.f, arrayList);
        this.f = v3h1VarP;
        this.g = arrayList;
        v3h1VarP.n(this);
        fn31.T(llmVarE, (o8n) null, 0, new on31(this, lnmVar, b2), 3);
        fn31.T(llmVarE, (o8n) null, 0, new on31(this, lnmVar, b), 3);
        fn31.T(llmVarE, (o8n) null, 0, new on31(this, lnmVar, (byte) 2), 3);
    }

    public final void b() {
        err0 err0Var = (err0) this.d.b;
        err0Var.t(err0Var.s() + 1);
        this.f.l();
        c();
    }

    public final void c() {
        v3h1 v3h1Var = this.f;
        v3h1Var.a();
        ttj ttjVar = this.a;
        bpb1 bpb1Var = ttjVar.a;
        int i = ttjVar.b + 1;
        ttjVar.b = i;
        bpb1Var.m((Object) null, new d4h1(i, v3h1Var));
    }

    public final void e(v3h1 v3h1Var) {
    }
}
