package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class haz0 {
    public final ro30 a;
    public final dh30 b;
    public final qzn0 c;
    public final q8n d;
    public final q8n e;
    public final ro30 f;
    public final wam0 g;

    public haz0(ro30 ro30Var, dh30 dh30Var, qzn0 qzn0Var, q8n q8nVar, q8n q8nVar2, ro30 ro30Var2, wam0 wam0Var) {
        this.a = ro30Var;
        this.b = dh30Var;
        this.c = qzn0Var;
        this.d = q8nVar;
        this.e = q8nVar2;
        this.f = ro30Var2;
        this.g = wam0Var;
    }

    public final MobiusLoop a() {
        dq7 dq7Var = new dq7(this.g, (byte) 23);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ro30 ro30Var = this.a;
        w5z0 w5z0Var = new w5z0(ro30Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c5z0.class), runSequentially.a(w5z0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(a5z0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y5z0(this.f)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f5z0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new a6z0(ro30Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(s5z0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new c6z0(this.b)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g5z0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new u5z0(this.c)));
        return Mobius.d(dq7Var, new a(this.e, coroutinesSubtypeEffectHandlerBuilderI)).b(new vgq0(this, (byte) 26)).d(new rut0(this, (byte) 17)).a(new iaz0(), Collections.singleton(f5z0.a));
    }
}
