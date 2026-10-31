package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r0f extends hab0 implements zu30 {
    public static final r0f N0;
    public static final r0f O0;
    public static final r0f P0;
    public static final r0f Q0;
    public static final r0f R0;
    public static final r0f S0;
    public static final r0f T0;
    public static final r0f U0;
    public static final r0f V0;
    public static final r0f W0;
    public static final r0f X;
    public static final r0f X0;
    public static final r0f Y;
    public static final r0f Y0;
    public static final r0f Z;
    public static final r0f Z0;
    public static final r0f a1;
    public static final r0f b;
    public static final r0f b1;
    public static final r0f c;
    public static final r0f c1;
    public static final r0f d;
    public static final r0f d1;
    public static final r0f e;
    public static final r0f e1;
    public static final r0f f;
    public static final r0f g;
    public static final r0f h;
    public static final r0f i;
    public static final r0f t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new r0f(i2, (byte) 0);
        c = new r0f(i2, (byte) 1);
        d = new r0f(i2, (byte) 2);
        e = new r0f(i2, (byte) 3);
        f = new r0f(i2, (byte) 4);
        g = new r0f(i2, (byte) 5);
        h = new r0f(i2, (byte) 6);
        i = new r0f(i2, (byte) 7);
        t = new r0f(i2, (byte) 8);
        X = new r0f(i2, (byte) 9);
        Y = new r0f(i2, (byte) 10);
        Z = new r0f(i2, (byte) 11);
        N0 = new r0f(i2, (byte) 12);
        O0 = new r0f(i2, (byte) 13);
        P0 = new r0f(i2, (byte) 14);
        Q0 = new r0f(i2, (byte) 15);
        R0 = new r0f(i2, (byte) 16);
        S0 = new r0f(i2, (byte) 17);
        T0 = new r0f(i2, (byte) 18);
        U0 = new r0f(i2, (byte) 19);
        V0 = new r0f(i2, (byte) 20);
        W0 = new r0f(i2, (byte) 21);
        X0 = new r0f(i2, (byte) 22);
        Y0 = new r0f(i2, (byte) 23);
        Z0 = new r0f(i2, (byte) 24);
        a1 = new r0f(i2, (byte) 25);
        b1 = new r0f(i2, (byte) 26);
        c1 = new r0f(i2, (byte) 27);
        d1 = new r0f(i2, (byte) 28);
        e1 = new r0f(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0f(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        byte b2 = this.a;
        zjf zjfVar = zjf.a;
        ckf ckfVar = ckf.a;
        bkf bkfVar = bkf.a;
        akf akfVar = akf.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new ddl0(((whf) obj).a, (r6h1) obj4);
            case 1:
                ((Number) obj3).intValue();
                return new bwk0(new ksk0((byte) 1));
            case 2:
                bwk0 bwk0Var = (bwk0) obj;
                if (((e4f) obj4).equals(e4f.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), bwk0Var.a, bwk0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 3:
                ((Number) obj3).intValue();
                return new ncl0((r6h1) obj4);
            case 4:
                ncl0 ncl0Var = (ncl0) obj;
                q600 q600Var = (q600) obj4;
                r6h1 r6h1Var = ncl0Var.a;
                y6h1 y6h1Var = ncl0Var.b;
                if (q600Var instanceof iwz) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else if (q600Var instanceof lyz) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("end_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                } else if (q600Var instanceof tzz) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("join_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(q600Var instanceof uzz)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("leave_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 5:
                ekf ekfVar = (ekf) obj;
                ((Number) obj3).intValue();
                return new dwk0(Integer.valueOf(ekfVar.a), ekfVar.a(), new nqk0(new gwk0()));
            case 6:
                ekf ekfVar2 = (ekf) obj2;
                dkf dkfVar = (dkf) obj4;
                y6h1 y6h1Var2 = ((dwk0) obj).a;
                if (dkfVar.equals(akfVar) || dkfVar.equals(bkfVar)) {
                    String strA = ekfVar2.a();
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strA != null ? strA : "")), y6h1Var2, r6h1.c, System.currentTimeMillis());
                }
                if (dkfVar.equals(zjfVar)) {
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                }
                if (dkfVar.equals(ckfVar)) {
                    return null;
                }
                eg.o();
                return null;
            case 7:
                ekf ekfVar3 = (ekf) obj;
                ((Number) obj3).intValue();
                return new wvk0(Integer.valueOf(ekfVar3.a), ekfVar3.a(), new nqk0(new yvk0()));
            case 8:
                ekf ekfVar4 = (ekf) obj2;
                dkf dkfVar2 = (dkf) obj4;
                y6h1 y6h1Var3 = ((wvk0) obj).a;
                if (dkfVar2.equals(akfVar) || dkfVar2.equals(bkfVar)) {
                    String strA2 = ekfVar4.a();
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strA2 != null ? strA2 : "")), y6h1Var3, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!dkfVar2.equals(ckfVar)) {
                        if (!dkfVar2.equals(zjfVar)) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC6 = y6h1Var3.c();
                        x6h1VarC6.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                    }
                    w7h1Var2 = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var3, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 9:
                ((Number) obj3).intValue();
                String str = ((ypf) obj).a;
                Set set = pcf.a;
                return new dvk0(new bqk0("spotify:chat-details:".concat(str), (byte) 22));
            case 10:
                return null;
            case 11:
                gvl0 gvl0Var = (gvl0) obj;
                nkg nkgVar = (nkg) obj2;
                mkg mkgVar = (mkg) obj4;
                if (mkgVar.equals(jkg.a)) {
                    return gvl0Var.a(nkgVar.a);
                }
                if (mkgVar.equals(lkg.a)) {
                    x6h1 x6h1VarC7 = gvl0Var.a.c();
                    x6h1VarC7.i.add(new a7h1("tap_ahead_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("change_search_query", 1, Collections.singletonMap("search_query_string", nkgVar.e.concat(" "))), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                }
                if (mkgVar.equals(kkg.a)) {
                    return gvl0Var.h();
                }
                eg.o();
                return null;
            case 12:
                ((Number) obj3).intValue();
                return new qfl0((r6h1) obj4);
            case 13:
                qfl0 qfl0Var = (qfl0) obj;
                zlg zlgVar = (zlg) obj4;
                cmg cmgVar = ((amg) obj2).b;
                if (!zlgVar.equals(vlg.a)) {
                    if (zlgVar.equals(wlg.a) || zlgVar.equals(ylg.a) || zlgVar.equals(xlg.a)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC8 = qfl0Var.b.c();
                x6h1VarC8.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                y6h1 y6h1VarA = x6h1VarC8.a();
                n5f0 n5f0Var = cmgVar.a;
                int i2 = (int) n5f0Var.a;
                int i3 = (int) n5f0Var.b;
                int i4 = (int) cmgVar.c;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String strValueOf = String.valueOf(i2);
                if (strValueOf == null) {
                    strValueOf = "";
                }
                mmr0 mmr0Var = new mmr0("start_integer", strValueOf);
                String strValueOf2 = String.valueOf(i3);
                if (strValueOf2 == null) {
                    strValueOf2 = "";
                }
                mmr0 mmr0Var2 = new mmr0("end_integer", strValueOf2);
                String strValueOf3 = String.valueOf(0);
                if (strValueOf3 == null) {
                    strValueOf3 = "";
                }
                mmr0 mmr0Var3 = new mmr0("min_integer", strValueOf3);
                String strValueOf4 = String.valueOf(i4);
                return new w7h1("", "", z7h1Var, new x7h1("set_integer_range", 1, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, new mmr0("max_integer", strValueOf4 != null ? strValueOf4 : "")})), y6h1VarA, qfl0Var.a, System.currentTimeMillis());
            case 14:
                ((Number) obj3).intValue();
                return new xwk0(((mng) obj).a, (r6h1) obj4);
            case 15:
                xwk0 xwk0Var = (xwk0) obj;
                lng lngVar = (lng) obj4;
                r6h1 r6h1Var2 = xwk0Var.a;
                y6h1 y6h1Var4 = xwk0Var.b;
                if (lngVar instanceof kng) {
                    x6h1 x6h1VarC9 = y6h1Var4.c();
                    x6h1VarC9.i.add(new a7h1("title_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC9.a(), r6h1Var2, System.currentTimeMillis());
                } else if (lngVar instanceof jng) {
                    x6h1 x6h1VarC10 = y6h1Var4.c();
                    x6h1VarC10.i.add(new a7h1("title_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "title")), x6h1VarC10.a(), r6h1Var2, System.currentTimeMillis());
                } else if (lngVar instanceof hng) {
                    x6h1 x6h1VarC11 = y6h1Var4.c();
                    x6h1VarC11.i.add(new a7h1("note_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC11.a(), r6h1Var2, System.currentTimeMillis());
                } else if (lngVar instanceof gng) {
                    x6h1 x6h1VarC12 = y6h1Var4.c();
                    x6h1VarC12.i.add(new a7h1("note_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "note")), x6h1VarC12.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!(lngVar instanceof ing)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC13 = y6h1Var4.c();
                    x6h1VarC13.i.add(new a7h1("platform_rules_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", "https://www.spotify.com/platform-rules/plain")), x6h1VarC13.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 16:
                ((Number) obj3).intValue();
                return new a5m0(new ezl0(((mpg) obj).a, (r6h1) obj4, (byte) 4));
            case 17:
                if (obj4 != null) {
                    bhn0.d();
                }
                return null;
            case 18:
                ((Number) obj3).intValue();
                return new ywk0((r6h1) obj4);
            case 19:
                ywk0 ywk0Var = (ywk0) obj;
                if (((frg) obj4).equals(frg.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), ywk0Var.b, ywk0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 20:
                ((Number) obj3).intValue();
                return new hil0((r6h1) obj4);
            case 21:
                hil0 hil0Var = (hil0) obj;
                org orgVar = (org) obj4;
                if (orgVar.equals(mrg.a)) {
                    return hil0Var.e();
                }
                if (orgVar.equals(nrg.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), hil0Var.b, hil0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 22:
                cyg cygVar = (cyg) obj4;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", gvg.h("spotify:artist:", (String) o7h.A0(ihc1.Q0(cygVar.a, new String[]{":"}, 0, 6)), ":dna:blend:", (String) o7h.A0(ihc1.Q0(cygVar.b, new String[]{":"}, 0, 6))))), ((t0m0) obj).a, r6h1.c, System.currentTimeMillis());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                jyl0 jyl0Var = (jyl0) obj;
                wyg wygVar = (wyg) obj4;
                if (wygVar instanceof wyg) {
                    mmr0 mmr0Var4 = wygVar.a ? new mmr0(lyl0.PLAYLIST_COLLABORATORS_OFF, kyl0.PLAYLIST_COLLABORATORS_ON) : new mmr0(lyl0.PLAYLIST_COLLABORATORS_ON, kyl0.PLAYLIST_COLLABORATORS_OFF);
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", ((lyl0) mmr0Var4.a).a), new mmr0("state_after_toggle", ((kyl0) mmr0Var4.b).a)})), jyl0Var.a, jyl0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 24:
                ((Number) obj3).intValue();
                return new gjl0((r6h1) obj4);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                gjl0 gjl0Var = (gjl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), gjl0Var.b, gjl0Var.a, System.currentTimeMillis());
            case 26:
                return new ask0(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
            case 27:
                ask0 ask0Var = (ask0) obj;
                mzg mzgVar = (mzg) obj2;
                lzg lzgVar = (lzg) obj4;
                r6h1 r6h1Var3 = ask0Var.a;
                y6h1 y6h1Var5 = ask0Var.b;
                if (lzgVar == lzg.a) {
                    return mzgVar.c ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var5, r6h1Var3, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var5, r6h1Var3, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 28:
                d5h d5hVar = (d5h) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var4 = (r6h1) obj4;
                String str2 = d5hVar.f;
                String str3 = d5hVar.g;
                if (ihc1.y0(str3)) {
                    str3 = str2;
                }
                return new dvl0(str3, str2, d5hVar.a, r6h1Var4);
            default:
                dvl0 dvl0Var = (dvl0) obj;
                d5h d5hVar2 = (d5h) obj2;
                e5h e5hVar = (e5h) obj3;
                b5h b5hVar = (b5h) obj4;
                y6h1 y6h1Var6 = dvl0Var.b;
                if (b5hVar instanceof x4h) {
                    return dvl0Var.a(d5hVar2.a);
                }
                if (!(b5hVar instanceof z4h)) {
                    if ((b5hVar instanceof y4h) || (b5hVar instanceof a5h)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                if (e5hVar.d) {
                    x6h1 x6h1VarC14 = y6h1Var6.c();
                    x6h1VarC14.i.add(new a7h1("show_less_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC14.a(), dvl0Var.a, System.currentTimeMillis());
                }
                x6h1 x6h1VarC15 = y6h1Var6.c();
                x6h1VarC15.i.add(new a7h1("show_all_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC15.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC15.a(), dvl0Var.a, System.currentTimeMillis());
        }
    }
}
