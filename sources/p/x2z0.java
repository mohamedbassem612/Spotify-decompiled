package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x2z0 {
    public final i6n0 a;
    public final i4q b;
    public final k811 c;
    public final kt91 d;
    public final lik1 e;
    public final q8n f;
    public final bjx g;
    public final Function0 h;
    public final Function0 i;
    public final a j;

    public x2z0(i6n0 i6n0Var, i4q i4qVar, k811 k811Var, kt91 kt91Var, lik1 lik1Var, q8n q8nVar, q8n q8nVar2, bjx bjxVar, Function0 function0, Function0 function1) {
        this.a = i6n0Var;
        this.b = i4qVar;
        this.c = k811Var;
        this.d = kt91Var;
        this.e = lik1Var;
        this.f = q8nVar2;
        this.g = bjxVar;
        this.h = function0;
        this.i = function1;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        w2z0 w2z0Var = new w2z0(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n2z0.class), runSequentially.a(w2z0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(k2z0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new q2z0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(l2z0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new r2z0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(m2z0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new s2z0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(j2z0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new t2z0(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(i2z0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new u2z0(this)));
        this.j = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }
}
