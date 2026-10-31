package p;

import android.app.Activity;
import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nzp implements dl4, asl0 {
    public final daq a;
    public final teq b;

    public /* synthetic */ nzp(daq daqVar, teq teqVar) {
        this.a = daqVar;
        this.b = teqVar;
    }

    @Override // p.asl0
    public au90 A0() {
        return this.a.J1();
    }

    @Override // p.asl0
    public n3d0 C0() {
        return (n3d0) this.b.T5.get();
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

    public Activity b() {
        return (Activity) this.b.f.a;
    }

    @Override // p.asl0
    public Flowable c() {
        return (Flowable) this.a.D5.get();
    }

    public luk d() {
        return (luk) this.a.L1.get();
    }

    @Override // p.asl0
    public kt91 j() {
        return (kt91) this.a.f8.get();
    }

    @Override // p.asl0
    public xrc0 l() {
        return (xrc0) this.b.e1.get();
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

    public void w(Object obj) {
        pi3 pi3Var = (pi3) obj;
        teq teqVar = this.b;
        yiq yiqVar = teqVar.b;
        daq daqVar = yiqVar.a;
        pi3Var.Z1 = new x6o0(new t450((Context) daqVar.x1.a, (byte) 1), new lhc((byte) 28, false));
        pi3Var.V1 = new oj80((i8h1) daqVar.A5.get());
        bn5 bn5Var = (bn5) yiqVar.A5.get();
        daq daqVar2 = yiqVar.a;
        byte b = 11;
        pi3Var.X1 = new ajq0(bn5Var, new kr60(daqVar2.A(), (byte) 11), new yo31(new fl1((RetrofitMaker) daqVar2.Y3.get()), (byte) 13), (Activity) teqVar.f.a, new x5j1(teqVar.b.Y0(), b));
        pi3Var.W1 = new x5j1(teqVar.b.Y0(), b);
        daq daqVar3 = this.a;
        pi3Var.a2 = (Scheduler) daqVar3.z1.get();
        pi3Var.Y1 = (kt91) daqVar3.f8.get();
    }

    @Override // p.asl0
    public g5p0 w0() {
        return (g5p0) this.b.D4.get();
    }

    @Override // p.asl0
    public Scheduler y0() {
        return (Scheduler) this.a.A2.get();
    }
}
