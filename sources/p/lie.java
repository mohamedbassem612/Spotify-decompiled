package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lie {
    public final kl1 a;
    public final qzn0 b;
    public final m64 c;
    public final ro30 d;
    public final q8n e;
    public final q8n f;
    public final drm1 g;

    public lie(kl1 kl1Var, qzn0 qzn0Var, m64 m64Var, ro30 ro30Var, q8n q8nVar, q8n q8nVar2, drm1 drm1Var) {
        this.a = kl1Var;
        this.b = qzn0Var;
        this.c = m64Var;
        this.d = ro30Var;
        this.e = q8nVar;
        this.f = q8nVar2;
        this.g = drm1Var;
    }

    public final MobiusLoop a(String str) {
        dq7 dq7Var = new dq7(this.g, (byte) 2);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        aie aieVar = new aie(this.a);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(she.class), runSequentially.a(aieVar));
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially2 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        m64 m64Var = this.c;
        qzn0 qzn0Var = this.b;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uhe.class), runSequentially2.a(new whe(m64Var, qzn0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vhe.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xhe(m64Var, qzn0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(the.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yhe(qzn0Var)));
        q8n q8nVar = this.f;
        MobiusLoop.Builder builderD = Mobius.d(dq7Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI));
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new ik(new nwd(rqt0.u(new apw((kge) ((goq) this.d.b).h, str, (byte) 0)), (byte) 1), (byte) 24)};
        companion.getClass();
        return builderD.c(new b(q8nVar, mr20VarArr), new EventSource[0]).b(new i6b(this, (byte) 8)).d(new jc9(this, (byte) 13)).a(new mie(str), Collections.singleton(new she(str)));
    }
}
