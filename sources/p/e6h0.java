package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e6h0 extends hab0 implements iu30 {
    public final /* synthetic */ f6h0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6h0(f6h0 f6h0Var) {
        super(1);
        this.a = f6h0Var;
    }

    public final Object invoke(Object obj) {
        w6h0 w6h0Var = this.a.c;
        MobiusLoop.Builder builderD = Mobius.d(v6h0.a, w6h0Var.a);
        l4h0 l4h0Var = w6h0Var.b;
        FlowEventSources.Companion companion = FlowEventSources.a;
        Flowable flowable = l4h0Var.a;
        vbm[] vbmVarArr = q601.a;
        return builderD.h(FlowEventSources.Companion.b(companion, new mr20[]{rqt0.u(new dy20(new kge(flowable), (byte) 10)), new k6e0(new ir9(z4p1.v(rqt0.u(new dy20(new kge(flowable), (byte) 9)), 1), (byte) 5), (byte) 3), new f8f0(l4h0Var.b.A, (byte) 9), rqt0.u(new f8f0(l4h0Var.c.C, (byte) 8))}));
    }
}
