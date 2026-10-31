package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cnx0 extends hab0 implements zu30 {
    public static final cnx0 N0;
    public static final cnx0 O0;
    public static final cnx0 P0;
    public static final cnx0 Q0;
    public static final cnx0 R0;
    public static final cnx0 S0;
    public static final cnx0 T0;
    public static final cnx0 U0;
    public static final cnx0 V0;
    public static final cnx0 W0;
    public static final cnx0 X;
    public static final cnx0 X0;
    public static final cnx0 Y;
    public static final cnx0 Y0;
    public static final cnx0 Z;
    public static final cnx0 Z0;
    public static final cnx0 a1;
    public static final cnx0 b;
    public static final cnx0 b1;
    public static final cnx0 c;
    public static final cnx0 c1;
    public static final cnx0 d;
    public static final cnx0 d1;
    public static final cnx0 e;
    public static final cnx0 e1;
    public static final cnx0 f;
    public static final cnx0 g;
    public static final cnx0 h;
    public static final cnx0 i;
    public static final cnx0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new cnx0(i2, (byte) 0);
        c = new cnx0(i2, (byte) 1);
        d = new cnx0(i2, (byte) 2);
        e = new cnx0(i2, (byte) 3);
        f = new cnx0(i2, (byte) 4);
        g = new cnx0(i2, (byte) 5);
        h = new cnx0(i2, (byte) 6);
        i = new cnx0(i2, (byte) 7);
        t = new cnx0(i2, (byte) 8);
        X = new cnx0(i2, (byte) 9);
        Y = new cnx0(i2, (byte) 10);
        Z = new cnx0(i2, (byte) 11);
        N0 = new cnx0(i2, (byte) 12);
        O0 = new cnx0(i2, (byte) 13);
        P0 = new cnx0(i2, (byte) 14);
        Q0 = new cnx0(i2, (byte) 15);
        R0 = new cnx0(i2, (byte) 16);
        S0 = new cnx0(i2, (byte) 17);
        T0 = new cnx0(i2, (byte) 18);
        U0 = new cnx0(i2, (byte) 19);
        V0 = new cnx0(i2, (byte) 20);
        W0 = new cnx0(i2, (byte) 21);
        X0 = new cnx0(i2, (byte) 22);
        Y0 = new cnx0(i2, (byte) 23);
        Z0 = new cnx0(i2, (byte) 24);
        a1 = new cnx0(i2, (byte) 25);
        b1 = new cnx0(i2, (byte) 26);
        c1 = new cnx0(i2, (byte) 27);
        d1 = new cnx0(i2, (byte) 28);
        e1 = new cnx0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cnx0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        int i2 = 1;
        switch (b2) {
            case 0:
                vql0 vql0Var = (vql0) obj;
                umx0 umx0Var = (umx0) obj3;
                o600 o600Var = (o600) obj4;
                if (o600Var.equals(lwz.a)) {
                    return vql0Var.a(umx0Var.d);
                }
                if (o600Var.equals(owz.a)) {
                    return vql0Var.g();
                }
                return null;
            case 1:
                tmx0 tmx0Var = (tmx0) obj;
                return new wql0(Integer.valueOf(((Number) obj3).intValue()), tmx0Var.b, tmx0Var.c, (r6h1) obj4);
            case 2:
                return null;
            case 3:
                pnx0 pnx0Var = (pnx0) obj;
                return new qnx0(pnx0Var, (w281) obj2, (hzy) obj3, (jo70) obj4, pnx0Var.c);
            case 4:
                vql0 vql0Var2 = (vql0) obj;
                mox0 mox0Var = (mox0) obj3;
                if (((box0) obj4).equals(ynx0.a)) {
                    return vql0Var2.a(mox0Var.f);
                }
                return null;
            case 5:
                xnx0 xnx0Var = (xnx0) obj;
                return new wql0(Integer.valueOf(((Number) obj3).intValue()), xnx0Var.a, xnx0Var.b, (r6h1) obj4);
            case 6:
                return null;
            case 7:
                ((Number) obj3).intValue();
                return new vgl0((r6h1) obj4);
            case 8:
                return null;
            case 9:
                ((Number) obj3).intValue();
                return new crl0();
            case 10:
                crl0 crl0Var = (crl0) obj;
                nwx0 nwx0Var = (nwx0) obj4;
                r6h1 r6h1Var = crl0Var.a;
                y6h1 y6h1Var = crl0Var.b;
                if (nwx0Var.equals(mwx0.a)) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("previous_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                }
                if (!nwx0Var.equals(lwx0.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC2 = y6h1Var.c();
                x6h1VarC2.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
            case 11:
                ((Number) obj3).intValue();
                return new arl0(Integer.valueOf(((rwx0) obj).b), (r6h1) obj4);
            case 12:
                arl0 arl0Var = (arl0) obj;
                if (((qwx0) obj4).equals(qwx0.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), arl0Var.b, arl0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 13:
                orl0 orl0Var = (orl0) obj;
                vzx0 vzx0Var = (vzx0) obj4;
                r6h1 r6h1Var2 = orl0Var.a;
                y6h1 y6h1Var2 = orl0Var.b;
                if (vzx0Var instanceof rzx0) {
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("prompt_entry_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1Var2, System.currentTimeMillis());
                }
                if (vzx0Var instanceof uzx0) {
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("chip", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC4.a(), r6h1Var2, System.currentTimeMillis());
                }
                if (vzx0Var instanceof qzx0) {
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("edit_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1Var2, System.currentTimeMillis());
                }
                if (vzx0Var instanceof szx0) {
                    x6h1 x6h1VarC6 = y6h1Var2.c();
                    x6h1VarC6.i.add(new a7h1("refresh_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), x6h1VarC6.a(), r6h1Var2, System.currentTimeMillis());
                }
                if (vzx0Var instanceof pzx0) {
                    x6h1 x6h1VarC7 = y6h1Var2.c();
                    x6h1VarC7.i.add(new a7h1("delete_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_entity_in_list", 1, Collections.singletonMap("entity_to_be_removed", "")), x6h1VarC7.a(), r6h1Var2, System.currentTimeMillis());
                }
                if (vzx0Var instanceof tzx0) {
                    x6h1 x6h1VarC8 = y6h1Var2.c();
                    x6h1VarC8.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1Var2, System.currentTimeMillis());
                }
                if (!(vzx0Var instanceof ozx0) && !(vzx0Var instanceof nzx0)) {
                    eg.o();
                }
                return null;
            case 14:
                ((Number) obj3).intValue();
                return new grl0(new irl0((r6h1) obj4));
            case 15:
                grl0 grl0Var = (grl0) obj;
                c2y0 c2y0Var = (c2y0) obj3;
                y6h1 y6h1Var3 = grl0Var.a;
                r6h1 r6h1Var3 = grl0Var.b.a;
                if (((b2y0) obj4).equals(w1y0.a)) {
                    return c2y0Var.b != null ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var3, r6h1Var3, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:assisted-curation")), y6h1Var3, r6h1Var3, System.currentTimeMillis());
                }
                return null;
            case 16:
                ((Number) obj3).intValue();
                return new hrl0(new irl0((r6h1) obj4));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                a6y0 a6y0Var = (a6y0) obj2;
                ((Number) obj3).intValue();
                r6h1 r6h1Var4 = (r6h1) obj4;
                if (!(a6y0Var instanceof w5y0) && (a6y0Var instanceof z5y0)) {
                    i2 = 4;
                }
                return new frl0(i2, r6h1Var4);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                frl0 frl0Var = (frl0) obj;
                if (((u5y0) obj4) instanceof r5y0) {
                    return frl0Var.h();
                }
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj3).intValue();
                return new dml0(new fjl0((r6h1) obj4, (byte) 5));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                tcy0 tcy0Var = (tcy0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var5 = (r6h1) obj4;
                qcy0 qcy0Var = tcy0Var instanceof qcy0 ? (qcy0) tcy0Var : null;
                return new prl0(Integer.valueOf(iIntValue), tcy0Var.a(), qcy0Var != null ? qcy0Var.d : null, r6h1Var5);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                prl0 prl0Var = (prl0) obj;
                tcy0 tcy0Var2 = (tcy0) obj3;
                lcy0 lcy0Var = (lcy0) obj4;
                r6h1 r6h1Var6 = prl0Var.a;
                y6h1 y6h1Var4 = prl0Var.b;
                if (lcy0Var instanceof icy0) {
                    x6h1 x6h1VarC9 = y6h1Var4.c();
                    x6h1VarC9.i.add(new a7h1("prompt_entry_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), r6h1Var6, System.currentTimeMillis());
                } else if (lcy0Var instanceof gcy0) {
                    x6h1 x6h1VarC10 = y6h1Var4.c();
                    x6h1VarC10.i.add(new a7h1("edit_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), r6h1Var6, System.currentTimeMillis());
                } else if (lcy0Var instanceof jcy0) {
                    x6h1 x6h1VarC11 = y6h1Var4.c();
                    x6h1VarC11.i.add(new a7h1("refresh_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), x6h1VarC11.a(), r6h1Var6, System.currentTimeMillis());
                } else if (lcy0Var instanceof fcy0) {
                    x6h1 x6h1VarC12 = y6h1Var4.c();
                    x6h1VarC12.i.add(new a7h1("delete_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    y6h1 y6h1VarA = x6h1VarC12.a();
                    String strA = tcy0Var2.a();
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_entity_in_list", 1, Collections.singletonMap("entity_to_be_removed", strA != null ? strA : "")), y6h1VarA, r6h1Var6, System.currentTimeMillis());
                } else if (lcy0Var instanceof kcy0) {
                    x6h1 x6h1VarC13 = y6h1Var4.c();
                    x6h1VarC13.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC13.a(), r6h1Var6, System.currentTimeMillis());
                } else {
                    if (!(lcy0Var instanceof hcy0)) {
                        if (!(lcy0Var instanceof ecy0) && !(lcy0Var instanceof dcy0)) {
                            eg.o();
                        }
                        return null;
                    }
                    x6h1 x6h1VarC14 = y6h1Var4.c();
                    x6h1VarC14.i.add(new a7h1("navigate_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC14.a();
                    qcy0 qcy0Var2 = tcy0Var2 instanceof qcy0 ? (qcy0) tcy0Var2 : null;
                    String str = qcy0Var2 != null ? qcy0Var2.e : null;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA2, r6h1Var6, System.currentTimeMillis());
                }
                return w7h1Var;
            case 22:
                ((Number) obj3).intValue();
                r6h1 r6h1Var7 = r6h1.c;
                return new qql0(new yok0((byte) 24), Integer.valueOf(((ldy0) obj).a));
            case 23:
                qql0 qql0Var = (qql0) obj;
                if (((idy0) obj4) == idy0.a) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), qql0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj3).intValue();
                return new l5l0((r6h1) obj4);
            case 25:
                l5l0 l5l0Var = (l5l0) obj;
                doy0 doy0Var = (doy0) obj4;
                r6h1 r6h1Var8 = l5l0Var.a;
                y6h1 y6h1Var5 = l5l0Var.b;
                if (doy0Var instanceof coy0) {
                    x6h1 x6h1VarC15 = y6h1Var5.c();
                    x6h1VarC15.i.add(new a7h1("add_all_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC15.a(), r6h1Var8, System.currentTimeMillis());
                } else {
                    if (!(doy0Var instanceof zny0)) {
                        if ((doy0Var instanceof aoy0) || (doy0Var instanceof boy0)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC16 = y6h1Var5.c();
                    x6h1VarC16.i.add(new a7h1("add_all_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "not_visible_on_profile"), new mmr0("state_after_toggle", "visible_on_profile")})), x6h1VarC16.a(), r6h1Var8, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 26:
                ((Number) obj3).intValue();
                return new cgl0((r6h1) obj4);
            case 27:
                if (!((xyy0) obj4).equals(xyy0.a)) {
                    eg.o();
                }
                return null;
            case 28:
                ((Number) obj3).intValue();
                return new qsl0(((p1z0) obj).a.a, (r6h1) obj4);
            default:
                return null;
        }
    }
}
