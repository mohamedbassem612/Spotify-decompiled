package p;

import android.app.Activity;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pby0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pby0(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        String strN0 = null;
        byte b2 = 4;
        Object obj3 = this.d;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.c;
        Object obj5 = this.e;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                kby0 kby0Var = (kby0) obj4;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarD = u291.d(nim0.a, 1.0f);
                    xwa xwaVar = (xwa) obj3;
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
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
                    rzn1.a(kby0Var.h, (qim0) null, x340Var2, 0);
                    und.a(xwaVar, null, 0.0f, apo.r(-775012415, new y6w0(kby0Var, (byte) 20), x340Var2), x340Var2, 3072, 6);
                    x340Var2.r(true);
                    wkt wktVar = kby0Var.d;
                    boolean zG = x340Var2.g(kby0Var) | x340Var2.g((iu30) obj6) | x340Var2.g((xwa) obj3) | x340Var2.g((xwa) obj5);
                    iu30 iu30Var = (iu30) obj6;
                    xwa xwaVar2 = (xwa) obj3;
                    xwa xwaVar3 = (xwa) obj5;
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        ae1 ae1Var = new ae1(kby0Var, iu30Var, xwaVar2, xwaVar3, (lnm) null, (byte) 17);
                        x340Var2.s0(ae1Var);
                        objT = ae1Var;
                    }
                    qxd0.t(wktVar, x340Var2, (vu30) objT);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ((cm0) obj4).i((tcy0) obj3, (iu30) obj6, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                smo1.k((c380) obj4, (hmq) obj3, (iu30) obj6, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                aqo1.m((zzz0) obj4, (c101) obj3, (iu30) obj6, (iu30) obj5, (b0k) obj, czo1.p(3079));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((n0v0) obj4).d((ArrayList) obj3, (iu30) obj6, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                zc01.a((hwb) obj4, (hc01) obj3, (wux) obj5, (iu30) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                q7r0 q7r0Var = (q7r0) obj5;
                ll01 ll01Var = (ll01) obj3;
                m4c m4cVar = fkj0.X;
                iu30 iu30Var2 = (iu30) obj6;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    hl01 hl01Var = (hl01) obj4;
                    hl01Var.getClass();
                    i4m0 i4m0Var = ll01Var.g;
                    boolean zG2 = x340Var4.g(iu30Var2);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new j9z0(iu30Var2, (byte) 29);
                        x340Var4.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean zI = x340Var4.i(ll01Var) | x340Var4.i(q7r0Var);
                    Object objT3 = x340Var4.T();
                    if (zI || objT3 == m4cVar) {
                        objT3 = new zkz0(ll01Var, q7r0Var, (byte) 9);
                        x340Var4.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    boolean zG3 = x340Var4.g(iu30Var2);
                    Object objT4 = x340Var4.T();
                    if (zG3 || objT4 == m4cVar) {
                        objT4 = new n601(iu30Var2, (byte) 3);
                        x340Var4.s0(objT4);
                    }
                    iu30 iu30Var3 = (iu30) objT4;
                    boolean zG4 = x340Var4.g(iu30Var2);
                    Object objT5 = x340Var4.T();
                    if (zG4 || objT5 == m4cVar) {
                        objT5 = new n601(iu30Var2, (byte) 4);
                        x340Var4.s0(objT5);
                    }
                    iu30 iu30Var4 = (iu30) objT5;
                    boolean zG5 = x340Var4.g(iu30Var2);
                    Object objT6 = x340Var4.T();
                    if (zG5 || objT6 == m4cVar) {
                        objT6 = new iuy0(iu30Var2, b2);
                        x340Var4.s0(objT6);
                    }
                    guo1.r(hl01Var, i4m0Var, function0, function1, iu30Var3, iu30Var4, (vu30) objT6, ll01Var.d, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                h1p1.f((String) obj4, (rhq) obj6, (qim0) obj3, (Function0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                f2p1.i((dd11) obj4, (vu30) obj6, (qim0) obj3, (Set) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                g2p1.u((Function0) obj4, (vu30) obj6, (String) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                vd11.a((y7e1) obj4, (Function0) obj6, (qim0) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                g3p1.i((fob1) obj4, (iu30) obj6, (qim0) obj3, (j2i) obj5, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 12:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mod.b(oi7.a.a((gw70) obj4), apo.r(298595035, new st11((ComposeView) obj6, (tt11) obj3, (yt11) obj5), x340Var6), x340Var6, 56);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                u4p1.A((String) obj4, (rrt0) obj6, (n6u) obj3, (uu11) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qsw.c(new obk1((ComposeView) obj4), apo.r(-618698731, new t721((String) obj6, (String) obj3, (u721) obj5, (byte) 1), x340Var8), x340Var8, 48);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                ((yla) obj4).g((xi21) obj6, (y7e1) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                n9p1.f((ck21) obj4, (Function0) obj6, (Function0) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                wl21.a((yl21) obj4, (g341) obj6, (Function0) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                qtg.d((String) obj4, (vy71) obj6, (Function0) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                kpc kpcVar = (kpc) obj;
                kh31 kh31Var = (kh31) obj4;
                Activity activity = kh31Var.f;
                kpc.e(kpcVar, activity.getString(2131961344), new vvu0((d0r) obj6, (String) obj3, (List) obj5, kh31Var, (byte) 23), 4);
                String string = activity.getString(2131961343);
                oe31 oe31Var = oe31.W0;
                kpc.e(kpcVar, string, oe31Var, 6);
                kpc.e(kpcVar, activity.getString(2131961345), oe31Var, 6);
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                vz31.c((String) obj4, (n041) obj6, (lee1) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                bs51.b(czo1.p(1), (String) obj4, (String) obj6, (String) obj3, (Function0) obj5, (b0k) obj);
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ozn1.i((y7e1) obj4, (Function0) obj3, (iu30) obj6, (qim0) obj5, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 23:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ((fqg0) obj4).g.a(0, this.d, x340Var10, (ksw) obj5, (iu30) obj6);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ((ku70) obj4).g.a(0, this.d, x340Var12, (ksw) obj5, (iu30) obj6);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ((xpw) obj4).c().a(0, this.d, x340Var14, (ksw) obj5, (iu30) obj6);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                d4o1.e((y7e1) obj4, (String) obj3, (Function0) obj5, (iu30) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj2).intValue();
                a6o1.i(czo1.p(1), (String) obj4, (String) obj5, (b0k) obj, (iu30) obj6, (qim0) obj3);
                return rih1Var;
            case 28:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                up51 up51Var = (up51) obj4;
                iu30 iu30Var5 = (iu30) obj6;
                yp51 yp51Var = (yp51) obj5;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    String str = (String) obj3;
                    Long l = up51Var.i;
                    if (l == null || l.longValue() <= 0) {
                        l = null;
                    }
                    if (l == null) {
                        x340Var16.i0(-206704696);
                        x340Var16.r(false);
                    } else {
                        x340Var16.i0(-206704695);
                        long jLongValue = l.longValue();
                        xgc xgcVar = yp51Var.e;
                        Locale locale = new Locale(upn1.m());
                        xgcVar.getClass();
                        strN0 = cwl1.n0(2131958896, new Object[]{xgc.p(jLongValue, locale)}, x340Var16);
                        x340Var16.r(false);
                    }
                    String str2 = strN0;
                    boolean zG6 = x340Var16.g(iu30Var5);
                    Object objT7 = x340Var16.T();
                    if (zG6 || objT7 == fkj0.X) {
                        objT7 = new wg31(iu30Var5, (byte) 21);
                        x340Var16.s0(objT7);
                    }
                    wgo1.o(up51Var, str, str2, (Function0) objT7, apo.r(-2008429377, new xp51(yp51Var, up51Var), x340Var16), apo.r(-1957385762, new xp51(up51Var, yp51Var), x340Var16), x340Var16, 221184);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                wgo1.k((String) obj4, (String) obj6, (hy50) obj3, (j2i) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pby0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pby0(Object obj, Object obj2, Object obj3, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pby0(Object obj, Object obj2, iu30 iu30Var, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = iu30Var;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pby0(Object obj, Object obj2, iu30 iu30Var, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = iu30Var;
        this.e = obj3;
    }
}
