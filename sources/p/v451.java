package p;

import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v451 extends hab0 implements zu30 {
    public static final v451 N0;
    public static final v451 O0;
    public static final v451 P0;
    public static final v451 Q0;
    public static final v451 R0;
    public static final v451 S0;
    public static final v451 T0;
    public static final v451 U0;
    public static final v451 V0;
    public static final v451 W0;
    public static final v451 X;
    public static final v451 X0;
    public static final v451 Y;
    public static final v451 Y0;
    public static final v451 Z;
    public static final v451 Z0;
    public static final v451 a1;
    public static final v451 b;
    public static final v451 b1;
    public static final v451 c;
    public static final v451 c1;
    public static final v451 d;
    public static final v451 d1;
    public static final v451 e;
    public static final v451 e1;
    public static final v451 f;
    public static final v451 g;
    public static final v451 h;
    public static final v451 i;
    public static final v451 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new v451(i2, (byte) 0);
        c = new v451(i2, (byte) 1);
        d = new v451(i2, (byte) 2);
        e = new v451(i2, (byte) 3);
        f = new v451(i2, (byte) 4);
        g = new v451(i2, (byte) 5);
        h = new v451(i2, (byte) 6);
        i = new v451(i2, (byte) 7);
        t = new v451(i2, (byte) 8);
        X = new v451(i2, (byte) 9);
        Y = new v451(i2, (byte) 10);
        Z = new v451(i2, (byte) 11);
        N0 = new v451(i2, (byte) 12);
        O0 = new v451(i2, (byte) 13);
        P0 = new v451(i2, (byte) 14);
        Q0 = new v451(i2, (byte) 15);
        R0 = new v451(i2, (byte) 16);
        S0 = new v451(i2, (byte) 17);
        T0 = new v451(i2, (byte) 18);
        U0 = new v451(i2, (byte) 19);
        V0 = new v451(i2, (byte) 20);
        W0 = new v451(i2, (byte) 21);
        X0 = new v451(i2, (byte) 22);
        Y0 = new v451(i2, (byte) 23);
        Z0 = new v451(i2, (byte) 24);
        a1 = new v451(i2, (byte) 25);
        b1 = new v451(i2, (byte) 26);
        c1 = new v451(i2, (byte) 27);
        d1 = new v451(i2, (byte) 28);
        e1 = new v451(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v451(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        z6q0 z6q0Var;
        y6q0 y6q0Var;
        List list;
        gll gllVar;
        mq70 mq70Var;
        up70 up70VarA;
        mq70 mq70Var2;
        up70 up70VarA2;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        Long w7h1Var3 = null;
        switch (b2) {
            case 0:
                s451 s451Var = (s451) obj4;
                y6h1 y6h1Var = ((msk0) obj).a;
                if (s451Var instanceof p451) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(s451Var instanceof q451)) {
                        if (s451Var instanceof r451) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("change_search_query", 1, Collections.singletonMap("search_query_string", ((q451) s451Var).a)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 1:
                qvl0 qvl0Var = (qvl0) obj;
                String str = ((q751) obj4).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), qvl0Var.a, r6h1.c, System.currentTimeMillis());
            case 2:
                fa51 fa51Var = (fa51) obj;
                ((Number) obj3).intValue();
                wq61 wq61Var = fa51Var.b;
                return new pxl0(new oxl0(new ksk0((byte) 20), fa51Var.d ? 2 : 1), f4i1.f(wq61Var.a.e().a, " ", ((sq61) wq61Var.e).getId()), Integer.valueOf(fa51Var.a));
            case 3:
                pxl0 pxl0Var = (pxl0) obj;
                fa51 fa51Var2 = (fa51) obj2;
                ea51 ea51Var = (ea51) obj4;
                y6h1 y6h1Var2 = pxl0Var.a;
                ksk0 ksk0Var = pxl0Var.b.c;
                if (ea51Var instanceof ca51) {
                    String str2 = fa51Var2.b.a.getViewUri().a;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1Var2, ksk0Var.b, System.currentTimeMillis());
                } else {
                    if (!(ea51Var instanceof da51)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_recent_searches_item", 1, b7xVar), y6h1Var2, ksk0Var.b, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 4:
                return null;
            case 5:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                String str3 = ((qh51) obj).d;
                return (str3 == null || ihc1.y0(str3)) ? new zzl0(r6h1Var) : new aal0(5, str3, r6h1Var);
            case 6:
                aal0 aal0Var = (w6h1) obj;
                qh51 qh51Var = (qh51) obj2;
                if (((ph51) obj4) != ph51.a) {
                    eg.o();
                    return null;
                }
                String str4 = qh51Var.d;
                if (str4 == null) {
                    return null;
                }
                if (ihc1.y0(str4)) {
                    str4 = null;
                }
                if (str4 == null) {
                    return null;
                }
                aal0 aal0Var2 = aal0Var instanceof aal0 ? aal0Var : null;
                if (aal0Var2 != null) {
                    return aal0Var2.a(str4);
                }
                return null;
            case 7:
                return new qob((Context) obj2, (byte) 2);
            case 8:
                ((Number) obj3).intValue();
                return new o3l0();
            case 9:
                return null;
            case 10:
                return new stk0(Integer.valueOf(((Number) obj3).intValue()), ((bk51) obj).b, (r6h1) obj4);
            case 11:
                stk0 stk0Var = (stk0) obj;
                ak51 ak51Var = (ak51) obj4;
                if (ak51Var instanceof ak51) {
                    String str5 = ak51Var.a;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), stk0Var.b, stk0Var.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var3;
            case 12:
                npl0 npl0Var = (npl0) obj;
                kk51 kk51Var = (kk51) obj2;
                if (((jk51) obj4).equals(jk51.a)) {
                    return npl0Var.a(kk51Var.a);
                }
                eg.o();
                return null;
            case 13:
                h4m0 h4m0Var = (h4m0) obj;
                if (((qk51) obj4).equals(qk51.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), h4m0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 14:
                ((Number) obj3).intValue();
                return new y1m0(((rk51) obj).b.a, (r6h1) obj4);
            case 15:
                y1m0 y1m0Var = (y1m0) obj;
                String str6 = nik1.w6.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), y1m0Var.b, y1m0Var.a, System.currentTimeMillis());
            case 16:
                ((Number) obj3).intValue();
                return new uil0((r6h1) obj4);
            case 17:
                return ((uil0) obj).e(Integer.valueOf((int) ((yl51) obj3).d));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new ow0((Context) obj2, (iu30) obj4, (byte) 2);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((Number) obj3).intValue();
                return new vil0((r6h1) obj4);
            case 20:
                return ((vil0) obj).e(Integer.valueOf((int) ((nm51) obj3).e));
            case 21:
                return new pm51((Context) obj2, (iu30) obj4, (byte) 0);
            case 22:
                ((Number) obj3).intValue();
                return new djl0(((xn51) obj2).a(), (r6h1) obj4);
            case 23:
                return null;
            case 24:
                ((Number) obj3).intValue();
                return new pil0((r6h1) obj4);
            case 25:
                pil0 pil0Var = (pil0) obj;
                f0g1 f0g1Var = (f0g1) obj3;
                e0g1 e0g1Var = (e0g1) obj4;
                if (e0g1Var instanceof b0g1) {
                    return pil0Var.e(Integer.valueOf((int) ((b0g1) e0g1Var).a), Integer.valueOf((int) f0g1Var.b));
                }
                return null;
            case 26:
                ((Number) obj3).intValue();
                r6h1 r6h1Var2 = r6h1.c;
                return new gul0();
            case 27:
                gul0 gul0Var = (gul0) obj;
                nhb1 nhb1Var = (nhb1) obj3;
                lhb1 lhb1Var = (lhb1) obj4;
                if (!lhb1Var.equals(jhb1.a)) {
                    if (lhb1Var.equals(khb1.a)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC3 = gul0Var.a.c();
                x6h1VarC3.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA = x6h1VarC3.a();
                String strM = flo1.m(nhb1Var, "spotify:premium-destination");
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strM != null ? strM : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 28:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                hll hllVar = (hll) obj3;
                a7q0 a7q0Var = (a7q0) obj4;
                String str7 = jo70Var != null ? jo70Var.a : null;
                vp70 vp70Var = vp70.d;
                return new sp51(str7, (xkk1Var == null || (mq70Var2 = xkk1Var.a) == null || (up70VarA2 = mq70Var2.a(vp70Var)) == null) ? null : up70VarA2.a.a, (xkk1Var == null || (mq70Var = xkk1Var.b) == null || (up70VarA = mq70Var.a(vp70Var)) == null) ? null : up70VarA.a.a, (hllVar == null || (list = hllVar.c) == null || (gllVar = (gll) o7h.s0(list)) == null) ? null : gllVar.a, (a7q0Var == null || (y6q0Var = a7q0Var.d) == null) ? gy50.b : new fy50(Double.valueOf(y6q0Var.a), Long.valueOf(y6q0Var.b), Boolean.TRUE, 3), (a7q0Var == null || (z6q0Var = a7q0Var.f) == null || !z6q0Var.b) ? false : true, a7q0Var != null ? a7q0Var.b : null);
            default:
                ((Number) obj3).intValue();
                return new jwl0(((tp51) obj).a, (r6h1) obj4);
        }
    }
}
