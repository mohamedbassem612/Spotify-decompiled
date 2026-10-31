package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.accountswitching.v1.Account;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class iy71 {
    public static final Uri a = Uri.parse("https://misc.spotifycdn.com/widgets/education_message_widget_preview.gif");
    public static final Uri b = Uri.parse("https://misc.spotifycdn.com/widgets/education_message_widget_preview.webp");

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-418499448);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48 | (x340Var.h(z) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            jmr0 jmr0VarN = i3o1.n(2131231320, x340Var, 0);
            ni7 ni7VarA = oi7.a(z ? a : b, (gw70) x340Var.k(oi7.a), (xb10) null, (yqi1) null, jmr0VarN, jmr0VarN, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 2359296, 0, 130972);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.f(qim0Var3, 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            op71.g(x340Var, u291.h(qim0Var3, 16.0f));
            cwl1.f(ni7VarA, (String) null, uyn1.B(u291.v(qim0Var3, 242.0f), 0.0f, 11.0f, 0.0f, 35.0f, 5), (tl3) null, mif1.S0, 0.0f, (ColorFilter) null, x340Var, 48, Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER);
            String strG = ydh.g(16.0f, 2131955412, x340Var, x340Var, qim0Var3);
            uwr uwrVar = cbx.a;
            uwo1.e(strG, (qim0) null, cbx.d(x340Var).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2026);
            qim0Var2 = qim0Var3;
            uwo1.e(cwl1.o0(x340Var, 2131955411), uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            op71.g(x340Var, u291.h(qim0Var2, 24.0f));
            idx idxVar = new idx(4);
            gdx gdxVarR = yla.r(x340Var);
            boolean z2 = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new pt61(function0, (byte) 11);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), idxVar, (qim0) null, (max) null, gdxVarR, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, jhj.a, x340Var, 0, 48, 2012);
            x340Var = x340Var;
            x0d.s(qim0Var2, 48.0f, x340Var, true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(function0, qim0Var2, z, i, (byte) 19);
        }
    }
}
