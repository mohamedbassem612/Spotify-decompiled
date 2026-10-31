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
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class md10 {
    public final z8c0 a;
    public final qzn0 b;
    public final q8n c;
    public final q8n d;

    public md10(z8c0 z8c0Var, qzn0 qzn0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = z8c0Var;
        this.b = qzn0Var;
        this.c = q8nVar;
        this.d = q8nVar2;
    }

    public static MobiusLoop a(md10 md10Var) {
        List listSingletonList = Collections.singletonList(bd10.c);
        md10Var.getClass();
        drm1 drm1Var = new drm1((byte) 18);
        qzn0 qzn0Var = md10Var.b;
        q8n q8nVar = md10Var.d;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(fd10.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gd10(qzn0Var)));
        MobiusLoop.Builder builderD = Mobius.d(drm1Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI));
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {new any(rqt0.u((zx60) md10Var.a.b), (byte) 16)};
        companion.getClass();
        return builderD.c(new b(q8nVar, mr20VarArr), new EventSource[0]).b(new mjv(md10Var, (byte) 12)).d(new j3v(md10Var, (byte) 17)).g(new nd10(listSingletonList));
    }
}
