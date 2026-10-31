package p;

import android.content.Context;
import com.spotify.player.model.ContextTrack$TrackAction;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nzv0 extends hab0 implements zu30 {
    public static final nzv0 N0;
    public static final nzv0 O0;
    public static final nzv0 P0;
    public static final nzv0 Q0;
    public static final nzv0 R0;
    public static final nzv0 S0;
    public static final nzv0 T0;
    public static final nzv0 U0;
    public static final nzv0 V0;
    public static final nzv0 W0;
    public static final nzv0 X;
    public static final nzv0 X0;
    public static final nzv0 Y;
    public static final nzv0 Y0;
    public static final nzv0 Z;
    public static final nzv0 Z0;
    public static final nzv0 a1;
    public static final nzv0 b;
    public static final nzv0 b1;
    public static final nzv0 c;
    public static final nzv0 c1;
    public static final nzv0 d;
    public static final nzv0 d1;
    public static final nzv0 e;
    public static final nzv0 e1;
    public static final nzv0 f;
    public static final nzv0 g;
    public static final nzv0 h;
    public static final nzv0 i;
    public static final nzv0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new nzv0(i2, (byte) 0);
        c = new nzv0(i2, (byte) 1);
        d = new nzv0(i2, (byte) 2);
        e = new nzv0(i2, (byte) 3);
        f = new nzv0(i2, (byte) 4);
        g = new nzv0(i2, (byte) 5);
        h = new nzv0(i2, (byte) 6);
        i = new nzv0(i2, (byte) 7);
        t = new nzv0(i2, (byte) 8);
        X = new nzv0(i2, (byte) 9);
        Y = new nzv0(i2, (byte) 10);
        Z = new nzv0(i2, (byte) 11);
        N0 = new nzv0(i2, (byte) 12);
        O0 = new nzv0(i2, (byte) 13);
        P0 = new nzv0(i2, (byte) 14);
        Q0 = new nzv0(i2, (byte) 15);
        R0 = new nzv0(i2, (byte) 16);
        S0 = new nzv0(i2, (byte) 17);
        T0 = new nzv0(i2, (byte) 18);
        U0 = new nzv0(i2, (byte) 19);
        V0 = new nzv0(i2, (byte) 20);
        W0 = new nzv0(i2, (byte) 21);
        X0 = new nzv0(i2, (byte) 22);
        Y0 = new nzv0(i2, (byte) 23);
        Z0 = new nzv0(i2, (byte) 24);
        a1 = new nzv0(i2, (byte) 25);
        b1 = new nzv0(i2, (byte) 26);
        c1 = new nzv0(i2, (byte) 27);
        d1 = new nzv0(i2, (byte) 28);
        e1 = new nzv0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nzv0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var5 = null;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new vqk0((r6h1) obj4);
            case 1:
                vqk0 vqk0Var = (vqk0) obj;
                String str = ((mzv0) obj3).a;
                if (!((kzv0) obj4).equals(kzv0.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC = vqk0Var.b.c();
                x6h1VarC.i.add(new a7h1("upcoming_album_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("upcoming_album_card", (String) null, (Integer) null, str, (String) null));
                x6h1VarC2.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), vqk0Var.a, System.currentTimeMillis());
            case 2:
                return new zhl0(Integer.valueOf(((Number) obj3).intValue()), ((oyv0) obj).a, (r6h1) obj4);
            case 3:
                return new n9l0(Integer.valueOf(((Number) obj3).intValue()), ((v6w0) obj).a.a, (r6h1) obj4);
            case 4:
                n9l0 n9l0Var = (n9l0) obj;
                w6w0 w6w0Var = (w6w0) obj3;
                u6w0 u6w0Var = (u6w0) obj4;
                e9w0 e9w0Var = ((v6w0) obj2).a;
                if (u6w0Var.equals(s6w0.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), n9l0Var.b, n9l0Var.a, System.currentTimeMillis());
                }
                if (!u6w0Var.equals(t6w0.a)) {
                    eg.o();
                    return null;
                }
                l9l0 l9l0Var = new l9l0(e9w0Var.a, n9l0Var.b());
                boolean z = w6w0Var.b;
                String str2 = e9w0Var.l;
                return z ? l9l0Var.e(str2) : l9l0Var.h(str2);
            case 5:
                ((Number) obj3).intValue();
                return new m9l0();
            case 6:
                f7w0 f7w0Var = (f7w0) obj4;
                y6h1 y6h1Var = ((m9l0) obj).a;
                if (f7w0Var.equals(e7w0.a)) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("make_it_yours_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!f7w0Var.equals(d7w0.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 7:
                ((Number) obj3).intValue();
                return new l9l0(((o8w0) obj).a, (r6h1) obj4);
            case 8:
                l9l0 l9l0Var2 = (l9l0) obj;
                r8w0 r8w0Var = (r8w0) obj3;
                String str3 = ((o8w0) obj2).b;
                if (r8w0Var.equals(p8w0.a)) {
                    return l9l0Var2.h(str3);
                }
                if (r8w0Var instanceof q8w0) {
                    return l9l0Var2.e(str3);
                }
                eg.o();
                return null;
            case 9:
                ((Number) obj3).intValue();
                return new nfl0((r6h1) obj4);
            case 10:
                nfl0 nfl0Var = (nfl0) obj;
                r6h1 r6h1Var = nfl0Var.a;
                y6h1 y6h1Var2 = nfl0Var.b;
                oiw0 oiw0Var = ((zaw0) obj3).a;
                if (oiw0Var instanceof iiw0) {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unmute_playback", 1, b7xVar), y6h1Var2, r6h1Var, System.currentTimeMillis());
                } else if (oiw0Var instanceof miw0) {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mute_playback", 1, b7xVar), y6h1Var2, r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(oiw0Var instanceof kiw0) && !(oiw0Var instanceof liw0)) {
                        return null;
                    }
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), y6h1Var2, r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 11:
                ((Number) obj3).intValue();
                return new g6l0(((ufw0) obj).a, (r6h1) obj4);
            case 12:
                g6l0 g6l0Var = (g6l0) obj;
                mhw0 mhw0Var = (mhw0) obj3;
                wgw0 wgw0Var = (wgw0) obj4;
                r6h1 r6h1Var2 = g6l0Var.a;
                y6h1 y6h1Var3 = g6l0Var.b;
                String str4 = ((ufw0) obj2).a;
                if (wgw0Var.equals(ogw0.a)) {
                    lhw0 lhw0Var = mhw0Var.d;
                    if (lhw0Var.a) {
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1(ContextTrack$TrackAction.PAUSE, 1, Collections.singletonMap("item_to_be_paused", str4)), y6h1Var3, r6h1Var2, System.currentTimeMillis());
                    } else {
                        w7h1Var3 = lhw0Var.b ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1(ContextTrack$TrackAction.RESUME, 1, Collections.singletonMap("item_to_be_resumed", str4)), y6h1Var3, r6h1Var2, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str4)), y6h1Var3, r6h1Var2, System.currentTimeMillis());
                    }
                } else {
                    if (!wgw0Var.equals(pgw0.a)) {
                        return null;
                    }
                    x6h1 x6h1VarC5 = y6h1Var3.c();
                    x6h1VarC5.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 13:
                ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(772140972);
                nlw0 nlw0Var = new nlw0((wl71) obj2);
                x340Var.r(false);
                return nlw0Var;
            case 14:
                ((Number) obj3).intValue();
                return new yql0(4, (r6h1) obj4);
            case 15:
                yql0 yql0Var = (yql0) obj;
                if (((bpw0) obj4) instanceof wow0) {
                    return yql0Var.a("spotify:internal:magpie:update-privacy");
                }
                return null;
            case 16:
                return ((wvl0) obj).a(((s0x0) obj2).a);
            case 17:
                xml0 xml0Var = (xml0) obj;
                String str5 = ((b1x0) obj4).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), xml0Var.a, xml0Var.b.a, System.currentTimeMillis());
            case 18:
                ((Number) obj4).intValue();
                return new xml0((yml0) obj);
            case 19:
                ((Number) obj3).intValue();
                return new wpl0(new tdl0((byte) 24));
            case 20:
                xcx0 xcx0Var = (xcx0) obj4;
                y6h1 y6h1Var4 = ((wpl0) obj).a;
                if (xcx0Var instanceof vcx0) {
                    x6h1 x6h1VarC6 = y6h1Var4.c();
                    x6h1VarC6.i.add(new a7h1("change_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                } else if (xcx0Var instanceof ucx0) {
                    x6h1 x6h1VarC7 = y6h1Var4.c();
                    x6h1VarC7.i.add(new a7h1("change_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(xcx0Var instanceof wcx0)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC8 = y6h1Var4.c();
                    x6h1VarC8.i.add(new a7h1("skip_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 21:
                return ((jvl0) obj).a(((jdx0) obj2).a);
            case 22:
                ((Number) obj3).intValue();
                return new o7l0();
            case 23:
                return new tpd0((Context) obj2, (byte) 2);
            case 24:
                rlx0 rlx0Var = (rlx0) obj;
                ((Number) obj3).intValue();
                return new u5m0(new v5m0(new brl0((byte) 29)), rlx0Var.a, Integer.valueOf(rlx0Var.b));
            case 25:
                u5m0 u5m0Var = (u5m0) obj;
                rlx0 rlx0Var2 = (rlx0) obj2;
                if (((qlx0) obj4).equals(qlx0.a)) {
                    String str6 = rlx0Var2.h;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), u5m0Var.a, r6h1.c, System.currentTimeMillis());
                } else {
                    eg.o();
                }
                return w7h1Var5;
            case 26:
                ((Number) obj3).intValue();
                return new mll0((r6h1) obj4);
            case 27:
                mll0 mll0Var = (mll0) obj;
                if (ylx0.a[((wlx0) obj4).ordinal()] == 1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), mll0Var.b, mll0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 28:
                kmx0 kmx0Var = (kmx0) obj;
                ((Number) obj3).intValue();
                return new n6m0(new sqk0(new p6m0((byte) 0)), kmx0Var.a, Integer.valueOf(kmx0Var.f));
            default:
                return ((n6m0) obj).a(((kmx0) obj2).e);
        }
    }
}
