package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.webkit.WebView;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class c680 {
    public static final yht a = new yht();
    public static b180 b;
    public static b180 c;

    public static final Method A(Class cls, String str, Class... clsArr) {
        if (!dhn.a.contains(c680.class)) {
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th) {
                dhn.a(c680.class, th);
            }
        }
        return null;
    }

    public static final Object B(Class cls, Object obj, Method method, Object... objArr) {
        if (!dhn.a.contains(c680.class)) {
            if (obj != null) {
                try {
                    obj = cls.cast(obj);
                } catch (Throwable th) {
                    dhn.a(c680.class, th);
                }
            }
            try {
                return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return null;
    }

    public static final hy00 C(iu30 iu30Var, zu30 zu30Var, zu30 zu30Var2) {
        return new hy00(new hy00("ItemListItemLeafInstrumentation", new gk90(iu30Var, zu30Var2), zu30Var), zu30Var2, (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    public static final hfh0 D(ht31 ht31Var, int i, int i2, int i3, int i4, int i5, ifh0 ifh0Var, List list, q5t0[] q5t0VarArr, int i6, int i7, int[] iArr, int i8) {
        ht31 ht31Var2;
        int i9;
        int i10;
        int i11;
        long j;
        ht31 ht31Var3;
        cv20 cv20Var;
        int iMax;
        int iMax2;
        ht31 ht31Var4;
        int i12;
        cv20 cv20Var2;
        long j2 = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z = false;
        int i18 = 0;
        float f = 0.0f;
        while (true) {
            Integer numValueOf = null;
            if (i14 >= i7) {
                break;
            }
            afh0 afh0Var = (afh0) list.get(i14);
            it31 it31VarT = x760.t(afh0Var);
            float fV = x760.v(it31VarT);
            if (z) {
                z = true;
            } else {
                buo1 buo1Var = it31VarT != null ? it31VarT.c : null;
                if (buo1Var != null ? buo1Var instanceof l8o : false) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (fV > 0.0f) {
                f += fV;
                i17++;
                i14 = i14;
                i12 = i16;
                j2 = j2;
            } else {
                if (i4 != Integer.MAX_VALUE && it31VarT != null && (cv20Var2 = it31VarT.d) != null) {
                    numValueOf = Integer.valueOf(Math.round(cv20Var2.a * i4));
                }
                int i19 = i3 - i18;
                q5t0 q5t0VarH = q5t0VarArr[i14];
                if (q5t0VarH == null) {
                    ht31Var4 = ht31Var;
                    q5t0VarH = afh0Var.H(ht31Var.d(false, 0, numValueOf != null ? numValueOf.intValue() : 0, i3 != Integer.MAX_VALUE ? i19 < 0 ? 0 : i19 : Integer.MAX_VALUE, numValueOf != null ? numValueOf.intValue() : i4));
                } else {
                    ht31Var4 = ht31Var;
                }
                int iE = ht31Var4.e(q5t0VarH);
                int iA = ht31Var4.a(q5t0VarH);
                iArr2[i14 - i6] = iE;
                int i20 = i19 - iE;
                if (i20 < 0) {
                    i20 = 0;
                }
                int iMin = Math.min(i5, i20);
                int iMax3 = Math.max(i16, iA);
                q5t0VarArr[i14] = q5t0VarH;
                i18 = iE + iMin + i18;
                i12 = iMax3;
                i15 = iMin;
            }
            i14++;
            i16 = i12;
            j2 = j2;
        }
        long j3 = j2;
        int i21 = i16;
        ht31 ht31Var5 = ht31Var;
        if (i17 == 0) {
            i18 -= i15;
            ht31Var2 = ht31Var5;
            i11 = i21;
            i10 = 0;
            i9 = 0;
        } else {
            long j4 = j3 * ((long) (i17 - 1));
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i18)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f2 = jRound / f;
            for (int i22 = i6; i22 < i7; i22++) {
                jRound -= (long) Math.round(x760.v(x760.t((afh0) list.get(i22))) * f2);
            }
            int i23 = i6;
            int iMax4 = i21;
            int i24 = 0;
            while (i23 < i7) {
                if (q5t0VarArr[i23] == null) {
                    afh0 afh0Var2 = (afh0) list.get(i23);
                    it31 it31VarT2 = x760.t(afh0Var2);
                    float fV2 = x760.v(it31VarT2);
                    long j5 = jRound;
                    Integer numValueOf2 = (i4 == Integer.MAX_VALUE || it31VarT2 == null || (cv20Var = it31VarT2.d) == null) ? null : Integer.valueOf(Math.round(cv20Var.a * i4));
                    if (fV2 <= 0.0f) {
                        of80.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(j5);
                    int i25 = iMax4;
                    j = j5 - ((long) iSignum);
                    int iMax5 = Math.max(0, Math.round(fV2 * f2) + iSignum);
                    if (!(it31VarT2 != null ? it31VarT2.b : true) || iMax5 == Integer.MAX_VALUE) {
                        iMax5 = 0;
                    }
                    int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
                    int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : i4;
                    ht31Var3 = ht31Var;
                    q5t0 q5t0VarH2 = afh0Var2.H(ht31Var3.d(true, iMax5, iIntValue, iMax5, iIntValue2));
                    int iE2 = ht31Var3.e(q5t0VarH2);
                    int iA2 = ht31Var3.a(q5t0VarH2);
                    iArr2[i23 - i6] = iE2;
                    i24 += iE2;
                    iMax4 = Math.max(i25, iA2);
                    q5t0VarArr[i23] = q5t0VarH2;
                } else {
                    j = jRound;
                    ht31Var3 = ht31Var5;
                    i23 = i23;
                }
                i23++;
                ht31Var5 = ht31Var3;
                jRound = j;
            }
            int i26 = iMax4;
            ht31Var2 = ht31Var5;
            i9 = 0;
            int i27 = (int) (((long) i24) + j4);
            int i28 = i3 - i18;
            if (i27 < 0) {
                i27 = 0;
            }
            if (i27 > i28) {
                i27 = i28;
            }
            i10 = i27;
            i11 = i26;
        }
        if (z) {
            iMax = i9;
            iMax2 = iMax;
            for (int i29 = i6; i29 < i7; i29++) {
                q5t0 q5t0Var = q5t0VarArr[i29];
                q5t0Var.getClass();
                it31 it31VarU = x760.u(q5t0Var);
                buo1 buo1Var2 = it31VarU != null ? it31VarU.c : null;
                Integer numS = buo1Var2 != null ? buo1Var2.s(q5t0Var) : null;
                if (numS != null) {
                    int iIntValue3 = numS.intValue();
                    int iA3 = ht31Var2.a(q5t0Var);
                    iMax = Math.max(iMax, iIntValue3 != Integer.MIN_VALUE ? numS.intValue() : i9);
                    if (iIntValue3 == Integer.MIN_VALUE) {
                        iIntValue3 = iA3;
                    }
                    iMax2 = Math.max(iMax2, iA3 - iIntValue3);
                }
            }
        } else {
            iMax = i9;
            iMax2 = iMax;
        }
        int i30 = i18 + i10;
        if (i30 < 0) {
            i30 = i9;
        }
        int iMax6 = Math.max(i30, i);
        int iMax7 = Math.max(i11, Math.max(i2, iMax2 + iMax));
        int[] iArr3 = new int[i13];
        ht31Var2.b(iMax6, iArr2, iArr3, ifh0Var);
        return ht31Var2.c(q5t0VarArr, ifh0Var, iMax, iArr3, iMax6, iMax7, iArr, i8, i6, i7);
    }

    public static final boolean F(int i, x340 x340Var) {
        float f = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
        wat watVar = (wat) x340Var.k(t4k.h);
        yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
        String strO0 = cwl1.o0(x340Var, 2131962691);
        uwr uwrVar = cbx.a;
        float fM0 = watVar.M0((int) (yae1.a(yae1VarQ, strO0, cbx.d(x340Var).n, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32));
        cvx cvxVar = cbx.b(x340Var).b;
        float f2 = cyo1.x(x340Var, 2131233938).b;
        cvx cvxVar2 = cbx.b(x340Var).b;
        float f3 = f2 + 2.0f + 8.0f + fM0;
        mta mtaVar = cbx.b(x340Var).d;
        float fMax = 48.0f * Math.max(1, i);
        cvx cvxVar3 = cbx.b(x340Var).b;
        return p3v.b((f - 8.0f) - (fMax * 2.0f), f3 + cbx.b(x340Var).b.a) >= 0;
    }

    public static zy70 G(zy70 zy70Var, dmm0 dmm0Var) {
        String string;
        Object obj = zy70Var.b;
        if (obj instanceof String) {
            string = (String) obj;
        } else {
            string = obj instanceof Uri ? ((Uri) obj).toString() : null;
        }
        bmm0 bmm0VarA = dmm0Var.a(string);
        if (bmm0VarA == null) {
            return zy70Var;
        }
        boolean z = bmm0VarA.d;
        Context context = zy70Var.a;
        if (z) {
            vy70 vy70Var = new vy70(zy70Var, context);
            vy70Var.p = 2;
            return vy70Var.a();
        }
        vy70 vy70Var2 = new vy70(zy70Var, context);
        vy70Var2.c = o7h.q0(bmm0VarA.b);
        return vy70Var2.a();
    }

    public static final void a(ee3 ee3Var, iu30 iu30Var, qim0 qim0Var, yqg yqgVar, idn0 idn0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        yqg yqgVar2;
        idn0 idn0Var2;
        int i3;
        yqg yqgVar3;
        qim0 qim0Var3;
        idn0 idn0Var3;
        long jE;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(786092134);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ee3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                yqg h94Var = new h94();
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                i3 = i4 & (-64513);
                yqgVar3 = h94Var;
                qim0Var3 = nim0.a;
                idn0Var3 = (idn0) objT;
            } else {
                x340Var.b0();
                int i5 = i4 & (-64513);
                yqgVar3 = yqgVar;
                idn0Var3 = idn0Var;
                i3 = i5;
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            ven0 ven0VarM = k1u.m(idn0Var3, x340Var, 0);
            tob1 tob1VarB = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.97f : 1.0f, (fe5) null, "scale", (iu30) null, x340Var, 3072, 22);
            tob1 tob1VarB2 = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.8f : 1.0f, (fe5) null, "alpha", (iu30) null, x340Var, 3072, 22);
            long j = ee3Var.c * 1000;
            boolean zF = x340Var.f(j) | x340Var.g(yqgVar3);
            Object objT2 = x340Var.T();
            if (zF || objT2 == m4cVar) {
                long jB = j - yqgVar3.b();
                if (jB < 0) {
                    jB = 0;
                }
                objT2 = v8r.q(Long.valueOf(jB));
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean z = ((Number) ven0Var.getValue()).longValue() <= 0;
            String strConcat = ee3Var.d;
            try {
                if (!nhc1.Y(strConcat, "#", false)) {
                    strConcat = "#".concat(strConcat);
                }
                jE = z4p1.e(Color.parseColor(strConcat));
            } catch (IllegalArgumentException unused) {
                jE = u7h.i;
            }
            Float fValueOf = Float.valueOf(0.0f);
            long j2 = u7h.b;
            idn0 idn0Var4 = idn0Var3;
            boolean z2 = z;
            mic0 mic0VarT = v9c.t(new mmr0[]{new mmr0(fValueOf, new u7h(u7h.b(j2, 0.42000002f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.29f), new u7h(u7h.b(j2, 0.48000002f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(j2, 0.6f, 0.0f, 0.0f, 0.0f, 14)))}, 0.0f, 0.0f, 14);
            qim0 qim0VarV = u291.v(qim0Var3, 343.0f);
            float fFloatValue = ((Number) tob1VarB.getValue()).floatValue();
            qim0 qim0VarN = anm1.N("album_release_card", d9y0.k(fj30.F(qim0VarV, fFloatValue, fFloatValue), ((Number) tob1VarB2.getValue()).floatValue()));
            String str = ee3Var.a;
            boolean z3 = (i3 & 112) == 32;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new k52(iu30Var, (byte) 29);
                x340Var.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(str), function0);
            long j3 = jE;
            mgx mgxVar = mgx.e;
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var4 = qim0Var3;
            yqg yqgVar4 = yqgVar3;
            cwl1.b(qim0VarN, (tl3) null, er31.b(8.0f), mgxVar, zzq0Var, (max) null, false, idn0Var4, (ga80) null, gbxVar, (gbx) null, apo.r(-532310641, new fe3(j3, mic0VarT, ee3Var, z2, iu30Var, ven0Var, yqgVar4), x340Var), x340Var, 0, 48, 1378);
            x340Var = x340Var;
            yqgVar2 = yqgVar4;
            idn0Var2 = idn0Var4;
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            yqgVar2 = yqgVar;
            idn0Var2 = idn0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0(ee3Var, iu30Var, qim0Var2, yqgVar2, idn0Var2, i, (byte) 7);
        }
    }

    public static final void b(c380 c380Var, int i, boolean z, boolean z2, boolean z3, nf40 nf40Var, String str, l6q l6qVar, d0r d0rVar, qim0 qim0Var, boolean z4, vu30 vu30Var, xu30 xu30Var, b0k b0kVar, int i2, int i3) {
        boolean z5;
        Object rqu0Var;
        boolean z6;
        l6q l6qVar2 = l6qVar;
        d0r d0rVar2 = d0rVar;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        vu30 vu30Var2 = y580.N0;
        llj lljVar3 = y580.O0;
        gra graVar = een.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1143531574);
        j06 j06Var = x340Var.a;
        int i4 = (i2 & 6) == 0 ? i2 | (x340Var.g(c380Var) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i4 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= x340Var.h(z3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= x340Var.i(nf40Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= x340Var.g(str) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= (i2 & 16777216) == 0 ? x340Var.g(l6qVar2) : x340Var.i(l6qVar2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= x340Var.i(d0rVar2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= x340Var.i(qim0Var) ? 536870912 : 268435456;
        }
        int i5 = i4;
        int i6 = (i3 & 6) == 0 ? i3 | (x340Var.h(z4) ? 4 : 2) : i3;
        if ((i3 & 48) == 0) {
            i6 |= x340Var.i(vu30Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= x340Var.i(xu30Var) ? 256 : 128;
        }
        int i7 = i6;
        if (x340Var.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z7 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z7) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar3);
            vu30 vu30Var3 = vu30Var2;
            nko1.H(xos0VarM, x340Var, vu30Var3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            x340Var.i0(-2012087956);
            boolean zIsEmpty = c380Var.isEmpty();
            nim0 nim0Var = nim0.a;
            if (zIsEmpty && z3) {
                x340Var.i0(-2012098311);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar3);
                nko1.H(xos0VarM2, x340Var, vu30Var3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                otw.c(nf40Var, new mf40(str), (qim0) null, (ipb1) null, x340Var, (i5 >> 15) & 14, 12);
                z6 = true;
                us71.m(x340Var, true, false, false);
                vu30Var = vu30Var;
                xu30Var = xu30Var;
            } else {
                x340Var.i0(-2011828270);
                x340Var.r(false);
                qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                mbh mbhVarA = jbh.a(new d36(6.0f, true, new um5(false)), een.P0, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarD2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar3);
                nko1.H(xos0VarM3, x340Var, vu30Var3);
                x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar);
                if (c380Var.isEmpty()) {
                    x340Var.i0(-776077098);
                    int i8 = i < 1 ? 1 : i;
                    for (int i9 = 0; i9 < i8; i9++) {
                        h(null, x340Var, 0);
                    }
                    x340Var.r(false);
                    z5 = false;
                } else {
                    x340Var.i0(-775957035);
                    Iterator it = o7h.d1(c380Var, i).iterator();
                    int i10 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            p7h.T();
                            throw null;
                        }
                        String str2 = (String) next;
                        boolean zG = x340Var.g(str2) | x340Var.g(d0rVar2) | ((i5 & 29360128) == 8388608 || ((i5 & 16777216) != 0 && x340Var.g(l6qVar2))) | ((i7 & 112) == 32);
                        Object objT = x340Var.T();
                        if (zG || objT == fkj0.X) {
                            vlu vluVar = new vlu(vu30Var, str2, (byte) 1);
                            switch (l6qVar2.a) {
                                case 0:
                                    rqu0Var = new rqu0((Flowable) l6qVar2.b.b.D5.get(), d0rVar2, vluVar);
                                    break;
                                default:
                                    rqu0Var = new rqu0((Flowable) l6qVar2.b.b.D5.get(), d0rVar2, vluVar);
                                    break;
                            }
                            x340Var.s0(rqu0Var);
                        } else {
                            it = it;
                            rqu0Var = objT;
                        }
                        rqu0 rqu0Var2 = (rqu0) rqu0Var;
                        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                        jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                        int iHashCode4 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM4 = x340Var.m();
                        qim0 qim0VarE4 = zr7.E(x340Var, qim0VarF);
                        hzj.A.getClass();
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(jw31VarA, x340Var, lljVar3);
                        nko1.H(xos0VarM4, x340Var, vu30Var3);
                        x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
                        qim0 qim0VarN = anm1.N("playlist_preview_track_row:" + str2 + ":click_target", kk0.q(x340Var, qim0VarE4, lljVar, 1.0f, true));
                        gfh0 gfh0VarC3 = t1c.c(graVar, false);
                        vu30 vu30Var4 = vu30Var3;
                        int iHashCode5 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM5 = x340Var.m();
                        qim0 qim0VarE5 = zr7.E(x340Var, qim0VarN);
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(n4kVar);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC3, x340Var, lljVar3);
                        nko1.H(xos0VarM5, x340Var, vu30Var4);
                        x0d.q(iHashCode5, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE5, x340Var, lljVar);
                        otw.c(rqu0Var2, new nqu0(z4 ? Integer.valueOf(i11) : null, str2), (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var.r(true);
                        if (xu30Var == null) {
                            x340Var.i0(-1148187478);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(794245687);
                            xu30Var.invoke(str2, x340Var, Integer.valueOf((i7 >> 3) & 112));
                            x340Var.r(false);
                        }
                        x340Var.r(true);
                        d0rVar2 = d0rVar;
                        vu30Var3 = vu30Var4;
                        i10 = i11;
                        it = it;
                        l6qVar2 = l6qVar;
                    }
                    z5 = false;
                    x340Var.r(false);
                }
                if (z && z2) {
                    v8i0.i(56.0f, -774816173, x340Var, x340Var, nim0Var);
                    x340Var.r(z5);
                } else {
                    x340Var.i0(-774734488);
                    x340Var.r(z5);
                }
                z6 = true;
                x340Var.r(true);
                x340Var.r(z5);
            }
            x340Var.r(z6);
        } else {
            vu30Var = vu30Var;
            xu30Var = xu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mw10(c380Var, i, z, z2, z3, nf40Var, str, l6qVar, d0rVar, qim0Var, z4, vu30Var, xu30Var, i2, i3);
        }
    }

    public static final void c(c380 c380Var, Object obj, iu30 iu30Var, j2i j2iVar, azb azbVar, qim0 qim0Var, String str, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object obj2;
        int i2;
        boolean z;
        float f;
        boolean z2;
        boolean z3;
        qim0 qim0Var3;
        m4c m4cVar;
        byte b2;
        azb azbVar2 = azbVar;
        fra fraVar = een.Z;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1212286070);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.i(c380Var) ? 4 : 2) | (x340Var.i(obj) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.g(azbVar2) ? 16384 : 8192) | 196608 | (x340Var.g(str) ? 1048576 : 524288);
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            boolean zG = x340Var.g(obj);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar2) {
                obj2 = objT;
                hrr0 hrr0VarQ = v8r.q(obj);
                x340Var.s0(hrr0VarQ);
                obj2 = hrr0VarQ;
            }
            tob1 tob1Var = (ven0) obj2;
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(x340Var).g;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarO = td6.o(u85Var, 32, qim0Var4);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarO);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
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
            if (c380Var.size() <= 3) {
                x340Var.i0(1894059046);
                qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
                cvx cvxVar2 = cbx.b(x340Var).b;
                m4c m4cVar3 = m4cVar2;
                i2 = i3;
                jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                Iterator itN = kk0.n(x340Var, qim0VarE2, lljVar4, -738704742, c380Var);
                while (itN.hasNext()) {
                    Object next = itN.next();
                    qim0 qim0VarN = anm1.N(w(next, u890.j(next, tob1Var.getValue()), azbVar2), new wnb0(1.0f, true));
                    boolean zJ = u890.j(next, tob1Var.getValue());
                    jgx jgxVar = new jgx(8);
                    int i4 = i2;
                    boolean zG2 = x340Var.g(tob1Var) | x340Var.i(next) | ((i4 & 896) == 256);
                    Object objT2 = x340Var.T();
                    if (zG2) {
                        m4cVar = m4cVar3;
                    } else {
                        m4cVar = m4cVar3;
                        if (objT2 != m4cVar) {
                            b2 = 0;
                        }
                        x340 x340Var2 = x340Var;
                        s1p1.h(zJ, (iu30) objT2, jgxVar, qim0VarN, (pgx) null, apo.r(-1434799448, new vvb(j2iVar, next, b2), x340Var), x340Var2, 196608);
                        azbVar2 = azbVar;
                        tob1Var = tob1Var;
                        m4cVar3 = m4cVar;
                        i2 = i4;
                        x340Var = x340Var2;
                    }
                    b2 = 0;
                    objT2 = new uvb(next, iu30Var, tob1Var, (byte) 0);
                    x340Var.s0(objT2);
                    x340 x340Var3 = x340Var;
                    s1p1.h(zJ, (iu30) objT2, jgxVar, qim0VarN, (pgx) null, apo.r(-1434799448, new vvb(j2iVar, next, b2), x340Var), x340Var3, 196608);
                    azbVar2 = azbVar;
                    tob1Var = tob1Var;
                    m4cVar3 = m4cVar;
                    i2 = i4;
                    x340Var = x340Var3;
                }
                us71.m(x340Var, false, true, false);
                z3 = false;
                qim0Var3 = qim0Var4;
                f = 16.0f;
                z2 = true;
            } else {
                i2 = i3;
                x340Var.i0(1895145565);
                qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
                jw31 jw31VarA2 = ew31.a(h36.e, fraVar, x340Var, 6);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF2);
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
                xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
                crn1.g(obj, c380Var, xtb0VarA, x340Var, ((i2 >> 3) & 14) | ((i2 << 3) & 112));
                uwr uwrVar2 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
                boolean zI = x340Var.i(c380Var) | x340Var.g(tob1Var) | ((57344 & i2) == 16384) | ((i2 & 896) == 256);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar2) {
                    z = true;
                    uh0 uh0Var = new uh0(c380Var, azbVar, tob1Var, iu30Var, j2iVar, (byte) 12);
                    x340Var.s0(uh0Var);
                    objT3 = uh0Var;
                } else {
                    z = true;
                }
                f = 16.0f;
                z2 = z;
                z3 = false;
                qim0Var3 = qim0Var4;
                too1.b((qim0) null, xtb0VarA, zzq0VarH, (iu30) objT3, x340Var, 0, 1);
                x340Var.r(z2);
                x340Var.r(false);
            }
            if (str != null) {
                x340Var.i0(1896406366);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var).b;
                qim0 qim0VarX = uyn1.x(qim0Var3, f);
                lee1 lee1Var = cbx.d(x340Var).j;
                long j = cbx.a(x340Var).b.b;
                long j2 = cbx.d(x340Var).o.a.b;
                zma1 zma1Var = cbx.d(x340Var).j.a;
                boolean z5 = z2 ? 1 : 0;
                x340 x340Var4 = x340Var;
                uwo1.e(str, qim0VarX, lee1Var, j, new a0e1(5), (iu30) null, 2, false, (djc0) null, 0, new px8(j2, zma1Var.b, fc11.G(z5 ? 1 : 0), (mx8) null, 8), x340Var4, ((i2 >> 18) & 14) | 1572864, 8, 928);
                x340Var = x340Var4;
                x340Var.r(z3);
                z2 = z5 ? 1 : 0;
            } else {
                boolean z6 = z2 ? 1 : 0;
                x340Var.i0(1897008913);
                uwr uwrVar4 = cbx.a;
                cvx cvxVar5 = cbx.b(x340Var).b;
                x0d.s(qim0Var3, f, x340Var, z3);
            }
            x340Var.r(z2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ta5(c380Var, obj, iu30Var, j2iVar, azbVar, qim0Var2, str, i);
        }
    }

    public static final void d(ee3 ee3Var, boolean z, iu30 iu30Var, iu30 iu30Var2, yqg yqgVar, b0k b0kVar, int i) {
        iu30 iu30Var3;
        ee3 ee3Var2;
        qim0 qim0Var;
        c36 c36Var;
        Function0 function0;
        vu30 vu30Var;
        vu30 vu30Var2;
        Function0 function1;
        vu30 vu30Var3;
        llj lljVar;
        x340 x340Var;
        int i2;
        Function0 function2;
        String str = ee3Var.b;
        String str2 = ee3Var.a;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(2142835752);
        j06 j06Var = x340Var2.a;
        int i3 = i | (x340Var2.g(ee3Var) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.i(iu30Var) ? 256 : 128) | (x340Var2.i(iu30Var2) ? 2048 : 1024) | (x340Var2.g(yqgVar) ? 16384 : 8192);
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarX = uyn1.x(qim0Var2, 16.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            Function0 function3 = hmb0.t1;
            if (z2) {
                x340Var2.l(function3);
            } else {
                x340Var2.v0();
            }
            vu30 vu30Var4 = y580.O0;
            nko1.H(mbhVarA, x340Var2, vu30Var4);
            vu30 vu30Var5 = y580.N0;
            nko1.H(xos0VarM, x340Var2, vu30Var5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar2);
            nko1.F(x340Var2);
            vu30 vu30Var6 = y580.Y;
            nko1.H(qim0VarE, x340Var2, vu30Var6);
            Uri uri = Uri.parse(ee3Var.e);
            cbx.a.getClass();
            eso1.e(uri, isl.a, anm1.N("main_image", i1p1.q(d7e.r(1.0f, u291.f(qim0Var2, 1.0f), false), er31.b(8.0f))), (p3v) null, (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 48, 0, 4056);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.h(qim0Var2, 16.0f));
            p(i3 & 112, ee3Var.c, x340Var2, z);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.h(qim0Var2, 16.0f));
            c36 c36Var2 = h36.g;
            if (z) {
                x340Var2.i0(-778934639);
                qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                jw31 jw31VarA = ew31.a(c36Var2, een.Z, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
                x340Var2.m0();
                if (x340Var2.S) {
                    function2 = function3;
                    x340Var2.l(function2);
                } else {
                    function2 = function3;
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, vu30Var4);
                nko1.H(xos0VarM2, x340Var2, vu30Var5);
                x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
                qim0 qim0VarN = anm1.N("text_container", kk0.q(x340Var2, qim0VarE2, vu30Var6, 1.0f, true));
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, 0);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarN);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function2);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, vu30Var4);
                nko1.H(xos0VarM3, x340Var2, vu30Var5);
                x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE3, x340Var2, vu30Var6);
                lee1 lee1Var = cbx.d(x340Var2).d;
                zsc zscVar = zex.a;
                qim0Var = qim0Var2;
                c36Var = c36Var2;
                uwo1.e(str2, anm1.N("title", qim0Var2), lee1Var, ((vex) zscVar.b).b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1712);
                uwo1.e(str, anm1.N("subtitle", qim0Var), cbx.d(x340Var2).g, ((vex) zscVar.b).b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1712);
                x340Var2.r(true);
                cvx cvxVar4 = cbx.b(x340Var2).b;
                op71.g(x340Var2, u291.v(qim0Var, 16.0f));
                eso1.e(Uri.parse(ee3Var.f), new jsl(str2), anm1.N("album_artwork", i1p1.q(u291.r(qim0Var, 80.0f), er31.b(4.0f))), (p3v) null, (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 0, 0, 4056);
                x340Var = x340Var2;
                x340Var.r(true);
                i2 = 0;
                x340Var.r(false);
                lljVar = lljVar2;
                vu30Var2 = vu30Var4;
                vu30Var = vu30Var5;
                vu30Var3 = vu30Var6;
                function1 = function2;
            } else {
                qim0Var = qim0Var2;
                c36Var = c36Var2;
                x340Var2.i0(-777503586);
                qim0 qim0VarN2 = anm1.N("text_container", u291.f(qim0Var, 1.0f));
                mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var2, 0);
                int iHashCode4 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM4 = x340Var2.m();
                qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarN2);
                x340Var2.m0();
                if (x340Var2.S) {
                    function0 = function3;
                    x340Var2.l(function0);
                } else {
                    function0 = function3;
                    x340Var2.v0();
                }
                nko1.H(mbhVarA3, x340Var2, vu30Var4);
                vu30Var = vu30Var5;
                nko1.H(xos0VarM4, x340Var2, vu30Var);
                x0d.q(iHashCode4, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE4, x340Var2, vu30Var6);
                g(ee3Var.c, iu30Var2, yqgVar, x340Var2, (i3 >> 6) & 1008);
                cvx cvxVar5 = cbx.b(x340Var2).b;
                vu30Var2 = vu30Var4;
                function1 = function0;
                vu30Var3 = vu30Var6;
                lljVar = lljVar2;
                uwo1.e(str, anm1.N("subtitle", qim0Var), kk0.p(qim0Var, 4.0f, x340Var2, x340Var2).g, ((vex) zex.a.b).b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1712);
                x340Var = x340Var2;
                x340Var.r(true);
                i2 = 0;
                x340Var.r(false);
            }
            qim0 qim0VarO = ab80.o(qim0Var, cbx.b(x340Var).b.b, x340Var, qim0Var, 1.0f);
            jw31 jw31VarA2 = ew31.a(c36Var, een.N0, x340Var, i2);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarO);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, vu30Var2);
            nko1.H(xos0VarM5, x340Var, vu30Var);
            x0d.q(iHashCode5, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE5, x340Var, vu30Var3);
            qim0 qim0VarN3 = anm1.N("share_button", eqr0.D(-12.0f, 0.0f, 2, qim0Var));
            ldx ldxVar = ldx.c;
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            int i4 = i3 & 896;
            boolean z3 = i4 == 256;
            Object objT = x340Var.T();
            if (z3 || objT == m4cVar) {
                iu30Var3 = iu30Var;
                objT = new ge3(iu30Var3, (byte) 0);
                x340Var.s0(objT);
            } else {
                iu30Var3 = iu30Var;
            }
            x340 x340Var3 = x340Var;
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, qim0VarN3, (max) null, (gdx) null, zzq0Var, false, (idn0) null, (ga80) null, w5i.a, x340Var3, 0, 6, 952);
            x340Var2 = x340Var3;
            if (z) {
                ee3Var2 = ee3Var;
                x340Var2.i0(17285207);
                boolean z4 = ee3Var2.g;
                boolean z5 = i4 == 256;
                Object objT2 = x340Var2.T();
                if (z5 || objT2 == m4cVar) {
                    objT2 = new ge3(iu30Var3, (byte) 2);
                    x340Var2.s0(objT2);
                }
                o(0, (Function0) objT2, x340Var2, anm1.N("play_button", qim0Var), z4);
                x340Var2.r(false);
            } else {
                x340Var2.i0(16709878);
                ee3Var2 = ee3Var;
                boolean z6 = ee3Var2.h;
                r4w0 r4w0Var = new r4w0(z6 ? x0d.k(x340Var2, 16863545, 2131960400, x340Var2, false) : x0d.k(x340Var2, 16939898, 2131960396, x340Var2, false), z6 ? 2 : 1);
                boolean z7 = i4 == 256;
                Object objT3 = x340Var2.T();
                if (z7 || objT3 == m4cVar) {
                    objT3 = new ge3(iu30Var3, (byte) 1);
                    x340Var2.s0(objT3);
                }
                x760.a(r4w0Var, (Function0) objT3, anm1.N("presave_button", qim0Var), x340Var2, 0);
                x340Var2.r(false);
            }
            x340Var2.r(true);
            x340Var2.r(true);
        } else {
            iu30Var3 = iu30Var;
            ee3Var2 = ee3Var;
            x340Var2.b0();
        }
        h311 h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new ey(ee3Var2, z, iu30Var3, iu30Var2, yqgVar, i, (byte) 4);
        }
    }

    public static final void e(iuk iukVar, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        String str;
        Object x4cVar;
        bs91 bs91Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2032349937);
        int i2 = i | (x340Var.i(iukVar) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarK = f4p1.k(iukVar.e, (iac0) null, x340Var, 7);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new bs91();
                x340Var.s0(objT);
            }
            bs91 bs91Var2 = (bs91) objT;
            String strO0 = cwl1.o0(x340Var, 2131954210);
            kiv kivVar = AndroidCompositionLocals_androidKt.a;
            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
            boolean zI = x340Var.i(iac0Var) | x340Var.i(iukVar) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                str = strO0;
                hff hffVar = new hff(iac0Var, iukVar, function0, (lnm) null, (byte) 18);
                x340Var.s0(hffVar);
                objT2 = hffVar;
            } else {
                str = strO0;
            }
            qxd0.s(iukVar, iac0Var, (vu30) objT2, x340Var);
            boolean zI2 = x340Var.i(iac0Var) | x340Var.i(iukVar) | x340Var.i(bs91Var2) | x340Var.g(str);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                bs91Var = bs91Var2;
                x4cVar = new x4c(iac0Var, iukVar, bs91Var, str, (lnm) null);
                x340Var.s0(x4cVar);
            } else {
                x4cVar = objT3;
                bs91Var = bs91Var2;
            }
            qxd0.s(iukVar, iac0Var, (vu30) x4cVar, x340Var);
            wtk wtkVar = (wtk) ven0VarK.getValue();
            boolean zI3 = x340Var.i(iukVar) | ((i2 & 896) == 256);
            Object objT4 = x340Var.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new kjk(function1, iukVar, (byte) 5);
                x340Var.s0(objT4);
            }
            f(wtkVar, bs91Var, (iu30) objT4, x340Var, 3072);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(iukVar, function0, function1, qim0Var2, i, (byte) 26);
        }
    }

    public static final void f(wtk wtkVar, bs91 bs91Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        hax haxVar;
        bs91 bs91Var2 = bs91Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1695017921);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(wtkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(bs91Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 256 : 128;
        }
        int i3 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var2.i(nim0Var) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var2).a.c, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            gra graVar = een.h;
            h2c h2cVar = h2c.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var2).e.b, 0.0f, 2, u291.f(h2cVar.a(nim0Var, graVar), 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarZ);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            mpx mpxVar = mpx.c;
            zov0 zov0Var = cbx.b(x340Var2).g;
            byte b2 = 16;
            w0h1.a(mpxVar, isl.a, u291.r(nim0Var, 48.0f), cbx.a(x340Var2).b.a, 0L, false, x340Var2, mpx.d | 48, 48);
            String strO0 = cwl1.o0(x340Var2, 2131954212);
            lee1 lee1Var = cbx.d(x340Var2).d;
            long j = cbx.a(x340Var2).b.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            uwo1.e(strO0, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2016);
            String strO1 = cwl1.o0(x340Var2, 2131954211);
            lee1 lee1Var2 = cbx.d(x340Var2).g;
            long j2 = cbx.a(x340Var2).b.b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            uwo1.e(strO1, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), lee1Var2, j2, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2016);
            String strO2 = cwl1.o0(x340Var2, 2131954208);
            idx idxVar = new idx();
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new gmj(b2, wtkVar, iu30Var);
                x340Var2.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            if (wtkVar.b == xtk.b) {
                x340Var2.i0(252473649);
                haxVar = new hax(cwl1.o0(x340Var2, 2131954209));
                x340Var2.r(false);
            } else {
                x340Var2.i0(252623255);
                x340Var2.r(false);
                haxVar = jax.a;
            }
            foo1.c(gbxVar, idxVar, uyn1.B(nim0Var, 0.0f, cbx.b(x340Var2).b.e, 0.0f, 0.0f, 13), haxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(958414076, new jjk(wtkVar, strO2, (byte) 4), x340Var2), x340Var2, 0, 48, 2024);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0 qim0VarZ2 = uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, voo1.y(h2cVar.a(nim0Var, een.e), voo1.e));
            cvx cvxVar3 = cbx.b(x340Var).b;
            bs91Var2 = bs91Var;
            sok.k(bs91Var2, uyn1.B(qim0VarZ2, 0.0f, 16.0f, 0.0f, 0.0f, 13), rei.a, x340Var, ((i2 >> 3) & 14) | 384, 0);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(wtkVar, bs91Var2, iu30Var, i);
        }
    }

    public static final void g(long j, iu30 iu30Var, yqg yqgVar, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-911963672);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            iu30Var2 = iu30Var;
            i2 |= b0kVar3.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(yqgVar) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q("");
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            kiv kivVar = AndroidCompositionLocals_androidKt.a;
            x8c0 lifecycle = ((iac0) b0kVar3.k(jfe0.a)).getLifecycle();
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.valueOf(lifecycle.b().a(w8c0.d)));
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            Resources resources = ((Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b)).getResources();
            boolean zI = b0kVar3.i(ven0Var2) | b0kVar3.i(lifecycle);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new he3(lifecycle, ven0Var2, (byte) 0);
                b0kVar3.s0(objT3);
            }
            qxd0.i(lifecycle, (iu30) objT3, b0kVar3);
            Long lValueOf = Long.valueOf(j);
            Boolean bool = (Boolean) ven0Var2.getValue();
            bool.getClass();
            Object[] objArr = {lValueOf, bool, yqgVar, resources};
            boolean zI2 = ((i2 & 14) == 4) | b0kVar3.i(ven0Var2) | ((i2 & 896) == 256) | ((i2 & 112) == 32) | b0kVar3.i(ven0Var) | b0kVar3.i(resources);
            Object objT4 = b0kVar3.T();
            if (zI2 || objT4 == m4cVar) {
                ie3 ie3Var = new ie3(j, yqgVar, iu30Var2, resources, ven0Var2, ven0Var, (lnm) null);
                b0kVar3.s0(ie3Var);
                objT4 = ie3Var;
            }
            qxd0.u(objArr, (vu30) objT4, b0kVar3);
            String str = (String) ven0Var.getValue();
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.e(str, anm1.N("countdown", u291.f(nim0.a, 1.0f)), cbx.d(b0kVar3).c, ((vex) zex.a.b).b, (a0e1) null, (iu30) null, 3, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1712);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new je3(j, iu30Var, yqgVar, i);
        }
    }

    public static final void h(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1125442901);
        j06 j06Var = x340Var.a;
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarB = u291.b(0.0f, dsa0.m(x340Var, 2131166077), 1, u291.f(qim0Var2, 1.0f));
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
            qim0 qim0VarR = u291.r(qim0Var2, dsa0.m(x340Var, 2131166076));
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarR, jC, er31.b(4.0f));
            long jC2 = cbx.a(x340Var).a.b.c();
            cua cuaVar2 = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(qim0VarF, jC2, er31.b(4.0f), 12), x340Var, 0);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarH = kx40.h(1.0f, uyn1.B(qim0Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
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
            tm80.p(0.7f, 14.0f, x340Var, 6);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = ywx0.k(qim0Var2, 2.0f, x340Var, x340Var).b;
            tm80.p(0.45f, 12.0f, x340Var, 6);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var2, i, (byte) 1);
        }
    }

    public static final void i(String str, String str2, String str3, boolean z, String str4, Boolean bool, p8q0 p8q0Var, iu30 iu30Var, lag lagVar, String str5, String str6, boolean z2, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1362232361);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(str3) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.g(str4) ? 16384 : 8192) | (b0kVar3.g(bool) ? 131072 : 65536) | (b0kVar3.g(p8q0Var) ? 1048576 : 524288) | (b0kVar3.i(iu30Var) ? 8388608 : 4194304) | (b0kVar3.i(lagVar) ? 67108864 : 33554432) | (b0kVar3.g(str5) ? 536870912 : 268435456);
        if (b0kVar3.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (((b0kVar3.g(str6) ? (char) 4 : (char) 2) | (b0kVar3.h(z2) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            mgx mgxVar = mgx.e;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            ydx ydxVar = new ydx((16 & 1) != 0 ? 4.0f : 0.0f, (16 & 2) != 0 ? 12.0f : 0.0f, (16 & 4) != 0 ? 8.0f : 0.0f, (16 & 8) != 0 ? new zzq0(12.0f, 12.0f, 12.0f, 12.0f) : new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (16 & 16) != 0 ? vdx.a : wdx.a);
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(16.0f);
            boolean z3 = ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objT = b0kVar3.T();
            if (z3 || objT == fkj0.X) {
                objT = new m8q0(p8q0Var, iu30Var, z, str3);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            ioo1.c(qim0VarF, mgxVar, ydxVar, cr31VarB, (max) null, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT), (gbx) null, apo.r(-1136932124, new jrn(str, str2, z, str4, p8q0Var, iu30Var, str3, z2, lagVar, str5, str6), b0kVar3), (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-835765986, new j6v(str2, str3, z, bool, p8q0Var, iu30Var), b0kVar3), b0kVar2, 805306880, 1572864, 64880);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l3b(str, str2, str3, z, str4, bool, p8q0Var, iu30Var, lagVar, str5, str6, z2, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void j(String str, boolean z, Boolean bool, p8q0 p8q0Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        boolean z2;
        int i3;
        int i4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(793929866);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(bool) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(p8q0Var) : x340Var.i(p8q0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        boolean z3 = true;
        if (!x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.b0();
        } else if (p8q0Var instanceof o8q0) {
            x340Var.i0(-1537569156);
            if (bool != null) {
                x340Var.i0(-419983397);
                if (bool.booleanValue()) {
                    i3 = -1537568018;
                    i4 = 2131955780;
                } else {
                    i3 = -1537566675;
                    i4 = 2131955779;
                }
                String strK = x0d.k(x340Var, i3, i4, x340Var, false);
                klx klxVar = bool.booleanValue() ? klx.c : irx.c;
                boolean zBooleanValue = bool.booleanValue();
                boolean z4 = (57344 & i2) == 16384;
                if ((i2 & 7168) != 2048 && ((i2 & 4096) == 0 || !x340Var.i(p8q0Var))) {
                    z3 = false;
                }
                boolean z5 = z4 | z3;
                Object objT = x340Var.T();
                if (z5 || objT == m4cVar) {
                    objT = new ozp0(iu30Var, p8q0Var, (byte) 7);
                    x340Var.s0(objT);
                }
                z2 = false;
                foo1.d(zBooleanValue, (iu30) objT, jdx.c, (qim0) null, (yf) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, apo.r(2066684571, new jyo0(klxVar, bool, (byte) 11), x340Var), (vu30) null, apo.r(-1325362147, new tej0(strK, (byte) 24), x340Var), x340Var, (i2 >> 6) & 14, 390, 3000);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                z2 = false;
                x340Var.i0(-419032968);
                x340Var.r(false);
            }
            x340Var.r(z2);
        } else {
            if (!(p8q0Var instanceof n8q0)) {
                throw p3d1.k(x340Var, -1537570406, false);
            }
            x340Var.i0(-418975742);
            String strO0 = cwl1.o0(x340Var, 2131955760);
            boolean z6 = ((i2 & 112) == 32) | ((i2 & 57344) == 16384) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && x340Var.i(p8q0Var))) | ((i2 & 14) == 4);
            Object objT2 = x340Var.T();
            if (z6 || objT2 == m4cVar) {
                objT2 = new m8q0(z, iu30Var, p8q0Var, str);
                x340Var.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                foo1.c(new gbx(new y50(strO0), function0), jdx.c, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-364967830, new tej0(strO0, (byte) 25), x340Var), x340Var, 0, 48, 2012);
                x340Var = x340Var;
                x340Var.r(false);
            }
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(str, z, bool, p8q0Var, iu30Var, i, (byte) 26);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(String str, String str2, boolean z, Boolean bool, p8q0 p8q0Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2141995885);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.g(bool) ? 2048 : 1024) | (x340Var.g(p8q0Var) ? 16384 : 8192) | (x340Var.i(iu30Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            n(str, p8q0Var, kk0.q(x340Var, qim0VarE2, lljVar4, 1.0f, true), x340Var, (i2 & 14) | ((i2 >> 9) & 112));
            j(str2, z, bool, p8q0Var, iu30Var, x340Var, (i2 >> 3) & 65534);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(str, str2, z, bool, p8q0Var, iu30Var, i, (byte) 18);
        }
    }

    public static final void l(boolean z, String str, boolean z2, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        int i2;
        int i3;
        String strN0;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1135411680);
        int i4 = i | (x340Var2.h(z) ? 4 : 2) | (x340Var2.g(str) ? 32 : 16) | (x340Var2.h(z2) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024) | (x340Var2.i(qim0Var) ? 16384 : 8192);
        if (x340Var2.Y(i4 & 1, (i4 & 9363) != 9362)) {
            if (z2 && z && str != null) {
                x340Var2.i0(968059424);
                strN0 = cwl1.n0(2131955768, new Object[]{str}, x340Var2);
                x340Var2.r(false);
            } else {
                if (z2 && z) {
                    i2 = 968062993;
                    i3 = 2131955769;
                } else if (z2) {
                    i2 = 968065704;
                    i3 = 2131955770;
                } else if (z && str != null) {
                    x340Var2.i0(968068835);
                    strN0 = cwl1.n0(2131955764, new Object[]{str}, x340Var2);
                    x340Var2.r(false);
                } else if (z) {
                    i2 = 968071956;
                    i3 = 2131955765;
                } else {
                    i2 = 968074475;
                    i3 = 2131955766;
                }
                strN0 = x0d.k(x340Var2, i2, i3, x340Var2, false);
            }
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
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
            lee1 lee1Var = cbx.d(x340Var2).h;
            long j = cbx.a(x340Var2).b.a;
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            uwo1.e(strN0, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).then(new vul1(xl3.a)), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            x340Var = x340Var2;
            if (z && z2) {
                x340Var.i0(1915780873);
                String strO0 = cwl1.o0(x340Var, 2131955767);
                lee1 lee1Var2 = cbx.d(x340Var).k;
                long j2 = cbx.a(x340Var).b.b;
                vul1 vul1Var = new vul1(xl3.a);
                boolean z3 = (i4 & 7168) == 2048;
                Object objT = x340Var.T();
                if (z3 || objT == fkj0.X) {
                    objT = new kek0(function0, (byte) 20);
                    x340Var.s0(objT);
                }
                uwo1.e(strO0, bin.x(vul1Var, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), lee1Var2, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1916029958);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(z, str, z2, function0, qim0Var, i);
        }
    }

    public static final void m(String str, String str2, b0k b0kVar, int i) {
        qim0 qim0Var;
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1059972557);
        int i3 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            if (str.length() > 0) {
                x340Var.i0(695960198);
                Uri uri = Uri.parse(str);
                jsl jslVar = new jsl(str2);
                qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
                cbx.a.getClass();
                qim0Var = qim0Var2;
                i2 = 0;
                eso1.e(uri, jslVar, qim0VarF2, (p3v) null, (zvx) null, uwr.b(), (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 27648, 0, 4032);
                x340Var.r(false);
            } else {
                qim0Var = qim0Var2;
                i2 = 0;
                x340Var.i0(696239849);
                x340Var.r(false);
            }
            t1c.a(dug.e(h2c.a.b(qim0Var), v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(u7h.b, 0.3f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.j)}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, i2);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b4((byte) 12, i, str, str2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void n(String str, p8q0 p8q0Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1401757240);
        int i2 = i | (x340Var2.g(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var2.g(p8q0Var) : x340Var2.i(p8q0Var) ? 32 : 16;
        }
        int i3 = i2 | (x340Var2.i(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwr uwrVar = cbx.a;
            boolean z = true;
            uwo1.e(str, (qim0) null, cbx.d(x340Var2).e, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var2, i3 & 14, 0, 1786);
            boolean z2 = p8q0Var instanceof o8q0;
            nim0 nim0Var = nim0.a;
            if (z2) {
                x340Var2.i0(752470596);
                o8q0 o8q0Var = (o8q0) p8q0Var;
                String str2 = o8q0Var.c;
                String str3 = o8q0Var.b;
                lee1 lee1Var = cbx.d(x340Var2).j;
                cvx cvxVar = cbx.b(x340Var2).b;
                uwo1.e(str3, uyn1.B(nim0Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2040);
                x340Var = x340Var2;
                if (str2.length() > 0) {
                    x340Var.i0(752716364);
                    uwo1.e(str2, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1778);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(752939316);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                if (!(p8q0Var instanceof n8q0)) {
                    throw p3d1.k(x340Var2, 1132650723, false);
                }
                x340Var2.i0(753004695);
                n8q0 n8q0Var = (n8q0) p8q0Var;
                String str4 = n8q0Var.b;
                lee1 lee1Var2 = cbx.d(x340Var2).j;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                uwo1.e(str4, uyn1.B(nim0Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), lee1Var2, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2040);
                int i4 = n8q0Var.c;
                uwo1.e(cwl1.U(2131820685, i4, new Object[]{Integer.valueOf(i4)}, x340Var2), (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                x340Var = x340Var2;
                x340Var.r(false);
                z = true;
            }
            x340Var.r(z);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(str, p8q0Var, qim0Var, i, (byte) 13);
        }
    }

    public static final void o(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1929301797);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131959797);
            wro1.h(new gbx(z50.c, function0), new idx(6), qim0Var, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(473457454, new ke3(z, cwl1.o0(x340Var, 2131959682), strO0, (byte) 0), x340Var), x340Var, i2 & 896, 6, 1016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(z, function0, qim0Var, i, (byte) 0);
        }
    }

    public static final void p(int i, long j, b0k b0kVar, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(264332481);
        int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.h(z) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131961064);
            String strO1 = cwl1.o0(x340Var, 2131961056);
            boolean zG = ((i2 & 112) == 32) | ((i2 & 14) == 4) | x340Var.g(strO0) | x340Var.g(strO1);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                String str = new SimpleDateFormat("MMMM d, yyyy", Locale.getDefault()).format(new Date(1000 * j));
                objT = z ? String.format(strO1, Arrays.copyOf(new Object[]{str}, 1)) : String.format(strO0, Arrays.copyOf(new Object[]{str}, 1));
                x340Var.s0(objT);
            }
            String str2 = (String) objT;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xrx xrxVar = xrx.c;
            zsc zscVar = zex.a;
            long j2 = ((vex) zscVar.b).b;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(xrxVar, isl.a, anm1.N("release_date_icon", u291.r(nim0Var, 16.0f)), j2, 0L, false, x340Var, xrx.d | 48, 48);
            uwo1.e(str2, anm1.N("release_date_label", nim0Var), cbx.d(x340Var).k, ((vex) zscVar.b).b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1712);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new me3(j, z, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x012d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0132  */
    /* JADX WARN: Code duplicated, block: B:50:0x013d  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    public static final void q(qim0 qim0Var, vzq0 vzq0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        vzq0 vzq0VarH;
        int i4;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        h311 h311VarV;
        int i5;
        qim0 qim0Var4;
        qim0 qim0Var5;
        Object objT;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(966721380);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i | (b0kVar3.i(qim0Var2) ? 4 : 2);
        }
        if ((i2 & 2) == 0) {
            vzq0VarH = vzq0Var;
            int i7 = b0kVar3.i(vzq0VarH) ? 32 : 16;
            i4 = i3 | i7;
            if ((i4 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                b0kVar3.d0();
                i5 = i & 1;
                qim0Var4 = nim0.a;
                if (i5 != 0 || b0kVar3.E()) {
                    if (i6 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i2 & 2) != 0) {
                        vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                    }
                } else {
                    b0kVar3.b0();
                }
                qim0Var5 = qim0Var2;
                b0kVar3.s();
                objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = r7a1.X;
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0Var5, true, (iu30) objT);
                fra fraVar = een.N0;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                jw31VarA = ew31.a(new d36(2.0f, true, new um5(false)), fraVar, b0kVar3, 0);
                iHashCode = Long.hashCode(((x340) b0kVar3).T);
                xos0VarM = b0kVar3.m();
                qim0VarE = zr7.E(b0kVar3, qim0VarB);
                hzj.A.getClass();
                if (((x340) b0kVar3).a != null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(hmb0.t1);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(jw31VarA, b0kVar3, y580.O0);
                nko1.H(xos0VarM, b0kVar3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                nko1.F(b0kVar3);
                nko1.H(qim0VarE, b0kVar3, y580.Y);
                vzq0 vzq0Var2 = vzq0VarH;
                b0kVar2 = b0kVar3;
                eso1.g(cyo1.x(b0kVar3, 2131233938), new jsl(cwl1.o0(b0kVar3, 2131962703)), u291.B(qim0Var4, (gra) null, 3), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, b0kVar2, 199680, 464);
                suo1.e(4, uyn1.w(u291.B(qim0Var4, (gra) null, 3), vzq0Var2), 2, kjj.a, b0kVar2, 3462, 0);
                b0kVar2.r(true);
                vzq0VarH = vzq0Var2;
                qim0Var3 = qim0Var5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new g8(qim0Var3, vzq0VarH, i, i2, (byte) 17);
            }
        }
        vzq0VarH = vzq0Var;
        i4 = i3 | i7;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i4 & 1, z)) {
            b0kVar3.d0();
            i5 = i & 1;
            qim0Var4 = nim0.a;
            if (i5 != 0) {
                if (i6 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 2) != 0) {
                    vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                }
            } else {
                if (i6 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i2 & 2) != 0) {
                    vzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                }
            }
            qim0Var5 = qim0Var2;
            b0kVar3.s();
            objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = r7a1.X;
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0Var5, true, (iu30) objT);
            fra fraVar2 = een.N0;
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            jw31VarA = ew31.a(new d36(2.0f, true, new um5(false)), fraVar2, b0kVar3, 0);
            iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0VarM = b0kVar3.m();
            qim0VarE = zr7.E(b0kVar3, qim0VarB2);
            hzj.A.getClass();
            if (((x340) b0kVar3).a != null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            vzq0 vzq0Var3 = vzq0VarH;
            b0kVar2 = b0kVar3;
            eso1.g(cyo1.x(b0kVar3, 2131233938), new jsl(cwl1.o0(b0kVar3, 2131962703)), u291.B(qim0Var4, (gra) null, 3), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, b0kVar2, 199680, 464);
            suo1.e(4, uyn1.w(u291.B(qim0Var4, (gra) null, 3), vzq0Var3), 2, kjj.a, b0kVar2, 3462, 0);
            b0kVar2.r(true);
            vzq0VarH = vzq0Var3;
            qim0Var3 = qim0Var5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(qim0Var3, vzq0VarH, i, i2, (byte) 17);
        }
    }

    public static final void r(egf1 egf1Var, fqg0 fqg0Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        boolean z = egf1Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-368518931);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(egf1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(fqg0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            obg1.e(!z, cwl1.o0(x340Var, z ? 2131963310 : 2131963311), qim0Var2, 0.0f, false, "track_row", apo.r(-2129275282, new xaf1(fqg0Var, egf1Var, (byte) 5), x340Var), function0, x340Var, (i2 & 896) | 1769472 | ((i2 << 12) & 29360128), 24);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, egf1Var, fqg0Var, qim0Var, function0, (byte) 5);
        }
    }

    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    public static final void s(qim0 qim0Var, Function0 function0, vu30 vu30Var, b0k b0kVar, int i) {
        Function0 function1;
        vu30 vu30Var2;
        tob1 tob1Var;
        ven0 ven0Var;
        ven0 ven0Var2;
        long j;
        Function0 function2;
        boolean z;
        ?? r6;
        qim0 qim0Var2;
        Function0 function3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1405675166);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(qim0Var) ? 32 : 16) | 3456;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = w3l1.O0;
                x340Var.s0(objT);
            }
            Function0 function4 = (Function0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = u5l1.Y;
                x340Var.s0(objT2);
            }
            vu30 vu30Var3 = (vu30) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q((Object) null);
                x340Var.s0(objT3);
            }
            ven0 ven0Var3 = (ven0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(ckl1.a);
                x340Var.s0(objT4);
            }
            tob1 tob1Var2 = (ven0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = v8r.q(Boolean.TRUE);
                x340Var.s0(objT5);
            }
            ven0 ven0Var4 = (ven0) objT5;
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = v8r.q(Boolean.TRUE);
                x340Var.s0(objT6);
            }
            ven0 ven0Var5 = (ven0) objT6;
            Object objT7 = x340Var.T();
            if (objT7 == m4cVar) {
                objT7 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT7);
            }
            ven0 ven0Var6 = (ven0) objT7;
            Object objT8 = x340Var.T();
            if (objT8 == m4cVar) {
                objT8 = v8r.q(Boolean.TRUE);
                x340Var.s0(objT8);
            }
            ven0 ven0Var7 = (ven0) objT8;
            Object objT9 = x340Var.T();
            if (objT9 == m4cVar) {
                objT9 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT9);
            }
            ven0 ven0Var8 = (ven0) objT9;
            Object objT10 = x340Var.T();
            if (objT10 == m4cVar) {
                objT10 = v8r.q(0);
                x340Var.s0(objT10);
            }
            ven0 ven0Var9 = (ven0) objT10;
            uwr uwrVar = cbx.a;
            long j2 = cbx.a(x340Var).a.c;
            long j3 = cbx.a(x340Var).b.a;
            Boolean bool = (Boolean) ven0Var4.getValue();
            bool.booleanValue();
            boolean zI = x340Var.i(ven0Var4) | x340Var.i(ven0Var5);
            Object objT11 = x340Var.T();
            if (zI || objT11 == m4cVar) {
                objT11 = new pg6(ven0Var4, ven0Var5, (lnm) null, (byte) 8);
                x340Var.s0(objT11);
            }
            qxd0.t(bool, x340Var, (vu30) objT11);
            Integer numValueOf = Integer.valueOf(((Number) ven0Var9.getValue()).intValue());
            boolean zI2 = x340Var.i(tob1Var2) | x340Var.i(ven0Var4);
            Object objT12 = x340Var.T();
            if (zI2 || objT12 == m4cVar) {
                objT12 = new pg6(tob1Var2, ven0Var4, (lnm) null, (byte) 9);
                x340Var.s0(objT12);
            }
            qxd0.t(numValueOf, x340Var, (vu30) objT12);
            WebView webView = (WebView) ven0Var3.getValue();
            boolean z2 = webView != null && webView.canGoBack();
            boolean zI3 = x340Var.i(ven0Var3);
            Object objT13 = x340Var.T();
            if (zI3 || objT13 == m4cVar) {
                objT13 = new mek1(ven0Var3, (byte) 7);
                x340Var.s0(objT13);
            }
            q3p1.b(0, 0, (Function0) objT13, x340Var, z2);
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
            boolean z3 = x340Var.S;
            Function0 function5 = hmb0.t1;
            if (z3) {
                x340Var.l(function5);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            boolean zI4 = x340Var.i(ven0Var4) | x340Var.i(ven0Var7) | x340Var.i(ven0Var6) | x340Var.i(tob1Var2) | x340Var.i(ven0Var8) | x340Var.i(ven0Var3);
            Object objT14 = x340Var.T();
            if (zI4 || objT14 == m4cVar) {
                tob1Var = tob1Var2;
                ven0Var = ven0Var3;
                objT14 = new qi1(function4, vu30Var3, ven0Var4, ven0Var7, ven0Var6, tob1Var, ven0Var8, ven0Var, (byte) 15);
                ven0Var2 = ven0Var4;
                x340Var.s0(objT14);
            } else {
                tob1Var = tob1Var2;
                ven0Var2 = ven0Var4;
                ven0Var = ven0Var3;
            }
            iu30 iu30Var = (iu30) objT14;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            Object objT15 = x340Var.T();
            if (objT15 == m4cVar) {
                objT15 = lcl1.i;
                x340Var.s0(objT15);
            }
            iu30 iu30Var2 = (iu30) objT15;
            x340 x340Var2 = x340Var;
            ven0 ven0Var10 = ven0Var2;
            dm5.b(iu30Var, qim0VarD, (iu30) null, iu30Var2, (iu30) null, x340Var2, 3072, 20);
            boolean zBooleanValue = ((Boolean) ven0Var5.getValue()).booleanValue();
            u5j1 u5j1Var = d4o1.a;
            ckl1 ckl1Var = ckl1.c;
            if (!zBooleanValue || ((ckl1) tob1Var.getValue()) == ckl1Var) {
                j = j2;
                function2 = function5;
                z = true;
                r6 = 0;
                qim0Var2 = qim0Var3;
                x340Var2.i0(1495336030);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1495009290);
                qim0 qim0VarF = dug.f(u291.d(qim0Var3, 1.0f), j2, u5j1Var);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
                x340Var2.m0();
                if (x340Var2.S) {
                    function3 = function5;
                    x340Var2.l(function3);
                } else {
                    function3 = function5;
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC2, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                j = j2;
                function2 = function3;
                qim0Var2 = qim0Var3;
                rhx0.a((qim0) null, j3, 0.0f, 0L, 0, 0.0f, x340Var2, 0, 61);
                x340Var2 = x340Var2;
                z = true;
                x340Var2.r(true);
                r6 = 0;
                x340Var2.r(false);
            }
            if (((ckl1) tob1Var.getValue()) == ckl1Var) {
                x340Var2.i0(1495446297);
                qim0 qim0VarF2 = dug.f(u291.d(qim0Var2, 1.0f), j, u5j1Var);
                mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var2, (int) r6);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarF2);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function2);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, lljVar);
                nko1.H(xos0VarM3, x340Var2, lljVar2);
                x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar4);
                x340 x340Var3 = x340Var2;
                tob1 tob1Var3 = tob1Var;
                uwo1.e(cwl1.o0(x340Var2, 2131963859), (qim0) null, (lee1) null, j3, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2038);
                x340Var = x340Var3;
                String strG = ydh.g(16.0f, 2131963852, x340Var, x340Var, qim0Var2);
                ven0 ven0Var11 = ven0Var;
                boolean zI5 = x340Var.i(tob1Var3) | x340Var.i(ven0Var10) | x340Var.i(ven0Var9) | x340Var.i(ven0Var11);
                Object objT16 = x340Var.T();
                if (zI5 || objT16 == m4cVar) {
                    odp0 odp0Var = new odp0(tob1Var3, ven0Var10, ven0Var9, ven0Var11, (byte) 26);
                    x340Var.s0(odp0Var);
                    objT16 = odp0Var;
                }
                Function0 function6 = (Function0) objT16;
                if (ihc1.y0(strG)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                foo1.c(new gbx(new y50(strG), function6), new idx(19), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, dsj.a, x340Var, 0, 48, 2044);
                z = true;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                x340Var = x340Var2;
                x340Var.i0(1496225854);
                x340Var.r((boolean) r6);
            }
            x340Var.r(z);
            function1 = function4;
            vu30Var2 = vu30Var3;
        } else {
            x340Var.b0();
            function1 = function0;
            vu30Var2 = vu30Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pej1(qim0Var, function1, vu30Var2, i, (byte) 15);
        }
    }

    public static final void t(ns31 ns31Var, String str) {
        jd11 jd11Var = rc11.a;
        u(ns31Var, jd11Var.b(jo70.class), wiu.g);
        u(ns31Var, jd11Var.b(xkk1.class), wiu.h);
        u(ns31Var, jd11Var.b(hll.class), wiu.i);
        u(ns31Var, jd11Var.b(mtl.class), wiu.t);
        tka0 tka0VarB = jd11Var.b(jo70.class);
        qeu qeuVar = new qeu(str, (byte) 3);
        wlu wluVar = new wlu(tka0VarB);
        ulu uluVar = new ulu(tka0VarB, (byte) 0);
        wiu wiuVar = wiu.X;
        qlt qltVar = qlt.P0;
        xs31.e(ns31Var, wluVar, uluVar, wiuVar, qltVar, new k7f((byte) 11, qeuVar, false));
        tka0 tka0VarB2 = jd11Var.b(xkk1.class);
        xs31.e(ns31Var, new wlu(tka0VarB2), new ulu(tka0VarB2, (byte) 0), wiuVar, qltVar, new k7f((byte) 11, qlt.O0, false));
        ns31Var.a(new or31(new ulu(jd11Var.b(wlu.class), (byte) 2), vm31.P0, new aaq0(4, (byte) 18), new ws31(krz0.O0, (byte) 0)));
    }

    public static final void u(ns31 ns31Var, tka0 tka0Var, iu30 iu30Var) {
        wlu wluVar = new wlu(tka0Var);
        ulu uluVar = new ulu(tka0Var, (byte) 1);
        hws hwsVar = new hws(iu30Var, (byte) 12);
        zhq0 zhq0Var = xs31.a;
        ns31Var.a(new or31(new hf31(wluVar, uluVar, (byte) 8), vm31.Z, vs31.b, new z821(hwsVar, (byte) 7)));
    }

    public static djw0 v(Uri uri) {
        return new djw0(uri.getQueryParameter("countries"), uri.getQueryParameter("platform"), uri.getQueryParameter("previewId"), uri.getQueryParameter("resource"), o7h.p1(uri.getQueryParameters("languages")));
    }

    public static final String w(Object obj, boolean z, azb azbVar) {
        if (azbVar instanceof ryb) {
            return "mixing_bottom_sheet_bar_chip_type_" + ((Integer) obj).intValue() + "_" + z;
        }
        if (azbVar instanceof tyb) {
            i820 i820Var = (j820) obj;
            if (!(i820Var instanceof i820)) {
                if (i820Var instanceof h820) {
                    return "mixing_bottom_sheet_custom_effects_chip_".concat(z ? "checked" : "unchecked");
                }
                eg.o();
                return null;
            }
            return "mixing_bottom_sheet_filter_fx_chip_type_" + i820Var.a + "_" + z;
        }
        if (azbVar instanceof syb) {
            eez eezVar = (fez) obj;
            if (!(eezVar instanceof eez)) {
                if (eezVar instanceof cez) {
                    return "mixing_bottom_sheet_custom_eq_chip_".concat(z ? "checked" : "unchecked");
                }
                eg.o();
                return null;
            }
            return "mixing_bottom_sheet_eq_chip_type_" + eezVar.a + "_" + z;
        }
        if (!(azbVar instanceof zyb)) {
            if (azbVar.equals(uyb.a) || azbVar.equals(wyb.a) || azbVar.equals(vyb.a) || azbVar.equals(xyb.a)) {
                return "";
            }
            eg.o();
            return null;
        }
        yqk1 yqk1Var = (zqk1) obj;
        if (!(yqk1Var instanceof yqk1)) {
            if (yqk1Var instanceof xqk1) {
                return "mixing_bottom_sheet_custom_volume_chip_".concat(z ? "checked" : "unchecked");
            }
            eg.o();
            return null;
        }
        return "mixing_bottom_sheet_volume_chip_type_" + yqk1Var.a + "_" + z;
    }

    public static final Class x(String str) {
        if (dhn.a.contains(c680.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            dhn.a(c680.class, th);
            return null;
        }
    }

    public static bff0 y() {
        return new bff0(a860.e("FF353535"), a860.e("FF565656"), a860.e("FFFFFFFF"), a860.e("FFCDCDCD"), a860.e("FF1ED760"), true);
    }

    public static final Method z(Class cls, String str, Class... clsArr) {
        if (!dhn.a.contains(c680.class)) {
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th) {
                dhn.a(c680.class, th);
            }
        }
        return null;
    }
}
