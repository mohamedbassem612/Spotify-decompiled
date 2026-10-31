package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Trace;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import com.spotify.base.java.logging.Logger;
import defpackage.m;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class bno1 {
    public static final p5e1 a = new p5e1((byte) 19);
    public static b180 b;

    public static final void a(tw6 tw6Var, i8h1 i8h1Var, b0k b0kVar, int i) {
        h311 h311VarV;
        nw6 nw6Var;
        String str = tw6Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-454754428);
        int i2 = (x340Var.g(tw6Var) ? 4 : 2) | i | (x340Var.i(i8h1Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            tbr0 tbr0VarC = ((cir0) x340Var.k(k2r0.a)).c();
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new AtomicBoolean(false);
                x340Var.s0(objT);
            }
            AtomicBoolean atomicBoolean = (AtomicBoolean) objT;
            boolean zG = x340Var.g(y6b1.b(str).toString());
            Object objT2 = x340Var.T();
            if (zG || objT2 == obj) {
                objT2 = new bsk0(y6b1.b(str).toString());
                x340Var.s0(objT2);
            }
            bsk0 bsk0Var = (bsk0) objT2;
            if (tw6Var.e.isEmpty()) {
                x340Var.i0(-1261719250);
                boolean zI = x340Var.i(atomicBoolean) | x340Var.i(tbr0VarC);
                Object objT3 = x340Var.T();
                if (zI || objT3 == obj) {
                    objT3 = new ju6(atomicBoolean, tbr0VarC, null, (byte) 1);
                    x340Var.s0(objT3);
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT3);
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    nw6Var = new nw6(tw6Var, i8h1Var, i, (byte) 0);
                }
            } else {
                x340Var.i0(-1261488610);
                x340Var.r(false);
                String str2 = tw6Var.c;
                rha1 rha1Var = tw6Var.d;
                List list = tw6Var.e;
                boolean zI2 = x340Var.i(i8h1Var) | x340Var.i(bsk0Var) | x340Var.i(atomicBoolean) | x340Var.i(tbr0VarC);
                Object objT4 = x340Var.T();
                if (zI2 || objT4 == obj) {
                    k8 k8Var = new k8((Object) i8h1Var, (Object) bsk0Var, (Object) atomicBoolean, (Object) tbr0VarC, (byte) 11);
                    x340Var.s0(k8Var);
                    objT4 = k8Var;
                }
                xu30 xu30Var = (xu30) objT4;
                boolean zI3 = x340Var.i(i8h1Var) | x340Var.i(bsk0Var) | x340Var.i(atomicBoolean) | x340Var.i(tbr0VarC);
                Object objT5 = x340Var.T();
                if (zI3 || objT5 == obj) {
                    f80 f80Var = new f80(i8h1Var, bsk0Var, atomicBoolean, tbr0VarC, (byte) 9);
                    x340Var.s0(f80Var);
                    objT5 = f80Var;
                }
                h(str2, rha1Var, list, xu30Var, (Function0) objT5, x340Var, 0);
            }
            h311VarV.d = nw6Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            nw6Var = new nw6(tw6Var, i8h1Var, i, (byte) 1);
            h311VarV.d = nw6Var;
        }
    }

    public static final void b(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1485092611);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48 | (x340Var.h(z) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131956563);
            String strO1 = cwl1.o0(x340Var, 2131956564);
            qim0 qim0Var4 = nim0.a;
            if (z) {
                x340Var.i0(64494856);
                boolean z2 = (i2 & 14) == 4;
                Object objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new j160(function0, (byte) 3);
                    x340Var.s0(objT);
                }
                Function0 function1 = (Function0) objT;
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    wro1.h(new gbx(new y50(strO1), function1), ldx.c, qim0Var4, null, null, null, false, null, null, apo.r(-1402590609, new dz40(strO0, (byte) 7), x340Var), x340Var, 384, 6, 1016);
                    x340Var.r(false);
                    qim0Var3 = qim0Var4;
                }
            } else {
                x340Var.i0(64821782);
                qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
                boolean z3 = (i2 & 14) == 4;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new j160(function0, (byte) 4);
                    x340Var.s0(objT2);
                }
                Function0 function2 = (Function0) objT2;
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                qim0Var3 = qim0Var4;
                foo1.c(new gbx(new y50(strO1), function2), new idx(), null, null, yla.s(x340Var), null, null, null, fsi.a, null, apo.r(1810193126, new dz40(strO0, (byte) 8), x340Var), x340Var, 805306368, 48, 1500);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(function0, qim0Var2, z, i, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:109:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0169  */
    /* JADX WARN: Code duplicated, block: B:120:0x0172  */
    /* JADX WARN: Code duplicated, block: B:126:0x0191 A[PHI: r6 r8 r13 r14
      0x0191: PHI (r6v75 int) = (r6v7 int), (r6v76 int) binds: [B:138:0x01af, B:125:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0191: PHI (r8v9 p.g36) = (r8v2 p.g36), (r8v10 p.g36) binds: [B:138:0x01af, B:125:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0191: PHI (r13v7 p.nl3) = (r13v4 p.nl3), (r13v8 p.nl3) binds: [B:138:0x01af, B:125:0x0185] A[DONT_GENERATE, DONT_INLINE]
      0x0191: PHI (r14v10 p.pl3) = (r14v8 p.pl3), (r14v11 p.pl3) binds: [B:138:0x01af, B:125:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:127:0x0194  */
    /* JADX WARN: Code duplicated, block: B:129:0x0198  */
    /* JADX WARN: Code duplicated, block: B:130:0x019b  */
    /* JADX WARN: Code duplicated, block: B:132:0x019f  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:158:0x0249  */
    /* JADX WARN: Code duplicated, block: B:164:0x025a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0260  */
    /* JADX WARN: Code duplicated, block: B:172:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x0270  */
    /* JADX WARN: Code duplicated, block: B:176:0x0280  */
    /* JADX WARN: Code duplicated, block: B:179:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:182:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:184:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:190:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:192:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:198:0x0301  */
    /* JADX WARN: Code duplicated, block: B:200:0x0307  */
    /* JADX WARN: Code duplicated, block: B:206:0x0319  */
    /* JADX WARN: Code duplicated, block: B:208:0x031f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0335  */
    /* JADX WARN: Code duplicated, block: B:216:0x033b  */
    /* JADX WARN: Code duplicated, block: B:222:0x034b  */
    /* JADX WARN: Code duplicated, block: B:224:0x0351  */
    /* JADX WARN: Code duplicated, block: B:230:0x0361  */
    /* JADX WARN: Code duplicated, block: B:232:0x0367  */
    /* JADX WARN: Code duplicated, block: B:238:0x0377  */
    /* JADX WARN: Code duplicated, block: B:240:0x037d  */
    /* JADX WARN: Code duplicated, block: B:246:0x0395 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0397  */
    /* JADX WARN: Code duplicated, block: B:252:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:254:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:256:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:258:0x03db  */
    /* JADX WARN: Code duplicated, block: B:260:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:267:0x03f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:271:0x0411  */
    /* JADX WARN: Code duplicated, block: B:273:0x0420  */
    /* JADX WARN: Code duplicated, block: B:276:0x0427 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:277:0x0429  */
    /* JADX WARN: Code duplicated, block: B:279:0x047f  */
    /* JADX WARN: Code duplicated, block: B:282:0x0493  */
    /* JADX WARN: Code duplicated, block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:120:0x0172, please report this as an issue */
    public static final void c(final qim0 qim0Var, xtb0 xtb0Var, final vzq0 vzq0Var, final boolean z, final boolean z2, final iq20 iq20Var, final boolean z3, final hxq0 hxq0Var, nl3 nl3Var, g36 g36Var, pl3 pl3Var, c36 c36Var, final iu30 iu30Var, b0k b0kVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4;
        xtb0 xtb0Var2;
        x340 x340Var;
        final nl3 nl3Var2;
        final g36 g36Var2;
        final pl3 pl3Var2;
        final c36 c36Var2;
        h311 h311VarV;
        nl3 nl3Var3;
        g36 g36Var3;
        pl3 pl3Var3;
        g36 g36Var4;
        pl3 pl3Var4;
        nl3 nl3Var4;
        int i8;
        c36 c36Var3;
        int i9;
        ven0 ven0VarS;
        boolean z5;
        Object objT;
        ima0 ima0Var;
        boolean z6;
        Object objT2;
        Object objT3;
        c9n c9nVar;
        yd50 yd50Var;
        t2b t2bVar;
        int i10;
        boolean zE;
        Object objT4;
        int i11;
        c36 c36Var4;
        final xtb0 xtb0Var3;
        qqq0 qqq0Var;
        qqq0 qqq0Var2;
        boolean z7;
        qim0 qim0VarZ;
        Object objT5;
        boolean zE2;
        Object objT6;
        boolean z8 = z;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(924924659);
        if ((i & 6) == 0) {
            i4 = (x340Var2.g(qim0Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= x340Var2.g(xtb0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= x340Var2.g(vzq0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= x340Var2.h(z8) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= x340Var2.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= x340Var2.g(iq20Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= x340Var2.h(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= x340Var2.g(hxq0Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i12 = i3 & 512;
        if (i12 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= x340Var2.g(nl3Var) ? 536870912 : 268435456;
        }
        int i13 = i3 & 1024;
        if (i13 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (x340Var2.g(g36Var) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i14 = i3 & 2048;
        if (i14 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= x340Var2.g(pl3Var) ? 32 : 16;
        }
        int i15 = i5;
        int i16 = i3 & 4096;
        if (i16 == 0) {
            i6 = i15;
            if ((i2 & 384) == 0) {
                i6 |= x340Var2.g(c36Var) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i6 |= x340Var2.i(iu30Var) ? 2048 : 1024;
            }
            i7 = i6;
            if ((i4 & 306783379) == 306783378 || (i7 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var2.Y(i4 & 1, z4)) {
                x340Var2.d0();
                if ((i & 1) != 0 || x340Var2.E()) {
                    int i17 = i4 & (-234881025);
                    if (i12 != 0) {
                        nl3Var3 = null;
                    } else {
                        nl3Var3 = nl3Var;
                    }
                    if (i13 != 0) {
                        g36Var3 = null;
                    } else {
                        g36Var3 = g36Var;
                    }
                    if (i14 != 0) {
                        pl3Var3 = null;
                    } else {
                        pl3Var3 = pl3Var;
                    }
                    g36Var4 = g36Var3;
                    pl3Var4 = pl3Var3;
                    nl3Var4 = nl3Var3;
                    i8 = i17;
                    if (i16 != 0) {
                        c36Var3 = null;
                    }
                    x340Var2.s();
                    i9 = i8 >> 3;
                    int i18 = i9 & 14;
                    int i19 = i18 | ((i7 >> 6) & 112);
                    ven0VarS = v8r.s(iu30Var, x340Var2);
                    int i20 = i8;
                    z5 = (((i19 & 14) ^ 6) <= 4 && x340Var2.g(xtb0Var)) || (i19 & 6) == 4;
                    objT = x340Var2.T();
                    if (z5 || objT == m4cVar) {
                        aqb0 aqb0Var = new aqb0();
                        aqb0Var.a = new err0(Integer.MAX_VALUE);
                        aqb0Var.b = new err0(Integer.MAX_VALUE);
                        c4x0 c4x0Var = c4x0.f;
                        e45 e45Var = new e45(ven0VarS, (byte) 8);
                        yt91 yt91Var = yv91.a;
                        objT = new i1w(new mdt(new uc9(new mdt(e45Var, c4x0Var), xtb0Var, aqb0Var, (byte) 6), c4x0Var), tob1.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 8);
                        x340Var2.s0(objT);
                    }
                    ima0Var = (ima0) objT;
                    int i21 = i20 >> 9;
                    int i22 = i18 | (i21 & 112);
                    z6 = ((((i22 & 112) ^ 48) <= 32 && x340Var2.h(z2)) || (i22 & 48) == 32) | ((((i22 & 14) ^ 6) <= 4 && x340Var2.g(xtb0Var)) || (i22 & 6) == 4);
                    objT2 = x340Var2.T();
                    if (z6 || objT2 == m4cVar) {
                        objT2 = new btb0(xtb0Var, z2);
                        x340Var2.s0(objT2);
                    }
                    ysb0 ysb0Var = (ysb0) objT2;
                    objT3 = x340Var2.T();
                    if (objT3 == m4cVar) {
                        objT3 = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(objT3);
                    }
                    c9nVar = (c9n) objT3;
                    yd50Var = (yd50) x340Var2.k(t4k.g);
                    t2bVar = ((Boolean) x340Var2.k(t4k.x)).booleanValue() ? null : avw0.h;
                    i10 = i20 & 112;
                    int i23 = i7 << 18;
                    int i24 = (i20 & 65520) | (i21 & 3670016) | (i23 & 29360128) | (i23 & 234881024) | ((i7 << 27) & 1879048192);
                    zE = ((((i24 & 1879048192) ^ 805306368) <= 536870912 && x340Var2.g(g36Var4)) || (i24 & 805306368) == 536870912) | ((((i24 & 896) ^ 384) <= 256 && x340Var2.g(vzq0Var)) || (i24 & 384) == 256) | ((((i24 & 112) ^ 48) <= 32 && x340Var2.g(xtb0Var)) || (i24 & 48) == 32) | ((((i24 & 7168) ^ 3072) <= 2048 && x340Var2.h(z8)) || (i24 & 3072) == 2048) | ((((57344 & i24) ^ 24576) <= 16384 && x340Var2.h(z2)) || (i24 & 24576) == 16384) | x340Var2.e(0) | ((((i24 & 3670016) ^ 1572864) <= 1048576 && x340Var2.g(nl3Var4)) || (i24 & 1572864) == 1048576) | ((((i24 & 29360128) ^ 12582912) <= 8388608 && x340Var2.g(pl3Var4)) || (i24 & 12582912) == 8388608) | ((((i24 & 234881024) ^ 100663296) <= 67108864 && x340Var2.g(c36Var3)) || (i24 & 100663296) == 67108864) | x340Var2.g(yd50Var) | x340Var2.g(t2bVar);
                    objT4 = x340Var2.T();
                    if (!zE || objT4 == m4cVar) {
                        c36 c36Var5 = c36Var3;
                        x340Var = x340Var2;
                        i11 = 4;
                        otb0 otb0Var = new otb0(xtb0Var, z2, vzq0Var, z8, ima0Var, g36Var4, c36Var5, c9nVar, yd50Var, t2bVar, nl3Var4, pl3Var4);
                        c36Var4 = c36Var5;
                        xtb0Var3 = xtb0Var;
                        z8 = z8;
                        x340Var.s0(otb0Var);
                        objT4 = otb0Var;
                    } else {
                        c36Var4 = c36Var3;
                        x340Var = x340Var2;
                        i11 = 4;
                        xtb0Var3 = xtb0Var;
                    }
                    hsb0 hsb0Var = (hsb0) objT4;
                    if (
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 1207
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.bno1.c(p.qim0, p.xtb0, p.vzq0, boolean, boolean, p.iq20, boolean, p.hxq0, p.nl3, p.g36, p.pl3, p.c36, p.iu30, p.b0k, int, int, int):void");
                }

                public static final void d(quc0 quc0Var, c380 c380Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
                    String strA;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(21654755);
                    int i2 = i | (x340Var.i(quc0Var) ? 4 : 2) | (x340Var.g(c380Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024);
                    if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                        String strO0 = cwl1.o0(x340Var, 2131953779);
                        String strO1 = cwl1.o0(x340Var, 2131953633);
                        String strO2 = cwl1.o0(x340Var, 2131953556);
                        int size = c380Var.size();
                        if (c380Var.size() <= 3) {
                            x340Var.i0(-664599201);
                            x340Var.r(false);
                            strA = quc0Var.a(c380Var);
                        } else {
                            x340Var.i0(-664596745);
                            strA = quc0Var.a(o7h.O0(cwl1.U(2131820608, c380Var.size() - 2, new Object[]{Integer.valueOf(c380Var.size() - 2)}, x340Var), o7h.d1(c380Var, 2)));
                            x340Var.r(false);
                        }
                        String strU = cwl1.U(2131820607, size, new Object[]{strA}, x340Var);
                        Object objT = x340Var.T();
                        m4c m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = v8r.q(Boolean.TRUE);
                            x340Var.s0(objT);
                        }
                        ven0 ven0Var = (ven0) objT;
                        boolean z = (i2 & 896) == 256;
                        Object objT2 = x340Var.T();
                        if (z || objT2 == m4cVar) {
                            objT2 = new swi0(function0, ven0Var, (byte) 3);
                            x340Var.s0(objT2);
                        }
                        Function0 function2 = (Function0) objT2;
                        if (((Boolean) ven0Var.getValue()).booleanValue()) {
                            x340Var.i0(872783198);
                            i3u i3uVar = new i3u(4, false, false, false);
                            if (ihc1.y0(strO0)) {
                                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                return;
                            }
                            zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function0));
                            if (ihc1.y0(strO1)) {
                                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                return;
                            } else {
                                mqo1.d(function2, i3uVar, null, strO2, strU, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function1)), x340Var, 2359344, 4);
                                x340Var.r(false);
                            }
                        } else {
                            x340Var.i0(873218655);
                            x340Var.r(false);
                        }
                    } else {
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new b2o0(i, quc0Var, c380Var, function0, function1, (byte) 2);
                    }
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public static final void e(zmo1 zmo1Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                    qim0 qim0Var2;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(-1760466660);
                    int i2 = (x340Var.g(zmo1Var) ? 4 : 2) | i | 48;
                    if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                        uwr uwrVar = cbx.a;
                        zov0 zov0Var = cbx.b(x340Var).g;
                        boolean z = zmo1Var instanceof u1s0;
                        isl islVar = isl.a;
                        qim0Var2 = nim0.a;
                        if (z) {
                            x340Var.i0(-216398641);
                            eso1.h(i3o1.n(((u1s0) zmo1Var).b, x340Var, 0), islVar, qim0Var2, new p3v(24.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var, 440, 496);
                            x340Var.r(false);
                        } else {
                            if (!(zmo1Var instanceof v1s0)) {
                                throw p3d1.k(x340Var, 408659684, false);
                            }
                            x340Var.i0(-216171194);
                            eso1.e(((v1s0) zmo1Var).b, islVar, qim0Var2, new p3v(24.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 432, 0, 4080);
                            x340Var.r(false);
                        }
                    } else {
                        x340Var.b0();
                        qim0Var2 = qim0Var;
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new jyo0(zmo1Var, qim0Var2, i, (byte) 26);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:101:0x011d  */
                /* JADX WARN: Code duplicated, block: B:110:0x013a A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:111:0x013c  */
                /* JADX WARN: Code duplicated, block: B:112:0x013f  */
                /* JADX WARN: Code duplicated, block: B:115:0x0146  */
                /* JADX WARN: Code duplicated, block: B:116:0x014a  */
                /* JADX WARN: Code duplicated, block: B:119:0x0150  */
                /* JADX WARN: Code duplicated, block: B:122:0x0157  */
                /* JADX WARN: Code duplicated, block: B:123:0x0168  */
                /* JADX WARN: Code duplicated, block: B:125:0x01a6  */
                /* JADX WARN: Code duplicated, block: B:127:0x01ac  */
                /* JADX WARN: Code duplicated, block: B:128:0x01b7  */
                /* JADX WARN: Code duplicated, block: B:130:0x01bd  */
                /* JADX WARN: Code duplicated, block: B:132:0x01c0  */
                /* JADX WARN: Code duplicated, block: B:133:0x01cb  */
                /* JADX WARN: Code duplicated, block: B:139:0x0204  */
                /* JADX WARN: Code duplicated, block: B:143:0x021a  */
                /* JADX WARN: Code duplicated, block: B:145:0x021d  */
                /* JADX WARN: Code duplicated, block: B:146:0x0229  */
                /* JADX WARN: Code duplicated, block: B:148:0x0244  */
                /* JADX WARN: Code duplicated, block: B:149:0x0247  */
                /* JADX WARN: Code duplicated, block: B:154:0x025d  */
                /* JADX WARN: Code duplicated, block: B:156:0x02c1  */
                /* JADX WARN: Code duplicated, block: B:159:0x02d0  */
                /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
                /* JADX WARN: Type inference failed for: r2v10 */
                /* JADX WARN: Type inference failed for: r2v2 */
                /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
                public static final void f(String str, zmo1 zmo1Var, String str2, if5 if5Var, String str3, Function0 function0, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, lax laxVar, lax laxVar2, b0k b0kVar, int i, int i2) {
                    int i3;
                    qim0 qim0Var2;
                    lax laxVar3;
                    char c;
                    zmo1 zmo1Var2;
                    String str4;
                    lax laxVar4;
                    lax laxVar5;
                    qim0 qim0Var3;
                    h311 h311VarV;
                    qim0 qim0Var4;
                    int i4;
                    lax laxVar6;
                    lax laxVar7;
                    qim0 qim0Var5;
                    lax laxVar8;
                    ?? r2;
                    byte b2;
                    j2i j2iVarB;
                    gbx gbxVar;
                    j2i j2iVarR;
                    boolean zA;
                    byte b3;
                    j2i j2iVar;
                    List listI0;
                    xu30 xu30Var;
                    j2i j2iVar2;
                    boolean zI;
                    Object objT;
                    int i5;
                    iu30 iu30Var3 = iu30Var2;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(-1153528915);
                    if ((i & 6) == 0) {
                        i3 = (x340Var.g(str) ? 4 : 2) | i;
                    } else {
                        i3 = i;
                    }
                    if ((i & 48) == 0) {
                        i3 |= x340Var.g(zmo1Var) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i3 |= x340Var.g(str2) ? 256 : 128;
                    }
                    if ((i & 3072) == 0) {
                        i3 |= (i & 4096) == 0 ? x340Var.g(if5Var) : x340Var.i(if5Var) ? 2048 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        i3 |= x340Var.g(str3) ? 16384 : 8192;
                    }
                    if ((196608 & i) == 0) {
                        i3 |= x340Var.i(function0) ? 131072 : 65536;
                    }
                    if ((1572864 & i) == 0) {
                        i3 |= x340Var.i(iu30Var) ? 1048576 : 524288;
                    }
                    if ((12582912 & i) == 0) {
                        i3 |= x340Var.i(iu30Var3) ? 8388608 : 4194304;
                    }
                    int i6 = i2 & 256;
                    if (i6 != 0) {
                        i3 |= 100663296;
                        qim0Var2 = qim0Var;
                    } else {
                        qim0Var2 = qim0Var;
                        if ((i & 100663296) == 0) {
                            i3 |= x340Var.i(qim0Var2) ? 67108864 : 33554432;
                        }
                    }
                    if ((i & 805306368) == 0) {
                        if ((i2 & 512) != 0) {
                            i5 = 268435456;
                        } else {
                            if ((1073741824 & i) == 0 ? x340Var.g(laxVar) : x340Var.i(laxVar)) {
                                i5 = 536870912;
                            } else {
                                i5 = 268435456;
                            }
                        }
                        i3 |= i5;
                    }
                    if ((i2 & 1024) == 0) {
                        laxVar3 = laxVar2;
                        c = x340Var.g(laxVar3) ? (char) 4 : (char) 2;
                        if (x340Var.Y(i3 & 1, (i3 & 306783379) == 306783378 || (c & 3) != 2)) {
                            x340Var.d0();
                            if ((i & 1) != 0 || x340Var.E()) {
                                if (i6 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                i4 = i2 & 512;
                                laxVar6 = iax.a;
                                if (i4 != 0) {
                                    i3 &= -1879048193;
                                    laxVar7 = laxVar6;
                                } else {
                                    laxVar7 = laxVar;
                                }
                                if ((i2 & 1024) != 0) {
                                    laxVar3 = laxVar6;
                                }
                            } else {
                                x340Var.b0();
                                if ((i2 & 512) != 0) {
                                    i3 &= -1879048193;
                                }
                                laxVar7 = laxVar;
                                qim0Var4 = qim0Var2;
                            }
                            x340Var.s();
                            if (if5Var == null) {
                                x340Var.i0(-746080118);
                                x340Var.r(false);
                                qim0Var5 = qim0Var4;
                                laxVar8 = laxVar7;
                                r2 = 0;
                                j2iVarB = null;
                                b2 = 1;
                            } else {
                                x340Var.i0(-439709097);
                                uwr uwrVar = cbx.a;
                                qim0Var5 = qim0Var4;
                                laxVar8 = laxVar7;
                                r2 = 0;
                                b2 = 1;
                                j2iVarB = if5Var.b((qim0) null, cbx.d(x340Var).j, new u7h(cbx.a(x340Var).b.b), x340Var, (i3 & 7168) | 4096, 1);
                                x340Var.r(false);
                            }
                            if (str3 != null) {
                                gbxVar = null;
                            } else {
                                if (!ihc1.y0(str3)) {
                                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                    return;
                                }
                                gbxVar = new gbx(new y50(str3), function0);
                            }
                            if (gbxVar == null) {
                                x340Var.i0(-745809736);
                                x340Var.r((boolean) r2);
                                j2iVarR = null;
                            } else {
                                x340Var.i0(-745809735);
                                j2iVarR = apo.r(-406405812, new p70(str, laxVar8, iu30Var, gbxVar), x340Var);
                                x340Var.r((boolean) r2);
                            }
                            zA = ef.b(x340Var).a();
                            b3 = b2;
                            uvx uvxVarB = uvx.b((uvx) x340Var.k(vvx.a), (int) r2, (tvx) null, (p3v) null, 30);
                            max maxVarZ = mmo1.z(laxVar3, x340Var);
                            if (j2iVarR == null && zA) {
                                j2iVar = j2iVarR;
                            } else {
                                j2iVar = null;
                            }
                            xu30[] xu30VarArr = new xu30[2];
                            xu30VarArr[r2] = j2iVarB;
                            xu30VarArr[b3] = j2iVar;
                            listI0 = f46.i0(xu30VarArr);
                            if (((ArrayList) listI0).isEmpty()) {
                                listI0 = null;
                            }
                            if (listI0 == null) {
                                x340Var.i0(-744750683);
                                x340Var.r((boolean) r2);
                                xu30Var = null;
                            } else {
                                x340Var.i0(-744750682);
                                xu30 xu30VarR = apo.r(1821845418, new xhf(listI0, b3), x340Var);
                                x340Var.r((boolean) r2);
                                xu30Var = xu30VarR;
                            }
                            if (zA) {
                                j2iVar2 = null;
                            } else {
                                j2iVar2 = j2iVarR;
                            }
                            qim0 qim0VarF = u291.f(qim0Var5, 1.0f);
                            zI = x340Var.i(gbxVar);
                            objT = x340Var.T();
                            if (zI || objT == fkj0.X) {
                                objT = new o70(gbxVar, (byte) 3);
                                x340Var.s0(objT);
                            }
                            iu30Var3 = iu30Var2;
                            qim0 qim0VarQ = m0p1.q(s161.b(qim0VarF, true, (iu30) objT), laxVar3, iu30Var3);
                            zmo1Var2 = zmo1Var;
                            str4 = str2;
                            jto1.b(anm1.N("partnerIntegrationSetting_".concat(str), qim0VarQ), uvxVarB, maxVarZ, false, null, null, null, null, apo.r(1707924791, new n1r0(zmo1Var2, (byte) 12), x340Var), null, null, xu30Var, j2iVar2, null, null, apo.r(1473542897, new qdg0(str4, (byte) 22), x340Var), x340Var, 100663360, 196608, 26360);
                            qim0Var3 = qim0Var5;
                            laxVar4 = laxVar8;
                            laxVar5 = laxVar3;
                        } else {
                            zmo1Var2 = zmo1Var;
                            str4 = str2;
                            x340Var.b0();
                            laxVar4 = laxVar;
                            laxVar5 = laxVar3;
                            qim0Var3 = qim0Var2;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new g2s0(str, zmo1Var2, str4, if5Var, str3, function0, iu30Var, iu30Var3, qim0Var3, laxVar4, laxVar5, i, i2);
                        }
                    }
                    laxVar3 = laxVar2;
                    if (x340Var.Y(i3 & 1, (i3 & 306783379) == 306783378 || (c & 3) != 2)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if (i6 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            i4 = i2 & 512;
                            laxVar6 = iax.a;
                            if (i4 != 0) {
                                i3 &= -1879048193;
                                laxVar7 = laxVar6;
                            } else {
                                laxVar7 = laxVar;
                            }
                            if ((i2 & 1024) != 0) {
                                laxVar3 = laxVar6;
                            }
                        } else {
                            if (i6 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            i4 = i2 & 512;
                            laxVar6 = iax.a;
                            if (i4 != 0) {
                                i3 &= -1879048193;
                                laxVar7 = laxVar6;
                            } else {
                                laxVar7 = laxVar;
                            }
                            if ((i2 & 1024) != 0) {
                                laxVar3 = laxVar6;
                            }
                        }
                        x340Var.s();
                        if (if5Var == null) {
                            x340Var.i0(-746080118);
                            x340Var.r(false);
                            qim0Var5 = qim0Var4;
                            laxVar8 = laxVar7;
                            r2 = 0;
                            j2iVarB = null;
                            b2 = 1;
                        } else {
                            x340Var.i0(-439709097);
                            uwr uwrVar2 = cbx.a;
                            qim0Var5 = qim0Var4;
                            laxVar8 = laxVar7;
                            r2 = 0;
                            b2 = 1;
                            j2iVarB = if5Var.b((qim0) null, cbx.d(x340Var).j, new u7h(cbx.a(x340Var).b.b), x340Var, (i3 & 7168) | 4096, 1);
                            x340Var.r(false);
                        }
                        if (str3 != null) {
                            gbxVar = null;
                        } else {
                            if (!ihc1.y0(str3)) {
                                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                return;
                            }
                            gbxVar = new gbx(new y50(str3), function0);
                        }
                        if (gbxVar == null) {
                            x340Var.i0(-745809736);
                            x340Var.r((boolean) r2);
                            j2iVarR = null;
                        } else {
                            x340Var.i0(-745809735);
                            j2iVarR = apo.r(-406405812, new p70(str, laxVar8, iu30Var, gbxVar), x340Var);
                            x340Var.r((boolean) r2);
                        }
                        zA = ef.b(x340Var).a();
                        b3 = b2;
                        uvx uvxVarB2 = uvx.b((uvx) x340Var.k(vvx.a), (int) r2, (tvx) null, (p3v) null, 30);
                        max maxVarZ2 = mmo1.z(laxVar3, x340Var);
                        if (j2iVarR == null) {
                            j2iVar = null;
                        } else {
                            j2iVar = null;
                        }
                        xu30[] xu30VarArr2 = new xu30[2];
                        xu30VarArr2[r2] = j2iVarB;
                        xu30VarArr2[b3] = j2iVar;
                        listI0 = f46.i0(xu30VarArr2);
                        if (((ArrayList) listI0).isEmpty()) {
                            listI0 = null;
                        }
                        if (listI0 == null) {
                            x340Var.i0(-744750683);
                            x340Var.r((boolean) r2);
                            xu30Var = null;
                        } else {
                            x340Var.i0(-744750682);
                            xu30 xu30VarR2 = apo.r(1821845418, new xhf(listI0, b3), x340Var);
                            x340Var.r((boolean) r2);
                            xu30Var = xu30VarR2;
                        }
                        if (zA) {
                            j2iVar2 = j2iVarR;
                        } else {
                            j2iVar2 = null;
                        }
                        qim0 qim0VarF2 = u291.f(qim0Var5, 1.0f);
                        zI = x340Var.i(gbxVar);
                        objT = x340Var.T();
                        if (zI) {
                            objT = new o70(gbxVar, (byte) 3);
                            x340Var.s0(objT);
                        } else {
                            objT = new o70(gbxVar, (byte) 3);
                            x340Var.s0(objT);
                        }
                        iu30Var3 = iu30Var2;
                        qim0 qim0VarQ2 = m0p1.q(s161.b(qim0VarF2, true, (iu30) objT), laxVar3, iu30Var3);
                        zmo1Var2 = zmo1Var;
                        str4 = str2;
                        jto1.b(anm1.N("partnerIntegrationSetting_".concat(str), qim0VarQ2), uvxVarB2, maxVarZ2, false, null, null, null, null, apo.r(1707924791, new n1r0(zmo1Var2, (byte) 12), x340Var), null, null, xu30Var, j2iVar2, null, null, apo.r(1473542897, new qdg0(str4, (byte) 22), x340Var), x340Var, 100663360, 196608, 26360);
                        qim0Var3 = qim0Var5;
                        laxVar4 = laxVar8;
                        laxVar5 = laxVar3;
                    } else {
                        zmo1Var2 = zmo1Var;
                        str4 = str2;
                        x340Var.b0();
                        laxVar4 = laxVar;
                        laxVar5 = laxVar3;
                        qim0Var3 = qim0Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new g2s0(str, zmo1Var2, str4, if5Var, str3, function0, iu30Var, iu30Var3, qim0Var3, laxVar4, laxVar5, i, i2);
                    }
                }

                public static final void g(String str, String str2, String str3, String str4, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
                    b0k b0kVar2;
                    qim0 qim0Var2;
                    xu30 xu30Var;
                    b0k b0kVar3 = (x340) b0kVar;
                    b0kVar3.k0(-1399830588);
                    int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(str3) ? 256 : 128) | (b0kVar3.g(str4) ? 2048 : 1024) | (b0kVar3.i(function0) ? 16384 : 8192) | 196608;
                    if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(b0kVar3).b;
                        cvx cvxVar2 = cbx.b(b0kVar3).b;
                        cvx cvxVar3 = cbx.b(b0kVar3).b;
                        cvx cvxVar4 = cbx.b(b0kVar3).b;
                        zzq0 zzq0Var = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
                        ydx ydxVar = new ydx(2.0f, 12.0f, 8.0f, zzq0Var);
                        float fN = (uyn1.n(zzq0Var, (flb0) b0kVar3.k(t4k.n)) * 2.0f) + 144.0f;
                        qim0 qim0Var3 = nim0.a;
                        qim0 qim0VarN = anm1.N("series_book_card", u291.v(qim0Var3, fN));
                        ngx ngxVar = ngx.e;
                        gbx gbxVar = new gbx(z50.c, function0);
                        xu30 xu30VarR = null;
                        if (str2 == null) {
                            b0kVar3.i0(1780193071);
                            b0kVar3.r(false);
                            xu30Var = null;
                        } else {
                            b0kVar3.i0(1780193072);
                            xu30 xu30VarR2 = apo.r(133922541, new iww0(str2, (byte) 17), b0kVar3);
                            b0kVar3.r(false);
                            xu30Var = xu30VarR2;
                        }
                        if (str4 == null) {
                            b0kVar3.i0(1780493678);
                            b0kVar3.r(false);
                        } else {
                            b0kVar3.i0(1780493679);
                            xu30VarR = apo.r(-1229563505, new iww0(str4, (byte) 18), b0kVar3);
                            b0kVar3.r(false);
                        }
                        b0kVar2 = b0kVar3;
                        ioo1.c(qim0VarN, ngxVar, ydxVar, null, null, null, null, gbxVar, null, apo.r(1373686825, new iww0(str, (byte) 19), b0kVar3), null, xu30Var, xu30VarR, null, null, null, apo.r(-96241233, new iww0(str3, (byte) 20), b0kVar3), b0kVar2, 805306880, 1572864, 58744);
                        qim0Var2 = qim0Var3;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        qim0Var2 = qim0Var;
                    }
                    h311 h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new mlm(str, str2, str3, str4, function0, qim0Var2, i, (byte) 1);
                    }
                }

                public static final void h(String str, rha1 rha1Var, List list, xu30 xu30Var, Function0 function0, b0k b0kVar, int i) {
                    x340 x340Var;
                    String strK;
                    String strN0;
                    char c;
                    Object ow6Var;
                    cia1 cia1Var;
                    boolean z;
                    boolean z2;
                    int i2;
                    boolean z3;
                    rha1 rha1Var2;
                    int i3;
                    xu30 xu30Var2;
                    m4c m4cVar = fkj0.X;
                    x340 x340Var2 = (x340) b0kVar;
                    x340Var2.k0(1486866363);
                    int i4 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.e(rha1Var == null ? -1 : rha1Var.ordinal()) ? 32 : 16) | (x340Var2.g(list) ? 256 : 128) | (x340Var2.i(xu30Var) ? 2048 : 1024) | (x340Var2.i(function0) ? 16384 : 8192);
                    if (x340Var2.Y(i4 & 1, (i4 & 9363) != 9362)) {
                        nim0 nim0Var = nim0.a;
                        qim0 qim0VarN = anm1.N("sort_sheet", nim0Var);
                        kiv kivVar = xce0.a;
                        qim0 qim0VarH = l6o1.H(zr7.i(qim0VarN, gce0.c), l6o1.C(0, 0, 1, x340Var2), false, 14);
                        WeakHashMap weakHashMap = osl1.x;
                        qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarH);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var2).b;
                        qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarP);
                        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                        int iHashCode = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM = x340Var2.m();
                        qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
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
                        String strO0 = cwl1.o0(x340Var2, 2131962792);
                        qim0 qim0VarN2 = anm1.N("sort_sheet_title", nim0Var);
                        cvx cvxVar2 = cbx.b(x340Var2).b;
                        qim0 qim0VarZ2 = uyn1.z(0.0f, 16.0f, 1, qim0VarN2);
                        lee1 lee1Var = cbx.d(x340Var2).k;
                        long j = cbx.a(x340Var2).b.b;
                        boolean z4 = false;
                        int i5 = 1;
                        nim0 nim0Var2 = nim0Var;
                        int i6 = 16384;
                        uwo1.e(strO0, qim0VarZ2, lee1Var, j, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                        x340 x340Var3 = x340Var2;
                        x340Var3.i0(-535725867);
                        int size = list.size();
                        int i7 = 0;
                        while (i7 < size) {
                            cia1 cia1Var2 = (cia1) list.get(i7);
                            String str2 = cia1Var2.b;
                            boolean z5 = cia1Var2.d;
                            boolean zJ = u890.j(str2, str);
                            if (zJ && z5) {
                                x340Var3.i0(1280738718);
                                int i8 = rha1Var == null ? -1 : qw6.a[rha1Var.ordinal()];
                                if (i8 == -1) {
                                    x340Var3.i0(1280968024);
                                    x340Var3.r(z4);
                                    strK = null;
                                } else if (i8 == i5) {
                                    strK = x0d.k(x340Var3, -97231268, 2131962810, x340Var3, z4);
                                } else {
                                    if (i8 != 2) {
                                        throw p3d1.k(x340Var3, -97233180, z4);
                                    }
                                    strK = x0d.k(x340Var3, -97228195, 2131962812, x340Var3, z4);
                                }
                                x340Var3.r(z4);
                            } else {
                                x340Var3.i0(1281000451);
                                x340Var3.r(z4);
                                strK = null;
                            }
                            if (zJ && z5) {
                                strN0 = x0d.k(x340Var3, 1281097295, 2131962820, x340Var3, z4);
                            } else if (zJ) {
                                strN0 = x0d.k(x340Var3, 1281196960, 2131962791, x340Var3, z4);
                            } else {
                                x340Var3.i0(1281295292);
                                strN0 = cwl1.n0(2131962790, new Object[]{cia1Var2.c}, x340Var3);
                                x340Var3.r(z4);
                            }
                            String str3 = strN0;
                            String str4 = cia1Var2.b;
                            if (str4 == null) {
                                str4 = "default";
                            }
                            qim0 qim0VarN3 = anm1.N("sort_option_".concat(str4), nim0Var2);
                            boolean zH = x340Var3.h(zJ) | x340Var3.g(strK);
                            Object objT = x340Var3.T();
                            if (zH || objT == m4cVar) {
                                c = 2;
                                objT = new cl1(zJ, strK, (byte) 2);
                                x340Var3.s0(objT);
                            } else {
                                c = 2;
                            }
                            qim0 qim0VarB = s161.b(qim0VarN3, false, (iu30) objT);
                            uwr uwrVar2 = cbx.a;
                            cvx cvxVar3 = cbx.b(x340Var3).b;
                            uvx uvxVar = new uvx(1, (pgx) null, 2, uyn1.h(1, 0.0f, 16.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);
                            boolean zH2 = x340Var3.h(zJ) | x340Var3.g(cia1Var2) | ((i4 & 7168) == 2048) | ((i4 & 112) == 32) | x340Var3.e(i7);
                            Object objT2 = x340Var3.T();
                            if (zH2 || objT2 == m4cVar) {
                                cia1Var = cia1Var2;
                                z = zJ;
                                z2 = false;
                                i2 = 16384;
                                z3 = false;
                                rha1Var2 = rha1Var;
                                i3 = i7;
                                ow6Var = new ow6(z, cia1Var, xu30Var, rha1Var2, i3);
                                x340Var3.s0(ow6Var);
                            } else {
                                ow6Var = objT2;
                                cia1Var = cia1Var2;
                                z = zJ;
                                z2 = false;
                                i2 = 16384;
                                z3 = false;
                                rha1Var2 = rha1Var;
                                i3 = i7;
                            }
                            gbx gbxVar = new gbx(new y50(str3), (Function0) ow6Var);
                            if (z) {
                                x340Var3.i0(1282258369);
                                xu30 xu30VarR = apo.r(290531907, new wf((Object) cia1Var, (Object) rha1Var2, (byte) 21), x340Var3);
                                x340Var3.r(z2);
                                xu30Var2 = xu30VarR;
                            } else {
                                x340Var3.i0(1282784191);
                                x340Var3.r(z2);
                                xu30Var2 = null;
                            }
                            j2i j2iVarR = apo.r(-1399286463, new zw2((Object) cia1Var, z, (byte) c), x340Var3);
                            z4 = z2;
                            x340 x340Var4 = x340Var3;
                            nim0Var2 = nim0Var2;
                            jto1.b(qim0VarB, uvxVar, null, false, null, null, gbxVar, null, null, null, null, null, xu30Var2, null, null, j2iVarR, x340Var4, 64, 196608, 28604);
                            x340Var3 = x340Var4;
                            i7 = i3 + 1;
                            size = size;
                            i6 = i2;
                            i4 = i4;
                            i5 = 1;
                        }
                        int i9 = i4;
                        int i10 = i6;
                        x340Var3.r(z4);
                        uwr uwrVar3 = cbx.a;
                        cvx cvxVar4 = cbx.b(x340Var3).b;
                        qim0 qim0VarN4 = anm1.N("sort_sheet_cancel", ab80.o(nim0Var2, 12.0f, x340Var3, nim0Var2, 1.0f));
                        boolean z6 = (i9 & 57344) == i10 ? true : z4;
                        Object objT3 = x340Var3.T();
                        if (z6 || objT3 == m4cVar) {
                            objT3 = new lj2(function0, (byte) 12);
                            x340Var3.s0(objT3);
                        }
                        gbx gbxVar2 = new gbx(z50.c, (Function0) objT3);
                        gra graVar = een.h;
                        cvx cvxVar5 = cbx.b(x340Var3).b;
                        x340 x340Var5 = x340Var3;
                        cwl1.b(qim0VarN4, graVar, d4o1.a, (pgx) null, uyn1.h(1, 0.0f, 16.0f), (max) null, false, (idn0) null, (ga80) null, gbxVar2, (gbx) null, c7i.a, x340Var5, 0, 48, 1512);
                        x340Var = x340Var5;
                        cvx cvxVar6 = cbx.b(x340Var).b;
                        x0d.s(nim0Var2, 16.0f, x340Var, true);
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new m(str, rha1Var, list, xu30Var, function0, i);
                    }
                }

                public static final void i(mhg1 mhg1Var, fhg1 fhg1Var, Object obj, Object obj2, ni20 ni20Var, b0k b0kVar, int i) {
                    int i2;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(867041821);
                    if ((i & 6) == 0) {
                        i2 = (x340Var.g(mhg1Var) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= x340Var.g(fhg1Var) ? 32 : 16;
                    }
                    if ((i & 384) == 0) {
                        i2 |= (i & 512) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 256 : 128;
                    }
                    if ((i & 3072) == 0) {
                        i2 |= (i & 4096) == 0 ? x340Var.g(obj2) : x340Var.i(obj2) ? 2048 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        i2 |= (32768 & i) == 0 ? x340Var.g(ni20Var) : x340Var.i(ni20Var) ? 16384 : 8192;
                    }
                    if (!x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                        x340Var.b0();
                    } else if (mhg1Var.g()) {
                        fhg1Var.i(obj, obj2, ni20Var);
                    } else {
                        fhg1Var.j(obj2, ni20Var, (Object) null, (oe5) null);
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new hfa(mhg1Var, fhg1Var, obj, obj2, ni20Var, i);
                    }
                }

                public static final void j(ijr0 ijr0Var, List list, ntb0 ntb0Var) {
                    isb0 isb0Var = ntb0Var.d;
                    ktb0 ktb0Var = ntb0Var.c;
                    Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
                    try {
                        if (ijr0Var.b() && !list.isEmpty()) {
                            int i = ((qtb0) o7h.q0(list)).a;
                            int i2 = ((qtb0) o7h.A0(list)).a;
                            for (int i3 = ijr0Var.h; i3 < i; i3++) {
                                if (i3 >= 0 && i3 < ktb0Var.b.C()) {
                                    isb0Var.a(i3);
                                }
                            }
                            int i4 = i2 + 1;
                            int i5 = ijr0Var.i;
                            if (i4 <= i5) {
                                while (true) {
                                    if (i4 >= 0 && i4 < ktb0Var.b.C()) {
                                        isb0Var.a(i4);
                                    }
                                    if (i4 == i5) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                        }
                    } finally {
                        Trace.endSection();
                    }
                }

                public static final void k(Throwable th) {
                    n57.t("Failed to handle player command: " + th.getMessage(), th);
                }

                public static final xvj l() {
                    return new xvj(e0j.b, (j2i) null, (j2i) null, false, 62);
                }

                public static final bjg1 m(mhg1 mhg1Var, Object obj, Object obj2, String str, b0k b0kVar, int i) {
                    m4c m4cVar = fkj0.X;
                    int i2 = (i & 14) ^ 6;
                    boolean z = true;
                    boolean z2 = (i2 > 4 && ((x340) b0kVar).g(mhg1Var)) || (i & 6) == 4;
                    x340 x340Var = (x340) b0kVar;
                    Object objT = x340Var.T();
                    if (z2 || objT == m4cVar) {
                        objT = new bjg1(new zen0(obj), mhg1Var, xcg1.i(mhg1Var.c, " > ", str));
                        x340Var.s0(objT);
                    }
                    bjg1 bjg1Var = (bjg1) objT;
                    if ((i2 <= 4 || !x340Var.g(mhg1Var)) && (i & 6) != 4) {
                        z = false;
                    }
                    boolean zG = x340Var.g(bjg1Var) | z;
                    Object objT2 = x340Var.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new vae1(mhg1Var, bjg1Var, (byte) 5);
                        x340Var.s0(objT2);
                    }
                    qxd0.i(bjg1Var, (iu30) objT2, x340Var);
                    if (mhg1Var.g()) {
                        bjg1Var.k(obj, obj2);
                        return bjg1Var;
                    }
                    bjg1Var.r(obj2);
                    ((mhg1) bjg1Var).l.setValue(Boolean.FALSE);
                    return bjg1Var;
                }

                public static final zgg1 n(mhg1 mhg1Var, tzg1 tzg1Var, String str, b0k b0kVar, int i, int i2) {
                    ygg1 ygg1VarC;
                    m4c m4cVar = fkj0.X;
                    if ((i2 & 2) != 0) {
                        str = "DeferredAnimation";
                    }
                    boolean zG = ((x340) b0kVar).g(mhg1Var);
                    x340 x340Var = (x340) b0kVar;
                    Object objT = x340Var.T();
                    if (zG || objT == m4cVar) {
                        objT = new zgg1(mhg1Var, tzg1Var, str);
                        x340Var.s0(objT);
                    }
                    zgg1 zgg1Var = (zgg1) objT;
                    boolean zG2 = x340Var.g(mhg1Var) | x340Var.i(zgg1Var);
                    Object objT2 = x340Var.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new vae1(mhg1Var, zgg1Var, (byte) 6);
                        x340Var.s0(objT2);
                    }
                    qxd0.i(zgg1Var, (iu30) objT2, x340Var);
                    if (mhg1Var.g() && (ygg1VarC = zgg1Var.c()) != null) {
                        mhg1 mhg1Var2 = zgg1Var.c;
                        ygg1VarC.a.i(ygg1VarC.c.invoke(mhg1Var2.f().e()), ygg1VarC.c.invoke(mhg1Var2.f().b()), (ni20) ygg1VarC.b.invoke(mhg1Var2.f()));
                    }
                    return zgg1Var;
                }

                public static final fhg1 o(mhg1 mhg1Var, Object obj, Object obj2, ni20 ni20Var, tzg1 tzg1Var, b0k b0kVar, int i) {
                    m4c m4cVar = fkj0.X;
                    boolean zG = ((x340) b0kVar).g(mhg1Var);
                    x340 x340Var = (x340) b0kVar;
                    Object objT = x340Var.T();
                    if (zG || objT == m4cVar) {
                        jv91 jv91VarO = ekb.o();
                        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
                        jv91 jv91VarU = ekb.u(jv91VarO);
                        try {
                            fhg1 fhg1Var = new fhg1(mhg1Var, obj, prn1.n(tzg1Var, obj2), tzg1Var);
                            ekb.C(jv91VarO, jv91VarU, iu30VarE);
                            x340Var.s0(fhg1Var);
                            objT = fhg1Var;
                        } catch (Throwable th) {
                            ekb.C(jv91VarO, jv91VarU, iu30VarE);
                            throw th;
                        }
                    }
                    fhg1 fhg1Var2 = (fhg1) objT;
                    i(mhg1Var, fhg1Var2, obj, obj2, ni20Var, x340Var, 0);
                    boolean zG2 = x340Var.g(mhg1Var) | x340Var.g(fhg1Var2);
                    Object objT2 = x340Var.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new vae1(mhg1Var, fhg1Var2, (byte) 7);
                        x340Var.s0(objT2);
                    }
                    qxd0.i(fhg1Var2, (iu30) objT2, x340Var);
                    return fhg1Var2;
                }

                public static ibx p(b0k b0kVar) {
                    i930 i930VarI = fno1.i(FontWeight.f.a);
                    uwr uwrVar = cbx.a;
                    return new ibx(new lee1(0L, cbx.d(b0kVar).a.a.b, (FontWeight) null, i930VarI, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777117), cbx.d(b0kVar).a);
                }

                public static final String q(b0k b0kVar, int i) {
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k(AndroidCompositionLocals_androidKt.a);
                    return ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getResources().getString(i);
                }

                public static final boolean r(Double d, double d2) {
                    return d == null || Math.abs(d.doubleValue() - d2) > 0.001d;
                }

                public static boolean s(Context context) {
                    return context.getResources().getConfiguration().getLayoutDirection() == 1;
                }

                public static boolean t(View view) {
                    WeakHashMap weakHashMap = b8k1.a;
                    return view.getLayoutDirection() == 1;
                }

                public static final mhg1 u(k9 k9Var, String str, b0k b0kVar, int i, int i2) {
                    m4c m4cVar = fkj0.X;
                    if ((i2 & 2) != 0) {
                        str = null;
                    }
                    int i3 = (i & 14) ^ 6;
                    boolean z = true;
                    boolean z2 = (i3 > 4 && ((x340) b0kVar).g(k9Var)) || (i & 6) == 4;
                    x340 x340Var = (x340) b0kVar;
                    Object objT = x340Var.T();
                    if (z2 || objT == m4cVar) {
                        jv91 jv91VarO = ekb.o();
                        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
                        jv91 jv91VarU = ekb.u(jv91VarO);
                        try {
                            bjg1 bjg1Var = new bjg1(k9Var, (mhg1) null, str);
                            ekb.C(jv91VarO, jv91VarU, iu30VarE);
                            x340Var.s0(bjg1Var);
                            objT = bjg1Var;
                        } catch (Throwable th) {
                            ekb.C(jv91VarO, jv91VarU, iu30VarE);
                            throw th;
                        }
                    }
                    mhg1 mhg1Var = (mhg1) objT;
                    if (k9Var instanceof jo51) {
                        x340Var.i0(-1357398105);
                        Object objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = qxd0.M(o6x.a, x340Var);
                            x340Var.s0(objT2);
                        }
                        c9n c9nVar = (c9n) objT2;
                        boolean zI = x340Var.i(c9nVar) | ((i3 > 4 && x340Var.g(k9Var)) || (i & 6) == 4);
                        Object objT3 = x340Var.T();
                        if (zI || objT3 == m4cVar) {
                            objT3 = new vae1(k9Var, c9nVar, (byte) 4);
                            x340Var.s0(objT3);
                        }
                        qxd0.i(c9nVar, (iu30) objT3, x340Var);
                        jo51 jo51Var = (jo51) k9Var;
                        Object value = jo51Var.d.getValue();
                        Object value2 = jo51Var.c.getValue();
                        if ((i3 <= 4 || !x340Var.g(k9Var)) && (i & 6) != 4) {
                            z = false;
                        }
                        Object objT4 = x340Var.T();
                        if (z || objT4 == m4cVar) {
                            objT4 = new bfb1(k9Var, (lnm) null);
                            x340Var.s0(objT4);
                        }
                        qxd0.s(value, value2, (vu30) objT4, x340Var);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1356407283);
                        mhg1Var.a(k9Var.Y0(), x340Var, 0);
                        x340Var.r(false);
                    }
                    boolean zG = x340Var.g(mhg1Var);
                    Object objT5 = x340Var.T();
                    if (zG || objT5 == m4cVar) {
                        objT5 = new w7d1(mhg1Var, (byte) 12);
                        x340Var.s0(objT5);
                    }
                    qxd0.i(mhg1Var, (iu30) objT5, x340Var);
                    return mhg1Var;
                }

                public static final boolean v(l0l l0lVar) {
                    return l0lVar != null && !l0lVar.l() && l0lVar.F() && l0lVar.A() > 0;
                }

                public static final Intent w(String str) {
                    Intent m231Var;
                    try {
                        m231Var = Intent.parseUri(str, 1);
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    Throwable thA = e331.a(m231Var);
                    if (thA != null) {
                        Logger.e(thA, "Failed to parse intent.", new Object[0]);
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    return m231Var;
                }

                public static final Uri x(String str) {
                    Uri m231Var;
                    try {
                        m231Var = Uri.parse(str);
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    Throwable thA = e331.a(m231Var);
                    if (thA != null) {
                        Logger.e(thA, "Failed to parse uri.", new Object[0]);
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    return m231Var;
                }

                public static final bjg1 y(Object obj, String str, b0k b0kVar, int i, int i2) {
                    if ((i2 & 2) != 0) {
                        str = null;
                    }
                    x340 x340Var = (x340) b0kVar;
                    Object objT = x340Var.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = new bjg1(new zen0(obj), (mhg1) null, str);
                        x340Var.s0(objT);
                    }
                    bjg1 bjg1Var = (bjg1) objT;
                    bjg1Var.a(obj, x340Var, (i & 8) | 48 | (i & 14));
                    Object objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = new w7d1(bjg1Var, (byte) 13);
                        x340Var.s0(objT2);
                    }
                    qxd0.i(bjg1Var, (iu30) objT2, x340Var);
                    return bjg1Var;
                }

                public g7p1 z(String str) {
                    iti1 iti1Var;
                    Charset charset = StandardCharsets.UTF_8;
                    f8p1 f8p1Var = (f8p1) this;
                    boolean z = f8p1Var.e;
                    int i = f8p1Var.d;
                    MessageDigest messageDigest = f8p1Var.c;
                    if (z) {
                        try {
                            iti1Var = new iti1((MessageDigest) messageDigest.clone(), i);
                        } catch (CloneNotSupportedException unused) {
                            try {
                                iti1Var = new iti1(MessageDigest.getInstance(messageDigest.getAlgorithm()), i);
                            } catch (NoSuchAlgorithmException e) {
                                eg.f(e);
                                return null;
                            }
                        }
                    } else {
                        iti1Var = new iti1(MessageDigest.getInstance(messageDigest.getAlgorithm()), i);
                    }
                    MessageDigest messageDigest2 = (MessageDigest) iti1Var.c;
                    byte[] bytes = str.toString().getBytes(charset);
                    bytes.getClass();
                    int length = bytes.length;
                    ulo1.v(!iti1Var.a, "Cannot re-use a Hasher after calling hash() on it");
                    messageDigest2.update(bytes, 0, length);
                    ulo1.v(!iti1Var.a, "Cannot re-use a Hasher after calling hash() on it");
                    iti1Var.a = true;
                    int i2 = iti1Var.b;
                    return i2 == messageDigest2.getDigestLength() ? new a7p1(messageDigest2.digest()) : new a7p1(Arrays.copyOf(messageDigest2.digest(), i2));
                }
            }
