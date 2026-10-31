package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c6y0 extends hab0 implements iu30 {
    public final /* synthetic */ de40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6y0(de40 de40Var) {
        super(1);
        this.a = de40Var;
    }

    public final Object invoke(Object obj) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        fns fnsVar = igu.a;
        mr20[] mr20VarArr = {new be40(this.a.b.h(), (byte) 1)};
        companion.getClass();
        ((a7m0) obj).b = new b(fnsVar, mr20VarArr);
        return rih1.a;
    }
}
