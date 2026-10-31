package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class iu90 {
    public static final ceo a = new ceo(0.34f, 1.56f, 0.64f, 1.0f);

    public static final void a(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(872065092);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131956920);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j160(function0, (byte) 26);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(strO0), function1), ldx.c, (qim0) null, (max) null, yla.r(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, rti.a, x340Var, 0, 6, 988);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vgz(function0, i, (byte) 25);
        }
    }

    public static final void b(int i, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i2, int i3) {
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1250684781);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.g((Object) null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            if (i5 != 0) {
                qim0Var = nim0.a;
            }
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c97.b(0.0f);
                x340Var.s0(objT);
            }
            o95 o95Var = (o95) objT;
            float fX0 = ((wat) x340Var.k(t4k.h)).X0(18.0f);
            boolean zI = ((i4 & 14) == 4) | ((i4 & 896) == 256) | x340Var.i(o95Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new xe2(o95Var, i, (lnm) null);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            boolean zI2 = x340Var.i(o95Var) | x340Var.d(fX0);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new fu90(o95Var, fX0);
                x340Var.s0(objT3);
            }
            qim0 qim0VarC = i541.C(qim0Var, (iu30) objT3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l((i4 >> 9) & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e13(i, qim0Var2, j2iVar, i2, i3);
        }
    }

    public static final void c(c380 c380Var, x880 x880Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1357949101);
        int i2 = i | (x340Var.i(x880Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            hsw0 hsw0Var = hsw0.a;
            d(c380Var, x880Var, iu30Var, qim0Var, null, x340Var, (i2 & 1022) | ((i2 << 3) & 57344));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60((byte) 13, i, c380Var, x880Var, iu30Var, qim0Var);
        }
    }

    public static final void d(c380 c380Var, x880 x880Var, iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, b0k b0kVar, int i) {
        iu30 iu30Var3;
        x340 x340Var;
        iu30 iu30Var4;
        Object af0Var;
        dw91 dw91Var;
        List list;
        vyz0 vyz0Var;
        x880 x880Var2;
        byte b;
        hsw0 hsw0Var = hsw0.a;
        Object obj = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1129697719);
        j06 j06Var = x340Var2.a;
        int i2 = (i & 6) == 0 ? (x340Var2.g(c380Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(x880Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var2.g(hsw0Var) : x340Var2.i(hsw0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 16384 : 8192;
        }
        int i3 = i2 | 1769472;
        if (x340Var2.Y(i3 & 1, (599187 & i3) != 599186)) {
            Object objT = x340Var2.T();
            if (objT == obj) {
                objT = mr90.e;
                x340Var2.s0(objT);
            }
            iu30 iu30Var5 = (iu30) objT;
            ss50 ss50Var = (ss50) x340Var2.k(t4k.l);
            boolean z = (i3 & 7168) == 2048 || ((i3 & 4096) != 0 && x340Var2.g(hsw0Var));
            Object objT2 = x340Var2.T();
            if (z || objT2 == obj) {
                objT2 = new vyz0();
                x340Var2.s0(objT2);
            }
            vyz0 vyz0Var2 = (vyz0) objT2;
            Object objT3 = x340Var2.T();
            if (objT3 == obj) {
                objT3 = new dw91();
                x340Var2.s0(objT3);
            }
            dw91 dw91Var2 = (dw91) objT3;
            Object objT4 = x340Var2.T();
            if (objT4 == obj) {
                objT4 = kaa0.h(0L, x340Var2);
            }
            ven0 ven0Var = (ven0) objT4;
            Object objT5 = x340Var2.T();
            if (objT5 == obj) {
                objT5 = new bw91();
                x340Var2.s0(objT5);
            }
            List list2 = (bw91) objT5;
            List listD1 = o7h.d1(c380Var, 4);
            boolean zI = ((i3 & 458752) == 131072) | x340Var2.i(x880Var) | x340Var2.i(vyz0Var2) | x340Var2.i(ss50Var) | x340Var2.i(list2) | ((3670016 & i3) == 1048576);
            Object objT6 = x340Var2.T();
            if (zI || objT6 == obj) {
                dw91Var = dw91Var2;
                list = list2;
                vyz0Var = vyz0Var2;
                af0Var = new af0((byte) 12, x880Var, vyz0Var, ss50Var, list, iu30Var5, (lnm) null);
                x880Var2 = x880Var;
                x340Var2.s0(af0Var);
            } else {
                list = list2;
                vyz0Var = vyz0Var2;
                x880Var2 = x880Var;
                dw91Var = dw91Var2;
                af0Var = objT6;
            }
            qxd0.s(x880Var2, vyz0Var, (vu30) af0Var, x340Var2);
            boolean zI2 = x340Var2.i(vyz0Var);
            Object objT7 = x340Var2.T();
            if (zI2 || objT7 == obj) {
                objT7 = new ux70(vyz0Var, (byte) 29);
                x340Var2.s0(objT7);
            }
            qxd0.i(vyz0Var, (iu30) objT7, x340Var2);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            boolean zI3 = x340Var2.i(ven0Var);
            Object objT8 = x340Var2.T();
            if (zI3 || objT8 == obj) {
                objT8 = new i030(ven0Var, (byte) 26);
                x340Var2.s0(objT8);
            }
            qim0 qim0VarX = ern1.x(qim0VarF, (iu30) objT8);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            vyz0 vyz0Var3 = vyz0Var;
            List list3 = list;
            qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, qim0VarF2);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarZ);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            x340Var2.i0(-897072359);
            int i4 = 0;
            for (Object obj2 : listD1) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                String str = (String) obj2;
                boolean zI4 = x340Var2.i(dw91Var) | x340Var2.e(i4);
                Object objT9 = x340Var2.T();
                if (zI4 || objT9 == obj) {
                    objT9 = new gu90(dw91Var, i4, (byte) 0);
                    x340Var2.s0(objT9);
                }
                dw91 dw91Var3 = dw91Var;
                b(i4, ern1.x(qim0Var2, (iu30) objT9), apo.r(-135619965, new kyq(i4, str, iu30Var, ven0Var, vyz0Var3, dw91Var3), x340Var2), x340Var2, ((i3 >> 9) & 896) | 3072, 0);
                i4 = i5;
                qim0Var2 = qim0Var2;
                dw91Var = dw91Var3;
            }
            iu30Var3 = iu30Var;
            qim0 qim0Var3 = qim0Var2;
            x340Var = x340Var2;
            x340Var.r(false);
            int i6 = ((i3 >> 9) & 896) | 3072;
            b(listD1.size(), null, apo.r(1762277021, new d720(iu30Var3, (byte) 13), x340Var), x340Var, i6, 2);
            b(listD1.size() + 1, null, apo.r(429205524, new d720(iu30Var3, (byte) 14), x340Var), x340Var, i6, 2);
            x340Var.r(true);
            boolean zI5 = x340Var.i(list3);
            Object objT10 = x340Var.T();
            if (zI5 || objT10 == obj) {
                b = 0;
                objT10 = new hu90(list3, b);
                x340Var.s0(objT10);
            } else {
                b = 0;
            }
            crm0.c(list3, (iu30) objT10, h2c.a.b(qim0Var3), x340Var, b);
            x340Var.r(true);
            iu30Var4 = iu30Var5;
        } else {
            iu30Var3 = iu30Var;
            x340Var = x340Var2;
            x340Var.b0();
            iu30Var4 = iu30Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq(c380Var, x880Var, iu30Var3, qim0Var, iu30Var4, i);
        }
    }

    public static final void e(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(732425879);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131956921);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j160(function0, (byte) 27);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(strO0), function1), ldx.c, (qim0) null, (max) null, yla.r(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, rti.b, x340Var, 0, 6, 988);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vgz(function0, i, (byte) 26);
        }
    }

    public static final void f(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2037460451);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            tob1 tob1VarB = z95.b(((Boolean) k1u.m(idn0Var, x340Var, 0).getValue()).booleanValue() ? 0.9f : 1.0f, irn1.l0(0.375f, 400.0f, (Object) null, 4), "reaction button press", (iu30) null, x340Var, 3072, 20);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            mta mtaVar2 = cbx.b(x340Var).d;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarU = u291.u(qim0Var3, 48.0f, 48.0f, 0.0f, 0.0f, 12);
            boolean zI = x340Var.i(tob1VarB);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new pak(tob1VarB, (byte) 18);
                x340Var.s0(objT2);
            }
            qim0 qim0VarV = bin.v(i541.C(qim0VarU, (iu30) objT2), idn0Var, (ga80) x340Var.k(da80.a), false, cwl1.n0(2131956922, new Object[]{str}, x340Var), (pm31) null, function0, 20);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(str, (qim0) null, cbx.d(x340Var).d, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2042);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var2, i, (byte) 12);
        }
    }
}
