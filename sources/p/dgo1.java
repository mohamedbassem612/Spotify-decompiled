package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Annotation;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
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
import com.spotify.contentagnostic.v2.ColorSet;
import com.spotify.contentagnostic.v2.RgbaColor;
import defpackage.m;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class dgo1 {
    public static b180 a;
    public static boolean b;

    public static final void a(int i, int i2, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1239216214);
        int i3 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                z = false;
            }
            qim0 qim0VarR = u291.r(qim0Var, 120.0f);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = t16.U0;
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarR, (iu30) objT);
            boolean zD = ((i3 & 112) == 32) | x340Var.d(120.0f) | x340Var.d(8.0f) | x340Var.d(16.0f);
            Object objT2 = x340Var.T();
            if (zD || objT2 == m4cVar) {
                objT2 = new gy((byte) 3, z);
                x340Var.s0(objT2);
            }
            qim0 qim0VarS = exd0.s(qim0VarC, (iu30) objT2);
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
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        boolean z2 = z;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ld6(i, i2, j2iVar, qim0Var, z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ff  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static final void b(hvp0 hvp0Var, c380 c380Var, tyq tyqVar, iu30 iu30Var, vzq0 vzq0Var, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        vzq0 vzq0Var2;
        vu30 vu30Var2;
        x340 x340Var;
        tob1 tob1Var;
        m4c m4cVar;
        ?? r1;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1362729539);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(hvp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var2.g(c380Var) : x340Var2.i(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(tyqVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            vzq0Var2 = vzq0Var;
            i2 |= x340Var2.i(vzq0Var2) ? 16384 : 8192;
        } else {
            vzq0Var2 = vzq0Var;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            vu30Var2 = vu30Var;
            i2 |= x340Var2.i(vu30Var2) ? 1048576 : 524288;
        } else {
            vu30Var2 = vu30Var;
        }
        if (x340Var2.Y(i2 & 1, (599187 & i2) != 599186)) {
            Object objT = x340Var2.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = v8r.q((Object) null);
                x340Var2.s0(objT);
            }
            tob1 tob1Var2 = (ven0) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar2) {
                objT2 = gio1.b(c380Var);
                x340Var2.s0(objT2);
            }
            wen0 wen0Var = (wen0) objT2;
            boolean zI = x340Var2.i(wen0Var) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var2.i(c380Var)));
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar2) {
                objT3 = new p8c(wen0Var, c380Var, (lnm) null, (byte) 1);
                x340Var2.s0(objT3);
            }
            qxd0.t(c380Var, x340Var2, (vu30) objT3);
            Object objT4 = x340Var2.T();
            if (objT4 == m4cVar2) {
                dnc0 dnc0VarD = hvp0.d(hvp0Var, xrc.i, xrc.t);
                tob1Var = tob1Var2;
                vu30 vu30Var3 = vu30Var2;
                m4cVar = m4cVar2;
                r1 = 0;
                two1.v(dnc0VarD, new nwd(wen0Var, (byte) 0), false, new db(tyqVar, iu30Var, vu30Var3, tob1Var, (byte) 25));
                objT4 = dnc0VarD.a();
                x340Var2.s0(objT4);
            } else {
                tob1Var = tob1Var2;
                m4cVar = m4cVar2;
                r1 = 0;
            }
            xtb0 xtb0VarA = aub0.a((int) r1, x340Var2, 3);
            q1d0 q1d0VarN = jyo1.n(xtb0VarA, (cnc0) objT4, null, x340Var2, r1);
            float fX = pxd0.x(x340Var2);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarH = u291.h(qim0Var, fX + 32.0f);
            tob1 tob1Var3 = tob1Var;
            fra fraVar = een.N0;
            boolean zI2 = x340Var2.i(q1d0VarN);
            Object objT5 = x340Var2.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new xo8(q1d0VarN, (byte) 3);
                x340Var2.s0(objT5);
            }
            ujo1.e(qim0VarH, xtb0VarA, vzq0Var2, null, fraVar, null, false, null, (iu30) objT5, x340Var2, (i2 >> 6) & 896, 472);
            x340Var = x340Var2;
            if (((Integer) tob1Var3.getValue()) != null) {
                tr80 tr80VarK = p7h.K(c380Var);
                Integer num = (Integer) tob1Var3.getValue();
                if (num == null || !tr80VarK.c(num.intValue())) {
                    x340Var.i0(-1041364379);
                    x340Var.r((boolean) r1);
                } else {
                    x340Var.i0(-1042358053);
                    Integer num2 = (Integer) tob1Var3.getValue();
                    num2.getClass();
                    Object obj = c380Var.get(num2.intValue());
                    String str = "carousel_popup_" + ((Integer) tob1Var3.getValue());
                    boolean zI3 = x340Var.i(tob1Var3);
                    Object objT6 = x340Var.T();
                    if (zI3 || objT6 == m4cVar) {
                        objT6 = new bp9(tob1Var3, (byte) 14);
                        x340Var.s0(objT6);
                    }
                    prn1.d(384, (Function0) objT6, apo.r(376534401, new m(str, obj, tyqVar, (ven0) tob1Var3, iu30Var), x340Var), x340Var, (qim0) null);
                    x340Var.r((boolean) r1);
                }
            } else {
                x340Var.i0(-1041364379);
                x340Var.r((boolean) r1);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3(hvp0Var, c380Var, tyqVar, iu30Var, vzq0Var, qim0Var, vu30Var, i);
        }
    }

    public static final void c(Object obj, iu30 iu30Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1341826071);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        byte b2 = 0;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ien0 ien0Var = qsw.a;
            u601 u601VarC = gfe0.c(x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new rp80(new gom(iu30Var, b2));
                x340Var.s0(objT);
            }
            rp80 rp80Var = (rp80) objT;
            boolean zG = x340Var.g(obj) | x340Var.g(u601VarC);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                rp80Var.d(new gom(iu30Var, b2));
                fns fnsVar = igu.a;
                rp80Var.b(u601VarC, pyf0.a);
                x340Var.s0(rih1.a);
            }
            qsw.b(rp80Var.j, apo.r(-245786972, new pu2(j2iVar, (byte) 18), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok((byte) 15, i, obj, (Object) j2iVar, iu30Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:220:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:222:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:223:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:226:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:227:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:230:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:231:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:234:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:237:0x0702  */
    /* JADX WARN: Code duplicated, block: B:238:0x0709  */
    /* JADX WARN: Code duplicated, block: B:242:0x073c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0744  */
    /* JADX WARN: Code duplicated, block: B:245:0x0748  */
    /* JADX WARN: Code duplicated, block: B:246:0x0750  */
    /* JADX WARN: Code duplicated, block: B:248:0x0754  */
    /* JADX WARN: Code duplicated, block: B:249:0x075c  */
    /* JADX WARN: Code duplicated, block: B:251:0x0760  */
    /* JADX WARN: Code duplicated, block: B:252:0x0768  */
    /* JADX WARN: Code duplicated, block: B:254:0x076c  */
    /* JADX WARN: Code duplicated, block: B:255:0x0774  */
    /* JADX WARN: Code duplicated, block: B:257:0x0778  */
    /* JADX WARN: Code duplicated, block: B:259:0x077b  */
    /* JADX WARN: Code duplicated, block: B:261:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:264:0x07de  */
    /* JADX WARN: Code duplicated, block: B:267:0x0816  */
    /* JADX WARN: Code duplicated, block: B:269:0x081d  */
    /* JADX WARN: Code duplicated, block: B:270:0x0821  */
    /* JADX WARN: Code duplicated, block: B:273:0x0837  */
    /* JADX WARN: Code duplicated, block: B:274:0x0839  */
    /* JADX WARN: Code duplicated, block: B:277:0x0840 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:280:0x0846  */
    /* JADX WARN: Code duplicated, block: B:283:0x0894  */
    /* JADX WARN: Code duplicated, block: B:284:0x0896  */
    /* JADX WARN: Code duplicated, block: B:287:0x089d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:290:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:293:0x08db  */
    /* JADX WARN: Code duplicated, block: B:295:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:296:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:299:0x08f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:302:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:305:0x0933  */
    /* JADX WARN: Code duplicated, block: B:308:0x094f  */
    /* JADX WARN: Code duplicated, block: B:310:0x0977  */
    /* JADX WARN: Code duplicated, block: B:312:0x0983  */
    /* JADX WARN: Code duplicated, block: B:313:0x09a6  */
    /* JADX WARN: Code duplicated, block: B:315:0x09af  */
    /* JADX WARN: Code duplicated, block: B:317:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:319:0x09c5  */
    /* JADX WARN: Code duplicated, block: B:321:0x09cb  */
    /* JADX WARN: Code duplicated, block: B:323:0x09cf  */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v53 */
    public static final void d(vvw vvwVar, int i, String str, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, boolean z, String str2, Function0 function5, Function0 function6, qim0 qim0Var, b0k b0kVar, int i2, int i3) throws NoWhenBranchMatchedException {
        int i4;
        int i5;
        iu30 iu30Var3;
        x340 x340Var;
        int i6;
        qim0 qim0Var2;
        vu30 vu30Var;
        qim0 qim0Var3;
        m4c m4cVar;
        tl3 tl3Var;
        uvw uvwVar;
        int i7;
        j06 j06Var;
        int i8;
        float f;
        ?? r7;
        int i9;
        m4c m4cVar2;
        vu30 vu30Var2;
        vu30 vu30Var3;
        m4c m4cVar3;
        llj lljVar;
        int i10;
        float f2;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        vu30 vu30Var4;
        llj lljVar2;
        vu30 vu30Var5;
        uvw uvwVar2;
        int i11;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objT;
        m4c m4cVar4;
        Integer num;
        int i12;
        mbh mbhVarA2;
        int iHashCode2;
        xos0 xos0VarM2;
        qim0 qim0VarE2;
        boolean z5;
        Object objT2;
        z50 z50Var;
        boolean z6;
        Object objT3;
        ldx ldxVar;
        nvw nvwVar;
        tl3 tl3Var2;
        boolean z7;
        Object objT4;
        Object objT5;
        vvw vvwVar2 = vvwVar;
        Function0 function7 = function3;
        Function0 function8 = function4;
        tl3 tl3Var3 = een.X;
        gra graVar = een.h;
        m4c m4cVar5 = fkj0.X;
        uvw uvwVar3 = vvwVar2.c;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1114833591);
        j06 j06Var2 = x340Var2.a;
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? x340Var2.g(vvwVar2) : x340Var2.i(vvwVar2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var2.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var2.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var2.i(iu30Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= x340Var2.i(iu30Var2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= x340Var2.i(function0) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= x340Var2.i(function1) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= x340Var2.i(function2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= x340Var2.i(function7) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= x340Var2.i(function8) ? 536870912 : 268435456;
        }
        int i13 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (x340Var2.h(z) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= x340Var2.i(function5) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= x340Var2.i(function6) ? 2048 : 1024;
        }
        int i14 = i5 | 24576;
        if (x340Var2.Y(i13 & 1, ((i13 & 306783379) == 306783378 && (i14 & 9363) == 9362) ? false : true)) {
            Configuration configuration = (Configuration) x340Var2.k(AndroidCompositionLocals_androidKt.a);
            boolean z8 = configuration.orientation == 2 && configuration.screenHeightDp < 480;
            boolean z9 = configuration.screenWidthDp >= 600 && !z8;
            float f3 = z9 ? 480.0f : 380.0f;
            qim0 qim0Var4 = nim0.a;
            boolean z10 = z8;
            qim0 qim0VarD = u291.d(qim0Var4, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var2).a.c, d4o1.a);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarY = voo1.y(too1.j(qim0VarF, lhc.g(x340Var2).g), voo1.f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarY);
            hzj.A.getClass();
            if (j06Var2 == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            zma1 zma1Var = null;
            boolean z11 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z11) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar3 = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar3);
            vu30 vu30Var6 = y580.N0;
            nko1.H(xos0VarM3, x340Var2, vu30Var6);
            Integer numValueOf = Integer.valueOf(iHashCode3);
            llj lljVar4 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar4);
            nko1.F(x340Var2);
            vu30 vu30Var7 = y580.Y;
            nko1.H(qim0VarE3, x340Var2, vu30Var7);
            qim0 qim0VarD2 = u291.d(qim0Var4, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var2, 0);
            boolean z12 = z9;
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarD2);
            if (j06Var2 == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA3, x340Var2, lljVar3);
            nko1.H(xos0VarM4, x340Var2, vu30Var6);
            x0d.q(iHashCode4, x340Var2, lljVar4, x340Var2);
            nko1.H(qim0VarE4, x340Var2, vu30Var7);
            qim0 qim0VarH = u291.h(u291.f(qim0Var4, 1.0f), 56.0f);
            gfh0 gfh0VarC2 = t1c.c(een.g, false);
            int iHashCode5 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM5 = x340Var2.m();
            qim0 qim0VarE5 = zr7.E(x340Var2, qim0VarH);
            if (j06Var2 == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar3);
            nko1.H(xos0VarM5, x340Var2, vu30Var6);
            x0d.q(iHashCode5, x340Var2, lljVar4, x340Var2);
            nko1.H(qim0VarE5, x340Var2, vu30Var7);
            h2c h2cVar = h2c.a;
            if (str2 != null) {
                i8 = 14;
                x340Var2.i0(-136035292);
                j06Var = j06Var2;
                vu30Var = vu30Var7;
                m4cVar = m4cVar5;
                qim0Var3 = qim0Var4;
                tl3Var = tl3Var3;
                uvwVar = uvwVar3;
                i7 = i13;
                r7 = 0;
                uwo1.e(str2, h2cVar.a(qim0Var4, graVar), cbx.d(x340Var2).h, 0L, null, null, 0, false, null, 0, null, x340Var2, (i14 >> 3) & 14, 0, 2040);
                x340Var = x340Var2;
                x340Var.r(false);
                f = f3;
            } else {
                vu30Var = vu30Var7;
                x340Var = x340Var2;
                qim0Var3 = qim0Var4;
                m4cVar = m4cVar5;
                tl3Var = tl3Var3;
                uvwVar = uvwVar3;
                i7 = i13;
                j06Var = j06Var2;
                i8 = 14;
                if (z10) {
                    x340Var.i0(-135817672);
                    qim0 qim0VarA = h2cVar.a(uyn1.z(16.0f, 0.0f, 2, u291.f(qim0Var3, 1.0f)), graVar);
                    gfh0 gfh0VarC3 = t1c.c(graVar, false);
                    int iHashCode6 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM6 = x340Var.m();
                    qim0 qim0VarE6 = zr7.E(x340Var, qim0VarA);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var, lljVar3);
                    nko1.H(xos0VarM6, x340Var, vu30Var6);
                    x0d.q(iHashCode6, x340Var, lljVar4, x340Var);
                    nko1.H(qim0VarE6, x340Var, vu30Var);
                    f = f3;
                    uwo1.e(cwl1.o0(x340Var, 2131955439), u291.f(u291.x(0.0f, f, 1, qim0Var3), 1.0f), cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
                    x340Var.r(true);
                    r7 = 0;
                    x340Var.r(false);
                    h2cVar = h2cVar;
                } else {
                    f = f3;
                    x340Var.i0(-135320308);
                    w0h1.a(wsx.c, isl.a, h2cVar.a(u291.r(qim0Var3, 24.0f), graVar), cbx.a(x340Var).b.a, 0L, false, x340Var, wsx.d | 48, 48);
                    r7 = 0;
                    x340Var.r(false);
                }
            }
            x340Var.r(true);
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, l6o1.H(u291.d(qim0Var3, 1.0f), l6o1.C(r7, r7, 1, x340Var), r7, i8));
            era eraVar2 = een.Q0;
            mbh mbhVarA4 = jbh.a(f36Var, eraVar2, x340Var, (int) r7);
            int iHashCode7 = Long.hashCode(x340Var.T);
            xos0 xos0VarM7 = x340Var.m();
            qim0 qim0VarE7 = zr7.E(x340Var, qim0VarZ);
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA4, x340Var, lljVar3);
            nko1.H(xos0VarM7, x340Var, vu30Var6);
            llj lljVar5 = lljVar4;
            x0d.q(iHashCode7, x340Var, lljVar5, x340Var);
            nko1.H(qim0VarE7, x340Var, vu30Var);
            if (z10) {
                i9 = 0;
                x340Var.i0(146740765);
                x340Var.r(false);
            } else {
                v8i0.i(32.0f, 146680222, x340Var, x340Var, qim0Var3);
                i9 = 0;
                x340Var.r(false);
            }
            qim0 qim0VarX = u291.x(0.0f, f, 1, qim0Var3);
            mbh mbhVarA5 = jbh.a(f36Var, eraVar, x340Var, i9);
            int iHashCode8 = Long.hashCode(x340Var.T);
            xos0 xos0VarM8 = x340Var.m();
            qim0 qim0VarE8 = zr7.E(x340Var, qim0VarX);
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA5, x340Var, lljVar3);
            nko1.H(xos0VarM8, x340Var, vu30Var6);
            x0d.q(iHashCode8, x340Var, lljVar5, x340Var);
            nko1.H(qim0VarE8, x340Var, vu30Var);
            if (z10) {
                x340Var.i0(-1294336109);
                x340Var.r(false);
            } else {
                x340Var.i0(-1294679186);
                uwo1.e(cwl1.o0(x340Var, 2131955439), u291.f(qim0Var3, 1.0f), cbx.d(x340Var).d, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
                x0d.s(qim0Var3, 8.0f, x340Var, false);
            }
            long j = cbx.a(x340Var).b.b;
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            int i15 = i7;
            h2c h2cVar2 = h2cVar;
            boolean zF = ((i15 & 896) == 256) | x340Var.f(j);
            Object objT6 = x340Var.T();
            if (zF) {
                m4cVar2 = m4cVar;
            } else {
                m4cVar2 = m4cVar;
                if (objT6 != m4cVar2) {
                    vu30Var2 = vu30Var6;
                    vu30Var3 = vu30Var;
                    m4cVar3 = m4cVar2;
                    lljVar = lljVar5;
                    i10 = i15;
                    f2 = f;
                }
                uwo1.f((af5) objT6, u291.f(qim0Var3, 1.0f), cbx.d(x340Var).g, null, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4088);
                op71.g(x340Var, u291.h(qim0Var3, 28.0f));
                mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var3);
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar3);
                vu30Var4 = vu30Var2;
                nko1.H(xos0VarM, x340Var, vu30Var4);
                lljVar2 = lljVar;
                x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                vu30Var5 = vu30Var3;
                nko1.H(qim0VarE, x340Var, vu30Var5);
                uvwVar2 = uvwVar;
                i6 = i;
                irq0 irq0Var = new irq0(i6, !(uvwVar2 instanceof svw), z12);
                i11 = i10;
                if ((i11 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((3670016 & i11) == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z3 | z2;
                objT = x340Var.T();
                if (z4) {
                    m4cVar4 = m4cVar3;
                } else {
                    m4cVar4 = m4cVar3;
                    if (objT == m4cVar4) {
                        iu30Var3 = iu30Var;
                    }
                    ha71.e(irq0Var, (iu30) objT, iu30Var2, function0, function2, (qim0) null, x340Var, ((i11 >> 6) & 8064) | ((i11 >> 9) & 57344));
                    if (uvwVar2 instanceof qvw) {
                        num = 2131955440;
                    } else if (uvwVar2 instanceof rvw) {
                        num = 2131955442;
                    } else if (uvwVar2 instanceof pvw) {
                        num = 2131955438;
                    } else if (uvwVar2 instanceof ovw) {
                        num = 2131955435;
                    } else if (uvwVar2 instanceof tvw) {
                        num = 2131955446;
                    } else {
                        if (uvwVar2 instanceof svw) {
                            eg.o();
                            return;
                        }
                        num = null;
                    }
                    if (num != null) {
                        x340Var.i0(-279761233);
                        String strO0 = cwl1.o0(x340Var, num.intValue());
                        lee1 lee1Var = cbx.d(x340Var).j;
                        long j2 = cbx.a(x340Var).b.d;
                        qim0 qim0Var5 = qim0Var3;
                        qim0 qim0VarB = uyn1.B(qim0Var5, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        qim0Var2 = qim0Var5;
                        objT5 = x340Var.T();
                        if (objT5 == m4cVar4) {
                            objT5 = vrw.h;
                            x340Var.s0(objT5);
                        }
                        uwo1.e(strO0, s161.b(qim0VarB, false, (iu30) objT5), lee1Var, j2, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                        i12 = 0;
                        x340Var.r(false);
                    } else {
                        qim0Var2 = qim0Var3;
                        i12 = 0;
                        x340Var.i0(-279445591);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    x340Var.r(true);
                    op71.g(x340Var, u291.h(qim0Var2, 28.0f));
                    qim0 qim0VarX2 = u291.x(0.0f, f2, 1, qim0Var2);
                    mbhVarA2 = jbh.a(f36Var, eraVar2, x340Var, i12);
                    iHashCode2 = Long.hashCode(x340Var.T);
                    xos0VarM2 = x340Var.m();
                    qim0VarE2 = zr7.E(x340Var, qim0VarX2);
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA2, x340Var, lljVar3);
                    nko1.H(xos0VarM2, x340Var, vu30Var4);
                    x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE2, x340Var, vu30Var5);
                    if ((234881024 & i11) == 67108864) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objT2 = x340Var.T();
                    if (!z5 || objT2 == m4cVar4) {
                        function7 = function3;
                        objT2 = new z9t(function7, (byte) 28);
                        x340Var.s0(objT2);
                    } else {
                        function7 = function3;
                    }
                    z50Var = z50.c;
                    foo1.c(new gbx(z50Var, (Function0) objT2), new idx(4), null, null, null, null, null, null, null, null, ili.a, x340Var, 0, 48, 2044);
                    op71.g(x340Var, u291.h(qim0Var2, 16.0f));
                    if ((1879048192 & i11) == 536870912) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objT3 = x340Var.T();
                    if (!z6 || objT3 == m4cVar4) {
                        function8 = function4;
                        objT3 = new z9t(function8, (byte) 29);
                        x340Var.s0(objT3);
                    } else {
                        function8 = function4;
                    }
                    gbx gbxVar = new gbx(z50Var, (Function0) objT3);
                    ldxVar = ldx.c;
                    foo1.c(gbxVar, ldxVar, null, null, yla.s(x340Var), null, null, null, ili.b, null, ili.c, x340Var, 805306368, 48, 1500);
                    if (z) {
                        v8i0.i(8.0f, 897025348, x340Var, x340Var, qim0Var2);
                        if ((i14 & 896) == 256) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        objT4 = x340Var.T();
                        if (z7 || objT4 == m4cVar4) {
                            objT4 = new ivw(function5, (byte) 0);
                            x340Var.s0(objT4);
                        }
                        foo1.c(new gbx(z50Var, (Function0) objT4), ldxVar, null, null, yla.s(x340Var), null, null, null, null, null, ili.d, x340Var, 0, 48, 2012);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(897492394);
                        x340Var.r(false);
                    }
                    us71.m(x340Var, true, true, true);
                    vvwVar2 = vvwVar;
                    nvwVar = vvwVar2.d;
                    if (u890.j(nvwVar, mvw.a)) {
                        x340Var.i0(327919491);
                        f(9, 48, cwl1.o0(x340Var, 2131955444), x340Var, uyn1.x(h2cVar2.a(qim0Var2, tl3Var), 16.0f));
                        x340Var.r(false);
                    } else {
                        tl3Var2 = tl3Var;
                        if (u890.j(nvwVar, lvw.a)) {
                            x340Var.i0(328219137);
                            f(15, 48, cwl1.o0(x340Var, 2131955443), x340Var, uyn1.x(h2cVar2.a(qim0Var2, tl3Var2), 16.0f));
                            x340Var.r(false);
                        } else {
                            if (u890.j(nvwVar, kvw.a)) {
                                throw p3d1.k(x340Var, -1097803123, false);
                            }
                            x340Var.i0(328506383);
                            x340Var.r(false);
                        }
                    }
                    x340Var.r(true);
                }
                iu30Var3 = iu30Var;
                objT = new hvw(iu30Var3, function1, (byte) 0);
                x340Var.s0(objT);
                ha71.e(irq0Var, (iu30) objT, iu30Var2, function0, function2, (qim0) null, x340Var, ((i11 >> 6) & 8064) | ((i11 >> 9) & 57344));
                if (uvwVar2 instanceof qvw) {
                    num = 2131955440;
                } else if (uvwVar2 instanceof rvw) {
                    num = 2131955442;
                } else if (uvwVar2 instanceof pvw) {
                    num = 2131955438;
                } else if (uvwVar2 instanceof ovw) {
                    num = 2131955435;
                } else if (uvwVar2 instanceof tvw) {
                    num = 2131955446;
                } else {
                    if (uvwVar2 instanceof svw) {
                        eg.o();
                        return;
                    }
                    num = null;
                }
                if (num != null) {
                    x340Var.i0(-279761233);
                    String strO1 = cwl1.o0(x340Var, num.intValue());
                    lee1 lee1Var2 = cbx.d(x340Var).j;
                    long j3 = cbx.a(x340Var).b.d;
                    qim0 qim0Var6 = qim0Var3;
                    qim0 qim0VarB2 = uyn1.B(qim0Var6, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    qim0Var2 = qim0Var6;
                    objT5 = x340Var.T();
                    if (objT5 == m4cVar4) {
                        objT5 = vrw.h;
                        x340Var.s0(objT5);
                    }
                    uwo1.e(strO1, s161.b(qim0VarB2, false, (iu30) objT5), lee1Var2, j3, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                    i12 = 0;
                    x340Var.r(false);
                } else {
                    qim0Var2 = qim0Var3;
                    i12 = 0;
                    x340Var.i0(-279445591);
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(true);
                op71.g(x340Var, u291.h(qim0Var2, 28.0f));
                qim0 qim0VarX3 = u291.x(0.0f, f2, 1, qim0Var2);
                mbhVarA2 = jbh.a(f36Var, eraVar2, x340Var, i12);
                iHashCode2 = Long.hashCode(x340Var.T);
                xos0VarM2 = x340Var.m();
                qim0VarE2 = zr7.E(x340Var, qim0VarX3);
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar3);
                nko1.H(xos0VarM2, x340Var, vu30Var4);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var5);
                if ((234881024 & i11) == 67108864) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objT2 = x340Var.T();
                if (z5) {
                    function7 = function3;
                    objT2 = new z9t(function7, (byte) 28);
                    x340Var.s0(objT2);
                } else {
                    function7 = function3;
                    objT2 = new z9t(function7, (byte) 28);
                    x340Var.s0(objT2);
                }
                z50Var = z50.c;
                foo1.c(new gbx(z50Var, (Function0) objT2), new idx(4), null, null, null, null, null, null, null, null, ili.a, x340Var, 0, 48, 2044);
                op71.g(x340Var, u291.h(qim0Var2, 16.0f));
                if ((1879048192 & i11) == 536870912) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objT3 = x340Var.T();
                if (z6) {
                    function8 = function4;
                    objT3 = new z9t(function8, (byte) 29);
                    x340Var.s0(objT3);
                } else {
                    function8 = function4;
                    objT3 = new z9t(function8, (byte) 29);
                    x340Var.s0(objT3);
                }
                gbx gbxVar2 = new gbx(z50Var, (Function0) objT3);
                ldxVar = ldx.c;
                foo1.c(gbxVar2, ldxVar, null, null, yla.s(x340Var), null, null, null, ili.b, null, ili.c, x340Var, 805306368, 48, 1500);
                if (z) {
                    v8i0.i(8.0f, 897025348, x340Var, x340Var, qim0Var2);
                    if ((i14 & 896) == 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objT4 = x340Var.T();
                    if (z7) {
                        objT4 = new ivw(function5, (byte) 0);
                        x340Var.s0(objT4);
                    } else {
                        objT4 = new ivw(function5, (byte) 0);
                        x340Var.s0(objT4);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT4), ldxVar, null, null, yla.s(x340Var), null, null, null, null, null, ili.d, x340Var, 0, 48, 2012);
                    x340Var.r(false);
                } else {
                    x340Var.i0(897492394);
                    x340Var.r(false);
                }
                us71.m(x340Var, true, true, true);
                vvwVar2 = vvwVar;
                nvwVar = vvwVar2.d;
                if (u890.j(nvwVar, mvw.a)) {
                    x340Var.i0(327919491);
                    f(9, 48, cwl1.o0(x340Var, 2131955444), x340Var, uyn1.x(h2cVar2.a(qim0Var2, tl3Var), 16.0f));
                    x340Var.r(false);
                } else {
                    tl3Var2 = tl3Var;
                    if (u890.j(nvwVar, lvw.a)) {
                        x340Var.i0(328219137);
                        f(15, 48, cwl1.o0(x340Var, 2131955443), x340Var, uyn1.x(h2cVar2.a(qim0Var2, tl3Var2), 16.0f));
                        x340Var.r(false);
                    } else {
                        if (u890.j(nvwVar, kvw.a)) {
                            throw p3d1.k(x340Var, -1097803123, false);
                        }
                        x340Var.i0(328506383);
                        x340Var.r(false);
                    }
                }
                x340Var.r(true);
            }
            SpannedString spannedString = new SpannedString(context.getText(2131955436));
            String string = spannedString.toString();
            List listH0 = f46.H0(spannedString.getSpans(0, spannedString.length(), Annotation.class), new xvd((Object) spannedString, (byte) 13));
            ye5 ye5Var = new ye5();
            ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            Iterator it = listH0.iterator();
            int i16 = 0;
            while (it.hasNext()) {
                Iterator it2 = it;
                Annotation annotation = (Annotation) it.next();
                float f4 = f;
                int spanStart = spannedString.getSpanStart(annotation);
                m4c m4cVar6 = m4cVar2;
                int spanEnd = spannedString.getSpanEnd(annotation);
                if (i16 < spanStart) {
                    ye5Var.e(i16, spanStart, string);
                }
                SpannedString spannedString2 = spannedString;
                if (u890.j(annotation.getKey(), "type") && u890.j(annotation.getValue(), "email")) {
                    ye5Var.g(str);
                } else if (u890.j(annotation.getKey(), "type") && u890.j(annotation.getValue(), "open_email")) {
                    StringBuilder sb = ye5Var.a;
                    int length = sb.length();
                    ye5Var.e(spanStart, spanEnd, string);
                    ye5Var.a(new kjc0("open_email", new pae1(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439), zma1Var, 14), new nbg(function6, (byte) 2)), length, sb.length());
                } else {
                    ye5Var.e(spanStart, spanEnd, string);
                }
                i16 = spanEnd;
                spannedString = spannedString2;
                it = it2;
                i15 = i15;
                m4cVar2 = m4cVar6;
                vu30Var = vu30Var;
                f = f4;
                lljVar5 = lljVar5;
                vu30Var6 = vu30Var6;
                zma1Var = null;
            }
            vu30Var2 = vu30Var6;
            vu30Var3 = vu30Var;
            m4cVar3 = m4cVar2;
            lljVar = lljVar5;
            i10 = i15;
            f2 = f;
            if (i16 < string.length()) {
                ye5Var.e(i16, string.length(), string);
            }
            ye5Var.j();
            objT6 = ye5Var.p();
            x340Var.s0(objT6);
            uwo1.f((af5) objT6, u291.f(qim0Var3, 1.0f), cbx.d(x340Var).g, null, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4088);
            op71.g(x340Var, u291.h(qim0Var3, 28.0f));
            mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var3);
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar3);
            vu30Var4 = vu30Var2;
            nko1.H(xos0VarM, x340Var, vu30Var4);
            lljVar2 = lljVar;
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            vu30Var5 = vu30Var3;
            nko1.H(qim0VarE, x340Var, vu30Var5);
            uvwVar2 = uvwVar;
            i6 = i;
            irq0 irq0Var2 = new irq0(i6, !(uvwVar2 instanceof svw), z12);
            i11 = i10;
            if ((i11 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((3670016 & i11) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z3 | z2;
            objT = x340Var.T();
            if (z4) {
                m4cVar4 = m4cVar3;
                if (objT == m4cVar4) {
                    iu30Var3 = iu30Var;
                }
                ha71.e(irq0Var2, (iu30) objT, iu30Var2, function0, function2, (qim0) null, x340Var, ((i11 >> 6) & 8064) | ((i11 >> 9) & 57344));
                if (uvwVar2 instanceof qvw) {
                    num = 2131955440;
                } else if (uvwVar2 instanceof rvw) {
                    num = 2131955442;
                } else if (uvwVar2 instanceof pvw) {
                    num = 2131955438;
                } else if (uvwVar2 instanceof ovw) {
                    num = 2131955435;
                } else if (uvwVar2 instanceof tvw) {
                    num = 2131955446;
                } else {
                    if (uvwVar2 instanceof svw) {
                        eg.o();
                        return;
                    }
                    num = null;
                }
                if (num != null) {
                    x340Var.i0(-279761233);
                    String strO2 = cwl1.o0(x340Var, num.intValue());
                    lee1 lee1Var3 = cbx.d(x340Var).j;
                    long j4 = cbx.a(x340Var).b.d;
                    qim0 qim0Var7 = qim0Var3;
                    qim0 qim0VarB3 = uyn1.B(qim0Var7, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    qim0Var2 = qim0Var7;
                    objT5 = x340Var.T();
                    if (objT5 == m4cVar4) {
                        objT5 = vrw.h;
                        x340Var.s0(objT5);
                    }
                    uwo1.e(strO2, s161.b(qim0VarB3, false, (iu30) objT5), lee1Var3, j4, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                    i12 = 0;
                    x340Var.r(false);
                } else {
                    qim0Var2 = qim0Var3;
                    i12 = 0;
                    x340Var.i0(-279445591);
                    x340Var.r(false);
                }
                x340Var.r(true);
                x340Var.r(true);
                op71.g(x340Var, u291.h(qim0Var2, 28.0f));
                qim0 qim0VarX4 = u291.x(0.0f, f2, 1, qim0Var2);
                mbhVarA2 = jbh.a(f36Var, eraVar2, x340Var, i12);
                iHashCode2 = Long.hashCode(x340Var.T);
                xos0VarM2 = x340Var.m();
                qim0VarE2 = zr7.E(x340Var, qim0VarX4);
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar3);
                nko1.H(xos0VarM2, x340Var, vu30Var4);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var5);
                if ((234881024 & i11) == 67108864) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objT2 = x340Var.T();
                if (z5) {
                    function7 = function3;
                    objT2 = new z9t(function7, (byte) 28);
                    x340Var.s0(objT2);
                } else {
                    function7 = function3;
                    objT2 = new z9t(function7, (byte) 28);
                    x340Var.s0(objT2);
                }
                z50Var = z50.c;
                foo1.c(new gbx(z50Var, (Function0) objT2), new idx(4), null, null, null, null, null, null, null, null, ili.a, x340Var, 0, 48, 2044);
                op71.g(x340Var, u291.h(qim0Var2, 16.0f));
                if ((1879048192 & i11) == 536870912) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objT3 = x340Var.T();
                if (z6) {
                    function8 = function4;
                    objT3 = new z9t(function8, (byte) 29);
                    x340Var.s0(objT3);
                } else {
                    function8 = function4;
                    objT3 = new z9t(function8, (byte) 29);
                    x340Var.s0(objT3);
                }
                gbx gbxVar3 = new gbx(z50Var, (Function0) objT3);
                ldxVar = ldx.c;
                foo1.c(gbxVar3, ldxVar, null, null, yla.s(x340Var), null, null, null, ili.b, null, ili.c, x340Var, 805306368, 48, 1500);
                if (z) {
                    v8i0.i(8.0f, 897025348, x340Var, x340Var, qim0Var2);
                    if ((i14 & 896) == 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objT4 = x340Var.T();
                    if (z7) {
                        objT4 = new ivw(function5, (byte) 0);
                        x340Var.s0(objT4);
                    } else {
                        objT4 = new ivw(function5, (byte) 0);
                        x340Var.s0(objT4);
                    }
                    foo1.c(new gbx(z50Var, (Function0) objT4), ldxVar, null, null, yla.s(x340Var), null, null, null, null, null, ili.d, x340Var, 0, 48, 2012);
                    x340Var.r(false);
                } else {
                    x340Var.i0(897492394);
                    x340Var.r(false);
                }
                us71.m(x340Var, true, true, true);
                vvwVar2 = vvwVar;
                nvwVar = vvwVar2.d;
                if (u890.j(nvwVar, mvw.a)) {
                    x340Var.i0(327919491);
                    f(9, 48, cwl1.o0(x340Var, 2131955444), x340Var, uyn1.x(h2cVar2.a(qim0Var2, tl3Var), 16.0f));
                    x340Var.r(false);
                } else {
                    tl3Var2 = tl3Var;
                    if (u890.j(nvwVar, lvw.a)) {
                        x340Var.i0(328219137);
                        f(15, 48, cwl1.o0(x340Var, 2131955443), x340Var, uyn1.x(h2cVar2.a(qim0Var2, tl3Var2), 16.0f));
                        x340Var.r(false);
                    } else {
                        if (u890.j(nvwVar, kvw.a)) {
                            throw p3d1.k(x340Var, -1097803123, false);
                        }
                        x340Var.i0(328506383);
                        x340Var.r(false);
                    }
                }
                x340Var.r(true);
            } else {
                m4cVar4 = m4cVar3;
            }
            iu30Var3 = iu30Var;
            objT = new hvw(iu30Var3, function1, (byte) 0);
            x340Var.s0(objT);
            ha71.e(irq0Var2, (iu30) objT, iu30Var2, function0, function2, (qim0) null, x340Var, ((i11 >> 6) & 8064) | ((i11 >> 9) & 57344));
            if (uvwVar2 instanceof qvw) {
                num = 2131955440;
            } else if (uvwVar2 instanceof rvw) {
                num = 2131955442;
            } else if (uvwVar2 instanceof pvw) {
                num = 2131955438;
            } else if (uvwVar2 instanceof ovw) {
                num = 2131955435;
            } else if (uvwVar2 instanceof tvw) {
                num = 2131955446;
            } else {
                if (uvwVar2 instanceof svw) {
                    eg.o();
                    return;
                }
                num = null;
            }
            if (num != null) {
                x340Var.i0(-279761233);
                String strO3 = cwl1.o0(x340Var, num.intValue());
                lee1 lee1Var4 = cbx.d(x340Var).j;
                long j5 = cbx.a(x340Var).b.d;
                qim0 qim0Var8 = qim0Var3;
                qim0 qim0VarB4 = uyn1.B(qim0Var8, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                qim0Var2 = qim0Var8;
                objT5 = x340Var.T();
                if (objT5 == m4cVar4) {
                    objT5 = vrw.h;
                    x340Var.s0(objT5);
                }
                uwo1.e(strO3, s161.b(qim0VarB4, false, (iu30) objT5), lee1Var4, j5, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                i12 = 0;
                x340Var.r(false);
            } else {
                qim0Var2 = qim0Var3;
                i12 = 0;
                x340Var.i0(-279445591);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
            op71.g(x340Var, u291.h(qim0Var2, 28.0f));
            qim0 qim0VarX5 = u291.x(0.0f, f2, 1, qim0Var2);
            mbhVarA2 = jbh.a(f36Var, eraVar2, x340Var, i12);
            iHashCode2 = Long.hashCode(x340Var.T);
            xos0VarM2 = x340Var.m();
            qim0VarE2 = zr7.E(x340Var, qim0VarX5);
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar3);
            nko1.H(xos0VarM2, x340Var, vu30Var4);
            x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE2, x340Var, vu30Var5);
            if ((234881024 & i11) == 67108864) {
                z5 = true;
            } else {
                z5 = false;
            }
            objT2 = x340Var.T();
            if (z5) {
                function7 = function3;
                objT2 = new z9t(function7, (byte) 28);
                x340Var.s0(objT2);
            } else {
                function7 = function3;
                objT2 = new z9t(function7, (byte) 28);
                x340Var.s0(objT2);
            }
            z50Var = z50.c;
            foo1.c(new gbx(z50Var, (Function0) objT2), new idx(4), null, null, null, null, null, null, null, null, ili.a, x340Var, 0, 48, 2044);
            op71.g(x340Var, u291.h(qim0Var2, 16.0f));
            if ((1879048192 & i11) == 536870912) {
                z6 = true;
            } else {
                z6 = false;
            }
            objT3 = x340Var.T();
            if (z6) {
                function8 = function4;
                objT3 = new z9t(function8, (byte) 29);
                x340Var.s0(objT3);
            } else {
                function8 = function4;
                objT3 = new z9t(function8, (byte) 29);
                x340Var.s0(objT3);
            }
            gbx gbxVar4 = new gbx(z50Var, (Function0) objT3);
            ldxVar = ldx.c;
            foo1.c(gbxVar4, ldxVar, null, null, yla.s(x340Var), null, null, null, ili.b, null, ili.c, x340Var, 805306368, 48, 1500);
            if (z) {
                v8i0.i(8.0f, 897025348, x340Var, x340Var, qim0Var2);
                if ((i14 & 896) == 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objT4 = x340Var.T();
                if (z7) {
                    objT4 = new ivw(function5, (byte) 0);
                    x340Var.s0(objT4);
                } else {
                    objT4 = new ivw(function5, (byte) 0);
                    x340Var.s0(objT4);
                }
                foo1.c(new gbx(z50Var, (Function0) objT4), ldxVar, null, null, yla.s(x340Var), null, null, null, null, null, ili.d, x340Var, 0, 48, 2012);
                x340Var.r(false);
            } else {
                x340Var.i0(897492394);
                x340Var.r(false);
            }
            us71.m(x340Var, true, true, true);
            vvwVar2 = vvwVar;
            nvwVar = vvwVar2.d;
            if (u890.j(nvwVar, mvw.a)) {
                x340Var.i0(327919491);
                f(9, 48, cwl1.o0(x340Var, 2131955444), x340Var, uyn1.x(h2cVar2.a(qim0Var2, tl3Var), 16.0f));
                x340Var.r(false);
            } else {
                tl3Var2 = tl3Var;
                if (u890.j(nvwVar, lvw.a)) {
                    x340Var.i0(328219137);
                    f(15, 48, cwl1.o0(x340Var, 2131955443), x340Var, uyn1.x(h2cVar2.a(qim0Var2, tl3Var2), 16.0f));
                    x340Var.r(false);
                } else {
                    if (u890.j(nvwVar, kvw.a)) {
                        throw p3d1.k(x340Var, -1097803123, false);
                    }
                    x340Var.i0(328506383);
                    x340Var.r(false);
                }
            }
            x340Var.r(true);
        } else {
            iu30Var3 = iu30Var;
            x340Var = x340Var2;
            i6 = i;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jvw(vvwVar2, i6, str, iu30Var3, iu30Var2, function0, function1, function2, function7, function8, z, str2, function5, function6, qim0Var2, i2, i3);
        }
    }

    public static final void e(xfx xfxVar, s191 s191Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2141752700);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xfxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(s191Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zI = x340Var.i(xfxVar) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new umr0(xfxVar, iu30Var, (byte) 6);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean zI2 = x340Var.i(s191Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new wvq0(s191Var, (byte) 20);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var2, qim0Var, (iu30) objT2, x340Var, (i2 >> 3) & 112, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(xfxVar, s191Var, qim0Var, iu30Var, i, (byte) 25);
        }
    }

    public static final void f(int i, int i2, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1649910652);
        int i3 = (x340Var.g(str) ? 4 : 2) | i2 | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            gfx.b(i, apo.r(-1492831687, new rj(qim0Var, str, (byte) 24), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0((byte) 7, i, i2, str, qim0Var);
        }
    }

    public static final void g(int i, max maxVar, max maxVar2, String str, String str2, String str3, String str4, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1844407640);
        int i3 = i2 | (x340Var2.e(i) ? 4 : 2) | (x340Var2.i(maxVar) ? 32 : 16) | (x340Var2.i(maxVar2) ? 256 : 128) | (x340Var2.g(str) ? 2048 : 1024) | (x340Var2.g(str2) ? 16384 : 8192) | (x340Var2.g(str3) ? 131072 : 65536) | (x340Var2.g(str4) ? 1048576 : 524288) | (x340Var2.i(qim0Var) ? 67108864 : 33554432);
        if (x340Var2.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            qim0 qim0VarB = u291.b(120.0f, 0.0f, 2, qim0Var);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            gdx gdxVarS = yla.s(x340Var2);
            jdx jdxVar = jdx.c;
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = new nfk0(iu30Var, (byte) 26);
                x340Var2.s0(objT);
            }
            wro1.h(u(str2, (Function0) objT), jdxVar, null, maxVar, gdxVarS, null, false, null, null, apo.r(927696653, new tej0(str, (byte) 14), x340Var2), x340Var2, (i3 << 9) & 57344, 6, 972);
            uwo1.e(String.valueOf(i), null, null, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2046);
            gdx gdxVarS2 = yla.s(x340Var2);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = new nfk0(iu30Var, (byte) 27);
                x340Var2.s0(objT2);
            }
            wro1.h(u(str4, (Function0) objT2), jdxVar, null, maxVar2, gdxVarS2, null, false, null, null, apo.r(-1565129418, new tej0(str3, (byte) 15), x340Var2), x340Var2, (i3 << 6) & 57344, 6, 972);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f1c(i, maxVar, maxVar2, str, str2, str3, str4, iu30Var, qim0Var, i2);
        }
    }

    public static final void h(Throwable th) {
        HashMap map;
        kn10 kn10Var;
        if (b) {
            HashSet hashSet = new HashSet();
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                String className = stackTraceElement.getClassName();
                synchronized (mn10.a) {
                    map = mn10.b;
                    if (map.isEmpty()) {
                        map.put(kn10.h, new String[]{"com.facebook.appevents.aam."});
                        map.put(kn10.e, new String[]{"com.facebook.appevents.codeless."});
                        map.put(kn10.f, new String[]{"com.facebook.appevents.cloudbridge."});
                        map.put(kn10.g1, new String[]{"com.facebook.internal.instrument.errorreport."});
                        map.put(kn10.h1, new String[]{"com.facebook.internal.instrument.anrreport."});
                        map.put(kn10.i, new String[]{"com.facebook.appevents.ml."});
                        map.put(kn10.t, new String[]{"com.facebook.appevents.suggestedevents."});
                        map.put(kn10.g, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        map.put(kn10.X, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        map.put(kn10.Z, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                        map.put(kn10.N0, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                        map.put(kn10.O0, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
                        map.put(kn10.P0, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
                        map.put(kn10.Q0, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
                        map.put(kn10.T0, new String[]{"com.facebook.appevents.eventdeactivation."});
                        map.put(kn10.U0, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        map.put(kn10.W0, new String[]{"com.facebook.appevents.iap."});
                        map.put(kn10.i1, new String[]{"com.facebook.internal.logging.monitor"});
                        map.put(kn10.k1, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
                        map.put(kn10.l1, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
                        map.put(kn10.m1, new String[]{"com.facebook.appevents.gps.topics.GpsTopicsManager"});
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        kn10Var = kn10.b;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    kn10Var = (kn10) entry.getKey();
                    for (String str : (String[]) entry.getValue()) {
                        if (nhc1.Y(className, str, false)) {
                            break;
                        }
                    }
                }
                if (kn10Var != kn10.b) {
                    wf10.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString("FBSDKFeature" + kn10Var, "18.2.3").apply();
                    hashSet.add(kn10Var.toString());
                }
            }
            wf10 wf10Var = wf10.a;
            if (!wgi1.c() || hashSet.isEmpty()) {
                return;
            }
            JSONArray jSONArray = new JSONArray((Collection) hashSet);
            ep80 ep80Var = new ep80();
            ep80Var.b = cp80.b;
            Long lValueOf = Long.valueOf(System.currentTimeMillis() / 1000);
            ep80Var.g = lValueOf;
            ep80Var.c = jSONArray;
            StringBuffer stringBuffer = new StringBuffer("analysis_log_");
            stringBuffer.append(String.valueOf(lValueOf));
            stringBuffer.append(".json");
            ep80Var.a = stringBuffer.toString();
            ep80Var.b();
        }
    }

    public static ColorStateList i(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListE;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListE = x74.E(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListE;
    }

    public static ColorStateList j(Context context, lvc1 lvc1Var, int i) {
        int resourceId;
        ColorStateList colorStateListE;
        TypedArray typedArray = (TypedArray) lvc1Var.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListE = x74.E(context, resourceId)) == null) ? lvc1Var.g(i) : colorStateListE;
    }

    public static int k(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable l(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableJ;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableJ = f0o1.j(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableJ;
    }

    public static int m(TypedArray typedArray) {
        return typedArray.hasValue(12) ? 12 : 10;
    }

    public static boolean n(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final boolean o(String str) {
        return TextUtils.getLayoutDirectionFromLocale(new Locale(str)) == 1;
    }

    public static final qim0 p(qim0 qim0Var, boolean z, idn0 idn0Var, ga80 ga80Var, boolean z2, pm31 pm31Var, Function0 function0) {
        iv51 iv51VarThen;
        if (ga80Var != null) {
            iv51VarThen = new iv51(z, idn0Var, ga80Var, false, z2, pm31Var, function0);
        } else if (ga80Var == null) {
            iv51VarThen = new iv51(z, idn0Var, (ga80) null, false, z2, pm31Var, function0);
        } else {
            nim0 nim0Var = nim0.a;
            iv51VarThen = idn0Var != null ? da80.a(nim0Var, idn0Var, ga80Var).then(new iv51(z, idn0Var, (ga80) null, false, z2, pm31Var, function0)) : zr7.i(nim0Var, new qv51(ga80Var, z, z2, pm31Var, function0, (byte) 0));
        }
        return qim0Var.then(iv51VarThen);
    }

    public static qim0 q(qim0 qim0Var, boolean z, boolean z2, pm31 pm31Var, Function0 function0, int i) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return qim0Var.then(new iv51(z, (idn0) null, (ga80) null, true, z2, pm31Var, function0));
    }

    public static final void r(ViewGroup viewGroup, boolean z) {
        viewGroup.setVisibility(!z ? 4 : 0);
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                tw20.p();
                return;
            } else {
                childAt.setVisibility(!z ? 4 : 0);
                i = i2;
            }
        }
    }

    public static final qim0 s(ew50 ew50Var) {
        qim0 qim0VarF = nim0.a;
        if (ew50Var == null) {
            return qim0VarF;
        }
        Integer num = ew50Var.a;
        if (num != null) {
            qim0VarF = dug.f(qim0VarF, z4p1.e(num.intValue()), er31.a);
        }
        Integer num2 = ew50Var.b;
        return num2 != null ? d1u.E(1.0f, z4p1.e(num2.intValue()), qim0VarF, er31.a) : qim0VarF;
    }

    public static final long t(RgbaColor rgbaColor) {
        return z4p1.f(rgbaColor.s(), rgbaColor.r(), rgbaColor.p(), rgbaColor.o());
    }

    public static final gbx u(String str, Function0 function0) {
        if (ihc1.y0(str)) {
            return new gbx(z50.c, function0);
        }
        if (!ihc1.y0(str)) {
            return new gbx(new y50(str), function0);
        }
        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
        return null;
    }

    public static final afx v(ColorSet colorSet) {
        int i = ihx.f;
        return ihx.d(colorSet.u() ? t(colorSet.o()) : u7h.d, colorSet.v() ? t(colorSet.p()) : u7h.d, colorSet.w() ? t(colorSet.r()) : u7h.d, colorSet.y() ? t(colorSet.t()) : u7h.d, colorSet.x() ? t(colorSet.s()) : u7h.d);
    }

    public static final u310 w(bi51 bi51Var, bm00 bm00Var, aai0 aai0Var, String str) {
        zp70 zp70Var = bi51Var.a;
        String str2 = bi51Var.e;
        if (str2 == null) {
            str2 = bi51Var.b.a;
        }
        String str3 = str2;
        Set set = s4b1.f;
        int iN = bm00Var.n((m210) null, uic.x(str3).c);
        String str4 = bi51Var.c;
        String str5 = bi51Var.d;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = str5;
        String str7 = zp70Var.a;
        String str8 = zp70Var.a;
        return new u310(str3, str3, str4, str6, Uri.parse(str7), (Uri) null, aai0Var.e(Uri.parse(str8), iN, 3), aai0Var.e(Uri.parse(str8), iN, 2), aai0Var.e(Uri.parse(str8), iN, 1), Uri.parse(str3), Uri.parse(uic.x(str3).y()), 1, false, false, false, false, iN, 0, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, str, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -134287328, 15);
    }

    public static boolean x(cm61 cm61Var, Collection collection) {
        collection.getClass();
        if (collection instanceof stn1) {
            collection = ((stn1) collection).zza();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= cm61Var.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= cm61Var.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = cm61Var.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }
}
