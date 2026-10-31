package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uc61 implements drb {
    public final String a;
    public final jpq b;
    public final m021 c;
    public final yp4 d;
    public final kpq e;
    public final lpq f;
    public final bpb1 g = gio1.b(Boolean.FALSE);
    public final dt71 h;
    public final LinkedHashMap i;
    public final xe01 j;
    public final xe01 k;
    public final String l;
    public final dt71 m;
    public final xe01 n;
    public final yd91 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mr20 f46p;
    public final o3r q;
    public final dc31 r;
    public final kc61 s;

    public uc61(koc0 koc0Var, u9c0 u9c0Var, String str, jpq jpqVar, m021 m021Var, yp4 yp4Var, kpq kpqVar, lpq lpqVar) {
        this.a = str;
        this.b = jpqVar;
        this.c = m021Var;
        this.d = yp4Var;
        this.e = kpqVar;
        this.f = lpqVar;
        byte b = 0;
        byte b2 = 1;
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        this.h = dt71VarE;
        this.i = new LinkedHashMap();
        roc0 roc0Var = (roc0) koc0Var;
        mr20 mr20VarU = rqt0.u(new wzv0(new kr41(roc0Var.d(), (byte) 5), (byte) 19));
        alb1 alb1VarA = ey71.a(3);
        z6x z6xVar = z6x.a;
        xe01 xe01VarT = d5p1.t(mr20VarU, u9c0Var, alb1VarA, new yc61(z6xVar));
        xe01 xe01VarT2 = d5p1.t(new nev0(xe01VarT, (byte) 4), u9c0Var, ey71.a(3), z6xVar);
        this.j = xe01VarT2;
        this.k = d5p1.t(new qc61(xe01VarT2, this, b), u9c0Var, ey71.a(3), (Object) null);
        this.l = "session_control";
        this.m = dt71VarE;
        this.n = d5p1.t(new qc61(xe01VarT, this, b2), u9c0Var, ey71.a(3), new rrb(5, fg91.b));
        this.o = new yd91(3, new lc61(this, b2));
        this.f46p = rqt0.u(new zo51(roc0Var.d(), this, (byte) 6));
        this.q = w3p1.o(new l4r(pwc0.b, 1, ec61.g, new j4r(new kc61(this, b2)), ec61.h), ec61.f);
        this.r = new dc31(this);
        this.s = new kc61(this, b);
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            mb61 mb61Var = (mb61) obj;
            if (!this.d.b() || !mb61Var.c) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p.xe91
    public final l381 c() {
        return this.r;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.o;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.f46p;
    }

    @Override // p.r2g
    public final Integer i() {
        return 1;
    }

    @Override // p.drb
    public final mr20 l() {
        return this.m;
    }

    @Override // p.drb
    public final Object o(qrb qrbVar, hsb hsbVar) {
        Boolean boolValueOf = Boolean.valueOf(qrbVar.a);
        bpb1 bpb1Var = this.g;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, boolValueOf);
        return rih1.a;
    }

    @Override // p.drb
    public final iu30 p() {
        return this.s;
    }

    @Override // p.drb
    public final xe01 r() {
        return this.n;
    }

    @Override // p.drb
    public final String v() {
        return this.l;
    }
}
