package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vzx implements wpw, cvl1 {
    public final Object N0;
    public final Object O0;
    public final rqw P0;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final /* synthetic */ byte a;
    public final Flowable b;
    public final Scheduler c;
    public final boolean d;
    public final poy0 e;
    public final nsw f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public vzx(Observable observable, t2j0 t2j0Var, am30 am30Var, j62 j62Var, up0 up0Var, zm4 zm4Var, kt91 kt91Var, mw7 mw7Var, Flowable flowable, Scheduler scheduler, boolean z, PublishSubject publishSubject, PublishSubject publishSubject2) {
        this.a = (byte) 1;
        this.g = observable;
        this.h = t2j0Var;
        this.i = j62Var;
        this.t = up0Var;
        this.X = zm4Var;
        this.Y = kt91Var;
        this.Z = mw7Var;
        this.b = flowable;
        this.c = scheduler;
        this.d = z;
        this.N0 = publishSubject2;
        PublishSubject publishSubject3 = new PublishSubject();
        this.O0 = publishSubject3;
        Observable observableI = yoi1.i(am30Var.a(), o6x.a);
        kie1 kie1Var = kie1.b;
        this.e = y3o1.Y(Observable.merge(Observable.combineLatest(observable.distinctUntilChanged(new ekb((byte) 27)).map(y6x0.R0), publishSubject.startWithItem(rih1.a), observableI, l9x0.S0), publishSubject3.map(m9x0.S0), publishSubject2.map(r6x0.S0)).toFlowable(BackpressureStrategy.d), nhe1.c, ppd1.S0, new qwc1(this, (byte) 17), 8);
        this.P0 = new eih1();
        this.f = jch0.j(new jie1(this, (byte) 1));
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.P0;
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public vzx(Flowable flowable, lik1 lik1Var, ywc0 ywc0Var, b1y b1yVar, mta mtaVar, i4q i4qVar, yhm yhmVar, boolean z, cmf1 cmf1Var, iu30 iu30Var, Scheduler scheduler, qzh qzhVar, Flowable flowable2, lkd lkdVar) {
        this.a = (byte) 0;
        this.b = flowable;
        this.g = lik1Var;
        this.h = ywc0Var;
        this.i = b1yVar;
        this.t = i4qVar;
        this.X = yhmVar;
        this.d = z;
        this.Y = cmf1Var;
        this.Z = iu30Var;
        this.c = scheduler;
        this.N0 = qzhVar;
        this.O0 = new idd1(new t3x(this, lkdVar, (byte) 3));
        this.e = y3o1.Y(Flowable.h(flowable, flowable2, zhm0.Y0), s8x.Y0, new htu(this, (byte) 9), new i5w(this, (byte) 15), 8);
        this.P0 = n3o1.r(this).c(c9x.g, c9x.h);
        this.f = jch0.j(new uzx(this, (byte) 1));
    }
}
