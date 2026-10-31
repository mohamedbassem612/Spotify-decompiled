package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l3v0 {
    public final e3v0 a;
    public final aru0 b;
    public final Scheduler c;
    public Disposable d;

    public l3v0(aru0 aru0Var, e3v0 e3v0Var, Scheduler scheduler) {
        this.b = aru0Var;
        e3v0Var.getClass();
        this.a = e3v0Var;
        this.c = scheduler;
    }

    public final void a() {
        aru0 aru0Var = this.b;
        Observable observableObserveOn = ((Single) aru0Var.b).toObservable().cast(re70.class).onErrorReturn(new pjq0(aru0Var, (byte) 17)).compose(new lve1(300, ee70.b(), (Scheduler) aru0Var.c)).observeOn(this.c);
        e3v0 e3v0Var = this.a;
        Objects.requireNonNull(e3v0Var);
        this.d = observableObserveOn.subscribe(new fv5(e3v0Var, (byte) 13));
    }

    public final void b() {
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
