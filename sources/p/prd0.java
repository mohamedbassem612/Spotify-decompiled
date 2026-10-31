package p;

import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class prd0 implements yqd0 {
    public final xqd0 a;
    public final n350 b;
    public final Scheduler c;
    public final zia d = new zia();
    public final rny0 e = new rny0();
    public MobiusLoop.Controller f;

    public prd0(xqd0 xqd0Var, n350 n350Var, Scheduler scheduler) {
        this.a = xqd0Var;
        this.b = n350Var;
        this.c = scheduler;
    }

    @Override // p.yqd0
    public final void a() {
        this.e.accept(qtd0.a);
    }

    @Override // p.yqd0
    public final void b() {
        this.e.accept(zsd0.a);
    }

    @Override // p.yqd0
    public final zia c() {
        return this.d;
    }

    @Override // p.yqd0
    public final void d() {
        this.e.accept(btd0.a);
    }

    @Override // p.yqd0
    public final void e() {
        this.e.accept(ftd0.a);
    }

    @Override // p.yqd0
    public final void start() {
        if (this.b.a()) {
            MobiusLoop.Controller controllerA = h8m0.a(this.a, this.e, this.c);
            controllerA.c(new ku1(this.d, (byte) 18));
            controllerA.start();
            this.f = controllerA;
        }
    }

    @Override // p.yqd0
    public final void stop() {
        MobiusLoop.Controller controller = this.f;
        if (controller != null) {
            qrd0.a(controller);
        }
        this.d.accept(ytd0.a);
    }
}
