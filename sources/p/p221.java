package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p221 extends hab0 implements vu30 {
    public final /* synthetic */ q221 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p221(q221 q221Var) {
        super(2);
        this.a = q221Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        j221 j221Var = this.a.d;
        g221 g221Var = new g221();
        g121 g121Var = j221Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        b121 b121Var = new b121(g121Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(s021.class), runSequentially.a(b121Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(q021.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new d121(g121Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(v021.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new f121(g121Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(r021.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new x021(g121Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(t021.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new y021(g121Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(u021.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new z021(g121Var)));
        MobiusLoop.Builder builderG = l1d.g(Mobius.d(g221Var, new a(g121Var.g, coroutinesSubtypeEffectHandlerBuilderI)));
        s121 s121Var = j221Var.b;
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = s121Var.b;
        mr20[] mr20VarArr = {new j5b0(s121Var.a.h, (byte) 29)};
        companion.getClass();
        return builderG.h(new b(q8nVar, mr20VarArr)).d(new h221(j221Var)).b(new i221(j221Var));
    }
}
