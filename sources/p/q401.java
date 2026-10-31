package p;

import android.content.Context;
import com.spotify.mobius.rx3.RxConnectables;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q401 implements xpw {
    public final los a;
    public final bnq b;
    public final pux0 c;
    public final gw70 d;
    public final Context e;
    public final frd1 f;
    public final sxz0 g;
    public final e7m0 h;
    public final ia00 i;
    public final psw t;

    public q401(String str, String str2, los losVar, umq umqVar, bnq bnqVar, pux0 pux0Var, txz0 txz0Var, gw70 gw70Var, Context context) {
        this.a = losVar;
        this.b = bnqVar;
        this.c = pux0Var;
        this.d = gw70Var;
        this.e = context;
        frd1 frd1Var = new frd1(str2, str);
        this.f = frd1Var;
        sxz0 sxz0VarA = txz0Var.a(frd1Var);
        if (sxz0VarA == null) {
            hhg1.n("Required value was null.");
            throw null;
        }
        this.g = sxz0VarA;
        this.h = sbl.z(new o501(sxz0VarA.c()), t7p0.s, RxConnectables.a(umqVar.a(frd1Var, new vqv0(this, (byte) 13), sxz0VarA).a()), atz0.g, k301.e);
        this.i = n3o1.q(this).a(kxz0.t, kxz0.X);
        j2i j2iVar = new j2i(-750806766, new zyy0(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
