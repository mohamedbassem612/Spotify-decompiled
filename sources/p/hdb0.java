package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hdb0 implements eck1 {
    public final kp00 a;
    public final n801 b;
    public final dxz0 c;
    public final Scheduler d;
    public final Scheduler e;
    public final Scheduler f;

    public hdb0(kp00 kp00Var, n801 n801Var, dxz0 dxz0Var, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3) {
        this.a = kp00Var;
        this.b = n801Var;
        this.c = dxz0Var;
        this.d = scheduler;
        this.e = scheduler2;
        this.f = scheduler3;
    }

    public final xbk1 b(Class cls) {
        return new gdb0(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
