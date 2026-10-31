package p;

import android.content.res.Configuration;
import android.media.MediaCodec;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.concertcampaignview.v1.CtaType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ejo1 {
    public static final xgc a = new xgc((byte) 26);
    public static final Object b = new Object();
    public static b180 c;

    public static final void a(ArrayList arrayList, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1359743619);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(arrayList) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(16.0f);
            fra fraVar = een.N0;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarQ = i1p1.q(dug.f(u291.h(qim0Var3, 32.0f), cbx.a(x340Var).a.b.a(), cr31VarB), cr31VarB);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            qim0 qim0VarV = bin.v(qim0VarQ, (idn0) objT, ny3.a, false, null, null, function0, 28);
            boolean z = (i3 & 14) == 4;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new ib5(arrayList, (byte) 1);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarV, false, (iu30) objT2);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarB, 4.0f, 0.0f, 12.0f, 0.0f, 10);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
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
            f(o7h.d1(arrayList, 2), null, x340Var, 0);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(qim0Var3, 8.0f));
            uwo1.e(n(arrayList, x340Var), u291.x(0.0f, 148.0f, 1, qim0Var3), cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1712);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yk6(arrayList, function0, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(e9e e9eVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1279403735);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(e9eVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean z = (i3 & 112) == 32;
            int i4 = i3 & 14;
            boolean z2 = z | (i4 == 4);
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new rqa(iu30Var, e9eVar, (byte) 26);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, null, null, null, (Function0) objT, 15);
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).e.b;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarX, f, 16.0f);
            boolean z3 = i4 == 4;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new m4d(e9eVar, (byte) 15);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarY, false, (iu30) objT2);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(e9eVar.a, null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b((byte) 13, i, e9eVar, iu30Var, qim0Var2);
        }
    }

    public static final void c(vpl vplVar, bf3 bf3Var, o0i o0iVar, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2082585027);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(vplVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(bf3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 256 : 128;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = x340Var.g(vplVar);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zG2 = x340Var.g(ven0Var) | ((i2 & 112) == 32);
            if ((i2 & 896) == 256 || ((i2 & 512) != 0 && x340Var.i(o0iVar))) {
                z = true;
            }
            boolean z2 = zG2 | z;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new m3n(bf3Var, o0iVar, ven0Var, (byte) 26);
                x340Var.s0(objT2);
            }
            oto1.c(vplVar, o0iVar, (iu30) objT2, x340Var, (i2 & 14) | 64 | ((i2 >> 3) & 112));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(vplVar, bf3Var, o0iVar, i, (byte) 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0204  */
    /* JADX WARN: Code duplicated, block: B:102:0x0206  */
    /* JADX WARN: Code duplicated, block: B:106:0x020f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0224  */
    /* JADX WARN: Code duplicated, block: B:110:0x0226  */
    /* JADX WARN: Code duplicated, block: B:116:0x023c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0255  */
    /* JADX WARN: Code duplicated, block: B:120:0x0257  */
    /* JADX WARN: Code duplicated, block: B:124:0x0260  */
    /* JADX WARN: Code duplicated, block: B:131:0x027d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0297  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:143:0x0319  */
    /* JADX WARN: Code duplicated, block: B:146:0x032f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0349  */
    /* JADX WARN: Code duplicated, block: B:152:0x035b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0374  */
    /* JADX WARN: Code duplicated, block: B:156:0x039c  */
    /* JADX WARN: Code duplicated, block: B:157:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:163:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:165:0x0403  */
    /* JADX WARN: Code duplicated, block: B:167:0x0417  */
    /* JADX WARN: Code duplicated, block: B:169:0x0464  */
    /* JADX WARN: Code duplicated, block: B:171:0x0476  */
    /* JADX WARN: Code duplicated, block: B:71:0x0129  */
    /* JADX WARN: Code duplicated, block: B:73:0x0134  */
    /* JADX WARN: Code duplicated, block: B:74:0x0138  */
    /* JADX WARN: Code duplicated, block: B:81:0x0161  */
    /* JADX WARN: Code duplicated, block: B:86:0x016a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0172  */
    /* JADX WARN: Code duplicated, block: B:91:0x019d  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ed  */
    public static final void d(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function0 function0, Function0 function1, Function0 function2, gw70 gw70Var, esv0 esv0Var, b0k b0kVar, int i) {
        x340 x340Var;
        float f;
        float f2;
        qim0 qim0Var;
        gra graVar;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z6;
        n4k n4kVar;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        boolean z7;
        boolean z8;
        boolean z9;
        h2c h2cVar;
        iu30 iu30Var;
        int i2;
        x340 x340Var2;
        int i3;
        boolean z10;
        Object objT;
        ven0 ven0Var;
        boolean z11;
        boolean zI;
        Object objT2;
        boolean z12;
        Object objT3;
        ven0 ven0Var2;
        float f3;
        boolean zI2;
        Object objT4;
        tob1 tob1VarB;
        u5j1 u5j1Var;
        int i4;
        boolean zI3;
        Object objT5;
        boolean z13;
        qim0 qim0VarF;
        boolean z14;
        String str3;
        String str4 = str;
        gw70 gw70Var2 = gw70Var;
        esv0 esv0Var2 = esv0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-1945840675);
        j06 j06Var = x340Var3.a;
        int i5 = i | (x340Var3.g(str4) ? 4 : 2) | (x340Var3.g(str2) ? 32 : 16) | (x340Var3.h(z) ? 256 : 128) | (x340Var3.h(z2) ? 2048 : 1024) | (x340Var3.h(z3) ? 16384 : 8192) | (x340Var3.h(z4) ? 131072 : 65536) | (x340Var3.h(z5) ? 1048576 : 524288) | (x340Var3.i(function0) ? 8388608 : 4194304) | (x340Var3.i(function1) ? 67108864 : 33554432) | (x340Var3.i(function2) ? 536870912 : 268435456);
        int i6 = (x340Var3.i(gw70Var2) ? 4 : 2) | (x340Var3.i(esv0Var2) ? 32 : 16);
        if (x340Var3.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 19) == 18) ? false : true)) {
            boolean z15 = ((Configuration) x340Var3.k(AndroidCompositionLocals_androidKt.a)).orientation == 2;
            iu30 xetVar = new xet(function2, (byte) 18);
            if (z15) {
                f2 = 2.0f;
            } else {
                if (z4) {
                    f2 = 1.5584415f;
                } else {
                    f = 1.0f;
                }
                qim0Var = nim0.a;
                qim0 qim0VarR = d7e.r(f, u291.f(qim0Var, 1.0f), false);
                graVar = een.d;
                gfh0VarC = t1c.c(graVar, false);
                iHashCode = Long.hashCode(x340Var3.T);
                xos0VarM = x340Var3.m();
                qim0VarE = zr7.E(x340Var3, qim0VarR);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                z6 = x340Var3.S;
                n4kVar = hmb0.t1;
                if (z6) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var3, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var3, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var3, lljVar3);
                nko1.F(x340Var3);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var3, lljVar4);
                if (str2 != null || ihc1.y0(str2)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7 || z5) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z7;
                h2cVar = h2c.a;
                if (z9) {
                    iu30Var = xetVar;
                    i2 = 32;
                    x340Var2 = x340Var3;
                    x340Var2.i0(-1564532085);
                    x340Var2.r(false);
                } else {
                    x340Var3.i0(-1564892460);
                    qim0 qim0VarC = i541.C(h2cVar.b(qim0Var), xetVar);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM2 = x340Var3.m();
                    qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarC);
                    x340Var3.m0();
                    iu30Var = xetVar;
                    if (x340Var3.S) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var3, lljVar);
                    nko1.H(xos0VarM2, x340Var3, lljVar2);
                    x0d.q(iHashCode2, x340Var3, lljVar3, x340Var3);
                    nko1.H(qim0VarE2, x340Var3, lljVar4);
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    int i7 = i5 >> 15;
                    i2 = 32;
                    ijo1.e(((i5 >> 3) & 112) | (i7 & 896) | (i7 & 7168), str3, function0, function1, x340Var3, anm1.N("premium_visual_header_video", h2cVar.b(qim0Var)), z);
                    x340Var2 = x340Var3;
                    x340Var2.r(true);
                    x340Var2.r(false);
                }
                i3 = i5 & 112;
                if (i3 == i2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objT = x340Var2.T();
                if (z10 || objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT);
                }
                ven0Var = (ven0) objT;
                Boolean boolValueOf = Boolean.valueOf(z2);
                if ((i5 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zI = z11 | x340Var2.i(ven0Var);
                objT2 = x340Var2.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new wsh(z2, ven0Var, (lnm) null, (byte) 2);
                    x340Var2.s0(objT2);
                }
                qxd0.t(boolValueOf, x340Var2, (vu30) objT2);
                if (i3 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objT3 = x340Var2.T();
                if (z12 || objT3 == m4cVar) {
                    objT3 = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT3);
                }
                ven0Var2 = (ven0) objT3;
                if (z9 && ((Boolean) ven0Var.getValue()).booleanValue() && !z3) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                pxg1 pxg1VarO0 = irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, mlv.d, 2);
                zI2 = x340Var2.i(ven0Var2);
                objT4 = x340Var2.T();
                if (zI2 || objT4 == m4cVar) {
                    objT4 = new i030(ven0Var2, (byte) 14);
                    x340Var2.s0(objT4);
                }
                x340 x340Var4 = x340Var2;
                tob1VarB = z95.b(f3, pxg1VarO0, "heroVideoReveal", (iu30) objT4, x340Var4, 3072, 4);
                x340Var = x340Var4;
                qim0 qim0VarC2 = i541.C(h2cVar.b(qim0Var), iu30Var);
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarC2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                u5j1Var = d4o1.a;
                if (z9) {
                    x340Var.i0(1780088529);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1779857889);
                    t1c.a(dug.f(h2cVar.b(qim0Var), u7h.b(u7h.b, 0.4980392f, 0.0f, 0.0f, 0.0f, 14), u5j1Var), x340Var, 0);
                    x340Var.r(false);
                }
                if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                    str4 = str;
                    gw70Var2 = gw70Var;
                    esv0Var2 = esv0Var;
                    i4 = 6;
                    x340Var.i0(1781012081);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1780141415);
                    qim0 qim0VarB = h2cVar.b(qim0Var);
                    zI3 = x340Var.i(tob1VarB);
                    i4 = 6;
                    objT5 = x340Var.T();
                    if (zI3 || objT5 == m4cVar) {
                        objT5 = new pak(tob1VarB, (byte) 12);
                        x340Var.s0(objT5);
                    }
                    qim0 qim0VarC3 = i541.C(qim0VarB, (iu30) objT5);
                    if (z8) {
                        x340Var.i0(-1605138628);
                        uwr uwrVar = cbx.a;
                        qim0VarF = dug.f(qim0Var, cbx.a(x340Var).a.c, u5j1Var);
                        z13 = false;
                        x340Var.r(false);
                    } else {
                        z13 = false;
                        x340Var.i0(-1605137095);
                        x340Var.r(false);
                        qim0VarF = qim0Var;
                    }
                    qim0 qim0VarThen = qim0VarC3.then(qim0VarF);
                    gfh0 gfh0VarC4 = t1c.c(graVar, z13);
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarThen);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC4, x340Var, lljVar);
                    nko1.H(xos0VarM4, x340Var, lljVar2);
                    x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE4, x340Var, lljVar4);
                    int i8 = i6 << 6;
                    int i9 = 6 | ((i5 << 3) & 112) | (i8 & 896) | (i8 & 7168);
                    str4 = str;
                    gw70Var2 = gw70Var;
                    esv0Var2 = esv0Var;
                    e(str4, gw70Var2, esv0Var2, x340Var, i9);
                    if (z8 || z3) {
                        z14 = false;
                        x340Var.i0(550055561);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(549673083);
                        qim0 qim0VarB2 = h2cVar.b(qim0Var);
                        uwr uwrVar2 = cbx.a;
                        z14 = false;
                        t1c.a(anm1.N("premium_visual_header_video_placeholder", dug.f(qim0VarB2, cbx.a(x340Var).a.c, u5j1Var)), x340Var, 0);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    x340Var.r(z14);
                }
                if (z4) {
                    x340Var.i0(1781054923);
                    qim0 qim0VarC4 = u291.c(u291.f(h2cVar.a(qim0Var, een.X), 1.0f), 0.5f);
                    u7h u7hVar = new u7h(u7h.j);
                    uwr uwrVar3 = cbx.a;
                    t1c.a(dug.e(qim0VarC4, v9c.s(p7h.M(new u7h[]{u7hVar, new u7h(cbx.a(x340Var).a.c)}), 0.0f, 0.0f, 14), null, 0.0f, i4), x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1781460465);
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(true);
            }
            f = f2;
            qim0Var = nim0.a;
            qim0 qim0VarR2 = d7e.r(f, u291.f(qim0Var, 1.0f), false);
            graVar = een.d;
            gfh0VarC = t1c.c(graVar, false);
            iHashCode = Long.hashCode(x340Var3.T);
            xos0VarM = x340Var3.m();
            qim0VarE = zr7.E(x340Var3, qim0VarR2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            z6 = x340Var3.S;
            n4kVar = hmb0.t1;
            if (z6) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var3, lljVar);
            lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var3, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var3, lljVar3);
            nko1.F(x340Var3);
            lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var3, lljVar4);
            if (str2 != null) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (z7) {
                z8 = true;
            } else {
                z8 = true;
            }
            z9 = z7;
            h2cVar = h2c.a;
            if (z9) {
                x340Var3.i0(-1564892460);
                qim0 qim0VarC5 = i541.C(h2cVar.b(qim0Var), xetVar);
                gfh0 gfh0VarC5 = t1c.c(graVar, false);
                int iHashCode5 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM5 = x340Var3.m();
                qim0 qim0VarE5 = zr7.E(x340Var3, qim0VarC5);
                x340Var3.m0();
                iu30Var = xetVar;
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC5, x340Var3, lljVar);
                nko1.H(xos0VarM5, x340Var3, lljVar2);
                x0d.q(iHashCode5, x340Var3, lljVar3, x340Var3);
                nko1.H(qim0VarE5, x340Var3, lljVar4);
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                int i10 = i5 >> 15;
                i2 = 32;
                ijo1.e(((i5 >> 3) & 112) | (i10 & 896) | (i10 & 7168), str3, function0, function1, x340Var3, anm1.N("premium_visual_header_video", h2cVar.b(qim0Var)), z);
                x340Var2 = x340Var3;
                x340Var2.r(true);
                x340Var2.r(false);
            } else {
                iu30Var = xetVar;
                i2 = 32;
                x340Var2 = x340Var3;
                x340Var2.i0(-1564532085);
                x340Var2.r(false);
            }
            i3 = i5 & 112;
            if (i3 == i2) {
                z10 = true;
            } else {
                z10 = false;
            }
            objT = x340Var2.T();
            if (z10) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            } else {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0Var = (ven0) objT;
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            if ((i5 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            zI = z11 | x340Var2.i(ven0Var);
            objT2 = x340Var2.T();
            if (zI) {
                objT2 = new wsh(z2, ven0Var, (lnm) null, (byte) 2);
                x340Var2.s0(objT2);
            } else {
                objT2 = new wsh(z2, ven0Var, (lnm) null, (byte) 2);
                x340Var2.s0(objT2);
            }
            qxd0.t(boolValueOf2, x340Var2, (vu30) objT2);
            if (i3 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            objT3 = x340Var2.T();
            if (z12) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT3);
            } else {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT3);
            }
            ven0Var2 = (ven0) objT3;
            if (z9) {
                f3 = 1.0f;
            } else {
                f3 = 1.0f;
            }
            pxg1 pxg1VarO1 = irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, mlv.d, 2);
            zI2 = x340Var2.i(ven0Var2);
            objT4 = x340Var2.T();
            if (zI2) {
                objT4 = new i030(ven0Var2, (byte) 14);
                x340Var2.s0(objT4);
            } else {
                objT4 = new i030(ven0Var2, (byte) 14);
                x340Var2.s0(objT4);
            }
            x340 x340Var5 = x340Var2;
            tob1VarB = z95.b(f3, pxg1VarO1, "heroVideoReveal", (iu30) objT4, x340Var5, 3072, 4);
            x340Var = x340Var5;
            qim0 qim0VarC6 = i541.C(h2cVar.b(qim0Var), iu30Var);
            gfh0 gfh0VarC6 = t1c.c(graVar, false);
            int iHashCode6 = Long.hashCode(x340Var.T);
            xos0 xos0VarM6 = x340Var.m();
            qim0 qim0VarE6 = zr7.E(x340Var, qim0VarC6);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC6, x340Var, lljVar);
            nko1.H(xos0VarM6, x340Var, lljVar2);
            x0d.q(iHashCode6, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE6, x340Var, lljVar4);
            u5j1Var = d4o1.a;
            if (z9) {
                x340Var.i0(1779857889);
                t1c.a(dug.f(h2cVar.b(qim0Var), u7h.b(u7h.b, 0.4980392f, 0.0f, 0.0f, 0.0f, 14), u5j1Var), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1780088529);
                x340Var.r(false);
            }
            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                x340Var.i0(1780141415);
                qim0 qim0VarB3 = h2cVar.b(qim0Var);
                zI3 = x340Var.i(tob1VarB);
                i4 = 6;
                objT5 = x340Var.T();
                if (zI3) {
                    objT5 = new pak(tob1VarB, (byte) 12);
                    x340Var.s0(objT5);
                } else {
                    objT5 = new pak(tob1VarB, (byte) 12);
                    x340Var.s0(objT5);
                }
                qim0 qim0VarC7 = i541.C(qim0VarB3, (iu30) objT5);
                if (z8) {
                    x340Var.i0(-1605138628);
                    uwr uwrVar4 = cbx.a;
                    qim0VarF = dug.f(qim0Var, cbx.a(x340Var).a.c, u5j1Var);
                    z13 = false;
                    x340Var.r(false);
                } else {
                    z13 = false;
                    x340Var.i0(-1605137095);
                    x340Var.r(false);
                    qim0VarF = qim0Var;
                }
                qim0 qim0VarThen2 = qim0VarC7.then(qim0VarF);
                gfh0 gfh0VarC7 = t1c.c(graVar, z13);
                int iHashCode7 = Long.hashCode(x340Var.T);
                xos0 xos0VarM7 = x340Var.m();
                qim0 qim0VarE7 = zr7.E(x340Var, qim0VarThen2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC7, x340Var, lljVar);
                nko1.H(xos0VarM7, x340Var, lljVar2);
                x0d.q(iHashCode7, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE7, x340Var, lljVar4);
                int i11 = i6 << 6;
                int i12 = 6 | ((i5 << 3) & 112) | (i11 & 896) | (i11 & 7168);
                str4 = str;
                gw70Var2 = gw70Var;
                esv0Var2 = esv0Var;
                e(str4, gw70Var2, esv0Var2, x340Var, i12);
                if (z8) {
                    z14 = false;
                    x340Var.i0(550055561);
                    x340Var.r(false);
                } else {
                    z14 = false;
                    x340Var.i0(550055561);
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(z14);
            } else {
                str4 = str;
                gw70Var2 = gw70Var;
                esv0Var2 = esv0Var;
                i4 = 6;
                x340Var.i0(1781012081);
                x340Var.r(false);
            }
            if (z4) {
                x340Var.i0(1781054923);
                qim0 qim0VarC8 = u291.c(u291.f(h2cVar.a(qim0Var, een.X), 1.0f), 0.5f);
                u7h u7hVar2 = new u7h(u7h.j);
                uwr uwrVar5 = cbx.a;
                t1c.a(dug.e(qim0VarC8, v9c.s(p7h.M(new u7h[]{u7hVar2, new u7h(cbx.a(x340Var).a.c)}), 0.0f, 0.0f, 14), null, 0.0f, i4), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1781460465);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d760(str4, str2, z, z2, z3, z4, z5, function0, function1, function2, gw70Var2, esv0Var2, i);
        }
    }

    public static final void e(String str, gw70 gw70Var, esv0 esv0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1237033038);
        int i3 = i & 6;
        h2c h2cVar = h2c.a;
        if (i3 == 0) {
            i2 = (x340Var2.i(h2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(gw70Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(esv0Var) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = h2cVar.b(nim0Var);
            uwr uwrVar = cbx.a;
            t1c.a(dug.e(qim0VarB, new mic0(0, 0L, 9187343241974906880L, p7h.M(new u7h[]{new u7h(((yex) zex.a.d).e), new u7h(u7h.j)}), (List) null), null, 0.0f, 6), x340Var2, 0);
            if (str == null || ihc1.y0(str)) {
                x340Var = x340Var2;
                x340Var.i0(-1630733264);
                x340Var.r(false);
            } else {
                x340Var2.i0(-1631327286);
                Uri uri = Uri.parse(str);
                as80 as80Var = mif1.P0;
                int i4 = i2 & 7168;
                boolean z = i4 == 2048;
                Object objT = x340Var2.T();
                if (z || objT == m4cVar) {
                    objT = new e760(esv0Var, (byte) 0);
                    x340Var2.s0(objT);
                }
                iu30 iu30Var = (iu30) objT;
                boolean z2 = i4 == 2048;
                Object objT2 = x340Var2.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new e760(esv0Var, (byte) 1);
                    x340Var2.s0(objT2);
                }
                eso1.h(oi7.a(uri, gw70Var, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, as80Var, iu30Var, (iu30) objT2, (iu30) null, 0L, x340Var2, (i2 >> 3) & 112, 0, 116732), isl.a, anm1.N("premium_visual_header_image", d9y0.k(h2cVar.b(nim0Var), 0.5019608f)), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, x340Var2, 224304, 384);
                x340Var = x340Var2;
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(str, gw70Var, esv0Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(List list, qim0 qim0Var, b0k b0kVar, int i) {
        byte b2;
        qim0 qim0Var2;
        List list2 = list;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1480723913);
        int i2 = 2;
        int i3 = (x340Var.g(list2) ? 4 : 2) | i | 48;
        boolean z = false;
        boolean z2 = true;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            float f = 24.0f;
            float fMax = (Math.max(list2.size() - 1, 0) * 11.0f) + 24.0f;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarS = u291.s(qim0Var3, fMax, 24.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarS);
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
            x340Var.i0(-733796075);
            int i4 = 0;
            for (Object obj : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                Uri uri = Uri.parse(((cqm0) obj).c);
                as80 as80Var = mif1.P0;
                nkx nkxVar = nkx.c;
                eso1.e(uri, isl.a, i1p1.q(lrn1.x(u291.r(eqr0.D(i4 * 11.0f, 0.0f, i2, qim0Var3), f), list2.size() - i4), er31.a), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, new nux(nkxVar, nkxVar), false, false, x340Var, 1073741872, 0, 3512);
                z = z;
                i4 = i5;
                f = f;
                i2 = i2;
                qim0Var3 = qim0Var3;
                z2 = true;
                list2 = list;
            }
            boolean z3 = z;
            x340Var.r(z3);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
            b2 = z3;
        } else {
            b2 = 0;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zk6(list, qim0Var2, i, b2);
        }
    }

    public static final void g(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(161210269);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 3) != 2)) {
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwo1.e(cwl1.o0(x340Var2, 2131959583), u291.f(nim0Var, 1.0f), cbx.d(x340Var2).g, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2024);
            foo1.c(new gbx(z50.c, function0), jdx.c, null, null, null, null, null, null, null, null, v5j.b, x340Var2, 0, 48, 2044);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 23, i, function0, false);
        }
    }

    public static final void h(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        String str2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-476170742);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            u85 u85Var = (erl1) x340Var.k(szf0.b);
            if (u85Var == null) {
                x340Var.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var).g;
            } else {
                x340Var.i0(-241885792);
            }
            x340Var.r(false);
            qim0 qim0VarJ = too1.j(qim0VarF, new bgc0(u85Var, 16));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarJ);
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
            qim0Var2 = qim0Var3;
            bzn1.e(null, v5j.a, false, null, rgr0.a, null, null, null, x340Var, 48, 237);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            rqo1.g(0, 0, x340Var, uyn1.z(0.0f, 8.0f, 1, qim0Var2));
            qim0 qim0VarH = l6o1.H(u291.f(qim0Var2, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap2 = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarH);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarP, 16.0f, 4.0f, 16.0f, 16.0f);
            mbh mbhVarA2 = jbh.a(new d36(cbx.b(x340Var).b.c, true, new um5(false)), een.Q0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
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
            str2 = str;
            j(str2, x340Var, 6);
            g(function0, x340Var, (i2 >> 3) & 14);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            str2 = str;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str2, function0, qim0Var2, i, (byte) 13);
        }
    }

    public static final void i(ArrayList arrayList, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(9009115);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(arrayList) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(qim0Var3, 48.0f);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            qim0 qim0VarV = bin.v(qim0VarH, (idn0) objT, ny3.a, false, null, null, function0, 28);
            boolean z = (i3 & 14) == 4;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new ib5(arrayList, (byte) 2);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarV, false, (iu30) objT2);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarB);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            f(o7h.d1(arrayList, 2), null, x340Var, 0);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(qim0Var3, 8.0f));
            uwo1.e(n(arrayList, x340Var), u291.x(0.0f, 148.0f, 1, qim0Var3), cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1712);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yk6(arrayList, function0, qim0Var2, i, (byte) 1);
        }
    }

    public static final void j(String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-662508247);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            uwo1.e(cwl1.o0(x340Var, 2131959582), u291.f(nim0Var, 1.0f), cbx.d(x340Var).g, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
            zgo1.i(str, u291.r(nim0Var, 140.0f), u7h.b, u7h.f, izy0.c, cwl1.o0(x340Var, 2131959586), dzy0.b, null, null, x340Var, (i2 & 14) | 1597440, 384);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ue0((byte) 16, i, str, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:42:0x018c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0192  */
    /* JADX WARN: Code duplicated, block: B:45:0x01be  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    public static final void k(ufd ufdVar, String str, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        boolean z;
        h311 h311VarV;
        qim0 qim0Var3;
        qim0 qim0Var4;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        n4k n4kVar;
        String str2 = str;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1294251811);
        j06 j06Var = ((x340) b0kVar2).a;
        int i3 = (b0kVar2.g(ufdVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= b0kVar2.g(str2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar2.g(qim0Var2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar2.Y(i3 & 1, z)) {
                qim0Var3 = nim0.a;
                if (i4 != 0) {
                    qim0Var4 = qim0Var3;
                } else {
                    qim0Var4 = qim0Var2;
                }
                mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0VarM = b0kVar2.m();
                qim0VarE = zr7.E(b0kVar2, qim0Var4);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                z2 = ((x340) b0kVar2).S;
                n4kVar = hmb0.t1;
                if (z2) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, b0kVar2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, b0kVar2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, b0kVar2, lljVar3);
                nko1.F(b0kVar2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, b0kVar2, lljVar4);
                qim0 qim0VarR = d7e.r(1.0f, qim0Var3, true);
                uwr uwrVar = cbx.a;
                int i5 = i3;
                xio1.i(0.0f, 0, b0kVar2, uyn1.A(qim0VarR, cbx.b(b0kVar2).b.f, cbx.b(b0kVar2).b.f * 2.0f, cbx.b(b0kVar2).b.f, cbx.b(b0kVar2).b.b));
                String strO0 = cwl1.o0(b0kVar2, 2131962947);
                lee1 lee1Var = cbx.d(b0kVar2).d;
                long j = cbx.a(b0kVar2).b.a;
                cvx cvxVar = cbx.b(b0kVar2).b;
                qim0 qim0Var5 = qim0Var4;
                uwo1.e(strO0, u291.f(uyn1.x(qim0Var3, 16.0f), 1.0f), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
                b0kVar2 = b0kVar2;
                op71.g(b0kVar2, new wnb0(1.0f, true));
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                qim0 qim0VarB = uyn1.B(uyn1.x(qim0Var3, 16.0f), 0.0f, 0.0f, 0.0f, cbx.b(b0kVar2).b.f, 7);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM2 = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarB);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC, b0kVar2, lljVar);
                nko1.H(xos0VarM2, b0kVar2, lljVar2);
                x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, lljVar4);
                str2 = str;
                otw.c(ufdVar, new tfd(str2), (qim0) null, (ipb1) null, b0kVar2, i5 & 14, 12);
                b0kVar2.r(true);
                b0kVar2.r(true);
                qim0Var2 = qim0Var5;
            } else {
                b0kVar2.b0();
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new dg6((byte) 8, i, i2, ufdVar, str2, qim0Var2);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar2.Y(i3 & 1, z)) {
            qim0Var3 = nim0.a;
            if (i4 != 0) {
                qim0Var4 = qim0Var3;
            } else {
                qim0Var4 = qim0Var2;
            }
            mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0VarM = b0kVar2.m();
            qim0VarE = zr7.E(b0kVar2, qim0Var4);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            z2 = ((x340) b0kVar2).S;
            n4kVar = hmb0.t1;
            if (z2) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, b0kVar2, lljVar7);
            nko1.F(b0kVar2);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar8);
            qim0 qim0VarR2 = d7e.r(1.0f, qim0Var3, true);
            uwr uwrVar2 = cbx.a;
            int i6 = i3;
            xio1.i(0.0f, 0, b0kVar2, uyn1.A(qim0VarR2, cbx.b(b0kVar2).b.f, cbx.b(b0kVar2).b.f * 2.0f, cbx.b(b0kVar2).b.f, cbx.b(b0kVar2).b.b));
            String strO1 = cwl1.o0(b0kVar2, 2131962947);
            lee1 lee1Var2 = cbx.d(b0kVar2).d;
            long j2 = cbx.a(b0kVar2).b.a;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            qim0 qim0Var6 = qim0Var4;
            uwo1.e(strO1, u291.f(uyn1.x(qim0Var3, 16.0f), 1.0f), lee1Var2, j2, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
            b0kVar2 = b0kVar2;
            op71.g(b0kVar2, new wnb0(1.0f, true));
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            qim0 qim0VarB2 = uyn1.B(uyn1.x(qim0Var3, 16.0f), 0.0f, 0.0f, 0.0f, cbx.b(b0kVar2).b.f, 7);
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarB2);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC2, b0kVar2, lljVar5);
            nko1.H(xos0VarM3, b0kVar2, lljVar6);
            x0d.q(iHashCode3, b0kVar2, lljVar7, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar8);
            str2 = str;
            otw.c(ufdVar, new tfd(str2), (qim0) null, (ipb1) null, b0kVar2, i6 & 14, 12);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var6;
        } else {
            b0kVar2.b0();
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new dg6((byte) 8, i, i2, ufdVar, str2, qim0Var2);
        }
    }

    public static final void l(int i, int i2, b0k b0kVar, vu30 vu30Var, qim0 qim0Var) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(vu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new slc1(o610.R0);
                x340Var.s0(objT);
            }
            m((slc1) objT, qim0Var, vu30Var, x340Var, (i3 << 3) & 1008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ash(qim0Var, vu30Var, i, i2);
        }
    }

    public static final void m(slc1 slc1Var, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-511989831);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(slc1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(x340Var.T);
            v340 v340VarU = tgp1.u(x340Var);
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            xos0 xos0VarM = x340Var.m();
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
            nko1.H(slc1Var, x340Var, slc1Var.c);
            nko1.H(v340VarU, x340Var, slc1Var.d);
            nko1.H(vu30Var, x340Var, slc1Var.e);
            hzj.A.getClass();
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            x340Var.r(true);
            if (x340Var.H()) {
                x340Var.i0(-1259187287);
                x340Var.r(false);
            } else {
                x340Var.i0(-1259245908);
                boolean zI = x340Var.i(slc1Var);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new ww21(slc1Var, (byte) 15);
                    x340Var.s0(objT);
                }
                qxd0.S((Function0) objT, x340Var);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05(slc1Var, qim0Var, vu30Var, i, (byte) 13);
        }
    }

    public static final String n(ArrayList arrayList, b0k b0kVar) {
        int size = arrayList.size();
        if (size == 1) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(784804833);
            x340Var.r(false);
            return ((cqm0) o7h.q0(arrayList)).b;
        }
        if (size == 2) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(784805563);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = ag6.P0;
                x340Var2.s0(objT);
            }
            String strY0 = o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) objT, 30);
            x340Var2.r(false);
            return strY0;
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(-1440784263);
        int size2 = arrayList.size() - 1;
        String str = ((cqm0) o7h.q0(arrayList)).b + " " + cwl1.U(2131820575, size2, new Object[]{Integer.valueOf(size2)}, x340Var3);
        x340Var3.r(false);
        return str;
    }

    public static int o(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final Object p(afh0 afh0Var) {
        Object objG = afh0Var.g();
        mlb0 mlb0Var = objG instanceof mlb0 ? (mlb0) objG : null;
        if (mlb0Var != null) {
            return mlb0Var.A0();
        }
        return null;
    }

    public static final jqd0 q(y9e1 y9e1Var, int i, int i2, int i3, long j, boolean z, boolean z2) {
        ax51 ax51Var;
        if (z) {
            ax51Var = null;
        } else {
            int i4 = nbe1.c;
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            ax51Var = new ax51(new yw51(ajo1.u(y9e1Var, i5), 1L, i5), new yw51(ajo1.u(y9e1Var, i6), 1L, i6), nbe1.h(j));
        }
        return new jqd0(z2, ax51Var, new a9a(i, i2, i3, y9e1Var), (byte) 19);
    }

    public static final boolean r(Map map) {
        String string;
        String str = (String) map.get("is_running");
        return (str == null || (string = ihc1.e1(str).toString()) == null || !Boolean.parseBoolean(string)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:97:0x01aa A[EDGE_INSN: B:97:0x01aa->B:109:0x01de BREAK  A[LOOP:1: B:17:0x0070->B:64:0x012e]] */
    public static List s(l370 l370Var, v360 v360Var) {
        v2n v2nVar;
        long j;
        List listE = v360Var.e("Set-Cookie");
        int size = listE.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            String str = (String) listE.get(i);
            long jCurrentTimeMillis = System.currentTimeMillis();
            char c2 = ';';
            int iF = w4n1.f(str, ';', 0, 0, 6);
            char c3 = '=';
            int iF2 = w4n1.f(str, '=', 0, iF, 2);
            if (iF2 == iF) {
                v2nVar = null;
            } else {
                String strP = w4n1.p(0, iF2, str);
                if (strP.length() != 0 && w4n1.h(strP) == -1) {
                    String strP2 = w4n1.p(iF2 + 1, iF, str);
                    if (w4n1.h(strP2) == -1) {
                        int i2 = iF + 1;
                        int length = str.length();
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long j2 = -1;
                        long jT = 253402300799999L;
                        String strSubstring = null;
                        String str2 = null;
                        boolean z4 = true;
                        String str3 = null;
                        while (true) {
                            if (i2 >= length) {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    j = (j3 < jCurrentTimeMillis || j3 > 253402300799999L) ? 253402300799999L : j3;
                                } else {
                                    j = jT;
                                }
                                String str4 = l370Var.d;
                                if (str2 == null) {
                                    str2 = str4;
                                } else if (!u890.j(str4, str2) && (!nhc1.R(str4, str2, false) || str4.charAt((str4.length() - str2.length()) - 1) != '.' || u4n1.a.e(str4))) {
                                    v2nVar = null;
                                    break;
                                }
                                if (str4.length() != str2.length() && kny0.d.a(str2) == null) {
                                    v2nVar = null;
                                    break;
                                }
                                if (strSubstring == null || !nhc1.Y(strSubstring, "/", false)) {
                                    String strB = l370Var.b();
                                    int iA0 = ihc1.A0(strB, '/', 0, 6);
                                    strSubstring = iA0 != 0 ? strB.substring(0, iA0) : "/";
                                }
                                v2nVar = new v2n(strP, strP2, j, str2, strSubstring, z3, z, z2, z4, str3);
                                break;
                            }
                            int iE = w4n1.e(str, c2, i2, length);
                            int iE2 = w4n1.e(str, c3, i2, iE);
                            String strP3 = w4n1.p(i2, iE2, str);
                            String strP4 = iE2 < iE ? w4n1.p(iE2 + 1, iE, str) : "";
                            if (strP3.equalsIgnoreCase("expires")) {
                                try {
                                    jT = t(strP4.length(), strP4);
                                    z2 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (strP3.equalsIgnoreCase("max-age")) {
                                try {
                                    j2 = Long.parseLong(strP4);
                                    if (j2 <= 0) {
                                        j2 = Long.MIN_VALUE;
                                    }
                                } catch (NumberFormatException e) {
                                    if (!Pattern.compile("-?\\d+").matcher(strP4).matches()) {
                                        throw e;
                                    }
                                    j2 = nhc1.Y(strP4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                }
                                z2 = true;
                            } else if (strP3.equalsIgnoreCase("domain")) {
                                if (nhc1.R(strP4, ".", false)) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strB2 = u4n1.b(ihc1.H0(strP4, "."));
                                if (strB2 == null) {
                                    throw new IllegalArgumentException();
                                }
                                str2 = strB2;
                                z4 = false;
                            } else if (strP3.equalsIgnoreCase("path")) {
                                strSubstring = strP4;
                            } else if (strP3.equalsIgnoreCase("secure")) {
                                z3 = true;
                            } else if (strP3.equalsIgnoreCase("httponly")) {
                                z = true;
                            } else if (strP3.equalsIgnoreCase("samesite")) {
                                str3 = strP4;
                            }
                            i2 = iE + 1;
                            c2 = ';';
                            c3 = '=';
                        }
                    } else {
                        v2nVar = null;
                    }
                } else {
                    v2nVar = null;
                }
            }
            if (v2nVar != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(v2nVar);
            }
        }
        List listUnmodifiableList = arrayList != null ? Collections.unmodifiableList(arrayList) : null;
        return listUnmodifiableList == null ? z6x.a : listUnmodifiableList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0082  */
    public static long t(int i, String str) {
        int iO = o(str, 0, i, false);
        Matcher matcher = v2n.n.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iW0 = -1;
        int i5 = -1;
        int i6 = -1;
        while (iO < i) {
            int iO2 = o(str, iO + 1, i, true);
            matcher.region(iO, iO2);
            if (i3 == -1 && matcher.usePattern(v2n.n).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i5 = Integer.parseInt(matcher.group(2));
                i6 = Integer.parseInt(matcher.group(3));
            } else if (i4 == -1 && matcher.usePattern(v2n.m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else if (iW0 == -1) {
                Pattern pattern = v2n.l;
                if (matcher.usePattern(pattern).matches()) {
                    iW0 = ihc1.w0(pattern.pattern(), matcher.group(1).toLowerCase(Locale.US), 0, false, 6) / 4;
                } else if (i2 != -1 && matcher.usePattern(v2n.k).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            } else if (i2 != -1) {
            }
            iO = o(str, iO2 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            hhg1.n("Failed requirement.");
            return 0L;
        }
        if (iW0 == -1) {
            hhg1.n("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            hhg1.n("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            hhg1.n("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            hhg1.n("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            hhg1.n("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(z4n1.a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iW0 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final ByteBuffer u(MediaCodec mediaCodec, int i) {
        ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
        if (outputBuffer != null) {
            return outputBuffer;
        }
        bhn0.x(i, "Can't obtain an output buffer with index: ");
        return null;
    }

    public static final int v(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static int w(int i, int i2) {
        if (i2 < 0) {
            hhg1.n("cannot store more than Integer.MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }
}
