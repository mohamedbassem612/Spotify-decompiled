package p;

import android.app.Activity;
import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m3q implements dl4 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final teq c;
    public final jly0 d;

    public m3q(daq daqVar, teq teqVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = daqVar;
                this.c = teqVar;
                this.d = xqu.b(new fyo((byte) 25));
                break;
            default:
                this.b = daqVar;
                this.c = teqVar;
                this.d = xqu.b(new bup(daqVar, this, (byte) 6));
                break;
        }
    }

    public p2o0 a() {
        teq teqVar = this.c;
        Activity activity = (Activity) teqVar.f.a;
        daq daqVar = this.b;
        return aan0.t(activity, (d3o0) daqVar.E2.get(), new u210((t2j0) teqVar.b.a.f2.get()), (Scheduler) daqVar.z1.get());
    }

    public final void w(Object obj) {
        byte b = this.a;
        teq teqVar = this.c;
        jly0 jly0Var = this.d;
        switch (b) {
            case 0:
                hx81 hx81Var = (hx81) obj;
                ((hip) hx81Var).F1 = (jgu) teqVar.b.u.get();
                hx81Var.I1 = a();
                hx81Var.K1 = (t1o0) jly0Var.get();
                hx81Var.J1 = (th30) teqVar.m1.get();
                break;
            default:
                z641 z641Var = (z641) obj;
                z641Var.a2 = (slc0) jly0Var.get();
                z641Var.Z1 = (lzn0) teqVar.i.get();
                yiq yiqVar = teqVar.b;
                w741 w741Var = new w741((Context) yiqVar.b.f.a, false);
                x0s0 x0s0Var = (x0s0) yiqVar.yb.get();
                daq daqVar = yiqVar.a;
                g1s0 g1s0Var = new g1s0(new vrv0(w741Var, x0s0Var, new d1s0(false, false, (luk) daqVar.L1.get()), yiqVar.q1()), new ep31(j310.q((RetrofitMaker) daqVar.Y3.get()), (byte) 2), yiqVar.q1(), new g931((f741) daqVar.a.l1.get(), (Context) daqVar.x1.a, (q8n) daqVar.E1.get(), (byte) 8));
                daq daqVar2 = this.b;
                z641Var.V1 = new bjx(g1s0Var, (i8h1) daqVar2.A5.get(), new pdl0((byte) 6), (xov0) daqVar2.D6.get(), yiqVar.Y0());
                z641Var.W1 = (a741) daqVar2.a.Z4.get();
                z641Var.X1 = new myq0((i8h1) daqVar.A5.get(), rx31.o(), (byte) 7);
                z641Var.Y1 = (kt91) daqVar2.f8.get();
                break;
        }
    }
}
