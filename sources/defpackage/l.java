package defpackage;

import kotlin.jvm.functions.Function0;
import p.a0e1;
import p.apo;
import p.b0k;
import p.c10;
import p.c9n;
import p.cbx;
import p.djc0;
import p.een;
import p.ew31;
import p.fkj0;
import p.foo1;
import p.fra;
import p.gbx;
import p.gdx;
import p.h311;
import p.h36;
import p.hhg1;
import p.hmb0;
import p.hzj;
import p.idn0;
import p.ihc1;
import p.iu30;
import p.j06;
import p.jbh;
import p.jw31;
import p.llj;
import p.max;
import p.mbh;
import p.n4k;
import p.nim0;
import p.nko1;
import p.nw31;
import p.pw31;
import p.qim0;
import p.qx8;
import p.sgc1;
import p.tgp1;
import p.uwo1;
import p.uwr;
import p.uyn1;
import p.vu30;
import p.vy71;
import p.x0d;
import p.x340;
import p.xos0;
import p.y50;
import p.y580;
import p.yla;
import p.zr7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class l {
    public static final void a(String str, c10 c10Var, c9n c9nVar, vy71 vy71Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        String strB;
        byte b;
        String strC;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1573243832);
        j06 j06Var = x340Var.a;
        int i4 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(c10Var) ? 32 : 16) | (x340Var.i(c9nVar) ? 256 : 128) | (x340Var.i(vy71Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192);
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = i4 | 196608;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.i(qim0Var2) ? 131072 : 65536);
        }
        int i6 = i3;
        if (x340Var.Y(i6 & 1, (i6 & 74899) != 74898)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0Var4 = i5 != 0 ? nim0Var : qim0Var2;
            fra fraVar = een.N0;
            qim0 qim0VarY = uyn1.y(qim0Var4, 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarB = nw31.b(pw31.a, nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String str2 = (c10Var == null || (strC = c10Var.c()) == null) ? "" : strC;
            uwr uwrVar = cbx.a;
            qim0 qim0Var5 = qim0Var4;
            uwo1.e(str2, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            if (c10Var == null || (strB = c10Var.b()) == null) {
                strB = "";
            }
            uwo1.e(strB, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
            gdx gdxVarS = yla.s(x340Var);
            qim0 qim0VarH = sgc1.H(1, nim0Var);
            boolean zI = x340Var.i(c9nVar) | x340Var.i(vy71Var) | ((i6 & 57344) == 16384);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                b = 0;
                objT = new i(c9nVar, vy71Var, function0, (byte) 0);
                x340Var.s0(objT);
            } else {
                b = 0;
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.g(new gbx(new y50(str), function1), qim0VarH, (max) null, gdxVarS, (idn0) null, (vu30) null, (vu30) null, apo.r(1750471576, new j(str, b), x340Var), x340Var, 12582912, 116);
                x340Var.r(true);
                qim0Var3 = qim0Var5;
            }
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k(str, c10Var, c9nVar, vy71Var, function0, qim0Var3, i, i2);
        }
    }
}
