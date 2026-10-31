package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gsh extends hab0 implements vu30 {
    public static final gsh N0;
    public static final gsh O0;
    public static final gsh P0;
    public static final gsh Q0;
    public static final gsh R0;
    public static final gsh S0;
    public static final gsh T0;
    public static final gsh U0;
    public static final gsh V0;
    public static final gsh W0;
    public static final gsh X;
    public static final gsh X0;
    public static final gsh Y;
    public static final gsh Y0;
    public static final gsh Z;
    public static final gsh Z0;
    public static final gsh a1;
    public static final gsh b;
    public static final gsh b1;
    public static final gsh c;
    public static final gsh c1;
    public static final gsh d;
    public static final gsh d1;
    public static final gsh e;
    public static final gsh e1;
    public static final gsh f;
    public static final gsh g;
    public static final gsh h;
    public static final gsh i;
    public static final gsh t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new gsh(i2, (byte) 0);
        c = new gsh(i2, (byte) 1);
        d = new gsh(i2, (byte) 2);
        e = new gsh(i2, (byte) 3);
        f = new gsh(i2, (byte) 4);
        g = new gsh(i2, (byte) 5);
        h = new gsh(i2, (byte) 6);
        i = new gsh(i2, (byte) 7);
        t = new gsh(i2, (byte) 8);
        X = new gsh(i2, (byte) 9);
        Y = new gsh(i2, (byte) 10);
        Z = new gsh(i2, (byte) 11);
        N0 = new gsh(i2, (byte) 12);
        O0 = new gsh(i2, (byte) 13);
        P0 = new gsh(i2, (byte) 14);
        Q0 = new gsh(i2, (byte) 15);
        R0 = new gsh(i2, (byte) 16);
        S0 = new gsh(i2, (byte) 17);
        T0 = new gsh(i2, (byte) 18);
        U0 = new gsh(i2, (byte) 19);
        V0 = new gsh(i2, (byte) 20);
        W0 = new gsh(i2, (byte) 21);
        X0 = new gsh(i2, (byte) 22);
        Y0 = new gsh(i2, (byte) 23);
        Z0 = new gsh(i2, (byte) 24);
        a1 = new gsh(i2, (byte) 25);
        b1 = new gsh(i2, (byte) 26);
        c1 = new gsh(i2, (byte) 27);
        d1 = new gsh(i2, (byte) 28);
        e1 = new gsh(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gsh(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0423  */
    public final Object invoke(Object obj, Object obj2) {
        mq70 mq70Var;
        up70 up70VarA;
        int i2;
        byte b2 = this.a;
        nim0 nim0Var = nim0.a;
        String str = null;
        rih1 rih1Var = rih1.a;
        boolean zJ = true;
        switch (b2) {
            case 0:
                hwt hwtVar = (hwt) obj;
                hwt hwtVar2 = (hwt) obj2;
                return Boolean.valueOf(hwtVar.a == hwtVar2.a && hwtVar.b == hwtVar2.b && hwtVar.c == hwtVar2.c && hwtVar.d == hwtVar2.d && hwtVar.e == hwtVar2.e);
            case 1:
                return ern1.x((qim0) obj, new wqf((iu30) obj2, (byte) 6));
            case 2:
                zth zthVar = (zth) obj;
                auh auhVar = (auh) obj2;
                jo70 jo70Var = auhVar.a;
                String str2 = jo70Var != null ? jo70Var.a : null;
                if (str2 == null || str2.length() == 0) {
                    return fuh.a;
                }
                String str3 = zthVar.b;
                xkk1 xkk1Var = auhVar.b;
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.b)) != null) {
                    str = up70VarA.a.a;
                }
                return new euh(str2, str3, str);
            case 3:
                return new auh((jo70) obj, (xkk1) obj2);
            case 4:
                i1r i1rVar = (k1r) obj2;
                boolean z = i1rVar instanceof i1r;
                String str4 = ((jvh) obj).a;
                if (!z) {
                    return new lvh(str4);
                }
                wsf1 wsf1Var = (wsf1) i1rVar.a;
                String str5 = wsf1Var.a;
                String str6 = wsf1Var.b;
                String str7 = wsf1Var.c;
                List list = wsf1Var.d;
                o3r o3rVar = pvh.a;
                if (list.contains(ell.d)) {
                    i2 = 1;
                } else {
                    i2 = list.contains(ell.b) ? 2 : 0;
                }
                return new kvh(i2, str4, str5, str6, str7);
            case 5:
                tyd tydVar = (tyd) obj2;
                return new jwh((iwh) obj, new gae(tydVar.a).f(), tydVar.b);
            case 6:
                return null;
            case 7:
                a48 a48Var = (a48) obj;
                a48 a48Var2 = (a48) obj2;
                String str8 = a48Var.c;
                String str9 = a48Var2.c;
                if (str8 == null) {
                    if (str9 != null || !u890.j(a48Var.a, a48Var2.a)) {
                        zJ = false;
                    }
                } else if (str9 == null) {
                    zJ = false;
                } else {
                    zJ = u890.j(str8, str9);
                }
                return Boolean.valueOf(zJ);
            case 8:
                return Boolean.TRUE;
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.valueOf(u890.j(obj, obj2));
            case 11:
                return null;
            case 12:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wro1.a(0, cwl1.o0(x340Var2, 2131951662), cwl1.o0(x340Var2, 2131951661), x340Var2, (qim0) null);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    wu.a(((hcx) x340Var4.k(wu.a)).a(x340Var4), 0, x340Var4, (qim0) null);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    t1c.a(cwl1.l0(u291.r(nim0Var, ((hcx) x340Var6.k(wu.a)).a(x340Var6)), 0L, er31.a, 13), x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    gpx gpxVar = gpx.c;
                    uwr uwrVar = cbx.a;
                    w0h1.a(gpxVar, new jsl(cwl1.o0(x340Var8, 2131960473)), (qim0) null, cbx.a(x340Var8).b.b, 0L, false, x340Var8, gpx.d, 52);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var10, 2131960552), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var10, 0, 0, 2046);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    knx knxVar = knx.c;
                    uwr uwrVar2 = cbx.a;
                    w0h1.a(knxVar, new jsl(cwl1.o0(x340Var12, 2131960568)), (qim0) null, cbx.a(x340Var12).b.b, 0L, false, x340Var12, knx.d, 52);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    yoo1.z(x340Var14);
                    wyo1.f(72.0f, 6, x340Var14, (qim0) null);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    yoo1.z(x340Var16);
                    wyo1.f(104.0f, 6, x340Var16, (qim0) null);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    gpx gpxVar2 = gpx.c;
                    jsl jslVar = new jsl(cwl1.o0(x340Var18, 2131951977));
                    uwr uwrVar3 = cbx.a;
                    w0h1.a(gpxVar2, jslVar, (qim0) null, ((vex) zex.a.b).b, 0L, false, x340Var18, gpx.d, 52);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    w0h1.a(isx.c, isl.a, u291.r(nim0Var, 32.0f), 0L, 0L, false, x340Var20, isx.d | 48, 56);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    w0h1.a(ksx.c, isl.a, u291.r(nim0Var, 32.0f), 0L, 0L, false, x340Var22, ksx.d | 48, 56);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    w0h1.a(lsx.c, isl.a, u291.r(nim0Var, 32.0f), 0L, 0L, false, x340Var24, lsx.d | 48, 56);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    w0h1.a(jsx.c, isl.a, u291.r(nim0Var, 32.0f), 0L, 0L, false, x340Var26, jsx.d | 48, 56);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (!x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x340Var28.b0();
                }
                return rih1Var;
            case 26:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (!x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x340Var30.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var31 = (b0k) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                x340 x340Var32 = x340Var31;
                if (x340Var32.Y(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    bzn1.e((qim0) null, (vu30) null, false, (vu30) null, rgr0.a, (ngr0) null, (ygr0) null, (Function0) null, x340Var32, 0, 239);
                } else {
                    x340Var32.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var33 = (b0k) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var34, 2131951901), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var34, 0, 0, 2046);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            default:
                x340 x340Var35 = (b0k) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    uwo1.e(cwl1.o0(x340Var36, 2131951900), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var36, 0, 0, 2046);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
        }
    }
}
