package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l221 extends hab0 implements vu30 {
    public final /* synthetic */ m221 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l221(m221 m221Var) {
        super(2);
        this.a = m221Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        weq0 weq0Var = this.a.c;
        teq0 teq0Var = new teq0();
        bdq0 bdq0Var = weq0Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        scq0 scq0Var = new scq0(bdq0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ecq0.class), runSequentially.a(scq0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zbq0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ucq0(bdq0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ccq0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently().a(new qcq0(bdq0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(icq0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wcq0(bdq0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hcq0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ncq0(bdq0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dcq0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ycq0(bdq0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ybq0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new adq0(bdq0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fcq0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kcq0(bdq0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gcq0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ocq0(bdq0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(acq0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lcq0(bdq0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bcq0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mcq0(bdq0Var)));
        MobiusLoop.Builder builderG = l1d.g(Mobius.d(teq0Var, new a(bdq0Var.h, coroutinesSubtypeEffectHandlerBuilderI)));
        eeq0 eeq0Var = weq0Var.b;
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = eeq0Var.b;
        mr20[] mr20VarArr = {new j5b0(eeq0Var.a.h, (byte) 13)};
        companion.getClass();
        return builderG.h(new b(q8nVar, mr20VarArr)).d(new ueq0(weq0Var)).b(new veq0(weq0Var));
    }
}
