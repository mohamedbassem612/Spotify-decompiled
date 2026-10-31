package p;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kna extends hab0 implements xu30 {
    public static final kna N0;
    public static final kna O0;
    public static final kna P0;
    public static final kna Q0;
    public static final kna R0;
    public static final kna S0;
    public static final kna T0;
    public static final kna U0;
    public static final kna V0;
    public static final kna W0;
    public static final kna X;
    public static final kna X0;
    public static final kna Y;
    public static final kna Y0;
    public static final kna Z;
    public static final kna Z0;
    public static final kna a1;
    public static final kna b;
    public static final kna b1;
    public static final kna c;
    public static final kna c1;
    public static final kna d;
    public static final kna d1;
    public static final kna e;
    public static final kna e1;
    public static final kna f;
    public static final kna g;
    public static final kna h;
    public static final kna i;
    public static final kna t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 3;
        b = new kna(i2, (byte) 0);
        c = new kna(i2, (byte) 1);
        d = new kna(i2, (byte) 2);
        e = new kna(i2, (byte) 3);
        f = new kna(i2, (byte) 4);
        g = new kna(i2, (byte) 5);
        h = new kna(i2, (byte) 6);
        i = new kna(i2, (byte) 7);
        t = new kna(i2, (byte) 8);
        X = new kna(i2, (byte) 9);
        Y = new kna(i2, (byte) 10);
        Z = new kna(i2, (byte) 11);
        N0 = new kna(i2, (byte) 12);
        O0 = new kna(i2, (byte) 13);
        P0 = new kna(i2, (byte) 14);
        Q0 = new kna(i2, (byte) 15);
        R0 = new kna(i2, (byte) 16);
        S0 = new kna(i2, (byte) 17);
        T0 = new kna(i2, (byte) 18);
        U0 = new kna(i2, (byte) 19);
        V0 = new kna(i2, (byte) 20);
        W0 = new kna(i2, (byte) 21);
        X0 = new kna(i2, (byte) 22);
        Y0 = new kna(i2, (byte) 23);
        Z0 = new kna(i2, (byte) 24);
        a1 = new kna(i2, (byte) 25);
        b1 = new kna(i2, (byte) 26);
        c1 = new kna(i2, (byte) 27);
        d1 = new kna(i2, (byte) 28);
        e1 = new kna(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kna(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0454 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0456  */
    /* JADX WARN: Code duplicated, block: B:119:0x0459  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mq70 mq70Var;
        up70 up70VarA;
        String str;
        String str2;
        tv80 tv80Var;
        tv80 tv80Var2;
        mq70 mq70Var2;
        up70 up70VarA2;
        byte b2 = this.a;
        List list = z6x.a;
        vp70 vp70Var = vp70.c;
        n4k n4kVar = hmb0.t1;
        Map map = b7x.a;
        nim0 nim0Var = nim0.a;
        tv80 tv80Var3 = null;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new njt0((i3i0) obj, (xcu0) obj2, (n900) obj3);
            case 1:
                double dN = yoi1.n(((Number) obj).doubleValue(), 0.0d, 1.0d);
                if (dN < 1.0E-6d) {
                    dN = 1.0E-6d;
                }
                double dPow = Math.pow(10.0d, yoi1.n(Math.log10(dN) * 20.0d, -40.0d, 0.0d) / 20.0d);
                double d2 = ara.a;
                return Double.valueOf((dPow - d2) / (1.0d - d2));
            case 2:
                hsl1 hsl1Var = (hsl1) obj2;
                uc80 uc80Var = (uc80) obj3;
                ((View) obj).setPadding(uc80Var.a, uc80Var.b, uc80Var.c, uc80Var.d + hsl1Var.a.i(519).d);
                return hsl1Var;
            case 3:
                hsl1 hsl1Var2 = (hsl1) obj2;
                uc80 uc80Var2 = (uc80) obj3;
                ((View) obj).setPadding(uc80Var2.a, uc80Var2.b, uc80Var2.c, uc80Var2.d + hsl1Var2.a.i(519).d);
                return hsl1Var2;
            case 4:
                return ((ifh0) obj).S(0, ((afh0) obj2).H(((hjl) obj3).a).b, map, jpc.O0);
            case 5:
                return xyn1.r(16, (r6h1) obj3);
            case 6:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                zei1 zei1Var = (zei1) obj3;
                return new i1e(jo70Var != null ? jo70Var.a : null, (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70Var)) == null) ? null : up70VarA.a.a, zei1Var != null ? zei1Var.f : null);
            case 7:
                hsl1 hsl1Var3 = (hsl1) obj2;
                uc80 uc80Var3 = (uc80) obj3;
                ((View) obj).setPadding(uc80Var3.a, uc80Var3.b, uc80Var3.c, uc80Var3.d + hsl1Var3.a.i(519).d);
                return hsl1Var3;
            case 8:
                hsl1 hsl1Var4 = (hsl1) obj2;
                uc80 uc80Var4 = (uc80) obj3;
                ((View) obj).setPadding(uc80Var4.a, uc80Var4.b, uc80Var4.c, uc80Var4.d + hsl1Var4.a.i(519).d);
                return hsl1Var4;
            case 9:
                tqw tqwVar = (tqw) obj3;
                ((zse) obj).c.invoke(((yse) obj2).a, tqwVar != null ? n3o1.y(tqwVar) : null);
                return rih1Var;
            case 10:
                f4f f4fVar = (f4f) obj;
                if (((e4f) obj2).equals(e4f.a)) {
                    f4fVar.a.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 11:
                q5t0 q5t0VarH = ((afh0) obj2).H(((hjl) obj3).a);
                return ((ifh0) obj).S(q5t0VarH.a, 0, map, new f2(q5t0VarH, (byte) 9));
            case 12:
                jo70 jo70Var2 = (jo70) obj;
                dxc0 dxc0Var = (dxc0) obj2;
                qxc0 qxc0Var = (qxc0) obj3;
                Map map2 = qxc0Var != null ? qxc0Var.X : null;
                if (map2 == null) {
                    map2 = map;
                }
                String str3 = jo70Var2 != null ? jo70Var2.a : null;
                if (qxc0Var != null && (str2 = qxc0Var.a) != null) {
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str = str2;
                    } else if (dxc0Var != null) {
                        str2 = dxc0Var.a;
                        str = str2;
                    } else {
                        str = null;
                    }
                } else if (dxc0Var != null) {
                    str2 = dxc0Var.a;
                    str = str2;
                } else {
                    str = null;
                }
                Set set = xsf.a;
                Map map3 = dxc0Var != null ? dxc0Var.i : null;
                if (map3 != null) {
                    map = map3;
                }
                LinkedHashMap linkedHashMapO = sqg0.O(map, map2);
                List list2 = qxc0Var != null ? qxc0Var.N0 : null;
                List list3 = list2 == null ? list : list2;
                List list4 = qxc0Var != null ? qxc0Var.Z : null;
                List list5 = list4 == null ? list : list4;
                if (qxc0Var == null || (tv80Var2 = qxc0Var.e) == null) {
                    tv80Var = dxc0Var != null ? dxc0Var.g : null;
                } else {
                    tv80Var = tv80Var2;
                }
                return new q9f(str3, str, linkedHashMapO, list3, list5, tv80Var);
            case 13:
                long j = ((hjl) obj3).a;
                int iMin = Math.min(hjl.i(j), hjl.h(j));
                q5t0 q5t0VarH2 = ((afh0) obj2).H(jjl.b(0, iMin, 0, iMin, 5));
                return ((ifh0) obj).S(q5t0VarH2.a, q5t0VarH2.b, map, new wb5(q5t0VarH2, (int) (iMin * 0.125f), (byte) 5));
            case 14:
                View view = (View) obj;
                hsl1 hsl1Var5 = (hsl1) obj2;
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ((uc80) obj3).d + hsl1Var5.a.i(519).d);
                return hsl1Var5;
            case 15:
                jo70 jo70Var3 = (jo70) obj;
                xkk1 xkk1Var2 = (xkk1) obj2;
                List list6 = (List) obj3;
                if (list6 != null) {
                    list = list6;
                }
                return new nhh(list, jo70Var3, xkk1Var2);
            case 16:
                qim0 qim0VarJ = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-660096516);
                boolean zB = xoi1.b((Context) x340Var.k(AndroidCompositionLocals_androidKt.b));
                boolean z = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 2;
                if (zB || z) {
                    qim0VarJ = u291.j(0.0f, 240.0f, 1, qim0VarJ);
                }
                x340Var.r(false);
                return qim0VarJ;
            case 17:
                jo70 jo70Var4 = (jo70) obj;
                hll hllVar = (hll) obj2;
                xkk1 xkk1Var3 = (xkk1) obj3;
                String str4 = jo70Var4.a;
                String strY0 = o7h.y0(jo70Var4.d, ", ", (String) null, (String) null, bmh.d1, 30);
                if (xkk1Var3 != null && (mq70Var2 = xkk1Var3.a) != null && (up70VarA2 = mq70Var2.a(vp70Var)) != null) {
                    tv80Var3 = up70VarA2.a.a;
                }
                return new wsf1(str4, hllVar.b, strY0, tv80Var3);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.g, false);
                    int iHashCode = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM = x340Var3.m();
                    qim0 qim0VarE = zr7.E(x340Var3, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var3.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(gfh0VarC, x340Var3, y580.O0);
                    nko1.H(xos0VarM, x340Var3, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                    nko1.F(x340Var3);
                    nko1.H(qim0VarE, x340Var3, y580.Y);
                    k1u.a((qim0) null, 2, 0, (Function0) null, x340Var3, 48, 13);
                    x340Var3.r(true);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((Number) obj3).intValue();
                return rih1Var;
            case 20:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar, 2131951755), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2046);
                return rih1Var;
            case 21:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar2, 2131951756), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2046);
                return rih1Var;
            case 22:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar3, 2131951761), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2046);
                return rih1Var;
            case 23:
                ((Number) obj3).intValue();
                w0h1.a(rpx.c, isl.a, (qim0) null, 0L, 0L, false, (b0k) obj2, rpx.d | 48, 60);
                return rih1Var;
            case 24:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar4, 2131951760), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar4, 0, 0, 2046);
                return rih1Var;
            case 25:
                x340 x340Var4 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var5 = x340Var4;
                if (!x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var5.b0();
                }
                return rih1Var;
            case 26:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                plx plxVar = plx.c;
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar5).g;
                w0h1.a(plxVar, isl.a, u291.r(nim0Var, 24.0f), cbx.a(b0kVar5).b.b, 0L, false, b0kVar5, plx.d | 48, 48);
                return rih1Var;
            case 27:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                plx plxVar2 = plx.c;
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var2 = cbx.b(b0kVar6).g;
                w0h1.a(plxVar2, isl.a, u291.r(nim0Var, 24.0f), cbx.a(b0kVar6).b.b, 0L, false, b0kVar6, plx.d | 48, 48);
                return rih1Var;
            case 28:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strO0 = cwl1.o0(x340Var7, 2131951875);
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(strO0, (qim0) null, cbx.d(x340Var7).e, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var7, 0, 0, 2042);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            default:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var9.T);
                    xos0 xos0VarM2 = x340Var9.m();
                    qim0 qim0VarE2 = zr7.E(x340Var9, nim0Var);
                    hzj.A.getClass();
                    if (x340Var9.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var9.m0();
                    if (x340Var9.S) {
                        x340Var9.l(n4kVar);
                    } else {
                        x340Var9.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var9, y580.O0);
                    nko1.H(xos0VarM2, x340Var9, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var9, y580.R0);
                    nko1.F(x340Var9);
                    nko1.H(qim0VarE2, x340Var9, y580.Y);
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    uwr uwrVar4 = cbx.a;
                    t1c.a(dug.f(qim0VarD2, cbx.a(x340Var9).a.b.a(), er31.a), x340Var9, 0);
                    w0h1.a(hrx.c, isl.a, (qim0) null, cbx.a(x340Var9).b.b, 0L, false, x340Var9, hrx.d | 48, 52);
                    x340Var9.r(true);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
        }
    }
}
