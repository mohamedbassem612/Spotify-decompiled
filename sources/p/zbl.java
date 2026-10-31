package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zbl implements EventSource {
    public final zwz0 a;
    public final ttz b;
    public final q8n c;

    public zbl(zwz0 zwz0Var, ttz ttzVar, q8n q8nVar) {
        this.a = zwz0Var;
        this.b = ttzVar;
        this.c = q8nVar;
    }

    public final Disposable a(Consumer consumer) {
        x010 x010Var = new x010(this.a.c(), this.b.a, new vm0(3, (lnm) null, (byte) 8), (byte) 1);
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {rqt0.u(x010Var)};
        companion.getClass();
        return new b(this.c, mr20VarArr).a(consumer);
    }
}
