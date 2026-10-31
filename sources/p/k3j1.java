package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k3j1 extends hab0 implements zu30 {
    public static final k3j1 N0;
    public static final k3j1 O0;
    public static final k3j1 P0;
    public static final k3j1 Q0;
    public static final k3j1 R0;
    public static final k3j1 S0;
    public static final k3j1 T0;
    public static final k3j1 U0;
    public static final k3j1 V0;
    public static final k3j1 W0;
    public static final k3j1 X;
    public static final k3j1 X0;
    public static final k3j1 Y;
    public static final k3j1 Y0;
    public static final k3j1 Z;
    public static final k3j1 Z0;
    public static final k3j1 a1;
    public static final k3j1 b;
    public static final k3j1 b1;
    public static final k3j1 c;
    public static final k3j1 c1;
    public static final k3j1 d;
    public static final k3j1 d1;
    public static final k3j1 e;
    public static final k3j1 e1;
    public static final k3j1 f;
    public static final k3j1 g;
    public static final k3j1 h;
    public static final k3j1 i;
    public static final k3j1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new k3j1(i2, (byte) 0);
        c = new k3j1(i2, (byte) 1);
        d = new k3j1(i2, (byte) 2);
        e = new k3j1(i2, (byte) 3);
        f = new k3j1(i2, (byte) 4);
        g = new k3j1(i2, (byte) 5);
        h = new k3j1(i2, (byte) 6);
        i = new k3j1(i2, (byte) 7);
        t = new k3j1(i2, (byte) 8);
        X = new k3j1(i2, (byte) 9);
        Y = new k3j1(i2, (byte) 10);
        Z = new k3j1(i2, (byte) 11);
        N0 = new k3j1(i2, (byte) 12);
        O0 = new k3j1(i2, (byte) 13);
        P0 = new k3j1(i2, (byte) 14);
        Q0 = new k3j1(i2, (byte) 15);
        R0 = new k3j1(i2, (byte) 16);
        S0 = new k3j1(i2, (byte) 17);
        T0 = new k3j1(i2, (byte) 18);
        U0 = new k3j1(i2, (byte) 19);
        V0 = new k3j1(i2, (byte) 20);
        W0 = new k3j1(i2, (byte) 21);
        X0 = new k3j1(i2, (byte) 22);
        Y0 = new k3j1(i2, (byte) 23);
        Z0 = new k3j1(i2, (byte) 24);
        a1 = new k3j1(i2, (byte) 25);
        b1 = new k3j1(i2, (byte) 26);
        c1 = new k3j1(i2, (byte) 27);
        d1 = new k3j1(i2, (byte) 28);
        e1 = new k3j1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3j1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        Integer numValueOf;
        jo70 jo70Var = (jo70) obj;
        xkk1 xkk1Var = (xkk1) obj2;
        zoy0 zoy0Var = (zoy0) obj3;
        hll hllVar = (hll) obj4;
        yoy0 yoy0Var = zoy0Var != null ? (yoy0) zoy0Var.b.b : null;
        if (yoy0Var instanceof xoy0) {
            numValueOf = Integer.valueOf(((xoy0) yoy0Var).a);
        } else if (yoy0Var instanceof woy0) {
            numValueOf = Integer.valueOf(((woy0) yoy0Var).a);
        } else {
            numValueOf = yoy0Var instanceof voy0 ? Integer.valueOf(((voy0) yoy0Var).a) : null;
        }
        String strValueOf = numValueOf != null ? String.valueOf(numValueOf.intValue()) : null;
        String str = jo70Var.a;
        c380 c380VarA = mqo1.A(hllVar.b);
        mq70 mq70Var = xkk1Var.b;
        if (mq70Var == null) {
            mq70Var = xkk1Var.a;
        }
        up70 up70VarA = mq70Var.a(vp70.c);
        return new q6g1((xn70) null, new bv11(str, (String) null, (Long) null, (Long) null, (u380) null, 0, false, c380VarA, (h540) null, (vno1) null, (c380) null, new sz6(up70VarA != null ? up70VarA.a.a : null, u37.a), false, strValueOf, (Long) null, 0L, (o5a1) null, (wqo) null, (bul) null, (po11) null, (msv0) null, (ati1) null, (c380) null, (String) null, (ktl) null, 67098494));
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        Object obj5;
        w7h1 w7h1Var5;
        byte b2 = this.a;
        rxc rxcVar = rxc.a;
        bf21 bf21Var = bf21.a;
        grg grgVar = grg.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                z3l0 z3l0Var = (z3l0) obj;
                g3j1 g3j1Var = (g3j1) obj4;
                String str = ((h3j1) obj2).a;
                z2a z2aVar = ((i3j1) obj3).b;
                if (g3j1Var instanceof c3j1) {
                    return z3l0Var.h();
                }
                if (g3j1Var instanceof d3j1) {
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-artist-badges-bottom-sheet";
                    x6h1VarI.f = "0.0.1";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.d = str;
                    x6h1 x6h1VarR = kk0.r(x6h1VarI, "artist");
                    x6h1VarR.i.add(new a7h1("outside_area", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarR.a(), r6h1.c, System.currentTimeMillis());
                } else if (g3j1Var instanceof f3j1) {
                    y6h1 y6h1Var2 = y6h1.i;
                    x6h1 x6h1VarI2 = i3o1.i();
                    x6h1VarI2.h = "music";
                    x6h1VarI2.a = "mobile-artist-badges-bottom-sheet";
                    x6h1VarI2.f = "0.0.1";
                    x6h1VarI2.g = "22.0.0";
                    x6h1VarI2.d = str;
                    y6h1 y6h1VarA = x6h1VarI2.a();
                    Collections.singletonList("artist");
                    int iW = h0p1.w(z2aVar);
                    x6h1 x6h1VarC = y6h1VarA.c();
                    x6h1VarC.i.add(new a7h1("badge_card", v8i0.g(iW), 0, (String) null, (String) null));
                    x6h1VarC.j = true;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("learn_more_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", ((f3j1) g3j1Var).a)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(g3j1Var instanceof e3j1)) {
                        eg.o();
                        return null;
                    }
                    y6h1 y6h1Var3 = y6h1.i;
                    x6h1 x6h1VarI3 = i3o1.i();
                    x6h1VarI3.h = "music";
                    x6h1VarI3.a = "mobile-artist-badges-bottom-sheet";
                    x6h1VarI3.f = "0.0.1";
                    x6h1VarI3.g = "22.0.0";
                    x6h1VarI3.d = str;
                    y6h1 y6h1VarA2 = x6h1VarI3.a();
                    Collections.singletonList("artist");
                    Integer numValueOf = Integer.valueOf(!(z2aVar instanceof w2a) ? 1 : 0);
                    x6h1 x6h1VarC3 = y6h1VarA2.c();
                    x6h1VarC3.i.add(new a7h1("badge_card", "fresh_finds_forward", numValueOf, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("explore_link", (String) null, (Integer) null, "spotify:genre:0JQ5DAqbMKFImHYGo3eTSg", (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:genre:0JQ5DAqbMKFImHYGo3eTSg")), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 1:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = r6h1.c;
                return new nxl0(new qrl0((byte) 8));
            case 2:
                nxl0 nxl0Var = (nxl0) obj;
                if (((c4j1) obj4) == c4j1.a) {
                    return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("copy_to_clipboard", 1, b7xVar), nxl0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 3:
                ((Number) obj3).intValue();
                int i2 = ((u4j1) obj).a ? 1 : 2;
                r6h1 r6h1Var2 = r6h1.c;
                return new b3m0(i2);
            case 4:
                Integer numValueOf2 = Integer.valueOf(((Number) obj3).intValue());
                ji0 ji0Var = ((mbj1) obj).a;
                return new dqk0(numValueOf2, ji0Var.h, gq0.e(ji0Var.a), (r6h1) obj4);
            case 5:
                dqk0 dqk0Var = (dqk0) obj;
                ybj1 ybj1Var = (ybj1) obj4;
                r6h1 r6h1Var3 = dqk0Var.a;
                y6h1 y6h1Var4 = dqk0Var.b;
                String str2 = ((mbj1) obj2).a.e;
                if (ybj1Var.equals(ey0.a)) {
                    x6h1 x6h1VarC5 = y6h1Var4.c();
                    x6h1VarC5.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str2 == null ? "" : str2)), x6h1VarC5.a(), r6h1Var3, System.currentTimeMillis());
                } else if (ybj1Var.equals(sxc.a)) {
                    x6h1 x6h1VarC6 = y6h1Var4.c();
                    x6h1VarC6.i.add(new a7h1("body", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                    x6h1VarC7.i.add(new a7h1("tagline", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str2 == null ? "" : str2)), x6h1VarC8.a(), r6h1Var3, System.currentTimeMillis());
                } else if (ybj1Var.equals(sw50.a)) {
                    x6h1 x6h1VarC9 = y6h1Var4.c();
                    x6h1VarC9.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str2 == null ? "" : str2)), x6h1VarC9.a(), r6h1Var3, System.currentTimeMillis());
                } else if (ybj1Var.equals(bpd1.a)) {
                    x6h1 x6h1VarC10 = y6h1Var4.c();
                    x6h1VarC10.i.add(new a7h1("body", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                    x6h1VarC11.i.add(new a7h1("tagline", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str2 == null ? "" : str2)), x6h1VarC11.a(), r6h1Var3, System.currentTimeMillis());
                } else if (ybj1Var.equals(hgn0.a)) {
                    x6h1 x6h1VarC12 = y6h1Var4.c();
                    x6h1VarC12.i.add(new a7h1("body", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                    x6h1VarC13.i.add(new a7h1("mute_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mute_playback", 1, b7xVar), x6h1VarC13.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if (!ybj1Var.equals(sjh1.a)) {
                        if (ybj1Var.equals(lv7.a) || (ybj1Var instanceof vr10) || (ybj1Var instanceof l7u0) || (ybj1Var instanceof yjk1) || (ybj1Var instanceof zql1)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC14 = y6h1Var4.c();
                    x6h1VarC14.i.add(new a7h1("body", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    x6h1 x6h1VarC15 = x6h1VarC14.a().c();
                    x6h1VarC15.i.add(new a7h1("mute_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unmute_playback", 1, b7xVar), x6h1VarC15.a(), r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 6:
                Integer numValueOf3 = Integer.valueOf(((Number) obj3).intValue());
                fq0 fq0Var = ((taj1) obj).a;
                return new dqk0(numValueOf3, fq0Var.k(), gq0.e(fq0Var.a()), (r6h1) obj4);
            case 7:
                dqk0 dqk0Var2 = (dqk0) obj;
                taj1 taj1Var = (taj1) obj2;
                adj1 adj1Var = (edj1) obj3;
                nbj1 nbj1Var = (nbj1) obj4;
                r6h1 r6h1Var4 = dqk0Var2.a;
                y6h1 y6h1Var5 = dqk0Var2.b;
                String strG = taj1Var.d.b.g();
                if (nbj1Var.equals(fy0.a)) {
                    x6h1 x6h1VarC16 = y6h1Var5.c();
                    x6h1VarC16.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG == null ? "" : strG)), x6h1VarC16.a(), r6h1Var4, System.currentTimeMillis());
                } else if (nbj1Var.equals(rxcVar)) {
                    x6h1 x6h1VarC17 = y6h1Var5.c();
                    x6h1VarC17.i.add(new a7h1("body", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    x6h1 x6h1VarC18 = x6h1VarC17.a().c();
                    x6h1VarC18.i.add(new a7h1("tagline", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    x6h1 x6h1VarC19 = x6h1VarC18.a().c();
                    x6h1VarC19.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC19.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG == null ? "" : strG)), x6h1VarC19.a(), r6h1Var4, System.currentTimeMillis());
                } else if (nbj1Var.equals(grgVar)) {
                    x6h1 x6h1VarC20 = y6h1Var5.c();
                    x6h1VarC20.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC20.j = false;
                    x6h1 x6h1VarC21 = x6h1VarC20.a().c();
                    x6h1VarC21.i.add(new a7h1("trailing_section", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC21.j = false;
                    x6h1 x6h1VarC22 = x6h1VarC21.a().c();
                    x6h1VarC22.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC22.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC22.a(), r6h1Var4, System.currentTimeMillis());
                } else if (nbj1Var.equals(rw50.a)) {
                    x6h1 x6h1VarC23 = y6h1Var5.c();
                    x6h1VarC23.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC23.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG == null ? "" : strG)), x6h1VarC23.a(), r6h1Var4, System.currentTimeMillis());
                } else if (nbj1Var.equals(cpd1.a)) {
                    x6h1 x6h1VarC24 = y6h1Var5.c();
                    x6h1VarC24.i.add(new a7h1("body", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC24.j = false;
                    x6h1 x6h1VarC25 = x6h1VarC24.a().c();
                    x6h1VarC25.i.add(new a7h1("tagline", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC25.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG == null ? "" : strG)), x6h1VarC25.a(), r6h1Var4, System.currentTimeMillis());
                } else if (nbj1Var.equals(bf21Var)) {
                    x6h1 x6h1VarC26 = y6h1Var5.c();
                    x6h1VarC26.i.add(new a7h1("body", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC26.j = false;
                    x6h1 x6h1VarC27 = x6h1VarC26.a().c();
                    x6h1VarC27.i.add(new a7h1("repeat_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC27.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC27.a();
                    String str3 = taj1Var.b;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str3 == null ? "" : str3)), y6h1VarA3, r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!nbj1Var.equals(uij1.a)) {
                        return null;
                    }
                    xr6 xr6Var = dcj1.a;
                    if (!(adj1Var instanceof adj1)) {
                        return null;
                    }
                    x6h1 x6h1VarC28 = y6h1Var5.c();
                    x6h1VarC28.i.add(new a7h1("body", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC28.j = false;
                    x6h1 x6h1VarC29 = x6h1VarC28.a().c();
                    x6h1VarC29.i.add(new a7h1("mute_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC29.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC29.a();
                    w7h1Var3 = adj1Var.e() ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unmute_playback", 1, b7xVar), y6h1VarA4, r6h1Var4, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mute_playback", 1, b7xVar), y6h1VarA4, r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 8:
                ((Number) obj3).intValue();
                fq0 fq0Var2 = ((taj1) obj).a;
                return new spk0(fq0Var2.k(), gq0.e(fq0Var2.a()), (r6h1) obj4);
            case 9:
                ((Number) obj3).intValue();
                fq0 fq0Var3 = ((taj1) obj).a;
                return new tpk0(fq0Var3.k(), gq0.e(fq0Var3.a()));
            case 10:
                taj1 taj1Var2 = (taj1) obj2;
                adj1 adj1Var2 = (edj1) obj3;
                nbj1 nbj1Var2 = (nbj1) obj4;
                y6h1 y6h1Var6 = ((tpk0) obj).a;
                String str4 = taj1Var2.b;
                String strG2 = taj1Var2.d.b.g();
                if (nbj1Var2.equals(mv7.b)) {
                    x6h1 x6h1VarC30 = y6h1Var6.c();
                    x6h1VarC30.i.add(new a7h1("video_surface", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC30.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_element_toggle", 1, b7xVar), x6h1VarC30.a(), r6h1.c, System.currentTimeMillis());
                } else if (nbj1Var2.equals(grgVar)) {
                    x6h1 x6h1VarC31 = y6h1Var6.c();
                    x6h1VarC31.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC31.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC31.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (nbj1Var2.equals(apt0.a)) {
                        xr6 xr6Var2 = dcj1.a;
                        if ((adj1Var2 instanceof adj1) && adj1Var2.f()) {
                            x6h1 x6h1VarC32 = y6h1Var6.c();
                            x6h1VarC32.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC32.j = false;
                            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", str4 != null ? str4 : "")), x6h1VarC32.a(), r6h1.c, System.currentTimeMillis());
                        }
                        x6h1 x6h1VarC33 = y6h1Var6.c();
                        x6h1VarC33.i.add(new a7h1("play_pause_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC33.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str4 != null ? str4 : "")), x6h1VarC33.a(), r6h1.c, System.currentTimeMillis());
                    }
                    if (nbj1Var2.equals(bf21Var)) {
                        x6h1 x6h1VarC34 = y6h1Var6.c();
                        x6h1VarC34.i.add(new a7h1("repeat_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC34.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str4 != null ? str4 : "")), x6h1VarC34.a(), r6h1.c, System.currentTimeMillis());
                    }
                    if (!nbj1Var2.equals(rxcVar)) {
                        return null;
                    }
                    x6h1 x6h1VarC35 = y6h1Var6.c();
                    x6h1VarC35.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC35.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", strG2 != null ? strG2 : "")), x6h1VarC35.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 11:
                Integer numValueOf4 = Integer.valueOf(((Number) obj3).intValue());
                yej1 yej1Var = ((afj1) obj2).a;
                return new n3m0(yej1Var.c, numValueOf4, yej1Var.d, yej1Var.b, (r6h1) obj4);
            case 12:
                n3m0 n3m0Var = (n3m0) obj;
                afj1 afj1Var = (afj1) obj3;
                if (((rej1) obj4).equals(rej1.a)) {
                    return n3m0Var.a((String) ihc1.Q0(afj1Var.a.e, new String[]{"?"}, 0, 6).get(0));
                }
                eg.o();
                return null;
            case 13:
                pfj1 pfj1Var = (pfj1) obj;
                ((Number) obj3).intValue();
                urk0 urk0Var = new urk0((byte) 4);
                d8r0 d8r0Var = pfj1Var.e;
                mjl0 mjl0Var = new mjl0(urk0Var, d8r0Var.b, d8r0Var.a, d8r0Var.e);
                String str5 = d8r0Var.d;
                if (str5.length() == 0) {
                    str5 = null;
                }
                return new gwl0(new lvl0(new mjl0(mjl0Var, str5), pfj1Var.d, (byte) 3), Integer.valueOf(pfj1Var.f), "", pfj1Var.a);
            case 14:
                return null;
            case 15:
                ((Number) obj3).intValue();
                return new fml0(new fjl0((r6h1) obj4, (byte) 5));
            case 16:
                fml0 fml0Var = (fml0) obj;
                int iOrdinal = ((thj1) obj4).ordinal();
                if (iOrdinal == 0) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), fml0Var.a, fml0Var.b.b, System.currentTimeMillis());
                }
                if (iOrdinal == 1) {
                    return fml0Var.h(1, 2);
                }
                if (iOrdinal == 2) {
                    return fml0Var.h(2, 1);
                }
                eg.o();
                return null;
            case 17:
                ((Number) obj3).intValue();
                return new o7l0();
            case 18:
                x6h1 x6h1VarC36 = ((o7l0) obj).a.c();
                x6h1VarC36.i.add(new a7h1("video_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC36.j = false;
                y6h1 y6h1VarA5 = x6h1VarC36.a();
                boolean z = ((lij1) obj2).a;
                char c2 = z ? (char) 2 : (char) 1;
                char c3 = z ? (char) 1 : (char) 2;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String str6 = "video_off";
                if (c2 == 1) {
                    obj5 = "video_off";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    obj5 = "video_on";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj5);
                if (c3 != 1) {
                    if (c3 != 2) {
                        throw null;
                    }
                    str6 = "video_on";
                }
                return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str6)})), y6h1VarA5, r6h1.c, System.currentTimeMillis());
            case 19:
                ((Number) obj3).intValue();
                return new tfl0((r6h1) obj4);
            case 20:
                ((Number) obj3).intValue();
                return new hjl0((r6h1) obj4);
            case 21:
                hjl0 hjl0Var = (hjl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), hjl0Var.b, hjl0Var.a, System.currentTimeMillis());
            case 22:
                ((Number) obj3).intValue();
                return new ijl0((r6h1) obj4);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ijl0 ijl0Var = (ijl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ijl0Var.b, ijl0Var.a, System.currentTimeMillis());
            case 24:
                jjl0 jjl0Var = (jjl0) obj;
                xpj1 xpj1Var = (xpj1) obj3;
                wpj1 wpj1Var = (wpj1) obj4;
                r6h1 r6h1Var5 = jjl0Var.a;
                y6h1 y6h1Var7 = jjl0Var.b;
                if (wpj1Var instanceof vpj1) {
                    l090 l090VarA = xpj1Var.a();
                    if (l090VarA instanceof k090) {
                        x6h1 x6h1VarC37 = y6h1Var7.c();
                        x6h1VarC37.i.add(new a7h1("primary_action_button", "watch_here", (Integer) null, (String) null, (String) null));
                        x6h1VarC37.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("disconnect_from_remote_device", 1, Collections.singletonMap("remote_device_id", ((k090) l090VarA).c)), x6h1VarC37.a(), r6h1Var5, System.currentTimeMillis());
                    } else {
                        if (!(l090VarA instanceof j090)) {
                            if (l090VarA == null) {
                                return null;
                            }
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC38 = y6h1Var7.c();
                        x6h1VarC38.i.add(new a7h1("primary_action_button", "play_once", (Integer) null, (String) null, (String) null));
                        x6h1VarC38.j = false;
                        y6h1 y6h1VarA6 = x6h1VarC38.a();
                        String str7 = xpj1Var.b;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str7 != null ? str7 : "")), y6h1VarA6, r6h1Var5, System.currentTimeMillis());
                    }
                } else {
                    if (!(wpj1Var instanceof upj1)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC39 = y6h1Var7.c();
                    x6h1VarC39.i.add(new a7h1("show_options", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC39.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", pro1.t("videoPodcastsStreamAudioOnly"))), x6h1VarC39.a(), r6h1Var5, System.currentTimeMillis());
                }
                return w7h1Var5;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj3).intValue();
                return new dhl0();
            case 26:
                ((Number) obj3).intValue();
                return new chl0((r6h1) obj4);
            case 27:
                chl0 chl0Var = (chl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), chl0Var.b, chl0Var.a, System.currentTimeMillis());
            case 28:
                return a(obj, obj2, obj3, obj4);
            default:
                ((Number) obj3).intValue();
                r6h1 r6h1Var6 = (r6h1) obj4;
                ywj1 ywj1Var = ((bxj1) obj).a;
                boolean z2 = ywj1Var instanceof zwj1;
                zwj1 zwj1Var = z2 ? (zwj1) ywj1Var : null;
                Integer numValueOf5 = zwj1Var != null ? Integer.valueOf(zwj1Var.b) : null;
                zwj1 zwj1Var2 = z2 ? (zwj1) ywj1Var : null;
                return new yml0(numValueOf5, zwj1Var2 != null ? zwj1Var2.a : null, r6h1Var6);
        }
    }
}
