package p;

import android.view.View;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gce0 extends hab0 implements xu30 {
    public static final gce0 N0;
    public static final gce0 O0;
    public static final gce0 P0;
    public static final gce0 Q0;
    public static final gce0 R0;
    public static final gce0 S0;
    public static final gce0 T0;
    public static final gce0 U0;
    public static final gce0 V0;
    public static final gce0 W0;
    public static final gce0 X;
    public static final gce0 X0;
    public static final gce0 Y;
    public static final gce0 Y0;
    public static final gce0 Z;
    public static final gce0 Z0;
    public static final gce0 a1;
    public static final gce0 b;
    public static final gce0 b1;
    public static final gce0 c;
    public static final gce0 c1;
    public static final gce0 d;
    public static final gce0 d1;
    public static final gce0 e;
    public static final gce0 e1;
    public static final gce0 f;
    public static final gce0 g;
    public static final gce0 h;
    public static final gce0 i;
    public static final gce0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 3;
        b = new gce0(i2, (byte) 0);
        c = new gce0(i2, (byte) 1);
        d = new gce0(i2, (byte) 2);
        e = new gce0(i2, (byte) 3);
        f = new gce0(i2, (byte) 4);
        g = new gce0(i2, (byte) 5);
        h = new gce0(i2, (byte) 6);
        i = new gce0(i2, (byte) 7);
        t = new gce0(i2, (byte) 8);
        X = new gce0(i2, (byte) 9);
        Y = new gce0(i2, (byte) 10);
        Z = new gce0(i2, (byte) 11);
        N0 = new gce0(i2, (byte) 12);
        O0 = new gce0(i2, (byte) 13);
        P0 = new gce0(i2, (byte) 14);
        Q0 = new gce0(i2, (byte) 15);
        R0 = new gce0(i2, (byte) 16);
        S0 = new gce0(i2, (byte) 17);
        T0 = new gce0(i2, (byte) 18);
        U0 = new gce0(i2, (byte) 19);
        V0 = new gce0(i2, (byte) 20);
        W0 = new gce0(i2, (byte) 21);
        X0 = new gce0(i2, (byte) 22);
        Y0 = new gce0(i2, (byte) 23);
        Z0 = new gce0(i2, (byte) 24);
        a1 = new gce0(i2, (byte) 25);
        b1 = new gce0(i2, (byte) 26);
        c1 = new gce0(i2, (byte) 27);
        d1 = new gce0(i2, (byte) 28);
        e1 = new gce0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gce0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x022f  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        mq70 mq70Var;
        up70 up70VarA;
        m7f0 m7f0Var;
        w8w0 w8w0Var;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-36076081);
                i6o0 i6o0VarQ = k1o1.q(x340Var);
                d6o0 d6o0Var = (d6o0) x340Var.k(xce0.a);
                qim0 qim0VarL = d6o0Var != null ? bmq0.L(bmq0.L(qim0Var, d6o0Var, (g6o0) null), i6o0VarQ, (g6o0) null) : bmq0.L(qim0Var, i6o0VarQ, (g6o0) null);
                x340Var.r(false);
                return qim0VarL;
            case 2:
                eje0 eje0Var = (eje0) obj;
                dje0 dje0Var = (dje0) obj2;
                if (dje0Var.equals(bje0.a)) {
                    eje0Var.b.invoke();
                } else {
                    if (!dje0Var.equals(cje0.a)) {
                        eg.o();
                        return null;
                    }
                    eje0Var.c.invoke();
                }
                return rih1Var;
            case 3:
                ifh0 ifh0Var = (ifh0) obj;
                afh0 afh0Var = (afh0) obj2;
                long j = ((hjl) obj3).a;
                int i2 = hjl.i(j);
                int iH = hjl.h(j);
                int iU = jch0.U(i2 * 1.0943055f);
                int iU2 = jch0.U(iH * 1.0943055f);
                if (!((iU >= 0) & (iU2 >= 0))) {
                    sf80.a("width and height must be >= 0");
                }
                return ifh0Var.S(i2, iH, b7xVar, new ro60(afh0Var.H(jjl.h(iU, iU, iU2, iU2)), i2, iH, (byte) 2));
            case 4:
                ((Number) obj3).intValue();
                return new ktl0((mtl0) obj, 3, Integer.valueOf(((p7f0) obj2).a));
            case 5:
                return rih1Var;
            case 6:
                doh0 doh0Var = (doh0) obj;
                if (((coh0) obj2).equals(coh0.a)) {
                    doh0Var.c.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 7:
                lfi0 lfi0Var = (lfi0) obj;
                kfi0 kfi0Var = (kfi0) obj2;
                if (kfi0Var.equals(ifi0.a)) {
                    Function0 function0 = lfi0Var.t;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    if (!kfi0Var.equals(jfi0.a)) {
                        eg.o();
                        return null;
                    }
                    Function0 function1 = lfi0Var.u;
                    if (function1 != null) {
                        function1.invoke();
                    }
                }
                return rih1Var;
            case 8:
                View view = (View) obj;
                hsl1 hsl1Var = (hsl1) obj2;
                view.setPadding(view.getPaddingLeft(), hsl1Var.a.i(519).b, view.getPaddingRight(), view.getPaddingBottom());
                return hsl1Var;
            case 9:
                hsl1 hsl1Var2 = (hsl1) obj2;
                uc80 uc80Var = (uc80) obj3;
                ((View) obj).setPadding(uc80Var.b, uc80Var.a, uc80Var.c, uc80Var.d + hsl1Var2.a.i(519).d);
                return hsl1Var2;
            case 10:
                View view2 = (View) obj;
                hsl1 hsl1Var3 = (hsl1) obj2;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), ((uc80) obj3).d + hsl1Var3.a.i(519).d);
                return hsl1Var3;
            case 11:
                ((ixi0) obj).k.invoke((dxi0) obj2);
                return rih1Var;
            case 12:
                jo70 jo70Var = (jo70) obj;
                hll hllVar = (hll) obj2;
                xkk1 xkk1Var = (xkk1) obj3;
                String str2 = jo70Var.a;
                String strY0 = o7h.y0(jo70Var.d, ", ", (String) null, (String) null, hvi0.T0, 30);
                String str3 = (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) ? null : up70VarA.a.a;
                List list = hllVar.b;
                io70 io70Var = jo70Var.e;
                if (io70Var != null) {
                    String str4 = io70Var.b;
                    if (ihc1.y0(str4)) {
                        str = null;
                    } else {
                        str = str4;
                    }
                } else {
                    str = null;
                }
                return new m5i1(str2, str3, strY0, str, list);
            case 13:
                return new p740((String) obj, (l1z) obj2, (v740) obj3);
            case 14:
                return new ynj0((jo70) obj, (xkk1) obj2, (zoy0) obj3);
            case 15:
                return new fxj0((String) obj2, (String) obj3, (qxc0) obj);
            case 16:
                return new n7k0((String) obj2, (String) obj3, (qxc0) obj);
            case 17:
                q5t0 q5t0VarH = ((afh0) obj2).H(((hjl) obj3).a);
                return ((ifh0) obj).S(q5t0VarH.a, 0, b7xVar, new f2(q5t0VarH, (byte) 25));
            case 18:
                dik0 dik0Var = (dik0) obj;
                Map map = (Map) obj2;
                cw21 cw21Var = (cw21) obj3;
                lhg1 lhg1Var = dik0Var.a;
                LinkedHashMap linkedHashMap = cw21Var != null ? cw21Var.a : null;
                Float f2 = dik0Var.b;
                q6w0 q6w0Var = lhg1Var.a;
                k7f0 k7f0Var = q6w0Var.g;
                if (k7f0Var == null || (m7f0Var = k7f0Var.a) == null) {
                    m7f0Var = (map == null || (w8w0Var = (w8w0) map.get(q6w0Var.a)) == null) ? null : w8w0Var.f.a;
                }
                return apo.t(linkedHashMap != null ? (l7f0) linkedHashMap.get(m7f0Var) : null, q6w0Var, lhg1Var.b, f2);
            case 19:
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(-512626422);
                String strO0 = cwl1.o0(x340Var2, w0h1.M((jez) obj));
                x340Var2.r(false);
                return strO0;
            case 20:
                ((Number) obj3).intValue();
                x340 x340Var3 = (b0k) obj2;
                x340Var3.i0(818912512);
                String strO1 = cwl1.o0(x340Var3, h1p1.n((ha20) obj));
                x340Var3.r(false);
                return strO1;
            case 21:
                ((Number) obj3).intValue();
                x340 x340Var4 = (b0k) obj2;
                x340Var4.i0(-473426370);
                String strO2 = cwl1.o0(x340Var4, w0h1.N((rx30) obj));
                x340Var4.r(false);
                return strO2;
            case 22:
                ((Number) obj3).intValue();
                x340 x340Var5 = (b0k) obj2;
                x340Var5.i0(210490416);
                String strO3 = cwl1.o0(x340Var5, z1a1.o((vaa0) obj));
                x340Var5.r(false);
                return strO3;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj3).intValue();
                x340 x340Var6 = (b0k) obj2;
                x340Var6.i0(1969129098);
                String strO4 = cwl1.o0(x340Var6, yto.s((m7f0) obj));
                x340Var6.r(false);
                return strO4;
            case 24:
                ((Number) obj3).intValue();
                x340 x340Var7 = (b0k) obj2;
                x340Var7.i0(-77032018);
                String strO5 = cwl1.o0(x340Var7, si1.x((duk1) obj));
                x340Var7.r(false);
                return strO5;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj3).intValue();
                x340 x340Var8 = (b0k) obj2;
                x340Var8.i0(2142643803);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var8).f;
                qim0 qim0VarQ = i1p1.q((qim0) obj, er31.b(16.0f));
                x340Var8.r(false);
                return qim0VarQ;
            case 26:
                jo70 jo70Var2 = (jo70) obj;
                mtl mtlVar = (mtl) obj2;
                Boolean bool = (Boolean) obj3;
                List list2 = jo70Var2.d;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ho70) it.next()).a);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (((String) obj4).length() > 0) {
                        arrayList2.add(obj4);
                    }
                }
                return new m2n0(arrayList2, rqt0.C(mtlVar, bool) ? rqt0.H(jo70Var2) : "");
            case 27:
                return new qan0((jo70) obj, (xkk1) obj2, (hll) obj3, new y2u0(0, false, false, false));
            case 28:
                return new qbn0((jo70) obj, (xkk1) obj2, (pjw0) obj3);
            default:
                ((lgn0) obj).b.invoke(((kgn0) obj2).a);
                return rih1Var;
        }
    }
}
