package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k3q implements bxd {
    public final daq a;
    public final teq b;

    public /* synthetic */ k3q(daq daqVar, teq teqVar) {
        this.a = daqVar;
        this.b = teqVar;
    }

    public yqg a() {
        return (yqg) this.a.J1.get();
    }

    public gw70 b() {
        return (gw70) this.a.d8.get();
    }

    public kma e0() {
        return (kma) this.a.Od.get();
    }

    public Flowable f() {
        return (Flowable) this.a.D5.get();
    }

    public xrc0 l() {
        return (xrc0) this.b.e1.get();
    }

    public zrg n() {
        return this.b.e1();
    }

    public Scheduler o() {
        return (Scheduler) this.a.z1.get();
    }

    public woa p() {
        return (woa) this.a.W8.get();
    }

    public vhy r() {
        return (vhy) this.b.Ah.get();
    }
}
