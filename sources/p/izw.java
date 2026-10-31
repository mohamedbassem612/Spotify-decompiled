package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class izw extends hab0 implements iu30 {
    public final /* synthetic */ pzw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izw(pzw pzwVar) {
        super(1);
        this.a = pzwVar;
    }

    public final Object invoke(Object obj) {
        pzw pzwVar = this.a;
        cas casVar = (a7m0) obj;
        casVar.a = new hzw(pzwVar, (byte) 0);
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = (q8n) pzwVar.b;
        mr20[] mr20VarArr = {(ve01) ((otu) pzwVar.f).c, (i0h) pzwVar.Y, (ir9) pzwVar.Z, (x3s) pzwVar.N0};
        companion.getClass();
        casVar.b = new b(q8nVar, mr20VarArr);
        casVar.h = new i5w(pzwVar, (byte) 7);
        return rih1.a;
    }
}
