package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iwm1 implements c8m0 {
    public final ky41 a;
    public final EventSource b;
    public final Scheduler c;

    public iwm1(ky41 ky41Var, EventSource eventSource, Scheduler scheduler) {
        this.a = ky41Var;
        this.b = eventSource;
        this.c = scheduler;
    }

    @Override // p.c8m0
    public final MobiusLoop.Controller a(Object obj, bk1 bk1Var) {
        f230 f230Var = new f230(awm1.h, (byte) 3);
        ny41 ny41Var = (ny41) this.a;
        ny41Var.getClass();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(tn3.class, ny41Var.d.B());
        subtypeEffectHandlerBuilderC.g(on3.class, new y0h(bk1Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(ao3.class, new my41(ny41Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(kn3.class, new my41(ny41Var, (byte) 1));
        jzs0 jzs0Var = ny41Var.a;
        subtypeEffectHandlerBuilderC.g(un3.class, (ObservableTransformer) jzs0Var.b.getValue());
        subtypeEffectHandlerBuilderC.g(uo3.class, (ObservableTransformer) jzs0Var.c.getValue());
        s030 s030Var = new s030(ny41Var.c, (byte) 2);
        Scheduler scheduler = ny41Var.e;
        subtypeEffectHandlerBuilderC.b(eo3.class, s030Var, scheduler);
        subtypeEffectHandlerBuilderC.d(fo3.class, new tr41(ny41Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.c(nn3.class, w841.O0);
        subtypeEffectHandlerBuilderC.c(co3.class, w841.P0);
        subtypeEffectHandlerBuilderC.c(bo3.class, w841.Q0);
        subtypeEffectHandlerBuilderC.c(xn3.class, w841.R0);
        subtypeEffectHandlerBuilderC.c(qo3.class, w841.Y);
        subtypeEffectHandlerBuilderC.c(mn3.class, w841.Z);
        subtypeEffectHandlerBuilderC.c(rn3.class, w841.N0);
        return Mobius.b(Mobius.d(f230Var, RxConnectables.a(new wiw(subtypeEffectHandlerBuilderC.h(), (byte) 0))).h(this.b).d(new bwm1(this)).b(new cwm1(this)).f(wue0.a()), (tr3) obj, new qh80(dwm1.a, ewm1.a, fwm1.b, gwm1.a, hwm1.a), MainThreadWorkRunner.a());
    }
}
