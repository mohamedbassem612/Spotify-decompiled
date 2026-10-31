package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tlc implements qlc {
    public final wic a;
    public final kmc b;
    public final Scheduler c;
    public final PublishSubject d = new PublishSubject();
    public final BehaviorSubject e = BehaviorSubject.g("");

    public tlc(wic wicVar, kmc kmcVar, Scheduler scheduler) {
        this.a = wicVar;
        this.b = kmcVar;
        this.c = scheduler;
    }

    public final void a(String str) {
        if (nhc1.Y(str, "spotify:messaging", false)) {
            return;
        }
        this.e.onNext(str);
        ObservableSource observableSourceHide = this.a.a.hide();
        kmc kmcVar = this.b;
        Observable.combineLatest(observableSourceHide, kmcVar.a.map(new n4b(kmcVar, (byte) 2)), f331.f).filter(olj0.N0).take(1L).ignoreElements().s(this.c).subscribe(new slc(this, str));
    }
}
