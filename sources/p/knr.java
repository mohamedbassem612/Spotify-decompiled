package p;

import android.os.Build;
import com.google.protobuf.Empty;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class knr implements a4l {
    public Disposable X;
    public final Scheduler a;
    public final Scheduler b;
    public final agr c;
    public final rtz d;
    public final ynb0 e;
    public final ufe0 f;
    public PublishSubject g;
    public PublishSubject h;
    public Observable i;
    public CompositeDisposable t;

    public knr(Scheduler scheduler, Scheduler scheduler2, agr agrVar, rtz rtzVar, ynb0 ynb0Var, ufe0 ufe0Var) {
        this.a = scheduler;
        this.b = scheduler2;
        this.c = agrVar;
        this.d = rtzVar;
        this.e = ynb0Var;
        this.f = ufe0Var;
    }

    @Override // p.a4l
    public final void a() {
        CompositeDisposable compositeDisposable = this.t;
        if (compositeDisposable != null) {
            if (compositeDisposable != null) {
                compositeDisposable.g();
            } else {
                u890.C("disposableSet");
                throw null;
            }
        }
    }

    @Override // p.a4l
    public final void b() {
        this.t = new CompositeDisposable();
        Disposable disposable = this.X;
        if (disposable != null) {
            disposable.dispose();
        }
        this.X = null;
        this.g = new PublishSubject();
        PublishSubject publishSubject = new PublishSubject();
        this.h = publishSubject;
        this.i = publishSubject.startWithItem(rih1.a).switchMap(new h9n(this, (byte) 9));
        agr agrVar = this.c;
        Disposable disposableSubscribe = agrVar.b.skip(1L).distinctUntilChanged().subscribe(new xu((Object) this, (byte) 20));
        CompositeDisposable compositeDisposable = this.t;
        if (compositeDisposable == null) {
            u890.C("disposableSet");
            throw null;
        }
        compositeDisposable.b(disposableSubscribe);
        Observable observable = this.i;
        if (observable == null) {
            u890.C("performDiscoveryObservable");
            throw null;
        }
        Scheduler scheduler = this.b;
        Disposable disposableSubscribe2 = observable.observeOn(scheduler).subscribe(new jnr(this, (byte) 0));
        CompositeDisposable compositeDisposable2 = this.t;
        if (compositeDisposable2 == null) {
            u890.C("disposableSet");
            throw null;
        }
        compositeDisposable2.b(disposableSubscribe2);
        Disposable disposableSubscribe3 = yoi1.i(this.f.b, o6x.a).skip(1L).filter(een.b1).observeOn(scheduler).subscribe(new jnr(this, (byte) 1));
        CompositeDisposable compositeDisposable3 = this.t;
        if (compositeDisposable3 == null) {
            u890.C("disposableSet");
            throw null;
        }
        compositeDisposable3.b(disposableSubscribe3);
        CompositeDisposable compositeDisposable4 = this.t;
        if (compositeDisposable4 == null) {
            u890.C("disposableSet");
            throw null;
        }
        compositeDisposable4.b(agrVar.b.filter(olj0.V0).take(1L).singleOrError().onErrorComplete().g(scheduler).subscribe(new jnr(this, (byte) 3), p.Y));
        c();
    }

    public final void c() {
        if (Build.VERSION.SDK_INT <= 36 || this.f.a.a()) {
            rtz rtzVar = this.d;
            rtzVar.b.a(rtzVar.a.a(Empty.n()).doOnSuccess(dxu.N0).doOnError(dxu.O0).subscribe());
        }
    }

    public final void d() {
        ((rs31) this.e.get()).d();
        c();
        rtz rtzVar = this.d;
        vku vkuVar = rtzVar.b;
        be beVar = rtzVar.a;
        vkuVar.a(beVar.f(Empty.n()).doOnSuccess(p.O0).doOnError(dxu.P0).subscribe());
        vkuVar.a(beVar.m(Empty.n()).doOnSuccess(dxu.Q0).doOnError(dxu.R0).subscribe());
    }

    public final void g(String str) {
        Disposable disposable = this.X;
        if (disposable != null) {
            disposable.dispose();
        }
        this.X = null;
        if (str.equals("connect/devicepicker")) {
            d();
            return;
        }
        PublishSubject publishSubject = this.g;
        if (publishSubject != null) {
            publishSubject.onNext(rih1.a);
        }
    }

    public final void i() {
        PublishSubject publishSubject = this.h;
        if (publishSubject != null) {
            publishSubject.onNext(rih1.a);
        }
        Disposable disposable = this.X;
        if (disposable != null) {
            disposable.dispose();
        }
        this.X = null;
        this.X = Single.timer(10L, TimeUnit.SECONDS, this.a).observeOn(this.b).subscribe(new jnr(this, (byte) 2));
    }
}
