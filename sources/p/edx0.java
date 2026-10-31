package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDoFinally;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.CompletableSubject;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class edx0 extends x7e0 {
    public final Scheduler d;
    public final Scheduler e;
    public final sdx0 f;
    public final udx0 g;
    public final Observable h;
    public final BehaviorSubject i = BehaviorSubject.f();
    public final CompositeDisposable t = new CompositeDisposable();

    public edx0(Scheduler scheduler, Scheduler scheduler2, sdx0 sdx0Var, udx0 udx0Var, Observable observable) {
        this.d = scheduler;
        this.e = scheduler2;
        this.f = sdx0Var;
        this.g = udx0Var;
        this.h = observable;
    }

    public final void e() {
        CompletableDoFinally completableDoFinallyFlatMapCompletable;
        Scheduler scheduler = this.d;
        CompositeDisposable compositeDisposable = this.t;
        CompletableSource completableSubject = new CompletableSubject();
        CompletableSource completableSubject2 = new CompletableSubject();
        j();
        udx0 udx0Var = this.g;
        if (udx0Var.e) {
            if (g5d0.o(((x7e0) this).b)) {
                bkl bklVar = ((x7e0) this).a;
                dj20.o();
                bklVar.accept(j5e0.a);
                return;
            }
            return;
        }
        compositeDisposable.b(this.h.subscribeOn(this.e).observeOn(scheduler).subscribe(new ddx0(this, completableSubject, (byte) 0), new ddx0(this, completableSubject, (byte) 1)));
        sdx0 sdx0Var = this.f;
        sdx0Var.j.onNext(Boolean.TRUE);
        if (sdx0Var.a.b) {
            completableDoFinallyFlatMapCompletable = Single.just(p7h.M(new String[]{"playlists", "recently-played-artists", "editor_track_of_the_week", "editor_albums", "editor_curated_playlists"})).flatMapCompletable(new xmu0(sdx0Var, udx0Var, (byte) 21));
        } else {
            Completable completableFlatMapCompletable = Single.just(p7h.M(new String[]{"playlists", "recently-played-artists", "editor_track_of_the_week", "editor_albums", "editor_curated_playlists"})).flatMapCompletable(new yeu0((Object) sdx0Var, (Object) udx0Var, (byte) 27));
            c72 c72Var = new c72(sdx0Var, (byte) 6);
            completableFlatMapCompletable.getClass();
            completableDoFinallyFlatMapCompletable = new CompletableDoFinally(completableFlatMapCompletable, c72Var);
        }
        compositeDisposable.b(completableDoFinallyFlatMapCompletable.n(scheduler).subscribe(new wqd0(completableSubject2, (byte) 23), new lyw0(completableSubject2, (byte) 4)));
        compositeDisposable.b(Completable.f(new CompletableSource[]{completableSubject, completableSubject2}).subscribe(new wqd0(this, (byte) 24), new lyw0(this, (byte) 5)));
    }

    public final void f() {
        sdx0 sdx0Var = this.f;
        m5k m5kVar = sdx0Var.e;
        sdx0Var.h.g();
        bpb1 bpb1Var = sdx0Var.g;
        Iterator it = ((Map) bpb1Var.getValue()).values().iterator();
        while (it.hasNext()) {
            ((odx0) it.next()).stop();
        }
        bpb1Var.m((Object) null, b7x.a);
        if (sdx0Var.a.b) {
            Iterator it2 = o7h.l1(m5kVar.B()).iterator();
            while (it2.hasNext()) {
                m5kVar.C((z511) it2.next());
            }
        }
        this.t.g();
    }
}
