package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u5k0 extends hab0 implements vu30 {
    public final /* synthetic */ v5k0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5k0(v5k0 v5k0Var) {
        super(2);
        this.a = v5k0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        r5k0 r5k0Var = this.a.e;
        o5k0 o5k0Var = new o5k0();
        e5k0 e5k0Var = r5k0Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        z4k0 z4k0Var = new z4k0(e5k0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(w4k0.class), runSequentially.a(z4k0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(x4k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new b5k0(e5k0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(y4k0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new d5k0(e5k0Var)));
        MobiusLoop.Builder builderD = Mobius.d(o5k0Var, new a(e5k0Var.d, coroutinesSubtypeEffectHandlerBuilderI)).b(new p5k0(r5k0Var)).d(new q5k0(r5k0Var));
        n5k0 n5k0Var = r5k0Var.c;
        ((cir0) obj2).j(new pd8(n5k0Var, (byte) 11));
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = n5k0Var.a;
        mr20[] mr20VarArr = {n5k0Var.b};
        companion.getClass();
        return l1d.g(builderD.h(new b(q8nVar, mr20VarArr)));
    }
}
