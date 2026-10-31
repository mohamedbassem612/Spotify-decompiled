package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uj implements ej, Connectable, sj {
    public final l8s a;
    public final Scheduler b;
    public final rcr c;
    public Consumer d;
    public String e;
    public odr f;
    public MobiusLoop.Controller g;

    public uj(l8s l8sVar, Scheduler scheduler, rcr rcrVar) {
        this.a = l8sVar;
        this.b = scheduler;
        this.c = rcrVar;
    }

    @Override // com.spotify.mobius.Connectable
    public final Connection L(Consumer consumer) {
        this.d = consumer;
        return (Connection) r5r.P0.invoke(this);
    }
}
