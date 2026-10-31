package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lzw0 implements EventSource {
    public final ma41 a;
    public final Observable e;
    public final ArrayList b = new ArrayList();
    public final PublishSubject c = new PublishSubject();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final idd1 f = new idd1(new z6v0(this, (byte) 19));

    public lzw0(Scheduler scheduler, ma41 ma41Var) {
        this.a = ma41Var;
        this.e = Observable.defer(new yj1(this, (byte) 23)).subscribeOn(scheduler);
    }

    public final Disposable a(Consumer consumer) {
        return RxEventSources.a(new ObservableSource[]{this.e, (Observable) this.f.getValue()}).a(new xu2(consumer, (byte) 18));
    }

    public final void b(kzw0 kzw0Var) {
        if (this.d.get()) {
            this.c.onNext(kzw0Var);
        } else {
            this.b.add(kzw0Var);
        }
    }
}
