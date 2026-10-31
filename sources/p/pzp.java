package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pzp implements e62, pjd, m0y, ue50, nr60, kmf0, zrl0, emj1, bxd, u8n, n8b, cbg1 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final v5q c;

    public /* synthetic */ pzp(daq daqVar, v5q v5qVar, byte b) {
        this.a = b;
        this.b = daqVar;
        this.c = v5qVar;
    }

    public yqg a() {
        switch (this.a) {
            case 8:
                break;
        }
        return (yqg) this.b.J1.get();
    }

    public gw70 b() {
        switch (this.a) {
            case 8:
                break;
        }
        return (gw70) this.b.d8.get();
    }

    public lzn0 c() {
        switch (this.a) {
            case 9:
                break;
            case 10:
                break;
        }
        return (lzn0) this.c.U0.get();
    }

    @Override // p.emj1
    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public fmj1 mo876create() {
        return new tzp(this.b, this.c, (byte) 8);
    }

    public q8n d() {
        return (q8n) this.b.E1.get();
    }

    public q8n e() {
        switch (this.a) {
            case 9:
                break;
        }
        return (q8n) this.b.V2.get();
    }

    public kma e0() {
        switch (this.a) {
            case 8:
                break;
        }
        return (kma) this.b.Od.get();
    }

    public Flowable f() {
        switch (this.a) {
            case 8:
                break;
        }
        return (Flowable) this.b.D5.get();
    }

    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    public qjd m880g(q2p0 q2p0Var) {
        q2p0Var.getClass();
        return new k9k(this.b, this.c, q2p0Var);
    }

    public zuf h() {
        return (zuf) this.b.Dr.get();
    }

    public uag1 i() {
        return (uag1) this.c.G6.get();
    }

    public hwp j() {
        return (hwp) this.c.va.get();
    }

    public luk k() {
        return (luk) this.b.L1.get();
    }

    public xrc0 l() {
        return (xrc0) this.b.f5.get();
    }

    public i8h1 m() {
        switch (this.a) {
            case 9:
                break;
        }
        return (i8h1) this.b.A5.get();
    }

    public zrg n() {
        byte b = this.a;
        v5q v5qVar = this.c;
        switch (b) {
            case 8:
                break;
        }
        return v5qVar.K();
    }

    public Scheduler o() {
        switch (this.a) {
            case 8:
                break;
        }
        return (Scheduler) this.b.z1.get();
    }

    public woa p() {
        switch (this.a) {
            case 8:
                break;
        }
        return (woa) this.b.W8.get();
    }

    public ov20 q() {
        return (ov20) this.b.P5.get();
    }

    public vhy r() {
        switch (this.a) {
            case 8:
                break;
        }
        return (vhy) this.c.ua.get();
    }

    public q8n r0() {
        return (q8n) this.b.w1.get();
    }

    public Activity s() {
        switch (this.a) {
            case 9:
                break;
        }
        return (Activity) this.c.i.a;
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

    @Override // p.m0y
    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public n0y mo878create() {
        return new tzp(this.b, this.c, (byte) 2);
    }

    @Override // p.ue50
    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public ve50 mo879create() {
        return new tzp(this.b, this.c, (byte) 5);
    }

    public or60 g(q2p0 q2p0Var) {
        q2p0Var.getClass();
        return new s24(this.b, this.c, q2p0Var);
    }

    @Override // p.e62
    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public f62 mo875create() {
        return new qzp(this.b, this.c, (byte) 0);
    }

    @Override // p.zrl0
    public asl0 create() {
        return new qzp(this.b, this.c, (byte) 6);
    }

    @Override // p.kmf0
    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public lmf0 mo877create() {
        return new qzp(this.b, this.c, (byte) 5);
    }
}
