package p;

import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i9s extends hab0 implements iu30 {
    public final /* synthetic */ l9s a;
    public final /* synthetic */ qmc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9s(l9s l9sVar, qmc qmcVar) {
        super(1);
        this.a = l9sVar;
        this.b = qmcVar;
    }

    public final Object invoke(Object obj) {
        cas casVar = (a7m0) obj;
        casVar.a = szr.f;
        l9s l9sVar = this.a;
        casVar.e = new h9s(l9sVar, (byte) 0);
        casVar.d = new h9s(l9sVar, (byte) 1);
        casVar.g = new AndroidLogger();
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = l9sVar.a;
        mr20[] mr20VarArr = {k4p1.B(this.b.a)};
        companion.getClass();
        casVar.b = new b(q8nVar, mr20VarArr);
        casVar.a(new m4r(l9sVar, (byte) 28), c6s.e);
        return rih1.a;
    }
}
