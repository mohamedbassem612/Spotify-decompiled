package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r8a1 extends hab0 implements zu30 {
    public static final r8a1 N0;
    public static final r8a1 O0;
    public static final r8a1 P0;
    public static final r8a1 Q0;
    public static final r8a1 R0;
    public static final r8a1 S0;
    public static final r8a1 T0;
    public static final r8a1 U0;
    public static final r8a1 V0;
    public static final r8a1 W0;
    public static final r8a1 X;
    public static final r8a1 X0;
    public static final r8a1 Y;
    public static final r8a1 Y0;
    public static final r8a1 Z;
    public static final r8a1 Z0;
    public static final r8a1 a1;
    public static final r8a1 b;
    public static final r8a1 b1;
    public static final r8a1 c;
    public static final r8a1 c1;
    public static final r8a1 d;
    public static final r8a1 d1;
    public static final r8a1 e;
    public static final r8a1 e1;
    public static final r8a1 f;
    public static final r8a1 g;
    public static final r8a1 h;
    public static final r8a1 i;
    public static final r8a1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new r8a1(i2, (byte) 0);
        c = new r8a1(i2, (byte) 1);
        d = new r8a1(i2, (byte) 2);
        e = new r8a1(i2, (byte) 3);
        f = new r8a1(i2, (byte) 4);
        g = new r8a1(i2, (byte) 5);
        h = new r8a1(i2, (byte) 6);
        i = new r8a1(i2, (byte) 7);
        t = new r8a1(i2, (byte) 8);
        X = new r8a1(i2, (byte) 9);
        Y = new r8a1(i2, (byte) 10);
        Z = new r8a1(i2, (byte) 11);
        N0 = new r8a1(i2, (byte) 12);
        O0 = new r8a1(i2, (byte) 13);
        P0 = new r8a1(i2, (byte) 14);
        Q0 = new r8a1(i2, (byte) 15);
        R0 = new r8a1(i2, (byte) 16);
        S0 = new r8a1(i2, (byte) 17);
        T0 = new r8a1(i2, (byte) 18);
        U0 = new r8a1(i2, (byte) 19);
        V0 = new r8a1(i2, (byte) 20);
        W0 = new r8a1(i2, (byte) 21);
        X0 = new r8a1(i2, (byte) 22);
        Y0 = new r8a1(i2, (byte) 23);
        Z0 = new r8a1(i2, (byte) 24);
        a1 = new r8a1(i2, (byte) 25);
        b1 = new r8a1(i2, (byte) 26);
        c1 = new r8a1(i2, (byte) 27);
        d1 = new r8a1(i2, (byte) 28);
        e1 = new r8a1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8a1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        ezl0 ezl0Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new yel0(((m8a1) obj).a, (r6h1) obj4);
            case 1:
                yel0 yel0Var = (yel0) obj;
                l8a1 l8a1Var = (l8a1) obj4;
                Integer numValueOf = Integer.valueOf(l8a1Var.b);
                String str = l8a1Var.a;
                x6h1 x6h1VarC = yel0Var.b.c();
                x6h1VarC.i.add(new a7h1("contributor_row", (String) null, numValueOf, str, (String) null));
                x6h1VarC.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", l8a1Var.a.concat(":dna"))), x6h1VarC.a(), yel0Var.a, System.currentTimeMillis());
            case 2:
                return null;
            case 3:
                ((Number) obj3).intValue();
                return new h1m0((r6h1) obj4);
            case 4:
                return null;
            case 5:
                return new z0m0(Integer.valueOf(((Number) obj3).intValue()), ((xaa1) obj).a, (r6h1) obj4);
            case 6:
                z0m0 z0m0Var = (z0m0) obj;
                xaa1 xaa1Var = (xaa1) obj2;
                if (((vaa1) obj4).equals(vaa1.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", xaa1Var.a.concat(":dna"))), z0m0Var.b, z0m0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 7:
                oba1 oba1Var = (oba1) obj;
                ((Number) obj3).intValue();
                return new g1m0(oba1Var.a.b, Integer.valueOf(oba1Var.b), oba1Var.c ? 2 : 1, (r6h1) obj4);
            case 8:
                g1m0 g1m0Var = (g1m0) obj;
                nba1 nba1Var = (nba1) obj4;
                r6h1 r6h1Var = g1m0Var.a;
                y6h1 y6h1Var = g1m0Var.b;
                if (nba1Var.equals(mba1.a)) {
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
                } else {
                    if (!nba1Var.equals(lba1.a)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 9:
                c1m0 c1m0Var = (c1m0) obj;
                if (!((tba1) obj4).equals(tba1.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC2 = c1m0Var.a.c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 10:
                rca1 rca1Var = (rca1) obj;
                ((Number) obj3).intValue();
                sca1 sca1Var = sca1.a;
                r6h1 r6h1Var2 = rca1Var.a;
                if (r6h1Var2 != null) {
                    ezl0Var = rca1Var.b.a() ? new ezl0(r6h1Var2, (byte) 2) : new ezl0(r6h1Var2, (byte) 3);
                } else {
                    ezl0Var = null;
                }
                if (ezl0Var != null) {
                    return ezl0Var;
                }
                bhn0.g(rca1Var, "No node for ");
                return null;
            case 11:
                return null;
            case 12:
                return new j1m0(Integer.valueOf(((Number) obj3).intValue()), ((dea1) obj).a, (r6h1) obj4);
            case 13:
                j1m0 j1m0Var = (j1m0) obj;
                dea1 dea1Var = (dea1) obj2;
                if (((bea1) obj4).equals(bea1.a)) {
                    return j1m0Var.a(dea1Var.a.concat(":dna"));
                }
                eg.o();
                return null;
            case 14:
                ((Number) obj3).intValue();
                return new rxl0((r6h1) obj4);
            case 15:
                return ((rxl0) obj).a(nik1.n2.a);
            case 16:
                ((Number) obj3).intValue();
                fjl0 fjl0Var = new fjl0((r6h1) obj4, (byte) 5);
                g3d0 g3d0Var = ((gha1) obj2).a;
                return new eml0(fjl0Var, g3d0Var != null ? g3d0Var.g() : null);
            case 17:
                eml0 eml0Var = (eml0) obj;
                if (mha1.a[((eha1) obj4).ordinal()] == 1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), eml0Var.a, eml0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 18:
                ((Number) obj3).intValue();
                return new v1m0(((kka1) obj).b, (r6h1) obj4);
            case 19:
                v1m0 v1m0Var = (v1m0) obj;
                jka1 jka1Var = (jka1) obj4;
                Integer numValueOf2 = Integer.valueOf(jka1Var.b);
                x6h1 x6h1VarC3 = v1m0Var.b.c();
                x6h1VarC3.i.add(new a7h1("source_link", (String) null, numValueOf2, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", jka1Var.a)), x6h1VarC3.a(), v1m0Var.a, System.currentTimeMillis());
            case 20:
                ((Number) obj3).intValue();
                return new mol0(2, (r6h1) obj4);
            case 21:
                mol0 mol0Var = (mol0) obj;
                r6h1 r6h1Var3 = mol0Var.a;
                y6h1 y6h1Var2 = mol0Var.b;
                int iOrdinal = ((pqa1) obj4).ordinal();
                if (iOrdinal == 0) {
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1Var3, System.currentTimeMillis());
                } else if (iOrdinal == 1) {
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC6 = y6h1Var2.c();
                    x6h1VarC6.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 22:
                ((Number) obj3).intValue();
                return new cjl0((r6h1) obj4);
            case 23:
                cjl0 cjl0Var = (cjl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), cjl0Var.b, cjl0Var.a, System.currentTimeMillis());
            case 24:
                ((Number) obj3).intValue();
                return new nol0((r6h1) obj4);
            case 25:
                nol0 nol0Var = (nol0) obj;
                r6h1 r6h1Var4 = nol0Var.a;
                y6h1 y6h1Var3 = nol0Var.b;
                int iOrdinal2 = ((gta1) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC8 = y6h1Var3.c();
                    x6h1VarC8.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 26:
                ((Number) obj3).intValue();
                return new ool0((r6h1) obj4);
            case 27:
                ool0 ool0Var = (ool0) obj;
                kva1 kva1Var = (kva1) obj3;
                r6h1 r6h1Var5 = ool0Var.a;
                y6h1 y6h1Var4 = ool0Var.b;
                int iOrdinal3 = ((jva1) obj4).ordinal();
                if (iOrdinal3 == 0) {
                    x6h1 x6h1VarC9 = y6h1Var4.c();
                    x6h1VarC9.i.add(new a7h1("preview_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA = x6h1VarC9.a();
                    String str2 = kva1Var.a;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str2 != null ? str2 : "")), y6h1VarA, r6h1Var5, System.currentTimeMillis());
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC10 = y6h1Var4.c();
                    x6h1VarC10.i.add(new a7h1("preview_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("stop_preview", 1, Collections.singletonMap("duration_ms", "")), x6h1VarC10.a(), r6h1Var5, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 28:
                ((Number) obj3).intValue();
                return new lol0(((mva1) obj).a);
            default:
                return null;
        }
    }
}
