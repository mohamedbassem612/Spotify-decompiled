package p;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.concertcampaignview.v1.CtaType;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class lrn1 {
    public static boolean a;
    public static b180 b;

    public static final void a(int i, b0k b0kVar, c380 c380Var, boolean z) {
        int i2;
        c380 c380Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1797759524);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(c380Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            hcx hcxVar = hcx.b;
            float fA = hcxVar.a(x340Var) * 0.15f;
            boolean zD = x340Var.d(fA);
            Object objT = x340Var.T();
            if (zD || objT == fkj0.X) {
                objT = new yy2((byte) 5, fA);
                x340Var.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = o0c.d(j9k1.x(nim0Var, (xu30) objT), (ni20) null, 3);
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
            if (z) {
                x340Var.i0(-1448655836);
                c380Var2 = c380Var;
                x2g0.i(c380Var2, nim0Var, hcxVar, (hux) null, 3, (gbx) null, (String) null, x340Var, ((i2 >> 3) & 14) | 25008, 104);
                x340Var.r(false);
            } else {
                c380Var2 = c380Var;
                x340Var.i0(-1448488436);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            c380Var2 = c380Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new se5(i, c380Var2, z);
        }
    }

    public static final void b(float f, phx phxVar, float f2, boolean z, c380 c380Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-607475075);
        int i2 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.i(phxVar) ? 32 : 16) | (x340Var.d(f2) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(c380Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = em50.d;
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(nim0.a, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            g(f, phxVar, f2, x340Var, (i2 & 14) | 64 | (i2 & 112) | (i2 & 896));
            a((i2 >> 9) & 126, x340Var, c380Var, z);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new so50(f, phxVar, f2, z, c380Var, i);
        }
    }

    public static final void c(gmg0 gmg0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        gbx gbxVar;
        String str = gmg0Var.a;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(837442590);
        int i2 = i | (b0kVar3.i(gmg0Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(qim0Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            float f = str == null ? 0.3f : 1.0f;
            long j = ((u7h) b0kVar3.k(gaa1.a)).a;
            uwr uwrVar = cbx.a;
            long jA = cbx.a(b0kVar3).a.a.a();
            qim0 qim0VarThen = u291.m(nim0.a, 80.0f).then(qim0Var);
            cr31 cr31Var = er31.a;
            qim0 qim0VarK = d9y0.k(i1p1.o(i1p1.q(qim0VarThen, cr31Var), gmg0Var.i, jA), f);
            if (str != null) {
                b0kVar3.i0(-1212196983);
                boolean zI = ((i2 & 112) == 32) | b0kVar3.i(gmg0Var) | b0kVar3.g(str) | b0kVar3.f(j);
                Object objT = b0kVar3.T();
                if (zI || objT == m4cVar) {
                    zlg0 zlg0Var = new zlg0(gmg0Var, iu30Var, str, j, (byte) 1);
                    b0kVar3.s0(zlg0Var);
                    objT = zlg0Var;
                }
                gbxVar = new gbx(z50.c, (Function0) objT);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1211949138);
                b0kVar3.r(false);
                gbxVar = null;
            }
            gbx gbxVar2 = gbxVar;
            gra graVar = een.h;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = ujf0.Z0;
                b0kVar3.s0(objT2);
            }
            kgx kgxVar = new kgx(0, (vu30) objT2, (vu30) null, (vu30) null, 13);
            vzq0.a.getClass();
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarK, graVar, cr31Var, kgxVar, uzq0.b, (max) null, false, (idn0) null, ny3.a, gbxVar2, (gbx) null, apo.r(682840327, new img0(gmg0Var, (byte) 1), b0kVar3), b0kVar2, 0, 48, 1248);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(gmg0Var, iu30Var, qim0Var, i, (byte) 27);
        }
    }

    public static final void d(bv40 bv40Var, d0r d0rVar, njm njmVar, String str, String str2, int i, b0k b0kVar, int i2) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(919227457);
        int i3 = i2 | (x340Var.i(bv40Var) ? 4 : 2) | (x340Var.i(d0rVar) ? 32 : 16) | (x340Var.i(njmVar) ? 256 : 128) | (x340Var.g(str) ? 2048 : 1024) | (x340Var.g(str2) ? 16384 : 8192) | (x340Var.e(i) ? 131072 : 65536);
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            boolean zG = x340Var.g(d0rVar) | x340Var.g(njmVar);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                ((r2p) ((jly0) ((a0m) bv40Var.b).b).get()).getClass();
                objT = new jd6(njmVar, d0rVar, (byte) 2);
                x340Var.s0(objT);
            }
            tyq tyqVar = (tyq) objT;
            boolean z = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new xza(i, str2, str);
                x340Var.s0(objT2);
            }
            i1o1.e(tyqVar, (xza) objT2, d0rVar, null, null, kzi.a, null, 0, null, x340Var, ((i3 << 3) & 896) | 196608, 236);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(bv40Var, d0rVar, njmVar, str, str2, i, i2, (byte) 5);
        }
    }

    public static final void e(c380 c380Var, pt ptVar, float f, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-903283705);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(ptVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            d36 d36Var = new d36(16.0f, true, new um5(false));
            zzq0 zzq0VarH = uyn1.h(2, f, 0.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean zI = x340Var.i(c380Var) | x340Var.i(ptVar);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ztb(c380Var, ptVar, (byte) 8);
                x340Var.s0(objT);
            }
            s3o1.e(qim0VarF, null, zzq0VarH, d36Var, null, null, null, (iu30) objT, x340Var, 0, 234);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f61(c380Var, ptVar, f, qim0Var2, i);
        }
    }

    public static final void f(c380 c380Var, Integer num, Integer num2, b0k b0kVar, int i) {
        int i2;
        Integer num3;
        Integer num4;
        String strC;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1481384837);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(num2) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = (i2 & 14) | 48;
            x340Var.i0(249708830);
            if (c380Var.isEmpty()) {
                x340Var.r(false);
                strC = null;
            } else {
                if (c380Var.size() == 1) {
                    x340Var.i0(-547975131);
                    x340Var.r(false);
                    strC = (String) o7h.q0(c380Var);
                } else if (c380Var.size() <= 1) {
                    x340Var.i0(-547973515);
                    strC = gg.C(c380Var, x340Var, i3 & 14, 1);
                    x340Var.r(false);
                } else {
                    x340Var.i0(192732784);
                    int size = c380Var.size() - 1;
                    strC = o7h.q0(c380Var) + " " + cwl1.U(2131820619, size, new Object[]{Integer.valueOf(size)}, x340Var);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            if (strC == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new jmg0(c380Var, num, num2, i, (byte) 0);
                    return;
                }
                return;
            }
            num3 = num;
            num4 = num2;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0.a, 2.0f));
            t2p1.b(strC, num3, num4, (qim0) null, x340Var, i2 & 1008);
        } else {
            num3 = num;
            num4 = num2;
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new jmg0(c380Var, num3, num4, i, (byte) 1);
        }
    }

    public static final void g(float f, phx phxVar, float f2, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(101230524);
        int i2 = (x340Var2.d(f) ? 4 : 2) | i | (x340Var2.i(phxVar) ? 32 : 16) | (x340Var2.d(f2) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = i1p1.q(exd0.r(uyn1.B(x(nim0Var, 1.0f), 0.0f, 0.0f, f, 0.0f, 11), em50.f), er31.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarQ);
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
            Uri uri = Uri.parse(phxVar.a);
            boolean z = false;
            String str = phxVar.b;
            String str2 = phxVar.c;
            long j = phxVar.d;
            if ((i2 & 896) == 256) {
                z = true;
            }
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new jc5((byte) 23, f2);
                x340Var2.s0(objT);
            }
            bmq0.a(uri, i541.C(nim0Var, (iu30) objT), hcx.b, str, str2, j, 0L, false, x340Var2, 384, 192);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qz2(f, phxVar, f2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x0160  */
    /* JADX WARN: Code duplicated, block: B:48:0x0164  */
    /* JADX WARN: Code duplicated, block: B:55:0x0179  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r0v14 */
    public static final void h(int i, int i2, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        qim0 qim0Var5;
        f65 f65Var;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        boolean zI;
        Object objT;
        ?? r0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1940718338);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                qim0Var4 = nim0.a;
                if (i4 != 0) {
                    qim0Var5 = qim0Var4;
                } else {
                    qim0Var5 = qim0Var2;
                }
                f65Var = (f65) x340Var.k(t4k.s);
                qim0 qim0VarF = u291.f(qim0Var5, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarF2 = dug.f(uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 6.0f, 7), cbx.a(x340Var).c.d, d4o1.a);
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarX = uyn1.x(qim0VarF2, 16.0f);
                jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarX);
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
                qim0 qim0Var6 = qim0Var5;
                eox eoxVar = eox.c;
                cvx cvxVar3 = cbx.b(x340Var).b;
                w0h1.a(eoxVar, isl.a, uyn1.B(qim0Var4, 0.0f, 0.0f, 16.0f, 0.0f, 11), 0L, 0L, false, x340Var, eox.d | 48, 56);
                int i5 = af5.e;
                pae1 pae1Var = new pae1(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439), (zma1) null, 14);
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zI = x340Var.i(f65Var) | z2;
                objT = x340Var.T();
                if (!zI || objT == fkj0.X) {
                    r0 = 1;
                    objT = new ff5((byte) 1, f65Var, function0);
                    x340Var.s0(objT);
                } else {
                    r0 = 1;
                }
                af5 af5VarI = ob51.i(str, pae1Var, (rjc0) objT);
                ef5 ef5Var = new ef5(cbx.d(x340Var).k, (byte) r0);
                ye5 ye5Var = new ye5(af5VarI);
                ye5Var.i(ef5Var);
                uwo1.d(ye5Var.p(), cbx.a(x340Var).b.a, null, cbx.d(x340Var).j, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4084);
                x340Var = x340Var;
                x340Var.r((boolean) r0);
                qim0Var3 = qim0Var6;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1(i, str, function0, qim0Var3, i2);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            qim0Var4 = nim0.a;
            if (i4 != 0) {
                qim0Var5 = qim0Var4;
            } else {
                qim0Var5 = qim0Var2;
            }
            f65Var = (f65) x340Var.k(t4k.s);
            qim0 qim0VarF3 = u291.f(qim0Var5, 1.0f);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarF4 = dug.f(uyn1.B(qim0VarF3, 0.0f, 0.0f, 0.0f, 6.0f, 7), cbx.a(x340Var).c.d, d4o1.a);
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarF4, 16.0f);
            jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarX2);
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
            qim0 qim0Var7 = qim0Var5;
            eox eoxVar2 = eox.c;
            cvx cvxVar6 = cbx.b(x340Var).b;
            w0h1.a(eoxVar2, isl.a, uyn1.B(qim0Var4, 0.0f, 0.0f, 16.0f, 0.0f, 11), 0L, 0L, false, x340Var, eox.d | 48, 56);
            int i6 = af5.e;
            pae1 pae1Var2 = new pae1(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439), (zma1) null, 14);
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            zI = x340Var.i(f65Var) | z2;
            objT = x340Var.T();
            if (zI) {
                r0 = 1;
                objT = new ff5((byte) 1, f65Var, function0);
                x340Var.s0(objT);
            } else {
                r0 = 1;
                objT = new ff5((byte) 1, f65Var, function0);
                x340Var.s0(objT);
            }
            af5 af5VarI2 = ob51.i(str, pae1Var2, (rjc0) objT);
            ef5 ef5Var2 = new ef5(cbx.d(x340Var).k, (byte) r0);
            ye5 ye5Var2 = new ye5(af5VarI2);
            ye5Var2.i(ef5Var2);
            uwo1.d(ye5Var2.p(), cbx.a(x340Var).b.a, null, cbx.d(x340Var).j, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4084);
            x340Var = x340Var;
            x340Var.r((boolean) r0);
            qim0Var3 = qim0Var7;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1(i, str, function0, qim0Var3, i2);
        }
    }

    public static final void i(String str, phx phxVar, c380 c380Var, int i, boolean z, boolean z2, boolean z3, int i2, boolean z4, Function0 function0, qim0 qim0Var, b0k b0kVar, int i3) throws Throwable {
        qim0 qim0Var2;
        Throwable th;
        String strU;
        String strN0;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(319562795);
        int i4 = i3 | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.i(phxVar) ? 32 : 16) | (b0kVar2.i(c380Var) ? 256 : 128) | (b0kVar2.e(i) ? 2048 : 1024) | (b0kVar2.h(z) ? 16384 : 8192) | (b0kVar2.h(z2) ? 131072 : 65536) | (b0kVar2.h(z3) ? 1048576 : 524288) | (b0kVar2.e(i2) ? 8388608 : 4194304) | (b0kVar2.h(z4) ? 67108864 : 33554432) | (b0kVar2.i(function0) ? 536870912 : 268435456);
        if (b0kVar2.Y(i4 & 1, (i4 & 306783379) != 306783378)) {
            if ((z4 && z2) || (z && !c380Var.isEmpty())) {
                b0kVar2.i0(-1846809966);
                b0kVar2.r(false);
                th = null;
                strU = null;
            } else if (z2) {
                th = null;
                strU = x0d.k(b0kVar2, -2137783532, 2131956501, b0kVar2, false);
            } else {
                th = null;
                if (!z3 || i2 <= 0) {
                    b0kVar2.i0(-1846447886);
                    b0kVar2.r(false);
                    strU = null;
                } else {
                    b0kVar2.i0(-2137779160);
                    strU = cwl1.U(2131820696, i2, new Object[]{Integer.valueOf(i2)}, b0kVar2);
                    b0kVar2.r(false);
                }
            }
            if (z4 && z2) {
                b0kVar2.i0(-2137770115);
                strN0 = cwl1.n0(2131956500, new Object[]{str}, b0kVar2);
                b0kVar2.r(false);
            } else if (!z || c380Var.isEmpty()) {
                b0kVar2.i0(-2137762820);
                strN0 = cwl1.n0(2131956498, new Object[]{str}, b0kVar2);
                b0kVar2.r(false);
            } else {
                strN0 = x0d.k(b0kVar2, -2137765458, 2131956499, b0kVar2, false);
            }
            String str2 = strN0;
            boolean zIsEmpty = c380Var.isEmpty();
            boolean z5 = !zIsEmpty;
            boolean z6 = (!z || zIsEmpty || z2) ? false : true;
            tob1 tob1VarB = z95.b(z6 ? 0.5f : 1.0f, w(), "avatarAlpha", (iu30) null, b0kVar2, 3072, 20);
            tob1 tob1VarA = z95.a(z6 ? 32.0f : 0.0f, w(), "avatarSlide", b0kVar2, 384, 8);
            b0kVar2 = b0kVar2;
            tob1 tob1VarA2 = w191.a(z4p1.e(i), w(), "trackColorAnimation", b0kVar2, 384, 8);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(u291.f(qim0Var3, 1.0f), ((u7h) tob1VarA2.getValue()).a, d4o1.a);
            boolean z7 = (i4 & 1879048192) == 536870912;
            Object objT = b0kVar2.T();
            if (z7 || objT == fkj0.X) {
                objT = new zg20(function0, (byte) 27);
                b0kVar2.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, null, null, null, (Function0) objT, 15);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarY = uyn1.y(qim0VarX, 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarY);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw th;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            wnb0 wnb0VarQ = kk0.q(b0kVar2, qim0VarE, y580.Y, 1.0f, true);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            w2g0.c(uyn1.B(wnb0VarQ, 0.0f, 2.0f, 12.0f, 0.0f, 9), (tl3) null, apo.r(1004377137, new gb7(z, z2, (Object) str2, (Object) strU, (byte) 2), b0kVar2), b0kVar2, 3072, 6);
            b(((p3v) tob1VarA.getValue()).a, phxVar, ((Number) tob1VarB.getValue()).floatValue(), z5, c380Var, b0kVar2, (i4 & 112) | 64 | (57344 & (i4 << 6)));
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new to50(str, phxVar, c380Var, i, z, z2, z3, i2, z4, function0, qim0Var2, i3);
        }
    }

    public static final void j(vra0 vra0Var, pe peVar, iu30 iu30Var, kvp kvpVar, w9u0 w9u0Var, mpa1 mpa1Var, g38 g38Var, hfp hfpVar, long j, boolean z, boolean z2, boolean z3, g9m g9mVar, boolean z4, Long l, b0k b0kVar, int i) {
        int i2;
        w9u0 w9u0Var2;
        b0k b0kVar2;
        Context context;
        Window window;
        View decorView;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1010164656);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(vra0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(peVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(kvpVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            w9u0Var2 = w9u0Var;
            i2 |= b0kVar3.i(w9u0Var2) ? 16384 : 8192;
        } else {
            w9u0Var2 = w9u0Var;
        }
        if ((i & 196608) == 0) {
            i2 |= b0kVar3.i(mpa1Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= b0kVar3.i(g38Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= b0kVar3.i(hfpVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= b0kVar3.f(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= b0kVar3.h(z) ? 536870912 : 268435456;
        }
        if (b0kVar3.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (((((((b0kVar3.h(z2) ? (char) 4 : (char) 2) | (b0kVar3.h(z3) ? ' ' : (char) 16)) | (b0kVar3.i(g9mVar) ? 256 : 128)) | (b0kVar3.h(z4) ? (char) 2048 : (char) 1024)) | (b0kVar3.g(l) ? (char) 16384 : (char) 8192)) | (b0kVar3.h(false) ? (char) 0 : (char) 0)) & 74899) == 74898) ? false : true)) {
            Object objT = b0kVar3.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = pzm.i(b0kVar3);
            }
            lz20 lz20Var = (lz20) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == obj) {
                objT2 = new bs91();
                b0kVar3.s0(objT2);
            }
            bs91 bs91Var = (bs91) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == obj) {
                objT3 = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT3);
            }
            c9n c9nVar = (c9n) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == obj) {
                objT4 = v8r.q(krm0.a);
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var = (ven0) objT4;
            Object objT5 = b0kVar3.T();
            if (objT5 == obj) {
                objT5 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT5);
            }
            ven0 ven0Var2 = (ven0) objT5;
            ven0 ven0VarS = v8r.s(vra0Var, b0kVar3);
            ven0 ven0VarS2 = v8r.s(iu30Var, b0kVar3);
            ven0 ven0VarS3 = v8r.s(Boolean.valueOf(z), b0kVar3);
            boolean z5 = z2 || z3;
            ven0 ven0VarS4 = v8r.s(Boolean.valueOf(z5), b0kVar3);
            ven0 ven0VarS5 = v8r.s(false, b0kVar3);
            ven0 ven0VarS6 = v8r.s(Boolean.valueOf(z4), b0kVar3);
            ven0 ven0VarS7 = v8r.s(cwl1.o0(b0kVar3, 2131957009), b0kVar3);
            Object objT6 = b0kVar3.T();
            if (objT6 == obj) {
                objT6 = new xta0();
                b0kVar3.s0(objT6);
            }
            xta0 xta0Var = (xta0) objT6;
            boolean z6 = (i2 & 896) == 256;
            Object objT7 = b0kVar3.T();
            if (z6 || objT7 == obj) {
                objT7 = new ux90(iu30Var, (byte) 27);
                b0kVar3.s0(objT7);
            }
            Function0 function0 = (Function0) objT7;
            View view = (View) b0kVar3.k(AndroidCompositionLocals_androidKt.f);
            ep20 ep20Var = new ep20(z561.Z(z561.i0(new n561[]{new sgg1(mr90.e1, z561.c0(mr90.d1, view)), z561.h0(view.getRootView().getContext())})));
            do {
                if (!ep20Var.hasNext()) {
                    iac0 iac0VarH = x9p1.h(view);
                    context = iac0VarH instanceof Activity ? (Activity) iac0VarH : null;
                    if (context != null) {
                        break;
                    }
                    context = view.getContext();
                    break;
                }
                context = (Activity) z561.W(z561.T(aht.Y0, z561.c0(jqa0.b, (Context) ep20Var.next())));
            } while (context == null);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                view = decorView;
            }
            ely0[] ely0VarArr = {AndroidCompositionLocals_androidKt.f.a(view), ef.a.a(peVar)};
            hqa0 hqa0Var = new hqa0(function0, ven0Var, bs91Var, xta0Var, vra0Var, iu30Var, j, z5, g9mVar, l, hfpVar, ven0Var2, lz20Var, ven0VarS6, kvpVar, w9u0Var2, mpa1Var, g38Var, ven0VarS2, c9nVar, ven0VarS7, ven0VarS, ven0VarS3, ven0VarS5, ven0VarS4, (byte) 1);
            b0kVar2 = b0kVar3;
            mod.c(ely0VarArr, apo.r(-684290160, hqa0Var, b0kVar2), b0kVar2, 56);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new iqa0(vra0Var, peVar, iu30Var, kvpVar, w9u0Var, mpa1Var, g38Var, hfpVar, j, z, z2, z3, g9mVar, z4, l, i);
        }
    }

    public static final void k(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1861784796);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.i(qim0Var) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            lee1 lee1Var = cbx.d(x340Var2).j;
            long j = cbx.a(x340Var2).b.b;
            nim0 nim0Var = nim0.a;
            uwo1.e("•", uyn1.z(4.0f, 0.0f, 2, nim0Var), lee1Var, j, null, null, 0, false, new cjc0(1), 0, null, x340Var2, 6, 0, 1776);
            unx unxVar = unx.c;
            zov0 zov0Var = cbx.b(x340Var2).g;
            w0h1.a(unxVar, isl.a, u291.r(nim0Var, 12.0f), cbx.a(x340Var2).b.b, 0L, false, x340Var2, unx.d | 48, 48);
            qim0Var2 = qim0Var;
            uwo1.e(str, uyn1.B(nim0Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var2, i2 & 14, 0, 1712);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            qim0Var2 = qim0Var;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var2, i, (byte) 0);
        }
    }

    public static final void l(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-683951441);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).c.a;
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new nfk0(iu30Var, (byte) 16);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            boolean zF = x340Var.f(j);
            Object objT2 = x340Var.T();
            if (zF || objT2 == m4cVar) {
                objT2 = new q9j0((byte) 4, j);
                x340Var.s0(objT2);
            }
            cua cuaVar = cbx.b(x340Var).f;
            hdx hdxVar = new hdx(1, (vu30) null, (vu30) null, (vu30) objT2, er31.b(16.0f), 6);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            foo1.c(gbxVar, hdxVar, qim0Var, null, null, new zzq0(4.0f, 8.0f, 4.0f, 8.0f), null, null, k3j.a, null, k3j.b, x340Var, ((i2 << 3) & 896) | 805306368, 48, 1464);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l52(iu30Var, qim0Var, i, (byte) 6);
        }
    }

    public static final void m(d0r d0rVar, gmg0 gmg0Var, iu30 iu30Var, njm njmVar, bv40 bv40Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        bv40 bv40Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(785246872);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(d0rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gmg0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 256 : 128;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(njmVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            bv40Var2 = bv40Var;
            i2 |= x340Var.i(bv40Var2) ? 16384 : 8192;
        } else {
            bv40Var2 = bv40Var;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            efv0 efv0VarS = jap1.s(gmg0Var.k, x340Var);
            gra graVar = een.e;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = wlg0.X0;
                x340Var.s0(objT);
            }
            hm5.a(efv0VarS, qim0Var, (iu30) objT, graVar, "ContributorPopupSwitcher", (iu30) null, apo.r(-1425164168, new rl6(gmg0Var, iu30Var2, bv40Var2, d0rVar, njmVar, (byte) 4), x340Var), x340Var, ((i3 >> 12) & 112) | 1597824, 32);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0(d0rVar, gmg0Var, iu30Var, njmVar, bv40Var, qim0Var, i, (byte) 4);
        }
    }

    public static final void n(String str, c380 c380Var, Integer num, Integer num2, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-908045362);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(c380Var) ? 32 : 16) | (b0kVar3.g(num) ? 256 : 128) | (b0kVar3.g(num2) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("contributor-card-subtitle", qim0Var3);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarN);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            uwr uwrVar = cbx.a;
            qim0Var2 = qim0Var3;
            uwo1.e(str, null, cbx.d(b0kVar3).k, cbx.a(b0kVar3).b.a, new a0e1(3), null, 0, false, new cjc0(1), 0, null, b0kVar3, i2 & 14, 0, 1762);
            b0kVar2 = b0kVar3;
            f(c380Var, num, num2, b0kVar2, (i2 >> 3) & 1022);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 1, i, str, c380Var, num, num2, qim0Var2);
        }
    }

    public static final boolean o(LocalDate localDate, LocalDate localDate2) {
        return localDate.equals(localDate2);
    }

    public static final Set p(rcr0 rcr0Var, ArrayList arrayList, Set set) {
        Object next;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qfr0 qfr0Var = (qfr0) it.next();
            Iterator it2 = set.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((oi51) next).b().equals(qfr0Var.getClass()));
            oi51 oi51Var = next instanceof oi51 ? (oi51) next : null;
            w7x w7xVar = w7x.a;
            if (oi51Var != null) {
                Set<scr0> setC = oi51Var.c();
                w7x arrayList3 = new ArrayList();
                for (scr0 scr0Var : setC) {
                    r7h.W((Iterable) (scr0Var.a.equals(rcr0Var) ? (Set) scr0Var.b.invoke(qfr0Var) : w7xVar), arrayList3);
                }
                w7xVar = arrayList3;
            }
            r7h.W((Iterable) w7xVar, arrayList2);
        }
        return o7h.p1(arrayList2);
    }

    public static final int q(String str, agc0 agc0Var) {
        if (eyo1.o(str)) {
            return 1;
        }
        Set set = s4b1.f;
        if (uic.x(str).c == blc0.U4) {
            return 2;
        }
        if (eyo1.n(str)) {
            return 3;
        }
        if (eyo1.u(str)) {
            return 4;
        }
        if (eyo1.p(str) || eyo1.t(str)) {
            return 5;
        }
        if (eyo1.q(str)) {
            return 6;
        }
        return uic.h(str, new blc0[]{blc0.ti, blc0.ui}) ? 8 : 9;
    }

    public static int r(LocalDate localDate) {
        return localDate.hashCode();
    }

    public static final String s(String str) {
        return nhc1.W(nhc1.W(nhc1.W(nhc1.W(str, "&", "&amp;"), "\"", "&quot;"), "<", "&lt;"), ">", "&gt;");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    public static o4w t(o4w o4wVar, o4w o4wVar2, float f) {
        List list = o4wVar.b;
        List list2 = o4wVar2.b;
        List list3 = o4wVar.a;
        int size = list3.size();
        List list4 = o4wVar2.a;
        if (size == list4.size() && list.size() == list2.size()) {
            float fO = yoi1.o(f, 0.0f, 1.0f);
            if (fO <= 0.0f) {
                return o4wVar;
            }
            if (fO < 1.0f) {
                ArrayList<mmr0> arrayListV1 = o7h.v1(list3, list4);
                ArrayList arrayList = new ArrayList(q7h.U(arrayListV1, 10));
                for (mmr0 mmr0Var : arrayListV1) {
                    xz3 xz3Var = (xz3) mmr0Var.a;
                    xz3 xz3Var2 = (xz3) mmr0Var.b;
                    arrayList.add(new xz3(apo.p(fO, xz3Var.a, xz3Var2.a), xz3Var2.b, xz3Var2.c));
                }
                ArrayList<mmr0> arrayListV2 = o7h.v1(list, list2);
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayListV2, 10));
                for (mmr0 mmr0Var2 : arrayListV2) {
                    c4w c4wVar = (c4w) mmr0Var2.a;
                    c4w c4wVar2 = (c4w) mmr0Var2.b;
                    int size2 = c4wVar.c.size();
                    ?? arrayList3 = c4wVar2.c;
                    if (size2 == arrayList3.size()) {
                        ArrayList<mmr0> arrayListV3 = o7h.v1(c4wVar.c, (Iterable) arrayList3);
                        arrayList3 = new ArrayList(q7h.U(arrayListV3, 10));
                        for (mmr0 mmr0Var3 : arrayListV3) {
                            arrayList3.add(new Offset(apo.p(fO, ((Offset) mmr0Var3.a).a, ((Offset) mmr0Var3.b).a)));
                        }
                    }
                    ?? r17 = arrayList3;
                    int i = c4wVar2.a;
                    int i2 = c4wVar2.b;
                    float f2 = c4wVar.d;
                    float fE = l1d.e(c4wVar2.d, f2, fO, f2);
                    float f3 = c4wVar.e;
                    arrayList2.add(new c4w(i, i2, (List) r17, fE, l1d.e(c4wVar2.e, f3, fO, f3)));
                }
                return new o4w(arrayList, arrayList2, o4wVar2.c, o4wVar2.d, o4wVar2.e);
            }
        }
        return o4wVar2;
    }

    public static final qim0 u(qim0 qim0Var, iu30 iu30Var) {
        return qim0Var.then(new f8q0(iu30Var));
    }

    public static final ozr v() {
        return new ozr(dem1.A(ws41.c));
    }

    public static final pxg1 w() {
        return irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, new ceo(0.4f, 0.0f, 0.6f, 1.0f), 2);
    }

    public static final qim0 x(qim0 qim0Var, float f) {
        return qim0Var.then(new g3n1(f));
    }
}
