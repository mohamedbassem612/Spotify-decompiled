package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import j$.util.Base64;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class swg1 extends hab0 implements zu30 {
    public static final swg1 N0;
    public static final swg1 O0;
    public static final swg1 P0;
    public static final swg1 Q0;
    public static final swg1 R0;
    public static final swg1 S0;
    public static final swg1 T0;
    public static final swg1 U0;
    public static final swg1 V0;
    public static final swg1 W0;
    public static final swg1 X;
    public static final swg1 X0;
    public static final swg1 Y;
    public static final swg1 Y0;
    public static final swg1 Z;
    public static final swg1 Z0;
    public static final swg1 a1;
    public static final swg1 b;
    public static final swg1 b1;
    public static final swg1 c;
    public static final swg1 c1;
    public static final swg1 d;
    public static final swg1 d1;
    public static final swg1 e;
    public static final swg1 e1;
    public static final swg1 f;
    public static final swg1 g;
    public static final swg1 h;
    public static final swg1 i;
    public static final swg1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new swg1(i2, (byte) 0);
        c = new swg1(i2, (byte) 1);
        d = new swg1(i2, (byte) 2);
        e = new swg1(i2, (byte) 3);
        f = new swg1(i2, (byte) 4);
        g = new swg1(i2, (byte) 5);
        h = new swg1(i2, (byte) 6);
        i = new swg1(i2, (byte) 7);
        t = new swg1(i2, (byte) 8);
        X = new swg1(i2, (byte) 9);
        Y = new swg1(i2, (byte) 10);
        Z = new swg1(i2, (byte) 11);
        N0 = new swg1(i2, (byte) 12);
        O0 = new swg1(i2, (byte) 13);
        P0 = new swg1(i2, (byte) 14);
        Q0 = new swg1(i2, (byte) 15);
        R0 = new swg1(i2, (byte) 16);
        S0 = new swg1(i2, (byte) 17);
        T0 = new swg1(i2, (byte) 18);
        U0 = new swg1(i2, (byte) 19);
        V0 = new swg1(i2, (byte) 20);
        W0 = new swg1(i2, (byte) 21);
        X0 = new swg1(i2, (byte) 22);
        Y0 = new swg1(i2, (byte) 23);
        Z0 = new swg1(i2, (byte) 24);
        a1 = new swg1(i2, (byte) 25);
        b1 = new swg1(i2, (byte) 26);
        c1 = new swg1(i2, (byte) 27);
        d1 = new swg1(i2, (byte) 28);
        e1 = new swg1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swg1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        ith1 ith1Var;
        String m231Var;
        byte b2 = this.a;
        knh1 knh1Var = knh1.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new ukl0((r6h1) obj4);
            case 1:
                ukl0 ukl0Var = (ukl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((rwg1) obj2).a)), ukl0Var.b, ukl0Var.a, System.currentTimeMillis());
            case 2:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                String str = ((lzg1) obj).d;
                return !ihc1.y0(str) ? new aal0(3, str, r6h1Var) : new zzl0(r6h1Var);
            case 3:
                aal0 aal0Var = (w6h1) obj;
                lzg1 lzg1Var = (lzg1) obj2;
                if (((kzg1) obj4) != kzg1.a) {
                    eg.o();
                    return null;
                }
                String str2 = lzg1Var.d;
                if (ihc1.y0(str2)) {
                    str2 = null;
                }
                if (str2 == null) {
                    return null;
                }
                aal0 aal0Var2 = aal0Var instanceof aal0 ? aal0Var : null;
                if (aal0Var2 != null) {
                    return aal0Var2.a(str2);
                }
                return null;
            case 4:
                return new nrl0(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
            case 5:
                return new mrl0(Integer.valueOf(((Number) obj3).intValue()), ((tbh1) obj).b.a, (r6h1) obj4);
            case 6:
                ((Number) obj3).intValue();
                return new anl0(5, ((bgh1) obj2).a.b);
            case 7:
                a331 a331Var = (a331) obj2;
                y6h1 y6h1Var = ((anl0) obj).a;
                int iOrdinal = ((agh1) obj4).ordinal();
                if (iOrdinal == 0) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("home_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:home")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC2 = y6h1Var.c();
                x6h1VarC2.i.add(new a7h1("remove_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                String str3 = a331Var.b;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("delete_playlist", 1, Collections.singletonMap("playlist_to_be_deleted", str3 != null ? str3 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 8:
                ((Number) obj3).intValue();
                return new q2m0(((gkh1) obj).a);
            case 9:
                gkh1 gkh1Var = (gkh1) obj2;
                fkh1 fkh1Var = (fkh1) obj4;
                y6h1 y6h1Var2 = ((q2m0) obj).a;
                if (fkh1Var.equals(ekh1.a)) {
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    String str4 = gkh1Var.a;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                }
                if (!fkh1Var.equals(dkh1.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC4 = y6h1Var2.c();
                x6h1VarC4.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
            case 10:
                ((Number) obj3).intValue();
                return new i5l0((r6h1) obj4);
            case 11:
                i5l0 i5l0Var = (i5l0) obj;
                r6h1 r6h1Var2 = i5l0Var.a;
                y6h1 y6h1Var3 = i5l0Var.b;
                int iOrdinal2 = ((flh1) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    x6h1 x6h1VarC5 = y6h1Var3.c();
                    x6h1VarC5.i.add(new a7h1("discard_changes_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC5.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC6 = y6h1Var3.c();
                    x6h1VarC6.i.add(new a7h1("continue_editing_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var;
            case 12:
                r6h1 r6h1Var3 = (r6h1) obj4;
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                ContextTrack contextTrack = ((hcz0) obj2).a;
                return new cil0(numValueOf, contextTrack != null ? contextTrack.uri() : null, r6h1Var3);
            case 13:
                cil0 cil0Var = (cil0) obj;
                hcz0 hcz0Var = (hcz0) obj3;
                m8z0 m8z0Var = (z8z0) obj4;
                r6h1 r6h1Var4 = cil0Var.a;
                y6h1 y6h1Var4 = cil0Var.b;
                if (m8z0Var instanceof m8z0) {
                    String strUri = m8z0Var.a.uri();
                    x6h1 x6h1VarC7 = y6h1Var4.c();
                    x6h1VarC7.i.add(new a7h1("track_row", (String) null, (Integer) null, strUri, (String) null));
                    x6h1VarC7.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC7.a();
                    ContextTrack contextTrack2 = hcz0Var.a;
                    String strUri2 = contextTrack2 != null ? contextTrack2.uri() : null;
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    if (strUri2 == null) {
                        strUri2 = "";
                    }
                    mmr0 mmr0Var = new mmr0("item_to_be_skipped", strUri2);
                    String strValueOf = String.valueOf(0);
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                    mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
                    String strValueOf2 = String.valueOf(0);
                    w7h1Var2 = new w7h1("", "", z7h1Var, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), y6h1VarA3, r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!(m8z0Var instanceof u7z0)) {
                        return null;
                    }
                    x6h1 x6h1VarC8 = y6h1Var4.c();
                    x6h1VarC8.i.add(new a7h1("queue_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:now-playing:queue")), x6h1VarC8.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 14:
                ((Number) obj3).intValue();
                return new fdl0(new jpk0(new h7l0(((xmh1) obj).b, (byte) 29)));
            case 15:
                return new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((fdl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 16:
                cnh1 cnh1Var = (cnh1) obj;
                ((Number) obj3).intValue();
                jpk0 jpk0Var = new jpk0(new h7l0(cnh1Var.b, (byte) 29));
                zmh1 zmh1Var = cnh1Var.a;
                return new gdl0(jpk0Var, zmh1Var.f ? 2 : zmh1Var.e ? 1 : 3, zmh1Var.a);
            case 17:
                y6h1 y6h1Var5 = ((gdl0) obj).a;
                zmh1 zmh1Var2 = ((cnh1) obj2).a;
                int iOrdinal3 = ((anh1) obj4).ordinal();
                if (iOrdinal3 == 0) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", zmh1Var2.a)), y6h1Var5, r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    if (!zmh1Var2.e) {
                        x6h1 x6h1VarC9 = y6h1Var5.c();
                        x6h1VarC9.i.add(new a7h1("notify_me_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                    }
                    x6h1 x6h1VarC10 = y6h1Var5.c();
                    x6h1VarC10.i.add(new a7h1("notify_me_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 18:
                hnh1 hnh1Var = (hnh1) obj;
                ((Number) obj3).intValue();
                return new edl0(new fdl0(new jpk0(new h7l0(hnh1Var.b, (byte) 29))), Integer.valueOf(hnh1Var.c), hnh1Var.a.a);
            case 19:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((hnh1) obj2).a.a)), ((edl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 20:
                return new rul0(Integer.valueOf(((Number) obj3).intValue()), ((lnh1) obj).a, (r6h1) obj4);
            case 21:
                rul0 rul0Var = (rul0) obj;
                lnh1 lnh1Var = (lnh1) obj2;
                if (((knh1) obj4).equals(knh1Var)) {
                    return rul0Var.a(lnh1Var.a);
                }
                eg.o();
                return null;
            case 22:
                return new rul0(Integer.valueOf(((Number) obj3).intValue()), ((lnh1) obj).a, (r6h1) obj4);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                rul0 rul0Var2 = (rul0) obj;
                lnh1 lnh1Var2 = (lnh1) obj2;
                if (((knh1) obj4).equals(knh1Var)) {
                    return rul0Var2.a(lnh1Var2.a);
                }
                eg.o();
                return null;
            case 24:
                ((Number) obj3).intValue();
                return new yql0(6, (r6h1) obj4);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                yql0 yql0Var = (yql0) obj;
                if (((sph1) obj4).equals(sph1.a)) {
                    return yql0Var.a("spotify:internal:magpie:update-cadence");
                }
                eg.o();
                return null;
            case 26:
                swl0 swl0Var = (swl0) obj;
                xqh1 xqh1Var = (xqh1) obj4;
                if (xqh1Var instanceof wqh1) {
                    return swl0Var.a("https://www.spotify.com/account/profile-mobile");
                }
                if (xqh1Var instanceof vqh1) {
                    return null;
                }
                eg.o();
                return null;
            case 27:
                hth1 hth1Var = (hth1) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var5 = (r6h1) obj4;
                String str5 = hth1Var.h;
                String str6 = hth1Var.g;
                if (ihc1.y0(str6)) {
                    str6 = str5;
                }
                String strP = dko1.p(hth1Var);
                return new lfl0(str6, str5, strP != null ? strP : "", r6h1Var5);
            case 28:
                lfl0 lfl0Var = (lfl0) obj;
                jth1 jth1Var = (jth1) obj3;
                fth1 fth1Var = (gth1) obj4;
                r6h1 r6h1Var6 = lfl0Var.a;
                y6h1 y6h1Var6 = lfl0Var.b;
                String str7 = jth1Var.e;
                if (fth1Var instanceof bth1) {
                    if (!jth1Var.g || jth1Var.i || str7 == null || (ith1Var = jth1Var.f) == null || str7 == null || ith1Var == null) {
                        return null;
                    }
                    try {
                        m231Var = Base64.getEncoder().encodeToString(Base64.getUrlDecoder().decode(ith1Var.a));
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    String str8 = m231Var;
                    if (str8 == null) {
                        return null;
                    }
                    x6h1 x6h1VarC11 = y6h1Var6.c();
                    x6h1VarC11.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = true;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("revert_playlist_to_version", 1, sqg0.J(new mmr0[]{new mmr0("playlist_to_be_reverted", str7), new mmr0("previous_version_key", str8)})), x6h1VarC11.a(), r6h1Var6, System.currentTimeMillis());
                    break;
                } else {
                    if (!(fth1Var instanceof fth1)) {
                        return null;
                    }
                    String str9 = fth1Var.a;
                    if (str9 != null) {
                        str7 = str9;
                    } else if (str7 == null) {
                        return null;
                    }
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7)), y6h1Var6, r6h1Var6, System.currentTimeMillis());
                }
                return w7h1Var4;
            default:
                ((Number) obj3).intValue();
                return new frl0(3, (r6h1) obj4);
        }
    }
}
