package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zgm1 implements UnaryOperator {
    public final /* synthetic */ ahm1 a;

    public zgm1(ahm1 ahm1Var) {
        this.a = ahm1Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (((MobiusLoop) obj) != null) {
            eg.m("This loop has already been started");
            return null;
        }
        gp71 gp71Var = gp71.C;
        ahm1 ahm1Var = this.a;
        MobiusLoop.Builder builderD = Mobius.d(gp71Var, ahm1Var.b);
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = ahm1Var.a;
        mr20[] mr20VarArr = {new tf2(ahm1Var.c, (byte) 29)};
        companion.getClass();
        MobiusLoop.Builder builderC = builderD.c(new b(q8nVar, mr20VarArr), new EventSource[0]);
        wgm1 wgm1Var = (wgm1) ahm1Var.e.getValue();
        MobiusLoop mobiusLoopG = builderC.g(new acm1(wgm1Var.a, wgm1Var.b, b7x.a, wgm1Var.c, wgm1Var.d));
        ahm1Var.f = mobiusLoopG.b(new y11(ahm1Var, (byte) 25));
        return mobiusLoopG;
    }
}
