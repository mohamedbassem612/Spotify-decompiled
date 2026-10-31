package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ero1 {
    public static b180 a;

    public static final void a(int i, String str, Function0 function0, b0k b0kVar) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-177675700);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.i0(1052347952);
            String strO0 = str.length() == 0 ? cwl1.o0(x340Var, 2131952771) : str;
            x340Var.r(false);
            String strO1 = cwl1.o0(x340Var, 2131952772);
            String strO2 = cwl1.o0(x340Var, 2131952770);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new lj2(function0, (byte) 18);
                x340Var.s0(objT);
            }
            String str2 = strO0;
            function1 = function0;
            mqo1.d(function1, (i3u) null, (hux) null, strO1, str2, new zgx(strO2, new gbx(z50.c, (Function0) objT)), (zgx) null, x340Var, ((i2 >> 3) & 14) | 262144, 70);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ql(str, function1, i, (byte) 3);
        }
    }

    public static final void b(t0o t0oVar, boolean z, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1173235096);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(t0oVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new sqm(iu30Var2, t0oVar, (byte) 8);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            cwl1.b(qim0Var, (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT), (gbx) null, apo.r(481101151, new o3((byte) 11, t0oVar, iu30Var, z), b0kVar3), b0kVar2, (i2 >> 12) & 14, 48, 1534);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(t0oVar, z, iu30Var, iu30Var2, qim0Var, i, (byte) 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r8v10, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void c(qim0 qim0Var, gbx gbxVar, String str, idn0 idn0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        ?? r8;
        qim0 qim0VarThen;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1682983602);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gbxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(idn0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            if (gbxVar != null) {
                r8 = 0;
                qim0VarThen = qim0Var.then(bin.v(nim0.a, idn0Var, ny3.a, false, gbxVar.c, (pm31) null, gbxVar.b, 20));
            } else {
                r8 = 0;
                qim0VarThen = qim0Var;
            }
            int i3 = (x340Var.i(gbxVar) ? 1 : 0) | ((i2 & 896) == 256 ? 1 : r8);
            Object objT = x340Var.T();
            Object obj = objT;
            if (i3 != 0 || objT == m4cVar) {
                thx thxVar = new thx(str, gbxVar, (byte) r8);
                x340Var.s0(thxVar);
                obj = thxVar;
            }
            qim0 qim0VarA = s161.a(qim0VarThen, (iu30) obj);
            gfh0 gfh0VarC = t1c.c(een.d, (boolean) r8);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            dv20.l((i2 >> 12) & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq(qim0Var, gbxVar, str, idn0Var, j2iVar, i);
        }
    }

    public static final void d(int i, String str, Function0 function0, Function0 function1, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-171522754);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(16.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarQ = i1p1.q(qim0Var3, cr31VarB);
            zsc zscVar = zex.a;
            qim0 qim0VarF = dug.f(qim0VarQ, ((yex) zscVar.d).c, d4o1.a);
            String strO0 = cwl1.o0(x340Var, 2131962997);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new uuc1(function0, (byte) 0);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, true, strO0, (pm31) null, (idn0) null, (Function0) objT, 12);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarX, 16.0f);
            fra fraVar = een.N0;
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA2 = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            lee1 lee1Var = cbx.d(x340Var).g;
            long j = ((vex) zscVar.e).m;
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var2 = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.B(wnb0Var2, 0.0f, 0.0f, 16.0f, 0.0f, 11), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2032);
            x340Var = x340Var;
            x340Var.r(true);
            qim0 qim0VarR = u291.r(qim0Var3, 48.0f);
            String strO1 = cwl1.o0(x340Var, 2131962996);
            boolean z3 = (i2 & 896) == 256;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new uuc1(function1, (byte) 1);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX3 = bin.x(qim0VarR, false, strO1, (pm31) null, (idn0) null, (Function0) objT2, 13);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            w0h1.a(amx.c, new jsl(cwl1.o0(x340Var, 2131962996)), u291.r(qim0Var3, 20.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, amx.d, 48);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new aur0(str, function0, function1, qim0Var2, i, (byte) 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void e(qgi1 qgi1Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-83320152);
        int i2 = (x340Var.g(qgi1Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = qgi1Var instanceof pgi1;
            qim0 qim0VarX = null;
            qim0Var2 = nim0.a;
            if (z) {
                x340Var.i0(300582654);
                x340Var.i0(1533722041);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                pgi1 pgi1Var = (pgi1) qgi1Var;
                qim0 qim0VarN = anm1.N(pgi1Var.b.toString(), u291.r(qim0Var2, 24.0f));
                Function0 function0 = pgi1Var.c;
                if (function0 == null) {
                    x340Var.i0(-624912159);
                } else {
                    x340Var.i0(-624912158);
                    boolean zG = x340Var.g(function0);
                    Object objT = x340Var.T();
                    if (zG || objT == fkj0.X) {
                        objT = new sah1(function0, (byte) 15);
                        x340Var.s0(objT);
                    }
                    qim0VarX = bin.x(qim0VarN, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
                }
                x340Var.r(false);
                if (qim0VarX != null) {
                    qim0VarN = qim0VarX;
                }
                x340Var.r(false);
                w0h1.a(pgi1Var.b, new jsl(pgi1Var.a), qim0VarN, cbx.a(x340Var).b.b, 0L, false, x340Var, 8, 48);
                x340Var.r(false);
            } else {
                if (!(qgi1Var instanceof ogi1)) {
                    throw p3d1.k(x340Var, 1533715443, false);
                }
                x340Var.i0(1533731125);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
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
                k4s0.i(0, ((ogi1) qgi1Var).a, x340Var, true, false);
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l04(qgi1Var, qim0Var2, i, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:62:0x0130  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void f(rgi1 rgi1Var, Function0 function0, gw70 gw70Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        byte b;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        boolean z2;
        Object objT;
        gbx gbxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1555668727);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(rgi1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(gw70Var) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.g(qim0Var2) ? 2048 : 1024;
            }
            b = 0;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
                uvx uvxVar = new uvx(1, rgi1Var.e, 0, (vzq0) null, (zzq0) null, (tvx) null, d4o1.a, 0, (p3v) null, 444);
                if (function0 == null) {
                    b0kVar3.i0(-2064672117);
                    b0kVar3.r(false);
                    gbxVar = null;
                } else {
                    b0kVar3.i0(-2064672116);
                    if ((i3 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT = b0kVar3.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new sah1(function0, (byte) 16);
                        b0kVar3.s0(objT);
                    }
                    gbxVar = new gbx(z50.c, (Function0) objT);
                    b0kVar3.r(false);
                }
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarF, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(272171009, new sgi1(gw70Var, rgi1Var, b), b0kVar3), (xu30) null, (xu30) null, apo.r(1376398015, new tgi1(rgi1Var, (byte) 0), b0kVar3), apo.r(-1041300386, new tgi1(rgi1Var, (byte) 1), b0kVar3), (xu30) null, (xu30) null, apo.r(295539003, new tgi1(rgi1Var, (byte) 2), b0kVar3), b0kVar2, 100663360, 197040, 26300);
                qim0Var3 = qim0Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new nj2(rgi1Var, function0, gw70Var, qim0Var3, i, i2, (byte) 17);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        b = 0;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i4 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
            uvx uvxVar2 = new uvx(1, rgi1Var.e, 0, (vzq0) null, (zzq0) null, (tvx) null, d4o1.a, 0, (p3v) null, 444);
            if (function0 == null) {
                b0kVar3.i0(-2064672117);
                b0kVar3.r(false);
                gbxVar = null;
            } else {
                b0kVar3.i0(-2064672116);
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT = b0kVar3.T();
                if (z2) {
                    objT = new sah1(function0, (byte) 16);
                    b0kVar3.s0(objT);
                } else {
                    objT = new sah1(function0, (byte) 16);
                    b0kVar3.s0(objT);
                }
                gbxVar = new gbx(z50.c, (Function0) objT);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF2, uvxVar2, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(272171009, new sgi1(gw70Var, rgi1Var, b), b0kVar3), (xu30) null, (xu30) null, apo.r(1376398015, new tgi1(rgi1Var, (byte) 0), b0kVar3), apo.r(-1041300386, new tgi1(rgi1Var, (byte) 1), b0kVar3), (xu30) null, (xu30) null, apo.r(295539003, new tgi1(rgi1Var, (byte) 2), b0kVar3), b0kVar2, 100663360, 197040, 26300);
            qim0Var3 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2(rgi1Var, function0, gw70Var, qim0Var3, i, i2, (byte) 17);
        }
    }

    public static final String g(d6c0 d6c0Var) {
        if (d6c0Var instanceof y4c0) {
            return "albums";
        }
        if (d6c0Var instanceof b5c0) {
            return "all_downloaded";
        }
        if (d6c0Var instanceof e5c0) {
            return "artists";
        }
        if (d6c0Var instanceof g5c0) {
            return "books";
        }
        if (d6c0Var instanceof q5c0) {
            return "downloaded";
        }
        if (d6c0Var instanceof y5c0) {
            return "playlists";
        }
        if (d6c0Var instanceof z5c0) {
            return "podcasts";
        }
        if (d6c0Var instanceof j5c0) {
            return "courses";
        }
        if (u890.j(d6c0Var, k5c0.b)) {
            return "downloaded_albums";
        }
        if (u890.j(d6c0Var, l5c0.b)) {
            return "downloaded_artists";
        }
        if (u890.j(d6c0Var, o5c0.b)) {
            return "downloaded_playlists";
        }
        if (u890.j(d6c0Var, p5c0.b)) {
            return "downloaded_podcasts";
        }
        if (u890.j(d6c0Var, m5c0.b)) {
            return "downloaded_books";
        }
        if (u890.j(d6c0Var, n5c0.b)) {
            return "downloaded_courses";
        }
        if (d6c0Var instanceof i5c0) {
            return "by_you";
        }
        if (d6c0Var instanceof h5c0) {
            return "by_spotify";
        }
        if (u890.j(d6c0Var, a5c0.b)) {
            return "all_by_you";
        }
        if (u890.j(d6c0Var, z4c0.b)) {
            return "all_by_spotify";
        }
        if (d6c0Var instanceof r5c0) {
            return "events";
        }
        if (u890.j(d6c0Var, b6c0.b)) {
            return "upcoming";
        }
        if (u890.j(d6c0Var, c6c0.b)) {
            return "venue";
        }
        if (u890.j(d6c0Var, x5c0.b)) {
            return "past";
        }
        if (u890.j(d6c0Var, u5c0.b)) {
            return "in_progress";
        }
        if (u890.j(d6c0Var, a6c0.b)) {
            return "unplayed";
        }
        if (u890.j(d6c0Var, f5c0.b)) {
            return "authors";
        }
        if (u890.j(d6c0Var, s5c0.b)) {
            return "finished";
        }
        if (u890.j(d6c0Var, d5c0.b)) {
            return "all_mixed";
        }
        if (d6c0Var instanceof w5c0) {
            return "is_mixed";
        }
        if (u890.j(d6c0Var, c5c0.b)) {
            return "all_folders";
        }
        if (d6c0Var instanceof t5c0) {
            return "folders";
        }
        eg.o();
        return null;
    }

    public static final bu70 h(String str, String str2, String str3, boolean z) {
        boolean zY0 = ihc1.y0(str);
        int i = !zY0 ? 1 : 0;
        int i2 = 2;
        int i3 = ihc1.y0(str2) ? 0 : 2;
        if (ihc1.y0(str3) && !z) {
            i2 = 0;
        } else if (!zY0 || i3 != 0) {
            i2 = 1;
        }
        return new bu70(i, i3, i2);
    }

    public static final void i(we30 we30Var, s8s0 s8s0Var) {
        n36<s8s0> n36Var = new n36();
        while (s8s0Var != null && !j(we30Var, s8s0Var)) {
            n36Var.addFirst(s8s0Var);
            s8s0Var = s8s0Var.c();
        }
        for (s8s0 s8s0Var2 : n36Var) {
            gka0 gka0Var = i520.a;
            we30Var.d(s8s0Var2);
        }
    }

    public static final boolean j(i520 i520Var, s8s0 s8s0Var) {
        return i520Var.g(s8s0Var) != null;
    }

    public static final q420 k(i520 i520Var, s8s0 s8s0Var) {
        q420 q420VarG = i520Var.g(s8s0Var);
        if (q420VarG != null) {
            return q420VarG;
        }
        t8e1.p(s8s0Var, "no such file: ");
        return null;
    }

    public static final String l(zjn0 zjn0Var, int i) {
        String strB = zjn0Var.b(i);
        return zjn0Var.a(i) ? ".".concat(strB) : strB;
    }

    public static final go80 m(klm klmVar, qbp0 qbp0Var, qbp0 qbp0Var2, qbp0 qbp0Var3, qbp0 qbp0Var4, qbp0 qbp0Var5, qbp0 qbp0Var6, qbp0 qbp0Var7, qbp0 qbp0Var8, qbp0 qbp0Var9, qbp0 qbp0Var10, qbp0 qbp0Var11) {
        return klmVar.a("AllowlistingNotificationsDaemon", new oap0(qbp0Var, qbp0Var2, qbp0Var3, qbp0Var4, qbp0Var5, qbp0Var6, qbp0Var7, qbp0Var8, qbp0Var9, qbp0Var10, qbp0Var11));
    }

    public static final psw n(maa maaVar, ohi0 ohi0Var, gw70 gw70Var, kko kkoVar, Function0 function0, Function0 function1, p731 p731Var, tbw0 tbw0Var, aru0 aru0Var, myq0 myq0Var, aru0 aru0Var2, cua cuaVar, n801 n801Var, ycm ycmVar, e9g1 e9g1Var, iuj iujVar, yqg yqgVar) {
        j2i j2iVar = new j2i(-1848738455, new vhi0(ohi0Var, gw70Var, tbw0Var, function0, p731Var, function1, aru0Var, kkoVar, myq0Var, ycmVar, aru0Var2, cuaVar, n801Var, e9g1Var, iujVar, yqgVar), true);
        ien0 ien0Var = qsw.a;
        return new psw(j2iVar, (byte) 0);
    }

    public static final q2b0 o(efy0 efy0Var, zjn0 zjn0Var) {
        String strL = l(zjn0Var, efy0Var.c);
        List<cfy0> list = efy0Var.d;
        ArrayList arrayList = new ArrayList();
        for (cfy0 cfy0Var : list) {
            k3b0 k3b0VarP = p(cfy0Var.d, zjn0Var);
            mmr0 mmr0Var = k3b0VarP != null ? new mmr0(zjn0Var.getString(cfy0Var.c), k3b0VarP) : null;
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return new q2b0(strL, sqg0.T(arrayList));
    }

    public static final k3b0 p(bfy0 bfy0Var, zjn0 zjn0Var) {
        boolean zBooleanValue = no20.S.d(bfy0Var.Z).booleanValue();
        afy0 afy0Var = bfy0Var.c;
        if (zBooleanValue) {
            int i = afy0Var != null ? vb01.a[afy0Var.ordinal()] : -1;
            if (i == 1) {
                return new g3b0((byte) bfy0Var.d);
            }
            if (i == 2) {
                return new j3b0((short) bfy0Var.d);
            }
            if (i == 3) {
                return new h3b0((int) bfy0Var.d);
            }
            if (i == 4) {
                return new i3b0(bfy0Var.d);
            }
            bhn0.B(bfy0Var.c, "Cannot read value of unsigned type: ");
            return null;
        }
        switch (afy0Var != null ? vb01.a[afy0Var.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                eg.o();
                return null;
            case 1:
                return new v2b0((byte) bfy0Var.d);
            case 2:
                return new e3b0((short) bfy0Var.d);
            case 3:
                return new a3b0((int) bfy0Var.d);
            case 4:
                return new d3b0(bfy0Var.d);
            case 5:
                return new w2b0((char) bfy0Var.d);
            case 6:
                return new z2b0(bfy0Var.e);
            case 7:
                return new x2b0(bfy0Var.f);
            case 8:
                return new u2b0(bfy0Var.d != 0);
            case 9:
                return new f3b0(zjn0Var.getString(bfy0Var.g));
            case 10:
                String strL = l(zjn0Var, bfy0Var.h);
                int i2 = bfy0Var.Y;
                return i2 == 0 ? new b3b0(strL) : new s2b0(strL, i2);
            case 11:
                return new y2b0(l(zjn0Var, bfy0Var.h), zjn0Var.getString(bfy0Var.i));
            case 12:
                return new r2b0(o(bfy0Var.t, zjn0Var));
            case 13:
                List<bfy0> list = bfy0Var.X;
                ArrayList arrayList = new ArrayList();
                for (bfy0 bfy0Var2 : list) {
                    bfy0Var2.getClass();
                    k3b0 k3b0VarP = p(bfy0Var2, zjn0Var);
                    if (k3b0VarP != null) {
                        arrayList.add(k3b0VarP);
                    }
                }
                return new t2b0(arrayList);
        }
    }

    public static final Object q(wdn0 wdn0Var) {
        if (wdn0Var.i()) {
            bhn0.t("List is empty.");
            return null;
        }
        int i = wdn0Var.b - 1;
        Object objG = wdn0Var.g(i);
        wdn0Var.l(i);
        return objG;
    }

    public static final void r(Object[] objArr, Function0 function0) {
        t(objArr, function0, ec61.R0);
    }

    public static final void s(Object[] objArr, Function0 function0) {
        t(objArr, function0, ec61.S0);
    }

    public static final void t(Object[] objArr, Function0 function0, iu30 iu30Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if ((obj instanceof String) && ((String) obj).length() <= 0) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        if (((Boolean) iu30Var.invoke(Integer.valueOf(arrayList.size()))).booleanValue()) {
            return;
        }
        hhg1.f(function0.invoke());
    }

    public static final wdn0 u(wdn0 wdn0Var, waq0 waq0Var) {
        if (wdn0Var.b > 1) {
            Comparable comparable = (Comparable) waq0Var.invoke(wdn0Var.g(0));
            int i = wdn0Var.b;
            int i2 = 1;
            while (i2 < i) {
                Comparable comparable2 = (Comparable) waq0Var.invoke(wdn0Var.g(i2));
                if (comparable.compareTo(comparable2) > 0) {
                    wdn0 wdn0Var2 = new wdn0(wdn0Var.b);
                    Object[] objArr = wdn0Var.a;
                    int i3 = wdn0Var.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        wdn0Var2.b(objArr[i4]);
                    }
                    udn0 udn0Var = wdn0Var2.c;
                    if (udn0Var == null) {
                        udn0Var = new udn0(wdn0Var2);
                        wdn0Var2.c = udn0Var;
                    }
                    if (udn0Var.a.b > 1) {
                        r7h.f0(udn0Var, new xvd(waq0Var, (byte) 14));
                    }
                    return wdn0Var2;
                }
                i2++;
                comparable = comparable2;
            }
        }
        return wdn0Var;
    }

    public static final sge0 v(wgf wgfVar) {
        oge0 qge0Var;
        Uri uri;
        fhf fhfVar = wgfVar.a.a;
        String string = null;
        if (fhfVar instanceof ehf) {
            ehf ehfVar = (ehf) fhfVar;
            String str = String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(ehfVar.b)}, 1));
            Integer num = ehfVar.c;
            qge0Var = new oge0(str, num != null ? String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(num.intValue())}, 1)) : null);
        } else if (fhfVar instanceof fhf) {
            qge0Var = new pge0(fhfVar.b.toString());
        } else {
            if (!(fhfVar instanceof ghf)) {
                eg.o();
                return null;
            }
            qge0Var = new qge0(((ghf) fhfVar).b.toString());
        }
        String str2 = wgfVar.a.b.a;
        List listQ0 = ihc1.Q0(str2, new String[]{":"}, 0, 6);
        if (listQ0.size() != 2) {
            hhg1.f("Invalid aspect ratio format: ".concat(str2));
            return null;
        }
        Float fB0 = nhc1.b0((String) listQ0.get(0));
        if (fB0 == null) {
            hhg1.f(gvg.g(listQ0.get(0), "Invalid aspect ratio width: "));
            return null;
        }
        float fFloatValue = fB0.floatValue();
        Float fB1 = nhc1.b0((String) listQ0.get(1));
        if (fB1 == null) {
            hhg1.f(gvg.g(listQ0.get(1), "Invalid aspect ratio height: "));
            return null;
        }
        float fFloatValue2 = fB1.floatValue();
        if (fFloatValue2 == 0.0f) {
            hhg1.n("Aspect ratio height cannot be zero");
            return null;
        }
        float f = fFloatValue / fFloatValue2;
        fhf fhfVar2 = wgfVar.b;
        if (fhfVar2 != null && (uri = fhfVar2.b) != null) {
            string = uri.toString();
        }
        return new sge0(qge0Var, f, string, wgfVar.c.a.b());
    }

    public static final qz61 w(n3o1 n3o1Var, z771 z771Var, String str) {
        vsd xsdVar;
        vx9 xx9Var;
        if (!(n3o1Var instanceof ssd)) {
            if (n3o1Var instanceof tsd) {
                Set set = s4b1.f;
                return new qz61(z771Var, uic.x(str), ysd.a);
            }
            if (n3o1Var instanceof rsd) {
                return null;
            }
            eg.o();
            return null;
        }
        Set set2 = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        vj61 vj61Var = ((ssd) n3o1Var).c;
        if (vj61Var instanceof vj61) {
            vj61 vj61Var2 = vj61Var;
            qj61 qj61Var = vj61Var2.b;
            rj61 rj61Var = qj61Var.a;
            if (rj61Var instanceof rj61) {
                rj61 rj61Var2 = rj61Var;
                xx9Var = new vx9(rj61Var2.d, rj61Var2.e);
            } else if (rj61Var instanceof sj61) {
                xx9Var = new wx9(((sj61) rj61Var).d.a.toString());
            } else {
                if (!(rj61Var instanceof tj61)) {
                    eg.o();
                    return null;
                }
                xx9Var = new xx9(((tj61) rj61Var).d.toString());
            }
            ox9 ox9Var = new ox9(xx9Var, qj61Var.b);
            uj61 uj61Var = vj61Var2.c;
            xsdVar = new vsd(new mz9(ox9Var, uj61Var != null ? new wx9(uj61Var.a.toString()) : null));
        } else if (vj61Var instanceof amz0) {
            xsdVar = new wsd((amz0) vj61Var);
        } else {
            if (!(vj61Var instanceof zve1)) {
                eg.o();
                return null;
            }
            xsdVar = new xsd((zve1) vj61Var);
        }
        return new qz61(z771Var, s4b1VarX, xsdVar);
    }
}
