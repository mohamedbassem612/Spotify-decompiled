package p;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v691 extends hab0 implements zu30 {
    public static final v691 N0;
    public static final v691 O0;
    public static final v691 P0;
    public static final v691 Q0;
    public static final v691 R0;
    public static final v691 S0;
    public static final v691 T0;
    public static final v691 U0;
    public static final v691 V0;
    public static final v691 W0;
    public static final v691 X;
    public static final v691 X0;
    public static final v691 Y;
    public static final v691 Y0;
    public static final v691 Z;
    public static final v691 Z0;
    public static final v691 a1;
    public static final v691 b;
    public static final v691 b1;
    public static final v691 c;
    public static final v691 c1;
    public static final v691 d;
    public static final v691 d1;
    public static final v691 e;
    public static final v691 e1;
    public static final v691 f;
    public static final v691 g;
    public static final v691 h;
    public static final v691 i;
    public static final v691 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new v691(i2, (byte) 0);
        c = new v691(i2, (byte) 1);
        d = new v691(i2, (byte) 2);
        e = new v691(i2, (byte) 3);
        f = new v691(i2, (byte) 4);
        g = new v691(i2, (byte) 5);
        h = new v691(i2, (byte) 6);
        i = new v691(i2, (byte) 7);
        t = new v691(i2, (byte) 8);
        X = new v691(i2, (byte) 9);
        Y = new v691(i2, (byte) 10);
        Z = new v691(i2, (byte) 11);
        N0 = new v691(i2, (byte) 12);
        O0 = new v691(i2, (byte) 13);
        P0 = new v691(i2, (byte) 14);
        Q0 = new v691(i2, (byte) 15);
        R0 = new v691(i2, (byte) 16);
        S0 = new v691(i2, (byte) 17);
        T0 = new v691(i2, (byte) 18);
        U0 = new v691(i2, (byte) 19);
        V0 = new v691(i2, (byte) 20);
        W0 = new v691(i2, (byte) 21);
        X0 = new v691(i2, (byte) 22);
        Y0 = new v691(i2, (byte) 23);
        Z0 = new v691(i2, (byte) 24);
        a1 = new v691(i2, (byte) 25);
        b1 = new v691(i2, (byte) 26);
        c1 = new v691(i2, (byte) 27);
        d1 = new v691(i2, (byte) 28);
        e1 = new v691(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v691(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        char c2;
        char c3;
        Object obj5;
        w7h1 w7h1Var;
        char c4;
        char c5;
        Object obj6;
        w7h1 w7h1Var2;
        byte b2 = this.a;
        String str = "linear";
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                t691 t691Var = (t691) obj3;
                String str2 = t691Var.a;
                fvf1 fvf1Var = t691Var.c;
                return ((zil0) obj).e(Integer.valueOf((int) fvf1Var.a), str2, Integer.valueOf((int) fvf1Var.b));
            case 1:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                g791 g791Var = ((e791) obj2).a;
                return new bjl0(g791Var != null ? Integer.valueOf(g791Var.b) : null, g791Var != null ? g791Var.a : null, r6h1Var);
            case 2:
                bjl0 bjl0Var = (bjl0) obj;
                e791 e791Var = (e791) obj3;
                g791 g791Var2 = e791Var.a;
                if (g791Var2 == null) {
                    return null;
                }
                int i2 = g791Var2.c;
                int i3 = (int) e791Var.d;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String strValueOf = String.valueOf(i2);
                if (strValueOf == null) {
                    strValueOf = "";
                }
                mmr0 mmr0Var = new mmr0("ms_to_seek_to", strValueOf);
                String strValueOf2 = String.valueOf(i3);
                return new w7h1("", "", z7h1Var, new x7h1("seek_to_time", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("position_ms", strValueOf2 != null ? strValueOf2 : "")})), bjl0Var.b, bjl0Var.a, System.currentTimeMillis());
            case 3:
                return new pm51((Context) obj2, (iu30) obj4, (byte) 1);
            case 4:
                d891 d891Var = (d891) obj2;
                ((Number) obj3).intValue();
                r6h1 r6h1Var2 = (r6h1) obj4;
                i6h1 i6h1VarA = d891Var.a();
                String str3 = i6h1VarA != null ? i6h1VarA.a : null;
                i6h1 i6h1VarA2 = d891Var.a();
                return new aqk0(i6h1VarA2 != null ? i6h1VarA2.b : null, str3, r6h1Var2);
            case 5:
                aqk0 aqk0Var = (aqk0) obj;
                b891 b891Var = (d891) obj3;
                if (!(b891Var instanceof b891)) {
                    return null;
                }
                x6h1 x6h1VarC = aqk0Var.b.c();
                x6h1VarC.i.add(new a7h1("skip_ad_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b891 b891Var2 = b891Var;
                String str4 = b891Var2.a;
                int i4 = (int) b891Var2.b;
                int i5 = (int) b891Var2.c;
                z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                if (str4 == null) {
                    str4 = "";
                }
                mmr0 mmr0Var2 = new mmr0("item_to_be_skipped", str4);
                String strValueOf3 = String.valueOf(i4);
                if (strValueOf3 == null) {
                    strValueOf3 = "";
                }
                mmr0 mmr0Var3 = new mmr0("position_ms", strValueOf3);
                String strValueOf4 = String.valueOf(i5);
                return new w7h1("", "", z7h1Var2, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var2, mmr0Var3, new mmr0("total_content_ms", strValueOf4 != null ? strValueOf4 : "")})), y6h1VarA, aqk0Var.a, System.currentTimeMillis());
            case 6:
                ((Number) obj3).intValue();
                return new b0m0(new e0m0(((a991) obj).b, (r6h1) obj4));
            case 7:
                b0m0 b0m0Var = (b0m0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_sleep_timer", 1, b7xVar), b0m0Var.a, b0m0Var.b.a, System.currentTimeMillis());
            case 8:
                ((Number) obj3).intValue();
                return new d0m0(new e0m0(((l991) obj).b, (r6h1) obj4));
            case 9:
                d0m0 d0m0Var = (d0m0) obj;
                int iU = (int) jfv.u(((l991) obj2).a.a, ngv.f);
                z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                String strValueOf5 = String.valueOf(iU);
                return new w7h1("", "", z7h1Var3, new x7h1("set_sleep_timer_in_minutes", 1, Collections.singletonMap("sleep_time_in_minutes", strValueOf5 != null ? strValueOf5 : "")), d0m0Var.a, d0m0Var.b.a, System.currentTimeMillis());
            case 10:
                ((Number) obj3).intValue();
                return new ajl0((r6h1) obj4);
            case 11:
                ajl0 ajl0Var = (ajl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ajl0Var.b, ajl0Var.a, System.currentTimeMillis());
            case 12:
                return new as0((Context) obj2, (iu30) obj4, (byte) 24);
            case 13:
                ((Number) obj3).intValue();
                return new c0m0(new e0m0(((r991) obj).b, (r6h1) obj4));
            case 14:
                c0m0 c0m0Var = (c0m0) obj;
                String str5 = ((r991) obj2).b;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("set_sleep_timer_end_of_item", 1, Collections.singletonMap("sleep_item", str5 != null ? str5 : "")), c0m0Var.a, c0m0Var.b.a, System.currentTimeMillis());
            case 15:
                ((Number) obj3).intValue();
                return new e0m0(((v991) obj).a, (r6h1) obj4);
            case 16:
                return null;
            case 17:
                ((Number) obj3).intValue();
                return new t6m0(new ksk0((byte) 24), 2);
            case 18:
                return null;
            case 19:
                ((Number) obj3).intValue();
                return new xil0((r6h1) obj4);
            case 20:
                xil0 xil0Var = (xil0) obj;
                em91 em91Var = (em91) obj3;
                sp91 sp91Var = em91Var.e;
                if (!(em91Var.f instanceof im91)) {
                    return null;
                }
                if (em91Var.d) {
                    return xil0Var.e();
                }
                Set set = sp91Var.i;
                rp91 rp91Var = sp91Var.a;
                if (set.contains(rp91.c) && !sp91Var.j && rp91Var == rp91.a) {
                    return xil0Var.e();
                }
                int iOrdinal = rp91Var.ordinal();
                if (iOrdinal == 0) {
                    c2 = 1;
                } else if (iOrdinal == 1) {
                    c2 = 2;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    c2 = 3;
                }
                int iOrdinal2 = sp91Var.c.ordinal();
                if (iOrdinal2 == 0) {
                    c3 = 1;
                } else if (iOrdinal2 == 1) {
                    c3 = 2;
                } else {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    c3 = 3;
                }
                z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                if (c2 == 1) {
                    obj5 = "linear";
                } else if (c2 == 2) {
                    obj5 = "shuffle";
                } else {
                    if (c2 != 3) {
                        throw null;
                    }
                    obj5 = "smart_shuffle";
                }
                mmr0 mmr0Var4 = new mmr0("previous_mode", obj5);
                if (c3 != 1) {
                    if (c3 == 2) {
                        str = "shuffle";
                    } else {
                        if (c3 != 3) {
                            throw null;
                        }
                        str = "smart_shuffle";
                    }
                }
                return new w7h1("", "", z7h1Var4, new x7h1("select_shuffle_mode", 1, sqg0.J(new mmr0[]{mmr0Var4, new mmr0("selected_mode", str)})), xil0Var.b, xil0Var.a, System.currentTimeMillis());
            case 21:
                f0m0 f0m0Var = (f0m0) obj;
                om91 om91Var = (om91) obj3;
                zl91 zl91Var = (zl91) obj4;
                y6h1 y6h1Var = f0m0Var.b;
                if (zl91Var.equals(yl91.a)) {
                    int iC = l1d.C(om91Var.d);
                    if (iC == 0) {
                        x6h1 x6h1VarC2 = y6h1Var.c();
                        x6h1VarC2.i.add(new a7h1("shuffle_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC2.a();
                        int iOrdinal3 = om91Var.b.ordinal();
                        if (iOrdinal3 == 0) {
                            c4 = 1;
                        } else if (iOrdinal3 == 1) {
                            c4 = 2;
                        } else {
                            if (iOrdinal3 != 2) {
                                eg.o();
                                return null;
                            }
                            c4 = 3;
                        }
                        int iOrdinal4 = om91Var.c.ordinal();
                        if (iOrdinal4 == 0) {
                            c5 = 1;
                        } else if (iOrdinal4 == 1) {
                            c5 = 2;
                        } else {
                            if (iOrdinal4 != 2) {
                                eg.o();
                                return null;
                            }
                            c5 = 3;
                        }
                        z7h1 z7h1Var5 = new z7h1("hit", 1, b7xVar);
                        if (c4 == 1) {
                            obj6 = "linear";
                        } else if (c4 == 2) {
                            obj6 = "shuffle";
                        } else {
                            if (c4 != 3) {
                                throw null;
                            }
                            obj6 = "smart_shuffle";
                        }
                        mmr0 mmr0Var5 = new mmr0("previous_mode", obj6);
                        if (c5 != 1) {
                            if (c5 == 2) {
                                str = "shuffle";
                            } else {
                                if (c5 != 3) {
                                    throw null;
                                }
                                str = "smart_shuffle";
                            }
                        }
                        return new w7h1("", "", z7h1Var5, new x7h1("select_shuffle_mode", 1, sqg0.J(new mmr0[]{mmr0Var5, new mmr0("selected_mode", str)})), y6h1VarA2, f0m0Var.a, System.currentTimeMillis());
                    }
                    if (iC == 1) {
                        x6h1 x6h1VarC3 = y6h1Var.c();
                        x6h1VarC3.i.add(new a7h1("shuffle_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), f0m0Var.a, System.currentTimeMillis());
                    } else {
                        if (iC != 2) {
                            return null;
                        }
                        x6h1 x6h1VarC4 = y6h1Var.c();
                        x6h1VarC4.i.add(new a7h1("shuffle_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), f0m0Var.a, System.currentTimeMillis());
                    }
                } else {
                    if (!zl91Var.equals(xl91.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("shuffle_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), f0m0Var.a, System.currentTimeMillis());
                }
                return w7h1Var;
            case 22:
                return new g0m0(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
            case 23:
                g0m0 g0m0Var = (g0m0) obj;
                if (!(((j011) obj4) instanceof i011)) {
                    return null;
                }
                x6h1 x6h1VarC6 = g0m0Var.b.c();
                x6h1VarC6.i.add(new a7h1("view_more_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), g0m0Var.a, System.currentTimeMillis());
            case 24:
                return new v0m0(Integer.valueOf(((Number) obj3).intValue()), ((l7a1) obj).a, (r6h1) obj4);
            case 25:
                v0m0 v0m0Var = (v0m0) obj;
                l7a1 l7a1Var = (l7a1) obj2;
                if (((z7a1) obj4) instanceof z7a1) {
                    return v0m0Var.a(l7a1Var.a.concat(":dna"));
                }
                eg.o();
                return null;
            case 26:
                return new v0m0(Integer.valueOf(((Number) obj3).intValue()), ((l7a1) obj).a, (r6h1) obj4);
            case 27:
                v0m0 v0m0Var2 = (v0m0) obj;
                l7a1 l7a1Var2 = (l7a1) obj2;
                if (((z7a1) obj4) instanceof z7a1) {
                    return v0m0Var2.a(l7a1Var2.a.concat(":dna"));
                }
                eg.o();
                return null;
            case 28:
                f8a1 f8a1Var = (f8a1) obj;
                ((Number) obj3).intValue();
                uel0 uel0Var = new uel0(f8a1Var.a);
                return f8a1Var.b ? new gel0(new iel0(uel0Var, (byte) 0)) : new kel0(new iel0(uel0Var, (byte) 1));
            default:
                n8h1 n8h1Var = (n8h1) obj;
                String str6 = ((f8a1) obj2).a;
                if (!((e8a1) obj4).equals(e8a1.a)) {
                    eg.o();
                    return null;
                }
                if (n8h1Var instanceof gel0) {
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6.concat(":dna"))), ((gel0) n8h1Var).a, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(n8h1Var instanceof kel0)) {
                        return null;
                    }
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6.concat(":dna"))), ((kel0) n8h1Var).a, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
        }
    }
}
