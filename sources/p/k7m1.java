package p;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class k7m1 {
    public static final List a = p7h.M(new String[]{"chipWidth", "revealProgress"});

    public static final void a(wj31 wj31Var, long j, boolean z, boolean z2, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        Object wn2Var;
        jfe jfeVar;
        boolean z3 = z;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1831285145);
        int i3 = i & 6;
        h2c h2cVar = h2c.a;
        if (i3 == 0) {
            i2 = (x340Var.g(h2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(wj31Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            Object objT = x340Var.T();
            if (objT == obj) {
                objT = mno1.a(-2, 0, 6);
                x340Var.s0(objT);
            }
            jfe jfeVar2 = (jfe) objT;
            boolean zI = x340Var.i(jfeVar2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == obj) {
                objT2 = new zw11(jfeVar2, (byte) 16);
                x340Var.s0(objT2);
            }
            qxd0.i(rih1.a, (iu30) objT2, x340Var);
            boolean zG = x340Var.g(wj31Var);
            Object objT3 = x340Var.T();
            if (zG || objT3 == obj) {
                objT3 = Boolean.valueOf(z3);
                x340Var.s0(objT3);
            }
            boolean zBooleanValue = ((Boolean) objT3).booleanValue();
            Object[] objArr = {wj31Var, jfeVar2, watVar, new yr80(j), Boolean.valueOf(z3)};
            boolean zG2 = ((i2 & 896) == 256) | x340Var.g(watVar) | x340Var.i(jfeVar2) | ((i2 & 7168) == 2048);
            Object objT4 = x340Var.T();
            if (zG2 || objT4 == obj) {
                wn2Var = new wn2(watVar, jfeVar2, z3, j, (lnm) null);
                jfeVar = jfeVar2;
                z3 = z3;
                x340Var.s0(wn2Var);
            } else {
                wn2Var = objT4;
                jfeVar = jfeVar2;
            }
            qxd0.u(objArr, (vu30) wn2Var, x340Var);
            qim0 qim0VarB = h2cVar.b(nim0.a);
            Object objT5 = x340Var.T();
            if (objT5 == obj) {
                objT5 = m5m1.T0;
                x340Var.s0(objT5);
            }
            qim0 qim0VarB2 = s161.b(qim0VarB, false, (iu30) objT5);
            boolean z4 = !z2;
            List listM = p7h.M(new nj31[]{new nj31("skipIntro", zBooleanValue), new nj31("isActive", z3)});
            int i4 = i2 & 458752;
            boolean z5 = i4 == 131072;
            Object objT6 = x340Var.T();
            if (z5 || objT6 == obj) {
                objT6 = new wel1(iu30Var, (byte) 11);
                x340Var.s0(objT6);
            }
            Function0 function0 = (Function0) objT6;
            boolean z6 = i4 == 131072;
            Object objT7 = x340Var.T();
            if (z6 || objT7 == obj) {
                objT7 = new otj1(iu30Var, (byte) 7);
                x340Var.s0(objT7);
            }
            ((zj31) wj31Var).b(new jj31(false, 0, qim0VarB2, 3, jfeVar, listM, (Map) null, false, z4, function0, (iu30) objT7, 448), x340Var, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j7m1(wj31Var, j, z3, z2, iu30Var, i);
        }
    }

    public static final void b(un60 un60Var, gbx gbxVar, wj31 wj31Var, boolean z, boolean z2, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-212278613);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(un60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(gbxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(wj31Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z2) ? 16384 : 8192;
        }
        int i3 = 196608 & i;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.g(nim0Var) ? 131072 : 65536;
        }
        int i4 = i2;
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            boolean zG = x340Var.g(wj31Var);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = p3d1.n(0L, x340Var);
            }
            ven0 ven0Var2 = (ven0) objT2;
            nsb0 nsb0Var = (nsb0) x340Var.k(i2t0.a);
            Boolean bool = (Boolean) ven0Var.getValue();
            bool.getClass();
            boolean zG2 = x340Var.g(ven0Var) | x340Var.g(nsb0Var);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new f2m1(nsb0Var, ven0Var, (byte) 7);
                x340Var.s0(objT3);
            }
            qxd0.h(nsb0Var, bool, (iu30) objT3, x340Var);
            qim0 qim0VarU = u291.u(nim0Var, 40.0f, 0.0f, 0.0f, 0.0f, 14);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = new e7m1(ven0Var2, (byte) 2);
                x340Var.s0(objT4);
            }
            qim0 qim0VarU2 = lrn1.u(qim0VarU, (iu30) objT4);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = m5m1.U0;
                x340Var.s0(objT5);
            }
            qim0 qim0VarB = s161.b(qim0VarU2, true, (iu30) objT5);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            if (wj31Var == null || yr80.b(((yr80) ven0Var2.getValue()).a, 0L)) {
                x340Var.i0(607579933);
                x340Var.r(false);
            } else {
                x340Var.i0(607338722);
                long j = ((yr80) ven0Var2.getValue()).a;
                boolean zG3 = x340Var.g(ven0Var);
                Object objT6 = x340Var.T();
                if (zG3 || objT6 == m4cVar) {
                    objT6 = new e7m1(ven0Var, (byte) 3);
                    x340Var.s0(objT6);
                }
                a(wj31Var, j, z, z2, (iu30) objT6, x340Var, ((i4 >> 3) & 112) | 6 | (i4 & 7168) | (57344 & i4));
                x340Var.r(false);
            }
            so60.d(gbxVar, ((Boolean) ven0Var.getValue()).booleanValue() ? so60.g : so60.e(un60Var), yoo1.z(x340Var), z, (qim0) null, ((Boolean) ven0Var.getValue()).booleanValue() ? so60.f : so60.e, (idn0) null, false, (vzq0) null, apo.r(1169242509, new no60(un60Var, (byte) 1), x340Var), x340Var, ((i4 >> 3) & 14) | 805306368 | (i4 & 7168), 464);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bmg(un60Var, gbxVar, wj31Var, z, z2, i);
        }
    }
}
