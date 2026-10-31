package p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Shader;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.graphics.Shadow;
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
import defpackage.m;
import io.reactivex.rxjava3.core.Observable;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class oon1 {
    public static final Object b = new Object();
    public static b180 c;
    public final /* synthetic */ byte a = 9;

    public static void A(String str) {
        synchronized (b) {
            n(str, null);
        }
    }

    public static final uvx B(b0k b0kVar) {
        ogx ogxVar = ogx.e;
        uwr uwrVar = cbx.a;
        cua cuaVar = cbx.b(b0kVar).f;
        return new uvx(1, ogxVar, 3, (vzq0) null, (zzq0) null, (tvx) null, er31.b(8.0f), 0, (p3v) null, 440);
    }

    public static ArrayList C(List list) {
        int size = list != null ? list.size() : 0;
        rr80 rr80VarO = yoi1.O(yoi1.Q(0, size), 3);
        ArrayList arrayList = new ArrayList(q7h.U(rr80VarO, 10));
        lr80 it = rr80VarO.iterator();
        while (((sr80) it).c) {
            int iNextInt = it.nextInt();
            int i = iNextInt + 3;
            if (i > size) {
                i = size;
            }
            arrayList.add(yoi1.Q(iNextInt, i));
        }
        return arrayList;
    }

    public static final Shader.TileMode D(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3) {
            return Build.VERSION.SDK_INT >= 31 ? mb4.r() : Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final yh10 E(umx0 umx0Var) {
        return new yh10(umx0Var.a, umx0Var.e, (String) null, new ugo0(false, umx0Var.d, umx0Var.r, false, false, (String) null, umx0Var.v, 237), 20);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0115  */
    /* JADX WARN: Code duplicated, block: B:54:0x0127  */
    /* JADX WARN: Code duplicated, block: B:57:0x012f  */
    public static final umx0 F(tmx0 tmx0Var, fa10 fa10Var) {
        List list;
        mgo0 mgo0VarC;
        boolean z;
        boolean z2;
        Set set;
        int i = tmx0Var.e;
        if (fa10Var == null) {
            return new umx0("", "", tmx0Var.c, "", "", "", (String) null, (String) null, (Long) null, (String) null, (String) null, z6x.a, (String) null, (String) null, false, false, false, (String) null, (x360) null, true, true, (mgo0) null);
        }
        pnx0 pnx0Var = fa10Var.a;
        String str = pnx0Var.j;
        w281 w281Var = fa10Var.b;
        e6p1 e6p1Var = w281Var != null ? w281Var.a : null;
        alm almVar = fa10Var.c;
        String str2 = pnx0Var.c;
        Long l = pnx0Var.g;
        boolean z3 = u890.j(str, almVar.a) || u890.j(str, almVar.b);
        boolean z4 = z3 && almVar.c;
        String str3 = pnx0Var.a;
        String str4 = pnx0Var.b;
        String str5 = tmx0Var.c;
        String str6 = pnx0Var.c;
        String str7 = pnx0Var.d;
        String str8 = pnx0Var.e;
        String strY0 = o7h.y0(pnx0Var.f, " • ", (String) null, (String) null, ilx0.Z0, 30);
        String str9 = l != null ? new SimpleDateFormat("dd MMM", Locale.getDefault()).format(Long.valueOf(l.longValue())) : null;
        Long l2 = pnx0Var.g;
        String str10 = (!ihc1.h0(str2, "prerelease", false) || l == null) ? null : new SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault()).format(l);
        String str11 = pnx0Var.h;
        List list2 = pnx0Var.i;
        String str12 = pnx0Var.j;
        String str13 = pnx0Var.k;
        ijo ijoVar = fa10Var.d;
        if (ijoVar != null && (set = ijoVar.a) != null) {
            list = list2;
            boolean z5 = set.contains(str12);
            String str14 = tmx0Var.c;
            if (tmx0Var.f || i == 3) {
                mgo0VarC = null;
            } else {
                String str15 = fa10Var.g;
                if (str15 == null) {
                    str15 = "";
                }
                mgo0VarC = wgo1.C(new sgo0(str15, fa10Var.e, fa10Var.f), str2, pnx0Var.d);
            }
            x360 x360Var = tmx0Var.a;
            if (!(e6p1Var instanceof l281) || (e6p1Var instanceof n281)) {
                z = false;
            } else {
                z = true;
            }
            if (ihc1.y0(str2) && i != 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new umx0(str3, str4, str5, str6, str7, str8, strY0, str9, l2, str10, str11, list, str12, str13, z4, z3, z5, str14, x360Var, z, z2, mgo0VarC);
        }
        list = list2;
        String str16 = tmx0Var.c;
        if (tmx0Var.f) {
            mgo0VarC = null;
        } else {
            mgo0VarC = null;
        }
        x360 x360Var2 = tmx0Var.a;
        if (e6p1Var instanceof l281) {
            z = false;
        } else {
            z = false;
        }
        if (ihc1.y0(str2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        return new umx0(str3, str4, str5, str6, str7, str8, strY0, str9, l2, str10, str11, list, str12, str13, z4, z3, z5, str16, x360Var2, z, z2, mgo0VarC);
    }

    public static void H(String str) {
        synchronized (b) {
            n(str, null);
        }
    }

    public static void I(String str, Throwable th) {
        synchronized (b) {
            n(str, th);
        }
    }

    public static final void a(c380 c380Var, rfv0 rfv0Var, iu30 iu30Var, lee1 lee1Var, lee1 lee1Var2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(94672458);
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.i(rfv0Var) ? 32 : 16) | (x340Var.g(lee1Var) ? 2048 : 1024) | (x340Var.g(lee1Var2) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            boolean zI = ((i2 & 14) == 4) | x340Var.i(rfv0Var) | ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                m mVar = new m((Object) c380Var, (Object) iu30Var, (Object) rfv0Var, (Object) lee1Var, (Object) lee1Var2, (byte) 21);
                x340Var.s0(mVar);
                objT = mVar;
            }
            qim0 qim0Var3 = nim0.a;
            ejo1.l(6, 0, x340Var, (vu30) objT, qim0Var3);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new twc(c380Var, rfv0Var, iu30Var, lee1Var, lee1Var2, qim0Var2, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(n4z n4zVar, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1009595695);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(n4zVar) : x340Var.i(n4zVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var.i0(-441137033);
            a4z a4zVar = new a4z(cwl1.o0(x340Var, 2131952850), cwl1.o0(x340Var, 2131952849), cwl1.o0(x340Var, 2131952845), cwl1.o0(x340Var, 2131952851), cwl1.o0(x340Var, 2131952848), cwl1.o0(x340Var, 2131952847), cwl1.o0(x340Var, 2131952846));
            x340Var.r(false);
            if (n4zVar.equals(l4z.a)) {
                x340Var.i0(-441110516);
                h(a4zVar, qim0Var, x340Var, (i3 >> 6) & 112);
                x340Var.r(false);
            } else if (n4zVar instanceof i4z) {
                x340Var.i0(-441106757);
                c(a4zVar, function0, qim0Var, x340Var, ((i3 >> 3) & 896) | (i3 & 112));
                x340Var.r(false);
            } else if (n4zVar.equals(k4z.a)) {
                x340Var.i0(-441102520);
                f(a4zVar, function1, qim0Var, x340Var, (i3 >> 3) & 1008);
                x340Var.r(false);
            } else {
                if (!n4zVar.equals(j4z.a) && !n4zVar.equals(m4z.a)) {
                    throw p3d1.k(x340Var, -441112335, false);
                }
                x340Var.i0(-441096653);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, n4zVar, function0, function1, qim0Var, (byte) 21);
        }
    }

    public static final void c(a4z a4zVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1219112029);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(a4zVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            ye5 ye5VarO = kk0.o(959417835, b0kVar3);
            String str = a4zVar.d;
            uwr uwrVar = cbx.a;
            zma1 zma1Var = new zma1(cbx.a(b0kVar3).b.c, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530);
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new xet(function0, (byte) 8);
                b0kVar3.s0(objT);
            }
            vhg.a(ye5VarO, str, "episode_generation_indicator_retry", zma1Var, (iu30) objT);
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("episode_generation_indicator", qim0Var), B(b0kVar3), null, false, null, null, null, null, null, null, null, null, null, apo.r(-1431218775, new pf1(ye5VarO.p(), (byte) 5), b0kVar3), null, apo.r(1991337959, new y3z(a4zVar, (byte) 0), b0kVar3), b0kVar2, 64, 199680, 24572);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new z3z(a4zVar, function0, qim0Var, i, (byte) 0);
        }
    }

    public static final void d(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        iu30 iu30Var2;
        byte b2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-348208767);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("GranularRatingsButton", uyn1.B(qim0Var3, 16.0f, 0.0f, 16.0f, 0.0f, 10));
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(i1p1.q(qim0VarN, er31.b(8.0f)), cbx.a(x340Var).a.a.a(), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            era eraVar = een.Q0;
            cvx cvxVar3 = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
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
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new g850(iu30Var, (byte) 6);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = bin.x(qim0VarF3, false, null, null, null, (Function0) objT2, 15);
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarX, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            jw31 jw31VarA = ew31.a(h36.e, een.Z, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            uwo1.e(cwl1.o0(x340Var, 2131956462), null, cbx.d(x340Var).j, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
            x340Var.r(true);
            int iS = err0Var.s();
            b2 = 4;
            boolean zI = x340Var.i(err0Var) | (i3 == 4);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                iu30Var2 = iu30Var;
                objT3 = new rj0(iu30Var2, err0Var, (byte) 1);
                x340Var.s0(objT3);
            } else {
                iu30Var2 = iu30Var;
            }
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0Var2 = qim0Var3;
            ozn1.j(iS, (iu30) objT3, uyn1.B(qim0Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), 0.0f, x340Var, 0, 8);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            iu30Var2 = iu30Var;
            b2 = 4;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l52(iu30Var2, qim0Var2, i, b2);
        }
    }

    public static final void e(xag0 xag0Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, Function0 function2, lzn0 lzn0Var, nwa nwaVar, ezc ezcVar, ezc ezcVar2, boolean z, boolean z2, qim0 qim0Var, boolean z3, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        byte b2;
        byte b3;
        byte b4;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-2079474314);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(xag0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(iu30Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar2.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar2.i(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar2.i(lzn0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar2.i(nwaVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= b0kVar2.i(ezcVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= b0kVar2.i(ezcVar2) ? 536870912 : 268435456;
        }
        int i3 = (b0kVar2.h(z) ? (char) 4 : (char) 2) | (b0kVar2.h(z2) ? ' ' : (char) 16) | 384 | (b0kVar2.h(z3) ? (char) 2048 : (char) 1024);
        if (b0kVar2.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 1171) == 1170) ? false : true)) {
            Boolean bool = Boolean.FALSE;
            ven0 ven0VarG = rwq.g(ezcVar, bool, null, b0kVar2, ((i2 >> 24) & 14) | 48, 2);
            ven0 ven0VarG2 = rwq.g(ezcVar2, bool, null, b0kVar2, ((i2 >> 27) & 14) | 48, 2);
            Object objT = b0kVar2.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new lb9();
                b0kVar2.s0(objT);
            }
            lb9 lb9Var = (lb9) objT;
            Object objT2 = b0kVar2.T();
            if (objT2 == obj) {
                objT2 = new ti51();
                b0kVar2.s0(objT2);
            }
            ti51 ti51Var = (ti51) objT2;
            Object objT3 = b0kVar2.T();
            if (objT3 == obj) {
                objT3 = new kjn0(lzn0Var);
                b0kVar2.s0(objT3);
            }
            kjn0 kjn0Var = (kjn0) objT3;
            Object objT4 = b0kVar2.T();
            if (objT4 == obj) {
                objT4 = new j6r(nwaVar, lzn0Var);
                b0kVar2.s0(objT4);
            }
            j6r j6rVar = (j6r) objT4;
            Object objT5 = b0kVar2.T();
            if (objT5 == obj) {
                objT5 = new fx();
                b0kVar2.s0(objT5);
            }
            fx fxVar = (fx) objT5;
            boolean z4 = (i2 & 112) == 32;
            Object objT6 = b0kVar2.T();
            if (z4 || objT6 == obj) {
                objT6 = new tr00(iu30Var);
                b0kVar2.s0(objT6);
            }
            tr00 tr00Var = (tr00) objT6;
            boolean z5 = (i2 & 896) == 256;
            Object objT7 = b0kVar2.T();
            if (z5 || objT7 == obj) {
                objT7 = new mij1(iu30Var2);
                b0kVar2.s0(objT7);
            }
            mij1 mij1Var = (mij1) objT7;
            Object objT8 = b0kVar2.T();
            if (objT8 == obj) {
                objT8 = new oyr0(lzn0Var);
                b0kVar2.s0(objT8);
            }
            oyr0 oyr0Var = (oyr0) objT8;
            boolean zG = b0kVar2.g(lzn0Var) | ((i3 & 7168) == 2048);
            Object objT9 = b0kVar2.T();
            if (zG || objT9 == obj) {
                objT9 = new g2f0(lzn0Var, z3);
                b0kVar2.s0(objT9);
            }
            g2f0 g2f0Var = (g2f0) objT9;
            Object objT10 = b0kVar2.T();
            if (objT10 == obj) {
                objT10 = new a81(lzn0Var);
                b0kVar2.s0(objT10);
            }
            a81 a81Var = (a81) objT10;
            Object objT11 = b0kVar2.T();
            if (objT11 == obj) {
                objT11 = new o921(lzn0Var);
                b0kVar2.s0(objT11);
            }
            o921 o921Var = (o921) objT11;
            g431 g431VarH = ((cir0) b0kVar2.k(k2r0.a)).h();
            Object objT12 = b0kVar2.T();
            if (objT12 == obj) {
                b2 = 0;
                objT12 = g431VarH.a(iwe.c, new v9g0(function1, (byte) 0));
                b0kVar2.s0(objT12);
            } else {
                b2 = 0;
            }
            b431 b431Var = (b431) objT12;
            Object objT13 = b0kVar2.T();
            if (objT13 == obj) {
                b3 = 1;
                objT13 = g431VarH.a(uj1.x, new v9g0(function2, (byte) 1));
                b0kVar2.s0(objT13);
            } else {
                b3 = 1;
            }
            b431 b431Var2 = (b431) objT13;
            Object objT14 = b0kVar2.T();
            if (objT14 == obj) {
                objT14 = new ca50(new u9g0(b431Var2, b3));
                b0kVar2.s0(objT14);
            }
            ca50 ca50Var = (ca50) objT14;
            Object objT15 = b0kVar2.T();
            if (objT15 == obj) {
                b4 = 2;
                objT15 = new fa50(new u9g0(b431Var2, (byte) 2));
                b0kVar2.s0(objT15);
            } else {
                b4 = 2;
            }
            fa50 fa50Var = (fa50) objT15;
            Object objT16 = b0kVar2.T();
            if (objT16 == obj) {
                objT16 = new lfs0(lzn0Var);
                b0kVar2.s0(objT16);
            }
            lfs0 lfs0Var = (lfs0) objT16;
            Object objT17 = b0kVar2.T();
            if (objT17 == obj) {
                objT17 = new k6t(new u9g0(b431Var, b2));
                b0kVar2.s0(objT17);
            }
            k6t k6tVar = (k6t) objT17;
            Integer num = xag0Var.d;
            long jE = num != null ? z4p1.e(num.intValue() | (-16777216)) : u7h.j;
            k2t0 k2t0VarV = kkn.v(ti5.g(b0kVar2), b0kVar2);
            xtb0 xtb0VarA = aub0.a(b2, b0kVar2, 3);
            Object objT18 = b0kVar2.T();
            if (objT18 == obj) {
                objT18 = yv91.a(new nxb0(xtb0VarA, b4));
                b0kVar2.s0(objT18);
            }
            tob1 tob1Var = (tob1) objT18;
            Object objT19 = b0kVar2.T();
            if (objT19 == obj) {
                objT19 = yv91.a(new nxb0(xtb0VarA, (byte) 4));
                b0kVar2.s0(objT19);
            }
            tob1 tob1Var2 = (tob1) objT19;
            Object objT20 = b0kVar2.T();
            if (objT20 == obj) {
                objT20 = yv91.a(new nxb0(xtb0VarA, (byte) 3));
                b0kVar2.s0(objT20);
            }
            tob1 tob1Var3 = (tob1) objT20;
            wat watVar = (wat) b0kVar2.k(t4k.h);
            int iIntValue = ((Number) tob1Var.getValue()).intValue();
            float fMax = 1.0f;
            if (iIntValue <= 0 && !((Boolean) tob1Var3.getValue()).booleanValue()) {
                fMax = Math.max(0.0f, Math.min(1.0f, (((Number) tob1Var2.getValue()).intValue() - 200.0f) / 150.0f));
            }
            float f = fMax;
            j2t0 j2t0Var = k2t0VarV.c;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarL = bmq0.L(qim0Var3, j2t0Var, (g6o0) null);
            WeakHashMap weakHashMap = osl1.x;
            bgc0 bgc0Var = new bgc0(lhc.g(b0kVar2).g, 32);
            long j = jE;
            j2i j2iVarR = apo.r(874271651, new r9g0(j, f, k2t0VarV, (Object) xag0Var, function0, (byte) 0), b0kVar2);
            t9g0 t9g0Var = new t9g0(watVar, xtb0VarA, xag0Var, j, g2f0Var, z2, ven0VarG2, z, tr00Var, mij1Var, ven0VarG, lb9Var, ca50Var, ti51Var, lfs0Var, fa50Var, oyr0Var, kjn0Var, j6rVar, fxVar, a81Var, o921Var, k6tVar);
            b0kVar2 = b0kVar2;
            irn1.u(qim0VarL, j2iVarR, null, bgc0Var, apo.r(-1535561059, t9g0Var, b0kVar2), b0kVar2, 24624, 4);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kje0(xag0Var, iu30Var, iu30Var2, function0, function1, function2, lzn0Var, nwaVar, ezcVar, ezcVar2, z, z2, qim0Var2, z3, i);
        }
    }

    public static final void f(a4z a4zVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(678804323);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(a4zVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            ye5 ye5VarO = kk0.o(-504068261, b0kVar3);
            String str = a4zVar.g;
            uwr uwrVar = cbx.a;
            zma1 zma1Var = new zma1(cbx.a(b0kVar3).b.c, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530);
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new xet(function0, (byte) 10);
                b0kVar3.s0(objT);
            }
            vhg.a(ye5VarO, str, "episode_generation_indicator_get_credits", zma1Var, (iu30) objT);
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("episode_generation_indicator", qim0Var), B(b0kVar3), null, false, null, null, null, null, null, null, null, apo.r(839571099, new y3z(a4zVar, (byte) 1), b0kVar3), null, apo.r(-296373347, new cex(function0, ye5VarO.p(), (byte) 5), b0kVar3), null, apo.r(-1432317793, new y3z(a4zVar, (byte) 2), b0kVar3), b0kVar2, 64, 199728, 22524);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new z3z(a4zVar, function0, qim0Var, i, (byte) 1);
        }
    }

    public static final void g(hux huxVar, long j, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1730307417);
        int i2 = i | ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarR = u291.r(nim0.a, 16.0f);
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new izg1(function0, (byte) 15);
                x340Var.s0(objT);
            }
            w0h1.a(huxVar, isl.a, i541.C(qim0VarR, (iu30) objT), j, 0L, false, x340Var, (i2 & 14) | 56 | ((i2 << 6) & 7168), 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new md60((Parcelable) huxVar, j, (Object) function0, i, (byte) 3);
        }
    }

    public static final void h(a4z a4zVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1580439719);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(a4zVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("episode_generation_indicator", qim0Var), B(b0kVar3), null, false, null, null, null, null, null, null, null, apo.r(-1891021535, new y3z(a4zVar, (byte) 3), b0kVar3), rmi.a, null, null, apo.r(-1586659683, new y3z(a4zVar, (byte) 4), b0kVar3), b0kVar2, 64, 197040, 26620);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new say(a4zVar, qim0Var, i, (byte) 3);
        }
    }

    public static final void i(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2 = qim0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2060296968);
        int i2 = i | (x340Var.i(qim0Var2) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            List listM = p7h.M(new String[]{cwl1.o0(x340Var, 2131963247), cwl1.o0(x340Var, 2131963245), cwl1.o0(x340Var, 2131963244), cwl1.o0(x340Var, 2131963243), cwl1.o0(x340Var, 2131963246)});
            Iterator it = listM.iterator();
            if (!it.hasNext()) {
                hhg1.k();
                return;
            }
            Object next = it.next();
            if (it.hasNext()) {
                int length = ((String) next).length();
                while (true) {
                    Object next2 = it.next();
                    int length2 = ((String) next2).length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                    if (!it.hasNext()) {
                        break;
                    } else {
                        qim0Var2 = qim0Var;
                    }
                }
            }
            String str = (String) next;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT;
            boolean zI = x340Var.i(err0Var) | x340Var.g(listM);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new xby0(listM, err0Var, (lnm) null, (byte) 1);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            uwr uwrVar = cbx.a;
            uwo1.e(str, d9y0.k(nim0.a, 0.0f), cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            eth.a(Integer.valueOf(err0Var.s()), (qim0) null, irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, null, 6), "generating-description", apo.r(-304617732, new xhf(listM, (byte) 6), x340Var), x340Var, 27648, 2);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 8);
        }
    }

    public static final void j(cxc0 cxc0Var, boolean z, String str, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-185526065);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(cxc0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(function0) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Map map = cxc0Var.f.q;
            String str2 = (String) map.get("geoname_id");
            String str3 = (String) map.get("description");
            if (str3 == null) {
                str3 = "";
            }
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            ven0 ven0VarS = v8r.s(function0, x340Var2);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = i2 & 112;
            boolean zI = x340Var2.i(ven0Var) | (i3 == 32);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new wsh(z, ven0Var, (lnm) null, (byte) 6);
                x340Var2.s0(objT2);
            }
            qxd0.t(boolValueOf, x340Var2, (vu30) objT2);
            if (z && ((Boolean) ven0Var.getValue()).booleanValue() && str != null && u890.j(str2, str)) {
                x340Var2.i0(616604295);
                boolean zI2 = x340Var2.i(ven0VarS);
                Object objT3 = x340Var2.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new aya1(ven0VarS, (byte) 15);
                    x340Var2.s0(objT3);
                }
                qxd0.S((Function0) objT3, x340Var2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(616646579);
                x340Var2.r(false);
            }
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean zI3 = x340Var2.i(ven0VarS) | (i3 == 32);
            Object objT4 = x340Var2.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new wsh(z, ven0VarS, (lnm) null, (byte) 7);
                x340Var2.s0(objT4);
            }
            qxd0.t(boolValueOf2, x340Var2, (vu30) objT4);
            qim0 qim0VarN = anm1.N("TrendingNearYou.Description", nim0.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarY = uyn1.y(qim0VarN, 16.0f, 8.0f);
            if (z) {
                x340Var2.i0(617002273);
                i(qim0VarY, x340Var2, 0);
                x340Var2.r(false);
                x340Var = x340Var2;
            } else {
                x340Var2.i0(617067032);
                uwo1.e(str3, qim0VarY, cbx.d(x340Var2).g, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                x340Var = x340Var2;
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h8i0((byte) 12, i, cxc0Var, str, function0, z);
        }
    }

    public static final void k(vu30 vu30Var, tob1 tob1Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1031560677);
        int i2 = i | (x340Var.i(vu30Var) ? 4 : 2) | (x340Var.g(tob1Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarR = zod.R(new hsi1("placesNudgeArrows", Float.valueOf(0.0f), Float.valueOf(1.0f), irn1.Y(irn1.o0(1400, 0, mlv.d, 2), 0, -2300L, 2), rno1.a), z, (Function0) null, x340Var, ((((i2 >> 6) & 14) << 3) & 112) | 8, 4);
            float fX0 = ((wat) x340Var.k(t4k.h)).X0(sdm1.h);
            if (x340Var.k(t4k.n) == flb0.b) {
                fX0 = -fX0;
            }
            float f = -fX0;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, qim0VarF);
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new eyg1(tob1Var, (byte) 18);
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0VarZ, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            gfx.b(18, apo.r(733789142, new c3c(f, ven0VarR, vu30Var, fX0), x340Var), x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zp51(vu30Var, tob1Var, z, qim0Var, i);
        }
    }

    public static final String l(String str) {
        return ihc1.h0(str, "?", false) ? str.concat("&early_access=true") : str.concat("?early_access=true");
    }

    public static final String m(lik1 lik1Var) {
        if (ihc1.h0(lik1Var.a, "?", false)) {
            return lik1Var + "&early_access=true";
        }
        return lik1Var + "?early_access=true";
    }

    public static void n(String str, Throwable th) {
        String strReplace;
        String str2;
        if (th == null) {
            str2 = null;
        } else {
            synchronized (b) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            str2 = strReplace;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        str2.replace("\n", "\n  ");
    }

    public static final float o(float f, float f2) {
        float f3 = (f * 1400.0f) - f2;
        if (f3 < 0.0f || f3 >= 400.0f) {
            return 0.0f;
        }
        float f4 = f3 % 200.0f;
        if (f4 != 0.0f && Math.signum(f4) != Math.signum(200.0f)) {
            f4 += 200.0f;
        }
        float f5 = f4 / 100.0f;
        return f5 <= 1.0f ? f5 : 2.0f - f5;
    }

    public static final boolean q(s4b1 s4b1Var) {
        return u890.j(s4b1Var.n("early_access"), "true");
    }

    public static String r(String str) {
        if (ihc1.h0(str, "open.spotify.com", false)) {
            return str;
        }
        if (!nhc1.Y(str, "spotify", false)) {
            str = "spotify:".concat(str);
        }
        if (ihc1.h0(str, "://", false)) {
            str = f4i1.f(str.substring(0, ihc1.w0(str, "://", 0, false, 6)), "/", str.substring(ihc1.w0(str, "://", 0, false, 6) + 3));
        }
        return ihc1.h0(str, "/", false) ? cy30.o("/", str, ":") : str;
    }

    public static void s(String str) {
        synchronized (b) {
            n(str, null);
        }
    }

    public static void t(String str, Exception exc) {
        synchronized (b) {
            n(str, exc);
        }
    }

    public static final void u(Animator animator) {
        if (animator instanceof AnimatorSet) {
            for (Animator animator2 : ((AnimatorSet) animator).getChildAnimations()) {
                animator2.getClass();
                u(animator2);
            }
        }
        animator.removeAllListeners();
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).removeAllUpdateListeners();
        }
        animator.cancel();
    }

    public static void v(String str) {
        synchronized (b) {
            n(str, null);
        }
    }

    public static void w(String str, Throwable th) {
        synchronized (b) {
            n(str, th);
        }
    }

    public static final Observable x(uu00 uu00Var, String str, String str2) {
        return ((zu00) uu00Var).b(new oi(str, false, new kak(str2, (byte) 12))).takeUntil(p9w.T0).map(new ljp1(str2, (byte) 6)).onErrorReturnItem(new mtl()).distinctUntilChanged();
    }

    public static String y(Context context, int i) {
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static final b180 z() {
        b180 b180Var = c;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.Home24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarG = lf51.g(12.5f, 3.247f);
        cwh0VarG.c(1.0f, 1.0f, false, false, -1.0f, 0.0f);
        cwh0VarG.j(4.0f, 7.577f);
        rjx.B(cwh0VarG, 4.0f, 20.0f, 4.5f, -6.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        cwh0VarG.i(5.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        cwh0VarG.v(6.0f);
        ydh.k(cwh0VarG, 20.0f, 20.0f, 20.0f, 7.577f);
        cwh0VarG.l(10.5f, 1.515f);
        cwh0VarG.c(3.0f, 3.0f, false, true, 3.0f, 0.0f);
        cwh0VarG.k(7.5f, 4.33f);
        cwh0VarG.c(2.0f, 2.0f, false, true, 1.0f, 1.732f);
        cwh0VarG.j(22.0f, 21.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        cwh0VarG.i(-6.5f);
        cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        cwh0VarG.v(-6.0f);
        cwh0VarG.i(-3.0f);
        cwh0VarG.v(6.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, 1.0f);
        cwh0VarG.j(3.0f, 22.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, -1.0f, -1.0f);
        cwh0VarG.j(2.0f, 7.577f);
        cwh0VarG.c(2.0f, 2.0f, false, true, 1.0f, -1.732f);
        cwh0VarG.e();
        a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        c = b180VarB;
        return b180VarB;
    }

    public abstract String p();

    public String toString() {
        switch (this.a) {
            case 9:
                return p();
            default:
                return super.toString();
        }
    }
}
