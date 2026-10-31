package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gpi0 extends hab0 implements vu30 {
    public final /* synthetic */ hpi0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpi0(hpi0 hpi0Var) {
        super(2);
        this.a = hpi0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        cir0 cir0Var = (cir0) obj2;
        hpi0 hpi0Var = this.a;
        lwf lwfVar = hpi0Var.h;
        lwfVar.getClass();
        x8c0 lifecycle = cir0Var.e().getLifecycle();
        lifecycle.a(new kwf(lwfVar, cir0Var, lifecycle, (byte) 0));
        epi0 epi0Var = hpi0Var.d;
        q8n q8nVar = hpi0Var.f;
        wen0 wen0Var = hpi0Var.g;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        cpi0 cpi0Var = new cpi0(epi0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(boi0.class), runSequentially.a(cpi0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(coi0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yoi0(epi0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(aoi0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zoi0(epi0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yni0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new api0(epi0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xni0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new bpi0(epi0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zni0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dpi0(epi0Var)));
        MobiusLoop.Builder builderD = Mobius.d(woi0.a, new a(epi0Var.a, coroutinesSubtypeEffectHandlerBuilderI));
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new f8f0(wen0Var, (byte) 24)};
        companion.getClass();
        return builderD.h(new b(q8nVar, mr20VarArr));
    }
}
