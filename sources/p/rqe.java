package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rqe implements qpe {
    public final q8n N0;
    public final Function0 O0;
    public final e7m0 P0;
    public final ia00 Q0;
    public final psw R0;
    public final exg1 X;
    public final mr4 Y;
    public final pe Z;
    public final yo2 a;
    public final m680 b;
    public final em0 c;
    public final g9m d;
    public final lz71 e;
    public final nu f;
    public final kvp g;
    public final w9u0 h;
    public final mpa1 i;
    public final g38 t;

    public rqe(yo2 yo2Var, m680 m680Var, em0 em0Var, g9m g9mVar, lz71 lz71Var, nu nuVar, kvp kvpVar, w9u0 w9u0Var, mpa1 mpa1Var, g38 g38Var, exg1 exg1Var, mr4 mr4Var, pe peVar, q8n q8nVar, Function0 function0) {
        this.a = yo2Var;
        this.b = m680Var;
        this.c = em0Var;
        this.d = g9mVar;
        this.e = lz71Var;
        this.f = nuVar;
        this.g = kvpVar;
        this.h = w9u0Var;
        this.i = mpa1Var;
        this.t = g38Var;
        this.X = exg1Var;
        this.Y = mr4Var;
        this.Z = peVar;
        this.N0 = q8nVar;
        this.O0 = function0;
        mle mleVar = mle.X0;
        dq7 dq7Var = new dq7(this, (byte) 3);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        gqe gqeVar = new gqe(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xpe.class), runSequentially.a(gqeVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wpe.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new iqe(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tpe.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jqe(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(upe.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kqe(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vpe.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lqe(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ype.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mqe(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zpe.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new nqe(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(aqe.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new oqe(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(spe.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new pqe(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rpe.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fqe(this)));
        a aVar = new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
        dqe dqeVar = dqe.a;
        dq7 dq7Var2 = new dq7(dq7Var, (byte) 21);
        cas casVar = new cas();
        casVar.a = eqe.b;
        this.P0 = new e7m0(mleVar, dq7Var2, aVar, dqeVar, casVar);
        this.Q0 = n3o1.q(this).a(new zee(this, (byte) 4), emd.a1);
        j2i j2iVar = new j2i(2067365803, new gtd(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.R0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.Q0;
    }

    public final jsw c() {
        return this.R0;
    }

    public final mqw getBehavior() {
        return this.P0;
    }
}
