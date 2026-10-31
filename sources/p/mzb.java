package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mzb extends hab0 implements iu30 {
    public final /* synthetic */ ozb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzb(ozb ozbVar) {
        super(1);
        this.a = ozbVar;
    }

    public final Object invoke(Object obj) {
        cir0 cir0Var = (cir0) obj;
        u9c0 u9c0VarH = zso1.H(cir0Var.e().getLifecycle());
        ozb ozbVar = this.a;
        fn31.T(u9c0VarH, (o8n) null, 0, new kzb(ozbVar, null), 3);
        h0c h0cVar = ozbVar.d;
        lzb lzbVar = new lzb(ozbVar);
        e0c e0cVar = new e0c();
        uzb uzbVar = h0cVar.c;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        szb szbVar = new szb(uzbVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qzb.class), runSequentially.a(szbVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rzb.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tzb(lzbVar)));
        MobiusLoop.Builder builderD = Mobius.d(e0cVar, new a(uzbVar.a, coroutinesSubtypeEffectHandlerBuilderI));
        d0c d0cVar = h0cVar.b;
        cir0Var.j(new a0c(d0cVar, cir0Var, (byte) 0));
        c0c c0cVar = new c0c(d0cVar, (byte) 0);
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = d0cVar.b;
        mr20 mr20Var = d0cVar.e;
        companion.getClass();
        return l1d.g(builderD.h(new b(q8nVar, new mr20[]{mr20Var, FlowEventSources.Companion.a(c0cVar)}))).b(new f0c(h0cVar)).d(new g0c(h0cVar));
    }
}
