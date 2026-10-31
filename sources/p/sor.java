package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sor implements a4l {
    public final jde0 a;
    public final y2l b;
    public final jo20 c;
    public final q8n d;
    public final BehaviorSubject e = BehaviorSubject.f();
    public final rku f = new rku();

    public sor(jde0 jde0Var, y2l y2lVar, jo20 jo20Var, q8n q8nVar) {
        this.a = jde0Var;
        this.b = y2lVar;
        this.c = jo20Var;
        this.d = q8nVar;
    }

    @Override // p.a4l
    public final void a() {
        this.f.a();
    }

    @Override // p.a4l
    public final void b() {
        jde0 jde0Var = this.a;
        this.f.b(yoi1.i(((ima1) jde0Var.a).q(kde0.a), o6x.a).filter(y580.g1).map(e710.Y).startWith(Observable.fromCallable(new sra(jde0Var, (byte) 7))).distinctUntilChanged().onErrorResumeNext(uh21.W0).switchMap(new qmr(this, (byte) 1)).replay(1).f().subscribe(new rc6(this.e, (byte) 3)));
    }
}
