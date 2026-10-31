package p;

import android.content.Context;
import com.spotify.showcase.showcase.events.proto.NativeAdsShowcaseRenderType;
import io.reactivex.rxjava3.core.Flowable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hd81 implements xpw, o5s {
    public final uu00 N0;
    public final dnc O0;
    public final ggl P0;
    public final boolean Q0;
    public final t2j0 R0;
    public final krh S0;
    public final ov20 T0;
    public final llm U0;
    public final nwt V0;
    public boolean W0;
    public final iu30 X;
    public String X0;
    public final Function0 Y;
    public Boolean Y0;
    public final lc81 Z;
    public final ia00 Z0;
    public final epb1 a;
    public final od81 a1;
    public final lzn0 b;
    public final ljm0 b1;
    public final l0x0 c;
    public final y441 d;
    public final hvp0 e;
    public final Flowable f;
    public final kko g;
    public final klv0 h;
    public final vgm i;
    public final mr20 t;

    public hd81(Context context, gw70 gw70Var, epb1 epb1Var, lzn0 lzn0Var, l0x0 l0x0Var, idd1 idd1Var, idd1 idd1Var2, idd1 idd1Var3, idd1 idd1Var4, idd1 idd1Var5, y441 y441Var, hvp0 hvp0Var, aru0 aru0Var, Flowable flowable, kko kkoVar, klv0 klv0Var, vgm vgmVar, mr20 mr20Var, iu30 iu30Var, Function0 function0, Function0 function1, lc81 lc81Var, uu00 uu00Var, tbw0 tbw0Var, yqg yqgVar, cua cuaVar, dnc dncVar, iac0 iac0Var, ggl gglVar, boolean z, t2j0 t2j0Var, krh krhVar, ov20 ov20Var, llm llmVar, nwt nwtVar, int i) {
        this.a = epb1Var;
        this.b = lzn0Var;
        this.c = l0x0Var;
        this.d = y441Var;
        this.e = hvp0Var;
        this.f = flowable;
        this.g = kkoVar;
        this.h = klv0Var;
        this.i = vgmVar;
        this.t = mr20Var;
        this.X = iu30Var;
        this.Y = function1;
        this.Z = lc81Var;
        this.N0 = uu00Var;
        this.O0 = dncVar;
        this.P0 = gglVar;
        this.Q0 = z;
        this.R0 = t2j0Var;
        this.S0 = krhVar;
        this.T0 = ov20Var;
        this.U0 = llmVar;
        this.V0 = nwtVar;
        idd1 idd1Var6 = new idd1(new sai0(aru0Var, this, (byte) 5));
        iac0Var.getLifecycle().a(this);
        this.Z0 = n3o1.q(this).a(bnx0.h, new cq61(this, (byte) 11));
        this.a1 = new od81(context, gw70Var, idd1Var, idd1Var2, idd1Var3, idd1Var6, idd1Var4, idd1Var5, function0, function1, new v6a(1, this, hd81.class, "getVideoSurface", "getVideoSurface(Landroid/content/Context;)Lcom/spotify/betamax/player/VideoSurfaceView;", 0, (byte) 9), tbw0Var, yqgVar, cuaVar, i);
        this.b1 = h7w.D(new d781(this, (byte) 4), (bs50) null, (iu30) null, apo.j(940792722, new fd81(this), true), 6);
    }

    public final rqw a() {
        return this.Z0;
    }

    public final jsw c() {
        return this.a1;
    }

    public final void e(id81 id81Var, he81 he81Var, boolean z) {
        sln0 sln0Var;
        tln0 tln0Var;
        Iterable iterableK;
        rln0 rln0Var;
        n1x n1xVar = id81Var.e;
        this.X0 = n1xVar.a;
        this.Y0 = null;
        int i = he81Var.G;
        int iC = l1d.C(i);
        if (iC == 1) {
            sln0Var = sln0.c;
        } else if (iC == 2) {
            sln0Var = sln0.d;
        } else if (iC != 3) {
            sln0Var = iC != 4 ? sln0.b : sln0.f;
        } else {
            sln0Var = sln0.e;
        }
        int iC2 = l1d.C(he81Var.H);
        if (iC2 == 0) {
            tln0Var = tln0.b;
        } else {
            if (iC2 != 1) {
                eg.o();
                return;
            }
            tln0Var = tln0.c;
        }
        boolean z2 = i == 5;
        boolean z3 = z2 && he81Var.A != null;
        if (z2) {
            smc0 smc0VarN = k4p1.n();
            if (!he81Var.w) {
                smc0VarN.add(oln0.b);
            }
            if (he81Var.v) {
                smc0VarN.add(oln0.c);
            }
            if (he81Var.x) {
                smc0VarN.add(oln0.d);
            }
            if (!z3) {
                smc0VarN.add(oln0.f);
            }
            iterableK = k4p1.k(smc0VarN);
        } else {
            iterableK = z6x.a;
        }
        if (!z2) {
            rln0Var = rln0.b;
        } else if (z3) {
            rln0Var = he81Var.y ? rln0.c : rln0.d;
        } else {
            rln0Var = rln0.e;
        }
        nln0 nln0VarO = NativeAdsShowcaseRenderType.o();
        nln0VarO.q(n1xVar.a);
        nln0VarO.s(n1xVar.e);
        nln0VarO.r(id81Var.d);
        nln0VarO.w(he81Var.d);
        nln0VarO.A(sln0Var);
        nln0VarO.B(tln0Var);
        nln0VarO.u(this.Q0);
        nln0VarO.z(z);
        nln0VarO.v(he81Var.u);
        nln0VarO.t(id81Var.f != null);
        nln0VarO.x();
        nln0VarO.y(rln0Var);
        nln0VarO.n(iterableK);
        NativeAdsShowcaseRenderType nativeAdsShowcaseRenderTypeBuild = nln0VarO.build();
        nativeAdsShowcaseRenderTypeBuild.getClass();
        this.R0.a(nativeAdsShowcaseRenderTypeBuild);
    }

    public final faa0 f(he81 he81Var, tqw tqwVar) {
        dnc dncVar;
        String str = he81Var.z;
        if (str == null || (dncVar = this.O0) == null) {
            return null;
        }
        return c921.y(this.U0, (o8n) null, 0, new uk71(dncVar, str, tqwVar, (lnm) null, (byte) 10), 3);
    }

    public final mqw getBehavior() {
        return this.b1;
    }

    public final void onStop(iac0 iac0Var) {
        this.Z.a();
    }
}
