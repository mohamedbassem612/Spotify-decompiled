package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c9x extends hab0 implements zu30 {
    public static final c9x N0;
    public static final c9x O0;
    public static final c9x P0;
    public static final c9x Q0;
    public static final c9x R0;
    public static final c9x S0;
    public static final c9x T0;
    public static final c9x U0;
    public static final c9x V0;
    public static final c9x W0;
    public static final c9x X;
    public static final c9x X0;
    public static final c9x Y;
    public static final c9x Y0;
    public static final c9x Z;
    public static final c9x Z0;
    public static final c9x a1;
    public static final c9x b;
    public static final c9x b1;
    public static final c9x c;
    public static final c9x c1;
    public static final c9x d;
    public static final c9x d1;
    public static final c9x e;
    public static final c9x e1;
    public static final c9x f;
    public static final c9x g;
    public static final c9x h;
    public static final c9x i;
    public static final c9x t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new c9x(i2, (byte) 0);
        c = new c9x(i2, (byte) 1);
        d = new c9x(i2, (byte) 2);
        e = new c9x(i2, (byte) 3);
        f = new c9x(i2, (byte) 4);
        g = new c9x(i2, (byte) 5);
        h = new c9x(i2, (byte) 6);
        i = new c9x(i2, (byte) 7);
        t = new c9x(i2, (byte) 8);
        X = new c9x(i2, (byte) 9);
        Y = new c9x(i2, (byte) 10);
        Z = new c9x(i2, (byte) 11);
        N0 = new c9x(i2, (byte) 12);
        O0 = new c9x(i2, (byte) 13);
        P0 = new c9x(i2, (byte) 14);
        Q0 = new c9x(i2, (byte) 15);
        R0 = new c9x(i2, (byte) 16);
        S0 = new c9x(i2, (byte) 17);
        T0 = new c9x(i2, (byte) 18);
        U0 = new c9x(i2, (byte) 19);
        V0 = new c9x(i2, (byte) 20);
        W0 = new c9x(i2, (byte) 21);
        X0 = new c9x(i2, (byte) 22);
        Y0 = new c9x(i2, (byte) 23);
        Z0 = new c9x(i2, (byte) 24);
        a1 = new c9x(i2, (byte) 25);
        b1 = new c9x(i2, (byte) 26);
        c1 = new c9x(i2, (byte) 27);
        d1 = new c9x(i2, (byte) 28);
        e1 = new c9x(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9x(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        String str;
        byte b2 = this.a;
        int i2 = 3;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var6 = null;
        switch (b2) {
            case 0:
                if (obj4 != null) {
                    bhn0.d();
                }
                return null;
            case 1:
                ((Number) obj3).intValue();
                return new jml0((r6h1) obj4);
            case 2:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                du1 du1Var = ((l9x) obj).a.a;
                if (du1Var.equals(ndv.c)) {
                    i2 = 2;
                } else if (du1Var.equals(mdv.c)) {
                    i2 = 1;
                } else if (!du1Var.equals(odv.c)) {
                    eg.o();
                    return null;
                }
                return new p4l0(i2, r6h1Var);
            case 3:
                jml0 jml0Var = (jml0) obj;
                if (n9x.a[((j9x) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC = jml0Var.b.c();
                x6h1VarC.i.add(new a7h1("add_songs_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), jml0Var.a, System.currentTimeMillis());
            case 4:
                return null;
            case 5:
                ((Number) obj3).intValue();
                return new ryk0((r6h1) obj4);
            case 6:
                return ((ryk0) obj).e();
            case 7:
                ((Number) obj3).intValue();
                return new z6l0(new txk0(((q7y) obj).h, (byte) 17));
            case 8:
                q7y q7yVar = (q7y) obj2;
                p7y p7yVar = (p7y) obj4;
                y6h1 y6h1Var = ((z6l0) obj).a;
                if (p7yVar.equals(o7y.a)) {
                    String str2 = q7yVar.f;
                    if (str2 == null) {
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("engage_with_paywall", 1, sqg0.J(new mmr0[]{new mmr0("entity_uri", q7yVar.h), new mmr0("engagement_type", str2)})), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!p7yVar.equals(n7y.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            case 9:
                ((Number) obj3).intValue();
                return new vxl0(((v9y) obj2).a);
            case 10:
                r9y r9yVar = (s9y) obj4;
                y6h1 y6h1Var2 = ((vxl0) obj).a;
                List list = ((v9y) obj3).O0;
                if (r9yVar instanceof r9y) {
                    int iOrdinal = r9yVar.a.ordinal();
                    if (iOrdinal == 0) {
                        x6h1 x6h1VarC4 = y6h1Var2.c();
                        x6h1VarC4.i.add(new a7h1("color_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                    } else if (iOrdinal == 1) {
                        x6h1 x6h1VarC5 = y6h1Var2.c();
                        x6h1VarC5.i.add(new a7h1("image_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                    } else if (iOrdinal == 2) {
                        x6h1 x6h1VarC6 = y6h1Var2.c();
                        x6h1VarC6.i.add(new a7h1("text_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (iOrdinal != 3) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC7 = y6h1Var2.c();
                        x6h1VarC7.i.add(new a7h1("stickers_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                    }
                    return w7h1Var2;
                }
                if (r9yVar instanceof i9y) {
                    x6h1 x6h1VarC8 = y6h1Var2.c();
                    x6h1VarC8.i.add(new a7h1("done_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                }
                if (r9yVar instanceof g9y) {
                    x6h1 x6h1VarC9 = y6h1Var2.c();
                    x6h1VarC9.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                }
                if (r9yVar instanceof m9y) {
                    int i3 = ((m9y) r9yVar).a;
                    t5t0 t5t0Var = (t5t0) o7h.t0(i3, list);
                    if (t5t0Var == null) {
                        return null;
                    }
                    String str3 = t5t0Var.b;
                    Integer numValueOf = Integer.valueOf(i3 + 1);
                    x6h1 x6h1VarC10 = y6h1Var2.c();
                    x6h1VarC10.i.add(new a7h1("sticker_image", str3, numValueOf, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("move_image", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(r9yVar instanceof l9y)) {
                        return null;
                    }
                    int i4 = ((l9y) r9yVar).a;
                    t5t0 t5t0Var2 = (t5t0) o7h.t0(i4, list);
                    if (t5t0Var2 == null) {
                        return null;
                    }
                    String str4 = t5t0Var2.b;
                    Integer numValueOf2 = Integer.valueOf(i4 + 1);
                    x6h1 x6h1VarC11 = y6h1Var2.c();
                    x6h1VarC11.i.add(new a7h1("delete_sticker_image", str4, numValueOf2, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 11:
                return null;
            case 12:
                jey jeyVar = (jey) obj2;
                y6h1 y6h1Var3 = ((e4m0) obj).a;
                if (((iey) obj4).equals(iey.a)) {
                    return jeyVar.c ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var3, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var3, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 13:
                a6l0 a6l0Var = (a6l0) obj;
                cgy cgyVar = (cgy) obj2;
                if (((bgy) obj4) == bgy.a) {
                    String str5 = cgyVar.a.f;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), a6l0Var.a, a6l0Var.b.b, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var6;
            case 14:
                int iIntValue = ((Number) obj3).intValue();
                return new ljl0(new mjl0(new njl0(Integer.valueOf(iIntValue), (r6h1) obj4)), Integer.valueOf(iIntValue));
            case 15:
                ljl0 ljl0Var = (ljl0) obj;
                xhy xhyVar = (xhy) obj3;
                uhy uhyVar = (uhy) obj4;
                y6h1 y6h1Var4 = ljl0Var.a;
                njl0 njl0Var = ljl0Var.b.c;
                String str6 = ((why) obj2).c;
                if (uhyVar.equals(thy.a)) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), y6h1Var4, njl0Var.a, System.currentTimeMillis());
                } else {
                    if (!uhyVar.equals(shy.a)) {
                        eg.o();
                        return null;
                    }
                    if (xhyVar.b) {
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str6 != null ? str6 : "")), y6h1Var4, njl0Var.a, System.currentTimeMillis());
                    } else {
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str6 != null ? str6 : "")), y6h1Var4, njl0Var.a, System.currentTimeMillis());
                    }
                }
                return w7h1Var3;
            case 16:
                sky skyVar = (sky) obj;
                ((Number) obj3).intValue();
                return new ivk0(vqo1.k(skyVar.d), Integer.valueOf(skyVar.c), skyVar.a, new jpk0(new jvk0(skyVar.e, (r6h1) obj4)));
            case 17:
                ivk0 ivk0Var = (ivk0) obj;
                y6h1 y6h1Var5 = ivk0Var.a;
                jvk0 jvk0Var = ivk0Var.b.c;
                String str7 = ((sky) obj2).a;
                int iOrdinal2 = ((qky) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    x6h1 x6h1VarC12 = y6h1Var5.c();
                    x6h1VarC12.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_entity_in_list", 1, Collections.singletonMap("entity_to_be_selected", str7 != null ? str7 : "")), x6h1VarC12.a(), jvk0Var.a, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7 != null ? str7 : "")), y6h1Var5, jvk0Var.a, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 18:
                jvk0 jvk0Var2 = (jvk0) obj;
                emy emyVar = (emy) obj2;
                dmy dmyVar = (dmy) obj4;
                r6h1 r6h1Var2 = jvk0Var2.a;
                y6h1 y6h1Var6 = jvk0Var2.b;
                String str8 = emyVar.c;
                int i5 = emyVar.f;
                int i6 = ((emy) obj3).e;
                if (dmyVar instanceof bmy) {
                    x6h1 x6h1VarC13 = y6h1Var6.c();
                    x6h1VarC13.i.add(new a7h1("entity_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    y6h1 y6h1VarA = x6h1VarC13.a();
                    String str9 = emyVar.c;
                    int iK = vqo1.k(i5);
                    Integer numValueOf3 = Integer.valueOf(i6);
                    x6h1 x6h1VarC14 = y6h1VarA.c();
                    x6h1VarC14.i.add(new a7h1("entity_row", (String) null, numValueOf3, str9, ktk0.c(iK)));
                    x6h1VarC14.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str8 != null ? str8 : "")), x6h1VarC14.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!(dmyVar instanceof amy)) {
                        if (dmyVar instanceof cmy) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC15 = y6h1Var6.c();
                    x6h1VarC15.i.add(new a7h1("entity_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC15.a();
                    String str10 = emyVar.c;
                    int iK2 = vqo1.k(i5);
                    Integer numValueOf4 = Integer.valueOf(i6);
                    x6h1 x6h1VarC16 = y6h1VarA2.c();
                    x6h1VarC16.i.add(new a7h1("entity_row", (String) null, numValueOf4, str10, ktk0.c(iK2)));
                    x6h1VarC16.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str8 != null ? str8 : "")), x6h1VarC16.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 19:
                koy koyVar = (koy) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                String str11 = koyVar.c;
                String str12 = koyVar.d;
                if (ihc1.y0(str12)) {
                    str12 = str11;
                }
                return new dvl0(str12, str11, koyVar.a, r6h1Var3);
            case 20:
                dvl0 dvl0Var = (dvl0) obj;
                koy koyVar2 = (koy) obj2;
                String str13 = koyVar2.a;
                if (!(((joy) obj4) instanceof hoy)) {
                    return null;
                }
                int iC = l1d.C(koyVar2.b);
                if (iC != 0) {
                    if (iC == 1) {
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str13 != null ? str13 : "")), dvl0Var.b, dvl0Var.a, System.currentTimeMillis());
                    }
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                }
                return dvl0Var.a(str13);
            case 21:
                return new c6l0(Integer.valueOf(((Number) obj3).intValue()), ((osy) obj).a.a, (r6h1) obj4);
            case 22:
                return null;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj3).intValue();
                return new lil0((r6h1) obj4);
            case 24:
                lil0 lil0Var = (lil0) obj;
                aty atyVar = (bty) obj3;
                if (atyVar instanceof zsy) {
                    return lil0Var.e(((zsy) atyVar).a);
                }
                if (atyVar instanceof aty) {
                    return lil0Var.e(atyVar.a);
                }
                if (atyVar.equals(ysy.a)) {
                    return null;
                }
                eg.o();
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new c6l0(Integer.valueOf(((Number) obj3).intValue()), ((lty) obj).a, (r6h1) obj4);
            case 26:
                return null;
            case 27:
                ((Number) obj3).intValue();
                return new kil0((r6h1) obj4);
            case 28:
                kil0 kil0Var = (kil0) obj;
                huy huyVar = (huy) obj3;
                if (!(((cuy) obj4) instanceof cuy)) {
                    eg.o();
                    return null;
                }
                if (!(huyVar instanceof guy) || (str = ((guy) huyVar).a) == null) {
                    return null;
                }
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), kil0Var.b, kil0Var.a, System.currentTimeMillis());
            default:
                b0z b0zVar = (b0z) obj;
                ((Number) obj3).intValue();
                p60 p60Var = b0zVar.b;
                return yz10.d(b0zVar.a, p60Var.l, p60Var.e);
        }
    }
}
