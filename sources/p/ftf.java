package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ftf implements EventSource {
    public final bfd a;
    public final cif b;
    public final q8n c;
    public final AtomicBoolean d = new AtomicBoolean(true);

    public ftf(bfd bfdVar, cif cifVar, q8n q8nVar) {
        this.a = bfdVar;
        this.b = cifVar;
        this.c = q8nVar;
    }

    public final Disposable a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.a;
        mr20[] mr20VarArr = {hu20.e(d5p1.h(this.b.a), new b7c((lnm) null, (Object) this, (byte) 6))};
        companion.getClass();
        return new b(this.c, mr20VarArr).a(new xu2(consumer, (byte) 7));
    }
}
