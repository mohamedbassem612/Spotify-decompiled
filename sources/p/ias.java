package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ias extends k8m0 {
    public final c8m0 d;
    public final aim0 e;
    public final g2h f;
    public final w9k1 g;
    public MobiusLoop.Controller h;
    public final rku i = new rku();
    public final Subject t = BehaviorSubject.f().c();
    public final Subject X = new PublishSubject().c();

    public ias(c8m0 c8m0Var, aim0 aim0Var, g2h g2hVar, w9k1 w9k1Var) {
        this.d = c8m0Var;
        this.e = aim0Var;
        this.f = g2hVar;
        this.g = w9k1Var;
    }

    public final void e() {
        j();
        if (this.h == null) {
            this.h = this.d.a(l(), new bk1(this, (byte) 11));
        }
        efr efrVar = new efr(this, (byte) 8);
        Subject subject = this.t;
        this.i.b(subject.skipWhile(efrVar).firstOrError().subscribe(new has(this, (byte) 0), new has(this, (byte) 1)));
        MobiusLoop.Controller controller = this.h;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.c(new g8l(this.X, subject));
        controller.start();
    }

    public final void f() {
        this.i.a();
        MobiusLoop.Controller controller = this.h;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.stop();
        controller.disconnect();
    }

    @Override // p.k8m0
    public final CompositeDisposable k(Connectable connectable, ObservableTransformer observableTransformer) {
        Subject subject = this.X;
        Connection connectionL = connectable.L(new y11(subject, (byte) 9));
        return new CompositeDisposable(new Disposable[]{Disposable.d(new f72(connectionL, (byte) 13)), this.t.subscribe(new hqh(connectionL, (byte) 1)), this.g.d().compose(observableTransformer).subscribe(new yrh(subject, (byte) 27))});
    }

    public Object l() {
        return this.e.invoke();
    }
}
