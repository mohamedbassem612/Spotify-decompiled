package p;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.ui.geometry.Offset;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.pam.v2.Action;
import com.spotify.pam.v2.ActionTypeMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class vgo1 {
    public static b180 a;
    public static ThreadPoolExecutor b;

    public static final void a(Uri uri, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(29402589);
        int i2 = (x340Var.g(uri) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            s110.a(uri, qim0Var, x340Var, i2 & 126);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ozw(uri, qim0Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static final void b(ue6 ue6Var, int i, float f, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        x340 x340Var;
        Object xe6Var;
        m4c m4cVar;
        hdn0 hdn0Var;
        hdn0 hdn0Var2;
        hdn0 hdn0Var3;
        ?? r9;
        int i3;
        x340 x340Var2;
        float fFloatValue;
        err0 err0Var;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-68363091);
        int i4 = i2 | (x340Var3.g(ue6Var) ? 4 : 2) | (x340Var3.e(i) ? 32 : 16) | (x340Var3.d(f) ? 256 : 128) | (x340Var3.h(z) ? 2048 : 1024) | (x340Var3.h(z2) ? 16384 : 8192) | (x340Var3.g(qim0Var) ? 131072 : 65536);
        if (x340Var3.Y(i4 & 1, (74899 & i4) != 74898)) {
            Object objT = x340Var3.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = bb00.h(i, x340Var3);
            }
            hdn0 hdn0Var4 = (hdn0) objT;
            Object objT2 = x340Var3.T();
            if (objT2 == m4cVar2) {
                objT2 = bb00.h(i, x340Var3);
            }
            hdn0 hdn0Var5 = (hdn0) objT2;
            Object objT3 = x340Var3.T();
            if (objT3 == m4cVar2) {
                objT3 = bb00.h(0, x340Var3);
            }
            hdn0 hdn0Var6 = (hdn0) objT3;
            Integer numValueOf = Integer.valueOf(i);
            boolean z3 = (i4 & 112) == 32;
            Object objT4 = x340Var3.T();
            if (z3 || objT4 == m4cVar2) {
                m4cVar = m4cVar2;
                hdn0Var = hdn0Var6;
                hdn0Var2 = hdn0Var5;
                hdn0Var3 = hdn0Var4;
                r9 = 0;
                xe6Var = new xe6(i, hdn0Var2, hdn0Var, (lnm) null, (byte) 0);
                x340Var3.s0(xe6Var);
            } else {
                xe6Var = objT4;
                hdn0Var3 = hdn0Var4;
                hdn0Var2 = hdn0Var5;
                hdn0Var = hdn0Var6;
                r9 = 0;
                m4cVar = m4cVar2;
            }
            qxd0.t(numValueOf, x340Var3, (vu30) xe6Var);
            if (z2) {
                err0 err0Var2 = (err0) hdn0Var;
                if (err0Var2.s() > 0) {
                    x340Var3.i0(-789724466);
                    boolean zE = x340Var3.e(err0Var2.s());
                    Object objT5 = x340Var3.T();
                    if (zE || objT5 == m4cVar) {
                        String strC = f4i1.c(err0Var2.s(), "artistCardsTitleOut-");
                        ilv.a.getClass();
                        ceo ceoVar = flv.i;
                        pxg1 pxg1VarO0 = irn1.o0(100, r9, ceoVar, 2);
                        tzg1 tzg1Var = rno1.a;
                        err0Var = err0Var2;
                        i3 = i4;
                        x340Var2 = x340Var3;
                        objT5 = mqo1.s(new hsi1(strC, fValueOf2, fValueOf, pxg1VarO0, tzg1Var), new hsi1(f4i1.c(err0Var.s(), "artistCardsTitleIn-"), fValueOf, fValueOf2, irn1.o0(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, r9, ceoVar, 2), tzg1Var));
                        x340Var2.s0(objT5);
                    } else {
                        err0Var = err0Var2;
                        i3 = i4;
                        x340Var2 = x340Var3;
                    }
                    c9 c9Var = (c9) objT5;
                    String strC2 = f4i1.c(err0Var.s(), "artistCardsTitleCrossfade-");
                    Object objT6 = x340Var2.T();
                    if (objT6 == m4cVar) {
                        objT6 = new af6(hdn0Var2, hdn0Var3, (byte) r9);
                        x340Var2.s0(objT6);
                    }
                    fFloatValue = ((Number) zod.P(c9Var, z, strC2, (Function0) objT6, (Function0) null, x340Var2, 3080 | ((i3 >> 6) & 112), 16).getValue()).floatValue();
                    x340Var2.r((boolean) r9);
                } else {
                    i3 = i4;
                    x340Var2 = x340Var3;
                    m4cVar = m4cVar;
                    x340Var2.i0(-788696475);
                    x340Var2.r((boolean) r9);
                    fFloatValue = 1.0f;
                }
            } else {
                i3 = i4;
                x340Var2 = x340Var3;
                m4cVar = m4cVar;
                x340Var2.i0(-788696475);
                x340Var2.r((boolean) r9);
                fFloatValue = 1.0f;
            }
            int iS = z2 ? ((err0) hdn0Var3).s() : i;
            int size = ue6Var.b.size();
            ?? r2 = (i3 & 896) == 256 ? 1 : r9;
            Object objT7 = x340Var2.T();
            if (r2 != 0 || objT7 == m4cVar) {
                objT7 = new jc5((byte) 1, f);
                x340Var2.s0(objT7);
            }
            qim0Var2 = qim0Var;
            qim0 qim0VarC = i541.C(qim0Var2, (iu30) objT7);
            Object objT8 = x340Var2.T();
            if (objT8 == m4cVar) {
                objT8 = t16.Y0;
                x340Var2.s0(objT8);
            }
            x340Var = x340Var2;
            n(size, iS, apo.r(1800172455, new ub3(ue6Var, (byte) 11), x340Var2), s161.b(qim0VarC, true, (iu30) objT8), apo.r(-1514044059, new ye6(ue6Var, fFloatValue, (byte) r9), x340Var2), x340Var, 24960);
        } else {
            qim0Var2 = qim0Var;
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze6(ue6Var, i, f, z, z2, qim0Var2, i2);
        }
    }

    public static final void c(ue6 ue6Var, int i, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        xb2 xb2Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-980545611);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? x340Var.g(ue6Var) : x340Var.i(ue6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            re6 re6Var = (se6) ue6Var.b.get(i);
            if (re6Var instanceof qe6) {
                xb2Var = ue6Var.a;
            } else {
                if (!(re6Var instanceof re6)) {
                    eg.o();
                    return;
                }
                xb2Var = re6Var.a;
            }
            qgo1.f((vnr0) xb2Var.invoke(x340Var, 0), u291.f(qim0Var, 1.0f), new a0e1(3), 0, false, null, x340Var, 8, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2((Object) ue6Var, i, (Object) qim0Var, i2, (byte) 1);
        }
    }

    public static final void d(String str, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1723802890);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            gfx.g(8, apo.r(434344681, new qgd(str, iu30Var), x340Var), x340Var, 54);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rgd(str, iu30Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void e(String str, c380 c380Var, String str2, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1491836281);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarC = u291.c(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarC, cbx.b(x340Var).b.a, 0.0f, cbx.b(x340Var).b.a, ((p3v) x340Var.k(jw80.c)).a, 2);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarC2 = u291.c(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarC2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            zgo1.i(str2, u291.r(nim0Var, 130.0f), cbx.a(x340Var).b.a, cbx.a(x340Var).a.d, izy0.b, null, dzy0.b, null, null, x340Var, ((i2 >> 6) & 14) | 1794048, 384);
            x340Var.r(true);
            if (2.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarH = l6o1.H(u291.c(new wnb0(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true), 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            lee1 lee1Var = cbx.d(x340Var).d;
            long j = cbx.a(x340Var).b.a;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ucy0.U0;
                x340Var.s0(objT);
            }
            uwo1.e(str, s161.b(nim0Var, false, (iu30) objT), lee1Var, j, new a0e1(5), null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2016);
            zzo1.i(c380Var, null, kk0.p(nim0Var, cbx.b(x340Var).b.b, x340Var, x340Var).g, cbx.a(x340Var).b.a, 5, null, x340Var, (i2 >> 3) & 14, 34);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.a));
            boolean z2 = (i2 & 7168) == 2048;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new lpx0(function0, (byte) 7);
                x340Var.s0(objT2);
            }
            foo1.c(new gbx(z50.c, (Function0) objT2), ldx.c, null, null, yla.r(x340Var).a(), null, null, null, null, null, saj.a, x340Var, 0, 48, 2012);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vyy0(str, c380Var, str2, function0, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x011b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0131  */
    /* JADX WARN: Code duplicated, block: B:71:0x013b  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void f(tl7 tl7Var, xtb0 xtb0Var, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        h311 h311VarV;
        boolean z5;
        float fH;
        int i4;
        boolean z6;
        boolean zI;
        Object objT;
        Function0 function0;
        boolean z7;
        boolean zI2;
        Object objT2;
        Function0 function1;
        boolean zI3;
        Object qjb0Var;
        float f;
        boolean zI4;
        Object objT3;
        xtb0 xtb0Var2 = xtb0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1832496664);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(tl7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(xtb0Var2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= x340Var.h(z2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                if (i5 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                fH = ((wat) x340Var.k(t4k.h)).h();
                i4 = i3 & 896;
                if (i4 == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zI = z6 | x340Var.i(xtb0Var2);
                objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new sjb0(z5, xtb0Var2, (byte) 0);
                    x340Var.s0(objT);
                }
                function0 = (Function0) objT;
                if (i4 == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zI2 = z7 | x340Var.i(xtb0Var2);
                objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new sjb0(z5, xtb0Var2, (byte) 1);
                    x340Var.s0(objT2);
                }
                function1 = (Function0) objT2;
                Boolean boolValueOf = Boolean.valueOf(z5);
                zI3 = x340Var.i(tl7Var) | x340Var.g(function0) | x340Var.g(function1) | x340Var.d(fH) | x340Var.i(xtb0Var2) | (i4 == 256);
                Object objT4 = x340Var.T();
                if (!zI3 || objT4 == m4cVar) {
                    f = fH;
                    qjb0Var = new qjb0(tl7Var, function0, function1, f, xtb0Var2, z5, (lnm) null);
                    function0 = function0;
                    xtb0Var2 = xtb0Var2;
                    x340Var.s0(qjb0Var);
                } else {
                    qjb0Var = objT4;
                    f = fH;
                }
                qxd0.r(tl7Var, xtb0Var2, boolValueOf, (vu30) qjb0Var, x340Var);
                Boolean boolValueOf2 = Boolean.valueOf(xtb0Var2.j.b());
                zI4 = x340Var.i(xtb0Var2) | x340Var.i(tl7Var) | x340Var.g(function0) | x340Var.g(function1) | x340Var.d(f);
                objT3 = x340Var.T();
                if (zI4 || objT3 == m4cVar) {
                    rjb0 rjb0Var = new rjb0(xtb0Var2, tl7Var, function0, function1, f, (lnm) null);
                    x340Var.s0(rjb0Var);
                    objT3 = rjb0Var;
                }
                qxd0.t(boolValueOf2, x340Var, (vu30) objT3);
                z4 = z5;
            } else {
                x340Var.b0();
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nj8(tl7Var, xtb0Var, z4, i, i2, (byte) 2);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            if (i5 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            fH = ((wat) x340Var.k(t4k.h)).h();
            i4 = i3 & 896;
            if (i4 == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            zI = z6 | x340Var.i(xtb0Var2);
            objT = x340Var.T();
            if (zI) {
                objT = new sjb0(z5, xtb0Var2, (byte) 0);
                x340Var.s0(objT);
            } else {
                objT = new sjb0(z5, xtb0Var2, (byte) 0);
                x340Var.s0(objT);
            }
            function0 = (Function0) objT;
            if (i4 == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            zI2 = z7 | x340Var.i(xtb0Var2);
            objT2 = x340Var.T();
            if (zI2) {
                objT2 = new sjb0(z5, xtb0Var2, (byte) 1);
                x340Var.s0(objT2);
            } else {
                objT2 = new sjb0(z5, xtb0Var2, (byte) 1);
                x340Var.s0(objT2);
            }
            function1 = (Function0) objT2;
            Boolean boolValueOf3 = Boolean.valueOf(z5);
            zI3 = x340Var.i(tl7Var) | x340Var.g(function0) | x340Var.g(function1) | x340Var.d(fH) | x340Var.i(xtb0Var2) | (i4 == 256);
            Object objT5 = x340Var.T();
            if (zI3) {
                f = fH;
                qjb0Var = new qjb0(tl7Var, function0, function1, f, xtb0Var2, z5, (lnm) null);
                function0 = function0;
                xtb0Var2 = xtb0Var2;
                x340Var.s0(qjb0Var);
            } else {
                f = fH;
                qjb0Var = new qjb0(tl7Var, function0, function1, f, xtb0Var2, z5, (lnm) null);
                function0 = function0;
                xtb0Var2 = xtb0Var2;
                x340Var.s0(qjb0Var);
            }
            qxd0.r(tl7Var, xtb0Var2, boolValueOf3, (vu30) qjb0Var, x340Var);
            Boolean boolValueOf4 = Boolean.valueOf(xtb0Var2.j.b());
            zI4 = x340Var.i(xtb0Var2) | x340Var.i(tl7Var) | x340Var.g(function0) | x340Var.g(function1) | x340Var.d(f);
            objT3 = x340Var.T();
            if (zI4) {
                rjb0 rjb0Var2 = new rjb0(xtb0Var2, tl7Var, function0, function1, f, (lnm) null);
                x340Var.s0(rjb0Var2);
                objT3 = rjb0Var2;
            } else {
                rjb0 rjb0Var3 = new rjb0(xtb0Var2, tl7Var, function0, function1, f, (lnm) null);
                x340Var.s0(rjb0Var3);
                objT3 = rjb0Var3;
            }
            qxd0.t(boolValueOf4, x340Var, (vu30) objT3);
            z4 = z5;
        } else {
            x340Var.b0();
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj8(tl7Var, xtb0Var, z4, i, i2, (byte) 2);
        }
    }

    public static final void g(String str, c380 c380Var, String str2, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1 = function0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1786285814);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        }
        int i3 = i & 24576;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarH = l6o1.H(uyn1.z(cbx.b(x340Var).b.a, 0.0f, 2, qim0VarF), l6o1.C(0, 0, 1, x340Var), false, 14);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarO = ab80.o(nim0Var, 16.0f, x340Var, nim0Var, 1.0f);
            cua cuaVar = cbx.b(x340Var).f;
            int i4 = i2;
            qim0 qim0VarY = uyn1.y(dug.f(i1p1.q(qim0VarO, er31.b(8.0f)), cbx.a(x340Var).a.d, d4o1.a), cbx.b(x340Var).b.a, cbx.b(x340Var).b.b);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ucy0.V0;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(nim0Var, true, (iu30) objT);
            mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            lee1 lee1Var = cbx.d(x340Var).d;
            long j = cbx.a(x340Var).b.a;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = ucy0.W0;
                x340Var.s0(objT2);
            }
            uwo1.e(str, s161.b(nim0Var, false, (iu30) objT2), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, i4 & 14, 0, 2016);
            qim0 qim0VarO2 = ab80.o(nim0Var, cbx.b(x340Var).b.b, x340Var, nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarO2);
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
            zgo1.i(str2, u291.r(nim0Var, 130.0f), cbx.a(x340Var).b.a, cbx.a(x340Var).a.d, izy0.b, null, dzy0.b, null, null, x340Var, ((i4 >> 6) & 14) | 1794048, 384);
            x340Var.r(true);
            x340Var.r(true);
            zzo1.i(c380Var, null, kk0.p(nim0Var, cbx.b(x340Var).b.b, x340Var, x340Var).g, cbx.a(x340Var).b.a, 5, null, x340Var, (i4 >> 3) & 14, 34);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            boolean z2 = (i4 & 7168) == 2048;
            Object objT3 = x340Var.T();
            if (z2 || objT3 == m4cVar) {
                function1 = function0;
                objT3 = new lpx0(function1, (byte) 8);
                x340Var.s0(objT3);
            } else {
                function1 = function0;
            }
            foo1.c(new gbx(z50.c, (Function0) objT3), ldx.c, null, null, null, null, null, null, null, null, saj.b, x340Var, 0, 48, 2044);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vyy0(str, c380Var, str2, function1, i, (byte) 1);
        }
    }

    public static final void h(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1389904828);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131955929);
            String strN0 = cwl1.n0(2131955928, new Object[]{strO0}, x340Var);
            String strO1 = cwl1.o0(x340Var, 2131955930);
            mae1 mae1Var = new mae1(strO0, "https://support.spotify.com/article/managed-accounts/plain/");
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new wck0(iu30Var, (byte) 11);
                x340Var.s0(objT);
            }
            epc1 epc1Var = new epc1(strN0, mae1Var, (iu30) objT);
            String strO2 = cwl1.o0(x340Var, 2131954937);
            boolean z2 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new nfk0(iu30Var, (byte) 29);
                x340Var.s0(objT2);
            }
            pdp1.e(strO1, strO2, epc1Var, true, (Function0) objT2, x340Var, 3072, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 26, i, iu30Var, false);
        }
    }

    public static nw4 i(String str, lee1 lee1Var, long j, wat watVar, f930 f930Var) {
        z6x z6xVar = z6x.a;
        return new nw4(new rw4(str, lee1Var, z6xVar, z6xVar, f930Var, watVar, true), Integer.MAX_VALUE, 1, j);
    }

    public static final nw4 j(uor0 uor0Var, long j, int i, int i2) {
        return new nw4((rw4) uor0Var, i, i2, j);
    }

    public static final void k(int i, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-728448198);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            tob1 tob1VarB = z95.b(z ? 1.0f : 0.0f, irn1.l0(0.0f, 200.0f, null, 5), "alphaAnimation", (iu30) null, x340Var, 3120, 20);
            boolean zG = x340Var.g(tob1VarB);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new lws0(tob1VarB, (byte) 17);
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0Var, (iu30) objT);
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
            gfx.b(18, apo.r(56865695, new nl41(str, b2), x340Var), x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ryh(z, str, qim0Var, i);
        }
    }

    public static final void l(String str, c380 c380Var, String str2, jtl1 jtl1Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        String str3;
        c380 c380Var2;
        String str4;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(738046807);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(c380Var) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.i(jtl1Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            htl1 htl1Var = (htl1) f4p1.k(jtl1Var.b, (iac0) null, x340Var, 7).getValue();
            if (u890.j(htl1Var != null ? htl1Var.b : null, brl1.b)) {
                x340Var.i0(1215216757);
                str3 = str;
                c380Var2 = c380Var;
                str4 = str2;
                function1 = function0;
                e(str3, c380Var2, str4, function1, x340Var, (i2 & 1022) | ((i2 >> 3) & 7168) | 24576);
                x340Var.r(false);
            } else {
                str3 = str;
                c380Var2 = c380Var;
                str4 = str2;
                function1 = function0;
                x340Var.i0(1215308114);
                g(str3, c380Var2, str4, function1, x340Var, (i2 & 1022) | ((i2 >> 3) & 7168) | 24576);
                x340Var.r(false);
            }
            qim0Var = nim0.a;
        } else {
            str3 = str;
            c380Var2 = c380Var;
            str4 = str2;
            function1 = function0;
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyy0(str3, c380Var2, str4, jtl1Var, function1, qim0Var2, i);
        }
    }

    public static final void m(String str, boolean z, boolean z2, qim0 qim0Var, Bitmap bitmap, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2114036679);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024) | (x340Var.i(bitmap) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            int iI0 = ((wat) x340Var.k(t4k.h)).i0(16.0f);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = th51.O0;
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0Var, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.e, false);
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
            k(((i2 >> 3) & 14) | 384 | ((i2 << 3) & 112), str, x340Var, new n890(1, false), z);
            if (bitmap != null) {
                x340Var.i0(-888099026);
                boolean zE = x340Var.e(iI0);
                Object objT2 = x340Var.T();
                if (zE || objT2 == m4cVar) {
                    objT2 = new f13(iI0, (byte) 18);
                    x340Var.s0(objT2);
                }
                t9p1.g(bitmap, z, z2, j9k1.x(nim0.a, (xu30) objT2), x340Var, (i2 & 896) | ((i2 >> 12) & 14) | (i2 & 112));
                x340Var.r(false);
            } else {
                x340Var.i0(-887619487);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(str, z, z2, qim0Var, bitmap, i);
        }
    }

    public static final void n(int i, int i2, j2i j2iVar, qim0 qim0Var, j2i j2iVar2, b0k b0kVar, int i3) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2015061932);
        int i4 = i3 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16) | (x340Var.g(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new hk2(i, i2, (Object) j2iVar, (cv30) j2iVar2, (byte) 2);
                x340Var.s0(objT);
            }
            ejo1.l((i4 >> 9) & 14, 0, x340Var, (vu30) objT, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(i, i2, j2iVar, qim0Var, j2iVar2, i3, (byte) 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    public static final void o(String str, String str2, Function0 function0, qim0 qim0Var, String str3, int i, boolean z, boolean z2, long j, int i2, String str4, boolean z3, boolean z4, boolean z5, c380 c380Var, String str5, String str6, String str7, boolean z6, c380 c380Var2, Function0 function1, Function0 function2, Function0 function3, Function0 function4, b0k b0kVar, int i3) throws NoWhenBranchMatchedException {
        int i4;
        Function0 function5;
        b0k b0kVar2;
        int i5;
        b0k b0kVar3;
        int i6;
        boolean z7;
        hux huxVarD;
        ?? r3;
        b0k b0kVar4;
        b0k b0kVar5;
        Object next;
        Action actionN;
        String str8 = str3;
        pl3 pl3Var = een.Z;
        m4c m4cVar = fkj0.X;
        b0k b0kVar6 = (x340) b0kVar;
        b0kVar6.k0(1082059290);
        j06 j06Var = ((x340) b0kVar6).a;
        int i7 = i3 | (b0kVar6.g(str) ? 4 : 2) | (b0kVar6.g(str2) ? 32 : 16) | (b0kVar6.i(function0) ? 256 : 128) | (b0kVar6.i(qim0Var) ? 2048 : 1024) | (b0kVar6.g(str8) ? 16384 : 8192) | (b0kVar6.e(i == 0 ? -1 : l1d.C(i)) ? 131072 : 65536) | (b0kVar6.h(z) ? 1048576 : 524288) | (b0kVar6.h(z2) ? 8388608 : 4194304) | (b0kVar6.f(j) ? 67108864 : 33554432) | (b0kVar6.e(i2 != 0 ? l1d.C(i2) : -1) ? 536870912 : 268435456);
        int i8 = (b0kVar6.g(str4) ? 4 : 2) | (b0kVar6.h(z3) ? 32 : 16) | (b0kVar6.h(z4) ? 256 : 128) | (b0kVar6.h(z5) ? 2048 : 1024) | (b0kVar6.g(c380Var) ? 16384 : 8192) | (b0kVar6.g(str5) ? 131072 : 65536) | (b0kVar6.g(str6) ? 1048576 : 524288) | (b0kVar6.g(str7) ? 8388608 : 4194304) | (b0kVar6.h(z6) ? 67108864 : 33554432) | (b0kVar6.g(c380Var2) ? 536870912 : 268435456);
        if (b0kVar6.Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 306783379) == 306783378 && (((((b0kVar6.i(function1) ? (char) 4 : (char) 2) | (b0kVar6.i(function2) ? ' ' : (char) 16)) | (b0kVar6.i(function3) ? (char) 256 : (char) 128)) | (b0kVar6.i(function4) ? (char) 2048 : (char) 1024)) & 1171) == 1170) ? false : true)) {
            b0kVar6.d0();
            if ((i3 & 1) != 0 && !b0kVar6.E()) {
                b0kVar6.b0();
            }
            b0kVar6.s();
            boolean z8 = (z3 && z) || (!z3 && z2);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = u291.f(dug.f(qim0Var, cbx.a(b0kVar6).a.a.a(), er31.b(8.0f)), 1.0f);
            boolean zH = ((1879048192 & i7) == 536870912) | b0kVar6.h(z8) | ((i7 & 896) == 256);
            Object objT = b0kVar6.T();
            if (zH || objT == m4cVar) {
                i5 = i2;
                objT = new fwa1(i5, function0, z8);
                b0kVar6.s0(objT);
            } else {
                i5 = i2;
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, null, null, null, (Function0) objT, 15);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar6, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar6).T);
            xos0 xos0VarM = b0kVar6.m();
            qim0 qim0VarE = zr7.E(b0kVar6, qim0VarX);
            hzj.A.getClass();
            String uri = null;
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar6.m0();
            boolean z9 = ((x340) b0kVar6).S;
            n4k n4kVar = hmb0.t1;
            if (z9) {
                b0kVar6.l(n4kVar);
            } else {
                b0kVar6.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar6, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar6, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar6, lljVar3);
            nko1.F(b0kVar6);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar6, lljVar4);
            nim0 nim0Var = nim0.a;
            if (z3 && i5 != 2) {
                b0kVar6.i0(-1627350115);
                uwo1.e(cwl1.o0(b0kVar6, 2131952693), uyn1.y(dug.f(nim0Var, z4p1.e(452984831), er31.d(8.0f, 0.0f, 8.0f, 0.0f, 10)), 16.0f, 4.0f), cbx.d(b0kVar6).k, 0L, null, null, 0, false, null, 0, null, b0kVar6, 0, 0, 2040);
                i6 = 0;
                b0kVar6.r(false);
                b0kVar3 = b0kVar6;
            } else if (!z4 || i5 == 2) {
                b0kVar3 = b0kVar6;
                i6 = 0;
                b0kVar3.i0(-1626515874);
                b0kVar3.r(false);
            } else {
                b0kVar6.i0(-1626894694);
                uwo1.e(cwl1.o0(b0kVar6, 2131952694), uyn1.y(dug.f(nim0Var, z4p1.e(452984831), er31.d(8.0f, 0.0f, 8.0f, 0.0f, 10)), 16.0f, 4.0f), cbx.d(b0kVar6).k, 0L, null, null, 0, false, null, 0, null, b0kVar6, 0, 0, 2040);
                b0kVar3 = b0kVar6;
                i6 = 0;
                b0kVar3.r(false);
            }
            qim0 qim0VarX2 = uyn1.x(nim0Var, 16.0f);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar3, i6);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarX2);
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA2, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            int iC = l1d.C(i2);
            gex0 gex0Var = h36.a;
            if (iC == 0) {
                function3 = function3;
                b0k b0kVar7 = b0kVar3;
                pl3 pl3Var2 = pl3Var;
                function1 = function1;
                b0kVar7.i0(373265201);
                qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                jw31 jw31VarA = ew31.a(gex0Var, pl3Var2, b0kVar7, 0);
                int iHashCode3 = Long.hashCode(((x340) b0kVar7).T);
                xos0 xos0VarM3 = b0kVar7.m();
                qim0 qim0VarE3 = zr7.E(b0kVar7, qim0VarB);
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar7.m0();
                if (((x340) b0kVar7).S) {
                    b0kVar7.l(n4kVar);
                } else {
                    b0kVar7.v0();
                }
                nko1.H(jw31VarA, b0kVar7, lljVar);
                nko1.H(xos0VarM3, b0kVar7, lljVar2);
                x0d.q(iHashCode3, b0kVar7, lljVar3, b0kVar7);
                nko1.H(qim0VarE3, b0kVar7, lljVar4);
                if (z5) {
                    b0kVar7.i0(1499198823);
                    w0h1.a(wsx.c, isl.a, uyn1.B(u291.r(nim0Var, 16.0f), 0.0f, 0.0f, 4.0f, 0.0f, 11), 0L, 0L, false, b0kVar7, wsx.d | 48, 56);
                    uwo1.e(cwl1.o0(b0kVar7, 2131952695), null, cbx.d(b0kVar7).k, 0L, null, null, 0, false, null, 0, null, b0kVar7, 0, 0, 2042);
                    b0kVar7 = b0kVar7;
                    b0kVar7.r(false);
                } else {
                    b0kVar7.i0(1499607248);
                    b0kVar7.r(false);
                }
                b0kVar7.r(true);
                int i9 = i7 >> 15;
                b0k b0kVar8 = b0kVar7;
                uwo1.e(str, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), cbx.d(b0kVar7).d, j, null, null, 0, false, null, 0, null, b0kVar8, (i7 & 14) | (i9 & 7168), 0, 2032);
                uwo1.e(str2, null, cbx.d(b0kVar8).h, 0L, null, null, 0, false, null, 0, null, b0kVar8, (i7 >> 3) & 14, 0, 2042);
                dsa0.b(uyn1.z(0.0f, 16.0f, 1, nim0Var), cbx.a(b0kVar8).a.b.c(), 2.0f, b0kVar8, 0);
                b0kVar2 = b0kVar8;
                if (c380Var == null) {
                    b0kVar2.i0(374199633);
                    b0kVar2.r(false);
                } else {
                    int i10 = 0;
                    b0kVar2.i0(374199634);
                    Iterator it = c380Var.iterator();
                    while (it.hasNext()) {
                        String str9 = (String) it.next();
                        jw31 jw31VarA2 = ew31.a(gex0Var, pl3Var2, b0kVar2, i10);
                        pl3 pl3Var3 = pl3Var2;
                        int iHashCode4 = Long.hashCode(((x340) b0kVar2).T);
                        xos0 xos0VarM4 = b0kVar2.m();
                        qim0 qim0VarE4 = zr7.E(b0kVar2, nim0Var);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        b0kVar2.m0();
                        if (((x340) b0kVar2).S) {
                            b0kVar2.l(n4kVar);
                        } else {
                            b0kVar2.v0();
                        }
                        nko1.H(jw31VarA2, b0kVar2, y580.O0);
                        nko1.H(xos0VarM4, b0kVar2, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode4), b0kVar2, y580.R0);
                        nko1.F(b0kVar2);
                        nko1.H(qim0VarE4, b0kVar2, y580.Y);
                        uwr uwrVar2 = cbx.a;
                        b0k b0kVar9 = b0kVar2;
                        uwo1.e("• ", null, cbx.d(b0kVar2).j, 0L, null, null, 0, false, null, 0, null, b0kVar9, 6, 0, 2042);
                        uwo1.e(str9, null, cbx.d(b0kVar9).j, 0L, null, null, 0, false, null, 0, null, b0kVar9, 0, 0, 2042);
                        b0kVar2 = b0kVar9;
                        b0kVar2.r(true);
                        pl3Var2 = pl3Var3;
                        i10 = 0;
                    }
                    b0kVar2.r(i10);
                }
                if (z3 || z2) {
                    function5 = function0;
                    str8 = str3;
                    i4 = i;
                    z7 = false;
                    b0kVar2.i0(375358228);
                    b0kVar2.r(false);
                } else {
                    b0kVar2.i0(374467381);
                    function5 = function0;
                    str8 = str3;
                    i4 = i;
                    gfx.h(i4, apo.r(2059127214, new s721(function5, str8, (byte) 3), b0kVar2), b0kVar2, (i9 & 14) | 48);
                    z7 = false;
                    b0kVar2.r(false);
                }
                if (str4 == null) {
                    b0kVar2.i0(375389661);
                    b0kVar2.r(z7);
                } else {
                    b0kVar2.i0(375389662);
                    uwr uwrVar3 = cbx.a;
                    b0k b0kVar10 = b0kVar2;
                    uwo1.e(str4, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), cbx.d(b0kVar2).m, cbx.a(b0kVar2).b.b, null, null, 0, false, null, 0, null, b0kVar10, i8 & 14, 0, 2032);
                    b0kVar2 = b0kVar10;
                    z7 = false;
                    b0kVar2.r(false);
                }
                b0kVar2.r(z7);
            } else {
                if (iC != 1) {
                    throw p3d1.k(b0kVar3, 150590986, false);
                }
                b0kVar3.i0(375807418);
                d36 d36Var = new d36(12.0f, true, new um5(false));
                fra fraVar = een.N0;
                qim0 qim0VarB2 = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                jw31 jw31VarA3 = ew31.a(d36Var, fraVar, b0kVar3, 0);
                int iHashCode5 = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM5 = b0kVar3.m();
                qim0 qim0VarE5 = zr7.E(b0kVar3, qim0VarB2);
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(n4kVar);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(jw31VarA3, b0kVar3, lljVar);
                nko1.H(xos0VarM5, b0kVar3, lljVar2);
                x0d.q(iHashCode5, b0kVar3, lljVar3, b0kVar3);
                nko1.H(qim0VarE5, b0kVar3, lljVar4);
                if (str6 == null || (huxVarD = xxq0.d(str6)) == null) {
                    huxVarD = skx.c;
                }
                b0k b0kVar11 = b0kVar3;
                w0h1.a(huxVarD, isl.a, uyn1.x(u291.r(dug.f(nim0Var, cbx.a(b0kVar3).a.c, er31.b(8.0f)), 48.0f), 12.0f), 0L, 0L, false, b0kVar11, 56, 56);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                mbh mbhVarA3 = jbh.a(h36.e, eraVar, b0kVar11, 0);
                int iHashCode6 = Long.hashCode(((x340) b0kVar11).T);
                xos0 xos0VarM6 = b0kVar11.m();
                qim0 qim0VarE6 = zr7.E(b0kVar11, qim0VarD);
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar11.m0();
                if (((x340) b0kVar11).S) {
                    b0kVar11.l(n4kVar);
                } else {
                    b0kVar11.v0();
                }
                nko1.H(mbhVarA3, b0kVar11, lljVar);
                nko1.H(xos0VarM6, b0kVar11, lljVar2);
                x0d.q(iHashCode6, b0kVar11, lljVar3, b0kVar11);
                nko1.H(qim0VarE6, b0kVar11, lljVar4);
                uwo1.e(str, null, cbx.d(b0kVar11).h, j, null, null, 0, false, null, 0, null, b0kVar11, (i7 & 14) | ((i7 >> 15) & 7168), 0, 2034);
                if (str7 == null) {
                    b0kVar11.i0(1486639308);
                    b0kVar11.r(false);
                    b0kVar4 = b0kVar11;
                    r3 = 1;
                } else {
                    b0kVar11.i0(1486639309);
                    r3 = 1;
                    uwo1.e(str7, null, cbx.d(b0kVar11).j, 0L, null, null, 0, false, null, 0, null, b0kVar11, 0, 0, 2042);
                    b0kVar4 = b0kVar11;
                    b0kVar4.r(false);
                }
                b0kVar4.r((boolean) r3);
                b0kVar4.r((boolean) r3);
                b0k b0kVar12 = b0kVar4;
                dsa0.b(uyn1.z(0.0f, 8.0f, r3, nim0Var), cbx.a(b0kVar4).a.b.c(), 0.5f, b0kVar12, 0);
                uwo1.e(str5 == null ? "" : str5, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), cbx.d(b0kVar12).j, 0L, null, null, 0, false, null, 0, null, b0kVar12, 0, 0, 2040);
                jw31 jw31VarA4 = ew31.a(gex0Var, pl3Var, b0kVar12, 0);
                int iHashCode7 = Long.hashCode(((x340) b0kVar12).T);
                xos0 xos0VarM7 = b0kVar12.m();
                qim0 qim0VarE7 = zr7.E(b0kVar12, nim0Var);
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar12.m0();
                if (((x340) b0kVar12).S) {
                    b0kVar12.l(n4kVar);
                } else {
                    b0kVar12.v0();
                }
                nko1.H(jw31VarA4, b0kVar12, lljVar);
                nko1.H(xos0VarM7, b0kVar12, lljVar2);
                x0d.q(iHashCode7, b0kVar12, lljVar3, b0kVar12);
                nko1.H(qim0VarE7, b0kVar12, lljVar4);
                z50 z50Var = z50.c;
                if (z6) {
                    b0kVar12.i0(1858117757);
                    foo1.c(new gbx(z50Var, function1), jdx.c, anm1.N("manageButton", u291.d(sgc1.H(2, nim0Var), 1.0f)), null, yla.s(b0kVar12), null, null, null, null, null, apo.r(-279789096, new i90(c380Var2, (byte) 15), b0kVar12), b0kVar12, 0, 48, 2008);
                    b0kVar5 = b0kVar12;
                    b0kVar5.r(false);
                } else {
                    if (c380Var2 != 0) {
                        Iterator it2 = c380Var2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (((ActionTypeMap) next).o() != s80.R0);
                        ActionTypeMap actionTypeMap = (ActionTypeMap) next;
                        if (actionTypeMap != null && (actionN = actionTypeMap.n()) != null) {
                            uri = actionN.getUri();
                        }
                    }
                    if (uri != null) {
                        b0kVar12.i0(1858955067);
                        foo1.c(new gbx(z50Var, function2), jdx.c, anm1.N("requestButton", u291.d(sgc1.H(2, nim0Var), 1.0f)), null, yla.s(b0kVar12), null, null, null, null, null, apo.r(1069753423, new i90(c380Var2, (byte) 16), b0kVar12), b0kVar12, 0, 48, 2008);
                        b0kVar5 = b0kVar12;
                        b0kVar5.r(false);
                    } else {
                        b0kVar12.i0(1859678173);
                        foo1.c(new gbx(z50Var, function3), jdx.c, anm1.N("enrollButton", u291.d(sgc1.H(2, nim0Var), 1.0f)), null, yla.s(b0kVar12), null, null, null, null, null, apo.r(-2133295697, new i90(c380Var2, (byte) 17), b0kVar12), b0kVar12, 0, 48, 2008);
                        b0kVar5 = b0kVar12;
                        b0kVar5.r(false);
                    }
                }
                b0k b0kVar13 = b0kVar5;
                foo1.c(new gbx(z50Var, function4), ldx.c, anm1.N("detailsButton", u291.d(sgc1.H(2, nim0Var), 1.0f)), null, yla.s(b0kVar5), null, null, null, null, null, apo.r(-2061474861, new i90(c380Var2, (byte) 18), b0kVar5), b0kVar13, 0, 48, 2008);
                b0kVar2 = b0kVar13;
                b0kVar2.r(true);
                b0kVar2.r(false);
                function5 = function0;
                str8 = str3;
                i4 = i;
            }
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            i4 = i;
            function3 = function3;
            function5 = function0;
            b0kVar2 = b0kVar6;
            function1 = function1;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new r2c1(str, str2, function5, qim0Var, str8, i4, z, z2, j, i2, str4, z3, z4, z5, c380Var, str5, str6, str7, z6, c380Var2, function1, function2, function3, function4, i3);
        }
    }

    public static final void p(boolean z, iu30 iu30Var, j2i j2iVar, j2i j2iVar2, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(4347779);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            xpv0 xpv0Var = cbx.c(x340Var).c;
            n8b1 n8b1VarJ = xpv0.j();
            xpv0 xpv0Var2 = cbx.c(x340Var).c;
            n8b1 n8b1VarJ2 = xpv0.j();
            x340Var.i0(-116741381);
            int iX0 = (int) ((wat) x340Var.k(t4k.h)).X0(cbx.b(x340Var).b.a);
            x340Var.r(false);
            bby bbyVarE = xay.e(2, n8b1VarJ);
            ln00 ln00VarF = xay.f(2, n8b1VarJ);
            boolean zE = x340Var.e(iX0);
            Object objT = x340Var.T();
            if (zE || objT == m4cVar) {
                objT = new uv4(iX0, (byte) 24);
                x340Var.s0(objT);
            }
            bby bbyVarO = xay.o(n8b1VarJ2, (iu30) objT);
            boolean zE2 = x340Var.e(iX0);
            Object objT2 = x340Var.T();
            if (zE2 || objT2 == m4cVar) {
                objT2 = new uv4(iX0, (byte) 25);
                x340Var.s0(objT2);
            }
            ln00 ln00VarS = xay.s(n8b1VarJ2, (iu30) objT2);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = x340Var.i(bbyVarO) | x340Var.i(bbyVarE) | x340Var.i(ln00VarF) | x340Var.i(ln00VarS);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                ggh gghVar = new ggh(bbyVarO, bbyVarE, ln00VarF, ln00VarS, (byte) 28);
                x340Var.s0(gghVar);
                objT3 = gghVar;
            }
            hm5.a(boolValueOf, (qim0) null, (iu30) objT3, (tl3) null, (String) null, (iu30) null, apo.r(1274273990, new utw(z, iu30Var, j2iVar, j2iVar2, (byte) 1), x340Var), x340Var, (i2 & 14) | 1572864, 58);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(z, iu30Var, j2iVar, j2iVar2, i);
        }
    }

    public static final lee1 q(lee1 lee1Var, boolean z, b0k b0kVar) {
        if (!z) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-901304405);
            x340Var.r(false);
            return lee1Var;
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(-901820400);
        uwr uwrVar = cbx.a;
        if (lee1Var.equals(cbx.d(x340Var2).c)) {
            x340Var2.i0(-1414562414);
            lee1Var = cbx.d(x340Var2).b;
            x340Var2.r(false);
        } else if (lee1Var.equals(cbx.d(x340Var2).d)) {
            x340Var2.i0(-1414560114);
            lee1Var = cbx.d(x340Var2).c;
            x340Var2.r(false);
        } else if (lee1Var.equals(cbx.d(x340Var2).e)) {
            x340Var2.i0(-1414557969);
            lee1Var = cbx.d(x340Var2).d;
            x340Var2.r(false);
        } else if (lee1Var.equals(cbx.d(x340Var2).g)) {
            x340Var2.i0(-1414555794);
            lee1Var = cbx.d(x340Var2).e;
            x340Var2.r(false);
        } else if (lee1Var.equals(cbx.d(x340Var2).j)) {
            x340Var2.i0(-1414553682);
            lee1Var = cbx.d(x340Var2).g;
            x340Var2.r(false);
        } else if (lee1Var.equals(cbx.d(x340Var2).k)) {
            x340Var2.i0(-1414551438);
            lee1Var = cbx.d(x340Var2).h;
            x340Var2.r(false);
        } else if (lee1Var.equals(cbx.d(x340Var2).m)) {
            x340Var2.i0(-1414549235);
            lee1Var = cbx.d(x340Var2).j;
            x340Var2.r(false);
        } else {
            x340Var2.i0(-1414548467);
            x340Var2.r(false);
        }
        x340Var2.r(false);
        return lee1Var;
    }

    public static final Float r(xtb0 xtb0Var) {
        qtb0 qtb0Var = (qtb0) o7h.C0(xtb0Var.h().l);
        if (qtb0Var == null) {
            return null;
        }
        int i = qtb0Var.q;
        return Float.valueOf(Math.max(0.0f, ((qtb0Var.p + i) - xtb0Var.h().n) / i) + Math.max((xtb0Var.h().o - qtb0Var.a) - 1.0f, 0.0f));
    }

    public static final float s(xtb0 xtb0Var) {
        float fS = 0.0f;
        float fMax = Math.max(((err0) xtb0Var.e.b).s() - 1.0f, 0.0f);
        qtb0 qtb0Var = (qtb0) o7h.s0(xtb0Var.h().l);
        if (qtb0Var != null) {
            fS = ((err0) xtb0Var.e.c).s() / qtb0Var.q;
        }
        return fMax + fS;
    }

    public static final float t(long j, n511 n511Var) {
        if (ljo1.o(j, n511Var)) {
            return 0.0f;
        }
        float fE = Offset.e(Offset.f(n511Var.h(), j));
        if (fE >= Float.MAX_VALUE) {
            fE = Float.MAX_VALUE;
        }
        float fE2 = Offset.e(Offset.f((((long) Float.floatToRawIntBits(n511Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(n511Var.c)) << 32), j));
        if (fE2 < fE) {
            fE = fE2;
        }
        float fE3 = Offset.e(Offset.f(n511Var.d(), j));
        if (fE3 < fE) {
            fE = fE3;
        }
        float fE4 = Offset.e(Offset.f(n511Var.e(), j));
        return fE4 < fE ? fE4 : fE;
    }

    public static final int u(long j, n511 n511Var, n511 n511Var2) {
        float fT = t(j, n511Var);
        float fT2 = t(j, n511Var2);
        if (fT == fT2) {
            return 0;
        }
        return fT < fT2 ? -1 : 1;
    }

    public static final boolean v(lm00 lm00Var) {
        int i = lm00Var.b;
        return i == 90 || i == 270;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    public static final Object w(d0r d0rVar, oum oumVar, String str, String str2, String str3, String str4, los losVar, lwq lwqVar, zsm zsmVar, onm onmVar) throws Throwable {
        dtm dtmVar;
        Throwable th;
        los losVar2;
        los losVarSingletonList;
        los losVar3;
        zsm zsmVar2;
        String str5 = str3;
        hvm hvmVar = hvm.a;
        if (onmVar instanceof dtm) {
            dtmVar = (dtm) onmVar;
            int i = dtmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dtmVar.d = i - Integer.MIN_VALUE;
            } else {
                dtmVar = new dtm(onmVar);
            }
        } else {
            dtmVar = new dtm(onmVar);
        }
        Object obj = dtmVar.c;
        int i2 = dtmVar.d;
        ixb ixbVar = ixb.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                try {
                    jvm jvmVar = new jvm(str2, str5, str4);
                    smc0 smc0VarA = oumVar.a();
                    jvm jvmVar2 = new jvm(str2, str5, str4);
                    losVarSingletonList = Collections.singletonList(ovm.a);
                    mqm mqmVar = new mqm(jvmVar2, new lqm(losVarSingletonList, smc0VarA, (qle1) null, 4));
                    qrm qrmVar = new qrm(jvmVar, "spotify:contribution:" + str);
                    try {
                        if (zsmVar != null) {
                            dtmVar.a = losVar;
                            dtmVar.b = zsmVar;
                            dtmVar.d = 1;
                            d0rVar.getClass();
                            Object objD = d0r.d(d0rVar, hvmVar, mqmVar, qrmVar, dtmVar);
                            d9n d9nVar = d9n.a;
                            if (objD == d9nVar) {
                                return d9nVar;
                            }
                            losVar3 = losVar;
                            zsmVar2 = zsmVar;
                        } else {
                            lwq.a(lwqVar, mqmVar, qrmVar);
                            losVar3 = losVar;
                        }
                        losVar3.a(ixbVar);
                    } catch (CancellationException e) {
                        e = e;
                        throw e;
                    } catch (Exception unused) {
                        losVarSingletonList.a(ixbVar);
                    }
                } catch (CancellationException e2) {
                    e = e2;
                } catch (Exception unused2) {
                    losVarSingletonList = losVar;
                } catch (Throwable th2) {
                    th = th2;
                    str5 = losVar;
                    th = th;
                    losVar2 = str5;
                    losVar2.a(ixbVar);
                    throw th;
                }
                return rih1.a;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zsmVar2 = dtmVar.b;
            losVar3 = dtmVar.a;
            try {
                hm5.M(obj);
            } catch (CancellationException e3) {
                throw e3;
            } catch (Exception unused3) {
                losVarSingletonList = losVar3;
                losVarSingletonList.a(ixbVar);
            } catch (Throwable th3) {
                th = th3;
                losVar2 = losVar3;
                losVar2.a(ixbVar);
                throw th;
            }
            zsmVar2.invoke();
            losVar3.a(ixbVar);
            return rih1.a;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static final qim0 x(long j, hw61 hw61Var) {
        return new cz71(j, hw61Var);
    }

    public static ThreadPoolExecutor y() {
        if (b == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new btn1());
            b = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return b;
    }
}
