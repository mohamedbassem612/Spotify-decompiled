package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xz40 implements x4l, o5s {
    public final PublishSubject N0 = new PublishSubject();
    public final PublishSubject O0 = new PublishSubject();
    public final rku P0 = new rku();
    public final rku Q0 = new rku();
    public final LayoutInflater R0;
    public View S0;
    public final o241 X;
    public final boolean Y;
    public ngf Z;
    public final x4f1 a;
    public final sus b;
    public final z0s0 c;
    public final b050 d;
    public final k9r e;
    public final yqg f;
    public final j0s g;
    public final Scheduler h;
    public final Scheduler i;
    public final hz40 t;

    public xz40(gj5 gj5Var, x4f1 x4f1Var, sus susVar, z0s0 z0s0Var, b050 b050Var, k9r k9rVar, yqg yqgVar, j0s j0sVar, Scheduler scheduler, Scheduler scheduler2, hz40 hz40Var, o241 o241Var, boolean z) {
        this.a = x4f1Var;
        this.b = susVar;
        this.c = z0s0Var;
        this.d = b050Var;
        this.e = k9rVar;
        this.f = yqgVar;
        this.g = j0sVar;
        this.h = scheduler;
        this.i = scheduler2;
        this.t = hz40Var;
        this.X = o241Var;
        this.Y = z;
        this.R0 = LayoutInflater.from(gj5Var);
        if (z) {
            return;
        }
        ((f0i) gj5Var).a.a(this);
    }

    public final void a(View view) {
        if (this.Y) {
            return;
        }
        if (this.Z != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.Z);
        }
        this.Z = new ngf(view, this, (byte) 2);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.Z);
        this.S0 = view;
        this.O0.onNext(Boolean.TRUE);
    }

    public final void b() {
        this.S0 = null;
        this.O0.onNext(Boolean.FALSE);
    }

    public final void onDestroy(iac0 iac0Var) {
        ViewTreeObserver viewTreeObserver;
        this.Q0.a();
        View view = this.S0;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.Z);
        }
        this.Z = null;
        this.S0 = null;
    }

    public final void onPause(iac0 iac0Var) {
        this.N0.onNext(Boolean.FALSE);
    }

    public final void onResume(iac0 iac0Var) {
        this.N0.onNext(Boolean.TRUE);
    }

    public final void onStart(iac0 iac0Var) {
        PublishSubject publishSubject = this.t.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.P0.b(Observable.merge(publishSubject.delay(5000L, timeUnit), Observable.combineLatest(this.N0.delay(500L, timeUnit, this.i), this.O0, this.e.y(), this.X.a("parental-pin-required", "0").map(xj20.d), zj20.d)).observeOn(this.h).doOnNext(k530.h).filter(yj20.d).subscribe(new od30(this, (byte) 8), k530.i));
    }

    public final void onStop(iac0 iac0Var) {
        this.P0.a();
    }
}
