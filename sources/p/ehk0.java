package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ehk0 extends hab0 implements vu30 {
    public final /* synthetic */ ghk0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehk0(ghk0 ghk0Var) {
        super(2);
        this.a = ghk0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ygk0 ygk0Var = this.a.d;
        vgk0 vgk0Var = new vgk0();
        bgk0 bgk0Var = ygk0Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        vfk0 vfk0Var = new vfk0(bgk0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rfk0.class), runSequentially.a(vfk0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qfk0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yfk0(bgk0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sfk0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new agk0(bgk0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tfk0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wfk0(bgk0Var)));
        MobiusLoop.Builder builderD = l1d.g(Mobius.d(vgk0Var, new a(bgk0Var.e, coroutinesSubtypeEffectHandlerBuilderI))).b(new wgk0(ygk0Var)).d(new xgk0(ygk0Var));
        ugk0 ugk0Var = ygk0Var.c;
        ((cir0) obj2).j(new pd8(ugk0Var, (byte) 12));
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = ugk0Var.a;
        mr20[] mr20VarArr = {ugk0Var.b};
        companion.getClass();
        return l1d.g(builderD.h(new b(q8nVar, mr20VarArr)));
    }
}
