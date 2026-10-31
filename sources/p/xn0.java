package p;

import com.spotify.adsinternal.adscommon.events.proto.AdError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xn0 {
    public final t2j0 a;

    public xn0(t2j0 t2j0Var) {
        this.a = t2j0Var;
    }

    public final void a(z1p1 z1p1Var) {
        wn0 wn0VarN = AdError.n();
        wn0VarN.q(z1p1Var.l());
        String strP = z1p1Var.p();
        if (strP != null) {
            wn0VarN.v(strP);
        }
        wn0VarN.r(z1p1Var.m());
        String strK = z1p1Var.k();
        if (strK != null) {
            wn0VarN.n(strK);
        }
        String strN = z1p1Var.n();
        if (strN != null) {
            wn0VarN.s(strN);
        }
        String strR = z1p1Var.r();
        if (strR != null) {
            wn0VarN.x(strR);
        }
        String strQ = z1p1Var.q();
        if (strQ != null) {
            wn0VarN.w(strQ);
        }
        String strO = z1p1Var.o();
        if (strO != null) {
            wn0VarN.t(strO);
        }
        String strS = z1p1Var.s();
        if (strS != null) {
            wn0VarN.y(strS);
        }
        AdError adErrorBuild = wn0VarN.build();
        adErrorBuild.getClass();
        this.a.a(adErrorBuild);
    }
}
