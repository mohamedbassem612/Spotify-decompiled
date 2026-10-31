package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r2y extends hab0 implements vu30 {
    public final /* synthetic */ s2y a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2y(s2y s2yVar) {
        super(2);
        this.a = s2yVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        s2y s2yVar = this.a;
        MobiusLoop.Builder builderD = Mobius.d(p2y.a, s2yVar.b);
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = s2yVar.e;
        Flowable flowable = s2yVar.c;
        p5y p5yVar = s2yVar.d;
        vbm[] vbmVarArr = q601.a;
        mr20[] mr20VarArr = {new x3s(rqt0.u(new pzs(new kge(flowable), p5yVar, (byte) 10)), (byte) 26)};
        companion.getClass();
        return builderD.c(new b(q8nVar, mr20VarArr), new EventSource[0]);
    }
}
