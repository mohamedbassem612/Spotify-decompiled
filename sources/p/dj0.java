package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dj0 implements Connectable {
    public final /* synthetic */ a a;

    public dj0(fj0 fj0Var, i01 i01Var, q8n q8nVar, pxc pxcVar, ao0 ao0Var, i44 i44Var) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        xi0 xi0Var = new xi0(fj0Var, ao0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(jeu.class), runSequentially.a(xi0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nny0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yi0(ao0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ojb0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zi0(pxcVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bva.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new aj0(i01Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x57.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bj0(i44Var, i01Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bm21.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cj0(i44Var, ao0Var)));
        this.a = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
    }

    public final Connection L(Consumer consumer) {
        return this.a.L(consumer);
    }
}
