package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oe60 extends hab0 implements zu30 {
    public static final oe60 N0;
    public static final oe60 O0;
    public static final oe60 P0;
    public static final oe60 Q0;
    public static final oe60 R0;
    public static final oe60 S0;
    public static final oe60 T0;
    public static final oe60 U0;
    public static final oe60 V0;
    public static final oe60 W0;
    public static final oe60 X;
    public static final oe60 X0;
    public static final oe60 Y;
    public static final oe60 Y0;
    public static final oe60 Z;
    public static final oe60 Z0;
    public static final oe60 a1;
    public static final oe60 b;
    public static final oe60 b1;
    public static final oe60 c;
    public static final oe60 c1;
    public static final oe60 d;
    public static final oe60 d1;
    public static final oe60 e;
    public static final oe60 e1;
    public static final oe60 f;
    public static final oe60 g;
    public static final oe60 h;
    public static final oe60 i;
    public static final oe60 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new oe60(i2, (byte) 0);
        c = new oe60(i2, (byte) 1);
        d = new oe60(i2, (byte) 2);
        e = new oe60(i2, (byte) 3);
        f = new oe60(i2, (byte) 4);
        g = new oe60(i2, (byte) 5);
        h = new oe60(i2, (byte) 6);
        i = new oe60(i2, (byte) 7);
        t = new oe60(i2, (byte) 8);
        X = new oe60(i2, (byte) 9);
        Y = new oe60(i2, (byte) 10);
        Z = new oe60(i2, (byte) 11);
        N0 = new oe60(i2, (byte) 12);
        O0 = new oe60(i2, (byte) 13);
        P0 = new oe60(i2, (byte) 14);
        Q0 = new oe60(i2, (byte) 15);
        R0 = new oe60(i2, (byte) 16);
        S0 = new oe60(i2, (byte) 17);
        T0 = new oe60(i2, (byte) 18);
        U0 = new oe60(i2, (byte) 19);
        V0 = new oe60(i2, (byte) 20);
        W0 = new oe60(i2, (byte) 21);
        X0 = new oe60(i2, (byte) 22);
        Y0 = new oe60(i2, (byte) 23);
        Z0 = new oe60(i2, (byte) 24);
        a1 = new oe60(i2, (byte) 25);
        b1 = new oe60(i2, (byte) 26);
        c1 = new oe60(i2, (byte) 27);
        d1 = new oe60(i2, (byte) 28);
        e1 = new oe60(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe60(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        String str = null;
        switch (b2) {
            case 0:
                return new ryl0(Integer.valueOf(((Number) obj3).intValue()), (String) null, ((te60) obj).a, (r6h1) obj4);
            case 1:
                ryl0 ryl0Var = (ryl0) obj;
                me60 me60Var = (me60) obj3;
                le60 le60Var = (le60) obj4;
                if (le60Var instanceof je60) {
                    String str2 = me60Var.b;
                    if (str2.length() == 0) {
                        str2 = me60Var.a;
                    }
                    return ryl0Var.a(str2);
                }
                if (le60Var instanceof ke60) {
                    return ryl0Var.g();
                }
                eg.o();
                return null;
            case 2:
                return new syl0(Integer.valueOf(((Number) obj3).intValue()), ((ue60) obj).a, "", (r6h1) obj4);
            case 3:
                return null;
            case 4:
                ((Number) obj3).intValue();
                return new qnl0((r6h1) obj4);
            case 5:
                nvl0 nvl0Var = (nvl0) obj;
                if (((aj60) obj4).equals(aj60.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_recent_searches", 1, b7xVar), nvl0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 6:
                sv60 sv60Var = (tv60) obj3;
                pv60 pv60Var = (pv60) obj4;
                y6h1 y6h1Var = ((lbl0) obj).a;
                sv60 sv60Var2 = sv60Var instanceof sv60 ? sv60Var : null;
                int size = sv60Var2 != null ? sv60Var2.c.b.a.size() : 0;
                int iOrdinal = pv60Var.ordinal();
                if (iOrdinal == 0) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("learn_more_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    String str3 = nik1.x5.a;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                }
                if (iOrdinal == 1) {
                    String strValueOf = String.valueOf(size);
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("system_dismiss", (String) null, (Integer) null, (String) null, strValueOf));
                    x6h1VarC2.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                if (iOrdinal == 2) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("pending_request", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("accept_button", (String) null, 0, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("pending_request", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("cancel_button", (String) null, 0, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 7:
                y6h1 y6h1Var2 = ((vbl0) obj).a;
                int iOrdinal2 = ((uw60) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    w7h1Var2 = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var2, r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var2.c();
                    x6h1VarC7.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 8:
                ((Number) obj3).intValue();
                return new yql0(5, (r6h1) obj4);
            case 9:
                jjm0 jjm0Var = (jjm0) obj;
                xr70 xr70Var = (xr70) obj2;
                int iIntValue = ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-1742735164);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = new sv7(4, (lnm) null);
                    x340Var.s0(objT);
                }
                jjm0Var.a((zu30) objT, x340Var, (iIntValue << 3) & 112);
                yr70 yr70Var = new yr70(xr70Var.a, xr70Var.b, xr70Var.c, xr70Var.d, xr70Var.e, xr70Var.f, xr70Var.g, true, xr70Var.h);
                x340Var.r(false);
                return yr70Var;
            case 10:
                return null;
            case 11:
                mu70 mu70Var = (mu70) obj;
                gu70 gu70Var = (iu70) obj2;
                r6h1 r6h1Var = (r6h1) obj4;
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                gu70 gu70Var2 = gu70Var instanceof gu70 ? gu70Var : null;
                if (gu70Var2 != null && gu70Var2.a.t) {
                    str = "has_sponsorship";
                }
                return new ryl0(numValueOf, str, mu70Var.a, r6h1Var);
            case 12:
                ryl0 ryl0Var2 = (ryl0) obj;
                mu70 mu70Var2 = (mu70) obj2;
                iu70 iu70Var = (iu70) obj3;
                fu70 fu70Var = (fu70) obj4;
                l0x0 l0x0Var = mu70Var2.k;
                n1x n1xVar = mu70Var2.e;
                boolean z = mu70Var2.h;
                if (fu70Var instanceof du70) {
                    if (z && n1xVar != null && l0x0Var != null) {
                        l0x0Var.o(new qy(gho1.r(n1xVar), wgo1.w(n1xVar)));
                    }
                    return ryl0Var2.a(iu70Var.a());
                }
                if (!(fu70Var instanceof eu70)) {
                    eg.o();
                    return null;
                }
                if (z && n1xVar != null && l0x0Var != null) {
                    l0x0Var.o(new wy(gho1.r(n1xVar)));
                }
                return ryl0Var2.g();
            case 13:
                hv70 hv70Var = (hv70) obj;
                int iIntValue2 = ((Number) obj3).intValue();
                r6h1 r6h1Var2 = (r6h1) obj4;
                String str4 = hv70Var.a;
                return hv70Var.e ? new wql0(Integer.valueOf(iIntValue2), str4, (String) null, r6h1Var2) : new syl0(Integer.valueOf(iIntValue2), str4, hv70Var.d, r6h1Var2);
            case 14:
                hv70 hv70Var2 = (hv70) obj;
                int iIntValue3 = ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                String str5 = hv70Var2.a;
                return hv70Var2.e ? new wql0(Integer.valueOf(iIntValue3), str5, (String) null, r6h1Var3) : new syl0(Integer.valueOf(iIntValue3), str5, hv70Var2.d, r6h1Var3);
            case 15:
                return new x9l0(Integer.valueOf(((Number) obj3).intValue()), ((sv70) obj).a, (r6h1) obj4);
            case 16:
                return null;
            case 17:
                ((Number) obj3).intValue();
                return new rsl0((r6h1) obj4);
            case 18:
                return null;
            case 19:
                ktl0 ktl0Var = (n8h1) obj;
                ps70 ps70Var = (ps70) obj2;
                os70 os70Var = (os70) obj4;
                ktl0 ktl0Var2 = ktl0Var instanceof ktl0 ? ktl0Var : null;
                if (ktl0Var2 == null) {
                    return null;
                }
                if (!os70Var.equals(os70.a)) {
                    eg.o();
                    return null;
                }
                if (ps70Var.i) {
                    return ktl0Var2.h();
                }
                return null;
            case 20:
                ((Number) obj3).intValue();
                return new u5l0((r6h1) obj4);
            case 21:
                u5l0 u5l0Var = (u5l0) obj;
                m180 m180Var = (n180) obj4;
                r6h1 r6h1Var4 = u5l0Var.a;
                y6h1 y6h1Var3 = u5l0Var.b;
                if (m180Var instanceof m180) {
                    Integer numValueOf2 = Integer.valueOf(m180Var.a);
                    x6h1 x6h1VarC8 = y6h1Var3.c();
                    x6h1VarC8.i.add(new a7h1("image_background_button", (String) null, numValueOf2, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC8.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!(m180Var instanceof l180)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC9 = y6h1Var3.c();
                    x6h1VarC9.i.add(new a7h1("dismiss_interaction", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 22:
                return null;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj3).intValue();
                return new lkl0();
            case 24:
                ((Number) obj3).intValue();
                return new vxk0(new yxk0((byte) 0));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                vxk0 vxk0Var = (vxk0) obj;
                r6h1 r6h1Var5 = vxk0Var.b.b;
                y6h1 y6h1Var4 = vxk0Var.a;
                String str6 = ((a980) obj2).a;
                int iOrdinal3 = ((z880) obj4).a.ordinal();
                if (iOrdinal3 == 0) {
                    return null;
                }
                if (iOrdinal3 == 1) {
                    x6h1 x6h1VarC10 = y6h1Var4.c();
                    x6h1VarC10.i.add(new a7h1("spotify_connect_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("change_remote_device_incarnation", 1, Collections.singletonMap("remote_device_id", str6 != null ? str6 : "")), x6h1VarC10.a(), r6h1Var5, System.currentTimeMillis());
                } else {
                    if (iOrdinal3 != 2) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC11 = y6h1Var4.c();
                    x6h1VarC11.i.add(new a7h1("google_cast_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("change_remote_device_incarnation", 1, Collections.singletonMap("remote_device_id", str6 != null ? str6 : "")), x6h1VarC11.a(), r6h1Var5, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 26:
                return new kql0(new lql0(new pql0(), (byte) 0), Integer.valueOf(((Number) obj3).intValue()), ((f980) obj).a);
            case 27:
                y6h1 y6h1Var5 = ((kql0) obj).a;
                xis0 xis0Var = ((e980) obj4).a;
                if (!(xis0Var instanceof xis0)) {
                    return null;
                }
                bro1 bro1Var = xis0Var.a;
                if (u890.j(bro1Var, qis0.b)) {
                    x6h1 x6h1VarC12 = y6h1Var5.c();
                    x6h1VarC12.i.add(new a7h1("accept_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!u890.j(bro1Var, sis0.b)) {
                        return null;
                    }
                    x6h1 x6h1VarC13 = y6h1Var5.c();
                    x6h1VarC13.i.add(new a7h1("decline_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 28:
                ((Number) obj3).intValue();
                return yz10.e(((mb80) obj).g);
            default:
                jb80 jb80Var = (jb80) obj4;
                if (jb80Var instanceof hb80) {
                    hb80 hb80Var = (hb80) jb80Var;
                    return yz10.f(0, hb80Var.a, hb80Var.b);
                }
                if (jb80Var instanceof ib80) {
                    ib80 ib80Var = (ib80) jb80Var;
                    return yz10.f(0, ib80Var.a, ib80Var.b);
                }
                eg.o();
                return null;
        }
    }
}
