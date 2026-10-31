package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jts0 implements gyf0 {
    public static final String i = f4i1.e(nik1.z0.a, "?facet=default");
    public final lzn0 a;
    public final xvo b;
    public final svo c;
    public final yun0 d;
    public final Scheduler e;
    public final boolean f;
    public Disposable g = EmptyDisposable.a;
    public final fmo h = new fmo(this, (byte) 6);

    public jts0(lzn0 lzn0Var, xvo xvoVar, svo svoVar, yun0 yun0Var, Scheduler scheduler, boolean z) {
        this.a = lzn0Var;
        this.b = xvoVar;
        this.c = svoVar;
        this.d = yun0Var;
        this.e = scheduler;
        this.f = z;
    }

    public final void a() {
        this.d.d(this.h);
        this.g.dispose();
    }

    public final void b() {
        if (this.f) {
            this.d.g(this.h);
            this.g = this.b.a(false).observeOn(this.e).subscribe(new ixp0(this, (byte) 15));
        }
    }
}
