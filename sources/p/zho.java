package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zho extends hab0 implements zu30 {
    public static final zho N0;
    public static final zho O0;
    public static final zho P0;
    public static final zho Q0;
    public static final zho R0;
    public static final zho S0;
    public static final zho T0;
    public static final zho U0;
    public static final zho V0;
    public static final zho W0;
    public static final zho X;
    public static final zho X0;
    public static final zho Y;
    public static final zho Y0;
    public static final zho Z;
    public static final zho Z0;
    public static final zho a1;
    public static final zho b;
    public static final zho b1;
    public static final zho c;
    public static final zho c1;
    public static final zho d;
    public static final zho d1;
    public static final zho e;
    public static final zho e1;
    public static final zho f;
    public static final zho g;
    public static final zho h;
    public static final zho i;
    public static final zho t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new zho(i2, (byte) 0);
        c = new zho(i2, (byte) 1);
        d = new zho(i2, (byte) 2);
        e = new zho(i2, (byte) 3);
        f = new zho(i2, (byte) 4);
        g = new zho(i2, (byte) 5);
        h = new zho(i2, (byte) 6);
        i = new zho(i2, (byte) 7);
        t = new zho(i2, (byte) 8);
        X = new zho(i2, (byte) 9);
        Y = new zho(i2, (byte) 10);
        Z = new zho(i2, (byte) 11);
        N0 = new zho(i2, (byte) 12);
        O0 = new zho(i2, (byte) 13);
        P0 = new zho(i2, (byte) 14);
        Q0 = new zho(i2, (byte) 15);
        R0 = new zho(i2, (byte) 16);
        S0 = new zho(i2, (byte) 17);
        T0 = new zho(i2, (byte) 18);
        U0 = new zho(i2, (byte) 19);
        V0 = new zho(i2, (byte) 20);
        W0 = new zho(i2, (byte) 21);
        X0 = new zho(i2, (byte) 22);
        Y0 = new zho(i2, (byte) 23);
        Z0 = new zho(i2, (byte) 24);
        a1 = new zho(i2, (byte) 25);
        b1 = new zho(i2, (byte) 26);
        c1 = new zho(i2, (byte) 27);
        d1 = new zho(i2, (byte) 28);
        e1 = new zho(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zho(int i2, byte b2) {
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
        boolean z = false;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                vho vhoVar = (vho) obj3;
                String str = vhoVar.b;
                jpk0 jpk0Var = new jpk0((k4l0) obj, str);
                if (yho.a[((iho) obj4).ordinal()] == 1) {
                    return vhoVar.c ? jpk0Var.p(str) : jpk0Var.n(str);
                }
                eg.o();
                return null;
            case 1:
                ((Number) obj3).intValue();
                return new l4l0((r6h1) obj4);
            case 2:
                l4l0 l4l0Var = (l4l0) obj;
                rjo rjoVar = (rjo) obj2;
                r6h1 r6h1Var = l4l0Var.a;
                y6h1 y6h1Var = l4l0Var.b;
                int iOrdinal = ((pjo) obj4).ordinal();
                if (iOrdinal == 0) {
                    String str2 = rjoVar.a;
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("curation_button", (String) null, (Integer) null, str2, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    String str3 = rjoVar.a;
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("undo_dislike_button", (String) null, (Integer) null, str3, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    String str4 = rjoVar.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_dislike", 1, Collections.singletonMap("item_no_longer_disliked", str4 != null ? str4 : "")), y6h1VarA, r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 3:
                ((Number) obj3).intValue();
                return new l4l0((r6h1) obj4);
            case 4:
                l4l0 l4l0Var2 = (l4l0) obj;
                yjo yjoVar = (yjo) obj2;
                r6h1 r6h1Var2 = l4l0Var2.a;
                y6h1 y6h1Var2 = l4l0Var2.b;
                int iOrdinal2 = ((wjo) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    String str5 = yjoVar.c;
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("curation_button", (String) null, (Integer) null, str5, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    String str6 = yjoVar.c;
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("undo_dislike_button", (String) null, (Integer) null, str6, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC4.a();
                    String str7 = yjoVar.c;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_dislike", 1, Collections.singletonMap("item_no_longer_disliked", str7 != null ? str7 : "")), y6h1VarA2, r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 5:
                ((Number) obj3).intValue();
                return new yuk0(new bqk0(pcf.d(6, ((bvo) obj).d, (String) null), (byte) 22));
            case 6:
                yuk0 yuk0Var = (yuk0) obj;
                bvo bvoVar = (bvo) obj2;
                if (((avo) obj4).equals(avo.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", pcf.j(bvoVar.c.a.a))), yuk0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 7:
                f5l0 f5l0Var = (f5l0) obj;
                if (((lvo) obj4).equals(lvo.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), f5l0Var.b, f5l0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 8:
                qfd qfdVar = (qfd) obj;
                l1z l1zVar = (l1z) obj2;
                hzy hzyVar = (hzy) obj3;
                w281 w281Var = (w281) obj4;
                if (qfdVar == null) {
                    return null;
                }
                boolean z2 = l1zVar != null ? l1zVar.e : false;
                o3r o3rVar = e4r.a;
                if ((hzyVar != null ? hzyVar.a : 0) == 6) {
                    if ((w281Var != null ? w281Var.a : null) instanceof o281) {
                        z = true;
                    }
                }
                return e4r.b(qfdVar, z2, z);
            case 9:
                ((Number) obj3).intValue();
                return new o7l0();
            case 10:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), ((srl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 11:
                prk0 prk0Var = (prk0) obj;
                s04 s04Var = (s04) obj4;
                r6h1 r6h1Var3 = prk0Var.a;
                y6h1 y6h1Var3 = prk0Var.b;
                if (s04Var.equals(s04.a)) {
                    x6h1 x6h1VarC5 = y6h1Var3.c();
                    x6h1VarC5.i.add(new a7h1("back_to_the_top_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("quick_scroll", 1, b7xVar), x6h1VarC5.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if (!s04Var.equals(s04.b)) {
                        return null;
                    }
                    x6h1 x6h1VarC6 = y6h1Var3.c();
                    x6h1VarC6.i.add(new a7h1("back_to_the_top_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = true;
                    w7h1Var3 = new w7h1("", "", new z7h1("scroll", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 12:
                ((Number) obj3).intValue();
                return new lwk0((r6h1) obj4);
            case 13:
                lwk0 lwk0Var = (lwk0) obj;
                gsf gsfVar = (gsf) obj4;
                r6h1 r6h1Var4 = lwk0Var.a;
                y6h1 y6h1Var4 = lwk0Var.b;
                if (gsfVar instanceof bsf) {
                    x6h1 x6h1VarC7 = y6h1Var4.c();
                    x6h1VarC7.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1Var4, System.currentTimeMillis());
                } else if (gsfVar instanceof csf) {
                    x6h1 x6h1VarC8 = y6h1Var4.c();
                    x6h1VarC8.i.add(new a7h1("end_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1Var4, System.currentTimeMillis());
                } else if (gsfVar instanceof esf) {
                    x6h1 x6h1VarC9 = y6h1Var4.c();
                    x6h1VarC9.i.add(new a7h1("leave_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), r6h1Var4, System.currentTimeMillis());
                } else if (gsfVar instanceof dsf) {
                    x6h1 x6h1VarC10 = y6h1Var4.c();
                    x6h1VarC10.i.add(new a7h1("join_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), x6h1VarC10.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!gsfVar.equals(fsf.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC11 = y6h1Var4.c();
                    x6h1VarC11.i.add(new a7h1("create_and_share_jam", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC11.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 14:
                ((Number) obj3).intValue();
                return new zxk0("", (r6h1) obj4);
            case 15:
                zxk0 zxk0Var = (zxk0) obj;
                x1l x1lVar = (x1l) obj3;
                if (((v1l) obj4).equals(v1l.a)) {
                    return lmt0.t(zxk0Var, x1lVar.a);
                }
                eg.o();
                return null;
            case 16:
                ((Number) obj3).intValue();
                return new zxk0("", (r6h1) obj4);
            case 17:
                zxk0 zxk0Var2 = (zxk0) obj;
                g3l g3lVar = (g3l) obj3;
                if (((e3l) obj4).equals(e3l.a)) {
                    return lmt0.t(zxk0Var2, g3lVar.b);
                }
                eg.o();
                return null;
            case 18:
                ((Number) obj3).intValue();
                r6h1 r6h1Var5 = (r6h1) obj4;
                UUID uuid = ((bnl) obj2).g;
                if (uuid != null) {
                    return new kyk0(uuid, r6h1Var5);
                }
                hhg1.n("Required value was null.");
                return null;
            case 19:
                return null;
            case 20:
                ((Number) obj3).intValue();
                return new yqk0((r6h1) obj4);
            case 21:
                yqk0 yqk0Var = (yqk0) obj;
                if (qqr.a[((gqn) obj4).ordinal()] == 1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:new:playlist")), yqk0Var.b, yqk0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 22:
                return new c5m0("dsa_banner", Integer.valueOf(((Number) obj3).intValue()), null, "RecommendationsDisabledBottomSheet", (r6h1) obj4);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                c5m0 c5m0Var = (c5m0) obj;
                if (((fz01) obj4) == fz01.a) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), c5m0Var.b, c5m0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 24:
                ((Number) obj3).intValue();
                return new o4l0(new py9((r6h1) obj4, (byte) 26), ((p7r) obj).a);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                o4l0 o4l0Var = (o4l0) obj;
                if (((o7r) obj4).equals(o7r.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:playlist:37i9dQZF1EP6YuccBxUcC1")), o4l0Var.a, o4l0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 26:
                zdy zdyVar = (zdy) obj;
                return new c5m0(ab80.e(qxy0.z(zdyVar.d, zdyVar.p)), Integer.valueOf(((Number) obj3).intValue()), null, zdyVar.a, (r6h1) obj4);
            case 27:
                c5m0 c5m0Var2 = (c5m0) obj;
                zdy zdyVar2 = (zdy) obj2;
                int iOrdinal3 = ((ydy) obj4).ordinal();
                if (iOrdinal3 == 0) {
                    return c5m0Var2.a(zdyVar2.a);
                }
                if (iOrdinal3 == 1) {
                    return c5m0Var2.g();
                }
                eg.o();
                return null;
            case 28:
                lpy lpyVar = (lpy) obj;
                return new c5m0(ab80.e(qxy0.z(lpyVar.e, lpyVar.o)), Integer.valueOf(((Number) obj3).intValue()), lpyVar.m, lpyVar.a, (r6h1) obj4);
            default:
                c5m0 c5m0Var3 = (c5m0) obj;
                lpy lpyVar2 = (lpy) obj2;
                y6h1 y6h1Var5 = c5m0Var3.b;
                String str8 = lpyVar2.a;
                switch (((kpy) obj4).ordinal()) {
                    case 0:
                        w7h1Var5 = !lpyVar2.d ? new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("pin_item", 1, Collections.singletonMap("item_to_pin", str8 != null ? str8 : "")), y6h1Var5, c5m0Var3.a, System.currentTimeMillis()) : new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("unpin_item", 1, Collections.singletonMap("item_to_unpin", str8 != null ? str8 : "")), y6h1Var5, c5m0Var3.a, System.currentTimeMillis());
                        break;
                    case 1:
                        return c5m0Var3.a(str8);
                    case 2:
                        x6h1 x6h1VarC12 = y6h1Var5.c();
                        x6h1VarC12.i.add(new a7h1("pin_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC12.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pin_item", 1, Collections.singletonMap("item_to_pin", str8 != null ? str8 : "")), x6h1VarC12.a(), c5m0Var3.a, System.currentTimeMillis());
                        break;
                    case 3:
                        return c5m0Var3.g();
                    case 4:
                        x6h1 x6h1VarC13 = y6h1Var5.c();
                        x6h1VarC13.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC13.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_recent_searches_item", 1, b7xVar), x6h1VarC13.a(), c5m0Var3.a, System.currentTimeMillis());
                    case 5:
                        x6h1 x6h1VarC14 = y6h1Var5.c();
                        x6h1VarC14.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC14.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC14.a(), c5m0Var3.a, System.currentTimeMillis());
                    case 6:
                        x6h1 x6h1VarC15 = y6h1Var5.c();
                        x6h1VarC15.i.add(new a7h1("follow_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC15.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str8 != null ? str8 : "")), x6h1VarC15.a(), c5m0Var3.a, System.currentTimeMillis());
                        break;
                    case 7:
                        return null;
                    default:
                        eg.o();
                        return null;
                }
                return w7h1Var5;
        }
    }
}
