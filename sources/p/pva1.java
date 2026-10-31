package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.player.esperanto.proto.EsGetStateRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pva1 extends hab0 implements iu30 {
    public final /* synthetic */ tva1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pva1(tva1 tva1Var) {
        super(1);
        this.a = tva1Var;
    }

    public final Object invoke(Object obj) {
        cas casVar = (a7m0) obj;
        casVar.a = nva1.b;
        FlowEventSources.Companion companion = FlowEventSources.a;
        tva1 tva1Var = this.a;
        q8n q8nVar = (q8n) tva1Var.i;
        mr20[] mr20VarArr = {new buz(new lt20(r4p1.k(rqt0.u(new fag(((jn7) ((esa1) tva1Var.f).c).E(EsGetStateRequest.GetStateRequest.n()), (byte) 2)), 200L), new bu51(3, (lnm) null, (byte) 8), (byte) 1), (byte) 3), (mr20) tva1Var.P0};
        companion.getClass();
        casVar.b = new b(q8nVar, mr20VarArr);
        return rih1.a;
    }
}
