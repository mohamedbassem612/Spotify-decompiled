package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nit0 implements xpw {
    public final e7m0 a;
    public final eih1 b;
    public final psw c;

    public nit0(fit0 fit0Var, cmq cmqVar, dmq dmqVar, emq emqVar) {
        bot0 bot0Var = new bot0(fit0Var.b, fit0Var.c, fit0Var.d.size(), fit0Var.e, fit0Var.d);
        wam0 wam0Var = new wam0((byte) 6);
        ojq ojqVar = (ojq) cmqVar.a.c;
        i6n0 i6n0VarC = ojqVar.c();
        gw70 gw70VarB = ((ivj) ojqVar.i1).b();
        c8o.l(gw70VarB);
        jiz0 jiz0Var = (jiz0) ojqVar.b;
        kt91 kt91Var = (kt91) jiz0Var.l.get();
        c8o.l(kt91Var);
        lzn0 lzn0VarB = jiz0Var.b();
        c8o.l(lzn0VarB);
        q8n q8nVarA = jiz0Var.a();
        c8o.l(q8nVarA);
        q8n q8nVar = (q8n) jiz0Var.a.get();
        c8o.l(q8nVar);
        Scheduler scheduler = (Scheduler) jiz0Var.d.get();
        c8o.l(scheduler);
        vht0 vht0Var = new vht0(i6n0VarC, gw70VarB, kt91Var, lzn0VarB, q8nVarA, q8nVar, scheduler);
        this.a = sbl.z(bot0Var, wam0Var, vht0Var.h, new t1t0(fit0Var, (byte) 6), new mit0(fit0Var, (byte) 1));
        this.b = new eih1();
        j2i j2iVar = new j2i(-145711050, new pj0(fit0Var, dmqVar, emqVar, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.b;
    }

    public final jsw c() {
        return this.c;
    }

    public final mqw getBehavior() {
        return this.a;
    }
}
