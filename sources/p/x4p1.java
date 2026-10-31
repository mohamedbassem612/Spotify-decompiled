package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class x4p1 {
    public static b180 a;
    public static b180 b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(d5p1 d5p1Var, iyr0 iyr0Var, iu30 iu30Var, em0 em0Var, d0r d0rVar, g5l0 g5l0Var, hdh hdhVar, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-285820576);
        int i2 = i | (x340Var.g(d5p1Var) ? 4 : 2) | (x340Var.e(iyr0Var.ordinal()) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(em0Var) ? 2048 : 1024) | (x340Var.i(d0rVar) ? 16384 : 8192) | (x340Var.i(g5l0Var) ? 131072 : 65536) | (x340Var.g(hdhVar) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new cr0(iu30Var, (byte) 3);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                r8x r8xVar = new r8x(true, ((qq) ((mwo) em0Var.h).a.c).e());
                x340Var.s0(r8xVar);
                objT2 = r8xVar;
            }
            r8x r8xVar2 = (r8x) objT2;
            boolean z2 = i3 == 256;
            Object objT3 = x340Var.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new cr0(iu30Var, (byte) 2);
                x340Var.s0(objT3);
            }
            Function0 function1 = (Function0) objT3;
            if (d5p1Var instanceof ob1) {
                x340Var.i0(2040178043);
                otw.c((br0) em0Var.i, new bts(iyr0Var), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            } else if (d5p1Var instanceof qb1) {
                x340Var.i0(204365196);
                z4p1.j((cx0) em0Var.t, x340Var, 0);
                x340Var.r(false);
            } else if (d5p1Var instanceof pb1) {
                x340Var.i0(2040450254);
                rrn1.l(function0, (nwo) em0Var.X, qim0Var, true, x340Var, 3456, 0);
                x340Var.r(false);
            } else if (d5p1Var instanceof rb1) {
                x340Var.i0(204375652);
                h4o1.g(((rb1) d5p1Var).c, r8xVar2, x340Var, 48);
                x340Var.r(false);
            } else {
                if (!(d5p1Var instanceof sb1)) {
                    throw p3d1.k(x340Var, 204359132, false);
                }
                x340Var.i0(2040823773);
                sb1 sb1Var = (sb1) d5p1Var;
                c380 c380Var = sb1Var.d;
                mlr0 mlr0Var = sb1Var.f;
                boolean z3 = sb1Var.g;
                int i4 = sb1Var.h;
                u380 u380Var = sb1Var.i;
                qim0 qim0VarD = u291.d(qim0Var, 1.0f);
                boolean z4 = i3 == 256;
                Object objT4 = x340Var.T();
                if (z4 || objT4 == m4cVar) {
                    objT4 = new qj(iu30Var, (byte) 22);
                    x340Var.s0(objT4);
                }
                iu30 iu30Var2 = (iu30) objT4;
                boolean z5 = i3 == 256;
                Object objT5 = x340Var.T();
                if (z5 || objT5 == m4cVar) {
                    objT5 = new qj(iu30Var, (byte) 23);
                    x340Var.s0(objT5);
                }
                y2o1.l(c380Var, iyr0Var, d0rVar, em0Var, g5l0Var, iu30Var2, (iu30) objT5, qim0VarD, mlr0Var, z3, function1, i4, hdhVar, u380Var, x340Var, (i2 & 112) | ((i2 >> 6) & 896) | (i2 & 7168) | ((i2 >> 3) & 57344), (i2 >> 12) & 896);
                x340Var = x340Var;
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n(d5p1Var, iyr0Var, iu30Var, em0Var, d0rVar, g5l0Var, hdhVar, qim0Var, i, (byte) 3);
        }
    }

    public static final void b(int i, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1098605859);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.g(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarT = ltn1.t(u291.f(qim0Var, 1.0f), z);
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.e(str, qim0VarT, cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, i2 & 14, 0, 2016);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ltj(str, z, qim0Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x0114  */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:49:0x0126  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void c(String str, float f, qim0 qim0Var, float f2, float f3, float f4, j2i j2iVar, b0k b0kVar, int i, int i2) {
        float f5;
        int i3;
        boolean z;
        j2i j2iVar2;
        qim0 qim0Var2;
        float f6;
        h311 h311VarV;
        int i4;
        qim0 qim0Var3;
        qim0 qim0Var4;
        Object objT;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-903483819);
        int i5 = i | 384 | (x340Var.d(f2) ? 2048 : 1024) | (x340Var.d(f3) ? 16384 : 8192);
        if ((i2 & 32) == 0) {
            f5 = f4;
            int i6 = x340Var.d(f5) ? 131072 : 65536;
            i3 = i5 | i6;
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                i4 = i & 1;
                qim0Var3 = nim0.a;
                if (i4 != 0 || x340Var.E()) {
                    if ((i2 & 32) != 0) {
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var).b;
                        f5 = 16.0f;
                    }
                    qim0Var4 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var4 = qim0Var;
                }
                x340Var.s();
                qim0 qim0VarN = anm1.N(str, u291.f(qim0Var3, 1.0f));
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = new vbk0((byte) 15, f);
                    x340Var.s0(objT);
                }
                qim0 qim0VarA = uyn1.A(s161.b(qim0VarN, false, (iu30) objT).then(qim0Var4), f5, f2, f5, f3);
                fra fraVar = een.N0;
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarA);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                j2iVar2 = j2iVar;
                j2iVar2.invoke(pw31.a, x340Var, 54);
                x340Var.r(true);
                qim0Var2 = qim0Var4;
            } else {
                j2iVar2 = j2iVar;
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            f6 = f5;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new jw11(str, f, qim0Var2, f2, f3, f6, j2iVar2, i, i2);
            }
        }
        f5 = f4;
        i3 = i5 | i6;
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            i4 = i & 1;
            qim0Var3 = nim0.a;
            if (i4 != 0) {
                if ((i2 & 32) != 0) {
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    f5 = 16.0f;
                }
                qim0Var4 = qim0Var3;
            } else {
                if ((i2 & 32) != 0) {
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    f5 = 16.0f;
                }
                qim0Var4 = qim0Var3;
            }
            x340Var.s();
            qim0 qim0VarN2 = anm1.N(str, u291.f(qim0Var3, 1.0f));
            objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new vbk0((byte) 15, f);
                x340Var.s0(objT);
            }
            qim0 qim0VarA2 = uyn1.A(s161.b(qim0VarN2, false, (iu30) objT).then(qim0Var4), f5, f2, f5, f3);
            fra fraVar2 = een.N0;
            uwr uwrVar5 = cbx.a;
            cvx cvxVar5 = cbx.b(x340Var).b;
            jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar2, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarA2);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            j2iVar2 = j2iVar;
            j2iVar2.invoke(pw31.a, x340Var, 54);
            x340Var.r(true);
            qim0Var2 = qim0Var4;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        f6 = f5;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jw11(str, f, qim0Var2, f2, f3, f6, j2iVar2, i, i2);
        }
    }

    public static final void d(c380 c380Var, qim0 qim0Var, lee1 lee1Var, long j, b0k b0kVar, int i) {
        x340 x340Var;
        long j2;
        long j3;
        int i2;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(853911434);
        j06 j06Var = x340Var2.a;
        int i3 = i | (x340Var2.g(c380Var) ? 4 : 2) | (x340Var2.i(qim0Var) ? 32 : 16) | (x340Var2.i(lee1Var) ? 256 : 128) | 1024;
        if (x340Var2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var2.d0();
            if ((i & 1) == 0 || x340Var2.E()) {
                uwr uwrVar = cbx.a;
                j3 = cbx.a(x340Var2).b.a;
                i2 = i3 & (-7169);
            } else {
                x340Var2.b0();
                i2 = i3 & (-7169);
                j3 = j;
            }
            x340Var2.s();
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new xr1(c380Var, (byte) 4);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0Var, false, (iu30) objT);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            Function0 function0 = hmb0.t1;
            if (z2) {
                x340Var2.l(function0);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar3);
            nko1.H(xos0VarM, x340Var2, lljVar2);
            x0d.q(iHashCode, x340Var2, lljVar, x340Var2);
            Iterator itN = kk0.n(x340Var2, qim0VarE, vu30Var, 506613427, c380Var);
            int i4 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                y980 y980Var = (y980) next;
                Iterator it = itN;
                qim0 qim0VarZ = uyn1.z(0.0f, 2.0f, 1, nim0.a);
                boolean zE = x340Var2.e(i4);
                Object objT2 = x340Var2.T();
                if (zE || objT2 == m4cVar) {
                    objT2 = new po60(i4, (byte) 2);
                    x340Var2.s0(objT2);
                }
                qim0 qim0VarB2 = s161.b(qim0VarZ, true, (iu30) objT2);
                jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
                llj lljVar4 = lljVar;
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB2);
                hzj.A.getClass();
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function0);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, lljVar3);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                lljVar = lljVar4;
                x0d.q(iHashCode2, x340Var2, lljVar, x340Var2);
                nko1.H(qim0VarE2, x340Var2, vu30Var);
                x340 x340Var3 = x340Var2;
                int i6 = i2 & 8064;
                long j4 = j3;
                uwo1.e(y980Var.a, null, lee1Var, j4, null, null, 0, false, null, 0, null, x340Var3, i6, 0, 2034);
                uwo1.e(y980Var.b, new wnb0(1.0f, true), lee1Var, j4, null, null, 0, false, null, 0, null, x340Var3, i6, 0, 2032);
                x340Var3.r(true);
                i2 = i2;
                x340Var2 = x340Var3;
                j3 = j4;
                i4 = i5;
                function0 = function0;
                vu30Var = vu30Var;
                itN = it;
            }
            x340Var = x340Var2;
            x340Var.r(false);
            x340Var.r(true);
            j2 = j3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            j2 = j;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cg6((Object) c380Var, (Object) qim0Var, (Object) lee1Var, j2, i, (byte) 9);
        }
    }

    public static final void e(cr31 cr31Var, qim0 qim0Var, b0k b0kVar, int i) {
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1132244628);
        int i2 = (x340Var.g(cr31Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            uwr uwrVar = cbx.a;
            uwo1.e("", null, cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 6, 0, 2042);
            qim0 qim0VarB = h2c.a.b(nim0.a);
            cvx cvxVar = cbx.b(x340Var).b;
            b2 = 0;
            t1c.a(cwl1.l0(uyn1.z(0.0f, 4.0f, 1, qim0VarB), cbx.a(x340Var).a.b.a(), cr31Var, 4), x340Var, 0);
            x340Var.r(true);
        } else {
            b2 = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p9e0(cr31Var, qim0Var, i, b2);
        }
    }

    public static final void f(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1666918813);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            qim0 qim0Var2 = qim0Var;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            avw0 avw0Var = cbx.b(x340Var).c;
            cvx cvxVar = cbx.b(x340Var).b;
            cr31 cr31VarB = er31.b(12.0f);
            lgo1.d(apo.r(-1885783138, new ac8(3, (byte) 17), x340Var), apo.r(379350856, new s2c0(cr31VarB, (byte) 18), x340Var), qim0Var2, null, "carousel-item-loading-test-tag", apo.r(1833758964, new q9e0(cr31VarB, (byte) 0), x340Var), x340Var, ((i3 << 6) & 896) | 221238, 8);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kx9((byte) 1, i, i2, qim0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v21 */
    public static final void g(hw11 hw11Var, maa maaVar, maa maaVar2, maa maaVar3, List list, b0k b0kVar, int i) {
        int i2;
        ?? r1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(467885972);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(hw11Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(maaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(maaVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(maaVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(list) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ou11.R0;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (maaVar == null && list.isEmpty()) {
                x340Var.i0(567532696);
                x340Var.r(false);
                r1 = 0;
            } else {
                x340Var.i0(566781194);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                r1 = 0;
                c("releases_header_title", 0.0f, null, 12.0f, 2.0f, 0.0f, apo.r(-1523107047, new hho0(list, maaVar, hw11Var, (byte) 25), x340Var), x340Var, 1572918, 36);
                x340Var.r(false);
            }
            if (maaVar2 == null) {
                x340Var.i0(567558766);
                x340Var.r((boolean) r1);
            } else {
                x340Var.i0(567558767);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                cvx cvxVar4 = cbx.b(x340Var).b;
                c("releases_header_info", 1.0f, null, 2.0f, 8.0f, 0.0f, apo.r(868149828, new kw11(maaVar2, hw11Var, r1), x340Var), x340Var, 1572918, 36);
                x340Var.r((boolean) r1);
            }
            if (maaVar3 == null || (hw11Var.c.isEmpty() && !hw11Var.f)) {
                x340Var.i0(568373912);
                x340Var.r((boolean) r1);
            } else {
                x340Var.i0(567921281);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar5 = cbx.b(x340Var).b;
                cvx cvxVar6 = cbx.b(x340Var).b;
                c("releases_header_action_chips", 2.0f, null, 8.0f, 4.0f, 0.0f, apo.r(-505444016, new kw11(maaVar3, hw11Var, (byte) 1), x340Var), x340Var, 1572918, 4);
                x340Var.r((boolean) r1);
            }
            x340Var.r((boolean) r9);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0((byte) 24, i, hw11Var, maaVar, maaVar2, maaVar3, list);
        }
    }

    public static final lt20 h(mr20 mr20Var, xu30 xu30Var) {
        return new lt20(mr20Var, xu30Var, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable i(mr20 mr20Var, vr20 vr20Var, onm onmVar) throws Throwable {
        mt20 mt20Var;
        p811 p811Var;
        faa0 faa0VarA;
        CancellationException cancellationExceptionG;
        if (onmVar instanceof mt20) {
            mt20Var = (mt20) onmVar;
            int i = mt20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mt20Var.c = i - Integer.MIN_VALUE;
            } else {
                mt20Var = new mt20(onmVar);
            }
        } else {
            mt20Var = new mt20(onmVar);
        }
        Object obj = mt20Var.b;
        int i2 = mt20Var.c;
        if (i2 == 0) {
            p811 p811VarU = cy30.u(obj);
            try {
                mib mibVar = new mib(vr20Var, p811VarU, (byte) 9);
                mt20Var.a = p811VarU;
                mt20Var.c = 1;
                Object objCollect = mr20Var.collect(mibVar, mt20Var);
                d9n d9nVar = d9n.a;
                if (objCollect == d9nVar) {
                    return d9nVar;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                p811Var = p811VarU;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p811Var = mt20Var.a;
            try {
                hm5.M(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) p811Var.a;
        if ((th3 != null && th3.equals(th)) || ((faa0VarA = mt20Var.getContext().A(fkj0.W0)) != null && faa0VarA.isCancelled() && (cancellationExceptionG = faa0VarA.g()) != null && cancellationExceptionG.equals(th))) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            j2h1.h(th3, th);
            throw th3;
        }
        j2h1.h(th, th3);
        throw th;
    }

    public static final b0a j(a0a a0aVar, int i, wkt wktVar) {
        return new b0a(a0aVar.a, i, mqo1.F(a0aVar.b), a0aVar.c, a0aVar.d, a0aVar.Z, a0aVar.N0, a0aVar.P0, a0aVar.e, a0aVar.f, a0aVar.g, a0aVar.h, a0aVar.i, a0aVar.t, a0aVar.X, a0aVar.Y, a0aVar.O0, a0aVar.Q0, wktVar);
    }

    public static final float k(y9e1 y9e1Var, int i) {
        if (i < 0) {
            return 0.0f;
        }
        x9e1 x9e1Var = y9e1Var.a;
        zrm0 zrm0Var = y9e1Var.b;
        if (x9e1Var.a.b.length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(zrm0Var.d(i), Math.min(zrm0Var.b - 1, zrm0Var.f - 1));
        if (i > zrm0Var.c(iMin, false)) {
            return 0.0f;
        }
        zrm0Var.m(iMin);
        ArrayList arrayList = zrm0Var.h;
        sor0 sor0Var = (sor0) arrayList.get(sjo0.r(iMin, arrayList));
        return sor0Var.a.d.h(iMin - sor0Var.d);
    }

    public static final boolean l(bzj1 bzj1Var, String str) {
        if (bzj1Var.equals(zyj1.a)) {
            return false;
        }
        if (bzj1Var.equals(yyj1.a)) {
            return true;
        }
        if (bzj1Var instanceof azj1) {
            return ((azj1) bzj1Var).a.contains(str);
        }
        eg.o();
        return false;
    }

    public static rrk0 m(String str) {
        r6h1 r6h1Var = r6h1.c;
        return new rrk0(str, (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    public static y441 n(String str) throws JSONException {
        ?? SingletonList;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("action");
        ArrayList arrayList = null;
        String strOptString = jSONObject.optString("method", null);
        String strOptString2 = jSONObject.optString("enctype", null);
        JSONObject jSONObject2 = jSONObject.getJSONObject("params");
        String strOptString3 = jSONObject2.optString("title", "title");
        String strOptString4 = jSONObject2.optString("text", "text");
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("files");
        if (jSONArrayOptJSONArray != null) {
            arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                String string2 = jSONObject3.getString("name");
                Object obj = jSONObject3.get("accept");
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    SingletonList = new ArrayList(jSONArray.length());
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        SingletonList.add(jSONArray.getString(i2));
                    }
                } else {
                    SingletonList = Collections.singletonList(obj.toString());
                }
                arrayList.add(new nn71(string2, SingletonList));
            }
        }
        return new y441(string, strOptString, strOptString2, new q371(strOptString3, arrayList, strOptString4));
    }

    public static final xb10 o(b0k b0kVar) {
        Object[] objArr = new Object[0];
        df41 df41Var = xb10.b;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = nyf.Q0;
            x340Var.s0(objT);
        }
        return (xb10) k5p1.u(objArr, df41Var, (Function0) objT, x340Var, 384);
    }

    public static final evz p(mr20 mr20Var, long j, vu30 vu30Var) {
        if (j > 0) {
            return new evz(mr20Var, new ot20(j, vu30Var, (lnm) null), (byte) 11);
        }
        hhg1.f(l1d.l(j, "Expected positive amount of retries, but had "));
        return null;
    }

    public static evz q(int i, mr20 mr20Var, vu30 vu30Var) {
        if ((i & 2) != 0) {
            vu30Var = new s55(2, (lnm) null, (byte) 11);
        }
        return p(mr20Var, Long.MAX_VALUE, vu30Var);
    }

    public static final evz r(mr20 mr20Var, zu30 zu30Var) {
        return new evz(mr20Var, zu30Var, (byte) 11);
    }
}
