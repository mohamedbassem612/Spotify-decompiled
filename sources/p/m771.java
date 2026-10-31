package p;

import com.spotify.share.logging.impl.events.proto.Share;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m771 {
    public final g871 a;

    public m771(g871 g871Var) {
        this.a = g871Var;
    }

    public static void b(m771 m771Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i) {
        String str14 = (i & 16) != 0 ? null : str5;
        String str15 = (i & 128) != 0 ? null : str8;
        String str16 = (i & 256) != 0 ? null : str9;
        g871 g871Var = m771Var.a;
        tx61 tx61Var = new tx61(str, str2, str3, str4, str10, str11, str12, str6, str7, str15, str16, str14, str13, (String) null);
        ii9 ii9Var = g871Var.a;
        boolean zBooleanValue = ((Boolean) c921.D(new f871(g871Var, (lnm) null, (byte) 0))).booleanValue();
        rx61 rx61VarN = Share.n();
        rx61VarN.r(tx61Var.c());
        rx61VarN.q(tx61Var.b());
        rx61VarN.y(tx61Var.j());
        rx61VarN.n(tx61Var.a());
        rx61VarN.t(tx61Var.e());
        rx61VarN.z(tx61Var.k());
        rx61VarN.s(tx61Var.d());
        rx61VarN.w(zBooleanValue);
        if (tx61Var.m().length() > 0) {
            rx61VarN.C(tx61Var.m());
        }
        if (tx61Var.l().length() > 0) {
            rx61VarN.B(tx61Var.l());
        }
        String strN = tx61Var.n();
        if (strN != null && strN.length() != 0) {
            rx61VarN.D(tx61Var.n());
        }
        String strF = tx61Var.f();
        if (strF != null && strF.length() != 0) {
            rx61VarN.u(tx61Var.f());
        }
        String strI = tx61Var.i();
        if (strI != null && strI.length() != 0) {
            rx61VarN.A(tx61Var.i());
        }
        String strH = tx61Var.h();
        if (strH != null && strH.length() != 0) {
            rx61VarN.x(tx61Var.h());
        }
        String strG = tx61Var.g();
        if (strG != null && strG.length() != 0) {
            rx61VarN.v(tx61Var.g());
        }
        Share shareBuild = rx61VarN.build();
        t2j0 t2j0Var = ii9Var.a;
        shareBuild.getClass();
        t2j0Var.a(shareBuild);
        shareBuild.toString();
    }

    public final void a(g471 g471Var, p371 p371Var, ho71 ho71Var, String str, String str2, String str3, String str4, String str5, String str6) {
        if (u890.j(g471Var.a(), z471.d) || ihc1.y0(ho71Var.b()) || ihc1.y0(ho71Var.c())) {
            return;
        }
        b(this, p371Var.d(), g471Var.a().getValue(), yto1.o(p371Var).a(), ho71Var.b(), null, ho71Var.c(), ho71Var.a(), str, str2, str3, str4, str5, str6, 4112);
    }
}
