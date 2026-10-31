package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class sio1 {
    public static final acn1 a = new acn1("StdlibClassFinder", (byte) 7);
    public static b180 b;

    public static final long A(int i, long j) {
        return (j & 1152921500311879680L) | ((long) i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object B(p.i8d1 r12, p.b4e1 r13, p.bav0 r14, p.faa r15) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sio1.B(p.i8d1, p.b4e1, p.bav0, p.faa):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C(p.i8d1 r11, p.b4e1 r12, p.bav0 r13, int r14, p.faa r15) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sio1.C(p.i8d1, p.b4e1, p.bav0, int, p.faa):java.lang.Object");
    }

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        gbx gbxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-213302563);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131953506);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("category_dropdown_title", qim0Var3);
            vzq0.a.getClass();
            tzq0 tzq0Var = uzq0.b;
            if (function0 == null) {
                x340Var.i0(2055290297);
                x340Var.r(false);
                gbxVar = null;
            } else {
                x340Var.i0(2055290298);
                boolean zG = x340Var.g(function0);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new pj8(function0, (byte) 21);
                    x340Var.s0(objT);
                }
                Function0 function1 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    gbx gbxVar2 = new gbx(new y50(strO0), function1);
                    x340Var.r(false);
                    gbxVar = gbxVar2;
                }
            }
            cwl1.b(qim0VarN, (tl3) null, d4o1.a, (pgx) null, tzq0Var, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-288262522, new t1(str, function0, b2), x340Var), x340Var, 0, 48, 1514);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var2, i, (byte) 6);
        }
    }

    public static final void b(i2n i2nVar, res resVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Function0 function0;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(548552849);
        j06 j06Var = x340Var.a;
        int i2 = (i & 6) == 0 ? i | (x340Var.i(i2nVar) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(resVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            boolean zI = x340Var.i(i2nVar);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new v7l(i2nVar, (byte) 24);
                x340Var.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0VarB, false, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar2);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0Var3, 16.0f, 6.0f, 16.0f, 6.0f);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = zxm.Y0;
                x340Var.s0(objT2);
            }
            Function0 function2 = function1;
            boolean z2 = true;
            uwo1.e(i2nVar.a, s161.b(qim0VarA, false, (iu30) objT2), cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            x340Var = x340Var;
            ArrayList arrayList = i2nVar.b;
            x340Var.i0(-209620116);
            int i4 = 0;
            for (Object obj : arrayList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                g2n g2nVar = (g2n) obj;
                boolean z3 = i4 == arrayList.size() + (-1) ? z2 : false;
                boolean zE = x340Var.e(i4);
                Object objT3 = x340Var.T();
                if (zE || objT3 == m4cVar) {
                    objT3 = new uv4(i4, (byte) 13);
                    x340Var.s0(objT3);
                }
                qim0 qim0VarB3 = s161.b(qim0Var3, false, (iu30) objT3);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB3);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    function0 = function2;
                    x340Var.l(function0);
                } else {
                    function0 = function2;
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar2);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                function2 = function0;
                otw.c(resVar, g2nVar, (qim0) null, (ipb1) null, x340Var, (i3 >> 3) & 14, 12);
                x340Var.r(z2);
                if (z3) {
                    x340Var.i0(-773923362);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-774164573);
                    qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar6 = cbx.b(x340Var).b;
                    cvx cvxVar7 = cbx.b(x340Var).b;
                    rqo1.g(0, 0, x340Var, uyn1.B(qim0VarF2, 16.0f, 0.0f, 16.0f, 0.0f, 10));
                    x340Var.r(false);
                }
                i4 = i5;
                z2 = true;
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(i2nVar, resVar, qim0Var2, i, (byte) 20);
        }
    }

    public static final void c(String str, long j, yux yuxVar, b0k b0kVar, int i) {
        int i2;
        h311 h311VarV;
        lj6 lj6Var;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1605176500);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.g(yuxVar) ? 256 : 128;
        }
        int i3 = i2;
        if (b0kVar2.Y(i3 & 1, (i3 & 147) != 146)) {
            if (str.length() == 0) {
                h311VarV = b0kVar2.v();
                if (h311VarV == null) {
                    return;
                } else {
                    lj6Var = new lj6(str, j, yuxVar, i, (byte) 0);
                }
            } else {
                float fB = yuxVar.b(109.0f);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = vi6.e(j, u291.h(u291.x(0.0f, fB, 1, nim0Var), yuxVar.c(5.0f)));
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarE);
                hzj.A.getClass();
                if (((x340) b0kVar2).a == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(hmb0.t1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, y580.Y);
                lee1 lee1VarA = lee1.a(vi6.g(yuxVar, 4.0f, 4.0f, 0.0f, 0.0f, b0kVar2, 24), 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 4, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679);
                long j2 = u7h.f;
                cjc0 cjc0Var = new cjc0(1);
                uwr uwrVar = cbx.a;
                yfu yfuVar = ajx.a;
                Object obj = yfuVar.b;
                FontWeight fontWeight = (FontWeight) ((bjx) yfuVar.c).e;
                qim0 qim0VarZ = uyn1.z(yuxVar.b(2.0f), 0.0f, 2, nim0Var);
                boolean z = (i3 & 896) == 256;
                Object objT = b0kVar2.T();
                if (z || objT == fkj0.X) {
                    objT = new ub3(yuxVar, (byte) 14);
                    b0kVar2.s0(objT);
                }
                b0kVar2 = b0kVar2;
                gxo1.c(str, j9k1.x(qim0VarZ, (xu30) objT), lee1VarA, j2, new a0e1(3), 2, false, cjc0Var, null, 150.0f, fontWeight, null, b0kVar2, 199680 | (i3 & 14), 0, 2368);
                b0kVar2.r(true);
            }
            h311VarV.d = lj6Var;
        }
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            lj6Var = new lj6(str, j, yuxVar, i, (byte) 1);
            h311VarV.d = lj6Var;
        }
    }

    public static final void d(dj6 dj6Var, long j, yux yuxVar, float f, b0k b0kVar, int i) {
        int i2;
        yux yuxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1856541222);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(dj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(yuxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(f) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            String str = dj6Var.a;
            lee1 lee1VarG = vi6.g(yuxVar, 7.0f, 8.0f, -0.3f, vi6.d, x340Var, 0);
            yuxVar2 = yuxVar;
            uwr uwrVar = cbx.a;
            Object obj = ajx.a.b;
            vi6.c(str, lee1VarG, j, u291.v(nim0.a, yuxVar.b(f)), 2, 150.0f, new p3v(yuxVar2.c(8.0f)), x340Var, ((i3 << 3) & 896) | 24576, 0);
        } else {
            yuxVar2 = yuxVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mj6(dj6Var, j, yuxVar2, f, i, (byte) 0);
        }
    }

    public static final void e(dj6 dj6Var, long j, yux yuxVar, float f, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-211454797);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(dj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(yuxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(f) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            String str = dj6Var.b;
            lee1 lee1VarG = vi6.g(yuxVar, 22.0f, 22.0f, -0.3f, vi6.d, x340Var, 0);
            uwr uwrVar = cbx.a;
            Object obj = ajx.a.b;
            vi6.c(str, lee1VarG, j, u291.h(u291.v(eqr0.D(0.0f, yuxVar.c(2.0f), 1, nim0.a), yuxVar.b(f)), yuxVar.c(26.0f)), 0, 50.0f, null, x340Var, (i3 << 3) & 896, 80);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mj6(dj6Var, j, yuxVar, f, i, (byte) 1);
        }
    }

    public static final void f(dj6 dj6Var, dj6 dj6Var2, long j, yux yuxVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        dj6 dj6Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1922313676);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(dj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(dj6Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(yuxVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarV = u291.v(eqr0.C(qim0Var, yuxVar.b(12.0f), yuxVar.c(283.0f)), yuxVar.b(199.0f));
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            fra fraVar = een.Z;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 0);
            int i3 = i2;
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            int i4 = i3 >> 3;
            int i5 = i4 & 112;
            int i6 = i4 & 896;
            int i7 = (i3 & 14) | 3072 | i5 | i6;
            d(dj6Var, j, yuxVar, 70.0f, x340Var, i7);
            op71.g(x340Var, u291.v(nim0Var, yuxVar.b(9.0f)));
            int i8 = (i4 & 14) | 3072 | i5 | i6;
            d(dj6Var2, j, yuxVar, 109.0f, x340Var, i8);
            x340Var.r(true);
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            qim0 qim0VarV2 = u291.v(nim0Var, yuxVar.b(79.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarV2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            e(dj6Var, j, yuxVar, 70.0f, x340Var, i7);
            x340Var.r(true);
            qim0 qim0VarV3 = u291.v(nim0Var, yuxVar.b(120.0f));
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarV3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM5, x340Var, lljVar2);
            x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar4);
            e(dj6Var2, j, yuxVar, 120.0f, x340Var, i8);
            dj6Var3 = dj6Var2;
            c(dj6Var3.d, j, yuxVar, x340Var, i4 & 1008);
            x340Var = x340Var;
            us71.m(x340Var, true, true, true);
        } else {
            dj6Var3 = dj6Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si6(dj6Var, dj6Var3, j, yuxVar, qim0Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0574  */
    /* JADX WARN: Code duplicated, block: B:162:0x0584  */
    /* JADX WARN: Code duplicated, block: B:163:0x0588  */
    /* JADX WARN: Code duplicated, block: B:165:0x058c  */
    /* JADX WARN: Code duplicated, block: B:170:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:173:0x05ef  */
    public static final void g(drq0 drq0Var, iu30 iu30Var, es41 es41Var, cgq cgqVar, u911 u911Var, iu30 iu30Var2, qim0 qim0Var, vzq0 vzq0Var, b0k b0kVar, int i) {
        u911 u911Var2;
        x340 x340Var;
        int i2;
        qim0 qim0VarZ;
        x340 x340Var2;
        boolean z;
        String strK;
        qim0 qim0Var2;
        int i3;
        int i4;
        int i5;
        y811 y811Var;
        String str;
        boolean zG;
        Object objT;
        cgq cgqVar2 = cgqVar;
        iu30 iu30Var3 = iu30Var2;
        m4c m4cVar = fkj0.X;
        boolean z2 = drq0Var.g;
        boolean z3 = drq0Var.f;
        kyh1 kyh1Var = drq0Var.d;
        String str2 = kyh1Var.b;
        y811 y811Var2 = drq0Var.k;
        jja jjaVar = drq0Var.b;
        List list = jjaVar.c;
        p60 p60Var = jjaVar.d;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-1580257144);
        int i6 = (i & 6) == 0 ? i | ((i & 8) == 0 ? x340Var3.g(drq0Var) : x340Var3.i(drq0Var) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i6 |= x340Var3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= x340Var3.i(es41Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= x340Var3.i(cgqVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= x340Var3.i(u911Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= x340Var3.i(iu30Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i6 |= x340Var3.i(qim0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i6 |= x340Var3.i(vzq0Var) ? 8388608 : 4194304;
        }
        if (x340Var3.Y(i6 & 1, (i6 & 4793491) != 4793490)) {
            x340Var3.d0();
            if ((i & 1) != 0 && !x340Var3.E()) {
                x340Var3.b0();
            }
            x340Var3.s();
            Object objT2 = x340Var3.T();
            if (objT2 == m4cVar) {
                objT2 = new jct0(iu30Var);
                x340Var3.s0(objT2);
            }
            jct0 jct0Var = (jct0) objT2;
            Object objT3 = x340Var3.T();
            if (objT3 == m4cVar) {
                objT3 = new ueb0(iu30Var);
                x340Var3.s0(objT3);
            }
            ueb0 ueb0Var = (ueb0) objT3;
            Object objT4 = x340Var3.T();
            if (objT4 == m4cVar) {
                objT4 = new uf91(iu30Var);
                x340Var3.s0(objT4);
            }
            uf91 uf91Var = (uf91) objT4;
            Object objT5 = x340Var3.T();
            if (objT5 == m4cVar) {
                objT5 = new o98(iu30Var);
                x340Var3.s0(objT5);
            }
            o98 o98Var = (o98) objT5;
            Object objT6 = x340Var3.T();
            if (objT6 == m4cVar) {
                objT6 = new kkl(iu30Var);
                x340Var3.s0(objT6);
            }
            kkl kklVar = (kkl) objT6;
            Object objT7 = x340Var3.T();
            if (objT7 == m4cVar) {
                objT7 = new wnc1(iu30Var);
                x340Var3.s0(objT7);
            }
            wnc1 wnc1Var = (wnc1) objT7;
            Object objT8 = x340Var3.T();
            if (objT8 == m4cVar) {
                objT8 = new aka(iu30Var);
                x340Var3.s0(objT8);
            }
            aka akaVar = (aka) objT8;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            if (drq0Var.e) {
                qim0VarZ = uyn1.z(16.0f, 0.0f, 2, d1u.E(1.0f, u7h.g, uyn1.w(l6o1.H(qim0Var, es41Var, false, 14), vzq0Var), d4o1.a));
                i2 = 0;
            } else {
                i2 = 0;
                qim0VarZ = uyn1.z(16.0f, 0.0f, 2, uyn1.w(l6o1.H(qim0Var, es41Var, false, 14), vzq0Var));
            }
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var3, i2);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarZ);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            boolean z4 = y811Var2 instanceof x811;
            qim0 qim0Var3 = nim0.a;
            if (z4) {
                x340Var3.i0(923397285);
                String strO0 = cwl1.o0(x340Var3, 2131964212);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var3).c;
                long j = cbx.a(x340Var3).b.a;
                Object objT9 = x340Var3.T();
                if (objT9 == m4cVar) {
                    objT9 = zib0.S0;
                    x340Var3.s0(objT9);
                }
                uwo1.e(strO0, u291.f(s161.b(qim0Var3, false, (iu30) objT9), 1.0f), lee1Var, j, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2032);
                x340Var2 = x340Var3;
                z = false;
                x340Var2.r(false);
            } else {
                x340Var2 = x340Var3;
                z = false;
                x340Var2.i0(923629072);
                x340Var2.r(false);
            }
            e7t0 e7t0Var = drq0Var.a;
            String str3 = e7t0Var.a;
            boolean z5 = e7t0Var.b;
            if (z5) {
                strK = x0d.k(x340Var2, 418233408, 2131964211, x340Var2, z);
            } else {
                x340Var2.i0(80390707);
                x340Var2.r(z);
                strK = "";
            }
            String str4 = z5 ? "spotify-logo" : "";
            String str5 = e7t0Var.d;
            String str6 = e7t0Var.c;
            List<iji0> list2 = e7t0Var.e;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (iji0 iji0Var : list2) {
                arrayList.add(new nni0(iji0Var.a, iji0Var.b));
                x340Var2 = x340Var2;
                str5 = str5;
            }
            x340 x340Var4 = x340Var2;
            String str7 = str5;
            otw.c(wnc1Var, new coc1(str3, "#FFFFFF", "#363636", str6, str7, "", arrayList, e7t0Var.f, e7t0Var.g, 1, "", "#FFFFFF", "#000000", str4, str7, strK, "#FFFFFF", ""), (qim0) null, (ipb1) null, x340Var4, 0, 12);
            x340Var = x340Var4;
            if (!drq0Var.h || str2.length() <= 0) {
                x340Var.i0(923964368);
                x340Var.r(false);
            } else {
                x340Var.i0(923822140);
                kyh1 kyh1VarA = kyh1.a(kyh1Var, 1);
                otw.c(jct0Var, new kct0(kyh1VarA.a, kyh1VarA.b, kyh1VarA.c, kyh1VarA.d, kyh1VarA.g, kyh1VarA.e, kyh1VarA.f), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            }
            if (z3 || z2) {
                qim0Var2 = qim0Var3;
                x340Var.i0(924334384);
                x340Var.r(false);
            } else {
                x340Var.i0(924106441);
                String strO1 = cwl1.o0(x340Var, 2131964205);
                uwr uwrVar2 = cbx.a;
                qim0Var2 = qim0Var3;
                uwo1.e(strO1, uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                x340Var.r(false);
            }
            otw.c(o98Var, drq0Var.c, (qim0) null, (ipb1) null, x340Var, 64, 12);
            x340Var.i0(-108725993);
            int i7 = 0;
            for (Object obj : drq0Var.j) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    p7h.T();
                    throw null;
                }
                otw.c(kklVar, new ikl(i7, (p60) obj), (qim0) null, (ipb1) null, x340Var, 64, 12);
                i7 = i8;
            }
            x340Var.r(false);
            if (z3) {
                x340Var.i0(924676376);
                String strO2 = cwl1.o0(x340Var, 2131964204);
                String strO3 = cwl1.o0(x340Var, 2131964203);
                String strO4 = cwl1.o0(x340Var, 2131964202);
                String str8 = p60Var.e;
                List listM = list;
                if (listM.isEmpty()) {
                    listM = p7h.M(new String[]{"offline", "group-session", "queue"});
                }
                i3 = 0;
                otw.c(ueb0Var, new kka(strO2, strO3, strO4, str8, listM), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            } else {
                i3 = 0;
                if (z2) {
                    x340Var.i0(924878744);
                    String strO5 = cwl1.o0(x340Var, 2131964204);
                    String strO6 = cwl1.o0(x340Var, 2131964203);
                    String strO7 = cwl1.o0(x340Var, 2131964202);
                    String str9 = p60Var.e;
                    List listM2 = list;
                    if (listM2.isEmpty()) {
                        listM2 = p7h.M(new String[]{"offline", "queue"});
                    }
                    otw.c(uf91Var, new kka(strO5, strO6, strO7, str9, listM2), (qim0) null, (ipb1) null, x340Var, 0, 12);
                    x340Var.r(false);
                } else {
                    x340Var.i0(925034085);
                    otw.c(akaVar, new dka(jjaVar.b, p60Var, 4), (qim0) null, (ipb1) null, x340Var, 0, 12);
                    i4 = 0;
                    x340Var.r(false);
                }
                if (drq0Var.i || str2.length() <= 0) {
                    i5 = i4;
                    x340Var.i0(925606128);
                    x340Var.r(false);
                } else {
                    x340Var.i0(925236143);
                    String strO8 = cwl1.o0(x340Var, 2131964213);
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(strO8, uyn1.B(qim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                    kyh1 kyh1VarA2 = kyh1.a(kyh1Var, 2);
                    i5 = i4;
                    otw.c(jct0Var, new kct0(kyh1VarA2.a, kyh1VarA2.b, kyh1VarA2.c, kyh1VarA2.d, kyh1VarA2.g, kyh1VarA2.e, kyh1VarA2.f), (qim0) null, (ipb1) null, x340Var, i5, 12);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                if (y811Var2 instanceof y811) {
                    y811Var = y811Var2;
                } else {
                    y811Var = null;
                }
                if (y811Var != null) {
                    str = y811Var.d;
                    x340Var.i0(925754246);
                    zG = x340Var.g(str);
                    objT = x340Var.T();
                    if (!zG || objT == m4cVar) {
                        iu30Var3 = iu30Var2;
                        cgqVar2 = cgqVar;
                        u911Var2 = u911Var;
                        objT = new vzm1(str, u911Var2, new x390(iu30Var3, y811Var, (byte) 19), (k911) cgqVar2.a.c.a.ke.get());
                        x340Var.s0(objT);
                    } else {
                        cgqVar2 = cgqVar;
                        u911Var2 = u911Var;
                        iu30Var3 = iu30Var2;
                    }
                    otw.c((vzm1) objT, new uzm1(y811Var.a, y811Var.b, y811Var.c), (qim0) null, (ipb1) null, x340Var, i5, 12);
                    x340Var.r(false);
                } else {
                    cgqVar2 = cgqVar;
                    u911Var2 = u911Var;
                    iu30Var3 = iu30Var2;
                    x340Var.i0(926378896);
                    x340Var.r(false);
                }
                x340Var.r(true);
            }
            i4 = i3;
            if (drq0Var.i) {
                i5 = i4;
                x340Var.i0(925606128);
                x340Var.r(false);
            } else {
                i5 = i4;
                x340Var.i0(925606128);
                x340Var.r(false);
            }
            if (y811Var2 instanceof y811) {
                y811Var = y811Var2;
            } else {
                y811Var = null;
            }
            if (y811Var != null) {
                str = y811Var.d;
                x340Var.i0(925754246);
                zG = x340Var.g(str);
                objT = x340Var.T();
                if (zG) {
                    iu30Var3 = iu30Var2;
                    cgqVar2 = cgqVar;
                    u911Var2 = u911Var;
                    objT = new vzm1(str, u911Var2, new x390(iu30Var3, y811Var, (byte) 19), (k911) cgqVar2.a.c.a.ke.get());
                    x340Var.s0(objT);
                } else {
                    iu30Var3 = iu30Var2;
                    cgqVar2 = cgqVar;
                    u911Var2 = u911Var;
                    objT = new vzm1(str, u911Var2, new x390(iu30Var3, y811Var, (byte) 19), (k911) cgqVar2.a.c.a.ke.get());
                    x340Var.s0(objT);
                }
                otw.c((vzm1) objT, new uzm1(y811Var.a, y811Var.b, y811Var.c), (qim0) null, (ipb1) null, x340Var, i5, 12);
                x340Var.r(false);
            } else {
                cgqVar2 = cgqVar;
                u911Var2 = u911Var;
                iu30Var3 = iu30Var2;
                x340Var.i0(926378896);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            u911Var2 = u911Var;
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f1c(drq0Var, iu30Var, es41Var, cgqVar2, u911Var2, iu30Var3, qim0Var, vzq0Var, i);
        }
    }

    public static final void h(b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(920418517);
        if (b0kVar3.Y(i & 1, i != 0)) {
            b0kVar2 = b0kVar3;
            jto1.b(null, new uvx((pgx) null, 3, (tvx) null, (p3v) null, 26), null, false, null, null, null, null, null, nni.a, null, nni.b, null, null, null, nni.c, b0kVar2, 805306432, 196656, 30205);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new htu(i, (byte) 17);
        }
    }

    public static final void i(String str, String str2, ppl pplVar, boolean z, wmh0 wmh0Var, w4i1 w4i1Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-116360574);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(pplVar) : b0kVar3.i(pplVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(wmh0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? b0kVar3.g(w4i1Var) : b0kVar3.i(w4i1Var) ? 131072 : 65536;
        }
        int i3 = 1572864 & i;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= b0kVar3.i(nim0Var) ? 1048576 : 524288;
        }
        int i4 = i2;
        if (b0kVar3.Y(i4 & 1, (599187 & i4) != 599186)) {
            b0kVar2 = b0kVar3;
            otw.c(wmh0Var, new pmh0(str, str2, pplVar, z, w4i1Var), nim0Var, (ipb1) null, b0kVar2, (i4 >> 12) & 910, 8);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(str, str2, pplVar, z, wmh0Var, w4i1Var, i);
        }
    }

    public static final void j(int i, String str, Function0 function0, Function0 function1, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(987235657);
        byte b2 = 2;
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | 48 | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(function1) ? 2048 : 1024);
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            j2i j2iVarR = apo.r(-1035207639, new psr0(str, b2), x340Var2);
            j2i j2iVarR2 = apo.r(-1908873241, new ztr0(function0, ven0Var, (byte) 0), x340Var2);
            qim0 qim0Var3 = nim0.a;
            x340Var = x340Var2;
            bzn1.e(qim0Var3, j2iVarR, false, j2iVarR2, rgr0.a, null, null, null, x340Var, 3126, 228);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(-1197365159);
                boolean z = (i2 & 7168) == 2048;
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new isr0(function1, (byte) 1);
                    x340Var.s0(objT2);
                }
                Function0 function2 = (Function0) objT2;
                boolean zI = x340Var.i(ven0Var);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new q2j0(ven0Var, (byte) 21);
                    x340Var.s0(objT3);
                }
                wgo1.i(function2, (Function0) objT3, null, null, null, null, x340Var, 0, 60);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-1197242151);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new aur0(str, qim0Var2, function0, function1, i);
        }
    }

    public static final void k(String str, String str2, iu30 iu30Var, Function0 function0, boolean z, boolean z2, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(558576366);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024) | (b0kVar3.h(z) ? 16384 : 8192) | (b0kVar3.h(z2) ? 131072 : 65536);
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            String strO0 = cwl1.o0(b0kVar3, 2131960746);
            String strO1 = cwl1.o0(b0kVar3, 2131960749);
            Object objT = b0kVar3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new y7e1(str, 2);
                b0kVar3.s0(objT);
            }
            y7e1 y7e1Var = (y7e1) objT;
            boolean z3 = (ihc1.y0(y7e1Var.d().d) || z) ? false : true;
            String strO2 = cwl1.o0(b0kVar3, 2131960750);
            Object objT2 = b0kVar3.T();
            if (objT2 == obj) {
                objT2 = pzm.i(b0kVar3);
            }
            lz20 lz20Var = (lz20) objT2;
            k6a1 k6a1Var = (k6a1) b0kVar3.k(t4k.q);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zI = ((i2 & 458752) == 131072) | b0kVar3.i(lz20Var) | b0kVar3.i(k6a1Var);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == obj) {
                objT3 = new j43(z2, lz20Var, k6a1Var, (lnm) null);
                b0kVar3.s0(objT3);
            }
            qxd0.t(boolValueOf, b0kVar3, (vu30) objT3);
            boolean zI2 = ((i2 & 14) == 4) | b0kVar3.i(y7e1Var);
            Object objT4 = b0kVar3.T();
            if (zI2 || objT4 == obj) {
                objT4 = new woe(str, y7e1Var, null, (byte) 4);
                b0kVar3.s0(objT4);
            }
            qxd0.t(str, b0kVar3, (vu30) objT4);
            boolean zI3 = b0kVar3.i(y7e1Var) | ((i2 & 896) == 256);
            Object objT5 = b0kVar3.T();
            if (zI3 || objT5 == obj) {
                objT5 = new qy5(iu30Var, y7e1Var, (lnm) null, (byte) 10);
                b0kVar3.s0(objT5);
            }
            qxd0.t(y7e1Var, b0kVar3, (vu30) objT5);
            hax haxVar = z ? new hax(strO2) : jax.a;
            kua0 kua0Var = new kua0(0, (Boolean) null, 0, 4, 119);
            boolean zH = b0kVar3.h(z3) | ((i2 & 7168) == 2048);
            Object objT6 = b0kVar3.T();
            if (zH || objT6 == obj) {
                objT6 = new p4z0(function0, z3);
                b0kVar3.s0(objT6);
            }
            yta0 yta0Var = (yta0) objT6;
            qim0 qim0VarY = voo1.y(u291.f(vby0.p(nim0.a, lz20Var), 1.0f), voo1.f);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cua cuaVar2 = cbx.b(b0kVar3).f;
            qim0 qim0VarY2 = voo1.y(dug.f(i1p1.q(qim0VarY, er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12)), cbx.a(b0kVar3).a.b.a(), d4o1.a), voo1.g);
            float f = cbx.b(b0kVar3).b.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            qim0 qim0VarA = uyn1.A(qim0VarY2, f, 12.0f, 16.0f, 12.0f);
            boolean zG = b0kVar3.g(strO1);
            Object objT7 = b0kVar3.T();
            if (zG || objT7 == obj) {
                objT7 = new zqu0(strO1, (byte) 29);
                b0kVar3.s0(objT7);
            }
            b0kVar2 = b0kVar3;
            pwo1.a(y7e1Var, anm1.N("questionnaire-user-input", s161.b(qim0VarA, false, (iu30) objT7)), haxVar, str2, null, null, apo.r(988365834, new rdg0(strO0, function0, z, strO2, z3), b0kVar3), kua0Var, yta0Var, null, d6e1.b, null, false, null, b0kVar2, ((i2 << 6) & 7168) | 1572864, 0, 14896);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new erc(str, str2, iu30Var, function0, z, z2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public static final void l(p3v p3vVar, float f, float f2, b0k b0kVar, int i, int i2) {
        float f3;
        int i3;
        boolean z;
        float f4;
        h311 h311VarV;
        float f5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1877913419);
        int i4 = i | (x340Var.g(p3vVar) ? 4 : 2) | (x340Var.d(f) ? 32 : 16);
        if ((i2 & 4) == 0) {
            f3 = f2;
            int i5 = x340Var.d(f3) ? 256 : 128;
            i3 = i4 | i5;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if ((i2 & 4) != 0) {
                        f5 = 0.0f;
                    }
                    x340Var.s();
                    qim0 qim0VarB = uyn1.B(u291.h(u291.v(nim0.a, p3vVar.a), f), 0.0f, f5, 0.0f, 0.0f, 13);
                    uwr uwrVar = cbx.a;
                    long jA = cbx.a(x340Var).a.b.a();
                    cua cuaVar = cbx.b(x340Var).f;
                    t1c.a(cwl1.l0(dug.f(qim0VarB, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
                    f4 = f5;
                } else {
                    x340Var.b0();
                    int i6 = i2 & 4;
                }
                f5 = f3;
                x340Var.s();
                qim0 qim0VarB2 = uyn1.B(u291.h(u291.v(nim0.a, p3vVar.a), f), 0.0f, f5, 0.0f, 0.0f, 13);
                uwr uwrVar2 = cbx.a;
                long jA2 = cbx.a(x340Var).a.b.a();
                cua cuaVar2 = cbx.b(x340Var).f;
                t1c.a(cwl1.l0(dug.f(qim0VarB2, jA2, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
                f4 = f5;
            } else {
                x340Var.b0();
                f4 = f3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xky(p3vVar, f, f4, i, i2, (byte) 1);
            }
        }
        f3 = f2;
        i3 = i4 | i5;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    f5 = 0.0f;
                } else {
                    f5 = f3;
                }
            } else if ((i2 & 4) != 0) {
                f5 = 0.0f;
            } else {
                f5 = f3;
            }
            x340Var.s();
            qim0 qim0VarB3 = uyn1.B(u291.h(u291.v(nim0.a, p3vVar.a), f), 0.0f, f5, 0.0f, 0.0f, 13);
            uwr uwrVar3 = cbx.a;
            long jA3 = cbx.a(x340Var).a.b.a();
            cua cuaVar3 = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarB3, jA3, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
            f4 = f5;
        } else {
            x340Var.b0();
            f4 = f3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xky(p3vVar, f, f4, i, i2, (byte) 1);
        }
    }

    public static final void m(gj6 gj6Var, aj6 aj6Var, yux yuxVar, y3g1 y3g1Var, b0k b0kVar, int i) {
        aj6 aj6Var2 = aj6Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2102327258);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(gj6Var) ? 4 : 2) | (x340Var.g(aj6Var2) ? 32 : 16) | (x340Var.g(yuxVar) ? 256 : 128) | (x340Var.g(y3g1Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            n(gj6Var.g, gj6Var.h, vi6.f(vi6.h(yuxVar, 16.0f, 16.0f, 166.0f, 166.0f), y3g1Var != null ? y3g1Var.b : null), x340Var, 72);
            yk4 yk4VarJ = vi6.j(gj6Var.l, x340Var);
            long j = yk4VarJ != null ? u7h.f : gj6Var.k;
            z3g1 z3g1Var = gj6Var.f ? vi6.c : vi6.b;
            long j2 = j;
            qim0 qim0VarI = vi6.i(u291.d(nim0Var, 1.0f), yk4VarJ);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarI);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            vi6.a(gj6Var.c, j2, yuxVar, z3g1Var, vi6.f(vi6.h(yuxVar, 12.0f, z3g1Var.e + 184.0f, 187.0f, 88.0f), y3g1Var != null ? y3g1Var.c : null), x340Var, i2 & 896);
            t1c.a(dug.f(vi6.f(vi6.h(yuxVar, 12.0f, 274.0f, 187.0f, 0.5f), y3g1Var != null ? y3g1Var.d : null), j2, d4o1.a), x340Var, 0);
            aj6Var2 = aj6Var;
            f(gj6Var.i, aj6Var2.a, j2, yuxVar, vi6.f(nim0Var, y3g1Var != null ? y3g1Var.d : null), x340Var, (i2 << 3) & 7168);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6(i, (Object) gj6Var, (Object) aj6Var2, (Object) yuxVar, (Object) y3g1Var, (byte) 3);
        }
    }

    public static final void n(yj41 yj41Var, yj41 yj41Var2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1791892995);
        int i2 = i | (x340Var.i(yj41Var) ? 4 : 2) | (x340Var.i(yj41Var2) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
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
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            vi6.b(yj41Var, i1p1.q(h2cVar.b(nim0Var), er31.a), mif1.P0, x340Var, 392 | (i2 & 14), 0);
            vi6.b(yj41Var2, h2cVar.b(nim0Var), null, x340Var, 8 | ((i2 >> 3) & 14), 4);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oj2(yj41Var, yj41Var2, qim0Var, i, (byte) 26);
        }
    }

    public static final void o(zmh1 zmh1Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1677602780);
        int i2 = (x340Var.g(zmh1Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String str = zmh1Var.b;
            String strO0 = cwl1.o0(x340Var, 2131957632);
            long j = zmh1Var.d;
            String strO1 = cwl1.o0(x340Var, 2131957629);
            String str2 = zmh1Var.c;
            if (str2 == null) {
                str2 = "";
            }
            o1p1.o(new xld0(str, str, strO0, j, strO1, str2), function0, null, x340Var, i2 & 112);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xaf1(zmh1Var, function0, i, (byte) 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b A[LOOP:0: B:19:0x004c->B:23:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object p(p.i8d1 r6, p.faa r7) {
        /*
            boolean r0 = r7 instanceof p.ix51
            if (r0 == 0) goto L13
            r0 = r7
            p.ix51 r0 = (p.ix51) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.ix51 r0 = new p.ix51
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            p.i8d1 r6 = r0.a
            p.hm5.M(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L2e:
            p.hm5.M(r7)
        L31:
            r0.a = r6
            r0.c = r2
            p.cav0 r7 = p.cav0.b
            java.lang.Object r7 = r6.a(r7, r0)
            p.d9n r1 = p.d9n.a
            if (r7 != r1) goto L40
            return r1
        L40:
            p.bav0 r7 = (p.bav0) r7
            java.util.List r1 = r7.a
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
        L4c:
            if (r4 >= r3) goto L5e
            java.lang.Object r5 = r1.get(r4)
            p.hav0 r5 = (p.hav0) r5
            boolean r5 = p.p8p1.h(r5)
            if (r5 != 0) goto L5b
            goto L31
        L5b:
            int r4 = r4 + 1
            goto L4c
        L5e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sio1.p(p.i8d1, p.faa):java.lang.Object");
    }

    public static final Object q(nav0 nav0Var, qnm0 qnm0Var, b4e1 b4e1Var, lnm lnmVar) {
        j8d1 j8d1Var = (j8d1) nav0Var;
        j8d1Var.getClass();
        Object objD = s9p1.D(nav0Var, new lhg(new mgc(oap1.B(j8d1Var).b1, (byte) 11), qnm0Var, b4e1Var, (lnm) null, (byte) 5), lnmVar);
        return objD == d9n.a ? objD : rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public static final void r(int i, int i2, h661 h661Var) throws SerializationException {
        if (i > 0) {
            return;
        }
        throw new SerializationException(i + " is not allowed in ProtoNumber for property '" + h661Var.e(i2) + "' of '" + h661Var.h() + "', because protobuf supports field numbers in range 1..2147483647");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public static final long s(h661 h661Var, int i) throws SerializationException {
        List listF = h661Var.f(i);
        int i2 = i + 1;
        int size = listF.size();
        uhy0 uhy0VarType = uhy0.b;
        int iNumber = i2;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            zhy0 zhy0Var = (Annotation) listF.get(i3);
            if (zhy0Var instanceof zhy0) {
                iNumber = zhy0Var.number();
                r(iNumber, i3, h661Var);
            } else if (zhy0Var instanceof iiy0) {
                uhy0VarType = ((iiy0) zhy0Var).type();
            } else if (zhy0Var instanceof biy0) {
                z2 = true;
            } else if (zhy0Var instanceof aiy0) {
                z = true;
            }
        }
        if (!z) {
            i2 = iNumber;
        }
        return ((long) i2) | (z ? 68719476736L : 0L) | (z2 ? 4294967296L : 0L) | uhy0VarType.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public static final int t(h661 h661Var, int i, boolean z) throws SerializationException {
        List listF = h661Var.f(i);
        if (!z) {
            i++;
        }
        int size = listF.size();
        for (int i2 = 0; i2 < size; i2++) {
            zhy0 zhy0Var = (Annotation) listF.get(i2);
            if (zhy0Var instanceof aiy0) {
                return -2;
            }
            if (zhy0Var instanceof zhy0) {
                i = zhy0Var.number();
                if (!z) {
                    r(i, i2, h661Var);
                }
            }
        }
        return i;
    }

    public static final List u(h661 h661Var) {
        z6x z6xVarL1;
        kl1 kl1Var = j761.a;
        yoi1 kind = h661Var.getKind();
        if (u890.j(kind, qcv0.h)) {
            tka0 tka0VarA = ltn1.A(h661Var);
            z6xVarL1 = z6x.a;
            if (tka0VarA != null) {
                Iterable iterable = (Iterable) z6xVarL1;
                z6x arrayList = new ArrayList(q7h.U(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((nma0) it.next()).getDescriptor());
                }
                z6xVarL1 = arrayList;
            }
        } else {
            if (!u890.j(kind, rcv0.h)) {
                mna0.e("Class ", h661Var.h(), " should be abstract or sealed or interface to be used as @ProtoOneOf property.");
                return null;
            }
            z6xVarL1 = o7h.l1(new h46(h661Var.g(1), (byte) 3));
        }
        Iterable<h661> iterable2 = (Iterable) z6xVarL1;
        for (h661 h661Var2 : iterable2) {
            List listF = h661Var2.f(0);
            if (!(listF instanceof Collection) || !listF.isEmpty()) {
                Iterator it2 = listF.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!(((Annotation) it2.next()) instanceof zhy0));
            }
            throw new IllegalArgumentException(h661Var2.h() + " implementing oneOf type " + h661Var.h() + " should have @ProtoNumber annotation in its single property.");
        }
        return (List) iterable2;
    }

    public static final uhy0 v(long j) {
        long j2 = j & 25769803776L;
        if (j2 == 0) {
            return uhy0.b;
        }
        return j2 == 8589934592L ? uhy0.c : uhy0.d;
    }

    public static final boolean w(long j) {
        return (j & 68719476736L) != 0;
    }

    public static final boolean x(h661 h661Var) {
        return !h661Var.isInline() ? !(h661Var.getKind() instanceof mnw0) || u890.j(h661Var.getKind(), knw0.o) : !(h661Var.d() == 1 && x(h661Var.g(0)));
    }

    public static final boolean y(long j) {
        return (j & 4294967296L) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0081 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0079, B:33:0x0081, B:35:0x0090, B:37:0x009c, B:28:0x0060), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0079, B:33:0x0081, B:35:0x0090, B:37:0x009c, B:28:0x0060), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009c A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0079, B:33:0x0081, B:35:0x0090, B:37:0x009c, B:28:0x0060), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0102 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:54:0x00e7, B:56:0x00ef, B:58:0x00f3, B:60:0x0102, B:62:0x010e, B:50:0x00c0), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x010e A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:54:0x00e7, B:56:0x00ef, B:58:0x00f3, B:60:0x0102, B:62:0x010e, B:50:0x00c0), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object z(i8d1 i8d1Var, qnm0 qnm0Var, mgc mgcVar, bav0 bav0Var, faa faaVar) {
        jx51 jx51Var;
        f341 f341Var;
        i8d1 i8d1Var2;
        l811 l811Var;
        List list;
        int size;
        hav0 hav0Var;
        List list2;
        int size2;
        hav0 hav0Var2;
        Object obj = w1x0.X;
        if (faaVar instanceof jx51) {
            jx51Var = (jx51) faaVar;
            int i = jx51Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jx51Var.e = i - Integer.MIN_VALUE;
            } else {
                jx51Var = new jx51(faaVar);
            }
        } else {
            jx51Var = new jx51(faaVar);
        }
        Object objM = jx51Var.d;
        int i2 = jx51Var.e;
        int i3 = 0;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objM);
                    hav0 hav0Var3 = (hav0) bav0Var.a.get(0);
                    int i4 = bav0Var.e & 1;
                    d9n d9nVar = d9n.a;
                    if (i4 == 0) {
                        int i5 = mgcVar.b;
                        if (i5 != 1) {
                            f341Var = i5 != 2 ? w1x0.N0 : w1x0.Z;
                        } else {
                            f341Var = obj;
                        }
                        if (qnm0Var.c(hav0Var3.c, f341Var, i5)) {
                            l811 l811Var2 = new l811();
                            l811Var2.a = !f341Var.equals(obj);
                            long j = hav0Var3.a;
                            pg pgVar = new pg(qnm0Var, f341Var, l811Var2, (byte) 27);
                            jx51Var.a = i8d1Var;
                            jx51Var.b = qnm0Var;
                            jx51Var.c = l811Var2;
                            jx51Var.e = 2;
                            objM = g5v.m(i8d1Var, j, pgVar, jx51Var);
                            if (objM != d9nVar) {
                                i8d1Var2 = i8d1Var;
                                l811Var = l811Var2;
                                if (((Boolean) objM).booleanValue()) {
                                    list2 = i8d1Var2.e.T0.a;
                                    size2 = list2.size();
                                    while (i3 < size2) {
                                        hav0Var2 = (hav0) list2.get(i3);
                                        if (p8p1.j(hav0Var2)) {
                                            hav0Var2.a();
                                        }
                                        i3++;
                                    }
                                }
                                qnm0Var.a();
                            }
                            return d9nVar;
                        }
                    } else if (qnm0Var.h(hav0Var3.c)) {
                        hav0Var3.a();
                        long j2 = hav0Var3.a;
                        waq0 waq0Var = new waq0(qnm0Var, (byte) 15);
                        jx51Var.a = i8d1Var;
                        jx51Var.b = qnm0Var;
                        jx51Var.e = 1;
                        objM = g5v.m(i8d1Var, j2, waq0Var, jx51Var);
                        if (objM == d9nVar) {
                            return d9nVar;
                        }
                        if (((Boolean) objM).booleanValue()) {
                            list = i8d1Var.e.T0.a;
                            size = list.size();
                            while (i3 < size) {
                                hav0Var = (hav0) list.get(i3);
                                if (p8p1.j(hav0Var)) {
                                    hav0Var.a();
                                }
                                i3++;
                            }
                        }
                        qnm0Var.a();
                    }
                } else if (i2 == 1) {
                    qnm0Var = jx51Var.b;
                    i8d1Var = jx51Var.a;
                    hm5.M(objM);
                    if (((Boolean) objM).booleanValue()) {
                        list = i8d1Var.e.T0.a;
                        size = list.size();
                        while (i3 < size) {
                            hav0Var = (hav0) list.get(i3);
                            if (p8p1.j(hav0Var)) {
                                hav0Var.a();
                            }
                            i3++;
                        }
                    }
                    qnm0Var.a();
                } else {
                    if (i2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l811Var = jx51Var.c;
                    qnm0Var = jx51Var.b;
                    i8d1Var2 = jx51Var.a;
                    hm5.M(objM);
                    if (((Boolean) objM).booleanValue() && l811Var.a) {
                        list2 = i8d1Var2.e.T0.a;
                        size2 = list2.size();
                        while (i3 < size2) {
                            hav0Var2 = (hav0) list2.get(i3);
                            if (p8p1.j(hav0Var2)) {
                                hav0Var2.a();
                            }
                            i3++;
                        }
                    }
                    qnm0Var.a();
                }
                return rih1.a;
            } catch (Throwable th) {
                qnm0Var.a();
                throw th;
            }
        } catch (Throwable th2) {
            qnm0Var.a();
            throw th2;
        }
    }
}
