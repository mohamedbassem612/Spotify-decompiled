package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hzs implements Connectable {
    public final Scheduler a;
    public final PublishSubject b = new PublishSubject();
    public final PublishSubject c = new PublishSubject();
    public tr80 d;
    public tr80 e;
    public int f;
    public int g;
    public pkk1 h;
    public i4d0 i;
    public tr80 t;

    public hzs(Scheduler scheduler) {
        this.a = scheduler;
        tr80 tr80Var = tr80.d;
        this.d = tr80Var;
        this.e = tr80Var;
        this.f = -1;
    }

    public final Connection L(Consumer consumer) {
        return new cn(this, Observable.merge(this.b.distinctUntilChanged().debounce(100L, TimeUnit.MILLISECONDS, this.a), this.c.distinctUntilChanged()).subscribe(new dn(consumer, (byte) 20)), (byte) 13);
    }
}
