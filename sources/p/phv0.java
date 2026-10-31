package p;

import com.spotify.messages.ZeroFrictionErrorNonAuth;
import com.spotify.messages.ZeroFrictionGenericNonAuth;
import com.spotify.messages.ZeroFrictionImpressionNonAuth;
import com.spotify.messages.ZeroFrictionInteractionNonAuth;
import com.spotify.messages.ZeroFrictionScreenImpressionNonAuth;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class phv0 implements ohv0 {
    public final p3n1 a;
    public final x2g1 b;
    public final dte0 c;

    public phv0(p3n1 p3n1Var, x2g1 x2g1Var, dte0 dte0Var) {
        this.a = p3n1Var;
        this.b = x2g1Var;
        this.c = dte0Var;
    }

    public final void a(xap1 xap1Var) {
        xap1Var.toString();
        boolean z = xap1Var instanceof nhv0;
        p3n1 p3n1Var = this.a;
        dte0 dte0Var = this.c;
        x2g1 x2g1Var = this.b;
        if (z) {
            nhv0 nhv0Var = (nhv0) xap1Var;
            y3n1 y3n1VarN = ZeroFrictionScreenImpressionNonAuth.n();
            y3n1VarN.s(x2g1Var.a.a());
            y3n1VarN.r(x2g1Var.a.b());
            y3n1VarN.q(nhv0Var.c);
            String str = nhv0Var.d;
            if (str != null) {
                y3n1VarN.n(str);
            }
            dte0Var.getClass();
            p3n1Var.a.a(y3n1VarN.build());
            return;
        }
        if (xap1Var instanceof lhv0) {
            lhv0 lhv0Var = (lhv0) xap1Var;
            w3n1 w3n1VarN = ZeroFrictionImpressionNonAuth.n();
            w3n1VarN.s(x2g1Var.a.a());
            w3n1VarN.r(x2g1Var.a.b());
            w3n1VarN.q(lhv0Var.c);
            String str2 = lhv0Var.d;
            if (str2 != null) {
                w3n1VarN.n(str2);
            }
            dte0Var.getClass();
            p3n1Var.a.a(w3n1VarN.build());
            return;
        }
        if (xap1Var instanceof mhv0) {
            mhv0 mhv0Var = (mhv0) xap1Var;
            x3n1 x3n1VarN = ZeroFrictionInteractionNonAuth.n();
            x3n1VarN.u(x2g1Var.a.a());
            x3n1VarN.t(x2g1Var.a.b());
            x3n1VarN.s(mhv0Var.c);
            x3n1VarN.r(mhv0Var.e.c());
            String str3 = mhv0Var.f;
            if (str3 != null) {
                x3n1VarN.q(str3);
            }
            x3n1VarN.n(mhv0Var.d);
            dte0Var.getClass();
            p3n1Var.a.a(x3n1VarN.build());
            return;
        }
        if (xap1Var instanceof khv0) {
            khv0 khv0Var = (khv0) xap1Var;
            u3n1 u3n1VarO = ZeroFrictionGenericNonAuth.o();
            u3n1VarO.t(x2g1Var.a.a());
            u3n1VarO.s(x2g1Var.a.b());
            String str4 = khv0Var.c;
            if (str4 != null) {
                u3n1VarO.r(str4);
            }
            u3n1VarO.q(khv0Var.d);
            Map map = khv0Var.e;
            if (map != null) {
                u3n1VarO.n(map);
            }
            dte0Var.getClass();
            p3n1Var.a.a(u3n1VarO.build());
            return;
        }
        if (!(xap1Var instanceof jhv0)) {
            eg.o();
            return;
        }
        jhv0 jhv0Var = (jhv0) xap1Var;
        o3n1 o3n1VarN = ZeroFrictionErrorNonAuth.n();
        o3n1VarN.u(x2g1Var.a.a());
        o3n1VarN.t(x2g1Var.a.b());
        o3n1VarN.s(jhv0Var.F());
        o3n1VarN.q(jhv0Var.D());
        String strE = jhv0Var.E();
        if (strE != null) {
            o3n1VarN.r(strE);
        }
        String strC = jhv0Var.C();
        if (strC != null) {
            o3n1VarN.n(strC);
        }
        dte0Var.getClass();
        p3n1Var.a.a(o3n1VarN.build());
    }
}
