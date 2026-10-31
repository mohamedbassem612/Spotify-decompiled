package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i040 extends hab0 implements iu30 {
    public final /* synthetic */ j040 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i040(j040 j040Var) {
        super(1);
        this.a = j040Var;
    }

    public final Object invoke(Object obj) {
        cas casVar = (a7m0) obj;
        casVar.a = bp30.Z;
        FlowEventSources.Companion companion = FlowEventSources.a;
        j040 j040Var = this.a;
        q8n q8nVar = j040Var.a;
        mr20[] mr20VarArr = {new any((ve01) j040Var.b.e, (byte) 24)};
        companion.getClass();
        casVar.b = new b(q8nVar, mr20VarArr);
        return rih1.a;
    }
}
