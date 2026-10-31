package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jb8 extends hab0 implements zu30 {
    public static final jb8 N0;
    public static final jb8 O0;
    public static final jb8 P0;
    public static final jb8 Q0;
    public static final jb8 R0;
    public static final jb8 S0;
    public static final jb8 T0;
    public static final jb8 U0;
    public static final jb8 V0;
    public static final jb8 W0;
    public static final jb8 X;
    public static final jb8 X0;
    public static final jb8 Y;
    public static final jb8 Y0;
    public static final jb8 Z;
    public static final jb8 Z0;
    public static final jb8 a1;
    public static final jb8 b;
    public static final jb8 b1;
    public static final jb8 c;
    public static final jb8 c1;
    public static final jb8 d;
    public static final jb8 d1;
    public static final jb8 e;
    public static final jb8 e1;
    public static final jb8 f;
    public static final jb8 g;
    public static final jb8 h;
    public static final jb8 i;
    public static final jb8 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new jb8(i2, (byte) 0);
        c = new jb8(i2, (byte) 1);
        d = new jb8(i2, (byte) 2);
        e = new jb8(i2, (byte) 3);
        f = new jb8(i2, (byte) 4);
        g = new jb8(i2, (byte) 5);
        h = new jb8(i2, (byte) 6);
        i = new jb8(i2, (byte) 7);
        t = new jb8(i2, (byte) 8);
        X = new jb8(i2, (byte) 9);
        Y = new jb8(i2, (byte) 10);
        Z = new jb8(i2, (byte) 11);
        N0 = new jb8(i2, (byte) 12);
        O0 = new jb8(i2, (byte) 13);
        P0 = new jb8(i2, (byte) 14);
        Q0 = new jb8(i2, (byte) 15);
        R0 = new jb8(i2, (byte) 16);
        S0 = new jb8(i2, (byte) 17);
        T0 = new jb8(i2, (byte) 18);
        U0 = new jb8(i2, (byte) 19);
        V0 = new jb8(i2, (byte) 20);
        W0 = new jb8(i2, (byte) 21);
        X0 = new jb8(i2, (byte) 22);
        Y0 = new jb8(i2, (byte) 23);
        Z0 = new jb8(i2, (byte) 24);
        a1 = new jb8(i2, (byte) 25);
        b1 = new jb8(i2, (byte) 26);
        c1 = new jb8(i2, (byte) 27);
        d1 = new jb8(i2, (byte) 28);
        e1 = new jb8(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb8(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        w7h1 w7h1Var;
        Object obj6;
        w7h1 w7h1Var2;
        byte b2 = this.a;
        String str = "off";
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                dcl0 dcl0Var = (dcl0) obj;
                String str2 = ((ib8) obj2).b;
                if (!((hb8) obj4).equals(hb8.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC = dcl0Var.b.c();
                x6h1VarC.i.add(new a7h1("navigate_button", (String) null, (Integer) null, str2, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC.a(), dcl0Var.a, System.currentTimeMillis());
            case 1:
                jvl0 jvl0Var = (jvl0) obj;
                xb8 xb8Var = (xb8) obj3;
                tb8 tb8Var = (tb8) obj4;
                String str3 = ((vb8) obj2).a;
                if (tb8Var instanceof sb8) {
                    return jvl0Var.a(str3);
                }
                if (tb8Var.equals(qb8.a)) {
                    qgl0 qgl0Var = new qgl0(jvl0Var);
                    return xb8Var.b ? qgl0Var.r() : qgl0Var.l(str3);
                }
                eg.o();
                return null;
            case 2:
                ((Number) obj3).intValue();
                return new dcl0((r6h1) obj4);
            case 3:
                dcl0 dcl0Var2 = (dcl0) obj;
                mc8 mc8Var = (mc8) obj2;
                y6h1 y6h1Var = dcl0Var2.b;
                if (!((lc8) obj4).equals(lc8.a)) {
                    eg.o();
                    return null;
                }
                if (mc8Var.a) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("expand_collapse_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), dcl0Var2.a, System.currentTimeMillis());
                }
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("expand_collapse_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), dcl0Var2.a, System.currentTimeMillis());
            case 4:
                ((Number) obj3).intValue();
                return new ca8(((f78) obj).a, (r6h1) obj4);
            case 5:
                return new as0((Context) obj2, (ViewGroup) obj3, (iu30) obj4, (byte) 3);
            case 6:
                ((Number) obj3).intValue();
                return new bul0();
            case 7:
                ((Number) obj3).intValue();
                return new tfl0((r6h1) obj4);
            case 8:
                bul0 bul0Var = (bul0) obj;
                cf8 cf8Var = (cf8) obj2;
                if (!((af8) obj4).equals(af8.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC4 = bul0Var.a.c();
                x6h1VarC4.i.add(new a7h1("manage_audiobook_hours_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", cf8Var.a)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
            case 9:
                tfl0 tfl0Var = (tfl0) obj;
                if (!((bf8) obj4).equals(bf8.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC5 = tfl0Var.b.c();
                x6h1VarC5.i.add(new a7h1("self_managed_group", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("manage_audiobook_hours_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), tfl0Var.a, System.currentTimeMillis());
            case 10:
                wvl0 wvl0Var = (wvl0) obj;
                qn8 qn8Var = (qn8) obj3;
                on8 on8Var = (on8) obj4;
                String str4 = ((pn8) obj2).a;
                if (on8Var instanceof nn8) {
                    return wvl0Var.a(str4);
                }
                if (on8Var.equals(mn8.a)) {
                    return qn8Var.f ? wvl0Var.j(str4) : wvl0Var.h(str4);
                }
                eg.o();
                return null;
            case 11:
                jvl0 jvl0Var2 = (jvl0) obj;
                ep8 ep8Var = (ep8) obj3;
                cp8 cp8Var = (cp8) obj4;
                String str5 = ((dp8) obj2).a;
                if (cp8Var instanceof bp8) {
                    return jvl0Var2.a(str5);
                }
                if (cp8Var.equals(ap8.a)) {
                    return ep8Var.c ? jvl0Var2.k(str5) : jvl0Var2.h(str5);
                }
                eg.o();
                return null;
            case 12:
                lu8 lu8Var = (lu8) obj2;
                ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var = (b0k) obj3;
                x340Var.i0(-1073072649);
                ku8 ku8Var = lu8Var.a;
                boolean zE = x340Var.e(ku8Var.ordinal());
                Object objT = x340Var.T();
                if (zE || objT == m4cVar) {
                    objT = yv91.a(new nu8(lu8Var, (byte) 1));
                    x340Var.s0(objT);
                }
                tob1 tob1Var = (tob1) objT;
                boolean zE2 = x340Var.e(ku8Var.ordinal());
                Object objT2 = x340Var.T();
                if (zE2 || objT2 == m4cVar) {
                    objT2 = yv91.a(new nu8(lu8Var, (byte) 0));
                    x340Var.s0(objT2);
                }
                mu8 mu8Var = new mu8(((Number) tob1Var.getValue()).intValue(), ((Boolean) ((tob1) objT2).getValue()).booleanValue());
                x340Var.r(false);
                return mu8Var;
            case 13:
                ((Number) obj3).intValue();
                return new oml0(new fjl0((r6h1) obj4, (byte) 8));
            case 14:
                oml0 oml0Var = (oml0) obj;
                boolean z = ((lv8) obj3).a;
                char c2 = z ? (char) 2 : (char) 1;
                char c3 = z ? (char) 1 : (char) 2;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (c2 == 1) {
                    obj5 = "off";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    obj5 = "on";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj5);
                if (c3 != 1) {
                    if (c3 != 2) {
                        throw null;
                    }
                    str = "on";
                }
                return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str)})), oml0Var.a, oml0Var.b.b, System.currentTimeMillis());
            case 15:
                gvl0 gvl0Var = (gvl0) obj;
                z39 z39Var = (z39) obj2;
                y39 y39Var = (y39) obj4;
                if (y39Var.equals(v39.a)) {
                    return gvl0Var.a(z39Var.a);
                }
                if (y39Var.equals(x39.a)) {
                    x6h1 x6h1VarC7 = gvl0Var.a.c();
                    x6h1VarC7.i.add(new a7h1("tap_ahead_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("change_search_query", 1, Collections.singletonMap("search_query_string", z39Var.e.concat(" "))), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                }
                if (y39Var.equals(w39.a)) {
                    return gvl0Var.h();
                }
                eg.o();
                return null;
            case 16:
                ((Number) obj3).intValue();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new s2m0(new ksk0(yon1.X4().a, nik1.g1.a, (byte) 22), ((ma9) obj2).c ? 2 : 1);
            case 17:
                s2m0 s2m0Var = (s2m0) obj;
                ma9 ma9Var = (ma9) obj3;
                if (((la9) obj4) != la9.a) {
                    eg.o();
                    return null;
                }
                String str6 = ma9Var.d;
                if (str6 != null) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6)), s2m0Var.a, s2m0Var.b.b, System.currentTimeMillis());
                }
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new nyk0(Integer.valueOf(((Number) obj3).intValue()), ((vk9) obj).a, (r6h1) obj4);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                nyk0 nyk0Var = (nyk0) obj;
                vk9 vk9Var = (vk9) obj2;
                uk9 uk9Var = (uk9) obj4;
                if (uk9Var.equals(sk9.a)) {
                    return nyk0Var.h(vk9Var.a);
                }
                if (!uk9Var.equals(tk9.a)) {
                    eg.o();
                    return null;
                }
                r6h1 r6h1VarB = nyk0Var.b();
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-context-menu-button";
                x6h1VarI.f = "2.0.0";
                x6h1VarI.g = "22.0.0";
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarI.a(), r6h1VarB, System.currentTimeMillis());
            case 20:
                return new c6l0(Integer.valueOf(((Number) obj3).intValue()), (String) obj, (r6h1) obj4);
            case 21:
                return null;
            case 22:
                ((Number) obj3).intValue();
                return new ztk0((String) obj);
            case 23:
                return null;
            case 24:
                ((Number) obj3).intValue();
                return new guk0(((bm9) obj).a, (r6h1) obj4);
            case 25:
                guk0 guk0Var = (guk0) obj;
                am9 am9Var = (am9) obj4;
                r6h1 r6h1Var = guk0Var.a;
                y6h1 y6h1Var3 = guk0Var.b;
                if (am9Var instanceof zl9) {
                    return null;
                }
                if (am9Var instanceof yl9) {
                    x6h1 x6h1VarC8 = y6h1Var3.c();
                    x6h1VarC8.i.add(new a7h1("volume_slider", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    y6h1 y6h1VarA = x6h1VarC8.a();
                    int iU = jch0.U(((yl9) am9Var).a * 100.0f);
                    z7h1 z7h1Var2 = new z7h1("swipe", 1, b7xVar);
                    String strValueOf = String.valueOf(iU);
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                    w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("set_volume", 1, Collections.singletonMap("new_volume_percentage", strValueOf)), y6h1VarA, r6h1Var, System.currentTimeMillis());
                } else if (am9Var.equals(wl9.a)) {
                    x6h1 x6h1VarC9 = y6h1Var3.c();
                    x6h1VarC9.i.add(new a7h1("mute_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mute_playback", 1, b7xVar), x6h1VarC9.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!am9Var.equals(xl9.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC10 = y6h1Var3.c();
                    x6h1VarC10.i.add(new a7h1("unmute_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unmute_playback", 1, b7xVar), x6h1VarC10.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 26:
                ((Number) obj3).intValue();
                return new ytk0((r6h1) obj4);
            case 27:
                ytk0 ytk0Var = (ytk0) obj;
                x6h1 x6h1VarC11 = ytk0Var.b.c();
                x6h1VarC11.i.add(new a7h1("ducking_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                y6h1 y6h1VarA2 = x6h1VarC11.a();
                boolean z2 = ((xm9) obj4).a;
                char c4 = z2 ? (char) 1 : (char) 2;
                char c5 = z2 ? (char) 2 : (char) 1;
                z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                if (c4 == 1) {
                    obj6 = "off";
                } else {
                    if (c4 != 2) {
                        throw null;
                    }
                    obj6 = "on";
                }
                mmr0 mmr0Var2 = new mmr0("state_before_toggle", obj6);
                if (c5 != 1) {
                    if (c5 != 2) {
                        throw null;
                    }
                    str = "on";
                }
                return new w7h1("", "", z7h1Var3, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var2, new mmr0("state_after_toggle", str)})), y6h1VarA2, ytk0Var.a, System.currentTimeMillis());
            case 28:
                auk0 auk0Var = (auk0) obj;
                fn9 fn9Var = (fn9) obj3;
                dn9 dn9Var = (dn9) obj4;
                r6h1 r6h1Var2 = auk0Var.a;
                y6h1 y6h1Var4 = auk0Var.b;
                if (dn9Var.equals(bn9.a)) {
                    String str7 = in9.a;
                    if (str7 == null) {
                        return null;
                    }
                    x6h1 x6h1VarC12 = y6h1Var4.c();
                    x6h1VarC12.i.add(new a7h1("see_more_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7)), x6h1VarC12.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!dn9Var.equals(cn9.a)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", fn9Var.a)), y6h1Var4, r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var2;
            default:
                buk0 buk0Var = (buk0) obj;
                kn9 kn9Var = (kn9) obj2;
                if (((jn9) obj4).equals(jn9.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", kn9Var.d)), buk0Var.b, buk0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
        }
    }
}
