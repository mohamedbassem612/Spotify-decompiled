package p;

import android.media.AudioManager;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lkw0 implements sjw0 {
    public final w9u0 a;
    public final Flowable b;
    public final ww81 c;
    public final iir d;
    public final o241 e;
    public final Scheduler f;
    public final mw7 g;
    public final yqg h;
    public final hlr i;
    public boolean m;
    public boolean n;
    public u19 o;
    public final egh0 q;
    public final PublishSubject j = new PublishSubject();
    public final BehaviorSubject k = BehaviorSubject.g(w19.h);
    public final CompositeDisposable l = new CompositeDisposable();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Disposable f48p = EmptyDisposable.a;

    public lkw0(iac0 iac0Var, w9u0 w9u0Var, ww81 ww81Var, iir iirVar, Flowable flowable, o241 o241Var, Scheduler scheduler, mw7 mw7Var, yqg yqgVar, hlr hlrVar) {
        hkw0 hkw0Var = new hkw0(this);
        egh0 egh0Var = new egh0(this, (byte) 1);
        this.q = egh0Var;
        this.a = w9u0Var;
        this.c = ww81Var;
        this.d = iirVar;
        this.b = flowable;
        this.e = o241Var;
        this.f = scheduler;
        this.g = mw7Var;
        this.h = yqgVar;
        this.i = hlrVar;
        iac0Var.getLifecycle().a(hkw0Var);
        ww81Var.J(egh0Var);
    }

    public static void d(lkw0 lkw0Var) {
        if (lkw0Var.m) {
            lkw0Var.m = false;
            lkw0Var.a.a(new g9u0("previewplayerimpl", false)).observeOn(lkw0Var.f).ignoreElement().subscribe(new wes(), new jld((byte) 16));
        }
    }

    public static Observable e(lkw0 lkw0Var) {
        return Observable.combineLatest(lkw0Var.j, lkw0Var.e.b("audio-preview-url-template").take(1L), new dkw0(lkw0Var));
    }

    public static void f(lkw0 lkw0Var) {
        ww81 ww81Var = lkw0Var.c;
        if (ww81Var != null) {
            ww81Var.P(lkw0Var.q);
            ww81Var.j1();
            ww81Var.b.y1();
        }
    }

    public final void h(boolean z, boolean z2) {
        ww81 ww81Var = this.c;
        if (ww81Var != null) {
            if (this.o != null) {
                this.o = null;
                ww81Var.stop();
            }
            if (z2 && this.n) {
                this.n = false;
                this.g.a(9, (AudioManager.OnAudioFocusChangeListener) null);
            }
            if (z && this.m) {
                this.m = false;
                this.l.b(this.a.a(new g9u0("previewplayerimpl", false)).observeOn(this.f).ignoreElement().subscribe());
            }
            this.k.onNext(w19.h);
        }
    }
}
