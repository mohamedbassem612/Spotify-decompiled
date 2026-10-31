package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pnr implements a4l {
    public final kly0 a;
    public final a8p b;
    public final jo20 c;
    public final kly0 d;
    public final jo20 e;
    public final q8n f;
    public final rku g = new rku();
    public s1l h;

    public pnr(jly0 jly0Var, a8p a8pVar, jo20 jo20Var, a8p a8pVar2, jo20 jo20Var2, q8n q8nVar) {
        this.a = jly0Var;
        this.b = a8pVar;
        this.c = jo20Var;
        this.d = a8pVar2;
        this.e = jo20Var2;
        this.f = q8nVar;
    }

    @Override // p.a4l
    public final void a() {
        this.g.a();
    }

    @Override // p.a4l
    public final void b() {
        Observable observableJust;
        if (((Boolean) this.c.b()).booleanValue()) {
            Observable map = z6p1.p((g0l) this.a.get()).doOnNext(new yrh(this, (byte) 16)).filter(y580.W0).map(pzs0.V0);
            if (((Boolean) this.e.b()).booleanValue()) {
                observableJust = (Observable) ((wcs) this.d.get()).invoke();
            } else {
                observableJust = Observable.just(qul1.b);
                observableJust.getClass();
            }
            this.g.b(Observable.combineLatest(map, observableJust, qzs0.W0).distinctUntilChanged(new sun(this, (byte) 7)).flatMapCompletable(new her(this, (byte) 3)).subscribe());
        }
    }
}
