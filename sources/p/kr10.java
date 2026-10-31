package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kr10 extends hab0 implements iu30 {
    public final /* synthetic */ mr10 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr10(mr10 mr10Var) {
        super(1);
        this.a = mr10Var;
    }

    public final Object invoke(Object obj) {
        mr10 mr10Var = this.a;
        cas casVar = (a7m0) obj;
        casVar.a = new jr10(mr10Var, (byte) 1);
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = mr10Var.c;
        mr20[] mr20VarArr = {mr10Var.h};
        companion.getClass();
        casVar.b = new b(q8nVar, mr20VarArr);
        return rih1.a;
    }
}
