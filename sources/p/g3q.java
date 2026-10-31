package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g3q implements zrl0, u8n, n8b, cbg1 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final s7q c;

    public /* synthetic */ g3q(daq daqVar, s7q s7qVar, byte b) {
        this.a = b;
        this.b = daqVar;
        this.c = s7qVar;
    }

    public yqg a() {
        return (yqg) this.b.J1.get();
    }

    public gw70 b() {
        return (gw70) this.b.d8.get();
    }

    public lzn0 c() {
        switch (this.a) {
            case 1:
                break;
            case 2:
                break;
        }
        return (lzn0) this.c.U0.get();
    }

    @Override // p.zrl0
    public asl0 create() {
        return new h3q(this.b, this.c);
    }

    public q8n d() {
        return (q8n) this.b.E1.get();
    }

    public q8n e() {
        switch (this.a) {
            case 1:
                break;
        }
        return (q8n) this.b.V2.get();
    }

    public kma e0() {
        return (kma) this.b.Od.get();
    }

    public Flowable f() {
        return (Flowable) this.b.D5.get();
    }

    public zuf h() {
        return (zuf) this.b.Dr.get();
    }

    public uag1 i() {
        return (uag1) this.c.rf.get();
    }

    public hwp j() {
        return (hwp) this.c.zj.get();
    }

    public luk k() {
        return (luk) this.b.L1.get();
    }

    public i8h1 m() {
        switch (this.a) {
            case 1:
                break;
        }
        return (i8h1) this.b.A5.get();
    }

    public zrg n() {
        s7q s7qVar = this.c;
        return new zrg((Activity) s7qVar.t.a, (lzn0) s7qVar.U0.get(), (a1r0) s7qVar.X0.get());
    }

    public Scheduler o() {
        return (Scheduler) this.b.z1.get();
    }

    public woa p() {
        return (woa) this.b.W8.get();
    }

    public ov20 q() {
        return (ov20) this.b.P5.get();
    }

    public vhy r() {
        return (vhy) this.c.yj.get();
    }

    public q8n r0() {
        return (q8n) this.b.w1.get();
    }

    public Activity s() {
        byte b = this.a;
        jo80 jo80Var = this.c.t;
        switch (b) {
            case 1:
                break;
        }
        return (Activity) jo80Var.a;
    }

    public luk t() {
        return (luk) this.b.L1.get();
    }

    public dgz0 u() {
        return (dgz0) this.b.Er.get();
    }

    public t8u0 v() {
        return (t8u0) this.b.d9.get();
    }
}
