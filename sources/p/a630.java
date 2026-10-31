package p;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a630 extends x7e0 {
    public final h2v0 N0;
    public final k9v0 O0;
    public final h521 P0;
    public final zll Q0;
    public final hms0 R0;
    public final x25 S0;
    public snc0 T0;
    public LinkedHashMap U0;
    public Map V0;
    public b431 W0;
    public final nlo X;
    public q4u X0;
    public final z1v Y;
    public ArrayList Y0;
    public final rae Z;
    public ArrayList Z0;
    public final hvp0 d;
    public final vgr e;
    public final iac0 f;
    public final p410 g;
    public final Context h;
    public final s530 i;
    public final mwn t;

    public a630(hvp0 hvp0Var, vgr vgrVar, iac0 iac0Var, p410 p410Var, Context context, s530 s530Var, mwn mwnVar, nlo nloVar, z1v z1vVar, rae raeVar, h2v0 h2v0Var, k9v0 k9v0Var, h521 h521Var, zll zllVar, hms0 hms0Var, x25 x25Var) {
        this.d = hvp0Var;
        this.e = vgrVar;
        this.f = iac0Var;
        this.g = p410Var;
        this.h = context;
        this.i = s530Var;
        this.t = mwnVar;
        this.X = nloVar;
        this.Y = z1vVar;
        this.Z = raeVar;
        this.N0 = h2v0Var;
        this.O0 = k9v0Var;
        this.P0 = h521Var;
        this.Q0 = zllVar;
        this.R0 = hms0Var;
        this.S0 = x25Var;
        this.Y0 = s530Var.a();
        this.Z0 = s530Var.d();
    }

    public final void e() {
        f710 f710Var = new f710(this, (byte) 11);
        if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
            f710Var.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new a6n(f710Var, (byte) 22));
        }
    }

    public final void f() {
        this.t.dispose();
        this.X.dispose();
        this.Y.dispose();
        this.Z.dispose();
        this.N0.dispose();
        this.O0.dispose();
        this.P0.dispose();
        MobiusLoop mobiusLoop = this.Q0.c;
        if (mobiusLoop == null) {
            u890.C("loop");
            throw null;
        }
        mobiusLoop.dispose();
        ((vku) this.g.g).c();
        if (this.T0 != null) {
            k().destroy();
        }
    }

    public final snc0 k() {
        snc0 snc0Var = this.T0;
        if (snc0Var != null) {
            return snc0Var;
        }
        u890.C("listContentRuntime");
        throw null;
    }
}
