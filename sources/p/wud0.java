package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wud0 extends hab0 implements zu30 {
    public static final wud0 N0;
    public static final wud0 O0;
    public static final wud0 P0;
    public static final wud0 Q0;
    public static final wud0 R0;
    public static final wud0 S0;
    public static final wud0 T0;
    public static final wud0 U0;
    public static final wud0 V0;
    public static final wud0 W0;
    public static final wud0 X;
    public static final wud0 X0;
    public static final wud0 Y;
    public static final wud0 Y0;
    public static final wud0 Z;
    public static final wud0 Z0;
    public static final wud0 a1;
    public static final wud0 b;
    public static final wud0 b1;
    public static final wud0 c;
    public static final wud0 c1;
    public static final wud0 d;
    public static final wud0 d1;
    public static final wud0 e;
    public static final wud0 e1;
    public static final wud0 f;
    public static final wud0 g;
    public static final wud0 h;
    public static final wud0 i;
    public static final wud0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new wud0(i2, (byte) 0);
        c = new wud0(i2, (byte) 1);
        d = new wud0(i2, (byte) 2);
        e = new wud0(i2, (byte) 3);
        f = new wud0(i2, (byte) 4);
        g = new wud0(i2, (byte) 5);
        h = new wud0(i2, (byte) 6);
        i = new wud0(i2, (byte) 7);
        t = new wud0(i2, (byte) 8);
        X = new wud0(i2, (byte) 9);
        Y = new wud0(i2, (byte) 10);
        Z = new wud0(i2, (byte) 11);
        N0 = new wud0(i2, (byte) 12);
        O0 = new wud0(i2, (byte) 13);
        P0 = new wud0(i2, (byte) 14);
        Q0 = new wud0(i2, (byte) 15);
        R0 = new wud0(i2, (byte) 16);
        S0 = new wud0(i2, (byte) 17);
        T0 = new wud0(i2, (byte) 18);
        U0 = new wud0(i2, (byte) 19);
        V0 = new wud0(i2, (byte) 20);
        W0 = new wud0(i2, (byte) 21);
        X0 = new wud0(i2, (byte) 22);
        Y0 = new wud0(i2, (byte) 23);
        Z0 = new wud0(i2, (byte) 24);
        a1 = new wud0(i2, (byte) 25);
        b1 = new wud0(i2, (byte) 26);
        c1 = new wud0(i2, (byte) 27);
        d1 = new wud0(i2, (byte) 28);
        e1 = new wud0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wud0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b2 = this.a;
        a200 a200Var = a200.a;
        z100 z100Var = z100.a;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var = null;
        switch (b2) {
            case 0:
                return new hdl0(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
            case 1:
                hdl0 hdl0Var = (hdl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", ((uud0) obj3).a)), hdl0Var.b, hdl0Var.a, System.currentTimeMillis());
            case 2:
                return new k9e0((Context) obj2);
            case 3:
                z9e0 z9e0Var = (z9e0) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                int i2 = z9e0Var.a;
                x9e0 x9e0Var = z9e0Var.c;
                if (x9e0Var instanceof v9e0) {
                    return new ysl0(new opl0(Integer.valueOf(i2 + 1), r6h1Var, (byte) 2));
                }
                return x9e0Var instanceof u9e0 ? new xsl0(new opl0(Integer.valueOf(i2 + 1), r6h1Var, (byte) 2)) : new z8s((byte) 3);
            case 4:
                n8h1 n8h1Var = (n8h1) obj;
                t9e0 t9e0Var = (t9e0) obj4;
                if (t9e0Var.equals(s9e0.a)) {
                    ysl0 ysl0Var = n8h1Var instanceof ysl0 ? (ysl0) n8h1Var : null;
                    if (ysl0Var == null) {
                        return null;
                    }
                    x6h1 x6h1VarC = ysl0Var.a.c();
                    x6h1VarC.i.add(new a7h1("start_round_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), ysl0Var.b.b, System.currentTimeMillis());
                }
                if (!t9e0Var.equals(r9e0.a)) {
                    eg.o();
                    return null;
                }
                xsl0 xsl0Var = n8h1Var instanceof xsl0 ? (xsl0) n8h1Var : null;
                if (xsl0Var == null) {
                    return null;
                }
                x6h1 x6h1VarC2 = xsl0Var.a.c();
                x6h1VarC2.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC2.a(), xsl0Var.b.b, System.currentTimeMillis());
            case 5:
                return new k9e0((Context) obj2, (ViewGroup) obj3);
            case 6:
                return new wc3((Context) obj2, (byte) 6);
            case 7:
                return null;
            case 8:
                ((Number) obj3).intValue();
                return new bnl0((r6h1) obj4);
            case 9:
                ((Number) obj3).intValue();
                return new yql0(3, (r6h1) obj4);
            case 10:
                yql0 yql0Var = (yql0) obj;
                if (((rhe0) obj4).equals(rhe0.a)) {
                    return yql0Var.a("spotify:internal:personal-podcast:location-picker");
                }
                eg.o();
                return null;
            case 11:
                dje0 dje0Var = (dje0) obj4;
                y6h1 y6h1Var = ((k9l0) obj).a;
                if (dje0Var.equals(bje0.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                }
                if (!dje0Var.equals(cje0.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("remove_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_recent_searches_item", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            case 12:
                ((Number) obj3).intValue();
                return new bpk0(new epk0((r6h1) obj4));
            case 13:
                bpk0 bpk0Var = (bpk0) obj;
                if (((ise0) obj4) instanceof ise0) {
                    return bpk0Var.e();
                }
                eg.o();
                return null;
            case 14:
                ((Number) obj3).intValue();
                int iC = l1d.C(((xxe0) obj).c);
                if (iC == 0) {
                    r6h1 r6h1Var2 = r6h1.c;
                    return new c8l0(new yok0((byte) 14));
                }
                if (iC == 1) {
                    r6h1 r6h1Var3 = r6h1.c;
                    return new d8l0(new yok0((byte) 14));
                }
                eg.o();
                return null;
            case 15:
                n8h1 n8h1Var2 = (n8h1) obj;
                xxe0 xxe0Var = (xxe0) obj2;
                lik1 lik1Var = xxe0Var.b;
                int iC2 = l1d.C(xxe0Var.c);
                if (iC2 == 0) {
                    c8l0 c8l0Var = (c8l0) n8h1Var2;
                    String str = lik1Var.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), c8l0Var.a, r6h1.c, System.currentTimeMillis());
                } else if (iC2 == 1) {
                    d8l0 d8l0Var = (d8l0) n8h1Var2;
                    String str2 = lik1Var.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), d8l0Var.a, r6h1.c, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var;
            case 16:
                l7l0 l7l0Var = (l7l0) obj;
                y500 y500Var = (y500) obj4;
                if (y500Var.equals(z100Var)) {
                    x6h1 x6h1VarC4 = l7l0Var.b.c();
                    x6h1VarC4.i.add(new a7h1("refresh_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), x6h1VarC4.a(), l7l0Var.a, System.currentTimeMillis());
                }
                if (y500Var.equals(a200Var) || (y500Var instanceof b200)) {
                    return null;
                }
                eg.o();
                return null;
            case 17:
                l7l0 l7l0Var2 = (l7l0) obj;
                y500 y500Var2 = (y500) obj4;
                if (y500Var2.equals(z100Var)) {
                    x6h1 x6h1VarC5 = l7l0Var2.b.c();
                    x6h1VarC5.i.add(new a7h1("refresh_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), x6h1VarC5.a(), l7l0Var2.a, System.currentTimeMillis());
                }
                if (y500Var2.equals(a200Var) || (y500Var2 instanceof b200)) {
                    return null;
                }
                eg.o();
                return null;
            case 18:
                ((Number) obj3).intValue();
                return new tfl0((r6h1) obj4);
            case 19:
                ((Number) obj3).intValue();
                return new o7l0();
            case 20:
                ((Number) obj3).intValue();
                return new wxk0(new yxk0((byte) 0));
            case 21:
                wxk0 wxk0Var = (wxk0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("logout_from_remote_device", 1, Collections.singletonMap("remote_device_id", ((z3f0) obj2).b)), wxk0Var.a, wxk0Var.b.b, System.currentTimeMillis());
            case 22:
                ((Number) obj3).intValue();
                r6h1 r6h1Var4 = r6h1.c;
                return new fxl0(new qrl0((byte) 5));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("logout", 1, b7xVar), ((fxl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 24:
                ((Number) obj3).intValue();
                return new anl0(2, ((p231) obj).a);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                anl0 anl0Var = (anl0) obj;
                if (j6f0.a[((h6f0) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC6 = anl0Var.a.c();
                x6h1VarC6.i.add(new a7h1("find_playlists_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:genre:made-for-x-hub")), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
            case 26:
                ktl0 ktl0Var = (n8h1) obj;
                p7f0 p7f0Var = (p7f0) obj2;
                o7f0 o7f0Var = (o7f0) obj4;
                ktl0 ktl0Var2 = ktl0Var instanceof ktl0 ? ktl0Var : null;
                if (ktl0Var2 == null) {
                    return null;
                }
                if (!o7f0Var.equals(o7f0.a)) {
                    eg.o();
                    return null;
                }
                if (p7f0Var.h) {
                    return ktl0Var2.h();
                }
                return null;
            case 27:
                return new eel0(Integer.valueOf(((Number) obj3).intValue()), ((tef0) obj2).b, (r6h1) obj4);
            case 28:
                eel0 eel0Var = (eel0) obj;
                ref0 ref0Var = (ref0) obj4;
                if (ref0Var.equals(lef0.a)) {
                    String str3 = nik1.R0.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), eel0Var.b, eel0Var.a, System.currentTimeMillis());
                } else if (!(ref0Var instanceof nef0) && !(ref0Var instanceof mef0) && !(ref0Var instanceof qef0) && !(ref0Var instanceof pef0) && !(ref0Var instanceof oef0)) {
                    eg.o();
                }
                return w7h1Var;
            default:
                ojf0 ojf0Var = (ojf0) obj2;
                ((Number) obj3).intValue();
                String str4 = ojf0Var.a.d;
                uel0 uel0Var = new uel0(str4);
                return ojf0Var.O0 instanceof kfm0 ? new sqk0(new g5l0(str4, uel0Var.b(), (byte) 20), str4, (byte) 0) : uel0Var;
        }
    }
}
