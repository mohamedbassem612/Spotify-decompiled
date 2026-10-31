package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.CompletableSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class no01 implements odx0 {
    public final rfq a;
    public final xmu0 b;
    public final hyy0 c;
    public final Context d;
    public final h1q e;
    public final Scheduler f;
    public final Scheduler g;
    public final CompletableSubject h = new CompletableSubject();
    public final CompositeDisposable i = new CompositeDisposable();
    public zqh j;

    public no01(rfq rfqVar, xmu0 xmu0Var, hyy0 hyy0Var, Context context, h1q h1qVar, Scheduler scheduler, Scheduler scheduler2) {
        this.a = rfqVar;
        this.b = xmu0Var;
        this.c = hyy0Var;
        this.d = context;
        this.e = h1qVar;
        this.f = scheduler;
        this.g = scheduler2;
    }

    public final String a() {
        return "recently-played-artists";
    }

    public final z511 b() {
        zqh zqhVar = this.j;
        if (zqhVar != null) {
            return zqhVar;
        }
        u890.C("commonAdapter");
        throw null;
    }

    public final boolean c(boolean z) {
        return !z;
    }

    public final void d(udx0 udx0Var) {
        String strV = r4o1.V(udx0Var);
        byte b = 16;
        if (this.j == null) {
            this.j = rfq.a(this.a, "recently-played-artists", udx0Var.a, this.e.a(udx0Var.d), new d4v0(this, udx0Var, strV, b), null, null, new kpw0(this, udx0Var, (byte) 23), null, 176);
        }
        hyy0 hyy0Var = this.c;
        Observable observableI = yoi1.i(((k981) hyy0Var.c).a, o6x.a);
        Observable.concat(observableI.take(1L), observableI.skip(1L).debounce(500L, TimeUnit.MILLISECONDS)).distinctUntilChanged().flatMapSingle(new pux0(hyy0Var, strV, (byte) 14)).subscribeOn(this.g).observeOn(this.f).subscribe(new z0u0((Object) udx0Var, (Object) this, (byte) 8), new lyw0(this, b), ps4.V0, this.i);
    }

    public final CompletableSubject e() {
        return this.h;
    }

    public final void stop() {
        this.i.g();
    }
}
