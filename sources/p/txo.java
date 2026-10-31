package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.processors.BehaviorProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class txo {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ txo(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final j6d1 a(c6d1 c6d1Var) {
        byte b = this.a;
        fwo fwoVar = this.b;
        switch (b) {
            case 0:
                wxo wxoVar = (wxo) fwoVar.c;
                f62 f62Var = (f62) wxoVar.b;
                Flowable flowableP0 = f62Var.P0();
                q8n q8nVarD = f62Var.d();
                c8o.l(q8nVarD);
                return new j6d1(c6d1Var, new ey20(flowableP0, q8nVarD), (uxo) wxoVar.L.get());
            case 1:
                nwp nwpVar = (nwp) ((gbp) fwoVar).c;
                Flowable flowableR0 = nwpVar.b.r0();
                q8n q8nVarB0 = nwpVar.a.b0();
                c8o.l(q8nVarB0);
                FlowEventSources.Companion companion = FlowEventSources.a;
                vbm[] vbmVarArr = q601.a;
                mr20[] mr20VarArr = {new xy0(new kge(flowableR0), (byte) 25)};
                companion.getClass();
                return new j6d1(c6d1Var, new b(q8nVarB0, mr20VarArr), (uxo) nwpVar.N1.get());
            default:
                v5q v5qVar = (v5q) ((thq) fwoVar).c;
                BehaviorProcessor behaviorProcessor = v5qVar.a.v1;
                behaviorProcessor.getClass();
                FlowableDistinctUntilChanged flowableDistinctUntilChangedT = behaviorProcessor.t(Functions.a);
                q8n q8nVar = (q8n) v5qVar.b.E1.get();
                FlowEventSources.Companion companion2 = FlowEventSources.a;
                vbm[] vbmVarArr2 = q601.a;
                mr20[] mr20VarArr2 = {new xy0(new kge(flowableDistinctUntilChangedT), (byte) 25)};
                companion2.getClass();
                return new j6d1(c6d1Var, new b(q8nVar, mr20VarArr2), (uxo) v5qVar.ya.get());
        }
    }
}
