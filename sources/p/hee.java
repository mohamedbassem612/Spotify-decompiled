package p;

import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hee extends hab0 implements iu30 {
    public final /* synthetic */ iee a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hee(iee ieeVar) {
        super(1);
        this.a = ieeVar;
    }

    public final Object invoke(Object obj) {
        iee ieeVar = this.a;
        cas casVar = (a7m0) obj;
        casVar.a = new qza(ieeVar, (byte) 7);
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = ieeVar.a;
        mr20[] mr20VarArr = {new x72(new any(ieeVar.d, (byte) 18), (byte) 12), new any(new mgb(ieeVar.e, ieeVar, (byte) 19), (byte) 18)};
        companion.getClass();
        casVar.b = new b(q8nVar, mr20VarArr);
        casVar.e = new eee(ieeVar, (byte) 0);
        casVar.d = new eee(ieeVar, (byte) 1);
        return rih1.a;
    }
}
