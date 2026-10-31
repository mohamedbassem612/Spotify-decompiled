package p;

import android.view.View;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class om implements o5s, x4l {
    public final Scheduler a;
    public final eyh0 b;
    public final xm c;
    public final l8c0 d;
    public final wuw e;
    public final BehaviorSubject f = BehaviorSubject.f();
    public final rku g = new rku();

    public om(gj5 gj5Var, Scheduler scheduler, eyh0 eyh0Var, xm xmVar, l8c0 l8c0Var, wuw wuwVar) {
        this.a = scheduler;
        this.b = eyh0Var;
        this.c = xmVar;
        this.d = l8c0Var;
        this.e = wuwVar;
        ((f0i) gj5Var).a.a(this);
    }

    public final void a(View view) {
        this.f.onNext(new i5w0(view));
    }

    public final void b() {
        this.f.onNext(j5.a);
    }

    public final void onCreate(iac0 iac0Var) {
        this.d.k(this.c);
    }

    public final void onDestroy(iac0 iac0Var) {
        this.d.u(this.c);
    }

    public final void onPause(iac0 iac0Var) {
        eyh0 eyh0Var = this.b;
        ObservableEmitter observableEmitter = (ObservableEmitter) eyh0Var.c;
        if (observableEmitter != null) {
            observableEmitter.onNext(Boolean.FALSE);
        }
        eyh0Var.d = Boolean.FALSE;
    }

    public final void onResume(iac0 iac0Var) {
        eyh0 eyh0Var = this.b;
        ObservableEmitter observableEmitter = (ObservableEmitter) eyh0Var.c;
        if (observableEmitter != null) {
            observableEmitter.onNext(Boolean.TRUE);
        }
        eyh0Var.d = Boolean.TRUE;
    }

    public final void onStart(iac0 iac0Var) {
        eyh0 eyh0Var = this.b;
        this.g.b(Observable.combineLatest(Observable.create(new bv40(eyh0Var, (byte) 4)).delay(500L, TimeUnit.MILLISECONDS, (Scheduler) eyh0Var.b).distinctUntilChanged(), this.f.distinctUntilChanged(), this.e.c(), mm10.h).observeOn(this.a).subscribe(new vrk1(this, (byte) 11), nm.b));
    }

    public final void onStop(iac0 iac0Var) {
        this.g.a();
    }
}
