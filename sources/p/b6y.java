package p;

import com.spotify.gpb.trackingimpl.events.proto.CPGpbCheckoutCompleted;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b6y {
    public final t2j0 a;

    public static String b(String str) {
        return l1d.m("checkoutSessionId:", str);
    }

    public void a(String str, String str2, int i, String str3, nf21 nf21Var) {
        lnc lncVarN = CPGpbCheckoutCompleted.n();
        lncVarN.n(str2);
        lncVarN.q(b(str));
        lncVarN.s(nf21Var != null ? nf21Var.a() : "NONE");
        lncVarN.t(ywx0.c(i));
        if (str3 != null) {
            lncVarN.r(str3);
        }
        this.a.a(lncVarN.build());
    }

    public b6y(t2j0 t2j0Var, khc khcVar) {
        this.a = t2j0Var;
    }
}
