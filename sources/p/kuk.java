package p;

import com.spotify.cosmos.rxrouter.RxRouter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class kuk implements jly0 {
    public static cvk A(jo80 jo80Var, r7q r7qVar, r7q r7qVar2, r7q r7qVar3, kly0 kly0Var, gbp gbpVar, r7q r7qVar4, kly0 kly0Var2, gbp gbpVar2, caq caqVar, r7q r7qVar5, kly0 kly0Var3, r7q r7qVar6, kly0 kly0Var4, caq caqVar2, caq caqVar3, caq caqVar4, caq caqVar5, thq thqVar) {
        cvk cvkVar = new cvk();
        cvkVar.a = jo80Var;
        cvkVar.b = r7qVar;
        cvkVar.c = r7qVar2;
        cvkVar.d = r7qVar3;
        cvkVar.e = kly0Var;
        cvkVar.f = gbpVar;
        cvkVar.g = r7qVar4;
        cvkVar.h = kly0Var2;
        cvkVar.i = gbpVar2;
        cvkVar.j = caqVar;
        cvkVar.k = r7qVar5;
        cvkVar.l = kly0Var3;
        cvkVar.m = r7qVar6;
        cvkVar.n = kly0Var4;
        cvkVar.o = caqVar2;
        cvkVar.p = caqVar3;
        cvkVar.q = caqVar4;
        cvkVar.r = caqVar5;
        cvkVar.s = thqVar;
        return cvkVar;
    }

    public static sam0 B(xm41 xm41Var, caq caqVar, dn41 dn41Var, tif1 tif1Var) {
        ym41 ym41Var = new ym41("ConfiguredBackground");
        ym41Var.a = dn41Var;
        jge jgeVarE = hu20.e(eqr0.m(xm41Var), new ms4((lnm) null, new hf31(new jjk(tif1Var, caqVar, (byte) 7), ym41Var, (byte) 17), (byte) 9));
        AtomicInteger atomicInteger = ym41.c;
        return hwb.u("ConfiguredBackground", jgeVarE, Collections.singleton(xm41Var), ym41Var.b, ym41Var.a);
    }

    public static Set C(e0l e0lVar, jo20 jo20Var) {
        return jo20Var.isEnabled() ? Collections.singleton(e0lVar) : w7x.a;
    }

    public static List D(e2x0 e2x0Var, fza fzaVar, eea0 eea0Var, pvc pvcVar, lhc lhcVar, sua suaVar, xq81 xq81Var, jd1 jd1Var, av8 av8Var, jxa jxaVar, ymm0 ymm0Var, nfb nfbVar, twa1 twa1Var, gna0 gna0Var, vee0 vee0Var, gna0 gna0Var2, vee0 vee0Var2, twa1 twa1Var2, tpp0 tpp0Var, s8y0 s8y0Var, jd1 jd1Var2) {
        return p7h.M(new k1v0[]{new k1v0(av8Var, fzaVar), new k1v0(jd1Var, e2x0Var), new k1v0(gna0Var, eea0Var), new k1v0(vee0Var, pvcVar), new k1v0(gna0Var2, lhcVar), new k1v0(vee0Var2, suaVar), new k1v0(jd1Var2, ymm0Var), new k1v0(s8y0Var, nfbVar), new k1v0(tpp0Var, jxaVar), new k1v0(twa1Var2, xq81Var), new k1v0(twa1Var, new ypa((byte) 20, false))});
    }

    public static fer a(b8p b8pVar) {
        return new fer((g0l) b8pVar.s.get(), b8pVar.a.e(), (p7s) b8pVar.Z.get());
    }

    public static sfr b(b8p b8pVar) {
        sfr sfrVar = (sfr) b8pVar.x.get();
        c8o.m(sfrVar);
        return sfrVar;
    }

    public static jo20 c(b8p b8pVar) {
        return new jo20(b8pVar.I, (byte) 0);
    }

    public static tfr d(b8p b8pVar) {
        return new tfr(b8pVar.a());
    }

    public static agr e(b8p b8pVar) {
        agr agrVar = (agr) b8pVar.t.get();
        c8o.m(agrVar);
        return agrVar;
    }

    public static itz f(b8p b8pVar) {
        itz itzVar = (itz) b8pVar.i0.get();
        c8o.m(itzVar);
        return itzVar;
    }

    public static lk g(b8p b8pVar) {
        lk lkVar = (lk) b8pVar.r.get();
        c8o.m(lkVar);
        return lkVar;
    }

    public static d89 h(b8p b8pVar) {
        d89 d89Var = (d89) b8pVar.D1.get();
        c8o.m(d89Var);
        return d89Var;
    }

    public static hir i(b8p b8pVar) {
        hir hirVar = (hir) b8pVar.H0.get();
        c8o.m(hirVar);
        return hirVar;
    }

    public static String j(b8p b8pVar) {
        return nho1.p(((q2e) b8pVar.B1.get()).a);
    }

    public static a3e k(b8p b8pVar) {
        a3e a3eVar = (a3e) b8pVar.Y0.get();
        c8o.m(a3eVar);
        return a3eVar;
    }

    public static qig l(b8p b8pVar) {
        qig qigVar = (qig) b8pVar.E1.get();
        c8o.m(qigVar);
        return qigVar;
    }

    public static g0l m(b8p b8pVar) {
        g0l g0lVar = (g0l) b8pVar.s.get();
        c8o.m(g0lVar);
        return g0lVar;
    }

    public static h0l n(b8p b8pVar) {
        h0l h0lVar = (h0l) b8pVar.s.get();
        c8o.m(h0lVar);
        return h0lVar;
    }

    public static knr o(b8p b8pVar) {
        knr knrVar = (knr) b8pVar.v.get();
        c8o.m(knrVar);
        return knrVar;
    }

    public static onr p(b8p b8pVar) {
        onr onrVar = (onr) b8pVar.y.get();
        c8o.m(onrVar);
        return onrVar;
    }

    public static f2l q(b8p b8pVar) {
        f2l f2lVar = (f2l) b8pVar.A1.get();
        c8o.m(f2lVar);
        return f2lVar;
    }

    public static rtz r(b8p b8pVar) {
        return new rtz(ulk1.f((RxRouter) b8pVar.a.H.get()));
    }

    public static y2l s(b8p b8pVar) {
        y2l y2lVar = (y2l) b8pVar.c.get();
        c8o.m(y2lVar);
        return y2lVar;
    }

    public static cor t(b8p b8pVar) {
        return new cor(new aod((dma1) b8pVar.a.M.get(), new uq8(new xid((i8h1) b8pVar.d.get(), new l2a((byte) 20), (byte) 28), (byte) 19), (byte) 26));
    }

    public static aod u(b8p b8pVar) {
        return new aod((dma1) b8pVar.a.M.get(), new uq8(new xid((i8h1) b8pVar.d.get(), new l2a((byte) 20), (byte) 28), (byte) 19), (byte) 26);
    }

    public static kor v(b8p b8pVar) {
        kor korVar = (kor) b8pVar.X.get();
        c8o.m(korVar);
        return korVar;
    }

    public static ark1 w(b8p b8pVar) {
        ark1 ark1Var = (ark1) b8pVar.K.get();
        c8o.m(ark1Var);
        return ark1Var;
    }

    public static qor x(b8p b8pVar) {
        qor qorVar = (qor) b8pVar.W.get();
        c8o.m(qorVar);
        return qorVar;
    }

    public static qor y(b8p b8pVar) {
        return (qor) b8pVar.V.get();
    }

    public static t8c z(ynb0 ynb0Var) {
        t8c t8cVar = new t8c((byte) 29);
        t8cVar.b = ynb0Var;
        return t8cVar;
    }
}
