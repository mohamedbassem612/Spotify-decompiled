package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xx91 implements lx91, yt90 {
    public final n381 a;
    public final ti61 b;
    public final Flowable c;
    public final ynb0 d;
    public final dxz0 e;
    public final g2z f;
    public final jut g;
    public final Scheduler h;
    public final Scheduler i;
    public final r1a1 j;
    public final y281 k;
    public final d6c l;
    public final Observable m;
    public final p5a0 n;
    public final xgc o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PublishSubject f97p = new PublishSubject();
    public final SerialDisposable q = new SerialDisposable();

    public xx91(n381 n381Var, ti61 ti61Var, Flowable flowable, ynb0 ynb0Var, dxz0 dxz0Var, g2z g2zVar, jut jutVar, Scheduler scheduler, Scheduler scheduler2, r1a1 r1a1Var, y281 y281Var, d6c d6cVar, Observable observable, p5a0 p5a0Var, xgc xgcVar) {
        this.a = n381Var;
        this.b = ti61Var;
        this.c = flowable;
        this.d = ynb0Var;
        this.e = dxz0Var;
        this.f = g2zVar;
        this.g = jutVar;
        this.h = scheduler;
        this.i = scheduler2;
        this.j = r1a1Var;
        this.k = y281Var;
        this.l = d6cVar;
        this.m = observable;
        this.n = p5a0Var;
        this.o = xgcVar;
    }

    public final Single a(iu30 iu30Var, iu30 iu30Var2) {
        if (!this.e.d()) {
            return Single.error((Throwable) con.a);
        }
        r1a1 r1a1Var = this.j;
        Single singleOnErrorResumeNext = r1a1Var.b.subscribeOn(r1a1Var.a).filter(new rrr(iu30Var, (byte) 4)).firstOrError().timeout(11000L, TimeUnit.MILLISECONDS, this.h).flatMap(new hyr(iu30Var2, (byte) 8)).onErrorResumeNext(i2x0.Z);
        singleOnErrorResumeNext.getClass();
        return singleOnErrorResumeNext;
    }

    @Override // p.yt90
    public final void start() {
        Observable observableJust = Observable.just(new u3a1());
        tx91 tx91Var = new tx91();
        g0l g0lVar = (g0l) this.d.get();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        Scheduler scheduler = this.i;
        n381 n381Var = this.a;
        subtypeEffectHandlerBuilderC.g(u1a1.class, new zd1(g0lVar, scheduler, n381Var, (byte) 19));
        r1a1 r1a1Var = this.j;
        subtypeEffectHandlerBuilderC.g(s1a1.class, new yon(g0lVar, scheduler, n381Var, r1a1Var, (byte) 12));
        subtypeEffectHandlerBuilderC.g(v1a1.class, new qt60(g0lVar, scheduler, n381Var));
        subtypeEffectHandlerBuilderC.g(x1a1.class, new mt60(this.o, g0lVar, scheduler, n381Var, this.f));
        subtypeEffectHandlerBuilderC.g(a2a1.class, new qt60(n381Var, scheduler, r1a1Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(t1a1.class, new w2a1(n381Var, scheduler, (byte) 0));
        subtypeEffectHandlerBuilderC.g(y1a1.class, new y2a1(n381Var, scheduler, (byte) 0));
        subtypeEffectHandlerBuilderC.g(z1a1.class, new y2a1(n381Var, scheduler, (byte) 1));
        subtypeEffectHandlerBuilderC.g(o2a1.class, new w2a1(n381Var, scheduler, (byte) 1));
        subtypeEffectHandlerBuilderC.g(p2a1.class, new w2a1(n381Var, scheduler, (byte) 2));
        subtypeEffectHandlerBuilderC.c(b2a1.class, new z2a1(this.g, (byte) 0));
        subtypeEffectHandlerBuilderC.c(n2a1.class, new z2a1(r1a1Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(w1a1.class, new g2x0(scheduler, this.n, (byte) 9));
        MobiusLoop.Builder builderD = Mobius.d(tx91Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).b(new ux91(this)).d(new vx91(this));
        d6c d6cVar = this.l;
        Observable observable = this.m;
        PublishSubject publishSubject = this.f97p;
        ti61 ti61Var = this.b;
        Flowable flowable = this.c;
        dxz0 dxz0Var = this.e;
        this.q.a(observableJust.compose(RxMobius.b(builderD.h(b2u.x(publishSubject, ti61Var, flowable, dxz0Var, d6cVar, observable)), new i4a1(null, -262145, dxz0Var.d()))).doOnSubscribe(wx91.b).doOnDispose(new ruz0(this, (byte) 11)).doOnNext(new tr41(this, (byte) 28)).subscribe());
    }

    @Override // p.yt90
    public final void stop() {
        this.q.a(EmptyDisposable.a);
    }
}
