package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v700 extends hab0 implements iu30 {
    public final /* synthetic */ w700 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v700(w700 w700Var) {
        super(1);
        this.a = w700Var;
    }

    public final Object invoke(Object obj) {
        n800 n800Var = this.a.c;
        MobiusLoop.Builder builderD = Mobius.d(m800.a, n800Var.a);
        FlowEventSources.Companion companion = FlowEventSources.a;
        fns fnsVar = igu.a;
        mr20[] mr20VarArr = {new xy0(n800Var.b.a(), (byte) 28)};
        companion.getClass();
        return builderD.h(new b(fnsVar, mr20VarArr));
    }
}
