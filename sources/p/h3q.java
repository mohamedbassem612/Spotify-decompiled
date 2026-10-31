package p;

import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h3q implements asl0, dcz0 {
    public final daq a;
    public final s7q b;

    public /* synthetic */ h3q(daq daqVar, s7q s7qVar) {
        this.a = daqVar;
        this.b = s7qVar;
    }

    @Override // p.asl0
    public au90 A0() {
        return this.a.J1();
    }

    @Override // p.asl0
    public n3d0 C0() {
        return (n3d0) this.a.C9.get();
    }

    @Override // p.asl0
    public fh4 D0() {
        return new fh4(false, (luk) this.a.L1.get());
    }

    @Override // p.asl0
    public Observable E0() {
        return (Observable) this.a.J6.get();
    }

    @Override // p.asl0
    public waz0 Y() {
        return (waz0) this.a.Kc.get();
    }

    @Override // p.asl0
    public yqg a() {
        return (yqg) this.a.J1.get();
    }

    @Override // p.asl0
    public Flowable c() {
        return (Flowable) this.a.D5.get();
    }

    public ecz0 create() {
        return new kbq(this.a, this.b);
    }

    @Override // p.asl0
    public kt91 j() {
        return (kt91) this.a.f8.get();
    }

    @Override // p.asl0
    public xrc0 l() {
        return (xrc0) this.a.f5.get();
    }

    @Override // p.asl0
    public i8h1 m() {
        return (i8h1) this.a.A5.get();
    }

    @Override // p.asl0
    public Scheduler o() {
        return (Scheduler) this.a.z1.get();
    }

    @Override // p.asl0
    public RxRouter p() {
        return (RxRouter) this.a.G1.get();
    }

    @Override // p.asl0
    public g5p0 w0() {
        return (g5p0) this.b.Z3.get();
    }

    @Override // p.asl0
    public Scheduler y0() {
        return (Scheduler) this.a.A2.get();
    }
}
