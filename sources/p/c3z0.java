package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c3z0 extends hab0 implements iu30 {
    public final /* synthetic */ d3z0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3z0(d3z0 d3z0Var) {
        super(1);
        this.a = d3z0Var;
    }

    public final Object invoke(Object obj) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        d3z0 d3z0Var = this.a;
        q8n q8nVar = d3z0Var.a;
        mr20[] mr20VarArr = {(ve01) d3z0Var.b.d};
        companion.getClass();
        ((a7m0) obj).b = new b(q8nVar, mr20VarArr);
        return rih1.a;
    }
}
