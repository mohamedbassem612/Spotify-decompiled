package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k2a0 {
    public final c2a0 a;
    public final q8n b;
    public final q8n c;

    public k2a0(c2a0 c2a0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = c2a0Var;
        this.b = q8nVar;
        this.c = q8nVar2;
    }

    public final MobiusLoop a() {
        drm1 drm1Var = new drm1((byte) 23);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        c2a0 c2a0Var = this.a;
        x1a0 x1a0Var = new x1a0(c2a0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o1a0.class), runSequentially.a(x1a0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(m1a0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new z1a0(c2a0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(p1a0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new s1a0(c2a0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(r1a0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new t1a0(c2a0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n1a0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new u1a0(c2a0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(q1a0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new v1a0(c2a0Var)));
        return l1d.g(Mobius.d(drm1Var, new a(c2a0Var.d, coroutinesSubtypeEffectHandlerBuilderI)).b(new ouz(this, (byte) 20)).d(new zc80(this, (byte) 4))).a(new l2a0(), f46.S0(new qxy0[]{r1a0.b, o1a0.b, m1a0.b}));
    }
}
