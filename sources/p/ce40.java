package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ce40 extends hab0 implements iu30 {
    public final /* synthetic */ de40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce40(de40 de40Var) {
        super(1);
        this.a = de40Var;
    }

    public final Object invoke(Object obj) {
        de40 de40Var = this.a;
        cas casVar = (a7m0) obj;
        casVar.a = new rr10(de40Var, (byte) 25);
        FlowEventSources.Companion companion = FlowEventSources.a;
        fns fnsVar = igu.a;
        mr20[] mr20VarArr = {new be40(de40Var.b.h(), (byte) 0)};
        companion.getClass();
        casVar.b = new b(fnsVar, mr20VarArr);
        return rih1.a;
    }
}
