package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kok extends hab0 implements iu30 {
    public final /* synthetic */ lok a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kok(lok lokVar) {
        super(1);
        this.a = lokVar;
    }

    public final Object invoke(Object obj) {
        iok iokVar = this.a.b;
        MobiusLoop.Builder builderD = Mobius.d(hok.a, iokVar.a.a());
        FlowEventSources.Companion companion = FlowEventSources.a;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        mr20[] mr20VarArr = {(kge) iokVar.b.d};
        companion.getClass();
        return builderD.h(new b(bs50Var, mr20VarArr));
    }
}
