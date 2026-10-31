package p;

import android.app.Activity;
import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mmr {
    public final gw70 a;
    public final lzn0 b;
    public final dg8 c;
    public final rm5 d;
    public final kt91 e;
    public final yqg f;
    public final i4q g;
    public final Activity h;
    public final f971 i;
    public final jl21 j;
    public final l6d k;
    public final j6d l;
    public final y1t0 m;
    public final q3c n;
    public final xrk o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ic9 f29p;

    public mmr(gw70 gw70Var, lzn0 lzn0Var, dg8 dg8Var, rm5 rm5Var, kt91 kt91Var, yqg yqgVar, i4q i4qVar, Activity activity, f971 f971Var, jl21 jl21Var, l6d l6dVar, j6d j6dVar, y1t0 y1t0Var, q3c q3cVar, xrk xrkVar, dma1 dma1Var) {
        this.a = gw70Var;
        this.b = lzn0Var;
        this.c = dg8Var;
        this.d = rm5Var;
        this.e = kt91Var;
        this.f = yqgVar;
        this.g = i4qVar;
        this.h = activity;
        this.i = f971Var;
        this.j = jl21Var;
        this.k = l6dVar;
        this.l = j6dVar;
        this.m = y1t0Var;
        this.n = q3cVar;
        this.o = xrkVar;
        this.f29p = new ic9(dma1Var);
    }

    public final tdk a(d0r d0rVar) {
        z2p z2pVar = (z2p) ((i7p) new z2p(new h9n(this, (byte) 8)).a.get()).a.b;
        gw70 gw70Var = ((mmr) ((h9n) z2pVar.b).b).a;
        c8o.l(gw70Var);
        lzn0 lzn0Var = ((mmr) ((h9n) z2pVar.b).b).b;
        c8o.l(lzn0Var);
        mmr mmrVar = (mmr) ((h9n) z2pVar.b).b;
        dg8 dg8Var = mmrVar.c;
        rm5 rm5Var = mmrVar.d;
        kt91 kt91Var = mmrVar.e;
        c8o.l(kt91Var);
        yqg yqgVar = ((mmr) ((h9n) z2pVar.b).b).f;
        c8o.l(yqgVar);
        mmr mmrVar2 = (mmr) ((h9n) z2pVar.b).b;
        xrk xrkVar = mmrVar2.o;
        boolean z = xrkVar.i;
        boolean z2 = xrkVar.j;
        boolean z3 = xrkVar.k;
        boolean zB = xoi1.b(mmrVar2.h.getApplicationContext());
        mmr mmrVar3 = (mmr) ((h9n) z2pVar.b).b;
        xrk xrkVar2 = mmrVar3.o;
        boolean z4 = xrkVar2.o;
        boolean z5 = xrkVar2.p;
        i4q i4qVar = mmrVar3.g;
        c8o.l(i4qVar);
        dg8 dg8Var2 = mmrVar3.c;
        rm5 rm5Var2 = mmrVar3.d;
        kt91 kt91Var2 = mmrVar3.e;
        c8o.l(kt91Var2);
        iac0 iac0Var = mmrVar3.h;
        f971 f971Var = mmrVar3.i;
        c8o.l(f971Var);
        jl21 jl21Var = mmrVar3.j;
        c8o.l(jl21Var);
        l6d l6dVar = mmrVar3.k;
        c8o.l(l6dVar);
        tck tckVar = new tck(i4qVar, dg8Var2, rm5Var2, kt91Var2, iac0Var, f971Var, jl21Var, l6dVar, mmrVar3.o.h);
        j6d j6dVar = ((mmr) ((h9n) z2pVar.b).b).l;
        c8o.l(j6dVar);
        mmr mmrVar4 = (mmr) ((h9n) z2pVar.b).b;
        y1t0 y1t0Var = mmrVar4.m;
        q3c q3cVar = mmrVar4.n;
        Resources resources = mmrVar4.h.getResources();
        c8o.l(resources);
        return new tdk(gw70Var, lzn0Var, dg8Var, rm5Var, kt91Var, yqgVar, z, z2, z3, zB, z4, z5, tckVar, j6dVar, y1t0Var, q3cVar, resources, ((mmr) ((h9n) z2pVar.b).b).f29p, d0rVar);
    }
}
