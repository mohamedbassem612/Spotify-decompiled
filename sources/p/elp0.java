package p;

import android.view.View;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class elp0 implements x4l, o5s {
    public final jo20 X;
    public final bbr0 Y;
    public final Scheduler a;
    public final zcs b;
    public final g0l c;
    public final vnd1 d;
    public final vnd1 e;
    public final ior f;
    public final Scheduler g;
    public final byp h;
    public final clp0 i;
    public final goq t;
    public final vku Z = new vku();
    public final PublishSubject N0 = new PublishSubject();

    public elp0(gj5 gj5Var, Scheduler scheduler, zcs zcsVar, g0l g0lVar, vnd1 vnd1Var, vnd1 vnd1Var2, ior iorVar, Scheduler scheduler2, byp bypVar, clp0 clp0Var, goq goqVar, jo20 jo20Var, bbr0 bbr0Var) {
        this.a = scheduler;
        this.b = zcsVar;
        this.c = g0lVar;
        this.d = vnd1Var;
        this.e = vnd1Var2;
        this.f = iorVar;
        this.g = scheduler2;
        this.h = bypVar;
        this.i = clp0Var;
        this.t = goqVar;
        this.X = jo20Var;
        this.Y = bbr0Var;
        ((f0i) gj5Var).a.a(this);
    }

    public final void a(View view) {
        this.Z.a(Observable.just(view).delay(500L, TimeUnit.MILLISECONDS, this.g).observeOn(this.a).subscribe(new w090(this, view, (byte) 23)));
    }

    public final void b() {
        this.N0.onNext(j5.a);
    }

    public final void onCreate(iac0 iac0Var) {
        this.Z.a(this.b.a.flatMapMaybe(new swm0((Object) this, (byte) 12)).throttleFirst(10000L, TimeUnit.MILLISECONDS, this.g).observeOn(this.a).subscribe(new lrj0(this, (byte) 26)));
    }

    public final void onDestroy(iac0 iac0Var) {
        if (this.X.isEnabled()) {
            goq goqVar = this.t;
            nqs nqsVar = (nqs) goqVar.h;
            if (nqsVar != null) {
                nqsVar.a();
            }
            goqVar.h = null;
        } else {
            byp bypVar = this.h;
            ((vku) bypVar.e).c();
            bypVar.g = null;
            bypVar.h = null;
        }
        this.Z.c();
        this.i.e.c();
    }
}
