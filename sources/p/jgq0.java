package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jgq0 extends hab0 implements zu30 {
    public static final jgq0 N0;
    public static final jgq0 O0;
    public static final jgq0 P0;
    public static final jgq0 Q0;
    public static final jgq0 R0;
    public static final jgq0 S0;
    public static final jgq0 T0;
    public static final jgq0 U0;
    public static final jgq0 V0;
    public static final jgq0 W0;
    public static final jgq0 X;
    public static final jgq0 X0;
    public static final jgq0 Y;
    public static final jgq0 Y0;
    public static final jgq0 Z;
    public static final jgq0 Z0;
    public static final jgq0 a1;
    public static final jgq0 b;
    public static final jgq0 b1;
    public static final jgq0 c;
    public static final jgq0 c1;
    public static final jgq0 d;
    public static final jgq0 d1;
    public static final jgq0 e;
    public static final jgq0 e1;
    public static final jgq0 f;
    public static final jgq0 g;
    public static final jgq0 h;
    public static final jgq0 i;
    public static final jgq0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new jgq0(i2, (byte) 0);
        c = new jgq0(i2, (byte) 1);
        d = new jgq0(i2, (byte) 2);
        e = new jgq0(i2, (byte) 3);
        f = new jgq0(i2, (byte) 4);
        g = new jgq0(i2, (byte) 5);
        h = new jgq0(i2, (byte) 6);
        i = new jgq0(i2, (byte) 7);
        t = new jgq0(i2, (byte) 8);
        X = new jgq0(i2, (byte) 9);
        Y = new jgq0(i2, (byte) 10);
        Z = new jgq0(i2, (byte) 11);
        N0 = new jgq0(i2, (byte) 12);
        O0 = new jgq0(i2, (byte) 13);
        P0 = new jgq0(i2, (byte) 14);
        Q0 = new jgq0(i2, (byte) 15);
        R0 = new jgq0(i2, (byte) 16);
        S0 = new jgq0(i2, (byte) 17);
        T0 = new jgq0(i2, (byte) 18);
        U0 = new jgq0(i2, (byte) 19);
        V0 = new jgq0(i2, (byte) 20);
        W0 = new jgq0(i2, (byte) 21);
        X0 = new jgq0(i2, (byte) 22);
        Y0 = new jgq0(i2, (byte) 23);
        Z0 = new jgq0(i2, (byte) 24);
        a1 = new jgq0(i2, (byte) 25);
        b1 = new jgq0(i2, (byte) 26);
        c1 = new jgq0(i2, (byte) 27);
        d1 = new jgq0(i2, (byte) 28);
        e1 = new jgq0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jgq0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        int i2;
        w7h1 w7h1Var2;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var3 = null;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new zfl0((r6h1) obj4);
            case 1:
                return null;
            case 2:
                pgq0 pgq0Var = (pgq0) obj4;
                y6h1 y6h1Var = ((vpl0) obj).a;
                if (pgq0Var instanceof ogq0) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("update_profile_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!(pgq0Var instanceof ngq0)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC2 = y6h1Var.c();
                x6h1VarC2.i.add(new a7h1("skip_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 3:
                aal0 aal0Var = (w6h1) obj;
                String str = ((nhq0) obj4).a;
                if (ihc1.y0(str)) {
                    return null;
                }
                aal0 aal0Var2 = aal0Var instanceof aal0 ? aal0Var : null;
                if (aal0Var2 != null) {
                    return aal0Var2.a(str);
                }
                return null;
            case 4:
                return null;
            case 5:
                e5r0 e5r0Var = (e5r0) obj4;
                y6h1 y6h1Var2 = ((fyk0) obj).a;
                if (e5r0Var instanceof d5r0) {
                    w7h1Var = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var2, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(e5r0Var instanceof c5r0)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var2, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 6:
                ((Number) obj3).intValue();
                return new gkl0((r6h1) obj4);
            case 7:
                gkl0 gkl0Var = (gkl0) obj;
                h8r0 h8r0Var = (h8r0) obj2;
                k8r0 k8r0Var = (k8r0) obj3;
                r6h1 r6h1Var = gkl0Var.a;
                y6h1 y6h1Var3 = gkl0Var.b;
                if (k8r0Var.b) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var3, r6h1Var, System.currentTimeMillis());
                }
                boolean z = k8r0Var.a;
                String str2 = h8r0Var.b;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", !z ? "spotify:page-match:onboarding:".concat(str2) : "spotify:page-match:landing:".concat(str2))), y6h1Var3, r6h1Var, System.currentTimeMillis());
            case 8:
                ((Number) obj3).intValue();
                return new zol0(((wlr0) obj).a, (r6h1) obj4);
            case 9:
                zol0 zol0Var = (zol0) obj;
                ylr0 ylr0Var = (zlr0) obj3;
                vlr0 vlr0Var = (vlr0) obj4;
                ylr0 ylr0Var2 = ylr0Var instanceof ylr0 ? ylr0Var : null;
                if (ylr0Var2 == null) {
                    return null;
                }
                if (vlr0Var == vlr0.a) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ylr0Var2.d)), zol0Var.b, zol0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 10:
                return new kjl0(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
            case 11:
                return null;
            case 12:
                ((Number) obj3).intValue();
                return new b9l0(new h7l0((byte) 19));
            case 13:
                b9l0 b9l0Var = (b9l0) obj;
                if (((esr0) obj4).equals(esr0.a)) {
                    String str3 = nik1.X6.a;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), b9l0Var.a, r6h1.c, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var3;
            case 14:
                ((Number) obj3).intValue();
                return new fll0(new hll0((String) null, (String) null));
            case 15:
                fll0 fll0Var = (fll0) obj;
                nwr0 nwr0Var = (nwr0) obj4;
                if (nwr0Var instanceof nwr0) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", nwr0Var.a)), fll0Var.a, r6h1.c, System.currentTimeMillis());
                }
                return null;
            case 16:
                ((Number) obj3).intValue();
                int iOrdinal = ((wwr0) obj).a.ordinal();
                if (iOrdinal == 0) {
                    return new i7l0(new h7l0((byte) 5));
                }
                if (iOrdinal == 1) {
                    return new j7l0(new h7l0((byte) 5));
                }
                eg.o();
                return null;
            case 17:
                n8h1 n8h1Var = (n8h1) obj;
                int iOrdinal2 = ((wwr0) obj2).a.ordinal();
                if (iOrdinal2 == 0) {
                    return ((i7l0) n8h1Var).h();
                }
                if (iOrdinal2 == 1) {
                    return ((j7l0) n8h1Var).h();
                }
                eg.o();
                return null;
            case 18:
                ((Number) obj3).intValue();
                int iOrdinal3 = ((axr0) obj).a.ordinal();
                if (iOrdinal3 == 0) {
                    return new i7l0(new h7l0((byte) 5));
                }
                if (iOrdinal3 == 1) {
                    return new j7l0(new h7l0((byte) 5));
                }
                eg.o();
                return null;
            case 19:
                n8h1 n8h1Var2 = (n8h1) obj;
                int iOrdinal4 = ((axr0) obj2).a.ordinal();
                if (iOrdinal4 == 0) {
                    return ((i7l0) n8h1Var2).h();
                }
                if (iOrdinal4 == 1) {
                    return ((j7l0) n8h1Var2).h();
                }
                eg.o();
                return null;
            case 20:
                ((Number) obj3).intValue();
                return new a8l0(((kxr0) obj).a, (r6h1) obj4);
            case 21:
                a8l0 a8l0Var = (a8l0) obj;
                kxr0 kxr0Var = (kxr0) obj3;
                if (!((jxr0) obj4).equals(jxr0.a)) {
                    eg.o();
                    return null;
                }
                boolean z2 = kxr0Var.d;
                int i3 = z2 ? 1 : 2;
                i2 = z2 ? 2 : 1;
                x6h1 x6h1VarC3 = a8l0Var.b.c();
                x6h1VarC3.i.add(new a7h1("block_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", s7l0.f(i3)), new mmr0("state_after_toggle", s7l0.e(i2))})), x6h1VarC3.a(), a8l0Var.a, System.currentTimeMillis());
            case 22:
                ((Number) obj3).intValue();
                return new a8l0(((wxr0) obj).getUri(), (r6h1) obj4);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                a8l0 a8l0Var2 = (a8l0) obj;
                wxr0 wxr0Var = (wxr0) obj2;
                if (!((sxr0) obj4).equals(sxr0.a)) {
                    eg.o();
                    return null;
                }
                if (wxr0Var.a()) {
                    return a8l0Var2.h(wxr0Var.getUri());
                }
                return null;
            case 24:
                ((Number) obj3).intValue();
                return new tfl0((r6h1) obj4);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj3).intValue();
                return new o7l0();
            case 26:
                ((Number) obj3).intValue();
                return new a8l0(((tyr0) obj).a, (r6h1) obj4);
            case 27:
                a8l0 a8l0Var3 = (a8l0) obj;
                tyr0 tyr0Var = (tyr0) obj2;
                uyr0 uyr0Var = (uyr0) obj3;
                syr0 syr0Var = (syr0) obj4;
                if (syr0Var.equals(qyr0.a)) {
                    return a8l0Var3.h(tyr0Var.a);
                }
                if (!syr0Var.equals(ryr0.a)) {
                    eg.o();
                    return null;
                }
                boolean z3 = uyr0Var.g;
                int i4 = z3 ? 1 : 2;
                i2 = z3 ? 2 : 1;
                x6h1 x6h1VarC4 = a8l0Var3.b.c();
                x6h1VarC4.i.add(new a7h1("block_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", s7l0.f(i4)), new mmr0("state_after_toggle", s7l0.e(i2))})), x6h1VarC4.a(), a8l0Var3.a, System.currentTimeMillis());
            case 28:
                e0s0 e0s0Var = (e0s0) obj3;
                y6h1 y6h1Var4 = ((sbl0) obj).a;
                int iOrdinal5 = ((c0s0) obj4).ordinal();
                if (iOrdinal5 == 0) {
                    x6h1 x6h1VarC5 = y6h1Var4.c();
                    x6h1VarC5.i.add(new a7h1("learn_more_link_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", e0s0Var.f)), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                }
                if (iOrdinal5 == 1) {
                    w7h1Var2 = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1Var4, r6h1.c, System.currentTimeMillis());
                } else if (iOrdinal5 == 2) {
                    x6h1 x6h1VarC6 = y6h1Var4.c();
                    x6h1VarC6.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal5 != 3) {
                        if (iOrdinal5 == 4 || iOrdinal5 == 5) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var4.c();
                    x6h1VarC7.i.add(new a7h1("block_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    y6h1 y6h1VarA = x6h1VarC7.a();
                    Set set = s4b1.f;
                    String strZ = uic.C(e0s0Var.a, null).z();
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strZ != null ? strZ : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            default:
                ((Number) obj3).intValue();
                int i5 = ((b2s0) obj).e;
                r6h1 r6h1Var2 = r6h1.c;
                return new ixl0(new qrl0(i5));
        }
    }
}
