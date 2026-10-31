package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class quh1 extends hab0 implements iu30 {
    public final /* synthetic */ suh1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public quh1(suh1 suh1Var) {
        super(1);
        this.a = suh1Var;
    }

    public final Object invoke(Object obj) {
        suh1 suh1Var = this.a;
        cas casVar = (a7m0) obj;
        casVar.a = new muh1(suh1Var, (byte) 0);
        FlowEventSources.Companion companion = FlowEventSources.a;
        fns fnsVar = igu.a;
        mr20[] mr20VarArr = {new be40(((i5y0) suh1Var.e).h(), (byte) 2), new puh1(((iz31) suh1Var.f).c(), (byte) 0)};
        companion.getClass();
        casVar.b = new b(fnsVar, mr20VarArr);
        return rih1.a;
    }
}
