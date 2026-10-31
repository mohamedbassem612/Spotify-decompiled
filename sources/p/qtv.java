package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qtv extends hab0 implements vu30 {
    public final /* synthetic */ yzu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtv(yzu yzuVar) {
        super(2);
        this.a = yzuVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        jvv jvvVar = (jvv) this.a.d;
        gvv gvvVar = new gvv();
        kuv kuvVar = jvvVar.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        g931 g931Var = kuvVar.a;
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        fuv fuvVar = new fuv(g931Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(buv.class), runSequentially.a(fuvVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(auv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new duv(kuvVar.f)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ztv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cuv(kuvVar.d)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ytv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new juv(kuvVar.b)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xtv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new huv(kuvVar.e)));
        MobiusLoop.Builder builderD = Mobius.d(gvvVar, new a(kuvVar.c, coroutinesSubtypeEffectHandlerBuilderI));
        fvv fvvVar = jvvVar.c;
        ((cir0) obj2).j(new pd8(fvvVar, (byte) 7));
        c0c c0cVar = new c0c(fvvVar, (byte) 3);
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = fvvVar.b;
        mr20 mr20Var = fvvVar.c;
        companion.getClass();
        return l1d.g(builderD.h(new b(q8nVar, new mr20[]{mr20Var, FlowEventSources.Companion.a(c0cVar)}))).b(new hvv(jvvVar)).d(new ivv(jvvVar));
    }
}
