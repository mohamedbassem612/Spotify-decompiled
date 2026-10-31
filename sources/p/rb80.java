package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import j$.net.URLEncoder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rb80 extends hab0 implements zu30 {
    public static final rb80 N0;
    public static final rb80 O0;
    public static final rb80 P0;
    public static final rb80 Q0;
    public static final rb80 R0;
    public static final rb80 S0;
    public static final rb80 T0;
    public static final rb80 U0;
    public static final rb80 V0;
    public static final rb80 W0;
    public static final rb80 X;
    public static final rb80 X0;
    public static final rb80 Y;
    public static final rb80 Y0;
    public static final rb80 Z;
    public static final rb80 Z0;
    public static final rb80 a1;
    public static final rb80 b;
    public static final rb80 b1;
    public static final rb80 c;
    public static final rb80 c1;
    public static final rb80 d;
    public static final rb80 d1;
    public static final rb80 e;
    public static final rb80 e1;
    public static final rb80 f;
    public static final rb80 g;
    public static final rb80 h;
    public static final rb80 i;
    public static final rb80 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new rb80(i2, (byte) 0);
        c = new rb80(i2, (byte) 1);
        d = new rb80(i2, (byte) 2);
        e = new rb80(i2, (byte) 3);
        f = new rb80(i2, (byte) 4);
        g = new rb80(i2, (byte) 5);
        h = new rb80(i2, (byte) 6);
        i = new rb80(i2, (byte) 7);
        t = new rb80(i2, (byte) 8);
        X = new rb80(i2, (byte) 9);
        Y = new rb80(i2, (byte) 10);
        Z = new rb80(i2, (byte) 11);
        N0 = new rb80(i2, (byte) 12);
        O0 = new rb80(i2, (byte) 13);
        P0 = new rb80(i2, (byte) 14);
        Q0 = new rb80(i2, (byte) 15);
        R0 = new rb80(i2, (byte) 16);
        S0 = new rb80(i2, (byte) 17);
        T0 = new rb80(i2, (byte) 18);
        U0 = new rb80(i2, (byte) 19);
        V0 = new rb80(i2, (byte) 20);
        W0 = new rb80(i2, (byte) 21);
        X0 = new rb80(i2, (byte) 22);
        Y0 = new rb80(i2, (byte) 23);
        Z0 = new rb80(i2, (byte) 24);
        a1 = new rb80(i2, (byte) 25);
        b1 = new rb80(i2, (byte) 26);
        c1 = new rb80(i2, (byte) 27);
        d1 = new rb80(i2, (byte) 28);
        e1 = new rb80(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rb80(int i2, byte b2) {
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
        int i2 = 2;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                return null;
            case 1:
                h0m0 h0m0Var = (h0m0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), h0m0Var.a, h0m0Var.b.b, System.currentTimeMillis());
            case 2:
                ((Number) obj3).intValue();
                z7l0 z7l0Var = new z7l0((r6h1) obj4);
                int iC = l1d.C(((cc80) obj).b);
                if (iC == 0) {
                    i2 = 1;
                } else if (iC != 1) {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i2 = 3;
                }
                return new x7l0(z7l0Var, i2);
            case 3:
                x7l0 x7l0Var = (x7l0) obj;
                if (((bc80) obj4).equals(bc80.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x7l0Var.a, x7l0Var.b.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 4:
                ((Number) obj3).intValue();
                return new m3m0(((zf80) obj).a, (r6h1) obj4);
            case 5:
                m3m0 m3m0Var = (m3m0) obj;
                zf80 zf80Var = (zf80) obj2;
                if (((yf80) obj4) instanceof yf80) {
                    return m3m0Var.a(zf80Var.a);
                }
                eg.o();
                return null;
            case 6:
                ((Number) obj3).intValue();
                String str = ((jh80) obj).a;
                r6h1 r6h1Var = r6h1.c;
                return new r2m0(str);
            case 7:
                x6h1 x6h1VarC = ((r2m0) obj).a.c();
                x6h1VarC.i.add(new a7h1("cta_banner", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((ih80) obj4).a)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
            case 8:
                ((Number) obj3).intValue();
                return new pal0((r6h1) obj4);
            case 9:
                cwl0 cwl0Var = (cwl0) obj;
                String str2 = ((so80) obj2).j;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), cwl0Var.a, r6h1.c, System.currentTimeMillis());
            case 10:
                ((Number) obj3).intValue();
                return new zel0((r6h1) obj4);
            case 11:
                zel0 zel0Var = (zel0) obj;
                gsf0 gsf0Var = (gsf0) obj3;
                sqf0 sqf0Var = (xqf0) obj4;
                r6h1 r6h1Var2 = zel0Var.a;
                y6h1 y6h1Var = zel0Var.b;
                if (sqf0Var instanceof tqf0) {
                    if (!(gsf0Var.Y.a instanceof hrf0) || gsf0Var.f == 1) {
                        return null;
                    }
                    int i3 = (int) ((xlf0) gsf0Var.g.get(((tqf0) sqf0Var).a)).c;
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    String strValueOf = String.valueOf(i3);
                    w7h1Var = new w7h1("", "", z7h1Var, new x7h1("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf != null ? strValueOf : "")), y6h1Var, r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!(sqf0Var instanceof sqf0)) {
                        if ((sqf0Var instanceof uqf0) || (sqf0Var instanceof vqf0) || (sqf0Var instanceof wqf0)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    int i4 = (int) (gsf0Var.R0 * 100.0f);
                    int i5 = (int) (sqf0Var.a * 100.0f);
                    z7h1 z7h1Var2 = new z7h1("pinch", 1, b7xVar);
                    String strValueOf2 = String.valueOf(i4);
                    if (strValueOf2 == null) {
                        strValueOf2 = "";
                    }
                    mmr0 mmr0Var = new mmr0("start_size_px", strValueOf2);
                    String strValueOf3 = String.valueOf(i5);
                    w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("ui_resize", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("end_size_px", strValueOf3 != null ? strValueOf3 : "")})), y6h1Var, r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var;
            case 12:
                mt80 mt80Var = (mt80) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                String strConcat = "spotify:prosup-text:".concat(nhc1.W(URLEncoder.encode(mt80Var.a, "UTF-8"), "+", "%20"));
                String str3 = mt80Var.b;
                String str4 = str3 == null ? "" : str3;
                String str5 = mt80Var.c;
                return new b2m0(str4, Integer.valueOf(mt80Var.e), str5 == null ? "" : str5, strConcat, r6h1Var3);
            case 13:
                b2m0 b2m0Var = (b2m0) obj;
                mt80 mt80Var2 = (mt80) obj2;
                if (mt80Var2.g) {
                    return b2m0Var.h();
                }
                String str6 = mt80Var2.d;
                return str6 != null ? b2m0Var.a(str6) : b2m0Var.i();
            case 14:
                ((Number) obj3).intValue();
                return new nsl0((r6h1) obj4);
            case 15:
                nsl0 nsl0Var = (nsl0) obj;
                r6h1 r6h1Var4 = nsl0Var.a;
                y6h1 y6h1Var2 = nsl0Var.b;
                n990 n990Var = ((o990) obj3).c;
                if (n990Var instanceof m990) {
                    x6h1 x6h1VarC2 = y6h1Var2.c();
                    x6h1VarC2.i.add(new a7h1("start_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!(n990Var instanceof l990)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("accept_challenge_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 16:
                return new nql0(new lql0(new pql0(), (byte) 2), Integer.valueOf(((Number) obj3).intValue()), ((qe90) obj).a);
            case 17:
                nql0 nql0Var = (nql0) obj;
                if (!((pe90) obj4).a.equals(yis0.a)) {
                    return null;
                }
                x6h1 x6h1VarC4 = nql0Var.a.c();
                x6h1VarC4.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
            case 18:
                ((Number) obj3).intValue();
                return new cbl0();
            case 19:
                y6h1 y6h1Var3 = ((cbl0) obj).a;
                int iOrdinal = ((wp90) obj4).ordinal();
                if (iOrdinal == 0) {
                    x6h1 x6h1VarC5 = y6h1Var3.c();
                    x6h1VarC5.i.add(new a7h1("got_it_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal == 1) {
                        x6h1 x6h1VarC6 = y6h1Var3.c();
                        x6h1VarC6.i.add(new a7h1("leave_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("leave_social_listening_session", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                    }
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("system_dismiss", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 20:
                wr90 wr90Var = (yr90) obj2;
                ((Number) obj3).intValue();
                wr90 wr90Var2 = wr90Var instanceof wr90 ? wr90Var : null;
                return new tbl0(wr90Var2 != null ? wr90Var2.a : null);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                tbl0 tbl0Var = (tbl0) obj;
                wr90 wr90Var3 = (yr90) obj3;
                vr90 vr90Var = (vr90) obj4;
                r6h1 r6h1Var5 = tbl0Var.a;
                y6h1 y6h1Var4 = tbl0Var.b;
                if (!(wr90Var3 instanceof wr90)) {
                    return null;
                }
                int iOrdinal2 = vr90Var.ordinal();
                if (iOrdinal2 == 0) {
                    boolean z = wr90Var3.d;
                    int i6 = z ? 2 : 1;
                    x6h1 x6h1VarC8 = y6h1Var4.c();
                    x6h1VarC8.i.add(new a7h1("volume_setting_toggle", (String) null, (Integer) null, (String) null, z9l0.b(i6)));
                    x6h1VarC8.j = true;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", z9l0.d(z ? 2 : 1)), new mmr0("state_after_toggle", z9l0.c(z ? 1 : 2))})), x6h1VarC8.a(), r6h1Var5, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        return null;
                    }
                    boolean z2 = wr90Var3.e;
                    int i7 = z2 ? 2 : 1;
                    x6h1 x6h1VarC9 = y6h1Var4.c();
                    x6h1VarC9.i.add(new a7h1("playback_setting_toggle", (String) null, (Integer) null, (String) null, z9l0.f(i7)));
                    x6h1VarC9.j = true;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", z9l0.h(z2 ? 2 : 1)), new mmr0("state_after_toggle", z9l0.g(z2 ? 1 : 2))})), x6h1VarC9.a(), r6h1Var5, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 22:
                ys90 ys90Var = (ys90) obj;
                ((Number) obj3).intValue();
                qgl0 qgl0Var = new qgl0(new l0m0(ys90Var.a));
                ct90 ct90Var = ys90Var.b;
                if (ct90Var instanceof bt90) {
                    return new k0m0(qgl0Var);
                }
                if (ct90Var instanceof zs90) {
                    return new i0m0(qgl0Var);
                }
                if (ct90Var instanceof at90) {
                    return new j0m0(qgl0Var);
                }
                eg.o();
                return null;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                n8h1 n8h1Var = (n8h1) obj;
                xs90 xs90Var = (xs90) obj4;
                if (xs90Var instanceof us90) {
                    if (n8h1Var instanceof k0m0) {
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{new mmr0("state_before_toggle", "jam_auto_invite_off"), new mmr0("state_after_toggle", "jam_auto_invite_on")})), ((k0m0) n8h1Var).a, r6h1.c, System.currentTimeMillis());
                    }
                    return null;
                }
                if (xs90Var instanceof ws90) {
                    if (n8h1Var instanceof k0m0) {
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:jam:bluetooth-permissions-flow")), ((k0m0) n8h1Var).a, r6h1.c, System.currentTimeMillis());
                    }
                    if (n8h1Var instanceof i0m0) {
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:jam:bluetooth-permissions-flow")), ((i0m0) n8h1Var).a, r6h1.c, System.currentTimeMillis());
                    }
                    return null;
                }
                if (!(xs90Var instanceof vs90)) {
                    eg.o();
                    return null;
                }
                if (n8h1Var instanceof j0m0) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), ((j0m0) n8h1Var).a, r6h1.c, System.currentTimeMillis());
                }
                return null;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                ((Number) obj3).intValue();
                return new l0m0(((pt90) obj).a);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                kt90 kt90Var = (ot90) obj4;
                y6h1 y6h1Var5 = ((l0m0) obj).a;
                if (kt90Var instanceof mt90) {
                    x6h1 x6h1VarC10 = y6h1Var5.c();
                    x6h1VarC10.i.add(new a7h1("share_link_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:native-share-menu")), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!(kt90Var instanceof nt90)) {
                    if (kt90Var instanceof kt90) {
                        return kt90Var.a ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var5, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var5, r6h1.c, System.currentTimeMillis());
                    }
                    return null;
                }
                x6h1 x6h1VarC11 = y6h1Var5.c();
                x6h1VarC11.i.add(new a7h1("qr_code_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = true;
                x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                x6h1VarC12.i.add(new a7h1("qr_code_image", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
            case 26:
                ((Number) obj3).intValue();
                return new nbl0(new qbl0(((nu90) obj).a));
            case 27:
                nbl0 nbl0Var = (nbl0) obj;
                if (!((mu90) obj4).equals(mu90.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC13 = nbl0Var.a.c();
                x6h1VarC13.i.add(new a7h1("listen_along_info_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = false;
                y6h1 y6h1VarA = x6h1VarC13.a();
                String str7 = nik1.F5.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7 != null ? str7 : "")), y6h1VarA, nbl0Var.b.a, System.currentTimeMillis());
            case 28:
                ((Number) obj3).intValue();
                return new qbl0(((hw90) obj).a);
            default:
                qbl0 qbl0Var = (qbl0) obj;
                bw90 bw90Var = (bw90) obj4;
                r6h1 r6h1Var6 = qbl0Var.a;
                y6h1 y6h1Var6 = qbl0Var.b;
                if (bw90Var instanceof zv90) {
                    x6h1 x6h1VarC14 = y6h1Var6.c();
                    x6h1VarC14.i.add(new a7h1("invite_friends_to_jam_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC14.a(), r6h1Var6, System.currentTimeMillis());
                } else {
                    if (!(bw90Var instanceof aw90)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC15 = y6h1Var6.c();
                    x6h1VarC15.i.add(new a7h1("guest_settings_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC15.a();
                    String str8 = nik1.u5.a;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8 != null ? str8 : "")), y6h1VarA2, r6h1Var6, System.currentTimeMillis());
                }
                return w7h1Var5;
        }
    }
}
