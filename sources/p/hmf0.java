package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hmf0 extends hab0 implements iu30 {
    public final /* synthetic */ q8n a;
    public final /* synthetic */ hql1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmf0(q8n q8nVar, hql1 hql1Var) {
        super(1);
        this.a = q8nVar;
        this.b = hql1Var;
    }

    public final Object invoke(Object obj) {
        cas casVar = (a7m0) obj;
        casVar.a = ujf0.c;
        casVar.a(klf0.d, klf0.e);
        FlowEventSources.Companion companion = FlowEventSources.a;
        frl1 frl1Var = (frl1) this.b.a;
        Flowable flowable = (Flowable) frl1Var.b;
        vbm[] vbmVarArr = q601.a;
        mr20[] mr20VarArr = {new ilm1(new vlj1(new kge(flowable), frl1Var, (byte) 18), (byte) 0)};
        companion.getClass();
        casVar.b = new b(this.a, mr20VarArr);
        casVar.d = i0f0.W0;
        casVar.e = i0f0.X0;
        return rih1.a;
    }
}
