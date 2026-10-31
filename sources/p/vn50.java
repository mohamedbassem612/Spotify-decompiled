package p;

import android.content.Context;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vn50 extends hab0 implements zu30 {
    public static final vn50 N0;
    public static final vn50 O0;
    public static final vn50 P0;
    public static final vn50 Q0;
    public static final vn50 R0;
    public static final vn50 S0;
    public static final vn50 T0;
    public static final vn50 U0;
    public static final vn50 V0;
    public static final vn50 W0;
    public static final vn50 X;
    public static final vn50 X0;
    public static final vn50 Y;
    public static final vn50 Y0;
    public static final vn50 Z;
    public static final vn50 Z0;
    public static final vn50 a1;
    public static final vn50 b;
    public static final vn50 b1;
    public static final vn50 c;
    public static final vn50 c1;
    public static final vn50 d;
    public static final vn50 d1;
    public static final vn50 e;
    public static final vn50 e1;
    public static final vn50 f;
    public static final vn50 g;
    public static final vn50 h;
    public static final vn50 i;
    public static final vn50 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new vn50(i2, (byte) 0);
        c = new vn50(i2, (byte) 1);
        d = new vn50(i2, (byte) 2);
        e = new vn50(i2, (byte) 3);
        f = new vn50(i2, (byte) 4);
        g = new vn50(i2, (byte) 5);
        h = new vn50(i2, (byte) 6);
        i = new vn50(i2, (byte) 7);
        t = new vn50(i2, (byte) 8);
        X = new vn50(i2, (byte) 9);
        Y = new vn50(i2, (byte) 10);
        Z = new vn50(i2, (byte) 11);
        N0 = new vn50(i2, (byte) 12);
        O0 = new vn50(i2, (byte) 13);
        P0 = new vn50(i2, (byte) 14);
        Q0 = new vn50(i2, (byte) 15);
        R0 = new vn50(i2, (byte) 16);
        S0 = new vn50(i2, (byte) 17);
        T0 = new vn50(i2, (byte) 18);
        U0 = new vn50(i2, (byte) 19);
        V0 = new vn50(i2, (byte) 20);
        W0 = new vn50(i2, (byte) 21);
        X0 = new vn50(i2, (byte) 22);
        Y0 = new vn50(i2, (byte) 23);
        Z0 = new vn50(i2, (byte) 24);
        a1 = new vn50(i2, (byte) 25);
        b1 = new vn50(i2, (byte) 26);
        c1 = new vn50(i2, (byte) 27);
        d1 = new vn50(i2, (byte) 28);
        e1 = new vn50(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn50(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        byte b2 = this.a;
        j460 j460Var = j460.a;
        q460 q460Var = q460.a;
        p460 p460Var = p460.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                un50 un50Var = (un50) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var = r6h1.c;
                return new uuk0(Integer.valueOf(un50Var.d), un50Var.b, new nqk0(new wuk0()));
            case 1:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((un50) obj2).b)), ((uuk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 2:
                ((Number) obj3).intValue();
                r6h1 r6h1Var2 = r6h1.c;
                return new rbl0();
            case 3:
                rbl0 rbl0Var = (rbl0) obj;
                if (!(((po50) obj4) instanceof mo50)) {
                    return null;
                }
                String str = nik1.w1.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), rbl0Var.a, r6h1.c, System.currentTimeMillis());
            case 4:
                lpl0 lpl0Var = (lpl0) obj;
                kq50 kq50Var = (kq50) obj2;
                if (((jq50) obj4).equals(jq50.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", kq50Var.a.b)), lpl0Var.a, lpl0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 5:
                ael0 ael0Var = (n8h1) obj;
                iw50 iw50Var = (iw50) obj4;
                if (iw50Var instanceof fw50) {
                    ael0 ael0Var2 = ael0Var;
                    String str2 = nik1.R0.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), ael0Var2.a, ael0Var2.b.a, System.currentTimeMillis());
                } else if (iw50Var instanceof gw50) {
                    bel0 bel0Var = (bel0) ael0Var;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), bel0Var.a, bel0Var.b.a, System.currentTimeMillis());
                } else {
                    if (!(iw50Var instanceof hw50)) {
                        eg.o();
                        return null;
                    }
                    del0 del0Var = (del0) ael0Var;
                    String str3 = nik1.R0.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), del0Var.a, del0Var.b.a, System.currentTimeMillis());
                }
                return w7h1Var;
            case 6:
                j060 j060Var = (j060) obj;
                ((Number) obj3).intValue();
                y6h1 y6h1Var = (y6h1) o7h.s0(((r6h1) obj4).a);
                return new y3l0(new txk0(y6h1Var != null ? y6h1Var.h.b : null, j060Var.a, (byte) 5));
            case 7:
                y3l0 y3l0Var = (y3l0) obj;
                if (((zz50) obj4).equals(zz50.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y3l0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 8:
                return new qob((Context) obj2, (byte) 1);
            case 9:
                ((Number) obj3).intValue();
                return new aal0(5, ((k460) obj).e, (r6h1) obj4);
            case 10:
                aal0 aal0Var = (aal0) obj;
                String str4 = ((k460) obj2).e;
                if (!((j460) obj4).equals(j460Var)) {
                    eg.o();
                } else if (str4 != null) {
                    if ((!ihc1.y0(str4) ? str4 : null) != null) {
                        return aal0Var.a(str4);
                    }
                }
                return null;
            case 11:
                ((Number) obj3).intValue();
                return new zzl0((r6h1) obj4);
            case 12:
                zzl0 zzl0Var = (zzl0) obj;
                String str5 = ((k460) obj2).e;
                if (!((j460) obj4).equals(j460Var)) {
                    eg.o();
                } else if (str5 != null) {
                    if ((!ihc1.y0(str5) ? str5 : null) != null) {
                        return zzl0Var.a(str5);
                    }
                }
                return null;
            case 13:
                ((Number) obj3).intValue();
                return new aal0(5, ((s460) obj).d, (r6h1) obj4);
            case 14:
                aal0 aal0Var2 = (aal0) obj;
                r460 r460Var = (r460) obj4;
                String str6 = ((s460) obj2).d;
                if (r460Var.equals(p460Var)) {
                    if (str6 != null) {
                        if ((!ihc1.y0(str6) ? str6 : null) != null) {
                            return aal0Var2.a(str6);
                        }
                    }
                } else {
                    if (r460Var.equals(q460Var)) {
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), aal0Var2.b, aal0Var2.a, System.currentTimeMillis());
                    }
                    eg.o();
                }
                return null;
            case 15:
                ((Number) obj3).intValue();
                return new zzl0((r6h1) obj4);
            case 16:
                zzl0 zzl0Var2 = (zzl0) obj;
                r460 r460Var2 = (r460) obj4;
                String str7 = ((s460) obj2).d;
                if (r460Var2.equals(p460Var)) {
                    if (str7 != null) {
                        if ((!ihc1.y0(str7) ? str7 : null) != null) {
                            return zzl0Var2.a(str7);
                        }
                    }
                } else if (!r460Var2.equals(q460Var)) {
                    eg.o();
                }
                return null;
            case 17:
                t660 t660Var = (t660) obj;
                ((Number) obj3).intValue();
                return new cfl0(Integer.valueOf(t660Var.a), t660Var.b, new tdl0((byte) 3));
            case 18:
                t660 t660Var2 = (t660) obj2;
                q660 q660Var = (r660) obj4;
                y6h1 y6h1Var2 = ((cfl0) obj).a;
                if (q660Var instanceof p660) {
                    String str8 = t660Var2.h;
                    if (str8 != null) {
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8)), y6h1Var2, r6h1.c, System.currentTimeMillis());
                        return w7h1Var2;
                    }
                    return null;
                }
                if (!(q660Var instanceof q660)) {
                    eg.o();
                    return null;
                }
                String str9 = q660Var.a;
                w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str9 != null ? str9 : "")), y6h1Var2, r6h1.c, System.currentTimeMillis());
                return w7h1Var2;
            case 19:
                sa60 sa60Var = (sa60) obj;
                ((Number) obj3).intValue();
                r6m0 r6m0Var = new r6m0();
                String str10 = sa60Var.a;
                qc60 qc60Var = sa60Var.d;
                return new q6m0(r6m0Var, str10, Integer.valueOf(qc60Var.a), qc60Var.b, qc60Var.c);
            case 20:
                ta60 ta60Var = (ta60) obj;
                ((Number) obj3).intValue();
                return new u5m0(new v5m0(new brl0((byte) 29)), ta60Var.a, Integer.valueOf(ta60Var.b));
            case 21:
                sa60 sa60Var2 = (sa60) obj2;
                oa60 oa60Var = (qa60) obj4;
                y6h1 y6h1Var3 = ((q6m0) obj).a;
                String str11 = sa60Var2.a;
                c380 c380Var = sa60Var2.X;
                qc60 qc60Var2 = sa60Var2.d;
                String str12 = qc60Var2.c;
                if (oa60Var instanceof na60) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", sa60Var2.h.a)), y6h1Var3, r6h1.c, System.currentTimeMillis());
                } else {
                    if (oa60Var instanceof pa60) {
                        y6h1 y6h1Var4 = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-your-listening-timeline";
                        x6h1VarI.f = "12.0.0";
                        x6h1VarI.g = "22.0.0";
                        y6h1 y6h1VarA = x6h1VarI.a();
                        r6h1 r6h1Var3 = r6h1.c;
                        r6h1 r6h1Var4 = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
                        y6h1 y6h1Var5 = y6h1.i;
                        x6h1 x6h1VarI2 = i3o1.i();
                        x6h1VarI2.h = "music";
                        x6h1VarI2.a = "mobile-your-listening-sharing";
                        x6h1VarI2.f = "3.0.0";
                        x6h1VarI2.g = "22.0.0";
                        y6h1 y6h1VarA2 = x6h1VarI2.a();
                        String str13 = qc60Var2.b;
                        Integer numValueOf = Integer.valueOf(qc60Var2.a);
                        x6h1 x6h1VarC = y6h1VarA2.c();
                        x6h1VarC.i.add(new a7h1("highlights_share_button", str11, numValueOf, str12, str13));
                        x6h1VarC.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", str12), new mmr0("share_id", str11)})), x6h1VarC.a(), r6h1Var4, System.currentTimeMillis());
                    }
                    int i2 = -1;
                    if (oa60Var instanceof oa60) {
                        Iterator it = c380Var.iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            if (((r960) it.next()).a.equals(oa60Var.a)) {
                                i2 = i3;
                                Integer numValueOf2 = Integer.valueOf(i2);
                                String str14 = oa60Var.a;
                                x6h1 x6h1VarC2 = y6h1Var3.c();
                                x6h1VarC2.i.add(new a7h1("track_row", (String) null, numValueOf2, str14, (String) null));
                                x6h1VarC2.j = false;
                                w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str14)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                            } else {
                                i3++;
                            }
                        }
                        Integer numValueOf3 = Integer.valueOf(i2);
                        String str15 = oa60Var.a;
                        x6h1 x6h1VarC3 = y6h1Var3.c();
                        x6h1VarC3.i.add(new a7h1("track_row", (String) null, numValueOf3, str15, (String) null));
                        x6h1VarC3.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str15)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (!(oa60Var instanceof ma60)) {
                            eg.o();
                            return null;
                        }
                        Iterator it2 = c380Var.iterator();
                        int i4 = 0;
                        while (it2.hasNext()) {
                            if (((r960) it2.next()).a.equals(((ma60) oa60Var).a)) {
                                i2 = i4;
                                Integer numValueOf4 = Integer.valueOf(i2);
                                String str16 = ((ma60) oa60Var).a;
                                x6h1 x6h1VarC4 = y6h1Var3.c();
                                x6h1VarC4.i.add(new a7h1("track_row", (String) null, numValueOf4, str16, (String) null));
                                x6h1VarC4.j = false;
                                x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                                x6h1VarC5.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC5.j = false;
                                w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                            } else {
                                i4++;
                            }
                        }
                        Integer numValueOf5 = Integer.valueOf(i2);
                        String str17 = ((ma60) oa60Var).a;
                        x6h1 x6h1VarC6 = y6h1Var3.c();
                        x6h1VarC6.i.add(new a7h1("track_row", (String) null, numValueOf5, str17, (String) null));
                        x6h1VarC6.j = false;
                        x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                        x6h1VarC7.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                    }
                }
                return w7h1Var3;
            case 22:
                return null;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj3).intValue();
                return new v5m0(new brl0((byte) 29));
            case 24:
                mb60 mb60Var = (mb60) obj2;
                lb60 lb60Var = (lb60) obj4;
                int i5 = lb60Var.b;
                if (i5 < 0 || i5 >= mb60Var.a().size()) {
                    return null;
                }
                rb60 rb60Var = (rb60) mb60Var.a().get(i5);
                y6h1 y6h1Var6 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-your-listening-highlight-details";
                x6h1VarI3.f = "2.1.0";
                x6h1VarI3.g = "22.0.0";
                x6h1 x6h1VarR = kk0.r(x6h1VarI3, "listeningstats/highlight-details");
                x6h1VarR.i.add(new a7h1("highlights_carousel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = false;
                y6h1 y6h1VarA3 = x6h1VarR.a();
                String id = rb60Var.getId();
                Integer numValueOf6 = Integer.valueOf(i5);
                x6h1 x6h1VarC8 = y6h1VarA3.c();
                x6h1VarC8.i.add(new a7h1("highlight_item", id, numValueOf6, (String) null, (String) null));
                x6h1VarC8.j = true;
                y6h1 y6h1VarA4 = x6h1VarC8.a();
                int i6 = lb60Var.a;
                if (i5 > i6) {
                    w7h1Var4 = new w7h1("", "", new z7h1("swipe_left", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA4, r6h1.c, System.currentTimeMillis());
                } else {
                    if (i5 >= i6) {
                        return null;
                    }
                    w7h1Var4 = new w7h1("", "", new z7h1("swipe_right", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA4, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var4;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                fc60 fc60Var = (fc60) obj;
                ((Number) obj3).intValue();
                return new w5m0(Integer.valueOf(fc60Var.d), fc60Var.a, new brl0((byte) 29));
            case 26:
                w5m0 w5m0Var = (w5m0) obj;
                fc60 fc60Var2 = (fc60) obj2;
                if (!((ec60) obj4).equals(ec60.a)) {
                    eg.o();
                    return null;
                }
                String str18 = fc60Var2.e;
                String str19 = fc60Var2.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str18 == null) {
                    str18 = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", str18), new mmr0("share_id", str19 != null ? str19 : "")})), w5m0Var.a, r6h1.c, System.currentTimeMillis());
            case 27:
                hd60 hd60Var = (hd60) obj;
                ((Number) obj3).intValue();
                return new n6m0(new sqk0(new p6m0((byte) 0)), hd60Var.a, Integer.valueOf(hd60Var.j));
            case 28:
                n6m0 n6m0Var = (n6m0) obj;
                String str20 = ((hd60) obj2).i;
                if (str20 != null) {
                    return n6m0Var.a(str20);
                }
                return null;
            default:
                wvl0 wvl0Var = (wvl0) obj;
                rd60 rd60Var = (rd60) obj3;
                pd60 pd60Var = (pd60) obj4;
                String str21 = ((qd60) obj2).a;
                if (pd60Var instanceof od60) {
                    return wvl0Var.a(str21);
                }
                if (pd60Var.equals(nd60.a)) {
                    qgl0 qgl0Var = new qgl0(wvl0Var);
                    return rd60Var.c ? qgl0Var.m(str21) : qgl0Var.l(str21);
                }
                eg.o();
                return null;
        }
    }
}
