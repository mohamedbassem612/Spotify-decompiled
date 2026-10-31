package p;

import com.spotify.messages.ConfigurationApplied;
import com.spotify.messages.ConfigurationAppliedNonAuth;
import com.spotify.messages.ConfigurationFetched;
import com.spotify.messages.ConfigurationFetchedNonAuth;
import com.spotify.messages.DefaultConfigurationApplied;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aq80 implements za00 {
    public final /* synthetic */ byte a;
    public final lmw b;
    public final pz11 c;
    public final xav0 d;

    public /* synthetic */ aq80(lmw lmwVar, pz11 pz11Var, xav0 xav0Var, byte b) {
        this.a = b;
        this.b = lmwVar;
        this.c = pz11Var;
        this.d = xav0Var;
    }

    public final void a(String str, int i, long j, int i2, String str2, Long l, String str3) {
        long jLongValue;
        byte b = this.a;
        lmw lmwVar = this.b;
        switch (b) {
            case 0:
                jLongValue = l.longValue() != 0 ? l.longValue() : -1L;
                ktk ktkVarD = d(j, str);
                ktkVarD.q(str2);
                ktkVarD.y(i2);
                ktkVarD.E(i);
                ktkVarD.w(jLongValue);
                if (str3 != null) {
                    ktkVarD.D(str3);
                }
                lmwVar.w("ConfigurationFetched", ktkVarD.build().toByteArray());
                break;
            default:
                jLongValue = l.longValue() != 0 ? l.longValue() : -1L;
                mtk mtkVarE = e(j, str);
                mtkVarE.q(str2);
                mtkVarE.y(i2);
                mtkVarE.E(i);
                mtkVarE.w(jLongValue);
                if (str3 != null) {
                    mtkVarE.D(str3);
                }
                lmwVar.w("ConfigurationFetchedNonAuth", mtkVarE.build().toByteArray());
                break;
        }
    }

    public final void b(tvz0 tvz0Var) {
        byte b = this.a;
        lmw lmwVar = this.b;
        pz11 pz11Var = this.c;
        xav0 xav0Var = this.d;
        switch (b) {
            case 0:
                String str = tvz0Var.d;
                if (!tvz0Var.a) {
                    ctk ctkVarP = ConfigurationApplied.p();
                    ctkVarP.q(xav0Var.b());
                    pz11Var.getClass();
                    ctkVarP.u();
                    ctkVarP.v();
                    ctkVarP.t();
                    ctkVarP.n(tvz0Var.b);
                    ctkVarP.s(tvz0Var.c);
                    ctkVarP.r(str);
                    lmwVar.w("ConfigurationApplied", ctkVarP.build().toByteArray());
                } else {
                    dnr dnrVarO = DefaultConfigurationApplied.o();
                    dnrVarO.n(xav0Var.b());
                    pz11Var.getClass();
                    dnrVarO.s();
                    dnrVarO.t();
                    dnrVarO.r();
                    dnrVarO.q(str);
                    lmwVar.w("DefaultConfigurationApplied", ((DefaultConfigurationApplied) dnrVarO.build()).toByteArray());
                }
                break;
            default:
                if (!tvz0Var.a) {
                    etk etkVarP = ConfigurationAppliedNonAuth.p();
                    etkVarP.q(xav0Var.b());
                    pz11Var.getClass();
                    etkVarP.u();
                    etkVarP.v();
                    etkVarP.t();
                    etkVarP.n(tvz0Var.b);
                    etkVarP.s(tvz0Var.c);
                    etkVarP.r(tvz0Var.d);
                    lmwVar.w("ConfigurationAppliedNonAuth", etkVarP.build().toByteArray());
                }
                break;
        }
    }

    public final void c(String str, long j, ya00 ya00Var, int i) {
        byte b = this.a;
        lmw lmwVar = this.b;
        switch (b) {
            case 0:
                ktk ktkVarD = d(j, str);
                ktkVarD.E(i);
                int i2 = ya00Var.a;
                if (i2 != 0) {
                    ktkVarD.t(zjy.i(i2));
                }
                String str2 = ya00Var.b;
                if (str2 != null) {
                    ktkVarD.r(str2);
                }
                int i3 = ya00Var.c;
                if (i3 != 0) {
                    ktkVarD.u(zjy.i(i3));
                }
                String str3 = ya00Var.d;
                if (str3 != null) {
                    ktkVarD.s(str3);
                }
                lmwVar.w("ConfigurationFetched", ktkVarD.build().toByteArray());
                break;
            default:
                mtk mtkVarE = e(j, str);
                mtkVarE.E(i);
                int i4 = ya00Var.a;
                if (i4 != 0) {
                    mtkVarE.t(zjy.i(i4));
                }
                String str4 = ya00Var.b;
                if (str4 != null) {
                    mtkVarE.r(str4);
                }
                int i5 = ya00Var.c;
                if (i5 != 0) {
                    mtkVarE.u(zjy.i(i5));
                }
                String str5 = ya00Var.d;
                if (str5 != null) {
                    mtkVarE.s(str5);
                }
                lmwVar.w("ConfigurationFetchedNonAuth", mtkVarE.build().toByteArray());
                break;
        }
    }

    public ktk d(long j, String str) {
        ktk ktkVarO = ConfigurationFetched.o();
        ktkVarO.v(str);
        ktkVarO.n(this.d.b());
        ktkVarO.x(j);
        this.c.getClass();
        ktkVarO.z();
        ktkVarO.B();
        ktkVarO.C();
        ktkVarO.A();
        ktkVarO.D("N/A");
        return ktkVarO;
    }

    public mtk e(long j, String str) {
        mtk mtkVarO = ConfigurationFetchedNonAuth.o();
        mtkVarO.v(str);
        mtkVarO.n(this.d.b());
        mtkVarO.x(j);
        this.c.getClass();
        mtkVarO.z("ANDROID");
        mtkVarO.B();
        mtkVarO.C();
        mtkVarO.A();
        mtkVarO.D("N/A");
        return mtkVarO;
    }
}
