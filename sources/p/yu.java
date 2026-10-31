package p;

import android.content.Context;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yu implements iyf0 {
    public final kly0 a;
    public final kly0 b;
    public final Context c;
    public final Single d;
    public final Flowable e;
    public final kly0 f;
    public final kly0 g;
    public final n381 h;
    public final Scheduler i;
    public final vku t = new vku();

    public yu(caq caqVar, kly0 kly0Var, Context context, Single single, Flowable flowable, caq caqVar2, caq caqVar3, n381 n381Var, Scheduler scheduler) {
        this.a = caqVar;
        this.b = kly0Var;
        this.c = context;
        this.d = single;
        this.e = flowable;
        this.f = caqVar2;
        this.g = caqVar3;
        this.h = n381Var;
        this.i = scheduler;
    }

    public final void c() {
        Observable observableSwitchMapSingle = this.d.flatMapObservable(new e4b1(this, (byte) 2)).switchMapSingle(new t4d1(this, (byte) 2));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Scheduler scheduler = this.i;
        this.t.a(observableSwitchMapSingle.throttleLast(500L, timeUnit, scheduler).observeOn(scheduler).subscribe(new xu(this, (byte) 0), new tg(this, (byte) 4)));
    }

    public final void d() {
        this.t.c();
    }

    public final void i() {
        wbd1 wbd1Var = (wbd1) this.g.get();
        this.t.a(wbd1Var.b.firstOrError().observeOn(this.i).subscribe(new tg(wbd1Var, (byte) 3)));
    }

    public final void g(ViewGroup viewGroup) {
    }
}
