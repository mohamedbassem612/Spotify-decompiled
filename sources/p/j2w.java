package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j2w extends hab0 implements vu30 {
    public final /* synthetic */ k2w a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2w(k2w k2wVar) {
        super(2);
        this.a = k2wVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        k2w k2wVar = this.a;
        do70 do70Var = k2wVar.b;
        f1n0 f1n0Var = k2wVar.a;
        jut jutVar = k2wVar.e;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        x2w x2wVar = new x2w(do70Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(t2w.class), cancelPrevious.a(x2wVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(s2w.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new z2w(do70Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(q2w.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new u2w(f1n0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(r2w.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new v2w(f1n0Var, jutVar)));
        return Mobius.d(i2w.a, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
