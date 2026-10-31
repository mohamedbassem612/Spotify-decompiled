package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w1g extends hab0 implements vu30 {
    public final /* synthetic */ x1g a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1g(x1g x1gVar) {
        super(2);
        this.a = x1gVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        u1g u1gVar = this.a.d;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        q1g q1gVar = new q1g(u1gVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(d1g.class), runSequentially.a(q1gVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(b1g.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new n1g(u1gVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(c1g.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new o1g(u1gVar)));
        MobiusLoop.Builder builderD = Mobius.d(t1g.a, new a(u1gVar.c, coroutinesSubtypeEffectHandlerBuilderI));
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = u1gVar.d;
        hye0 hye0Var = (hye0) u1gVar.b;
        mr20[] mr20VarArr = {new s1g(new fu20(hye0Var.a, new iyb0(hye0Var, null, (byte) 8), (byte) 1), (byte) 0)};
        companion.getClass();
        return builderD.h(new b(q8nVar, mr20VarArr));
    }
}
