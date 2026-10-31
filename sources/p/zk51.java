package p;

import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zk51 {
    public static final Pattern a = Pattern.compile(" ");

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-395914614);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(qim0Var) ? 2048 : 1024);
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var2).b.a;
            String strReplaceAll = a.matcher(cwl1.o0(x340Var2, 2131951659)).replaceAll(" ");
            String strM = l1d.m("… ", strReplaceAll);
            int i3 = i2 & 14;
            boolean zG = (i3 == 4) | x340Var2.g(strReplaceAll);
            Object objT = x340Var2.T();
            rih1 rih1Var = null;
            if (zG || objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = (i3 == 4) | x340Var2.i(ven0Var) | x340Var2.g(strM) | x340Var2.f(j) | x340Var2.g(strReplaceAll);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                yk51 yk51Var = new yk51(str, strM, ven0Var, j, strReplaceAll);
                x340Var2.s0(yk51Var);
                objT2 = yk51Var;
            }
            iu30 iu30Var = (iu30) objT2;
            qim0 qim0VarX = bin.x(u291.f(qim0Var, 1.0f), false, null, null, null, function0, 15);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            af5 af5Var = (af5) ven0Var.getValue();
            if (af5Var == null) {
                x340Var2.i0(-819802167);
                x340Var2.r(false);
                x340Var = x340Var2;
                z = false;
            } else {
                x340Var2.i0(-819802166);
                lee1 lee1Var = cbx.d(x340Var2).j;
                z = false;
                uwo1.d(af5Var, cbx.a(x340Var2).b.b, null, lee1Var, null, null, 0, false, new cjc0(3), 0, null, null, x340Var2, 0, 0, 3828);
                x340Var = x340Var2;
                x340Var.r(false);
                rih1Var = rih1.a;
            }
            if (rih1Var == null) {
                x340Var.i0(-819580609);
                x340 x340Var3 = x340Var;
                uwo1.e(str, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, iu30Var, 2, false, new cjc0(3), 0, null, x340Var3, i3, 0, 1682);
                x340Var = x340Var3;
                x340Var.r(z);
            } else {
                x340Var.i0(-857729424);
                x340Var.r(z);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var, i, (byte) 20);
        }
    }
}
