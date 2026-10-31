package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gln implements xpw {
    public final idd1 N0 = new idd1(new dln(this, (byte) 2));
    public final e7m0 O0;
    public final ia00 P0;
    public final psw Q0;
    public final w3f X;
    public final m5p Y;
    public final cb0 Z;
    public final wn50 a;
    public final los b;
    public final ggf c;
    public final gv51 d;
    public final z6q e;
    public final l5p f;
    public final a7q g;
    public final d6o0 h;
    public final q8n i;
    public final q8n t;

    public gln(h971 h971Var, lzn0 lzn0Var, wn50 wn50Var, los losVar, ggf ggfVar, gv51 gv51Var, z6q z6qVar, l5p l5pVar, a7q a7qVar, i6o0 i6o0Var, q8n q8nVar, q8n q8nVar2, w3f w3fVar, m5p m5pVar, cb0 cb0Var, pd71 pd71Var, jjz jjzVar, joo jooVar) {
        this.a = wn50Var;
        this.b = losVar;
        this.c = ggfVar;
        this.d = gv51Var;
        this.e = z6qVar;
        this.f = l5pVar;
        this.g = a7qVar;
        this.h = i6o0Var;
        this.i = q8nVar;
        this.t = q8nVar2;
        this.X = w3fVar;
        this.Y = m5pVar;
        this.Z = cb0Var;
        aln alnVar = new aln(b7x.a, false, null, w4i1.f, null, null, false);
        t2m t2mVar = t2m.e;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        kln klnVar = new kln(h971Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mkn.class), cancelPrevious.a(klnVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nkn.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hln(ggfVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(kkn.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new iln(lzn0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lkn.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mln(jooVar, pd71Var, jjzVar, lzn0Var)));
        this.O0 = sbl.B(alnVar, t2mVar, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), u2m.d1, new v7l(this, (byte) 28));
        this.P0 = n3o1.q(this).a(fdm.Z0, fdm.a1);
        j2i j2iVar = new j2i(332757709, new bfm(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.Q0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.P0;
    }

    public final jsw c() {
        return this.Q0;
    }

    public final mqw getBehavior() {
        return this.O0;
    }
}
