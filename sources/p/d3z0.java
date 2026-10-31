package p;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d3z0 implements xpw {
    public final q8n a;
    public final bjx b;
    public final e7m0 c;
    public final ia00 d;
    public final psw e;

    public d3z0(b3z0 b3z0Var, cir0 cir0Var, wlq wlqVar, xlq xlqVar, zja1 zja1Var, q8n q8nVar) {
        this.a = q8nVar;
        q8n q8nVar2 = (q8n) ((jiz0) ((ojq) xlqVar.a.c).b).a.get();
        c8o.l(q8nVar2);
        bjx bjxVar = new bjx(q8nVar2, cir0Var);
        this.b = bjxVar;
        String str = b3z0Var.a;
        String str2 = b3z0Var.b;
        String str3 = b3z0Var.c;
        a3z0 a3z0Var = b3z0Var.d;
        boolean z = b3z0Var.e;
        Function0 function0 = b3z0Var.f;
        Function0 function1 = b3z0Var.g;
        p3z0 p3z0Var = new p3z0(str, str2, str3, a3z0Var, z, function0, function1, (oho1) null);
        wam0 wam0Var = new wam0((byte) 8);
        ojq ojqVar = (ojq) wlqVar.a.c;
        i6n0 i6n0VarC = ojqVar.c();
        i4q i4qVar = (i4q) ((jiz0) ojqVar.b).f.get();
        c8o.l(i4qVar);
        jiz0 jiz0Var = (jiz0) ojqVar.b;
        Context context = (Context) jiz0Var.e.get();
        c8o.l(context);
        jl21 jl21Var = (jl21) jiz0Var.o.get();
        c8o.l(jl21Var);
        k811 k811Var = new k811(context, jl21Var, (lik1) ojqVar.b1.get(), (byte) 23);
        kt91 kt91Var = (kt91) jiz0Var.l.get();
        c8o.l(kt91Var);
        lik1 lik1Var = (lik1) ojqVar.b1.get();
        q8n q8nVarA = jiz0Var.a();
        c8o.l(q8nVarA);
        q8n q8nVar3 = (q8n) jiz0Var.a.get();
        c8o.l(q8nVar3);
        x2z0 x2z0Var = new x2z0(i6n0VarC, i4qVar, k811Var, kt91Var, lik1Var, q8nVarA, q8nVar3, bjxVar, function0, function1);
        this.c = sbl.z(p3z0Var, wam0Var, x2z0Var.j, j8y0.Q0, new c3z0(this));
        this.d = n3o1.q(this).a(g2z0.d, g2z0.e);
        j2i j2iVar = new j2i(-1315073511, new zyy0(zja1Var, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
