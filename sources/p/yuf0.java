package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yuf0 {
    public final ObservableFromPublisher a;
    public final suf0 b;
    public final Scheduler c;
    public Disposable d = EmptyDisposable.a;
    public final o3e0 e;
    public final dp5 f;

    public yuf0(suf0 suf0Var, Scheduler scheduler, o3e0 o3e0Var, ObservableFromPublisher observableFromPublisher, dp5 dp5Var) {
        suf0Var.getClass();
        this.b = suf0Var;
        this.c = scheduler;
        this.e = o3e0Var;
        this.a = observableFromPublisher;
        this.f = dp5Var;
    }

    public final void a() {
        this.d.dispose();
        Observable observableObserveOn = this.a.map(new mna0((byte) 22)).distinctUntilChanged(new mna0((byte) 23)).flatMap(new c8d0(this, (byte) 11), new mna0((byte) 24)).map(this.f).observeOn(this.c);
        suf0 suf0Var = this.b;
        Objects.requireNonNull(suf0Var);
        this.d = observableObserveOn.subscribe(new fv5(suf0Var, (byte) 6), new jld((byte) 10));
    }

    public final void b() {
        this.d.dispose();
    }
}
