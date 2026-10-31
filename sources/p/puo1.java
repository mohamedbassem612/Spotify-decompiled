package p;

import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.view.accessibility.AccessibilityManager;
import android.widget.RemoteViews;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class puo1 {
    public static b180 a;

    public static final void a(pw50 pw50Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        pw50 pw50Var2 = pw50Var;
        String str = pw50Var2.f.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2076268476);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(pw50Var2) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            Uri uri = Uri.parse(pw50Var2.e);
            nim0 nim0Var = nim0.a;
            eso1.e(uri, isl.a, u291.h(u291.f(nim0Var, 1.0f), 320.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var, 196656, 0, 3480);
            era eraVar = een.Q0;
            qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 24.0f, 0.0f, 24.0f, 40.0f, 2);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
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
            op71.g(x340Var, u291.h(nim0Var, 160.0f));
            pw50Var2 = pw50Var;
            String str2 = pw50Var2.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str2, anm1.N("HeaderTitle", nim0Var), cbx.d(x340Var).h, xxq0.c(pw50Var2.b), new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            uwo1.e(pw50Var2.c, uyn1.B(anm1.N("HeaderSubtitle", nim0Var), 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).b, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            uwo1.e(pw50Var2.d, uyn1.B(anm1.N("HeaderDescription", nim0Var), 0.0f, 24.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).g, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            x340Var = x340Var;
            if (str.length() > 0) {
                x340Var.i0(1349099314);
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    foo1.c(new gbx(new y50(str), function0), new idx(), uyn1.B(anm1.N("HeaderPrimaryButton", nim0Var), 0.0f, 24.0f, 0.0f, 0.0f, 13), null, null, null, null, null, null, null, apo.r(-2080025830, new mu6(pw50Var2, (byte) 12), x340Var), x340Var, 0, 48, 2040);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(1349422210);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zt6(pw50Var2, qim0Var, function0, i, (byte) 5);
        }
    }

    public static final void b(n9d1 n9d1Var, n9d1 n9d1Var2, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(693373039);
        int i2 = i | (x340Var2.g(n9d1Var) ? 4 : 2) | (x340Var2.g(n9d1Var2) ? 32 : 16) | (x340Var2.g(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            flb0 flb0Var = (flb0) x340Var2.k(t4k.n);
            ven0 ven0VarS = v8r.s(x340Var2.k(t4k.l), x340Var2);
            float fX0 = ((wat) x340Var2.k(t4k.h)).X0(20.0f);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            boolean zD = ((i2 & 14) == 4) | x340Var2.d(fX0) | x340Var2.g(c9nVar) | ((i2 & 112) == 32);
            Object objT2 = x340Var2.T();
            if (zD || objT2 == m4cVar) {
                objT2 = new bmh1(fX0, c9nVar, new hnf(ven0VarS, (byte) 1));
                x340Var2.s0(objT2);
            }
            bmh1 bmh1Var = (bmh1) objT2;
            boolean zI = x340Var2.i(bmh1Var);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new eqf(bmh1Var, (byte) 0);
                x340Var2.s0(objT3);
            }
            qxd0.i(bmh1Var, (iu30) objT3, x340Var2);
            gqf gqfVar = new gqf(bmh1Var, flb0Var, n9d1Var, n9d1Var2, (byte) 0);
            bav0 bav0Var = f8d1.a;
            b8d1 b8d1Var = new b8d1((Object) null, (Object) null, new Object[]{bmh1Var, flb0Var, n9d1Var, n9d1Var2}, gqfVar, 3);
            boolean zI2 = x340Var2.i(bmh1Var);
            Object objT4 = x340Var2.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new eqf(bmh1Var, (byte) 1);
                x340Var2.s0(objT4);
            }
            qim0 qim0VarK = eqr0.k(b8d1Var, (iu30) objT4);
            if (n9d1Var == null && n9d1Var2 == null) {
                x340Var2.i0(1779546895);
                qim0 qim0VarThen = qim0Var.then(qim0VarK);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
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
                k4s0.i(6, j2iVar, x340Var2, true, false);
                x340Var = x340Var2;
            } else {
                x340Var2.i0(1779622938);
                int i3 = i2 << 3;
                x340Var = x340Var2;
                c(qim0Var, n9d1Var, n9d1Var2, false, apo.r(145537249, new klb(qim0VarK, j2iVar), x340Var2), x340Var, ((i2 >> 6) & 14) | 24576 | (i3 & 112) | (i3 & 896), 8);
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(n9d1Var, n9d1Var2, qim0Var, j2iVar, i, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0150  */
    /* JADX WARN: Code duplicated, block: B:106:0x0178  */
    /* JADX WARN: Code duplicated, block: B:109:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x019b  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x0200  */
    /* JADX WARN: Code duplicated, block: B:128:0x023c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0245  */
    /* JADX WARN: Code duplicated, block: B:131:0x0249  */
    /* JADX WARN: Code duplicated, block: B:134:0x026b  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:143:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:153:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:156:0x0319  */
    /* JADX WARN: Code duplicated, block: B:158:0x0338 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x033d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0351  */
    /* JADX WARN: Code duplicated, block: B:166:0x036f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0373  */
    /* JADX WARN: Code duplicated, block: B:169:0x0397  */
    /* JADX WARN: Code duplicated, block: B:171:0x039d  */
    /* JADX WARN: Code duplicated, block: B:174:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0131  */
    /* JADX WARN: Code duplicated, block: B:92:0x0133  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140  */
    /* JADX WARN: Code duplicated, block: B:96:0x0142  */
    /* JADX WARN: Code duplicated, block: B:99:0x014b A[ADDED_TO_REGION] */
    public static final void c(qim0 qim0Var, n9d1 n9d1Var, n9d1 n9d1Var2, boolean z, j2i j2iVar, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        n9d1 n9d1Var3;
        int i4;
        n9d1 n9d1Var4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        qim0 qim0Var3;
        n9d1 n9d1Var5;
        boolean z4;
        n9d1 n9d1Var6;
        h311 h311VarV;
        qim0 qim0Var4;
        n9d1 n9d1Var7;
        n9d1 n9d1Var8;
        boolean z5;
        flb0 flb0Var;
        e9r e9rVarA;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean zE;
        Object objT;
        w3v w3vVar;
        t24 t24Var;
        int i8;
        boolean z9;
        int i9;
        boolean z10;
        boolean z11;
        Object objT2;
        cjx cjxVar;
        float fG;
        boolean zI;
        Object objT3;
        Object objT4;
        err0 err0Var;
        err0 err0Var2;
        float fO;
        boolean zI2;
        Object objT5;
        boolean z12;
        boolean z13;
        t24 t24Var2;
        gra graVar;
        gfh0 gfh0VarC;
        qim0 qim0Var5;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z14;
        n4k n4kVar;
        vu30 vu30Var;
        boolean z15;
        int i10;
        float f;
        vu30 vu30Var2;
        Object objT6;
        c9n c9nVar;
        qim0 qim0VarB;
        boolean z16;
        t24 t24Var3;
        boolean zI3;
        Object objT7;
        int i11;
        j2i j2iVar2 = j2iVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-696912919);
        j06 j06Var = x340Var.a;
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else if ((i & 6) == 0) {
            qim0Var2 = qim0Var;
            i3 = (x340Var.i(qim0Var2) ? 4 : 2) | i;
        } else {
            qim0Var2 = qim0Var;
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                n9d1Var3 = n9d1Var;
                i3 |= x340Var.g(n9d1Var3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    n9d1Var4 = n9d1Var2;
                    if (x340Var.g(n9d1Var4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        z2 = z;
                        if (x340Var.h(z2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if (x340Var.i(j2iVar2)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i3 |= i11;
                    }
                    if ((i3 & 9363) != 9362) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var.Y(i3 & 1, z3)) {
                        qim0Var4 = nim0.a;
                        if (i12 != 0) {
                            qim0Var2 = qim0Var4;
                        }
                        if (i13 != 0) {
                            n9d1Var7 = null;
                        } else {
                            n9d1Var7 = n9d1Var3;
                        }
                        if (i4 != 0) {
                            n9d1Var8 = null;
                        } else {
                            n9d1Var8 = n9d1Var4;
                        }
                        if (i6 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        flb0Var = (flb0) x340Var.k(t4k.n);
                        e9rVarA = wxa1.a(x340Var);
                        if (n9d1Var7 != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (n9d1Var8 != null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        boolean zH = x340Var.h(z6) | x340Var.h(z7);
                        if ((i3 & 7168) == 2048) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        zE = zH | z8 | x340Var.e(flb0Var.ordinal());
                        objT = x340Var.T();
                        w3vVar = w3v.b;
                        if (zE || objT == m4cVar) {
                            objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                            x340Var.s0(objT);
                        }
                        t24Var = (t24) objT;
                        hrr0 hrr0Var = t24Var.h;
                        hrr0 hrr0Var2 = t24Var.g;
                        Object value = hrr0Var.getValue();
                        boolean zI4 = x340Var.i(t24Var);
                        i8 = i3 & 112;
                        if (i8 == 32) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        boolean z17 = zI4 | z9;
                        i9 = i3;
                        if ((i3 & 896) == 256) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z17 | z10;
                        objT2 = x340Var.T();
                        if (z11 || objT2 == m4cVar) {
                            objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                            x340Var.s0(objT2);
                        }
                        qxd0.t(value, x340Var, (vu30) objT2);
                        cjxVar = (cjx) x340Var.k(us50.a);
                        fG = t24Var.g();
                        if (flb0Var != flb0.a) {
                            fG = -fG;
                        }
                        Object value2 = t24Var.i.getValue();
                        zI = x340Var.i(t24Var) | x340Var.d(fG) | x340Var.i(cjxVar);
                        objT3 = x340Var.T();
                        if (zI || objT3 == m4cVar) {
                            objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                            x340Var.s0(objT3);
                        }
                        qxd0.t(value2, x340Var, (vu30) objT3);
                        objT4 = x340Var.T();
                        if (objT4 == m4cVar) {
                            objT4 = bb00.h(0, x340Var);
                        }
                        err0Var = (hdn0) objT4;
                        err0Var2 = err0Var;
                        if (err0Var2.s() > 0) {
                            fO = yoi1.o(Math.abs(fG) / err0Var2.s(), 0.0f, 1.0f);
                        } else {
                            fO = 0.0f;
                        }
                        zI2 = x340Var.i(err0Var) | x340Var.i(t24Var) | x340Var.h(z6) | x340Var.e(flb0Var.ordinal()) | x340Var.h(z7);
                        objT5 = x340Var.T();
                        if (!zI2 || objT5 == m4cVar) {
                            z12 = z6;
                            z13 = z7;
                            objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                            t24Var2 = t24Var;
                            x340Var.s0(objT5);
                        } else {
                            z12 = z6;
                            z13 = z7;
                            t24Var2 = t24Var;
                        }
                        qim0 qim0VarU = lrn1.u(qim0Var2, (iu30) objT5);
                        graVar = een.d;
                        gfh0VarC = t1c.c(graVar, false);
                        qim0Var5 = qim0Var2;
                        float f2 = fG;
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, qim0VarU);
                        hzj.A.getClass();
                        if (j06Var != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        z14 = x340Var.S;
                        n4kVar = hmb0.t1;
                        if (z14) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        llj lljVar = y580.O0;
                        nko1.H(gfh0VarC, x340Var, lljVar);
                        vu30Var = y580.N0;
                        nko1.H(xos0VarM, x340Var, vu30Var);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        llj lljVar2 = y580.R0;
                        nko1.H(numValueOf, x340Var, lljVar2);
                        nko1.F(x340Var);
                        llj lljVar3 = y580.Y;
                        nko1.H(qim0VarE, x340Var, lljVar3);
                        if (n9d1Var7 != null || f2 <= 0.0f) {
                            z15 = z5;
                            i10 = 390;
                            f = fO;
                            vu30Var2 = vu30Var;
                            x340Var.i0(-906533153);
                            x340Var.r(false);
                        } else {
                            i10 = 390;
                            x340Var.i0(-906758988);
                            boolean z18 = z5;
                            vu30Var2 = vu30Var;
                            z15 = z18;
                            f = fO;
                            eth.d(n9d1Var7, x70.c, t24Var2.f(w3v.a), hrr0Var2.getValue() != w3vVar, f, x340Var, 390 | i8);
                            x340Var.r(false);
                        }
                        if (n9d1Var8 != null || f2 >= 0.0f) {
                            x340Var.i0(-906254401);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(-906474470);
                            eth.d(n9d1Var8, x70.d, t24Var2.f(w3v.c), hrr0Var2.getValue() != w3vVar, f, x340Var, i10 | ((i9 >> 3) & 112));
                            x340Var.r(false);
                        }
                        objT6 = x340Var.T();
                        if (objT6 == m4cVar) {
                            objT6 = qxd0.M(o6x.a, x340Var);
                            x340Var.s0(objT6);
                        }
                        c9nVar = (c9n) objT6;
                        x340Var.i0(-29229382);
                        vq60 vq60Var = jw80.a;
                        qim0VarB = u291.B(tsj0.a, (gra) null, 3);
                        if (z15) {
                            t24Var3 = t24Var2;
                            qim0 qim0VarB2 = f8d1.b(qim0Var4, t24Var3, new qxx(t24Var3, c9nVar, flb0Var, z12, z13));
                            zI3 = x340Var.i(t24Var3);
                            objT7 = x340Var.T();
                            if (!zI3 || objT7 == m4cVar) {
                                z16 = false;
                                objT7 = new mxx(t24Var3, (byte) 0);
                                x340Var.s0(objT7);
                            } else {
                                z16 = false;
                            }
                            qim0VarB = qim0VarB.then(eqr0.k(qim0VarB2, (iu30) objT7));
                        } else {
                            z16 = false;
                        }
                        x340Var.r(z16);
                        gfh0 gfh0VarC2 = t1c.c(graVar, true);
                        int iHashCode2 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM2 = x340Var.m();
                        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var, lljVar);
                        nko1.H(xos0VarM2, x340Var, vu30Var2);
                        x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE2, x340Var, lljVar3);
                        j2iVar2 = j2iVar;
                        k4s0.i((i9 >> 12) & 14, j2iVar2, x340Var, true, true);
                        z4 = z15;
                        qim0Var3 = qim0Var5;
                        n9d1Var5 = n9d1Var7;
                        n9d1Var6 = n9d1Var8;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        n9d1Var5 = n9d1Var3;
                        z4 = z2;
                        n9d1Var6 = n9d1Var4;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new oia(qim0Var3, n9d1Var5, n9d1Var6, z4, j2iVar2, i, i2);
                    }
                }
                i3 |= 3072;
                z2 = z;
                if ((i & 24576) == 0) {
                    if (x340Var.i(j2iVar2)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i3 |= i11;
                }
                if ((i3 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i3 & 1, z3)) {
                    qim0Var4 = nim0.a;
                    if (i12 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i13 != 0) {
                        n9d1Var7 = null;
                    } else {
                        n9d1Var7 = n9d1Var3;
                    }
                    if (i4 != 0) {
                        n9d1Var8 = null;
                    } else {
                        n9d1Var8 = n9d1Var4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    flb0Var = (flb0) x340Var.k(t4k.n);
                    e9rVarA = wxa1.a(x340Var);
                    if (n9d1Var7 != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (n9d1Var8 != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean zH2 = x340Var.h(z6) | x340Var.h(z7);
                    if ((i3 & 7168) == 2048) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    zE = zH2 | z8 | x340Var.e(flb0Var.ordinal());
                    objT = x340Var.T();
                    w3vVar = w3v.b;
                    if (zE) {
                        objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                        x340Var.s0(objT);
                    } else {
                        objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                        x340Var.s0(objT);
                    }
                    t24Var = (t24) objT;
                    hrr0 hrr0Var3 = t24Var.h;
                    hrr0 hrr0Var4 = t24Var.g;
                    Object value3 = hrr0Var3.getValue();
                    boolean zI5 = x340Var.i(t24Var);
                    i8 = i3 & 112;
                    if (i8 == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z19 = zI5 | z9;
                    i9 = i3;
                    if ((i3 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z19 | z10;
                    objT2 = x340Var.T();
                    if (z11) {
                        objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                        x340Var.s0(objT2);
                    }
                    qxd0.t(value3, x340Var, (vu30) objT2);
                    cjxVar = (cjx) x340Var.k(us50.a);
                    fG = t24Var.g();
                    if (flb0Var != flb0.a) {
                        fG = -fG;
                    }
                    Object value4 = t24Var.i.getValue();
                    zI = x340Var.i(t24Var) | x340Var.d(fG) | x340Var.i(cjxVar);
                    objT3 = x340Var.T();
                    if (zI) {
                        objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                        x340Var.s0(objT3);
                    }
                    qxd0.t(value4, x340Var, (vu30) objT3);
                    objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = bb00.h(0, x340Var);
                    }
                    err0Var = (hdn0) objT4;
                    err0Var2 = err0Var;
                    if (err0Var2.s() > 0) {
                        fO = yoi1.o(Math.abs(fG) / err0Var2.s(), 0.0f, 1.0f);
                    } else {
                        fO = 0.0f;
                    }
                    zI2 = x340Var.i(err0Var) | x340Var.i(t24Var) | x340Var.h(z6) | x340Var.e(flb0Var.ordinal()) | x340Var.h(z7);
                    objT5 = x340Var.T();
                    if (zI2) {
                        z12 = z6;
                        z13 = z7;
                        objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                        t24Var2 = t24Var;
                        x340Var.s0(objT5);
                    } else {
                        z12 = z6;
                        z13 = z7;
                        objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                        t24Var2 = t24Var;
                        x340Var.s0(objT5);
                    }
                    qim0 qim0VarU2 = lrn1.u(qim0Var2, (iu30) objT5);
                    graVar = een.d;
                    gfh0VarC = t1c.c(graVar, false);
                    qim0Var5 = qim0Var2;
                    float f3 = fG;
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarU2);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    z14 = x340Var.S;
                    n4kVar = hmb0.t1;
                    if (z14) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    llj lljVar4 = y580.O0;
                    nko1.H(gfh0VarC, x340Var, lljVar4);
                    vu30Var = y580.N0;
                    nko1.H(xos0VarM, x340Var, vu30Var);
                    Integer numValueOf2 = Integer.valueOf(iHashCode);
                    llj lljVar5 = y580.R0;
                    nko1.H(numValueOf2, x340Var, lljVar5);
                    nko1.F(x340Var);
                    llj lljVar6 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar6);
                    if (n9d1Var7 != null) {
                        z15 = z5;
                        i10 = 390;
                        f = fO;
                        vu30Var2 = vu30Var;
                        x340Var.i0(-906533153);
                        x340Var.r(false);
                    } else {
                        z15 = z5;
                        i10 = 390;
                        f = fO;
                        vu30Var2 = vu30Var;
                        x340Var.i0(-906533153);
                        x340Var.r(false);
                    }
                    if (n9d1Var8 != null) {
                        x340Var.i0(-906254401);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-906254401);
                        x340Var.r(false);
                    }
                    objT6 = x340Var.T();
                    if (objT6 == m4cVar) {
                        objT6 = qxd0.M(o6x.a, x340Var);
                        x340Var.s0(objT6);
                    }
                    c9nVar = (c9n) objT6;
                    x340Var.i0(-29229382);
                    vq60 vq60Var2 = jw80.a;
                    qim0VarB = u291.B(tsj0.a, (gra) null, 3);
                    if (z15) {
                        t24Var3 = t24Var2;
                        qim0 qim0VarB3 = f8d1.b(qim0Var4, t24Var3, new qxx(t24Var3, c9nVar, flb0Var, z12, z13));
                        zI3 = x340Var.i(t24Var3);
                        objT7 = x340Var.T();
                        if (zI3) {
                            z16 = false;
                            objT7 = new mxx(t24Var3, (byte) 0);
                            x340Var.s0(objT7);
                        } else {
                            z16 = false;
                            objT7 = new mxx(t24Var3, (byte) 0);
                            x340Var.s0(objT7);
                        }
                        qim0VarB = qim0VarB.then(eqr0.k(qim0VarB3, (iu30) objT7));
                    } else {
                        z16 = false;
                    }
                    x340Var.r(z16);
                    gfh0 gfh0VarC3 = t1c.c(graVar, true);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var, lljVar4);
                    nko1.H(xos0VarM3, x340Var, vu30Var2);
                    x0d.q(iHashCode3, x340Var, lljVar5, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar6);
                    j2iVar2 = j2iVar;
                    k4s0.i((i9 >> 12) & 14, j2iVar2, x340Var, true, true);
                    z4 = z15;
                    qim0Var3 = qim0Var5;
                    n9d1Var5 = n9d1Var7;
                    n9d1Var6 = n9d1Var8;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    n9d1Var5 = n9d1Var3;
                    z4 = z2;
                    n9d1Var6 = n9d1Var4;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new oia(qim0Var3, n9d1Var5, n9d1Var6, z4, j2iVar2, i, i2);
                }
            }
            i3 |= 384;
            n9d1Var4 = n9d1Var2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (x340Var.i(j2iVar2)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i3 |= i11;
                }
                if ((i3 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i3 & 1, z3)) {
                    qim0Var4 = nim0.a;
                    if (i12 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i13 != 0) {
                        n9d1Var7 = null;
                    } else {
                        n9d1Var7 = n9d1Var3;
                    }
                    if (i4 != 0) {
                        n9d1Var8 = null;
                    } else {
                        n9d1Var8 = n9d1Var4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    flb0Var = (flb0) x340Var.k(t4k.n);
                    e9rVarA = wxa1.a(x340Var);
                    if (n9d1Var7 != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (n9d1Var8 != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean zH3 = x340Var.h(z6) | x340Var.h(z7);
                    if ((i3 & 7168) == 2048) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    zE = zH3 | z8 | x340Var.e(flb0Var.ordinal());
                    objT = x340Var.T();
                    w3vVar = w3v.b;
                    if (zE) {
                        objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                        x340Var.s0(objT);
                    } else {
                        objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                        x340Var.s0(objT);
                    }
                    t24Var = (t24) objT;
                    hrr0 hrr0Var5 = t24Var.h;
                    hrr0 hrr0Var6 = t24Var.g;
                    Object value5 = hrr0Var5.getValue();
                    boolean zI6 = x340Var.i(t24Var);
                    i8 = i3 & 112;
                    if (i8 == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z110 = zI6 | z9;
                    i9 = i3;
                    if ((i3 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z110 | z10;
                    objT2 = x340Var.T();
                    if (z11) {
                        objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                        x340Var.s0(objT2);
                    }
                    qxd0.t(value5, x340Var, (vu30) objT2);
                    cjxVar = (cjx) x340Var.k(us50.a);
                    fG = t24Var.g();
                    if (flb0Var != flb0.a) {
                        fG = -fG;
                    }
                    Object value6 = t24Var.i.getValue();
                    zI = x340Var.i(t24Var) | x340Var.d(fG) | x340Var.i(cjxVar);
                    objT3 = x340Var.T();
                    if (zI) {
                        objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                        x340Var.s0(objT3);
                    }
                    qxd0.t(value6, x340Var, (vu30) objT3);
                    objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = bb00.h(0, x340Var);
                    }
                    err0Var = (hdn0) objT4;
                    err0Var2 = err0Var;
                    if (err0Var2.s() > 0) {
                        fO = yoi1.o(Math.abs(fG) / err0Var2.s(), 0.0f, 1.0f);
                    } else {
                        fO = 0.0f;
                    }
                    zI2 = x340Var.i(err0Var) | x340Var.i(t24Var) | x340Var.h(z6) | x340Var.e(flb0Var.ordinal()) | x340Var.h(z7);
                    objT5 = x340Var.T();
                    if (zI2) {
                        z12 = z6;
                        z13 = z7;
                        objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                        t24Var2 = t24Var;
                        x340Var.s0(objT5);
                    } else {
                        z12 = z6;
                        z13 = z7;
                        objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                        t24Var2 = t24Var;
                        x340Var.s0(objT5);
                    }
                    qim0 qim0VarU3 = lrn1.u(qim0Var2, (iu30) objT5);
                    graVar = een.d;
                    gfh0VarC = t1c.c(graVar, false);
                    qim0Var5 = qim0Var2;
                    float f4 = fG;
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarU3);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    z14 = x340Var.S;
                    n4kVar = hmb0.t1;
                    if (z14) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    llj lljVar7 = y580.O0;
                    nko1.H(gfh0VarC, x340Var, lljVar7);
                    vu30Var = y580.N0;
                    nko1.H(xos0VarM, x340Var, vu30Var);
                    Integer numValueOf3 = Integer.valueOf(iHashCode);
                    llj lljVar8 = y580.R0;
                    nko1.H(numValueOf3, x340Var, lljVar8);
                    nko1.F(x340Var);
                    llj lljVar9 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar9);
                    if (n9d1Var7 != null) {
                        z15 = z5;
                        i10 = 390;
                        f = fO;
                        vu30Var2 = vu30Var;
                        x340Var.i0(-906533153);
                        x340Var.r(false);
                    } else {
                        z15 = z5;
                        i10 = 390;
                        f = fO;
                        vu30Var2 = vu30Var;
                        x340Var.i0(-906533153);
                        x340Var.r(false);
                    }
                    if (n9d1Var8 != null) {
                        x340Var.i0(-906254401);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-906254401);
                        x340Var.r(false);
                    }
                    objT6 = x340Var.T();
                    if (objT6 == m4cVar) {
                        objT6 = qxd0.M(o6x.a, x340Var);
                        x340Var.s0(objT6);
                    }
                    c9nVar = (c9n) objT6;
                    x340Var.i0(-29229382);
                    vq60 vq60Var3 = jw80.a;
                    qim0VarB = u291.B(tsj0.a, (gra) null, 3);
                    if (z15) {
                        t24Var3 = t24Var2;
                        qim0 qim0VarB4 = f8d1.b(qim0Var4, t24Var3, new qxx(t24Var3, c9nVar, flb0Var, z12, z13));
                        zI3 = x340Var.i(t24Var3);
                        objT7 = x340Var.T();
                        if (zI3) {
                            z16 = false;
                            objT7 = new mxx(t24Var3, (byte) 0);
                            x340Var.s0(objT7);
                        } else {
                            z16 = false;
                            objT7 = new mxx(t24Var3, (byte) 0);
                            x340Var.s0(objT7);
                        }
                        qim0VarB = qim0VarB.then(eqr0.k(qim0VarB4, (iu30) objT7));
                    } else {
                        z16 = false;
                    }
                    x340Var.r(z16);
                    gfh0 gfh0VarC4 = t1c.c(graVar, true);
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC4, x340Var, lljVar7);
                    nko1.H(xos0VarM4, x340Var, vu30Var2);
                    x0d.q(iHashCode4, x340Var, lljVar8, x340Var);
                    nko1.H(qim0VarE4, x340Var, lljVar9);
                    j2iVar2 = j2iVar;
                    k4s0.i((i9 >> 12) & 14, j2iVar2, x340Var, true, true);
                    z4 = z15;
                    qim0Var3 = qim0Var5;
                    n9d1Var5 = n9d1Var7;
                    n9d1Var6 = n9d1Var8;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    n9d1Var5 = n9d1Var3;
                    z4 = z2;
                    n9d1Var6 = n9d1Var4;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new oia(qim0Var3, n9d1Var5, n9d1Var6, z4, j2iVar2, i, i2);
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
                if (x340Var.i(j2iVar2)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i3 |= i11;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                qim0Var4 = nim0.a;
                if (i12 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if (i13 != 0) {
                    n9d1Var7 = null;
                } else {
                    n9d1Var7 = n9d1Var3;
                }
                if (i4 != 0) {
                    n9d1Var8 = null;
                } else {
                    n9d1Var8 = n9d1Var4;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                flb0Var = (flb0) x340Var.k(t4k.n);
                e9rVarA = wxa1.a(x340Var);
                if (n9d1Var7 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (n9d1Var8 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zH4 = x340Var.h(z6) | x340Var.h(z7);
                if ((i3 & 7168) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zE = zH4 | z8 | x340Var.e(flb0Var.ordinal());
                objT = x340Var.T();
                w3vVar = w3v.b;
                if (zE) {
                    objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                    x340Var.s0(objT);
                } else {
                    objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                    x340Var.s0(objT);
                }
                t24Var = (t24) objT;
                hrr0 hrr0Var7 = t24Var.h;
                hrr0 hrr0Var8 = t24Var.g;
                Object value7 = hrr0Var7.getValue();
                boolean zI7 = x340Var.i(t24Var);
                i8 = i3 & 112;
                if (i8 == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z111 = zI7 | z9;
                i9 = i3;
                if ((i3 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z111 | z10;
                objT2 = x340Var.T();
                if (z11) {
                    objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                    x340Var.s0(objT2);
                }
                qxd0.t(value7, x340Var, (vu30) objT2);
                cjxVar = (cjx) x340Var.k(us50.a);
                fG = t24Var.g();
                if (flb0Var != flb0.a) {
                    fG = -fG;
                }
                Object value8 = t24Var.i.getValue();
                zI = x340Var.i(t24Var) | x340Var.d(fG) | x340Var.i(cjxVar);
                objT3 = x340Var.T();
                if (zI) {
                    objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                    x340Var.s0(objT3);
                }
                qxd0.t(value8, x340Var, (vu30) objT3);
                objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = bb00.h(0, x340Var);
                }
                err0Var = (hdn0) objT4;
                err0Var2 = err0Var;
                if (err0Var2.s() > 0) {
                    fO = yoi1.o(Math.abs(fG) / err0Var2.s(), 0.0f, 1.0f);
                } else {
                    fO = 0.0f;
                }
                zI2 = x340Var.i(err0Var) | x340Var.i(t24Var) | x340Var.h(z6) | x340Var.e(flb0Var.ordinal()) | x340Var.h(z7);
                objT5 = x340Var.T();
                if (zI2) {
                    z12 = z6;
                    z13 = z7;
                    objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                    t24Var2 = t24Var;
                    x340Var.s0(objT5);
                } else {
                    z12 = z6;
                    z13 = z7;
                    objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                    t24Var2 = t24Var;
                    x340Var.s0(objT5);
                }
                qim0 qim0VarU4 = lrn1.u(qim0Var2, (iu30) objT5);
                graVar = een.d;
                gfh0VarC = t1c.c(graVar, false);
                qim0Var5 = qim0Var2;
                float f5 = fG;
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarU4);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z14 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z14) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar10 = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar10);
                vu30Var = y580.N0;
                nko1.H(xos0VarM, x340Var, vu30Var);
                Integer numValueOf4 = Integer.valueOf(iHashCode);
                llj lljVar11 = y580.R0;
                nko1.H(numValueOf4, x340Var, lljVar11);
                nko1.F(x340Var);
                llj lljVar12 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar12);
                if (n9d1Var7 != null) {
                    z15 = z5;
                    i10 = 390;
                    f = fO;
                    vu30Var2 = vu30Var;
                    x340Var.i0(-906533153);
                    x340Var.r(false);
                } else {
                    z15 = z5;
                    i10 = 390;
                    f = fO;
                    vu30Var2 = vu30Var;
                    x340Var.i0(-906533153);
                    x340Var.r(false);
                }
                if (n9d1Var8 != null) {
                    x340Var.i0(-906254401);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-906254401);
                    x340Var.r(false);
                }
                objT6 = x340Var.T();
                if (objT6 == m4cVar) {
                    objT6 = qxd0.M(o6x.a, x340Var);
                    x340Var.s0(objT6);
                }
                c9nVar = (c9n) objT6;
                x340Var.i0(-29229382);
                vq60 vq60Var4 = jw80.a;
                qim0VarB = u291.B(tsj0.a, (gra) null, 3);
                if (z15) {
                    t24Var3 = t24Var2;
                    qim0 qim0VarB5 = f8d1.b(qim0Var4, t24Var3, new qxx(t24Var3, c9nVar, flb0Var, z12, z13));
                    zI3 = x340Var.i(t24Var3);
                    objT7 = x340Var.T();
                    if (zI3) {
                        z16 = false;
                        objT7 = new mxx(t24Var3, (byte) 0);
                        x340Var.s0(objT7);
                    } else {
                        z16 = false;
                        objT7 = new mxx(t24Var3, (byte) 0);
                        x340Var.s0(objT7);
                    }
                    qim0VarB = qim0VarB.then(eqr0.k(qim0VarB5, (iu30) objT7));
                } else {
                    z16 = false;
                }
                x340Var.r(z16);
                gfh0 gfh0VarC5 = t1c.c(graVar, true);
                int iHashCode5 = Long.hashCode(x340Var.T);
                xos0 xos0VarM5 = x340Var.m();
                qim0 qim0VarE5 = zr7.E(x340Var, qim0VarB);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC5, x340Var, lljVar10);
                nko1.H(xos0VarM5, x340Var, vu30Var2);
                x0d.q(iHashCode5, x340Var, lljVar11, x340Var);
                nko1.H(qim0VarE5, x340Var, lljVar12);
                j2iVar2 = j2iVar;
                k4s0.i((i9 >> 12) & 14, j2iVar2, x340Var, true, true);
                z4 = z15;
                qim0Var3 = qim0Var5;
                n9d1Var5 = n9d1Var7;
                n9d1Var6 = n9d1Var8;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                n9d1Var5 = n9d1Var3;
                z4 = z2;
                n9d1Var6 = n9d1Var4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new oia(qim0Var3, n9d1Var5, n9d1Var6, z4, j2iVar2, i, i2);
            }
        }
        i3 |= 48;
        n9d1Var3 = n9d1Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                n9d1Var4 = n9d1Var2;
                if (x340Var.g(n9d1Var4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if (x340Var.i(j2iVar2)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i3 |= i11;
                }
                if ((i3 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i3 & 1, z3)) {
                    qim0Var4 = nim0.a;
                    if (i12 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if (i13 != 0) {
                        n9d1Var7 = null;
                    } else {
                        n9d1Var7 = n9d1Var3;
                    }
                    if (i4 != 0) {
                        n9d1Var8 = null;
                    } else {
                        n9d1Var8 = n9d1Var4;
                    }
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    flb0Var = (flb0) x340Var.k(t4k.n);
                    e9rVarA = wxa1.a(x340Var);
                    if (n9d1Var7 != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (n9d1Var8 != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean zH5 = x340Var.h(z6) | x340Var.h(z7);
                    if ((i3 & 7168) == 2048) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    zE = zH5 | z8 | x340Var.e(flb0Var.ordinal());
                    objT = x340Var.T();
                    w3vVar = w3v.b;
                    if (zE) {
                        objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                        x340Var.s0(objT);
                    } else {
                        objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                        x340Var.s0(objT);
                    }
                    t24Var = (t24) objT;
                    hrr0 hrr0Var9 = t24Var.h;
                    hrr0 hrr0Var10 = t24Var.g;
                    Object value9 = hrr0Var9.getValue();
                    boolean zI8 = x340Var.i(t24Var);
                    i8 = i3 & 112;
                    if (i8 == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z112 = zI8 | z9;
                    i9 = i3;
                    if ((i3 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z112 | z10;
                    objT2 = x340Var.T();
                    if (z11) {
                        objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                        x340Var.s0(objT2);
                    }
                    qxd0.t(value9, x340Var, (vu30) objT2);
                    cjxVar = (cjx) x340Var.k(us50.a);
                    fG = t24Var.g();
                    if (flb0Var != flb0.a) {
                        fG = -fG;
                    }
                    Object value10 = t24Var.i.getValue();
                    zI = x340Var.i(t24Var) | x340Var.d(fG) | x340Var.i(cjxVar);
                    objT3 = x340Var.T();
                    if (zI) {
                        objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                        x340Var.s0(objT3);
                    } else {
                        objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                        x340Var.s0(objT3);
                    }
                    qxd0.t(value10, x340Var, (vu30) objT3);
                    objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = bb00.h(0, x340Var);
                    }
                    err0Var = (hdn0) objT4;
                    err0Var2 = err0Var;
                    if (err0Var2.s() > 0) {
                        fO = yoi1.o(Math.abs(fG) / err0Var2.s(), 0.0f, 1.0f);
                    } else {
                        fO = 0.0f;
                    }
                    zI2 = x340Var.i(err0Var) | x340Var.i(t24Var) | x340Var.h(z6) | x340Var.e(flb0Var.ordinal()) | x340Var.h(z7);
                    objT5 = x340Var.T();
                    if (zI2) {
                        z12 = z6;
                        z13 = z7;
                        objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                        t24Var2 = t24Var;
                        x340Var.s0(objT5);
                    } else {
                        z12 = z6;
                        z13 = z7;
                        objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                        t24Var2 = t24Var;
                        x340Var.s0(objT5);
                    }
                    qim0 qim0VarU5 = lrn1.u(qim0Var2, (iu30) objT5);
                    graVar = een.d;
                    gfh0VarC = t1c.c(graVar, false);
                    qim0Var5 = qim0Var2;
                    float f6 = fG;
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarU5);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    z14 = x340Var.S;
                    n4kVar = hmb0.t1;
                    if (z14) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    llj lljVar13 = y580.O0;
                    nko1.H(gfh0VarC, x340Var, lljVar13);
                    vu30Var = y580.N0;
                    nko1.H(xos0VarM, x340Var, vu30Var);
                    Integer numValueOf5 = Integer.valueOf(iHashCode);
                    llj lljVar14 = y580.R0;
                    nko1.H(numValueOf5, x340Var, lljVar14);
                    nko1.F(x340Var);
                    llj lljVar15 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar15);
                    if (n9d1Var7 != null) {
                        z15 = z5;
                        i10 = 390;
                        f = fO;
                        vu30Var2 = vu30Var;
                        x340Var.i0(-906533153);
                        x340Var.r(false);
                    } else {
                        z15 = z5;
                        i10 = 390;
                        f = fO;
                        vu30Var2 = vu30Var;
                        x340Var.i0(-906533153);
                        x340Var.r(false);
                    }
                    if (n9d1Var8 != null) {
                        x340Var.i0(-906254401);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-906254401);
                        x340Var.r(false);
                    }
                    objT6 = x340Var.T();
                    if (objT6 == m4cVar) {
                        objT6 = qxd0.M(o6x.a, x340Var);
                        x340Var.s0(objT6);
                    }
                    c9nVar = (c9n) objT6;
                    x340Var.i0(-29229382);
                    vq60 vq60Var5 = jw80.a;
                    qim0VarB = u291.B(tsj0.a, (gra) null, 3);
                    if (z15) {
                        t24Var3 = t24Var2;
                        qim0 qim0VarB6 = f8d1.b(qim0Var4, t24Var3, new qxx(t24Var3, c9nVar, flb0Var, z12, z13));
                        zI3 = x340Var.i(t24Var3);
                        objT7 = x340Var.T();
                        if (zI3) {
                            z16 = false;
                            objT7 = new mxx(t24Var3, (byte) 0);
                            x340Var.s0(objT7);
                        } else {
                            z16 = false;
                            objT7 = new mxx(t24Var3, (byte) 0);
                            x340Var.s0(objT7);
                        }
                        qim0VarB = qim0VarB.then(eqr0.k(qim0VarB6, (iu30) objT7));
                    } else {
                        z16 = false;
                    }
                    x340Var.r(z16);
                    gfh0 gfh0VarC6 = t1c.c(graVar, true);
                    int iHashCode6 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM6 = x340Var.m();
                    qim0 qim0VarE6 = zr7.E(x340Var, qim0VarB);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC6, x340Var, lljVar13);
                    nko1.H(xos0VarM6, x340Var, vu30Var2);
                    x0d.q(iHashCode6, x340Var, lljVar14, x340Var);
                    nko1.H(qim0VarE6, x340Var, lljVar15);
                    j2iVar2 = j2iVar;
                    k4s0.i((i9 >> 12) & 14, j2iVar2, x340Var, true, true);
                    z4 = z15;
                    qim0Var3 = qim0Var5;
                    n9d1Var5 = n9d1Var7;
                    n9d1Var6 = n9d1Var8;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    n9d1Var5 = n9d1Var3;
                    z4 = z2;
                    n9d1Var6 = n9d1Var4;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new oia(qim0Var3, n9d1Var5, n9d1Var6, z4, j2iVar2, i, i2);
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
                if (x340Var.i(j2iVar2)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i3 |= i11;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                qim0Var4 = nim0.a;
                if (i12 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if (i13 != 0) {
                    n9d1Var7 = null;
                } else {
                    n9d1Var7 = n9d1Var3;
                }
                if (i4 != 0) {
                    n9d1Var8 = null;
                } else {
                    n9d1Var8 = n9d1Var4;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                flb0Var = (flb0) x340Var.k(t4k.n);
                e9rVarA = wxa1.a(x340Var);
                if (n9d1Var7 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (n9d1Var8 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zH6 = x340Var.h(z6) | x340Var.h(z7);
                if ((i3 & 7168) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zE = zH6 | z8 | x340Var.e(flb0Var.ordinal());
                objT = x340Var.T();
                w3vVar = w3v.b;
                if (zE) {
                    objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                    x340Var.s0(objT);
                } else {
                    objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                    x340Var.s0(objT);
                }
                t24Var = (t24) objT;
                hrr0 hrr0Var11 = t24Var.h;
                hrr0 hrr0Var12 = t24Var.g;
                Object value11 = hrr0Var11.getValue();
                boolean zI9 = x340Var.i(t24Var);
                i8 = i3 & 112;
                if (i8 == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z113 = zI9 | z9;
                i9 = i3;
                if ((i3 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z113 | z10;
                objT2 = x340Var.T();
                if (z11) {
                    objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                    x340Var.s0(objT2);
                }
                qxd0.t(value11, x340Var, (vu30) objT2);
                cjxVar = (cjx) x340Var.k(us50.a);
                fG = t24Var.g();
                if (flb0Var != flb0.a) {
                    fG = -fG;
                }
                Object value12 = t24Var.i.getValue();
                zI = x340Var.i(t24Var) | x340Var.d(fG) | x340Var.i(cjxVar);
                objT3 = x340Var.T();
                if (zI) {
                    objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                    x340Var.s0(objT3);
                }
                qxd0.t(value12, x340Var, (vu30) objT3);
                objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = bb00.h(0, x340Var);
                }
                err0Var = (hdn0) objT4;
                err0Var2 = err0Var;
                if (err0Var2.s() > 0) {
                    fO = yoi1.o(Math.abs(fG) / err0Var2.s(), 0.0f, 1.0f);
                } else {
                    fO = 0.0f;
                }
                zI2 = x340Var.i(err0Var) | x340Var.i(t24Var) | x340Var.h(z6) | x340Var.e(flb0Var.ordinal()) | x340Var.h(z7);
                objT5 = x340Var.T();
                if (zI2) {
                    z12 = z6;
                    z13 = z7;
                    objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                    t24Var2 = t24Var;
                    x340Var.s0(objT5);
                } else {
                    z12 = z6;
                    z13 = z7;
                    objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                    t24Var2 = t24Var;
                    x340Var.s0(objT5);
                }
                qim0 qim0VarU6 = lrn1.u(qim0Var2, (iu30) objT5);
                graVar = een.d;
                gfh0VarC = t1c.c(graVar, false);
                qim0Var5 = qim0Var2;
                float f7 = fG;
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarU6);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z14 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z14) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar16 = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar16);
                vu30Var = y580.N0;
                nko1.H(xos0VarM, x340Var, vu30Var);
                Integer numValueOf6 = Integer.valueOf(iHashCode);
                llj lljVar17 = y580.R0;
                nko1.H(numValueOf6, x340Var, lljVar17);
                nko1.F(x340Var);
                llj lljVar18 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar18);
                if (n9d1Var7 != null) {
                    z15 = z5;
                    i10 = 390;
                    f = fO;
                    vu30Var2 = vu30Var;
                    x340Var.i0(-906533153);
                    x340Var.r(false);
                } else {
                    z15 = z5;
                    i10 = 390;
                    f = fO;
                    vu30Var2 = vu30Var;
                    x340Var.i0(-906533153);
                    x340Var.r(false);
                }
                if (n9d1Var8 != null) {
                    x340Var.i0(-906254401);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-906254401);
                    x340Var.r(false);
                }
                objT6 = x340Var.T();
                if (objT6 == m4cVar) {
                    objT6 = qxd0.M(o6x.a, x340Var);
                    x340Var.s0(objT6);
                }
                c9nVar = (c9n) objT6;
                x340Var.i0(-29229382);
                vq60 vq60Var6 = jw80.a;
                qim0VarB = u291.B(tsj0.a, (gra) null, 3);
                if (z15) {
                    t24Var3 = t24Var2;
                    qim0 qim0VarB7 = f8d1.b(qim0Var4, t24Var3, new qxx(t24Var3, c9nVar, flb0Var, z12, z13));
                    zI3 = x340Var.i(t24Var3);
                    objT7 = x340Var.T();
                    if (zI3) {
                        z16 = false;
                        objT7 = new mxx(t24Var3, (byte) 0);
                        x340Var.s0(objT7);
                    } else {
                        z16 = false;
                        objT7 = new mxx(t24Var3, (byte) 0);
                        x340Var.s0(objT7);
                    }
                    qim0VarB = qim0VarB.then(eqr0.k(qim0VarB7, (iu30) objT7));
                } else {
                    z16 = false;
                }
                x340Var.r(z16);
                gfh0 gfh0VarC7 = t1c.c(graVar, true);
                int iHashCode7 = Long.hashCode(x340Var.T);
                xos0 xos0VarM7 = x340Var.m();
                qim0 qim0VarE7 = zr7.E(x340Var, qim0VarB);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC7, x340Var, lljVar16);
                nko1.H(xos0VarM7, x340Var, vu30Var2);
                x0d.q(iHashCode7, x340Var, lljVar17, x340Var);
                nko1.H(qim0VarE7, x340Var, lljVar18);
                j2iVar2 = j2iVar;
                k4s0.i((i9 >> 12) & 14, j2iVar2, x340Var, true, true);
                z4 = z15;
                qim0Var3 = qim0Var5;
                n9d1Var5 = n9d1Var7;
                n9d1Var6 = n9d1Var8;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                n9d1Var5 = n9d1Var3;
                z4 = z2;
                n9d1Var6 = n9d1Var4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new oia(qim0Var3, n9d1Var5, n9d1Var6, z4, j2iVar2, i, i2);
            }
        }
        i3 |= 384;
        n9d1Var4 = n9d1Var2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (x340Var.h(z2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if (x340Var.i(j2iVar2)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i3 |= i11;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                qim0Var4 = nim0.a;
                if (i12 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if (i13 != 0) {
                    n9d1Var7 = null;
                } else {
                    n9d1Var7 = n9d1Var3;
                }
                if (i4 != 0) {
                    n9d1Var8 = null;
                } else {
                    n9d1Var8 = n9d1Var4;
                }
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                flb0Var = (flb0) x340Var.k(t4k.n);
                e9rVarA = wxa1.a(x340Var);
                if (n9d1Var7 != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (n9d1Var8 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean zH7 = x340Var.h(z6) | x340Var.h(z7);
                if ((i3 & 7168) == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zE = zH7 | z8 | x340Var.e(flb0Var.ordinal());
                objT = x340Var.T();
                w3vVar = w3v.b;
                if (zE) {
                    objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                    x340Var.s0(objT);
                } else {
                    objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                    x340Var.s0(objT);
                }
                t24Var = (t24) objT;
                hrr0 hrr0Var13 = t24Var.h;
                hrr0 hrr0Var14 = t24Var.g;
                Object value13 = hrr0Var13.getValue();
                boolean zI10 = x340Var.i(t24Var);
                i8 = i3 & 112;
                if (i8 == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z114 = zI10 | z9;
                i9 = i3;
                if ((i3 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z114 | z10;
                objT2 = x340Var.T();
                if (z11) {
                    objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                    x340Var.s0(objT2);
                }
                qxd0.t(value13, x340Var, (vu30) objT2);
                cjxVar = (cjx) x340Var.k(us50.a);
                fG = t24Var.g();
                if (flb0Var != flb0.a) {
                    fG = -fG;
                }
                Object value14 = t24Var.i.getValue();
                zI = x340Var.i(t24Var) | x340Var.d(fG) | x340Var.i(cjxVar);
                objT3 = x340Var.T();
                if (zI) {
                    objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                    x340Var.s0(objT3);
                }
                qxd0.t(value14, x340Var, (vu30) objT3);
                objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = bb00.h(0, x340Var);
                }
                err0Var = (hdn0) objT4;
                err0Var2 = err0Var;
                if (err0Var2.s() > 0) {
                    fO = yoi1.o(Math.abs(fG) / err0Var2.s(), 0.0f, 1.0f);
                } else {
                    fO = 0.0f;
                }
                zI2 = x340Var.i(err0Var) | x340Var.i(t24Var) | x340Var.h(z6) | x340Var.e(flb0Var.ordinal()) | x340Var.h(z7);
                objT5 = x340Var.T();
                if (zI2) {
                    z12 = z6;
                    z13 = z7;
                    objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                    t24Var2 = t24Var;
                    x340Var.s0(objT5);
                } else {
                    z12 = z6;
                    z13 = z7;
                    objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                    t24Var2 = t24Var;
                    x340Var.s0(objT5);
                }
                qim0 qim0VarU7 = lrn1.u(qim0Var2, (iu30) objT5);
                graVar = een.d;
                gfh0VarC = t1c.c(graVar, false);
                qim0Var5 = qim0Var2;
                float f8 = fG;
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarU7);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z14 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z14) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar19 = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar19);
                vu30Var = y580.N0;
                nko1.H(xos0VarM, x340Var, vu30Var);
                Integer numValueOf7 = Integer.valueOf(iHashCode);
                llj lljVar110 = y580.R0;
                nko1.H(numValueOf7, x340Var, lljVar110);
                nko1.F(x340Var);
                llj lljVar111 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar111);
                if (n9d1Var7 != null) {
                    z15 = z5;
                    i10 = 390;
                    f = fO;
                    vu30Var2 = vu30Var;
                    x340Var.i0(-906533153);
                    x340Var.r(false);
                } else {
                    z15 = z5;
                    i10 = 390;
                    f = fO;
                    vu30Var2 = vu30Var;
                    x340Var.i0(-906533153);
                    x340Var.r(false);
                }
                if (n9d1Var8 != null) {
                    x340Var.i0(-906254401);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-906254401);
                    x340Var.r(false);
                }
                objT6 = x340Var.T();
                if (objT6 == m4cVar) {
                    objT6 = qxd0.M(o6x.a, x340Var);
                    x340Var.s0(objT6);
                }
                c9nVar = (c9n) objT6;
                x340Var.i0(-29229382);
                vq60 vq60Var7 = jw80.a;
                qim0VarB = u291.B(tsj0.a, (gra) null, 3);
                if (z15) {
                    t24Var3 = t24Var2;
                    qim0 qim0VarB8 = f8d1.b(qim0Var4, t24Var3, new qxx(t24Var3, c9nVar, flb0Var, z12, z13));
                    zI3 = x340Var.i(t24Var3);
                    objT7 = x340Var.T();
                    if (zI3) {
                        z16 = false;
                        objT7 = new mxx(t24Var3, (byte) 0);
                        x340Var.s0(objT7);
                    } else {
                        z16 = false;
                        objT7 = new mxx(t24Var3, (byte) 0);
                        x340Var.s0(objT7);
                    }
                    qim0VarB = qim0VarB.then(eqr0.k(qim0VarB8, (iu30) objT7));
                } else {
                    z16 = false;
                }
                x340Var.r(z16);
                gfh0 gfh0VarC8 = t1c.c(graVar, true);
                int iHashCode8 = Long.hashCode(x340Var.T);
                xos0 xos0VarM8 = x340Var.m();
                qim0 qim0VarE8 = zr7.E(x340Var, qim0VarB);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC8, x340Var, lljVar19);
                nko1.H(xos0VarM8, x340Var, vu30Var2);
                x0d.q(iHashCode8, x340Var, lljVar110, x340Var);
                nko1.H(qim0VarE8, x340Var, lljVar111);
                j2iVar2 = j2iVar;
                k4s0.i((i9 >> 12) & 14, j2iVar2, x340Var, true, true);
                z4 = z15;
                qim0Var3 = qim0Var5;
                n9d1Var5 = n9d1Var7;
                n9d1Var6 = n9d1Var8;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                n9d1Var5 = n9d1Var3;
                z4 = z2;
                n9d1Var6 = n9d1Var4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new oia(qim0Var3, n9d1Var5, n9d1Var6, z4, j2iVar2, i, i2);
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            if (x340Var.i(j2iVar2)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i3 |= i11;
        }
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            qim0Var4 = nim0.a;
            if (i12 != 0) {
                qim0Var2 = qim0Var4;
            }
            if (i13 != 0) {
                n9d1Var7 = null;
            } else {
                n9d1Var7 = n9d1Var3;
            }
            if (i4 != 0) {
                n9d1Var8 = null;
            } else {
                n9d1Var8 = n9d1Var4;
            }
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            flb0Var = (flb0) x340Var.k(t4k.n);
            e9rVarA = wxa1.a(x340Var);
            if (n9d1Var7 != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (n9d1Var8 != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean zH8 = x340Var.h(z6) | x340Var.h(z7);
            if ((i3 & 7168) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            zE = zH8 | z8 | x340Var.e(flb0Var.ordinal());
            objT = x340Var.T();
            w3vVar = w3v.b;
            if (zE) {
                objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                x340Var.s0(objT);
            } else {
                objT = wm5.e(w3vVar, wm5.f(new nxx(z6, flb0Var, z7, (byte) 0)), s8x.U0, oxx.b, irn1.l0(0.0f, 0.0f, null, 7), e9rVarA);
                x340Var.s0(objT);
            }
            t24Var = (t24) objT;
            hrr0 hrr0Var15 = t24Var.h;
            hrr0 hrr0Var16 = t24Var.g;
            Object value15 = hrr0Var15.getValue();
            boolean zI11 = x340Var.i(t24Var);
            i8 = i3 & 112;
            if (i8 == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z115 = zI11 | z9;
            i9 = i3;
            if ((i3 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z115 | z10;
            objT2 = x340Var.T();
            if (z11) {
                objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                x340Var.s0(objT2);
            } else {
                objT2 = new hxn(t24Var, n9d1Var7, n9d1Var8, (lnm) null, (byte) 28);
                x340Var.s0(objT2);
            }
            qxd0.t(value15, x340Var, (vu30) objT2);
            cjxVar = (cjx) x340Var.k(us50.a);
            fG = t24Var.g();
            if (flb0Var != flb0.a) {
                fG = -fG;
            }
            Object value16 = t24Var.i.getValue();
            zI = x340Var.i(t24Var) | x340Var.d(fG) | x340Var.i(cjxVar);
            objT3 = x340Var.T();
            if (zI) {
                objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                x340Var.s0(objT3);
            } else {
                objT3 = new kxx(t24Var, fG, cjxVar, (lnm) null);
                x340Var.s0(objT3);
            }
            qxd0.t(value16, x340Var, (vu30) objT3);
            objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = bb00.h(0, x340Var);
            }
            err0Var = (hdn0) objT4;
            err0Var2 = err0Var;
            if (err0Var2.s() > 0) {
                fO = yoi1.o(Math.abs(fG) / err0Var2.s(), 0.0f, 1.0f);
            } else {
                fO = 0.0f;
            }
            zI2 = x340Var.i(err0Var) | x340Var.i(t24Var) | x340Var.h(z6) | x340Var.e(flb0Var.ordinal()) | x340Var.h(z7);
            objT5 = x340Var.T();
            if (zI2) {
                z12 = z6;
                z13 = z7;
                objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                t24Var2 = t24Var;
                x340Var.s0(objT5);
            } else {
                z12 = z6;
                z13 = z7;
                objT5 = new ne3((byte) 2, t24Var, err0Var, flb0Var, z12, z13);
                t24Var2 = t24Var;
                x340Var.s0(objT5);
            }
            qim0 qim0VarU8 = lrn1.u(qim0Var2, (iu30) objT5);
            graVar = een.d;
            gfh0VarC = t1c.c(graVar, false);
            qim0Var5 = qim0Var2;
            float f9 = fG;
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarU8);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z14 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z14) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar112 = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar112);
            vu30Var = y580.N0;
            nko1.H(xos0VarM, x340Var, vu30Var);
            Integer numValueOf8 = Integer.valueOf(iHashCode);
            llj lljVar113 = y580.R0;
            nko1.H(numValueOf8, x340Var, lljVar113);
            nko1.F(x340Var);
            llj lljVar114 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar114);
            if (n9d1Var7 != null) {
                z15 = z5;
                i10 = 390;
                f = fO;
                vu30Var2 = vu30Var;
                x340Var.i0(-906533153);
                x340Var.r(false);
            } else {
                z15 = z5;
                i10 = 390;
                f = fO;
                vu30Var2 = vu30Var;
                x340Var.i0(-906533153);
                x340Var.r(false);
            }
            if (n9d1Var8 != null) {
                x340Var.i0(-906254401);
                x340Var.r(false);
            } else {
                x340Var.i0(-906254401);
                x340Var.r(false);
            }
            objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT6);
            }
            c9nVar = (c9n) objT6;
            x340Var.i0(-29229382);
            vq60 vq60Var8 = jw80.a;
            qim0VarB = u291.B(tsj0.a, (gra) null, 3);
            if (z15) {
                t24Var3 = t24Var2;
                qim0 qim0VarB9 = f8d1.b(qim0Var4, t24Var3, new qxx(t24Var3, c9nVar, flb0Var, z12, z13));
                zI3 = x340Var.i(t24Var3);
                objT7 = x340Var.T();
                if (zI3) {
                    z16 = false;
                    objT7 = new mxx(t24Var3, (byte) 0);
                    x340Var.s0(objT7);
                } else {
                    z16 = false;
                    objT7 = new mxx(t24Var3, (byte) 0);
                    x340Var.s0(objT7);
                }
                qim0VarB = qim0VarB.then(eqr0.k(qim0VarB9, (iu30) objT7));
            } else {
                z16 = false;
            }
            x340Var.r(z16);
            gfh0 gfh0VarC9 = t1c.c(graVar, true);
            int iHashCode9 = Long.hashCode(x340Var.T);
            xos0 xos0VarM9 = x340Var.m();
            qim0 qim0VarE9 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC9, x340Var, lljVar112);
            nko1.H(xos0VarM9, x340Var, vu30Var2);
            x0d.q(iHashCode9, x340Var, lljVar113, x340Var);
            nko1.H(qim0VarE9, x340Var, lljVar114);
            j2iVar2 = j2iVar;
            k4s0.i((i9 >> 12) & 14, j2iVar2, x340Var, true, true);
            z4 = z15;
            qim0Var3 = qim0Var5;
            n9d1Var5 = n9d1Var7;
            n9d1Var6 = n9d1Var8;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            n9d1Var5 = n9d1Var3;
            z4 = z2;
            n9d1Var6 = n9d1Var4;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oia(qim0Var3, n9d1Var5, n9d1Var6, z4, j2iVar2, i, i2);
        }
    }

    public static final void d(s370 s370Var, c380 c380Var, upb0 upb0Var, wgh1 wgh1Var, zzq0 zzq0Var, float f, dh30 dh30Var, mev mevVar, qim0 qim0Var, b0k b0kVar, int i) {
        float f2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-524333981);
        int i2 = (i & 6) == 0 ? (b0kVar3.g(s370Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(c380Var) : b0kVar3.i(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(upb0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(wgh1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(zzq0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            f2 = f;
            i2 |= b0kVar3.d(f2) ? 131072 : 65536;
        } else {
            f2 = f;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? b0kVar3.g(dh30Var) : b0kVar3.i(dh30Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? b0kVar3.g(mevVar) : b0kVar3.i(mevVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            n811 n811Var = new n811();
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : c380Var) {
                    if (obj instanceof v370) {
                        arrayList.add(obj);
                    }
                }
                objT = v8r.q(Boolean.valueOf(arrayList.isEmpty()));
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            dko1.g(new pf50(wgh1Var.g), anm1.N("GRID", qim0Var), upb0Var, zzq0Var, new d36(16.0f, true, new um5(false)), new d36(16.0f, true, new um5(false)), null, false, null, new d470(s370Var, c380Var, wgh1Var, f2, n811Var, dh30Var, (ven0) objT, mevVar), b0kVar2, (i3 & 896) | 1769472 | ((i3 >> 3) & 7168), 912);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e470(s370Var, c380Var, upb0Var, wgh1Var, zzq0Var, f, dh30Var, mevVar, qim0Var, i, (byte) 0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void e(a470 a470Var, wgh1 wgh1Var, mev mevVar, dh30 dh30Var, qim0 qim0Var, upb0 upb0Var, zzq0 zzq0Var, float f, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        float f2;
        s370 s370Var = a470Var.a;
        float f3 = zzq0Var.e;
        c380 c380Var = a470Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(400566248);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(a470Var) ? 4 : 2) | (x340Var.g(wgh1Var) ? 32 : 16) | (x340Var.g(mevVar) ? 256 : 128) | (x340Var.g(dh30Var) ? 2048 : 1024) | (x340Var.g(qim0Var) ? 16384 : 8192) | (x340Var.g(upb0Var) ? 131072 : 65536) | (x340Var.g(zzq0Var) ? 1048576 : 524288) | (x340Var.d(f) ? 8388608 : 4194304);
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            int iC = l1d.C(wgh1Var.a);
            if (iC == 0) {
                x340Var.i0(1850361313);
                int i4 = i3 >> 6;
                d(s370Var, a470Var.b, upb0Var, wgh1Var, zzq0Var, f, dh30Var, mevVar, qim0Var, x340Var, ((i3 >> 9) & 896) | ((i3 << 6) & 7168) | (57344 & i4) | (i4 & 458752) | ((i3 << 9) & 3670016) | ((i3 << 15) & 29360128) | (234881024 & (i3 << 12)));
                x340Var.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, -1602878738, false);
                }
                x340Var.i0(1850804768);
                wat watVar = (wat) x340Var.k(t4k.h);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(0);
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                float fM0 = watVar.M0(((Number) ven0Var.getValue()).intValue());
                d36 d36Var = new d36(16.0f, true, new um5(false));
                fra fraVar = een.N0;
                float f4 = zzq0Var.c;
                kiv kivVar = t4k.n;
                float fN = uyn1.n(zzq0Var, (flb0) x340Var.k(kivVar));
                float fM = uyn1.m(zzq0Var, (flb0) x340Var.k(kivVar));
                nim0 nim0Var = nim0.a;
                qim0 qim0VarB = uyn1.B(nim0Var, fN, f4, fM, 0.0f, 8);
                jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 54);
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
                qim0 qim0VarC = u291.c(nim0Var, 1.0f);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                qim0 qim0VarThen = qim0VarC.then(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen);
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
                boolean z2 = wgh1Var.f;
                qim0 qim0VarN = anm1.N("HEADER", nim0Var);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = new i030(ven0Var, (byte) 21);
                    x340Var.s0(objT2);
                }
                a6o1.d(s370Var, z2, lrn1.u(qim0VarN, (iu30) objT2), f, x340Var, (i3 >> 12) & 7168);
                x340Var = x340Var;
                ArrayList arrayList = new ArrayList();
                for (Object obj : c380Var) {
                    if (obj instanceof w370) {
                        arrayList.add(obj);
                    }
                }
                w370 w370Var = (w370) o7h.s0(arrayList);
                if (w370Var != null) {
                    x340Var.i0(-22118259);
                    i2 = i3;
                    f2 = 1.0f;
                    suo1.l(w370Var, -1, wgh1Var, dh30Var, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, f3 / 2.0f, 7), x340Var, ((i3 << 3) & 896) | 48 | (i3 & 7168));
                    x340Var.r(false);
                } else {
                    i2 = i3;
                    f2 = 1.0f;
                    x340Var.i0(-21885697);
                    x340Var.r(false);
                }
                x340Var.r(true);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : c380Var) {
                    if (!(((z370) obj2) instanceof w370)) {
                        arrayList2.add(obj2);
                    }
                }
                c380 c380VarA = mqo1.A(arrayList2);
                upb0 upb0VarB = wpb0.b(x340Var);
                zzq0 zzq0VarJ = uyn1.j(0.0f, fM0, 0.0f, f3, 5);
                if (f2 <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                if (f2 > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                }
                d(null, c380VarA, upb0VarB, wgh1Var, zzq0VarJ, f, dh30Var, mevVar, new wnb0(f2, true), x340Var, ((i2 << 6) & 7168) | 6 | ((i2 >> 6) & 458752) | ((i2 << 9) & 3670016) | ((i2 << 15) & 29360128));
                x340Var.r(true);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wz2(a470Var, wgh1Var, mevVar, dh30Var, qim0Var, upb0Var, zzq0Var, f, i);
        }
    }

    public static final void f(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-986404520);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new tze0(function0, (byte) 26);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), kdx.c, null, null, yla.s(x340Var), null, null, null, n0j.a, null, n0j.b, x340Var, 805306368, 48, 1500);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function0, i, (byte) 11);
        }
    }

    public static final void g(String str, String str2, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var;
        Function0 function2 = function1;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(682695546);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(function2) ? 2048 : 1024);
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            long j = cbx.a(x340Var2).a.c;
            cua cuaVar = cbx.b(x340Var2).f;
            cr31 cr31VarB = er31.b(8.0f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = uyn1.x(dug.f(nim0Var, j, cr31VarB), cbx.b(x340Var2).e.c);
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            d36 d36Var2 = new d36(8.0f, true, new um5(false));
            qim0 qim0VarH = l6o1.H(u291.f(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var2), false, 14);
            mbh mbhVarA2 = jbh.a(d36Var2, eraVar, x340Var2, 48);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarH);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            uwo1.e(str, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).e, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var2, (i2 & 14) | 48, 0, 2016);
            uwo1.e(str2, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var2, ((i2 >> 3) & 14) | 48, 0, 2016);
            x340Var = x340Var2;
            x340Var.r(true);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            idx idxVar = new idx(4);
            z50 z50Var = z50.c;
            foo1.c(new gbx(z50Var, function0), idxVar, anm1.N("pin_gate_message_continue_button", nim0Var), null, null, null, null, null, null, null, m7j.a, x340Var, 384, 48, 2040);
            function2 = function1;
            foo1.c(new gbx(z50Var, function2), ldx.c, null, null, null, null, null, null, null, null, m7j.b, x340Var, 48, 48, 2044);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ga50(str, str2, function0, function2, i, (byte) 1);
        }
    }

    public static final void h(tyq tyqVar, String str, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1148577972);
        int i2 = (x340Var.i(tyqVar) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            otw.c(tyqVar, new p271(str, z), qim0Var, (ipb1) null, x340Var, (i2 & 14) | ((i2 >> 3) & 896), 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zp51(tyqVar, str, z, qim0Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0101  */
    /* JADX WARN: Code duplicated, block: B:76:0x010c  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void i(final qim0 qim0Var, hw61 hw61Var, final long j, final long j2, float f, final j2i j2iVar, b0k b0kVar, final int i, final int i2) {
        int i3;
        hw61 hw61Var2;
        int i4;
        int i5;
        float f2;
        int i6;
        j2i j2iVar2;
        boolean z;
        final float f3;
        final hw61 hw61Var3;
        h311 h311VarV;
        hw61 hw61Var4;
        final float f4;
        final hw61 hw61Var5;
        int i7;
        int i8;
        int i9;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(174096871);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                hw61Var2 = hw61Var;
                i3 |= x340Var.g(hw61Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (x340Var.f(j)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i3 |= i9;
            }
            if ((i & 3072) == 0) {
                if (x340Var.f(j2)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
            }
            i4 = i3 | 24576;
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (x340Var.d(f2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((1572864 & i) == 0) {
                    j2iVar2 = j2iVar;
                    if (x340Var.i(j2iVar2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i4 |= i7;
                } else {
                    j2iVar2 = j2iVar;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        if (i10 != 0) {
                            hw61Var4 = d4o1.a;
                        } else {
                            hw61Var4 = hw61Var2;
                        }
                        if (i5 != 0) {
                            f2 = 0.0f;
                        }
                        f4 = f2;
                        hw61Var5 = hw61Var4;
                    } else {
                        x340Var.b0();
                        f4 = f2;
                        hw61Var5 = hw61Var2;
                    }
                    x340Var.s();
                    kiv kivVar = fuw.b;
                    final float f5 = ((p3v) x340Var.k(kivVar)).a + f4;
                    final j2i j2iVar3 = j2iVar2;
                    mod.c(new ely0[]{p3d1.o(j2, xrl.a), kivVar.a(new p3v(f5))}, apo.r(-2004281689, new vu30() { // from class: p.q3d1
                        public final Object invoke(Object obj, Object obj2) {
                            x340 x340Var2 = (b0k) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            x340 x340Var3 = x340Var2;
                            boolean zY = x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2);
                            rih1 rih1Var = rih1.a;
                            if (!zY) {
                                x340Var3.b0();
                                return rih1Var;
                            }
                            qim0 qim0VarW = puo1.w(f4, puo1.x(j, (lwr) x340Var3.k(fuw.a), f5, x340Var3), qim0Var, hw61Var5);
                            Object objT = x340Var3.T();
                            Object obj3 = fkj0.X;
                            if (objT == obj3) {
                                objT = new cix0((byte) 23);
                                x340Var3.s0(objT);
                            }
                            qim0 qim0VarB = s161.b(qim0VarW, false, (iu30) objT);
                            Object objT2 = x340Var3.T();
                            if (objT2 == obj3) {
                                objT2 = mia.r;
                                x340Var3.s0(objT2);
                            }
                            qim0 qim0VarB2 = f8d1.b(qim0VarB, rih1Var, (PointerInputEventHandler) objT2);
                            gfh0 gfh0VarC = t1c.c(een.d, true);
                            int iK = tgp1.k(x340Var3);
                            xos0 xos0VarM = x340Var3.m();
                            qim0 qim0VarE = zr7.E(x340Var3, qim0VarB2);
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
                            nko1.H(gfh0VarC, x340Var3, y580.O0);
                            nko1.H(xos0VarM, x340Var3, y580.N0);
                            llj lljVar = y580.R0;
                            if (x340Var3.S || !u890.j(x340Var3.T(), Integer.valueOf(iK))) {
                                z5c.f(iK, x340Var3, iK, lljVar);
                            }
                            nko1.H(qim0VarE, x340Var3, y580.Y);
                            dv20.l(0, j2iVar3, x340Var3, true);
                            return rih1Var;
                        }
                    }, x340Var), x340Var, 56);
                    hw61Var3 = hw61Var5;
                    f3 = f4;
                } else {
                    x340Var.b0();
                    f3 = f2;
                    hw61Var3 = hw61Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.r3d1
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            puo1.i(qim0Var, hw61Var3, j, j2, f3, j2iVar, (b0k) obj, czo1.p(i | 1), i2);
                            return rih1.a;
                        }
                    };
                }
            }
            i4 = 221184 | i3;
            f2 = f;
            if ((1572864 & i) == 0) {
                j2iVar2 = j2iVar;
                if (x340Var.i(j2iVar2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i4 |= i7;
            } else {
                j2iVar2 = j2iVar;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        hw61Var4 = d4o1.a;
                    } else {
                        hw61Var4 = hw61Var2;
                    }
                    if (i5 != 0) {
                        f2 = 0.0f;
                    }
                    f4 = f2;
                    hw61Var5 = hw61Var4;
                } else {
                    if (i10 != 0) {
                        hw61Var4 = d4o1.a;
                    } else {
                        hw61Var4 = hw61Var2;
                    }
                    if (i5 != 0) {
                        f2 = 0.0f;
                    }
                    f4 = f2;
                    hw61Var5 = hw61Var4;
                }
                x340Var.s();
                kiv kivVar2 = fuw.b;
                final float f6 = ((p3v) x340Var.k(kivVar2)).a + f4;
                final j2i j2iVar4 = j2iVar2;
                mod.c(new ely0[]{p3d1.o(j2, xrl.a), kivVar2.a(new p3v(f6))}, apo.r(-2004281689, new vu30() { // from class: p.q3d1
                    public final Object invoke(Object obj, Object obj2) {
                        x340 x340Var2 = (b0k) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        x340 x340Var3 = x340Var2;
                        boolean zY = x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2);
                        rih1 rih1Var = rih1.a;
                        if (!zY) {
                            x340Var3.b0();
                            return rih1Var;
                        }
                        qim0 qim0VarW = puo1.w(f4, puo1.x(j, (lwr) x340Var3.k(fuw.a), f6, x340Var3), qim0Var, hw61Var5);
                        Object objT = x340Var3.T();
                        Object obj3 = fkj0.X;
                        if (objT == obj3) {
                            objT = new cix0((byte) 23);
                            x340Var3.s0(objT);
                        }
                        qim0 qim0VarB = s161.b(qim0VarW, false, (iu30) objT);
                        Object objT2 = x340Var3.T();
                        if (objT2 == obj3) {
                            objT2 = mia.r;
                            x340Var3.s0(objT2);
                        }
                        qim0 qim0VarB2 = f8d1.b(qim0VarB, rih1Var, (PointerInputEventHandler) objT2);
                        gfh0 gfh0VarC = t1c.c(een.d, true);
                        int iK = tgp1.k(x340Var3);
                        xos0 xos0VarM = x340Var3.m();
                        qim0 qim0VarE = zr7.E(x340Var3, qim0VarB2);
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
                        nko1.H(gfh0VarC, x340Var3, y580.O0);
                        nko1.H(xos0VarM, x340Var3, y580.N0);
                        llj lljVar = y580.R0;
                        if (x340Var3.S || !u890.j(x340Var3.T(), Integer.valueOf(iK))) {
                            z5c.f(iK, x340Var3, iK, lljVar);
                        }
                        nko1.H(qim0VarE, x340Var3, y580.Y);
                        dv20.l(0, j2iVar4, x340Var3, true);
                        return rih1Var;
                    }
                }, x340Var), x340Var, 56);
                hw61Var3 = hw61Var5;
                f3 = f4;
            } else {
                x340Var.b0();
                f3 = f2;
                hw61Var3 = hw61Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.r3d1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        puo1.i(qim0Var, hw61Var3, j, j2, f3, j2iVar, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i3 |= 48;
        hw61Var2 = hw61Var;
        if ((i & 384) == 0) {
            if (x340Var.f(j)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        if ((i & 3072) == 0) {
            if (x340Var.f(j2)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        i4 = i3 | 24576;
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (x340Var.d(f2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((1572864 & i) == 0) {
                j2iVar2 = j2iVar;
                if (x340Var.i(j2iVar2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i4 |= i7;
            } else {
                j2iVar2 = j2iVar;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        hw61Var4 = d4o1.a;
                    } else {
                        hw61Var4 = hw61Var2;
                    }
                    if (i5 != 0) {
                        f2 = 0.0f;
                    }
                    f4 = f2;
                    hw61Var5 = hw61Var4;
                } else {
                    if (i10 != 0) {
                        hw61Var4 = d4o1.a;
                    } else {
                        hw61Var4 = hw61Var2;
                    }
                    if (i5 != 0) {
                        f2 = 0.0f;
                    }
                    f4 = f2;
                    hw61Var5 = hw61Var4;
                }
                x340Var.s();
                kiv kivVar3 = fuw.b;
                final float f7 = ((p3v) x340Var.k(kivVar3)).a + f4;
                final j2i j2iVar5 = j2iVar2;
                mod.c(new ely0[]{p3d1.o(j2, xrl.a), kivVar3.a(new p3v(f7))}, apo.r(-2004281689, new vu30() { // from class: p.q3d1
                    public final Object invoke(Object obj, Object obj2) {
                        x340 x340Var2 = (b0k) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        x340 x340Var3 = x340Var2;
                        boolean zY = x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2);
                        rih1 rih1Var = rih1.a;
                        if (!zY) {
                            x340Var3.b0();
                            return rih1Var;
                        }
                        qim0 qim0VarW = puo1.w(f4, puo1.x(j, (lwr) x340Var3.k(fuw.a), f7, x340Var3), qim0Var, hw61Var5);
                        Object objT = x340Var3.T();
                        Object obj3 = fkj0.X;
                        if (objT == obj3) {
                            objT = new cix0((byte) 23);
                            x340Var3.s0(objT);
                        }
                        qim0 qim0VarB = s161.b(qim0VarW, false, (iu30) objT);
                        Object objT2 = x340Var3.T();
                        if (objT2 == obj3) {
                            objT2 = mia.r;
                            x340Var3.s0(objT2);
                        }
                        qim0 qim0VarB2 = f8d1.b(qim0VarB, rih1Var, (PointerInputEventHandler) objT2);
                        gfh0 gfh0VarC = t1c.c(een.d, true);
                        int iK = tgp1.k(x340Var3);
                        xos0 xos0VarM = x340Var3.m();
                        qim0 qim0VarE = zr7.E(x340Var3, qim0VarB2);
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
                        nko1.H(gfh0VarC, x340Var3, y580.O0);
                        nko1.H(xos0VarM, x340Var3, y580.N0);
                        llj lljVar = y580.R0;
                        if (x340Var3.S || !u890.j(x340Var3.T(), Integer.valueOf(iK))) {
                            z5c.f(iK, x340Var3, iK, lljVar);
                        }
                        nko1.H(qim0VarE, x340Var3, y580.Y);
                        dv20.l(0, j2iVar5, x340Var3, true);
                        return rih1Var;
                    }
                }, x340Var), x340Var, 56);
                hw61Var3 = hw61Var5;
                f3 = f4;
            } else {
                x340Var.b0();
                f3 = f2;
                hw61Var3 = hw61Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.r3d1
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        puo1.i(qim0Var, hw61Var3, j, j2, f3, j2iVar, (b0k) obj, czo1.p(i | 1), i2);
                        return rih1.a;
                    }
                };
            }
        }
        i4 = 221184 | i3;
        f2 = f;
        if ((1572864 & i) == 0) {
            j2iVar2 = j2iVar;
            if (x340Var.i(j2iVar2)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i4 |= i7;
        } else {
            j2iVar2 = j2iVar;
        }
        if ((599187 & i4) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    hw61Var4 = d4o1.a;
                } else {
                    hw61Var4 = hw61Var2;
                }
                if (i5 != 0) {
                    f2 = 0.0f;
                }
                f4 = f2;
                hw61Var5 = hw61Var4;
            } else {
                if (i10 != 0) {
                    hw61Var4 = d4o1.a;
                } else {
                    hw61Var4 = hw61Var2;
                }
                if (i5 != 0) {
                    f2 = 0.0f;
                }
                f4 = f2;
                hw61Var5 = hw61Var4;
            }
            x340Var.s();
            kiv kivVar4 = fuw.b;
            final float f8 = ((p3v) x340Var.k(kivVar4)).a + f4;
            final j2i j2iVar6 = j2iVar2;
            mod.c(new ely0[]{p3d1.o(j2, xrl.a), kivVar4.a(new p3v(f8))}, apo.r(-2004281689, new vu30() { // from class: p.q3d1
                public final Object invoke(Object obj, Object obj2) {
                    x340 x340Var2 = (b0k) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    x340 x340Var3 = x340Var2;
                    boolean zY = x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2);
                    rih1 rih1Var = rih1.a;
                    if (!zY) {
                        x340Var3.b0();
                        return rih1Var;
                    }
                    qim0 qim0VarW = puo1.w(f4, puo1.x(j, (lwr) x340Var3.k(fuw.a), f8, x340Var3), qim0Var, hw61Var5);
                    Object objT = x340Var3.T();
                    Object obj3 = fkj0.X;
                    if (objT == obj3) {
                        objT = new cix0((byte) 23);
                        x340Var3.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(qim0VarW, false, (iu30) objT);
                    Object objT2 = x340Var3.T();
                    if (objT2 == obj3) {
                        objT2 = mia.r;
                        x340Var3.s0(objT2);
                    }
                    qim0 qim0VarB2 = f8d1.b(qim0VarB, rih1Var, (PointerInputEventHandler) objT2);
                    gfh0 gfh0VarC = t1c.c(een.d, true);
                    int iK = tgp1.k(x340Var3);
                    xos0 xos0VarM = x340Var3.m();
                    qim0 qim0VarE = zr7.E(x340Var3, qim0VarB2);
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
                    nko1.H(gfh0VarC, x340Var3, y580.O0);
                    nko1.H(xos0VarM, x340Var3, y580.N0);
                    llj lljVar = y580.R0;
                    if (x340Var3.S || !u890.j(x340Var3.T(), Integer.valueOf(iK))) {
                        z5c.f(iK, x340Var3, iK, lljVar);
                    }
                    nko1.H(qim0VarE, x340Var3, y580.Y);
                    dv20.l(0, j2iVar6, x340Var3, true);
                    return rih1Var;
                }
            }, x340Var), x340Var, 56);
            hw61Var3 = hw61Var5;
            f3 = f4;
        } else {
            x340Var.b0();
            f3 = f2;
            hw61Var3 = hw61Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.r3d1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    puo1.i(qim0Var, hw61Var3, j, j2, f3, j2iVar, (b0k) obj, czo1.p(i | 1), i2);
                    return rih1.a;
                }
            };
        }
    }

    public static final void j(final Function0 function0, final qim0 qim0Var, final hw61 hw61Var, final long j, final long j2, final float f, final idn0 idn0Var, final j2i j2iVar, b0k b0kVar, final int i) {
        Function0 function1;
        int i2;
        j2i j2iVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2141308794);
        if ((i & 6) == 0) {
            function1 = function0;
            i2 = (x340Var.i(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(hw61Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.f(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.g((Object) null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.d(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= x340Var.g(idn0Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            j2iVar2 = j2iVar;
            i2 |= x340Var.i(j2iVar2) ? 536870912 : 268435456;
        } else {
            j2iVar2 = j2iVar;
        }
        if (x340Var.Y(i2 & 1, (306783379 & i2) != 306783378)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            kiv kivVar = fuw.b;
            float f2 = ((p3v) x340Var.k(kivVar)).a + f;
            mod.c(new ely0[]{p3d1.o(j2, xrl.a), kivVar.a(new p3v(f2))}, apo.r(-1766606150, new s3d1(qim0Var, hw61Var, j, f2, f, idn0Var, function1, j2iVar2), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.t3d1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    puo1.j(function0, qim0Var, hw61Var, j, j2, f, idn0Var, j2iVar, (b0k) obj, czo1.p(i | 1));
                    return rih1.a;
                }
            };
        }
    }

    public static final js20 k(wm01 wm01Var, mr20 mr20Var, yh2 yh2Var, ov20 ov20Var, f8b f8bVar, iu30 iu30Var, di4 di4Var, cn01 cn01Var, ne neVar, tb51 tb51Var, bv40 bv40Var, rh11 rh11Var, fza1 fza1Var, d0r d0rVar, waz0 waz0Var, ux3 ux3Var) {
        return w3p1.q(new w3r(wm01Var, mr20Var, yh2Var, ov20Var, f8bVar, d0rVar, cn01Var, neVar, di4Var, bv40Var, rh11Var, waz0Var, ux3Var, (byte) 1), new sl6(di4Var, (byte) 1), new ffx0(di4Var, fza1Var, tb51Var, (byte) 18), null, new j3y0(iu30Var, neVar, (byte) 27), 8);
    }

    public static final int q(RemoteViews remoteViews, cng1 cng1Var, int i, int i2, Integer num) {
        if (i == -1) {
            hhg1.n("viewStubId must not be View.NO_ID");
            return 0;
        }
        int iIntValue = num != null ? num.intValue() : cng1Var.g.incrementAndGet();
        if (iIntValue != -1) {
            remoteViews.setInt(i, "setInflatedId", iIntValue);
        }
        if (i2 != 0) {
            remoteViews.setInt(i, "setLayoutResource", i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return iIntValue;
    }

    public static boolean r(AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return sf.A(accessibilityManager);
        }
        return true;
    }

    public static ThreadPoolExecutor s() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new pkn0("Firebase-Messaging-File-Io"));
    }

    public static ScheduledThreadPoolExecutor t() {
        return new ScheduledThreadPoolExecutor(1, new pkn0("Firebase-Messaging-Init"));
    }

    public static ExecutorService u() {
        return Executors.newSingleThreadExecutor(new pkn0("Firebase-Messaging-Task"));
    }

    public static ScheduledThreadPoolExecutor v() {
        return new ScheduledThreadPoolExecutor(1, new pkn0("Firebase-Messaging-Topics-Io"));
    }

    public static final qim0 w(float f, long j, qim0 qim0Var, hw61 hw61Var) {
        return i1p1.q(dug.f(sto1.o(qim0Var, f, hw61Var, false, 0L, 0L, 24).then(nim0.a), j, hw61Var), hw61Var);
    }

    public static final long x(long j, lwr lwrVar, float f, x340 x340Var) {
        kiv kivVar = cbh.a;
        long jC = ((bbh) x340Var.k(kivVar)).c();
        int i = u7h.l;
        if (!z4h1.b(j, jC) || lwrVar == null) {
            x340Var.i0(-1124546347);
            x340Var.r(false);
            return j;
        }
        x340Var.i0(-1124614454);
        x340Var.i0(-1687113661);
        bbh bbhVar = (bbh) x340Var.k(kivVar);
        if (p3v.b(f, 0.0f) <= 0 || bbhVar.d()) {
            x340Var.i0(-1095489470);
            x340Var.r(false);
        } else {
            x340Var.i0(-1095627978);
            kiv kivVar2 = fuw.a;
            j = z4p1.t(u7h.b(cbh.a(j, x340Var), ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14), j);
            x340Var.r(false);
        }
        x340Var.r(false);
        x340Var.r(false);
        return j;
    }

    public static void y(String str, Parcel parcel) {
        parcel.writeString(str);
    }

    public abstract String l();

    public String m() {
        return "fetchAdsFailure";
    }

    public abstract String n();

    public String o() {
        return "";
    }

    public abstract String p();
}
