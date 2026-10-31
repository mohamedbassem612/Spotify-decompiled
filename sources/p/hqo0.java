package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hqo0 extends hab0 implements iu30 {
    public final /* synthetic */ iqo0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqo0(iqo0 iqo0Var) {
        super(1);
        this.a = iqo0Var;
    }

    public final Object invoke(Object obj) {
        oro0 oro0Var = this.a.b;
        cro0 cro0Var = oro0Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        yqo0 yqo0Var = new yqo0(cro0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lqo0.class), runSequentially.a(yqo0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nqo0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new aro0(cro0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pqo0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tqo0(cro0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mqo0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uqo0(cro0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qqo0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wqo0(cro0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(oqo0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vqo0(cro0Var)));
        return Mobius.d(lro0.a, new a(cro0Var.j, coroutinesSubtypeEffectHandlerBuilderI)).d(new mro0(oro0Var)).b(new nro0(oro0Var));
    }
}
