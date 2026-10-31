package p;

import android.content.Context;
import com.spotify.scrollsita.v1.Section;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c781 extends hab0 implements zu30 {
    public static final c781 N0;
    public static final c781 O0;
    public static final c781 P0;
    public static final c781 Q0;
    public static final c781 R0;
    public static final c781 S0;
    public static final c781 T0;
    public static final c781 U0;
    public static final c781 V0;
    public static final c781 W0;
    public static final c781 X;
    public static final c781 X0;
    public static final c781 Y;
    public static final c781 Y0;
    public static final c781 Z;
    public static final c781 Z0;
    public static final c781 a1;
    public static final c781 b;
    public static final c781 b1;
    public static final c781 c;
    public static final c781 c1;
    public static final c781 d;
    public static final c781 d1;
    public static final c781 e;
    public static final c781 e1;
    public static final c781 f;
    public static final c781 g;
    public static final c781 h;
    public static final c781 i;
    public static final c781 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new c781(i2, (byte) 0);
        c = new c781(i2, (byte) 1);
        d = new c781(i2, (byte) 2);
        e = new c781(i2, (byte) 3);
        f = new c781(i2, (byte) 4);
        g = new c781(i2, (byte) 5);
        h = new c781(i2, (byte) 6);
        i = new c781(i2, (byte) 7);
        t = new c781(i2, (byte) 8);
        X = new c781(i2, (byte) 9);
        Y = new c781(i2, (byte) 10);
        Z = new c781(i2, (byte) 11);
        N0 = new c781(i2, (byte) 12);
        O0 = new c781(i2, (byte) 13);
        P0 = new c781(i2, (byte) 14);
        Q0 = new c781(i2, (byte) 15);
        R0 = new c781(i2, (byte) 16);
        S0 = new c781(i2, (byte) 17);
        T0 = new c781(i2, (byte) 18);
        U0 = new c781(i2, (byte) 19);
        V0 = new c781(i2, (byte) 20);
        W0 = new c781(i2, (byte) 21);
        X0 = new c781(i2, (byte) 22);
        Y0 = new c781(i2, (byte) 23);
        Z0 = new c781(i2, (byte) 24);
        a1 = new c781(i2, (byte) 25);
        b1 = new c781(i2, (byte) 26);
        c1 = new c781(i2, (byte) 27);
        d1 = new c781(i2, (byte) 28);
        e1 = new c781(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c781(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        String str;
        w7h1 w7h1Var2;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var3 = null;
        switch (b2) {
            case 0:
                hey0 hey0Var = (hey0) obj2;
                y6h1 y6h1Var = ((s4m0) obj).a;
                if (hey0Var.b) {
                    return null;
                }
                i281 i281Var = hey0Var.a;
                boolean z = i281Var.e;
                String str2 = i281Var.a;
                return !z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("auto_download_enable", 1, Collections.singletonMap("item_to_download", str2)), y6h1Var, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("auto_download_disable", 1, Collections.singletonMap("item_to_stop_download", str2)), y6h1Var, r6h1.c, System.currentTimeMillis());
            case 1:
                cel0 cel0Var = (cel0) obj;
                String str3 = nik1.R0.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), cel0Var.a, cel0Var.b.a, System.currentTimeMillis());
            case 2:
                return ((jvl0) obj).a(((ba81) obj2).a);
            case 3:
                ((Number) obj3).intValue();
                return new czl0((r6h1) obj4);
            case 4:
                czl0 czl0Var = (czl0) obj;
                if (((td81) obj4).equals(td81.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", "https://sponsored-recommendations.spotify.com/")), czl0Var.b, czl0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 5:
                return new wql0(Integer.valueOf(((Number) obj3).intValue()), ((id81) obj).c, null, (r6h1) obj4);
            case 6:
                return null;
            case 7:
                ((Number) obj3).intValue();
                return new dzl0((r6h1) obj4);
            case 8:
                dzl0 dzl0Var = (dzl0) obj;
                xe81 xe81Var = (xe81) obj3;
                if (((te81) obj4) != te81.a) {
                    eg.o();
                    return null;
                }
                if (xe81Var.b) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), dzl0Var.b, dzl0Var.a, System.currentTimeMillis());
                }
                return p7h.M(new we81[]{we81.b, we81.c}).contains(xe81Var.a) ? dzl0Var.e(2, 1) : dzl0Var.e(1, 2);
            case 9:
                return new as0((Context) obj2, (iu30) obj4, (byte) 23);
            case 10:
                ((Number) obj3).intValue();
                return new gwk0();
            case 11:
                x6h1 x6h1VarC = ((gwk0) obj).a.c();
                x6h1VarC.i.add(new a7h1("header_title", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str4 = jg81.f;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case 12:
                uzl0 uzl0Var = (uzl0) obj;
                wg81 wg81Var = (wg81) obj3;
                tg81 tg81Var = (tg81) obj4;
                if ((tg81Var instanceof sg81) || (tg81Var instanceof rg81)) {
                    return null;
                }
                if (!(tg81Var instanceof qg81) && !(tg81Var instanceof pg81)) {
                    eg.o();
                    return null;
                }
                if (wg81Var.e.a == 0) {
                    return null;
                }
                x6h1 x6h1VarC2 = uzl0Var.a.c();
                x6h1VarC2.i.add(new a7h1("profile_header", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("accessory", (String) null, (Integer) null, (String) null, "account_switching"));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            case 13:
                ((Number) obj3).intValue();
                return ((bi81) obj).a.e.a;
            case 14:
                pzl0 pzl0Var = (pzl0) obj;
                qi81 qi81Var = (qi81) obj4;
                y6h1 y6h1Var2 = pzl0Var.a;
                if (qi81Var instanceof ni81) {
                    return pzl0Var.a("spotify:user");
                }
                if (qi81Var instanceof pi81) {
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("accessory", (String) null, (Integer) null, (String) null, "account_switching"));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(qi81Var instanceof oi81)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("accessory", (String) null, (Integer) null, (String) null, "account_switching"));
                    x6h1VarC5.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 15:
                pzl0 pzl0Var2 = (pzl0) obj;
                if (((vi81) obj4).equals(vi81.a)) {
                    return pzl0Var2.a("spotify:user");
                }
                eg.o();
                return null;
            case 16:
                ((Number) obj3).intValue();
                return new dpk0(new epk0((r6h1) obj4));
            case 17:
                dpk0 dpk0Var = (dpk0) obj;
                if (((sk81) obj4).equals(sk81.a)) {
                    String str5 = nik1.P3.a;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), dpk0Var.a, dpk0Var.b.a, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var3;
            case 18:
                kuk0 kuk0Var = (kuk0) obj;
                fw81 fw81Var = (fw81) obj3;
                if (((cw81) obj4) == cw81.a) {
                    return kuk0Var.a(fw81Var.f);
                }
                eg.o();
                return null;
            case 19:
                ((Number) obj3).intValue();
                return new xgl0((r6h1) obj4);
            case 20:
                xgl0 xgl0Var = (xgl0) obj;
                p491 p491Var = (p491) obj3;
                n491 n491Var = (n491) obj4;
                if (n491Var instanceof l491) {
                    int i2 = (int) p491Var.d;
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    String strValueOf = String.valueOf(i2);
                    w7h1Var3 = new w7h1("", "", z7h1Var, new x7h1("skip_ads", 2, Collections.singletonMap("position_ms", strValueOf != null ? strValueOf : "")), xgl0Var.b, xgl0Var.a, System.currentTimeMillis());
                } else if (!(n491Var instanceof m491)) {
                    eg.o();
                }
                return w7h1Var3;
            case 21:
                ((Number) obj3).intValue();
                return new vsk0(new bqk0(((z491) obj).a, (byte) 10));
            case 22:
                vsk0 vsk0Var = (vsk0) obj;
                z491 z491Var = (z491) obj2;
                a591 a591Var = (a591) obj3;
                if (!((y491) obj4).equals(w491.a)) {
                    return null;
                }
                char c2 = a591Var.a ? (char) 2 : (char) 1;
                x6h1 x6h1VarC6 = vsk0Var.a.c();
                if (c2 == 1) {
                    str = "keep_previous";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    str = "mark_previous_as_finished";
                }
                x6h1VarC6.i.add(new a7h1("play_button", str, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                y6h1 y6h1VarA2 = x6h1VarC6.a();
                String str6 = z491Var.b;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str6 != null ? str6 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            case 23:
                ((Number) obj3).intValue();
                return new skl0((r6h1) obj4);
            case 24:
                skl0 skl0Var = (skl0) obj;
                e591 e591Var = (e591) obj2;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", dj20.f(e591Var.a, e591Var.b, e591Var.c, e591Var.d, rg90.a))), skl0Var.b, skl0Var.a, System.currentTimeMillis());
            case 25:
                ((Number) obj3).intValue();
                return new hul0();
            case 26:
                nhb1 nhb1Var = (nhb1) obj3;
                lhb1 lhb1Var = (lhb1) obj4;
                y6h1 y6h1Var3 = ((hul0) obj).a;
                if (lhb1Var.equals(jhb1.a)) {
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC7.a();
                    String strM = flo1.m(nhb1Var, "spotify:premium-destination");
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strM != null ? strM : "")), y6h1VarA3, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!lhb1Var.equals(khb1.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC8 = y6h1Var3.c();
                    x6h1VarC8.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj3).intValue();
                return new yil0((r6h1) obj4);
            case 28:
                l691 l691Var = (l691) obj3;
                String str7 = l691Var.a;
                fvf1 fvf1Var = l691Var.c;
                return ((yil0) obj).e(Integer.valueOf((int) fvf1Var.a), str7, Integer.valueOf((int) fvf1Var.b));
            default:
                ((Number) obj3).intValue();
                return new zil0((r6h1) obj4);
        }
    }
}
