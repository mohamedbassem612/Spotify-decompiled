package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zu2 implements EventSource {
    public final bv2 a;
    public final q8n b;
    public final boolean c;

    public zu2(bv2 bv2Var, q8n q8nVar, boolean z) {
        this.a = bv2Var;
        this.b = q8nVar;
        this.c = z;
    }

    public final Disposable a(Consumer consumer) {
        if (!this.c) {
            return yu2.b;
        }
        FlowEventSources.Companion companion = FlowEventSources.a;
        bv2 bv2Var = this.a;
        mr20[] mr20VarArr = {new u70(o4p1.r(rqt0.u(hu20.c(new ht20(bv2Var.b.a("hm://super-connect-proxy/v1/online-state", ny1.e1), new sd0(2, (lnm) null, (byte) 4)), new qm(bv2Var, (lnm) null, (byte) 19))), bv2Var.d), (byte) 9)};
        companion.getClass();
        return new b(this.b, mr20VarArr).a(new xu2(consumer, (byte) 0));
    }
}
