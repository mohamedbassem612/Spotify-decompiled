package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zh61 extends xca {
    public Disposable f;
    public th61 g;
    public boolean h;
    public final Scheduler i;
    public final b7n j;
    public final dxz0 k;

    public zh61(Context context, x610 x610Var, aos aosVar, Scheduler scheduler, b7n b7nVar, dxz0 dxz0Var) {
        super(x610Var, aosVar);
        this.h = false;
        this.i = scheduler;
        this.j = b7nVar;
        this.k = dxz0Var;
    }

    @Override // p.xca
    public final void c() {
        Flowable flowable = this.c.a.a;
        ObservableFromPublisher observableFromPublisherJ = x0d.j(flowable, flowable);
        Scheduler scheduler = this.i;
        final byte b = 0;
        final byte b2 = 1;
        this.f = Observable.combineLatest(observableFromPublisherJ.observeOn(scheduler).doOnDispose(new Action(this) { // from class: p.yh61
            public final /* synthetic */ zh61 b;

            {
                this.b = this;
            }

            public final void run() {
                byte b3 = b;
                zh61 zh61Var = this.b;
                switch (b3) {
                    case 0:
                        zh61Var.g = null;
                        break;
                    default:
                        zh61Var.h = false;
                        break;
                }
            }
        }), yoi1.i(this.j.a(o6n.a), o6x.a).startWithItem(Boolean.FALSE).distinctUntilChanged().observeOn(scheduler).doOnDispose(new Action(this) { // from class: p.yh61
            public final /* synthetic */ zh61 b;

            {
                this.b = this;
            }

            public final void run() {
                byte b3 = b2;
                zh61 zh61Var = this.b;
                switch (b3) {
                    case 0:
                        zh61Var.g = null;
                        break;
                    default:
                        zh61Var.h = false;
                        break;
                }
            }
        }), new bhn0((byte) 25)).subscribe(new fv5(this, (byte) 22));
    }

    @Override // p.xca
    public final void d() {
        Disposable disposable = this.f;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.f.dispose();
    }

    @Override // p.xca
    public final void e(q881 q881Var, int i) {
        th61 th61Var = this.g;
        if (th61Var != null) {
            b(new lt5(th61Var, this.h, this.k.b()));
        }
    }
}
