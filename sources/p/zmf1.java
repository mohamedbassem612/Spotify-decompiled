package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zmf1 extends xca {
    public Disposable f;
    public long g;
    public final Scheduler h;
    public final Flowable i;
    public final yqg j;
    public final irb1 k;

    public zmf1(x610 x610Var, aos aosVar, Scheduler scheduler, Flowable flowable, yqg yqgVar, irb1 irb1Var) {
        super(x610Var, aosVar);
        this.f = EmptyDisposable.a;
        this.g = -1L;
        this.h = scheduler;
        this.i = flowable;
        this.j = yqgVar;
        this.k = irb1Var;
    }

    @Override // p.xca
    public final void c() {
        this.f = this.i.L(this.h).subscribe(new fv5(this, (byte) 28), new jld((byte) 22));
    }

    @Override // p.xca
    public final void d() {
        if (this.f.isDisposed()) {
            return;
        }
        this.f.dispose();
    }

    @Override // p.xca
    public final void e(q881 q881Var, int i) {
        b(new mu5((PlayerState) this.k.c.h(), this.j));
    }
}
