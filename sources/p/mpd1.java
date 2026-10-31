package p;

import android.graphics.Color;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class mpd1 {
    public static final mmr0 a = new mmr0(322, 40);
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    public static final void a(lpd1 lpd1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        String str = lpd1Var.c;
        String str2 = lpd1Var.a;
        String str3 = lpd1Var.b;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-511560159);
        int i2 = (x340Var2.i(lpd1Var) ? 4 : 2) | i | 48;
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = x340Var2.g(str3);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                try {
                    objT = !ihc1.y0(str3) ? Integer.valueOf(Color.parseColor(str3)) : null;
                } catch (IllegalArgumentException e) {
                    Logger.e(e, "Invalid Takeover Header color: %s", new Object[]{str3});
                    objT = null;
                }
                x340Var2.s0(objT);
            }
            Integer num = (Integer) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 4.0f, 0.0f, 6.0f, 5);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            Object[] objArr = {str2};
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = imd1.e1;
                x340Var2.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = pod1.f;
                x340Var2.s0(objT3);
            }
            df41 df41VarT = kyo1.t((iu30) objT3, vu30Var);
            boolean zI = x340Var2.i(lpd1Var);
            Object objT4 = x340Var2.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new fjc1(lpd1Var, (byte) 12);
                x340Var2.s0(objT4);
            }
            ven0 ven0VarV = k5p1.v(objArr, df41VarT, (Function0) objT4, x340Var2, 0);
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            Uri uri = Uri.parse(str2);
            boolean zI2 = x340Var2.i(ven0VarV) | x340Var2.i(lpd1Var);
            Object objT5 = x340Var2.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new cmd1(ven0VarV, lpd1Var, (byte) 4);
                x340Var2.s0(objT5);
            }
            qim0Var2 = qim0Var3;
            eso1.h(oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) objT5, (iu30) null, (iu30) null, 0L, x340Var2, 0, 0, 126974), !ihc1.y0(str) ? new jsl(str) : isl.a, qim0VarF, (p3v) null, (zvx) null, new ecx(((Number) ((mmr0) ven0VarV.getValue()).a).intValue(), ((Number) ((mmr0) ven0VarV.getValue()).b).intValue()), mif1.S0, (tl3) null, num != null ? new f2b(z4p1.e(num.intValue()), 5) : null, x340Var2, 3072, 144);
            qim0 qim0VarA = uyn1.A(u291.f(qim0Var2, 1.0f), 16.0f, 12.0f, 16.0f, 0.0f);
            String str4 = lpd1Var.d;
            uwr uwrVar = cbx.a;
            uwo1.e(str4, qim0VarA, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), (iu30) null, 2, false, new cjc0(3), 0, (qx8) null, x340Var2, 0, 0, 1696);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sdb1(lpd1Var, qim0Var2, i, (byte) 17);
        }
    }
}
