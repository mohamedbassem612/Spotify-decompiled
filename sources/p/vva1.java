package p;

import com.spotify.player.model.ContextTrack$Metadata;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vva1 extends hab0 implements zu30 {
    public static final vva1 N0;
    public static final vva1 O0;
    public static final vva1 P0;
    public static final vva1 Q0;
    public static final vva1 R0;
    public static final vva1 S0;
    public static final vva1 T0;
    public static final vva1 U0;
    public static final vva1 V0;
    public static final vva1 W0;
    public static final vva1 X;
    public static final vva1 X0;
    public static final vva1 Y;
    public static final vva1 Y0;
    public static final vva1 Z;
    public static final vva1 Z0;
    public static final vva1 a1;
    public static final vva1 b;
    public static final vva1 b1;
    public static final vva1 c;
    public static final vva1 c1;
    public static final vva1 d;
    public static final vva1 d1;
    public static final vva1 e;
    public static final vva1 e1;
    public static final vva1 f;
    public static final vva1 g;
    public static final vva1 h;
    public static final vva1 i;
    public static final vva1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new vva1(i2, (byte) 0);
        c = new vva1(i2, (byte) 1);
        d = new vva1(i2, (byte) 2);
        e = new vva1(i2, (byte) 3);
        f = new vva1(i2, (byte) 4);
        g = new vva1(i2, (byte) 5);
        h = new vva1(i2, (byte) 6);
        i = new vva1(i2, (byte) 7);
        t = new vva1(i2, (byte) 8);
        X = new vva1(i2, (byte) 9);
        Y = new vva1(i2, (byte) 10);
        Z = new vva1(i2, (byte) 11);
        N0 = new vva1(i2, (byte) 12);
        O0 = new vva1(i2, (byte) 13);
        P0 = new vva1(i2, (byte) 14);
        Q0 = new vva1(i2, (byte) 15);
        R0 = new vva1(i2, (byte) 16);
        S0 = new vva1(i2, (byte) 17);
        T0 = new vva1(i2, (byte) 18);
        U0 = new vva1(i2, (byte) 19);
        V0 = new vva1(i2, (byte) 20);
        W0 = new vva1(i2, (byte) 21);
        X0 = new vva1(i2, (byte) 22);
        Y0 = new vva1(i2, (byte) 23);
        Z0 = new vva1(i2, (byte) 24);
        a1 = new vva1(i2, (byte) 25);
        b1 = new vva1(i2, (byte) 26);
        c1 = new vva1(i2, (byte) 27);
        d1 = new vva1(i2, (byte) 28);
        e1 = new vva1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vva1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        byte b2 = this.a;
        int i2 = 2;
        b7x b7xVar = b7x.a;
        String strG = null;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new mol0(1, (r6h1) obj4);
            case 1:
                mol0 mol0Var = (mol0) obj;
                r6h1 r6h1Var = mol0Var.a;
                y6h1 y6h1Var = mol0Var.b;
                int iOrdinal = ((uva1) obj4).ordinal();
                if (iOrdinal == 0) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else if (iOrdinal == 1) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                ((Number) obj3).intValue();
                return new pol0((r6h1) obj4);
            case 3:
                pol0 pol0Var = (pol0) obj;
                cwa1 cwa1Var = (cwa1) obj4;
                r6h1 r6h1Var2 = pol0Var.a;
                y6h1 y6h1Var2 = pol0Var.b;
                String str = ((dwa1) obj3).a;
                if (cwa1Var instanceof awa1) {
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("bpm_ruler", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA = x6h1VarC4.a();
                    if (str == null) {
                        str = "";
                    }
                    int i3 = ((awa1) cwa1Var).a;
                    z7h1 z7h1Var = new z7h1("swipe", 1, b7xVar);
                    mmr0 mmr0Var = new mmr0("currently_played_item", str);
                    String strValueOf = String.valueOf(i3);
                    w7h1Var2 = new w7h1("", "", z7h1Var, new x7h1("set_playback_speed", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0(ContextTrack$Metadata.KEY_PLAYBACK_SPEED, strValueOf != null ? strValueOf : "")})), y6h1VarA, r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!(cwa1Var instanceof bwa1)) {
                        eg.o();
                        return null;
                    }
                    int i4 = ((bwa1) cwa1Var).a;
                    String strValueOf2 = String.valueOf(i4);
                    Integer numValueOf = Integer.valueOf(gwa1.a.indexOf(Integer.valueOf(i4)));
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("speed_chip", strValueOf2, numValueOf, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC5.a();
                    if (str == null) {
                        str = "";
                    }
                    z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                    mmr0 mmr0Var2 = new mmr0("currently_played_item", str);
                    String strValueOf3 = String.valueOf(i4 + 100);
                    w7h1Var2 = new w7h1("", "", z7h1Var2, new x7h1("set_playback_speed", 1, sqg0.J(new mmr0[]{mmr0Var2, new mmr0(ContextTrack$Metadata.KEY_PLAYBACK_SPEED, strValueOf3 != null ? strValueOf3 : "")})), y6h1VarA2, r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 4:
                ((Number) obj3).intValue();
                return new k1m0((r6h1) obj4);
            case 5:
                k1m0 k1m0Var = (k1m0) obj;
                c0b1 c0b1Var = (c0b1) obj3;
                a0b1 a0b1Var = (a0b1) obj4;
                r6h1 r6h1Var3 = k1m0Var.a;
                y6h1 y6h1Var3 = k1m0Var.b;
                if (a0b1Var.equals(vza1.a)) {
                    x6h1 x6h1VarC6 = y6h1Var3.c();
                    x6h1VarC6.i.add(new a7h1("advertiser_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC6.a();
                    ki0 ki0Var = c0b1Var.e;
                    strG = ki0Var != null ? ki0Var.g() : null;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strG != null ? strG : "")), y6h1VarA3, r6h1Var3, System.currentTimeMillis());
                } else if (a0b1Var.equals(zza1.a)) {
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("reward_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if (a0b1Var.equals(yza1.a)) {
                        return null;
                    }
                    if (a0b1Var instanceof xza1) {
                        x6h1 x6h1VarC8 = y6h1Var3.c();
                        x6h1VarC8.i.add(new a7h1("playlist_cover_art", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1Var3, System.currentTimeMillis());
                    } else {
                        if (!(a0b1Var instanceof wza1)) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC9 = y6h1Var3.c();
                        x6h1VarC9.i.add(new a7h1("playlist_cover_art", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), r6h1Var3, System.currentTimeMillis());
                    }
                }
                return w7h1Var3;
            case 6:
                ((Number) obj3).intValue();
                return new k1m0((r6h1) obj4);
            case 7:
                k1m0 k1m0Var2 = (k1m0) obj;
                k0b1 k0b1Var = (k0b1) obj4;
                r6h1 r6h1Var4 = k1m0Var2.a;
                y6h1 y6h1Var4 = k1m0Var2.b;
                if (k0b1Var.equals(j0b1.a)) {
                    x6h1 x6h1VarC10 = y6h1Var4.c();
                    x6h1VarC10.i.add(new a7h1("mute_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unmute_playback", 1, b7xVar), x6h1VarC10.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!k0b1Var.equals(i0b1.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC11 = y6h1Var4.c();
                    x6h1VarC11.i.add(new a7h1("mute_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mute_playback", 1, b7xVar), x6h1VarC11.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 8:
                ((Number) obj3).intValue();
                return new l1m0(((x0b1) obj).c, new opl0((r6h1) obj4, (byte) 25));
            case 9:
                return null;
            case 10:
                ((Number) obj3).intValue();
                return new qml0(new fjl0((r6h1) obj4, (byte) 9));
            case 11:
                ((Number) obj3).intValue();
                return new tml0((r6h1) obj4);
            case 12:
                ((Number) obj3).intValue();
                r6h1 r6h1Var5 = (r6h1) obj4;
                List list = ((xeb1) obj2).b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((qpc1) it.next()).c == d13.a) {
                            i2 = 1;
                        }
                    }
                }
                return new zml0(i2, r6h1Var5);
            case 13:
                return null;
            case 14:
                ((Number) obj3).intValue();
                r6h1 r6h1Var6 = (r6h1) obj4;
                j8e0 j8e0Var = ((key0) obj).b;
                boolean z = j8e0Var instanceof j8e0;
                j8e0 j8e0Var2 = z ? j8e0Var : null;
                Integer numValueOf2 = j8e0Var2 != null ? Integer.valueOf(j8e0Var2.a) : null;
                j8e0 j8e0Var3 = z ? j8e0Var : null;
                return new yml0(numValueOf2, j8e0Var3 != null ? j8e0Var3.b : null, r6h1Var6);
            case 15:
                return null;
            case 16:
                ((Number) obj3).intValue();
                return new okl0((r6h1) obj4);
            case 17:
                okl0 okl0Var = (okl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("launch_camera", 1, b7xVar), okl0Var.b, okl0Var.a, System.currentTimeMillis());
            case 18:
                fvb1 fvb1Var = (fvb1) obj;
                ((Number) obj3).intValue();
                return new n6l0(new xok0((byte) 20), fvb1Var.a, Integer.valueOf(fvb1Var.b));
            case 19:
                if (obj4 != null) {
                    bhn0.d();
                }
                return null;
            case 20:
                ((Number) obj3).intValue();
                return new jwk0(((ewb1) obj2).d, (r6h1) obj4);
            case 21:
                jwk0 jwk0Var = (jwk0) obj;
                ewb1 ewb1Var = (ewb1) obj3;
                if (((bwb1) obj2).d) {
                    String str2 = ewb1Var.d;
                    strG = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), jwk0Var.b, jwk0Var.a, System.currentTimeMillis());
                }
                return strG;
            case 22:
                ((Number) obj3).intValue();
                r6h1 r6h1Var7 = (r6h1) obj4;
                String str3 = ((swb1) obj2).a;
                return new iwk0(new jwk0(str3 != null ? str3 : "", r6h1Var7));
            case 23:
                iwk0 iwk0Var = (iwk0) obj;
                qwb1 qwb1Var = (qwb1) obj4;
                y6h1 y6h1Var5 = iwk0Var.a;
                r6h1 r6h1Var8 = iwk0Var.b.a;
                String str4 = ((swb1) obj3).a;
                if (qwb1Var instanceof pwb1) {
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str4 != null ? str4 : "")), y6h1Var5, r6h1Var8, System.currentTimeMillis());
                } else {
                    if (!(qwb1Var instanceof owb1)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str4 != null ? str4 : "")), y6h1Var5, r6h1Var8, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 24:
                ((Number) obj3).intValue();
                return new v5l0((r6h1) obj4);
            case 25:
                v5l0 v5l0Var = (v5l0) obj;
                lxb1 lxb1Var = (lxb1) obj4;
                r6h1 r6h1Var9 = v5l0Var.a;
                y6h1 y6h1Var6 = v5l0Var.b;
                if (lxb1Var instanceof kxb1) {
                    kxb1 kxb1Var = (kxb1) lxb1Var;
                    String str5 = kxb1Var.b;
                    Integer numValueOf3 = Integer.valueOf(kxb1Var.a);
                    x6h1 x6h1VarC12 = y6h1Var6.c();
                    x6h1VarC12.i.add(new a7h1("sticker_button", str5, numValueOf3, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC12.a(), r6h1Var9, System.currentTimeMillis());
                } else {
                    if (!(lxb1Var instanceof jxb1)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC13 = y6h1Var6.c();
                    x6h1VarC13.i.add(new a7h1("dismiss_interaction", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC13.a(), r6h1Var9, System.currentTimeMillis());
                }
                return w7h1Var6;
            case 26:
                return null;
            case 27:
                ((Number) obj3).intValue();
                return new ygl0((r6h1) obj4);
            case 28:
                ygl0 ygl0Var = (ygl0) obj;
                if (gzb1.a[((yyb1) obj4).ordinal()] == 1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("quick_scroll", 1, b7xVar), ygl0Var.b, ygl0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            default:
                ((Number) obj3).intValue();
                return new o7l0();
        }
    }
}
