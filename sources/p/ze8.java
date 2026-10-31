package p;

import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.mixed.MaybeFlatMapObservable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ze8 implements iyf0 {
    public final t7o0 a;
    public final ye8 b;
    public final zwz0 c;
    public final Scheduler d;
    public final rku e = new rku();

    public ze8(t7o0 t7o0Var, ye8 ye8Var, zwz0 zwz0Var, Scheduler scheduler) {
        this.a = t7o0Var;
        this.b = ye8Var;
        this.c = zwz0Var;
        this.d = scheduler;
    }

    public final void d() {
        this.e.a();
    }

    public final void i() {
        ye8 ye8Var = this.b;
        this.e.b(new MaybeFlatMapObservable(Single.zip(ye8Var.c.flatMap(new ps7(ye8Var, (byte) 2)), yoi1.i(this.c.c(), o6x.a).sample(1200L, TimeUnit.MILLISECONDS).firstOrError(), mif1.t).filter(fmv.i), new x5j1(this, (byte) 26)).flatMap(new lan1(this, (byte) 28)).observeOn(this.d).subscribe(p.e, nm.V0));
    }

    public final void c() {
    }

    public final void g(ViewGroup viewGroup) {
    }
}
