package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tpo0 implements EventSource {
    public final gqo0 a;
    public final q8n b;
    public final String c;

    public tpo0(gqo0 gqo0Var, q8n q8nVar, String str) {
        this.a = gqo0Var;
        this.b = q8nVar;
        this.c = str;
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        String strD = pcf.d(6, this.c, (String) null);
        gqo0 gqo0Var = this.a;
        mr20[] mr20VarArr = {new r6k0(gqo0Var.k(strD, new dqo0(gqo0Var, null, (byte) 1)), (byte) 19)};
        companion.getClass();
        return new b(this.b, mr20VarArr).a(new xu2(consumer, (byte) 15));
    }
}
