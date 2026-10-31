package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class o6p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(yg1 yg1Var, af10 af10Var, qim0 qim0Var, iu30 iu30Var, vnd1 vnd1Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2023522806);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(yg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(af10Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = yg1Var.i;
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = yv91.a(new ih1(xtb0VarA, (byte) 0));
                x340Var.s0(objT);
            }
            irn1.u(null, apo.r(-4588489, new dh1((tob1) objT, yg1Var, (byte) 1), x340Var), null, null, apo.r(1737206577, new hh1(xtb0VarA, yg1Var, z, iu30Var, af10Var), x340Var), x340Var, 24624, 13);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0(yg1Var, af10Var, qim0Var2, iu30Var, vnd1Var, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00df  */
    /* JADX WARN: Code duplicated, block: B:53:0x0191  */
    /* JADX WARN: Code duplicated, block: B:55:0x019d  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void b(String str, af5 af5Var, qim0 qim0Var, xu30 xu30Var, b0k b0kVar, int i, int i2) {
        String str2;
        int i3;
        xu30 xu30Var2;
        boolean z;
        x340 x340Var;
        xu30 xu30Var3;
        h311 h311VarV;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        pbh pbhVar;
        xu30 xu30Var4;
        int i4;
        boolean z2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1305492345);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (x340Var2.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.i(af5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                xu30Var2 = xu30Var;
                i3 |= x340Var2.i(xu30Var2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i3 & 1, z)) {
                if (i5 != 0) {
                    xu30Var2 = null;
                }
                uwr uwrVar = cbx.a;
                qim0 qim0VarF = u291.f(dug.f(qim0Var, cbx.a(x340Var2).a.c, d4o1.a), 1.0f);
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarA = uyn1.A(qim0VarF, cbx.b(x340Var2).b.b, 16.0f, cbx.b(x340Var2).b.b, cbx.b(x340Var2).b.b);
                mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarA);
                hzj.A.getClass();
                if (x340Var2.a != null) {
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
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                era eraVar = een.Q0;
                pbhVar = pbh.a;
                xu30Var4 = xu30Var2;
                i4 = i3;
                uwo1.e(str2, pbhVar.c(eraVar, qim0VarF2), cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var2, i3 & 14, 0, 2016);
                qim0 qim0VarC = pbhVar.c(eraVar, u291.f(nim0Var, 1.0f));
                cvx cvxVar2 = cbx.b(x340Var2).b;
                uwo1.d(af5Var, cbx.a(x340Var2).b.b, uyn1.B(qim0VarC, 0.0f, 4.0f, 0.0f, 0.0f, 13), cbx.d(x340Var2).j, new a0e1(3), null, 0, false, null, 0, null, null, x340Var2, (i4 >> 3) & 14, 0, 4064);
                x340Var = x340Var2;
                if (xu30Var4 == null) {
                    x340Var.i0(981316600);
                    z2 = false;
                } else {
                    z2 = false;
                    x340Var.i0(-1215270615);
                    xu30Var4.invoke(pbhVar, x340Var, Integer.valueOf(6 | ((i4 >> 6) & 112)));
                }
                x340Var.r(z2);
                x340Var.r(true);
                xu30Var3 = xu30Var4;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                xu30Var3 = xu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nj2((Object) str, (Object) af5Var, qim0Var, (Object) xu30Var3, i, i2, (byte) 3);
            }
        }
        i3 |= 3072;
        xu30Var2 = xu30Var;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var2.Y(i3 & 1, z)) {
            if (i5 != 0) {
                xu30Var2 = null;
            }
            uwr uwrVar2 = cbx.a;
            qim0 qim0VarF3 = u291.f(dug.f(qim0Var, cbx.a(x340Var2).a.c, d4o1.a), 1.0f);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0VarA2 = uyn1.A(qim0VarF3, cbx.b(x340Var2).b.b, 16.0f, cbx.b(x340Var2).b.b, cbx.b(x340Var2).b.b);
            mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarA2);
            hzj.A.getClass();
            if (x340Var2.a != null) {
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
            nim0 nim0Var2 = nim0.a;
            qim0 qim0VarF4 = u291.f(nim0Var2, 1.0f);
            era eraVar2 = een.Q0;
            pbhVar = pbh.a;
            xu30Var4 = xu30Var2;
            i4 = i3;
            uwo1.e(str2, pbhVar.c(eraVar2, qim0VarF4), cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var2, i3 & 14, 0, 2016);
            qim0 qim0VarC2 = pbhVar.c(eraVar2, u291.f(nim0Var2, 1.0f));
            cvx cvxVar4 = cbx.b(x340Var2).b;
            uwo1.d(af5Var, cbx.a(x340Var2).b.b, uyn1.B(qim0VarC2, 0.0f, 4.0f, 0.0f, 0.0f, 13), cbx.d(x340Var2).j, new a0e1(3), null, 0, false, null, 0, null, null, x340Var2, (i4 >> 3) & 14, 0, 4064);
            x340Var = x340Var2;
            if (xu30Var4 == null) {
                x340Var.i0(981316600);
                z2 = false;
            } else {
                z2 = false;
                x340Var.i0(-1215270615);
                xu30Var4.invoke(pbhVar, x340Var, Integer.valueOf(6 | ((i4 >> 6) & 112)));
            }
            x340Var.r(z2);
            x340Var.r(true);
            xu30Var3 = xu30Var4;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            xu30Var3 = xu30Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2((Object) str, (Object) af5Var, qim0Var, (Object) xu30Var3, i, i2, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x0101  */
    /* JADX WARN: Code duplicated, block: B:47:0x010c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0131  */
    /* JADX WARN: Code duplicated, block: B:51:0x0135  */
    /* JADX WARN: Code duplicated, block: B:54:0x0140  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void c(int i, int i2, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        int i3;
        boolean z2;
        boolean z3;
        qim0 qim0Var3;
        boolean z4;
        h311 h311VarV;
        qim0 qim0Var4;
        qim0 qim0Var5;
        boolean z5;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z6;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-529825520);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i | (x340Var.i(qim0Var2) ? 4 : 2);
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= x340Var.h(z2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                qim0Var4 = nim0.a;
                if (i4 != 0) {
                    qim0Var5 = qim0Var4;
                } else {
                    qim0Var5 = qim0Var2;
                }
                if (i5 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                qim0 qim0VarF = u291.f(qim0Var5, 1.0f);
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                int i6 = i3 & 112;
                j(i6, 4, x340Var, null, z5);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var4, 8.0f));
                j(i6, 4, x340Var, null, z5);
                cvx cvxVar2 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var4, 8.0f));
                j(i6, 0, x340Var, uyn1.B(qim0Var4, 0.0f, 0.0f, 147.0f, 0.0f, 11), z5);
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0 qim0VarO = ab80.o(qim0Var4, 16.0f, x340Var, qim0Var4, 1.0f);
                cvx cvxVar4 = cbx.b(x340Var).b;
                d36 d36Var = new d36(16.0f, true, new um5(false));
                z6 = i6 == 32;
                objT = x340Var.T();
                if (z6 || objT == fkj0.X) {
                    objT = new mj10((byte) 11, z5);
                    x340Var.s0(objT);
                }
                ujo1.e(qim0VarO, null, null, d36Var, null, null, false, null, (iu30) objT, x340Var, 0, 494);
                x340Var.r(true);
                qim0Var3 = qim0Var5;
                z4 = z5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new k61((byte) 1, i, i2, qim0Var3, z4);
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i3 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            qim0Var4 = nim0.a;
            if (i4 != 0) {
                qim0Var5 = qim0Var4;
            } else {
                qim0Var5 = qim0Var2;
            }
            if (i5 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            qim0 qim0VarF2 = u291.f(qim0Var5, 1.0f);
            mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarF2);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            int i7 = i3 & 112;
            j(i7, 4, x340Var, null, z5);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var4, 8.0f));
            j(i7, 4, x340Var, null, z5);
            cvx cvxVar6 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var4, 8.0f));
            j(i7, 0, x340Var, uyn1.B(qim0Var4, 0.0f, 0.0f, 147.0f, 0.0f, 11), z5);
            cvx cvxVar7 = cbx.b(x340Var).b;
            qim0 qim0VarO2 = ab80.o(qim0Var4, 16.0f, x340Var, qim0Var4, 1.0f);
            cvx cvxVar8 = cbx.b(x340Var).b;
            d36 d36Var2 = new d36(16.0f, true, new um5(false));
            if (i7 == 32) {
            }
            objT = x340Var.T();
            if (z6) {
                objT = new mj10((byte) 11, z5);
                x340Var.s0(objT);
            } else {
                objT = new mj10((byte) 11, z5);
                x340Var.s0(objT);
            }
            ujo1.e(qim0VarO2, null, null, d36Var2, null, null, false, null, (iu30) objT, x340Var, 0, 494);
            x340Var.r(true);
            qim0Var3 = qim0Var5;
            z4 = z5;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k61((byte) 1, i, i2, qim0Var3, z4);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(b681 b681Var, xpw xpwVar, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(702869468);
        int i2 = (x340Var.i(b681Var) ? 4 : 2) | i | (x340Var.i(xpwVar) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (b681Var.equals(a681.a)) {
                x340Var.i0(1147698943);
                g(x340Var, 6);
                x340Var.r(false);
            } else {
                if (!(b681Var instanceof z581)) {
                    throw p3d1.k(x340Var, 1147697913, false);
                }
                x340Var.i0(1147700854);
                f(((z581) b681Var).a, xpwVar, x340Var, i2 & 1008);
                x340Var.r(false);
            }
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qm71(b681Var, xpwVar, qim0Var2, i, (byte) 3);
        }
    }

    public static final void e(int i, int i2, int i3, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(255639211);
        int i4 = (x340Var.e(i) ? 4 : 2) | i3 | (x340Var.e(i2) ? 32 : 16);
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarJ = u291.j(56.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarJ, 16.0f, 8.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(2.0f, false, new g21(een.N0, (byte) 28)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            uwo1.e(cwl1.o0(x340Var, 2131952936), null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1778);
            uwo1.e(cwl1.n0(2131952935, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, x340Var), anm1.N("show_generation_list_header_progress", nim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1776);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d681(i, i2, i3, (byte) 0);
        }
    }

    public static final void f(ArrayList arrayList, xpw xpwVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        int i3;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1549565530);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(xpwVar) ? 32 : 16;
        }
        int i4 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i4 == 0) {
            i2 |= x340Var2.i(nim0Var) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarN = anm1.N("show_generation_list", dug.f(qim0VarF, cbx.a(x340Var2).a.a.a(), d4o1.a));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar4);
            nko1.H(xos0VarM, x340Var2, lljVar3);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, lljVar2);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, lljVar);
            if (arrayList.isEmpty()) {
                i3 = 0;
            } else {
                Iterator it = arrayList.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    if (((j681) it.next()).e == 3 && (i3 = i3 + 1) < 0) {
                        p7h.S();
                        throw null;
                    }
                }
            }
            e(i3, arrayList.size(), 0, x340Var2);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarH = u291.h(qim0VarF2, 16.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarH);
            hzj.A.getClass();
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar4);
            nko1.H(xos0VarM2, x340Var2, lljVar3);
            nko1.H(Integer.valueOf(iHashCode2), x340Var2, lljVar2);
            nko1.F(x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar);
            rqo1.g(0, 0, x340Var2, u291.f(nim0Var, 1.0f));
            x340Var2.r(true);
            qim0 qim0VarN2 = anm1.N("show_generation_list_rows", u291.f(bmq0.L(nim0Var, k1o1.q(x340Var2), (g6o0) null), 1.0f));
            float f = cbx.b(x340Var2).e.b;
            axq0 axq0VarM = nmn1.m(new hdh(new zzq0(f, f, f, f), gto1.p(3, x340Var2, 3), d0r0.a), null, new p3v(0.0f), null, new p3v(cbx.b(x340Var2).b.c), 5);
            WeakHashMap weakHashMap = osl1.x;
            hdh hdhVarN = lnn1.n(axq0VarM, hqq0.C(lhc.g(x340Var2).g, x340Var2));
            boolean zI = x340Var2.i(arrayList) | x340Var2.i(xpwVar);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new c861(arrayList, xpwVar, (byte) 23);
                x340Var2.s0(objT);
            }
            s3o1.d(qim0VarN2, null, hdhVarN, null, null, null, false, null, (iu30) objT, x340Var2, 0, 506);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(arrayList, xpwVar, i);
        }
    }

    public static final void g(b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1513822455);
        int i3 = i & 6;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 = (x340Var.i(nim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarN = anm1.N("show_generation_list_loading", uyn1.z(0.0f, cbx.b(x340Var).b.c, 1, dug.f(qim0VarF, cbx.a(x340Var).a.a.a(), d4o1.a)));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            xto1.e(null, 5, 0L, 0L, x340Var, 48, 13);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p4g0(i);
        }
    }

    public static final void h(float f, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0VarL0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(825150883);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(143.0f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0Var = nim0.a;
            qim0 qim0VarS = u291.s(qim0Var, 143.0f, f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarS, jA, er31.b(8.0f));
            if (z) {
                x340Var.i0(-1598938257);
                cua cuaVar2 = cbx.b(x340Var).f;
                qim0VarL0 = cwl1.l0(qim0Var, 0L, er31.b(8.0f), 13);
                x340Var.r(false);
            } else {
                x340Var.i0(-1598935381);
                x340Var.r(false);
                qim0VarL0 = qim0Var;
            }
            t1c.a(qim0VarF.then(qim0VarL0), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sae0(f, z, qim0Var, i);
        }
    }

    public static final void i(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1995967618);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarV = u291.v(nim0Var, 123.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i3 = (i2 << 6) & 896;
            h(143.0f, z, null, x340Var, i3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            h(14.0f, z, null, x340Var, i3);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            h(14.0f, z, null, x340Var, i3);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            h(14.0f, z, null, x340Var, i3);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k750((byte) 7, i, z);
        }
    }

    public static final void j(int i, int i2, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i3;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1346550030);
        if ((i & 6) == 0) {
            i3 = (x340Var.d(14.0f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0VarL0 = nim0.a;
            qim0 qim0Var3 = i4 != 0 ? qim0VarL0 : qim0Var;
            qim0 qim0VarH = u291.h(u291.f(qim0Var3, 1.0f), 14.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarH, jA, er31.b(8.0f));
            if (z) {
                x340Var.i0(-1249409858);
                cua cuaVar2 = cbx.b(x340Var).f;
                qim0VarL0 = cwl1.l0(qim0VarL0, 0L, er31.b(8.0f), 13);
                x340Var.r(false);
            } else {
                x340Var.i0(-1249406982);
                x340Var.r(false);
            }
            t1c.a(qim0VarF.then(qim0VarL0), x340Var, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rta0((byte) 2, i, i2, qim0Var2, z);
        }
    }

    public static final void k(ffj1 ffj1Var, i3b i3bVar, iac0 iac0Var, iu30 iu30Var, n6k1 n6k1Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        x340 x340Var;
        qim0 qim0Var3;
        ffj1 ffj1Var2 = ffj1Var;
        n6k1 n6k1Var2 = n6k1Var;
        m4c m4cVar = fkj0.X;
        m6k1 m6k1Var = n6k1Var2.a;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-221503589);
        int i4 = i | (x340Var2.i(ffj1Var2) ? 4 : 2) | (x340Var2.i(i3bVar) ? 32 : 16) | (x340Var2.i(iac0Var) ? 256 : 128) | (x340Var2.i(iu30Var) ? 2048 : 1024) | (x340Var2.i(n6k1Var2) ? 16384 : 8192);
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = i4 | 196608;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var2.g(qim0Var2) ? 131072 : 65536);
        }
        int i6 = i3;
        if (x340Var2.Y(i6 & 1, (74899 & i6) != 74898)) {
            qim0 qim0Var4 = i5 != 0 ? nim0.a : qim0Var2;
            t7l1 t7l1Var = m6k1Var.a;
            boolean zI = x340Var2.i(ffj1Var2);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new xaj1(ffj1Var2, (byte) 27);
                x340Var2.s0(objT);
            }
            qxd0.i(rih1.a, (iu30) objT, x340Var2);
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            boolean zI2 = x340Var2.i(n6k1Var2) | x340Var2.i(ffj1Var2) | x340Var2.i(i3bVar) | x340Var2.i(context);
            Object objT2 = x340Var2.T();
            if (zI2 || objT2 == m4cVar) {
                wba1 wba1Var = new wba1(n6k1Var, ffj1Var2, i3bVar, context, (lnm) null, (byte) 18);
                n6k1Var2 = n6k1Var;
                ffj1Var2 = ffj1Var2;
                x340Var2.s0(wba1Var);
                objT2 = wba1Var;
            }
            qxd0.t(n6k1Var2, x340Var2, (vu30) objT2);
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = new r6k1(ffj1Var2);
                x340Var2.s0(objT3);
            }
            r6k1 r6k1Var = (r6k1) objT3;
            boolean zI3 = x340Var2.i(iac0Var);
            Object objT4 = x340Var2.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new t6j1(iac0Var, r6k1Var, (lnm) null, (byte) 11);
                x340Var2.s0(objT4);
            }
            qxd0.t(r6k1Var, x340Var2, (vu30) objT4);
            boolean zI4 = x340Var2.i(iac0Var);
            Object objT5 = x340Var2.T();
            if (zI4 || objT5 == m4cVar) {
                objT5 = new hij1(iac0Var, r6k1Var, (byte) 13);
                x340Var2.s0(objT5);
            }
            qxd0.i(iac0Var, (iu30) objT5, x340Var2);
            Object objT6 = x340Var2.T();
            if (objT6 == m4cVar) {
                objT6 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT6);
            }
            ven0 ven0Var = (ven0) objT6;
            u7h u7hVar = m6k1Var.k;
            j2i j2iVarR = apo.r(183543137, new n2y0(t7l1Var, n6k1Var2, ffj1Var2, ven0Var, iu30Var, (byte) 13), x340Var2);
            if (u7hVar != null) {
                x340Var2.i0(-1741244417);
                b6p1.d(((Boolean) ven0Var.getValue()).booleanValue(), u7hVar.a, qim0Var4, null, apo.r(-993912470, new p6k1(j2iVarR), x340Var2), x340Var2, ((i6 >> 9) & 896) | 24576, 8);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var = x340Var2;
                x340Var.i0(-1741044870);
                j2iVarR.invoke(u291.d(qim0Var4, 1.0f), x340Var, 48);
                x340Var.r(false);
            }
            qim0Var3 = qim0Var4;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q6k1(ffj1Var, i3bVar, iac0Var, iu30Var, n6k1Var, qim0Var3, i, i2);
        }
    }

    public static final fdr l(String str) {
        if (str.equals("LOGGED_OUT")) {
            return fdr.b;
        }
        if (str.equals("LOGGED_IN")) {
            return fdr.c;
        }
        if (str.equals("PRE_PLAYBACK")) {
            return fdr.d;
        }
        if (str.equals("PLAYING")) {
            return fdr.e;
        }
        hhg1.n(f4i1.f("Cannot convert \"", str, "\" to session stage"));
        return null;
    }

    public static final String m(fdr fdrVar) {
        return fdrVar.a;
    }

    public static final boolean n(int i, d030 d030Var) {
        if (i == 1) {
            return true;
        }
        if (i == 0) {
            return !(((qj80) ((rj80) lcc.z(d030Var, t4k.m)).a.getValue()).a == 1);
        }
        if (i == 2) {
            return false;
        }
        eg.m("Unknown Focusability");
        return false;
    }

    public static String o(yfh yfhVar) {
        return l1d.m("entity:", yfhVar.a.a);
    }

    public static final int p(int i, String str) {
        if (str.length() == 0) {
            return 0;
        }
        int iP = yoi1.p(i, 0, ihc1.q0(str));
        while (iP < str.length() && !Character.isLetterOrDigit(str.charAt(iP))) {
            iP++;
        }
        while (iP < str.length() && Character.isLetterOrDigit(str.charAt(iP))) {
            iP++;
        }
        return iP;
    }

    public static final int q(int i, String str) {
        if (i <= 0 || str.length() == 0) {
            return 0;
        }
        int iP = yoi1.p(i - 1, 0, ihc1.q0(str));
        while (iP > 0 && !Character.isLetterOrDigit(str.charAt(iP))) {
            iP--;
        }
        while (iP > 0 && Character.isLetterOrDigit(str.charAt(iP - 1))) {
            iP--;
        }
        return iP;
    }

    public static final go80 r(klm klmVar, cdp0 cdp0Var, ycp0 ycp0Var, ycp0 ycp0Var2, ddp0 ddp0Var, cdp0 cdp0Var2, cdp0 cdp0Var3, edp0 edp0Var, edp0 edp0Var2, edp0 edp0Var3, cdp0 cdp0Var4, rbp0 rbp0Var, cdp0 cdp0Var5, cdp0 cdp0Var6, ycp0 ycp0Var3, cdp0 cdp0Var7, cdp0 cdp0Var8) {
        return klmVar.a("WorkoutSessionDaemon", new ebp0(cdp0Var, ycp0Var, ycp0Var2, ddp0Var, cdp0Var2, cdp0Var3, edp0Var, edp0Var2, edp0Var3, cdp0Var4, rbp0Var, cdp0Var5, cdp0Var6, ycp0Var3, cdp0Var7, cdp0Var8, (byte) 1));
    }

    public static i3l0 s(String str) {
        return new i3l0(a1l0.X, str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public static final void t(int i, int i2, h661 h661Var) throws MissingFieldException {
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(h661Var.e(i4));
            }
            i3 >>>= 1;
        }
        String strH = h661Var.h();
        throw new MissingFieldException(arrayList.size() == 1 ? rjx.o(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", strH, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + strH + "', but they were missing", (Throwable) null, arrayList, strH);
    }
}
