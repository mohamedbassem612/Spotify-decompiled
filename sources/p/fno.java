package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fno extends xca {
    public final /* synthetic */ byte f;
    public Disposable g;
    public final Scheduler h;
    public final Flowable i;
    public final irb1 j;
    public Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fno(x610 x610Var, aos aosVar, Scheduler scheduler, Flowable flowable, irb1 irb1Var) {
        super(x610Var, aosVar);
        this.f = (byte) 0;
        this.g = EmptyDisposable.a;
        this.h = scheduler;
        this.i = flowable;
        this.j = irb1Var;
    }

    @Override // p.xca
    public final void c() {
        byte b = this.f;
        Scheduler scheduler = this.h;
        Flowable flowable = this.i;
        switch (b) {
            case 0:
                this.g = flowable.L(scheduler).subscribe(new fv5(this, (byte) 2), new jld((byte) 3));
                break;
            case 1:
                this.g = flowable.L(scheduler).subscribe(new fv5(this, (byte) 11), new jld((byte) 14));
                break;
            case 2:
                this.g = flowable.L(scheduler).subscribe(new fv5(this, (byte) 12), new jld((byte) 15));
                break;
            default:
                this.g = flowable.L(scheduler).subscribe(new fv5(this, (byte) 16), new jld((byte) 18));
                break;
        }
    }

    @Override // p.xca
    public final void d() {
        switch (this.f) {
            case 0:
                if (!this.g.isDisposed()) {
                    this.g.dispose();
                }
                break;
            case 1:
                Disposable disposable = this.g;
                if (disposable != null && !disposable.isDisposed()) {
                    this.g.dispose();
                    this.g = null;
                    break;
                }
                break;
            case 2:
                Disposable disposable2 = this.g;
                if (disposable2 != null && !disposable2.isDisposed()) {
                    this.g.dispose();
                    this.g = null;
                    break;
                }
                break;
            default:
                Disposable disposable3 = this.g;
                if (disposable3 != null && !disposable3.isDisposed()) {
                    this.g.dispose();
                    this.g = null;
                    break;
                }
                break;
        }
    }

    @Override // p.xca
    public final void e(q881 q881Var, int i) {
        byte b = this.f;
        irb1 irb1Var = this.j;
        switch (b) {
            case 0:
                spq0 spq0Var = irb1Var.c;
                if (!spq0Var.c()) {
                    b(ju5.u);
                } else {
                    iu5 iu5Var = ju5.Companion;
                    PlayerState playerState = (PlayerState) spq0Var.b();
                    iu5Var.getClass();
                    b(iu5.a(playerState));
                }
                break;
            case 1:
                b(new ns5((PlayerState) irb1Var.c.h()));
                break;
            case 2:
                ps5 ps5Var = qs5.Companion;
                PlayerState playerState2 = (PlayerState) irb1Var.c.h();
                yqg yqgVar = (yqg) this.k;
                ps5Var.getClass();
                b(ps5.a(playerState2, yqgVar));
                break;
            default:
                b(new zs5((PlayerState) irb1Var.c.h()));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fno(x610 x610Var, aos aosVar, Scheduler scheduler, Flowable flowable, yqg yqgVar, irb1 irb1Var) {
        super(x610Var, aosVar);
        this.f = (byte) 2;
        this.h = scheduler;
        this.i = flowable;
        this.k = yqgVar;
        this.j = irb1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fno(x610 x610Var, aos aosVar, Scheduler scheduler, Flowable flowable, irb1 irb1Var, byte b) {
        super(x610Var, aosVar);
        this.f = b;
        this.h = scheduler;
        this.i = flowable;
        this.j = irb1Var;
    }
}
