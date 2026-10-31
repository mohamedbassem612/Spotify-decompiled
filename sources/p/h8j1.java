package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h8j1 extends hab0 implements iu30 {
    public final /* synthetic */ x8j1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8j1(x8j1 x8j1Var) {
        super(1);
        this.a = x8j1Var;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        x8j1 x8j1Var = this.a;
        cas casVar = (a7m0) obj;
        casVar.a = new muh1(x8j1Var, (byte) 13);
        casVar.h = new hbz0(x8j1Var, (byte) 26);
        FlowEventSources.Companion companion = FlowEventSources.a;
        Flowable flowableH = x8j1Var.c.h();
        vbm[] vbmVarArr = q601.a;
        casVar.b = FlowEventSources.Companion.b(companion, new mr20[]{new h801(new kge(flowableH), (byte) 19)});
        return rih1.a;
    }
}
