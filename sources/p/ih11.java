package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ih11 extends hab0 implements vu30 {
    public final /* synthetic */ jh11 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih11(jh11 jh11Var) {
        super(2);
        this.a = jh11Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        t7p0 t7p0Var = t7p0.u;
        jh11 jh11Var = this.a;
        zg11 zg11Var = jh11Var.e;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        vg11 vg11Var = new vg11(zg11Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rg11.class), cancelPrevious.a(vg11Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qg11.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new sg11(zg11Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(og11.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tg11(zg11Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pg11.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xg11(zg11Var)));
        MobiusLoop.Builder builderD = Mobius.d(t7p0Var, new a(zg11Var.e, coroutinesSubtypeEffectHandlerBuilderI));
        qh11 qh11Var = jh11Var.f;
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = qh11Var.b;
        mr20[] mr20VarArr = {new ph11(yoi1.g(qh11Var.a.a()), (byte) 0)};
        companion.getClass();
        return gvg.d("pam-regular-member-sub-account-details", builderD.h(new b(q8nVar, mr20VarArr)));
    }
}
