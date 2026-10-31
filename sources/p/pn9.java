package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pn9 extends hab0 implements zu30 {
    public static final pn9 N0;
    public static final pn9 O0;
    public static final pn9 P0;
    public static final pn9 Q0;
    public static final pn9 R0;
    public static final pn9 S0;
    public static final pn9 T0;
    public static final pn9 U0;
    public static final pn9 V0;
    public static final pn9 W0;
    public static final pn9 X;
    public static final pn9 X0;
    public static final pn9 Y;
    public static final pn9 Y0;
    public static final pn9 Z;
    public static final pn9 Z0;
    public static final pn9 a1;
    public static final pn9 b;
    public static final pn9 b1;
    public static final pn9 c;
    public static final pn9 c1;
    public static final pn9 d;
    public static final pn9 d1;
    public static final pn9 e;
    public static final pn9 e1;
    public static final pn9 f;
    public static final pn9 g;
    public static final pn9 h;
    public static final pn9 i;
    public static final pn9 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new pn9(i2, (byte) 0);
        c = new pn9(i2, (byte) 1);
        d = new pn9(i2, (byte) 2);
        e = new pn9(i2, (byte) 3);
        f = new pn9(i2, (byte) 4);
        g = new pn9(i2, (byte) 5);
        h = new pn9(i2, (byte) 6);
        i = new pn9(i2, (byte) 7);
        t = new pn9(i2, (byte) 8);
        X = new pn9(i2, (byte) 9);
        Y = new pn9(i2, (byte) 10);
        Z = new pn9(i2, (byte) 11);
        N0 = new pn9(i2, (byte) 12);
        O0 = new pn9(i2, (byte) 13);
        P0 = new pn9(i2, (byte) 14);
        Q0 = new pn9(i2, (byte) 15);
        R0 = new pn9(i2, (byte) 16);
        S0 = new pn9(i2, (byte) 17);
        T0 = new pn9(i2, (byte) 18);
        U0 = new pn9(i2, (byte) 19);
        V0 = new pn9(i2, (byte) 20);
        W0 = new pn9(i2, (byte) 21);
        X0 = new pn9(i2, (byte) 22);
        Y0 = new pn9(i2, (byte) 23);
        Z0 = new pn9(i2, (byte) 24);
        a1 = new pn9(i2, (byte) 25);
        b1 = new pn9(i2, (byte) 26);
        c1 = new pn9(i2, (byte) 27);
        d1 = new pn9(i2, (byte) 28);
        e1 = new pn9(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn9(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        Object obj5;
        w7h1 w7h1Var3;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new on9((r6h1) obj4);
            case 1:
                r6h1 r6h1Var = ((on9) obj).a;
                int iOrdinal = ((ln9) obj4).ordinal();
                if (iOrdinal == 0) {
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-nowplaying-close-button";
                    x6h1VarI.f = "3.0.0";
                    x6h1VarI.g = "22.0.0";
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarI.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    y6h1 y6h1Var2 = y6h1.i;
                    x6h1 x6h1VarI2 = i3o1.i();
                    x6h1VarI2.h = "music";
                    x6h1VarI2.a = "mobile-context-menu-button";
                    x6h1VarI2.f = "2.0.0";
                    x6h1VarI2.g = "22.0.0";
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarI2.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                ((Number) obj3).intValue();
                return new ygl0((r6h1) obj4);
            case 3:
                ygl0 ygl0Var = (ygl0) obj;
                if (yn9.a[((vn9) obj4).ordinal()] == 1) {
                    String str = nik1.p1.a;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), ygl0Var.b, ygl0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 4:
                ((Number) obj3).intValue();
                return new ill0((r6h1) obj4);
            case 5:
                ((Number) obj3).intValue();
                return new uil0((r6h1) obj4);
            case 6:
                ((Number) obj3).intValue();
                return new vil0((r6h1) obj4);
            case 7:
                ((Number) obj3).intValue();
                return new pil0((r6h1) obj4);
            case 8:
                ((Number) obj3).intValue();
                return new cs9((r6h1) obj4);
            case 9:
                ((Number) obj3).intValue();
                return new guk0(((rs9) obj).a, (r6h1) obj4);
            case 10:
                guk0 guk0Var = (guk0) obj;
                qs9 qs9Var = (qs9) obj4;
                r6h1 r6h1Var2 = guk0Var.a;
                y6h1 y6h1Var3 = guk0Var.b;
                if (qs9Var instanceof ps9) {
                    return null;
                }
                if (qs9Var instanceof os9) {
                    x6h1 x6h1VarC = y6h1Var3.c();
                    x6h1VarC.i.add(new a7h1("volume_slider", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    int iU = jch0.U(((os9) qs9Var).a * 100.0f);
                    z7h1 z7h1Var = new z7h1("swipe", 1, b7xVar);
                    String strValueOf = String.valueOf(iU);
                    w7h1Var2 = new w7h1("", "", z7h1Var, new x7h1("set_volume", 1, Collections.singletonMap("new_volume_percentage", strValueOf != null ? strValueOf : "")), y6h1VarA, r6h1Var2, System.currentTimeMillis());
                } else if (qs9Var.equals(ms9.a)) {
                    x6h1 x6h1VarC2 = y6h1Var3.c();
                    x6h1VarC2.i.add(new a7h1("mute_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mute_playback", 1, b7xVar), x6h1VarC2.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!qs9Var.equals(ns9.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var3.c();
                    x6h1VarC3.i.add(new a7h1("unmute_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unmute_playback", 1, b7xVar), x6h1VarC3.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 11:
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = r6h1.c;
                return new cul0();
            case 12:
                cul0 cul0Var = (cul0) obj;
                nhb1 nhb1Var = (nhb1) obj3;
                lhb1 lhb1Var = (lhb1) obj4;
                if (!lhb1Var.equals(jhb1.a)) {
                    if (lhb1Var.equals(khb1.a)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC4 = cul0Var.a.c();
                x6h1VarC4.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA2 = x6h1VarC4.a();
                String strM = flo1.m(nhb1Var, "spotify:premium-destination");
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strM != null ? strM : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            case 13:
                ((Number) obj3).intValue();
                return new gpl0((r6h1) obj4);
            case 14:
                gpl0 gpl0Var = (gpl0) obj;
                nji0 nji0Var = ((c3a) obj3).c;
                if (!((a3a) obj4).equals(a3a.a)) {
                    eg.o();
                    return null;
                }
                char c2 = wro1.M(nji0Var) ? (char) 2 : (char) 1;
                char c3 = wro1.M(nji0Var) ? (char) 1 : (char) 2;
                z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                String str2 = "private";
                if (c2 == 1) {
                    obj5 = "private";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    obj5 = "public";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj5);
                if (c3 != 1) {
                    if (c3 != 2) {
                        throw null;
                    }
                    str2 = "public";
                }
                return new w7h1("", "", z7h1Var2, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str2)})), gpl0Var.b, gpl0Var.a, System.currentTimeMillis());
            case 15:
                ((Number) obj3).intValue();
                return new mtk0(new py9((r6h1) obj4, (byte) 19), ((u3a) obj).a);
            case 16:
                mtk0 mtk0Var = (mtk0) obj;
                y6h1 y6h1Var4 = mtk0Var.a;
                r6h1 r6h1Var4 = mtk0Var.b.b;
                String str3 = ((u3a) obj2).a;
                int iOrdinal2 = ((r3a) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", str3 != null ? str3 : "")), y6h1Var4, r6h1Var4, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_dislike", 1, Collections.singletonMap("item_no_longer_disliked", str3 != null ? str3 : "")), y6h1Var4, r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 17:
                ((Number) obj3).intValue();
                return yz10.e(((d5a) obj).g);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                a5a a5aVar = (a5a) obj4;
                return yz10.f(0, a5aVar.a, a5aVar.b);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((Number) obj3).intValue();
                return yz10.e(((dka) obj).c);
            case 20:
                vja vjaVar = (vja) obj4;
                return yz10.f(0, vjaVar.a, vjaVar.b);
            case 21:
                ((Number) obj3).intValue();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new t2m0(new ksk0(yon1.X4().a, nik1.g1.a, (byte) 22));
            case 22:
                t2m0 t2m0Var = (t2m0) obj;
                if (((jua) obj4) == jua.a) {
                    String str4 = lua.e;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), t2m0Var.a, t2m0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 23:
                ((Number) obj3).intValue();
                return new tfl0((r6h1) obj4);
            case 24:
                return new wza((jo70) obj, (jo70) obj2, (xkk1) obj3, (xkk1) obj4);
            case 25:
                ((Number) obj3).intValue();
                return new p0m0((r6h1) obj4);
            case 26:
                p0m0 p0m0Var = (p0m0) obj;
                xza xzaVar = (xza) obj2;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", gvg.h("spotify:artist:", (String) o7h.A0(ihc1.Q0(xzaVar.a, new String[]{":"}, 0, 6)), ":dna:blend:", (String) o7h.A0(ihc1.Q0(xzaVar.b, new String[]{":"}, 0, 6))))), p0m0Var.b, p0m0Var.a, System.currentTimeMillis());
            case 27:
                ((Number) obj3).intValue();
                return new nml0(new fjl0((r6h1) obj4, (byte) 8));
            case 28:
                nml0 nml0Var = (nml0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), nml0Var.a, nml0Var.b.b, System.currentTimeMillis());
            default:
                ((Number) obj3).intValue();
                return new tll0((r6h1) obj4);
        }
    }
}
