package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d27 extends hab0 implements zu30 {
    public static final d27 N0;
    public static final d27 O0;
    public static final d27 P0;
    public static final d27 Q0;
    public static final d27 R0;
    public static final d27 S0;
    public static final d27 T0;
    public static final d27 U0;
    public static final d27 V0;
    public static final d27 W0;
    public static final d27 X;
    public static final d27 X0;
    public static final d27 Y;
    public static final d27 Y0;
    public static final d27 Z;
    public static final d27 Z0;
    public static final d27 a1;
    public static final d27 b;
    public static final d27 b1;
    public static final d27 c;
    public static final d27 c1;
    public static final d27 d;
    public static final d27 d1;
    public static final d27 e;
    public static final d27 e1;
    public static final d27 f;
    public static final d27 g;
    public static final d27 h;
    public static final d27 i;
    public static final d27 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new d27(i2, (byte) 0);
        c = new d27(i2, (byte) 1);
        d = new d27(i2, (byte) 2);
        e = new d27(i2, (byte) 3);
        f = new d27(i2, (byte) 4);
        g = new d27(i2, (byte) 5);
        h = new d27(i2, (byte) 6);
        i = new d27(i2, (byte) 7);
        t = new d27(i2, (byte) 8);
        X = new d27(i2, (byte) 9);
        Y = new d27(i2, (byte) 10);
        Z = new d27(i2, (byte) 11);
        N0 = new d27(i2, (byte) 12);
        O0 = new d27(i2, (byte) 13);
        P0 = new d27(i2, (byte) 14);
        Q0 = new d27(i2, (byte) 15);
        R0 = new d27(i2, (byte) 16);
        S0 = new d27(i2, (byte) 17);
        T0 = new d27(i2, (byte) 18);
        U0 = new d27(i2, (byte) 19);
        V0 = new d27(i2, (byte) 20);
        W0 = new d27(i2, (byte) 21);
        X0 = new d27(i2, (byte) 22);
        Y0 = new d27(i2, (byte) 23);
        Z0 = new d27(i2, (byte) 24);
        a1 = new d27(i2, (byte) 25);
        b1 = new d27(i2, (byte) 26);
        c1 = new d27(i2, (byte) 27);
        d1 = new d27(i2, (byte) 28);
        e1 = new d27(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d27(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x023c  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        byte b2 = this.a;
        int i2 = 2;
        u78 u78Var = u78.a;
        t78 t78Var = t78.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new f9l0((r6h1) obj4);
            case 1:
                f9l0 f9l0Var = (f9l0) obj;
                b27 b27Var = (b27) obj4;
                r6h1 r6h1Var = f9l0Var.a;
                y6h1 y6h1Var = f9l0Var.b;
                if (b27Var instanceof z17) {
                    Integer numValueOf = Integer.valueOf(((z17) b27Var).b);
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("artwork_item", (String) null, numValueOf, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else if (b27Var instanceof y17) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("edit_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                } else if (b27Var.equals(a27.a)) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("upload_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!b27Var.equals(x17.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("delete_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                return null;
            case 3:
                isk0 isk0Var = (isk0) obj;
                if (((c87) obj4).equals(c87.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), isk0Var.a, isk0Var.b.b.c.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                kc7 kc7Var = (kc7) obj;
                return new esk0(kc7Var.k, Integer.valueOf(((Number) obj3).intValue()), kc7Var.b.getUri());
            case 7:
                esk0 esk0Var = (esk0) obj;
                kc7 kc7Var2 = (kc7) obj2;
                lc7 lc7Var = (lc7) obj3;
                jc7 jc7Var = (jc7) obj4;
                y6h1 y6h1Var2 = esk0Var.a;
                gsk0 gsk0Var = esk0Var.b.b;
                String str = kc7Var2.a;
                i iVar = kc7Var2.b;
                if (jc7Var.equals(gc7.a)) {
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA = x6h1VarC5.a();
                    if (kc7Var2.l == qb7.b) {
                        String uri = iVar.getUri();
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_entity_in_list", 1, Collections.singletonMap("entity_to_be_selected", uri != null ? uri : "")), y6h1VarA, gsk0Var.c.b, System.currentTimeMillis());
                    } else {
                        String uri2 = iVar.getUri();
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_to_playlist", 2, sqg0.J(new mmr0[]{new mmr0("playlist", str), new mmr0("item_to_be_added", uri2 != null ? uri2 : "")})), y6h1VarA, gsk0Var.c.b, System.currentTimeMillis());
                    }
                } else {
                    if (!jc7Var.equals(hc7.a)) {
                        if (!jc7Var.equals(ic7.a)) {
                            eg.o();
                            return null;
                        }
                        sfu0 sfu0Var = lc7Var.h;
                        if ((sfu0Var instanceof ofu0) || (sfu0Var instanceof lfu0)) {
                            String uri3 = iVar.getUri();
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", uri3 != null ? uri3 : "")), y6h1Var2, gsk0Var.c.b, System.currentTimeMillis());
                        } else {
                            if (!(sfu0Var instanceof rfu0) && !(sfu0Var instanceof kfu0)) {
                                eg.o();
                                return null;
                            }
                            String uri4 = iVar.getUri();
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", uri4 != null ? uri4 : "")), y6h1Var2, gsk0Var.c.b, System.currentTimeMillis());
                        }
                        return w7h1Var2;
                    }
                    x6h1 x6h1VarC6 = y6h1Var2.c();
                    x6h1VarC6.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC6.a();
                    String uri5 = iVar.getUri();
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_item_from_playlist", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_removed_from_playlist", uri5 != null ? uri5 : ""), new mmr0("playlist", str)})), y6h1VarA2, gsk0Var.c.b, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 8:
                ((Number) obj3).intValue();
                return new ecl0((r6h1) obj4);
            case 9:
                ecl0 ecl0Var = (ecl0) obj;
                if (((pn7) obj4).equals(pn7.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:chat-trusted-circle")), ecl0Var.b, ecl0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 10:
                return new gcl0(Integer.valueOf(((Number) obj3).intValue()), z6b1.a(((bo7) obj).a), (r6h1) obj4);
            case 11:
                gcl0 gcl0Var = (gcl0) obj;
                bo7 bo7Var = (bo7) obj2;
                ao7 ao7Var = (ao7) obj4;
                r6h1 r6h1Var2 = gcl0Var.a;
                y6h1 y6h1Var3 = gcl0Var.b;
                if (ao7Var.equals(xn7.a)) {
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("row_tapped", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", z6b1.a(bo7Var.a))), x6h1VarC7.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!(ao7Var instanceof wn7)) {
                        return null;
                    }
                    if (((wn7) ao7Var).a) {
                        x6h1 x6h1VarC8 = y6h1Var3.c();
                        x6h1VarC8.i.add(new a7h1("listening_activity_toggle", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC8.j = false;
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), x6h1VarC8.a(), r6h1Var2, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC9 = y6h1Var3.c();
                        x6h1VarC9.i.add(new a7h1("listening_activity_toggle", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC9.j = false;
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), x6h1VarC9.a(), r6h1Var2, System.currentTimeMillis());
                    }
                }
                return w7h1Var4;
            case 12:
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                k8e0 k8e0Var = ((jey0) obj).a;
                boolean z = k8e0Var instanceof k8e0;
                k8e0 k8e0Var2 = z ? k8e0Var : null;
                Integer numValueOf2 = k8e0Var2 != null ? Integer.valueOf(k8e0Var2.a) : null;
                k8e0 k8e0Var3 = z ? k8e0Var : null;
                return new yml0(numValueOf2, k8e0Var3 != null ? k8e0Var3.c : null, r6h1Var3);
            case 13:
                return null;
            case 14:
                ((Number) obj3).intValue();
                return new zgl0((r6h1) obj4);
            case 15:
                zgl0 zgl0Var = (zgl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "VIDEO_SETTINGS_AUDIO_LANGUAGE")), zgl0Var.b, zgl0Var.a, System.currentTimeMillis());
            case 16:
                ((Number) obj3).intValue();
                return new qsk0((r6h1) obj4);
            case 17:
                qsk0 qsk0Var = (qsk0) obj;
                zv7 zv7Var = (zv7) obj4;
                if (!(zv7Var instanceof yv7)) {
                    if (zv7Var.equals(xv7.a)) {
                        return qsk0Var.h();
                    }
                    eg.o();
                    return null;
                }
                String str2 = ((yv7) zv7Var).a;
                x6h1 x6h1VarC10 = qsk0Var.b.c();
                x6h1VarC10.i.add(new a7h1("audio_rows", str2, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC10.a(), qsk0Var.a, System.currentTimeMillis());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((Number) obj3).intValue();
                return new qsk0((r6h1) obj4);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                qsk0 qsk0Var2 = (qsk0) obj;
                xbb0 xbb0Var = (zbb0) obj4;
                if (xbb0Var.equals(wbb0.a)) {
                    return qsk0Var2.h();
                }
                if (!(xbb0Var instanceof xbb0)) {
                    if (xbb0Var.equals(ybb0.a)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                String str3 = xbb0Var.a;
                x6h1 x6h1VarC11 = qsk0Var2.b.c();
                x6h1VarC11.i.add(new a7h1("audio_rows", str3, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC11.a(), qsk0Var2.a, System.currentTimeMillis());
            case 20:
                ((Number) obj3).intValue();
                return new ssk0(((p08) obj).a, (r6h1) obj4);
            case 21:
                j68 j68Var = (j68) obj2;
                ((Number) obj3).intValue();
                r6h1 r6h1Var4 = (r6h1) obj4;
                if (j68Var instanceof i68) {
                    h68 h68Var = ((i68) j68Var).a;
                    if (h68Var instanceof g68) {
                        i2 = 1;
                    } else {
                        if (!(h68Var instanceof h68)) {
                            eg.o();
                            return null;
                        }
                        if (h68Var.c) {
                            i2 = 3;
                        }
                    }
                } else {
                    i2 = 1;
                }
                return new gil0(i2, r6h1Var4);
            case 22:
                gil0 gil0Var = (gil0) obj;
                j68 j68Var2 = (j68) obj3;
                c68 c68Var = (c68) obj4;
                if (((c68Var instanceof a68) || (c68Var instanceof b68)) && (j68Var2 instanceof i68)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", ((i68) j68Var2).b)), gil0Var.b, gil0Var.a, System.currentTimeMillis());
                }
                return null;
            case 23:
                bwl0 bwl0Var = (bwl0) obj;
                y78 y78Var = (y78) obj3;
                w78 w78Var = (w78) obj4;
                String str4 = ((x78) obj2).a;
                if (w78Var instanceof v78) {
                    return bwl0Var.a(str4);
                }
                if (w78Var.equals(t78Var)) {
                    qgl0 qgl0Var = new qgl0(bwl0Var);
                    return y78Var.m ? qgl0Var.r() : qgl0Var.l(str4);
                }
                if (!w78Var.equals(u78Var)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC12 = bwl0Var.a.c();
                x6h1VarC12.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
            case 24:
                wvl0 wvl0Var = (wvl0) obj;
                y78 y78Var2 = (y78) obj3;
                w78 w78Var2 = (w78) obj4;
                String str5 = ((x78) obj2).a;
                if (w78Var2 instanceof v78) {
                    return wvl0Var.a(str5);
                }
                if (w78Var2.equals(t78Var)) {
                    qgl0 qgl0Var2 = new qgl0(wvl0Var);
                    return y78Var2.m ? qgl0Var2.r() : qgl0Var2.l(str5);
                }
                if (!w78Var2.equals(u78Var)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC13 = wvl0Var.a.c();
                x6h1VarC13.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
            case 25:
                ((Number) obj3).intValue();
                return new u6m0(new ksk0((byte) 24), ((p60) obj2).e);
            case 26:
                return null;
            case 27:
                ((Number) obj3).intValue();
                return new c4l0((r6h1) obj4);
            case 28:
                c4l0 c4l0Var = (c4l0) obj;
                if (((gb8) obj4) != gb8.a) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC14 = c4l0Var.b.c();
                x6h1VarC14.i.add(new a7h1("discover_more_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC14.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:genre:0JQ5DAqbMKFETqK4t8f1n3")), x6h1VarC14.a(), c4l0Var.a, System.currentTimeMillis());
            default:
                ((Number) obj3).intValue();
                return new dcl0((r6h1) obj4);
        }
    }
}
