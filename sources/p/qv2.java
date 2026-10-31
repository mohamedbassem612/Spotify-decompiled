package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qv2 implements EventSource {
    public final tv2 a;
    public final add b;
    public final q8n c;

    public qv2(tv2 tv2Var, add addVar, q8n q8nVar) {
        this.a = tv2Var;
        this.b = addVar;
        this.c = q8nVar;
    }

    public final Disposable a(Consumer consumer) {
        add addVar = this.b;
        if (!addVar.a() || !addVar.a.e()) {
            return yu2.c;
        }
        FlowEventSources.Companion companion = FlowEventSources.a;
        tv2 tv2Var = this.a;
        mr20[] mr20VarArr = {new u70(o4p1.r(rqt0.u(hu20.e(o4p1.k(new tf2(tv2Var.a.a("hm://super-connect-proxy/v1/writing-status", new tsm1(1, (byte) 20)), (byte) 1), -1, 2), new sv2(3, (lnm) null, (byte) 0))), tv2Var.b), (byte) 10)};
        companion.getClass();
        return new b(this.c, mr20VarArr).a(new xu2(consumer, (byte) 1));
    }
}
