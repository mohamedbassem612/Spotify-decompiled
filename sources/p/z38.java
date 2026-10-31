package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z38 implements EventSource {
    public final q8n a;
    public final yqg b;
    public final c64 c;

    public z38(u38 u38Var, q8n q8nVar, yqg yqgVar) {
        this.a = q8nVar;
        this.b = yqgVar;
        this.c = new c64(rqt0.v(yoi1.g(u38Var.c), xj.f), this, (byte) 18);
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {this.c};
        companion.getClass();
        return new b(this.a, mr20VarArr).a(consumer);
    }
}
