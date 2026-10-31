package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w7k0 extends hab0 implements zu30 {
    public static final w7k0 N0;
    public static final w7k0 O0;
    public static final w7k0 P0;
    public static final w7k0 Q0;
    public static final w7k0 R0;
    public static final w7k0 S0;
    public static final w7k0 T0;
    public static final w7k0 U0;
    public static final w7k0 V0;
    public static final w7k0 W0;
    public static final w7k0 X;
    public static final w7k0 X0;
    public static final w7k0 Y;
    public static final w7k0 Y0;
    public static final w7k0 Z;
    public static final w7k0 Z0;
    public static final w7k0 a1;
    public static final w7k0 b;
    public static final w7k0 b1;
    public static final w7k0 c;
    public static final w7k0 c1;
    public static final w7k0 d;
    public static final w7k0 d1;
    public static final w7k0 e;
    public static final w7k0 e1;
    public static final w7k0 f;
    public static final w7k0 g;
    public static final w7k0 h;
    public static final w7k0 i;
    public static final w7k0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new w7k0(i2, (byte) 0);
        c = new w7k0(i2, (byte) 1);
        d = new w7k0(i2, (byte) 2);
        e = new w7k0(i2, (byte) 3);
        f = new w7k0(i2, (byte) 4);
        g = new w7k0(i2, (byte) 5);
        h = new w7k0(i2, (byte) 6);
        i = new w7k0(i2, (byte) 7);
        t = new w7k0(i2, (byte) 8);
        X = new w7k0(i2, (byte) 9);
        Y = new w7k0(i2, (byte) 10);
        Z = new w7k0(i2, (byte) 11);
        N0 = new w7k0(i2, (byte) 12);
        O0 = new w7k0(i2, (byte) 13);
        P0 = new w7k0(i2, (byte) 14);
        Q0 = new w7k0(i2, (byte) 15);
        R0 = new w7k0(i2, (byte) 16);
        S0 = new w7k0(i2, (byte) 17);
        T0 = new w7k0(i2, (byte) 18);
        U0 = new w7k0(i2, (byte) 19);
        V0 = new w7k0(i2, (byte) 20);
        W0 = new w7k0(i2, (byte) 21);
        X0 = new w7k0(i2, (byte) 22);
        Y0 = new w7k0(i2, (byte) 23);
        Z0 = new w7k0(i2, (byte) 24);
        a1 = new w7k0(i2, (byte) 25);
        b1 = new w7k0(i2, (byte) 26);
        c1 = new w7k0(i2, (byte) 27);
        d1 = new w7k0(i2, (byte) 28);
        e1 = new w7k0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7k0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        wjl0 wjl0Var = (wjl0) obj;
        jkk0 jkk0Var = (jkk0) obj2;
        bkk0 bkk0Var = (ikk0) obj4;
        r6h1 r6h1Var = wjl0Var.a;
        y6h1 y6h1Var = wjl0Var.b;
        boolean z = bkk0Var instanceof hkk0;
        b7x b7xVar = b7x.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("volume_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            hkk0 hkk0Var = (hkk0) bkk0Var;
            String strT = flo1.t(hkk0Var.a.name());
            Integer numValueOf = Integer.valueOf(hkk0Var.b);
            x6h1 x6h1VarC2 = y6h1VarA.c();
            x6h1VarC2.i.add(new a7h1("volume_curve_button", strT, numValueOf, (String) null, (String) null));
            x6h1VarC2.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
        }
        if (bkk0Var instanceof bkk0) {
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("volume_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            y6h1 y6h1VarA2 = x6h1VarC3.a();
            Integer numValueOf2 = Integer.valueOf(bkk0Var.c);
            x6h1 x6h1VarC4 = y6h1VarA2.c();
            x6h1VarC4.i.add(new a7h1("volume_curve_button", "custom", numValueOf2, (String) null, (String) null));
            x6h1VarC4.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
        }
        if (bkk0Var instanceof ckk0) {
            x6h1 x6h1VarC5 = y6h1Var.c();
            x6h1VarC5.i.add(new a7h1("eq_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            y6h1 y6h1VarA3 = x6h1VarC5.a();
            ckk0 ckk0Var = (ckk0) bkk0Var;
            String strT2 = flo1.t(ckk0Var.a.name());
            Integer numValueOf3 = Integer.valueOf(ckk0Var.b);
            x6h1 x6h1VarC6 = y6h1VarA3.c();
            x6h1VarC6.i.add(new a7h1("eq_button", strT2, numValueOf3, (String) null, (String) null));
            x6h1VarC6.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC6.a(), r6h1Var, System.currentTimeMillis());
        }
        if (bkk0Var instanceof yjk0) {
            x6h1 x6h1VarC7 = y6h1Var.c();
            x6h1VarC7.i.add(new a7h1("eq_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC7.j = false;
            y6h1 y6h1VarA4 = x6h1VarC7.a();
            Integer numValueOf4 = Integer.valueOf(((yjk0) bkk0Var).c);
            x6h1 x6h1VarC8 = y6h1VarA4.c();
            x6h1VarC8.i.add(new a7h1("eq_button", "custom", numValueOf4, (String) null, (String) null));
            x6h1VarC8.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC8.a(), r6h1Var, System.currentTimeMillis());
        }
        if (bkk0Var instanceof dkk0) {
            x6h1 x6h1VarC9 = y6h1Var.c();
            x6h1VarC9.i.add(new a7h1("filter_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC9.j = false;
            y6h1 y6h1VarA5 = x6h1VarC9.a();
            dkk0 dkk0Var = (dkk0) bkk0Var;
            String strT3 = flo1.t(dkk0Var.a.name());
            Integer numValueOf5 = Integer.valueOf(dkk0Var.b);
            x6h1 x6h1VarC10 = y6h1VarA5.c();
            x6h1VarC10.i.add(new a7h1("filter_button", strT3, numValueOf5, (String) null, (String) null));
            x6h1VarC10.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC10.a(), r6h1Var, System.currentTimeMillis());
        }
        if (bkk0Var instanceof zjk0) {
            x6h1 x6h1VarC11 = y6h1Var.c();
            x6h1VarC11.i.add(new a7h1("filter_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC11.j = false;
            y6h1 y6h1VarA6 = x6h1VarC11.a();
            Integer numValueOf6 = Integer.valueOf(((zjk0) bkk0Var).c);
            x6h1 x6h1VarC12 = y6h1VarA6.c();
            x6h1VarC12.i.add(new a7h1("filter_button", "custom", numValueOf6, (String) null, (String) null));
            x6h1VarC12.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC12.a(), r6h1Var, System.currentTimeMillis());
        }
        if (bkk0Var instanceof ekk0) {
            x6h1 x6h1VarC13 = y6h1Var.c();
            x6h1VarC13.i.add(new a7h1("effects_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC13.j = false;
            y6h1 y6h1VarA7 = x6h1VarC13.a();
            ekk0 ekk0Var = (ekk0) bkk0Var;
            String strT4 = flo1.t(ekk0Var.a.name());
            Integer numValueOf7 = Integer.valueOf(ekk0Var.b);
            x6h1 x6h1VarC14 = y6h1VarA7.c();
            x6h1VarC14.i.add(new a7h1("effect_button", strT4, numValueOf7, (String) null, (String) null));
            x6h1VarC14.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC14.a(), r6h1Var, System.currentTimeMillis());
        }
        if (bkk0Var instanceof akk0) {
            x6h1 x6h1VarC15 = y6h1Var.c();
            x6h1VarC15.i.add(new a7h1("effects_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC15.j = false;
            y6h1 y6h1VarA8 = x6h1VarC15.a();
            Integer numValueOf8 = Integer.valueOf(((akk0) bkk0Var).c);
            x6h1 x6h1VarC16 = y6h1VarA8.c();
            x6h1VarC16.i.add(new a7h1("effect_button", "custom", numValueOf8, (String) null, (String) null));
            x6h1VarC16.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC16.a(), r6h1Var, System.currentTimeMillis());
        }
        if (bkk0Var instanceof gkk0) {
            x6h1 x6h1VarC17 = y6h1Var.c();
            x6h1VarC17.i.add(new a7h1("looping_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC17.j = false;
            y6h1 y6h1VarA9 = x6h1VarC17.a();
            gkk0 gkk0Var = (gkk0) bkk0Var;
            String strT5 = flo1.t(gkk0Var.a.name());
            Integer numValueOf9 = Integer.valueOf(gkk0Var.b);
            x6h1 x6h1VarC18 = y6h1VarA9.c();
            x6h1VarC18.i.add(new a7h1("looping_button", strT5, numValueOf9, (String) null, (String) null));
            x6h1VarC18.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC18.a(), r6h1Var, System.currentTimeMillis());
        }
        if (bkk0Var instanceof fkk0) {
            x6h1 x6h1VarC19 = y6h1Var.c();
            x6h1VarC19.i.add(new a7h1("jogwheel_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC19.j = false;
            y6h1 y6h1VarA10 = x6h1VarC19.a();
            fkk0 fkk0Var = (fkk0) bkk0Var;
            String strT6 = flo1.t(fkk0Var.a.name());
            Integer numValueOf10 = Integer.valueOf(fkk0Var.b);
            x6h1 x6h1VarC20 = y6h1VarA10.c();
            x6h1VarC20.i.add(new a7h1("jogwheel_button", strT6, numValueOf10, (String) null, (String) null));
            x6h1VarC20.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC20.a(), r6h1Var, System.currentTimeMillis());
        }
        if (bkk0Var instanceof xjk0) {
            int iOrdinal = ((xjk0) bkk0Var).a.ordinal();
            if (iOrdinal == 0) {
                x6h1 x6h1VarC21 = y6h1Var.c();
                x6h1VarC21.i.add(new a7h1("volume_selector", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC21.j = false;
                return new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC21.a(), r6h1Var, System.currentTimeMillis());
            }
            if (iOrdinal == 1) {
                x6h1 x6h1VarC22 = y6h1Var.c();
                x6h1VarC22.i.add(new a7h1("eq_selector", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC22.j = false;
                return new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC22.a(), r6h1Var, System.currentTimeMillis());
            }
            if (iOrdinal == 2) {
                x6h1 x6h1VarC23 = y6h1Var.c();
                x6h1VarC23.i.add(new a7h1("filter_selector", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC23.j = false;
                return new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC23.a(), r6h1Var, System.currentTimeMillis());
            }
            if (iOrdinal == 3) {
                x6h1 x6h1VarC24 = y6h1Var.c();
                x6h1VarC24.i.add(new a7h1("effects_selector", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC24.j = false;
                return new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC24.a(), r6h1Var, System.currentTimeMillis());
            }
            if (iOrdinal == 4) {
                x6h1 x6h1VarC25 = y6h1Var.c();
                x6h1VarC25.i.add(new a7h1("looping_selector", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC25.j = false;
                return new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC25.a(), r6h1Var, System.currentTimeMillis());
            }
            if (iOrdinal != 5) {
                eg.o();
                return null;
            }
            x6h1 x6h1VarC26 = y6h1Var.c();
            x6h1VarC26.i.add(new a7h1("jogwheel_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC26.j = false;
            return new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC26.a(), r6h1Var, System.currentTimeMillis());
        }
        if (!bkk0Var.equals(wjk0.a)) {
            eg.o();
            return null;
        }
        int iOrdinal2 = jkk0Var.b.ordinal();
        if (iOrdinal2 == 0) {
            x6h1 x6h1VarC27 = y6h1Var.c();
            x6h1VarC27.i.add(new a7h1("volume_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC27.j = false;
            return new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC27.a(), r6h1Var, System.currentTimeMillis());
        }
        if (iOrdinal2 == 1) {
            x6h1 x6h1VarC28 = y6h1Var.c();
            x6h1VarC28.i.add(new a7h1("eq_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC28.j = false;
            return new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC28.a(), r6h1Var, System.currentTimeMillis());
        }
        if (iOrdinal2 == 2) {
            x6h1 x6h1VarC29 = y6h1Var.c();
            x6h1VarC29.i.add(new a7h1("filter_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC29.j = false;
            return new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC29.a(), r6h1Var, System.currentTimeMillis());
        }
        if (iOrdinal2 == 3) {
            x6h1 x6h1VarC30 = y6h1Var.c();
            x6h1VarC30.i.add(new a7h1("effects_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC30.j = false;
            return new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC30.a(), r6h1Var, System.currentTimeMillis());
        }
        if (iOrdinal2 == 4) {
            x6h1 x6h1VarC31 = y6h1Var.c();
            x6h1VarC31.i.add(new a7h1("looping_selector", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC31.j = false;
            return new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC31.a(), r6h1Var, System.currentTimeMillis());
        }
        if (iOrdinal2 != 5) {
            eg.o();
            return null;
        }
        x6h1 x6h1VarC32 = y6h1Var.c();
        x6h1VarC32.i.add(new a7h1("jogwheel_selector", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC32.j = false;
        return new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC32.a(), r6h1Var, System.currentTimeMillis());
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        Object obj5;
        char c2;
        String str;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        byte b2 = this.a;
        wdk0 wdk0Var = wdk0.a;
        rih1 rih1Var = rih1.a;
        int i2 = 2;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                akl0 akl0Var = (akl0) obj;
                if (((q7k0) obj4).equals(q7k0.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), akl0Var.a, akl0Var.b.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 1:
                fnl0 fnl0Var = (fnl0) obj;
                c8k0 c8k0Var = (c8k0) obj2;
                z7k0 z7k0Var = (z7k0) obj4;
                if (!(c8k0Var instanceof c8k0)) {
                    eg.o();
                    return null;
                }
                String str2 = c8k0Var.b.a;
                if (z7k0Var instanceof y7k0) {
                    x6h1 x6h1VarC = fnl0Var.b.c();
                    x6h1VarC.i.add(new a7h1("transition_button", (String) null, (Integer) null, str2, (String) null));
                    x6h1VarC.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), fnl0Var.a, System.currentTimeMillis());
                }
                if (z7k0Var instanceof x7k0) {
                    return null;
                }
                eg.o();
                return null;
            case 2:
                ((Number) obj3).intValue();
                return new vnl0((r6h1) obj4);
            case 3:
                vnl0 vnl0Var = (vnl0) obj;
                cak0 cak0Var = (cak0) obj2;
                bak0 bak0Var = (bak0) obj4;
                r6h1 r6h1Var = vnl0Var.a;
                y6h1 y6h1Var = vnl0Var.b;
                int i3 = bak0Var.b;
                ssj0 ssj0Var = bak0Var.d;
                if (bak0Var.c || ssj0Var == null) {
                    return null;
                }
                int iOrdinal = cak0Var.a.ordinal();
                if (iOrdinal == 0) {
                    String str3 = cak0Var.b;
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("track_a_waveform", (String) null, (Integer) null, str3, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    int iOrdinal2 = ssj0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                        String strValueOf = String.valueOf(i3);
                        if (strValueOf == null) {
                            strValueOf = "";
                        }
                        w7h1Var = new w7h1("", "", z7h1Var, new x7h1("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf)), y6h1VarA, r6h1Var, System.currentTimeMillis());
                    } else {
                        if (iOrdinal2 != 1) {
                            eg.o();
                            return null;
                        }
                        z7h1 z7h1Var2 = new z7h1("drag", 1, b7xVar);
                        String strValueOf2 = String.valueOf(i3);
                        if (strValueOf2 == null) {
                            strValueOf2 = "";
                        }
                        w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf2)), y6h1VarA, r6h1Var, System.currentTimeMillis());
                    }
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    String str4 = cak0Var.b;
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("track_b_waveform", (String) null, (Integer) null, str4, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    int iOrdinal3 = ssj0Var.ordinal();
                    if (iOrdinal3 == 0) {
                        z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                        String strValueOf3 = String.valueOf(i3);
                        if (strValueOf3 == null) {
                            strValueOf3 = "";
                        }
                        w7h1Var = new w7h1("", "", z7h1Var3, new x7h1("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf3)), y6h1VarA2, r6h1Var, System.currentTimeMillis());
                    } else {
                        if (iOrdinal3 != 1) {
                            eg.o();
                            return null;
                        }
                        z7h1 z7h1Var4 = new z7h1("drag", 1, b7xVar);
                        String strValueOf4 = String.valueOf(i3);
                        if (strValueOf4 == null) {
                            strValueOf4 = "";
                        }
                        w7h1Var = new w7h1("", "", z7h1Var4, new x7h1("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf4)), y6h1VarA2, r6h1Var, System.currentTimeMillis());
                    }
                }
                return w7h1Var;
            case 4:
                ((Number) obj3).intValue();
                return new zjl0((r6h1) obj4);
            case 5:
                zjl0 zjl0Var = (zjl0) obj;
                r6h1 r6h1Var2 = zjl0Var.a;
                y6h1 y6h1Var2 = zjl0Var.b;
                int iOrdinal4 = ((lak0) obj4).ordinal();
                if (iOrdinal4 == 0) {
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("add_to_playlist_item", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (iOrdinal4 != 1) {
                        if (iOrdinal4 == 2) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("share_item", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 6:
                ((Number) obj3).intValue();
                return new tnl0(f2p1.u(9), (r6h1) obj4);
            case 7:
                tnl0 tnl0Var = (tnl0) obj;
                y6h1 y6h1Var3 = tnl0Var.b;
                int iOrdinal5 = ((tak0) obj4).ordinal();
                if (iOrdinal5 == 0) {
                    x6h1 x6h1VarC6 = y6h1Var3.c();
                    x6h1VarC6.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), tnl0Var.a, System.currentTimeMillis());
                } else {
                    if (iOrdinal5 != 1) {
                        if (iOrdinal5 == 2) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), tnl0Var.a, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 8:
                ((Number) obj3).intValue();
                return new ill0((r6h1) obj4);
            case 9:
                ((Number) obj3).intValue();
                return new ill0((r6h1) obj4);
            case 10:
                ill0 ill0Var = (ill0) obj;
                String str5 = ((nbk0) obj2).a;
                int iOrdinal6 = ((kbk0) obj4).ordinal();
                if (iOrdinal6 == 0) {
                    return ill0Var.e(str5);
                }
                if (iOrdinal6 == 1) {
                    return ill0Var.i(str5);
                }
                if (iOrdinal6 == 2) {
                    return ill0Var.h(str5);
                }
                if (iOrdinal6 == 3) {
                    return ill0Var.k(str5);
                }
                eg.o();
                return null;
            case 11:
                ill0 ill0Var2 = (ill0) obj;
                String str6 = ((obk0) obj2).a;
                int iOrdinal7 = ((lbk0) obj4).ordinal();
                if (iOrdinal7 == 0) {
                    return ill0Var2.h(str6);
                }
                if (iOrdinal7 == 1) {
                    return ill0Var2.e(str6);
                }
                eg.o();
                return null;
            case 12:
                ((Number) obj3).intValue();
                return new wjl0((r6h1) obj4);
            case 13:
                wjl0 wjl0Var = (wjl0) obj;
                qck0 qck0Var = (qck0) obj4;
                r6h1 r6h1Var3 = wjl0Var.a;
                y6h1 y6h1Var4 = wjl0Var.b;
                if (qck0Var instanceof ick0) {
                    x6h1 x6h1VarC8 = y6h1Var4.c();
                    x6h1VarC8.i.add(new a7h1("filter_selector", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), r6h1Var3, System.currentTimeMillis());
                } else if (qck0Var instanceof kck0) {
                    x6h1 x6h1VarC9 = y6h1Var4.c();
                    x6h1VarC9.i.add(new a7h1("effects_selector", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), r6h1Var3, System.currentTimeMillis());
                } else if (qck0Var instanceof mck0) {
                    x6h1 x6h1VarC10 = y6h1Var4.c();
                    x6h1VarC10.i.add(new a7h1("looping_selector", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), r6h1Var3, System.currentTimeMillis());
                } else if (qck0Var instanceof lck0) {
                    x6h1 x6h1VarC11 = y6h1Var4.c();
                    x6h1VarC11.i.add(new a7h1("jogwheel_selector", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC11.a(), r6h1Var3, System.currentTimeMillis());
                } else if (qck0Var instanceof hck0) {
                    x6h1 x6h1VarC12 = y6h1Var4.c();
                    x6h1VarC12.i.add(new a7h1("eq_selector", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC12.a(), r6h1Var3, System.currentTimeMillis());
                } else if (qck0Var instanceof pck0) {
                    x6h1 x6h1VarC13 = y6h1Var4.c();
                    x6h1VarC13.i.add(new a7h1("volume_selector", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC13.a(), r6h1Var3, System.currentTimeMillis());
                } else if (qck0Var instanceof eck0) {
                    Integer numValueOf = Integer.valueOf(((eck0) qck0Var).a);
                    x6h1 x6h1VarC14 = y6h1Var4.c();
                    x6h1VarC14.i.add(new a7h1("preset_button", "auto", numValueOf, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC14.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if ((qck0Var instanceof dck0) || (qck0Var instanceof nck0)) {
                        return null;
                    }
                    if (qck0Var instanceof gck0) {
                        Integer numValueOf2 = Integer.valueOf(((gck0) qck0Var).a);
                        x6h1 x6h1VarC15 = y6h1Var4.c();
                        x6h1VarC15.i.add(new a7h1("preset_button", "custom", numValueOf2, (String) null, (String) null));
                        x6h1VarC15.j = false;
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC15.a(), r6h1Var3, System.currentTimeMillis());
                    } else if (qck0Var instanceof jck0) {
                        jck0 jck0Var = (jck0) qck0Var;
                        String strT = flo1.t(jck0Var.a.name());
                        Integer numValueOf3 = Integer.valueOf(jck0Var.b);
                        x6h1 x6h1VarC16 = y6h1Var4.c();
                        x6h1VarC16.i.add(new a7h1("preset_button", strT, numValueOf3, (String) null, (String) null));
                        x6h1VarC16.j = false;
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC16.a(), r6h1Var3, System.currentTimeMillis());
                    } else {
                        if (!(qck0Var instanceof fck0)) {
                            if (qck0Var instanceof ock0) {
                                return null;
                            }
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC17 = y6h1Var4.c();
                        x6h1VarC17.i.add(new a7h1("beatmatch_toggle", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC17.j = false;
                        y6h1 y6h1VarA3 = x6h1VarC17.a();
                        boolean z = ((fck0) qck0Var).a;
                        char c3 = z ? (char) 1 : (char) 2;
                        char c4 = z ? (char) 2 : (char) 1;
                        z7h1 z7h1Var5 = new z7h1("hit", 1, b7xVar);
                        String str7 = "off";
                        if (c3 == 1) {
                            obj5 = "off";
                        } else {
                            if (c3 != 2) {
                                throw null;
                            }
                            obj5 = "on";
                        }
                        mmr0 mmr0Var = new mmr0("state_before_toggle", obj5);
                        if (c4 != 1) {
                            if (c4 != 2) {
                                throw null;
                            }
                            str7 = "on";
                        }
                        w7h1Var4 = new w7h1("", "", z7h1Var5, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str7)})), y6h1VarA3, r6h1Var3, System.currentTimeMillis());
                    }
                }
                return w7h1Var4;
            case 14:
                ((Number) obj3).intValue();
                return new znl0((r6h1) obj4);
            case 15:
                znl0 znl0Var = (znl0) obj;
                if (ndk0.a[((mdk0) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC18 = znl0Var.b.c();
                x6h1VarC18.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC18.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC18.a(), znl0Var.a, System.currentTimeMillis());
            case 16:
                ((Number) obj3).intValue();
                return new wnl0((r6h1) obj4);
            case 17:
                wnl0 wnl0Var = (wnl0) obj;
                vdk0 vdk0Var = (vdk0) obj2;
                if (!(((udk0) obj4) instanceof qdk0)) {
                    return null;
                }
                bek0 bek0Var = vdk0Var.b;
                if (bek0Var.equals(wdk0Var)) {
                    c2 = 2;
                } else {
                    if (!(bek0Var instanceof aek0)) {
                        eg.o();
                        return null;
                    }
                    c2 = 1;
                }
                x6h1 x6h1VarC19 = wnl0Var.b.c();
                if (c2 == 1) {
                    str = "disabled";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    str = "enabled";
                }
                x6h1VarC19.i.add(new a7h1("reorder_button", str, (Integer) null, (String) null, (String) null));
                x6h1VarC19.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC19.a(), wnl0Var.a, System.currentTimeMillis());
            case 18:
                ((Number) obj3).intValue();
                return new tnl0(f2p1.u(11), (r6h1) obj4);
            case 19:
                tnl0 tnl0Var2 = (tnl0) obj;
                y6h1 y6h1Var5 = tnl0Var2.b;
                int iOrdinal8 = ((qek0) obj4).ordinal();
                if (iOrdinal8 == 0) {
                    x6h1 x6h1VarC20 = y6h1Var5.c();
                    x6h1VarC20.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC20.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC20.a(), tnl0Var2.a, System.currentTimeMillis());
                } else {
                    if (iOrdinal8 != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC21 = y6h1Var5.c();
                    x6h1VarC21.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC21.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC21.a(), tnl0Var2.a, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 20:
                ((Number) obj3).intValue();
                r6h1 r6h1Var4 = (r6h1) obj4;
                bek0 bek0Var2 = ((gfk0) obj).b;
                if (!bek0Var2.equals(wdk0Var)) {
                    if (!(bek0Var2 instanceof aek0)) {
                        eg.o();
                        return null;
                    }
                    i2 = 1;
                }
                return new unl0(new fjl0(r6h1Var4, (byte) 20), i2);
            case 21:
                unl0 unl0Var = (unl0) obj;
                ffk0 ffk0Var = (ffk0) obj4;
                y6h1 y6h1Var6 = unl0Var.a;
                r6h1 r6h1Var5 = unl0Var.b.b;
                if (ffk0Var.equals(afk0.a)) {
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var6, r6h1Var5, System.currentTimeMillis());
                } else {
                    if (!ffk0Var.equals(bfk0.a)) {
                        if ((ffk0Var instanceof dfk0) || ffk0Var.equals(cfk0.a)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var6, r6h1Var5, System.currentTimeMillis());
                }
                return w7h1Var6;
            case 22:
                return null;
            case 23:
                ((Number) obj3).intValue();
                return new wjl0((r6h1) obj4);
            case 24:
                return a(obj, obj2, obj3, obj4);
            case 25:
                ((Number) obj4).intValue();
                return rih1Var;
            case 26:
                ((Number) obj4).intValue();
                return rih1Var;
            case 27:
                ((Number) obj3).intValue();
                return new bkl0(((mlk0) obj).a, (r6h1) obj4);
            case 28:
                llk0 llk0Var = (llk0) obj4;
                if (!llk0Var.equals(jlk0.a) && !llk0Var.equals(klk0.a)) {
                    eg.o();
                }
                return null;
            default:
                ((Number) obj3).intValue();
                return new mil0((r6h1) obj4);
        }
    }
}
