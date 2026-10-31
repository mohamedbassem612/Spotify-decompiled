package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e9p0 extends hab0 implements iu30 {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ dmj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9p0(q8n q8nVar, dmj1 dmj1Var) {
        super(1);
        this.a = q8nVar;
        this.b = dmj1Var;
    }

    public final Object invoke(Object obj) {
        cas casVar = (a7m0) obj;
        casVar.a = ofo0.R0;
        casVar.a(pzo0.N0, pzo0.O0);
        FlowEventSources.Companion companion = FlowEventSources.a;
        frl1 frl1Var = (frl1) this.b.b;
        Flowable flowable = (Flowable) frl1Var.b;
        vbm[] vbmVarArr = q601.a;
        mr20[] mr20VarArr = {new ilm1(new vlj1(new kge(flowable), frl1Var, (byte) 18), (byte) 1)};
        companion.getClass();
        casVar.b = new b(this.a, mr20VarArr);
        casVar.d = wso0.h;
        casVar.e = wso0.i;
        return rih1.a;
    }
}
