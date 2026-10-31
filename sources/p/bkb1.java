package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bkb1 implements o5s {
    public final Flowable N0;
    public final u2f0 O0;
    public final Scheduler P0;
    public final iac0 Q0;
    public long S0;
    public boolean T0;
    public q5o U0;
    public faa0 V0;
    public boolean W0;
    public final Single X;
    public final dv Y;
    public final wbd1 Z;
    public final fib1 a;
    public final ohv0 b;
    public final b2r0 c;
    public final i8h1 d;
    public final yqg e;
    public final wab f;
    public final yzu g;
    public final g1f0 h;
    public final kly0 i;
    public final kg0 t;
    public final rku R0 = new rku();
    public final String X0 = "start_intent_led";

    public bkb1(fib1 fib1Var, ohv0 ohv0Var, b2r0 b2r0Var, i8h1 i8h1Var, yqg yqgVar, wab wabVar, yzu yzuVar, g1f0 g1f0Var, kly0 kly0Var, kg0 kg0Var, Single single, dv dvVar, wbd1 wbd1Var, Flowable flowable, u2f0 u2f0Var, Scheduler scheduler, iac0 iac0Var, t0i t0iVar) {
        this.a = fib1Var;
        this.b = ohv0Var;
        this.c = b2r0Var;
        this.d = i8h1Var;
        this.e = yqgVar;
        this.f = wabVar;
        this.g = yzuVar;
        this.h = g1f0Var;
        this.i = kly0Var;
        this.t = kg0Var;
        this.X = single;
        this.Y = dvVar;
        this.Z = wbd1Var;
        this.N0 = flowable;
        this.O0 = u2f0Var;
        this.P0 = scheduler;
        this.Q0 = iac0Var;
        iac0Var.getLifecycle().a(this);
        if (!g1f0Var.r()) {
            a();
        }
        t0iVar.a(wabVar);
    }

    public final void a() {
        if (this.f == null || this.W0) {
            return;
        }
        this.W0 = true;
        this.g.L(new h5z(this, (byte) 8));
    }

    public final void onDestroy(iac0 iac0Var) {
        this.R0.a();
    }

    public final void onStart(iac0 iac0Var) {
        String str = ((uba) this.c).Y.c.a;
        String str2 = this.X0;
        nhv0 nhv0Var = new nhv0(str2, str);
        ohv0 ohv0Var = this.b;
        ohv0Var.a(nhv0Var);
        this.S0 = this.e.b();
        this.f.getClass();
        ohv0Var.a(new khv0(str2, "layout", zno1.t(oqn1.n("value", "intent_led"))));
        ohv0Var.a(new khv0(str2, "ScreenOrientation", zno1.t(oqn1.n("value", String.valueOf(this.a.k0().getConfiguration().orientation)))));
    }

    public final void onStop(iac0 iac0Var) {
        this.g.f();
        this.b.a(new khv0(this.X0, "StartFragmentStartToStop", zno1.t(oqn1.n("value", String.valueOf(this.e.b() - this.S0)))));
    }
}
