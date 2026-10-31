package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class inr implements g0l, h0l {
    public final rku X = new rku();
    public final BehaviorSubject Y = BehaviorSubject.g(new e1l());
    public final a8p a;
    public final kly0 b;
    public final kly0 c;
    public final kly0 d;
    public final kly0 e;
    public final kly0 f;
    public final kly0 g;
    public final kly0 h;
    public final q8n i;
    public d1l t;

    public inr(a8p a8pVar, kly0 kly0Var, kly0 kly0Var2, a8p a8pVar2, a8p a8pVar3, a8p a8pVar4, a8p a8pVar5, a8p a8pVar6, q8n q8nVar) {
        this.a = a8pVar;
        this.b = kly0Var;
        this.c = kly0Var2;
        this.d = a8pVar2;
        this.e = a8pVar3;
        this.f = a8pVar4;
        this.g = a8pVar5;
        this.h = a8pVar6;
        this.i = q8nVar;
    }

    @Override // p.a4l
    public final void a() {
        this.X.a();
        this.Y.onNext(new e1l());
    }

    @Override // p.a4l
    public final void b() {
        Observable observableNever = Observable.never();
        MobiusLoop.Builder builderD = Mobius.d(new fnr(), RxConnectables.a(k0l.a())).b(new gnr(this)).d(new hnr(this));
        mnr mnrVar = (mnr) this.d.get();
        mnrVar.getClass();
        MobiusLoop.Builder builderG = l1d.g(builderD.h(bwp0.n(Observable.defer(new yj1(mnrVar, (byte) 5)).subscribeOn(mnrVar.a), (sor) this.b.get(), (lk) this.h.get(), (ezt) this.e.get())));
        d1l d1lVar = this.t;
        if (d1lVar == null) {
            z6x z6xVar = z6x.a;
            d1lVar = new d1l(z6xVar, z6xVar, z6xVar, false);
        }
        this.X.b(observableNever.compose(RxMobius.b(builderG, d1lVar)).doOnNext(new xu((Object) this, (byte) 19)).distinctUntilChanged().observeOn((Scheduler) this.f.get()).subscribe(new yrh(this, (byte) 15)));
    }

    public final l0l c() {
        spq0 spq0Var;
        e1l e1lVar = (e1l) this.Y.h();
        if (e1lVar == null || (spq0Var = e1lVar.c) == null) {
            return null;
        }
        return (l0l) spq0Var.h();
    }

    public final Observable d() {
        return this.Y.map(ns80.Y0);
    }

    public final e1l g() {
        e1l e1lVar = (e1l) this.Y.h();
        return e1lVar == null ? new e1l() : e1lVar;
    }

    public final List i() {
        List list;
        e1l e1lVar = (e1l) this.Y.h();
        return (e1lVar == null || (list = e1lVar.b) == null) ? z6x.a : list;
    }

    public final Observable j() {
        return this.Y.map(f331.Y);
    }

    public final nnr k() {
        spq0 spq0Var;
        e1l e1lVar = (e1l) this.Y.h();
        if (e1lVar == null || (spq0Var = e1lVar.d) == null) {
            return null;
        }
        return (nnr) spq0Var.h();
    }

    public final Observable l() {
        return this.Y.map(bya0.U0);
    }

    public final Observable m() {
        return this.Y.map(stf0.Z0);
    }
}
