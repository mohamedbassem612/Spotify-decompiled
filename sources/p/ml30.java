package p;

import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ml30 implements iyf0 {
    public final Scheduler a;
    public final o241 b;
    public final uj4 c;
    public final ljg d;
    public final vku e = new vku();

    public ml30(Scheduler scheduler, o241 o241Var, uj4 uj4Var, ljg ljgVar) {
        this.a = scheduler;
        this.b = o241Var;
        this.c = uj4Var;
        this.d = ljgVar;
    }

    @Override // p.iyf0
    public final void c() {
        if (this.c.a()) {
            Disposable disposableSubscribe = this.b.a.map(zi20.c).distinctUntilChanged().filter(aj20.c).switchMapCompletable(new jl00(this, (byte) 8)).s(this.a).subscribe(ps4.N0, k530.d);
            disposableSubscribe.getClass();
            this.e.a(disposableSubscribe);
        }
    }

    @Override // p.iyf0
    public final void d() {
        this.e.c();
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
    }
}
