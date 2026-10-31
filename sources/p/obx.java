package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class obx extends l570 implements o5s {
    public final Scheduler b;
    public final qzh c;
    public final da d;
    public final vx40 e;
    public final CompositeDisposable f;

    public obx(Scheduler scheduler, qzh qzhVar, da daVar, iac0 iac0Var, vx40 vx40Var) {
        super(qzhVar.getView());
        this.b = scheduler;
        this.c = qzhVar;
        this.d = daVar;
        this.e = vx40Var;
        iac0Var.getLifecycle().a(this);
        this.f = new CompositeDisposable();
    }

    public final void a(y570 y570Var, l670 l670Var, yfu yfuVar) {
        l811 l811Var = new l811();
        sc70 sc70Var = (j570) y570Var.j().get("toggleLikeStateClick");
        String strB = sc70Var != null ? sc70Var.a().B("uri") : null;
        if (strB == null) {
            strB = "";
        }
        this.f.b(((Observable) this.d.invoke(strB)).observeOn(this.b).subscribe(new qg7(l811Var, this, y570Var, (byte) 11)));
        this.c.n(new m3n(l670Var, y570Var, l811Var, (byte) 27));
        this.e.v(y570Var);
    }

    @Override // p.o5s
    public final void onDestroy(iac0 iac0Var) {
        iac0Var.getLifecycle().d(this);
    }

    @Override // p.o5s
    public final void onStop(iac0 iac0Var) {
        this.f.g();
    }
}
