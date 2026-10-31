package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c3s implements a4l {
    public final g0l a;
    public final n6s b;
    public final Scheduler c;
    public final jo20 d;
    public final BehaviorSubject e = BehaviorSubject.f();
    public final BehaviorSubject f = BehaviorSubject.f();
    public final vku g = new vku();

    public c3s(g0l g0lVar, n6s n6sVar, Scheduler scheduler, jo20 jo20Var) {
        this.a = g0lVar;
        this.b = n6sVar;
        this.c = scheduler;
        this.d = jo20Var;
    }

    @Override // p.a4l
    public final void a() {
        this.g.c();
    }

    @Override // p.a4l
    public final void b() {
        Observable observableCombineLatest;
        Observable map = ((inr) this.a).d().map(mm10.c1);
        if (this.d.isEnabled()) {
            observableCombineLatest = Observable.combineLatest(map, this.b.a.doOnNext(p.Z), ns80.Z0);
            observableCombineLatest.getClass();
        } else {
            observableCombineLatest = map;
        }
        Scheduler scheduler = this.c;
        Disposable disposableSubscribe = observableCombineLatest.observeOn(scheduler).subscribe(new rc6(this.e, (byte) 5));
        vku vkuVar = this.g;
        vkuVar.a(disposableSubscribe);
        vkuVar.a(map.observeOn(scheduler).subscribe(new rc6(this.f, (byte) 6)));
    }

    public final boolean c() {
        Boolean bool = (Boolean) this.f.h();
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean d() {
        Boolean bool = (Boolean) this.e.h();
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
