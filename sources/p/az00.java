package p;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class az00 implements xpw {
    public final ia00 N0 = n3o1.q(this).a(new wx00(this, 1), jq00.X);
    public final psw O0;
    public final d0r X;
    public final cx0 Y;
    public final e7m0 Z;
    public final lik1 a;
    public final n6r0 b;
    public final bjx c;
    public final Scheduler d;
    public final Scheduler e;
    public final bhp f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final uny t;

    public az00(bct bctVar, ygp ygpVar, lik1 lik1Var, n6r0 n6r0Var, bjx bjxVar, zgp zgpVar, g1b g1bVar, ahp ahpVar, Scheduler scheduler, Scheduler scheduler2, op4 op4Var, bhp bhpVar, yqg yqgVar, boolean z, boolean z2, boolean z3, uny unyVar) {
        this.a = lik1Var;
        this.b = n6r0Var;
        this.c = bjxVar;
        this.d = scheduler;
        this.e = scheduler2;
        this.f = bhpVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.t = unyVar;
        this.X = bctVar.b;
        this.Y = ygpVar.a();
        this.Z = sbl.B(new dhm0((String) null, (String) null, false, false, (String) null, false, false, false, (LinkedHashSet) null, (LinkedHashSet) null, op4Var.a(), false, (LinkedHashSet) null, false, (xbe0) null, false, false, (ArrayList) null, String.valueOf(yqgVar.b()), 0, 1833983), new drm1((byte) 17), g1bVar, yty.U0, new gi00((Object) this, (byte) 4));
        j2i j2iVar = new j2i(-2129387008, new pj0(this, zgpVar, ahpVar, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.O0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.N0;
    }

    public final jsw c() {
        return this.O0;
    }

    public final mqw getBehavior() {
        return this.Z;
    }
}
