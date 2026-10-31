package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class b8j0 implements jly0 {
    public static z4q0 A(f9j0 f9j0Var) {
        z4q0 z4q0Var = (z4q0) ((esp) f9j0Var).D.get();
        c8o.m(z4q0Var);
        return z4q0Var;
    }

    public static w7q0 B(f9j0 f9j0Var) {
        w7q0 w7q0Var = (w7q0) ((esp) f9j0Var).q.get();
        c8o.m(w7q0Var);
        return w7q0Var;
    }

    public static c8d0 C(kzp kzpVar) {
        return new c8d0(kzpVar, (byte) 29);
    }

    public static bz31 D(f9j0 f9j0Var) {
        bz31 bz31Var = (bz31) ((esp) f9j0Var).e.get();
        c8o.m(bz31Var);
        return bz31Var;
    }

    public static g38 a(n8q n8qVar, u3x0 u3x0Var) {
        return n8qVar.a(u3x0Var);
    }

    public static kcs b() {
        return new kcs();
    }

    public static esp c(g3z g3zVar) {
        return new esp(g3zVar);
    }

    public static l9g0 d(ynb0 ynb0Var, ynb0 ynb0Var2) {
        l9g0 l9g0Var = new l9g0((byte) 10);
        l9g0Var.b = ynb0Var;
        l9g0Var.c = ynb0Var2;
        return l9g0Var;
    }

    public static crj0 e(jo80 jo80Var, kly0 kly0Var, caq caqVar, caq caqVar2, jly0 jly0Var, caq caqVar3, caq caqVar4) {
        crj0 crj0Var = new crj0();
        crj0Var.a = jo80Var;
        crj0Var.b = kly0Var;
        crj0Var.c = caqVar;
        crj0Var.d = caqVar2;
        crj0Var.e = jly0Var;
        crj0Var.f = caqVar3;
        crj0Var.g = caqVar4;
        return crj0Var;
    }

    public static zsj0 f(caq caqVar) {
        zsj0 zsj0Var = new zsj0();
        zsj0Var.a = caqVar;
        return zsj0Var;
    }

    public static sic g(f9j0 f9j0Var) {
        sic sicVar = (sic) ((esp) f9j0Var).d.get();
        c8o.m(sicVar);
        return sicVar;
    }

    public static ejc h(f9j0 f9j0Var) {
        ejc ejcVar = (ejc) ((esp) f9j0Var).z.get();
        c8o.m(ejcVar);
        return ejcVar;
    }

    public static kjc i(f9j0 f9j0Var) {
        kjc kjcVar = (kjc) ((esp) f9j0Var).A.get();
        c8o.m(kjcVar);
        return kjcVar;
    }

    public static ojc j(f9j0 f9j0Var) {
        ojc ojcVar = (ojc) ((esp) f9j0Var).y.get();
        c8o.m(ojcVar);
        return ojcVar;
    }

    public static tlc k(f9j0 f9j0Var) {
        tlc tlcVar = (tlc) ((esp) f9j0Var).j.get();
        c8o.m(tlcVar);
        return tlcVar;
    }

    public static vlc l(f9j0 f9j0Var) {
        vlc vlcVar = (vlc) ((esp) f9j0Var).B.get();
        c8o.m(vlcVar);
        return vlcVar;
    }

    public static emc m(f9j0 f9j0Var) {
        emc emcVar = (emc) ((esp) f9j0Var).C.get();
        c8o.m(emcVar);
        return emcVar;
    }

    public static emc n(f9j0 f9j0Var) {
        emc emcVar = (emc) ((esp) f9j0Var).C.get();
        c8o.m(emcVar);
        return emcVar;
    }

    public static hmc o(f9j0 f9j0Var) {
        hmc hmcVar = (hmc) ((esp) f9j0Var).o.get();
        c8o.m(hmcVar);
        return hmcVar;
    }

    public static kmc p(f9j0 f9j0Var) {
        kmc kmcVar = (kmc) ((esp) f9j0Var).i.get();
        c8o.m(kmcVar);
        return kmcVar;
    }

    public static mmc q(f9j0 f9j0Var) {
        mmc mmcVar = (mmc) ((esp) f9j0Var).f17p.get();
        c8o.m(mmcVar);
        return mmcVar;
    }

    public static d0r r(q7r0 q7r0Var) {
        return cwl1.C(q7r0Var);
    }

    public static uf0 s(f9j0 f9j0Var) {
        return new uf0((Context) ((esp) f9j0Var).a.b.get());
    }

    public static c5j0 t(f9j0 f9j0Var) {
        c5j0 c5j0Var = (c5j0) ((esp) f9j0Var).m.get();
        c8o.m(c5j0Var);
        return c5j0Var;
    }

    public static uo5 u(mwb mwbVar, jt4 jt4Var) {
        return new uo5(mwbVar, jt4Var);
    }

    public static dxy v(bbr0 bbr0Var) {
        return new dxy(new ik30(bbr0Var, (byte) 3), new ik30(bbr0Var, (byte) 4));
    }

    public static mwb w(t2j0 t2j0Var) {
        return new mwb(t2j0Var);
    }

    public static rxj0 x(drj0 drj0Var) {
        return drj0Var.g();
    }

    public static tpj0 y(jt4 jt4Var, thq thqVar, dxy dxyVar, uo5 uo5Var, Scheduler scheduler, q8n q8nVar) {
        kt4 kt4Var = (kt4) thqVar.get();
        return kt4Var.a() ? new spj0(jt4Var, dxyVar, uo5Var, scheduler, kt4Var.b(), q8nVar) : new jco0();
    }

    public static y4q0 z(f9j0 f9j0Var) {
        y4q0 y4q0Var = (y4q0) ((esp) f9j0Var).r.get();
        c8o.m(y4q0Var);
        return y4q0Var;
    }
}
