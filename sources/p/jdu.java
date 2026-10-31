package p;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jdu implements ocu {
    public final cdu a;
    public final xj9 b;
    public final dc31 c;
    public final kly0 d;
    public final b e;
    public MobiusLoop f;

    public jdu(cdu cduVar, xj9 xj9Var, dc31 dc31Var, tsq tsqVar, q8n q8nVar) {
        this.a = cduVar;
        this.b = xj9Var;
        this.c = dc31Var;
        this.d = tsqVar;
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {(kr41) dc31Var.c};
        companion.getClass();
        this.e = new b(q8nVar, mr20VarArr);
    }
}
