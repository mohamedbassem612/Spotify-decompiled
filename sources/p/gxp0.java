package p;

import android.content.Context;
import android.content.Intent;
import com.google.protobuf.Empty;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gxp0 extends s5w0 {
    public final m6k0 H1;
    public prp0 I1;
    public kt91 J1;
    public i8h1 K1;
    public final wqk0 L1 = new wqk0((byte) 11);
    public final ArrayList M1 = new ArrayList(1);
    public final fxp0 N1 = new fxp0(this);

    public gxp0(m6k0 m6k0Var) {
        this.H1 = m6k0Var;
    }

    public final void D0() {
        prp0 prp0Var = this.I1;
        prp0Var.c.remove(this.N1);
        this.I1.b.a();
        ((zf30) this).h1 = true;
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        prp0 prp0Var = this.I1;
        prp0Var.c.add(this.N1);
        prp0 prp0Var2 = this.I1;
        rku rkuVar = prp0Var2.b;
        Observable map = prp0Var2.a.a.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeError", Empty.n()).map(aj20.T0).map(een.o1).map(vf61.c1);
        Scheduler scheduler = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler);
        rkuVar.b(map.observeOn(scheduler).subscribe(new lrj0(prp0Var2, (byte) 28), p.X0));
    }

    @Override // p.s5w0
    public final void Y0() {
        super.Y0();
        ArrayList arrayList = this.M1;
        if (arrayList.isEmpty()) {
            return;
        }
        startActivityForResult((Intent) arrayList.remove(0), this.G1);
        this.K1.m(this.L1.i().q(), null);
    }

    public final void v0(Context context) {
        this.H1.f(this);
        super.v0(context);
    }
}
