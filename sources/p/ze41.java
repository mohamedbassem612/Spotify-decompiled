package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ze41 extends xca {
    public final /* synthetic */ byte f;
    public Disposable g;
    public spq0 h;
    public final Scheduler i;
    public final Flowable j;
    public final irb1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze41(x610 x610Var, aos aosVar, Scheduler scheduler, Flowable flowable, irb1 irb1Var, byte b) {
        super(x610Var, aosVar);
        this.f = b;
        j5 j5Var = j5.a;
        switch (b) {
            case 1:
                super(x610Var, aosVar);
                this.h = j5Var;
                this.i = scheduler;
                this.j = flowable;
                this.k = irb1Var;
                break;
            default:
                this.h = j5Var;
                this.i = scheduler;
                this.j = flowable;
                this.k = irb1Var;
                break;
        }
    }

    @Override // p.xca
    public final void c() {
        byte b = this.f;
        Scheduler scheduler = this.i;
        Flowable flowable = this.j;
        switch (b) {
            case 0:
                FlowableObserveOn flowableObserveOnL = flowable.L(scheduler);
                final byte b2 = 0;
                final byte b3 = 1;
                this.g = flowableObserveOnL.subscribe(new Consumer(this) { // from class: p.ye41
                    public final /* synthetic */ ze41 b;

                    {
                        this.b = this;
                    }

                    public final void accept(Object obj) {
                        byte b4 = b2;
                        ze41 ze41Var = this.b;
                        switch (b4) {
                            case 0:
                                ft5 ft5Var = new ft5((PlayerState) spq0.a((PlayerState) obj).h());
                                Boolean bool = ft5Var.d;
                                if (!ze41Var.h.c() || !bool.equals(ze41Var.h.b())) {
                                    ze41Var.b(ft5Var);
                                    ze41Var.h = spq0.d(bool);
                                }
                                break;
                            default:
                                ft5 ft5Var2 = new ft5(null);
                                Boolean bool2 = ft5Var2.d;
                                if (!ze41Var.h.c() || !bool2.equals(ze41Var.h.b())) {
                                    ze41Var.b(ft5Var2);
                                    ze41Var.h = spq0.d(bool2);
                                }
                                break;
                        }
                    }
                }, new Consumer(this) { // from class: p.ye41
                    public final /* synthetic */ ze41 b;

                    {
                        this.b = this;
                    }

                    public final void accept(Object obj) {
                        byte b4 = b3;
                        ze41 ze41Var = this.b;
                        switch (b4) {
                            case 0:
                                ft5 ft5Var = new ft5((PlayerState) spq0.a((PlayerState) obj).h());
                                Boolean bool = ft5Var.d;
                                if (!ze41Var.h.c() || !bool.equals(ze41Var.h.b())) {
                                    ze41Var.b(ft5Var);
                                    ze41Var.h = spq0.d(bool);
                                }
                                break;
                            default:
                                ft5 ft5Var2 = new ft5(null);
                                Boolean bool2 = ft5Var2.d;
                                if (!ze41Var.h.c() || !bool2.equals(ze41Var.h.b())) {
                                    ze41Var.b(ft5Var2);
                                    ze41Var.h = spq0.d(bool2);
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                this.g = flowable.L(scheduler).subscribe(new fv5(this, (byte) 23), new jld((byte) 19));
                break;
        }
    }

    @Override // p.xca
    public final void d() {
        switch (this.f) {
            case 0:
                Disposable disposable = this.g;
                if (disposable != null && !disposable.isDisposed()) {
                    this.g.dispose();
                    this.g = null;
                    break;
                }
                break;
            default:
                Disposable disposable2 = this.g;
                if (disposable2 != null && !disposable2.isDisposed()) {
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
        irb1 irb1Var = this.k;
        switch (b) {
            case 0:
                b(new ft5((PlayerState) irb1Var.c.h()));
                break;
            default:
                b(new rt5((PlayerState) irb1Var.c.h()));
                break;
        }
    }
}
