package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.extras.CompositeLogger;
import com.spotify.mobius.extras.SLF4JLogger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class guy0 extends hab0 implements iu30 {
    public final /* synthetic */ huy0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public guy0(huy0 huy0Var) {
        super(1);
        this.a = huy0Var;
    }

    public final Object invoke(Object obj) {
        euy0 euy0Var = this.a.a;
        zty0 zty0Var = new zty0();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        kdy0 kdy0Var = euy0Var.c;
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        auy0 auy0Var = new auy0(kdy0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mty0.class), runSequentially.a(auy0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nty0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new buy0(kdy0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(lty0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cuy0(euy0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(oty0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new duy0(euy0Var)));
        MobiusLoop.Builder builderD = Mobius.d(zty0Var, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI));
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = euy0Var.a;
        mr20[] mr20VarArr = {euy0Var.b.a()};
        companion.getClass();
        return builderD.h(new b(q8nVar, mr20VarArr)).f(CompositeLogger.g(euy0Var.d, new MobiusLoop.Logger[]{new SLF4JLogger("puffin-mobius-wiredmanagement")}));
    }
}
