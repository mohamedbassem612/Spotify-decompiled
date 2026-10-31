package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class c5d0 implements jly0 {
    public static MobiusLoop.Builder a(iyc0 iyc0Var, jl00 jl00Var, q8n q8nVar) {
        z4d0 z4d0Var = new z4d0();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        n4d0 n4d0Var = new n4d0();
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(j4d0.class), cancelPrevious.a(n4d0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(k4d0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new p4d0(iyc0Var)));
        MobiusLoop.Builder builderD = Mobius.d(z4d0Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI));
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {(mnc0) jl00Var.b};
        companion.getClass();
        return l1d.g(builderD.h(new b(q8nVar, mr20VarArr)).b(new a5d0(q8nVar)).d(new b5d0(q8nVar)));
    }
}
