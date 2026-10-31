package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kxz0 extends hab0 implements zu30 {
    public static final kxz0 N0;
    public static final kxz0 O0;
    public static final kxz0 P0;
    public static final kxz0 Q0;
    public static final kxz0 R0;
    public static final kxz0 S0;
    public static final kxz0 T0;
    public static final kxz0 U0;
    public static final kxz0 V0;
    public static final kxz0 W0;
    public static final kxz0 X;
    public static final kxz0 X0;
    public static final kxz0 Y;
    public static final kxz0 Y0;
    public static final kxz0 Z;
    public static final kxz0 Z0;
    public static final kxz0 a1;
    public static final kxz0 b;
    public static final kxz0 b1;
    public static final kxz0 c;
    public static final kxz0 c1;
    public static final kxz0 d;
    public static final kxz0 d1;
    public static final kxz0 e;
    public static final kxz0 e1;
    public static final kxz0 f;
    public static final kxz0 g;
    public static final kxz0 h;
    public static final kxz0 i;
    public static final kxz0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new kxz0(i2, (byte) 0);
        c = new kxz0(i2, (byte) 1);
        d = new kxz0(i2, (byte) 2);
        e = new kxz0(i2, (byte) 3);
        f = new kxz0(i2, (byte) 4);
        g = new kxz0(i2, (byte) 5);
        h = new kxz0(i2, (byte) 6);
        i = new kxz0(i2, (byte) 7);
        t = new kxz0(i2, (byte) 8);
        X = new kxz0(i2, (byte) 9);
        Y = new kxz0(i2, (byte) 10);
        Z = new kxz0(i2, (byte) 11);
        N0 = new kxz0(i2, (byte) 12);
        O0 = new kxz0(i2, (byte) 13);
        P0 = new kxz0(i2, (byte) 14);
        Q0 = new kxz0(i2, (byte) 15);
        R0 = new kxz0(i2, (byte) 16);
        S0 = new kxz0(i2, (byte) 17);
        T0 = new kxz0(i2, (byte) 18);
        U0 = new kxz0(i2, (byte) 19);
        V0 = new kxz0(i2, (byte) 20);
        W0 = new kxz0(i2, (byte) 21);
        X0 = new kxz0(i2, (byte) 22);
        Y0 = new kxz0(i2, (byte) 23);
        Z0 = new kxz0(i2, (byte) 24);
        a1 = new kxz0(i2, (byte) 25);
        b1 = new kxz0(i2, (byte) 26);
        c1 = new kxz0(i2, (byte) 27);
        d1 = new kxz0(i2, (byte) 28);
        e1 = new kxz0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kxz0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x029f  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        boolean z;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        w7h1 w7h1Var7;
        byte b2 = this.a;
        int i2 = 3;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                return new jnl0(new fjl0((r6h1) obj4, (byte) 14), ((jxz0) obj).b <= 0 ? 1 : 2);
            case 1:
                jnl0 jnl0Var = (jnl0) obj;
                if (lxz0.a[((ixz0) obj4).ordinal()] == 1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "reactions-bottom-sheet")), jnl0Var.a, jnl0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 2:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = r6h1.c;
                return new pcl0();
            case 3:
                kyz0 kyz0Var = (kyz0) obj4;
                y6h1 y6h1Var = ((pcl0) obj).a;
                if (kyz0Var instanceof jyz0) {
                    myz0 myz0Var = ((jyz0) kyz0Var).a;
                    String str = myz0Var.a;
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("reaction_button", str, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    String str2 = myz0Var.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_reaction", 1, Collections.singletonMap("reaction_to_be_added", str2 != null ? str2 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(kyz0Var instanceof iyz0)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("custom_reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 4:
                ((Number) obj3).intValue();
                r6h1 r6h1Var2 = r6h1.c;
                return new vcl0();
            case 5:
                ctl0 ctl0Var = (ctl0) obj;
                t201 t201Var = (t201) obj2;
                r201 r201Var = (r201) obj4;
                r6h1 r6h1Var3 = ctl0Var.a;
                y6h1 y6h1Var2 = ctl0Var.b;
                if (r201Var instanceof p201) {
                    p201 p201Var = (p201) r201Var;
                    String str3 = p201Var.a.a;
                    Integer numValueOf = Integer.valueOf(p201Var.b);
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("reaction_button", str3, numValueOf, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    if (u890.j(str3, t201Var.b)) {
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_reaction", 1, Collections.singletonMap("reaction_to_be_removed", str3 != null ? str3 : "")), y6h1VarA2, r6h1Var3, System.currentTimeMillis());
                    } else {
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_reaction", 1, Collections.singletonMap("reaction_to_be_added", str3 != null ? str3 : "")), y6h1VarA2, r6h1Var3, System.currentTimeMillis());
                    }
                } else {
                    if (!(r201Var instanceof q201)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("custom_reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 6:
                z301 z301Var = (z301) obj;
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var4 = (r6h1) obj4;
                String str4 = z301Var.a;
                String str5 = z301Var.e;
                return z301Var.f ? new cxk0(new dxk0(Integer.valueOf(iIntValue), str5, r6h1Var4), str4) : new fxk0(new gxk0(str5), Integer.valueOf(z301Var.g), str4);
            case 7:
                n8h1 n8h1Var = (n8h1) obj;
                y301 y301Var = (y301) obj4;
                if (!(n8h1Var instanceof cxk0)) {
                    if (n8h1Var instanceof fxk0) {
                        if (y301Var instanceof l301) {
                            x6h1 x6h1VarC5 = ((fxk0) n8h1Var).a.c();
                            x6h1VarC5.i.add(new a7h1("add_reaction_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC5.j = false;
                            w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                        } else if (y301Var instanceof t301) {
                            x6h1 x6h1VarC6 = ((fxk0) n8h1Var).a.c();
                            x6h1VarC6.i.add(new a7h1("view_reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC6.j = false;
                            w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                        } else if (y301Var instanceof u301) {
                            x6h1 x6h1VarC7 = ((fxk0) n8h1Var).a.c();
                            x6h1VarC7.i.add(new a7h1("view_reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC7.j = false;
                            w7h1Var3 = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                        }
                        return w7h1Var3;
                    }
                    return null;
                }
                if (y301Var instanceof l301) {
                    cxk0 cxk0Var = (cxk0) n8h1Var;
                    x6h1 x6h1VarC8 = cxk0Var.a.c();
                    x6h1VarC8.i.add(new a7h1("add_reaction_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC8.a(), cxk0Var.b.a, System.currentTimeMillis());
                } else {
                    if (!(y301Var instanceof t301)) {
                        if (y301Var instanceof u301) {
                            cxk0 cxk0Var2 = (cxk0) n8h1Var;
                            x6h1 x6h1VarC9 = cxk0Var2.a.c();
                            x6h1VarC9.i.add(new a7h1("view_reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC9.j = false;
                            w7h1Var3 = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), cxk0Var2.b.a, System.currentTimeMillis());
                        }
                        return null;
                    }
                    cxk0 cxk0Var3 = (cxk0) n8h1Var;
                    x6h1 x6h1VarC10 = cxk0Var3.a.c();
                    x6h1VarC10.i.add(new a7h1("view_reactions_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), cxk0Var3.b.a, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 8:
                ((Number) obj3).intValue();
                return new exk0();
            case 9:
                return null;
            case 10:
                ((Number) obj3).intValue();
                return new b6l0(new g5l0((r6h1) obj4, (byte) 2));
            case 11:
                b6l0 b6l0Var = (b6l0) obj;
                y6h1 y6h1Var3 = b6l0Var.a;
                r6h1 r6h1Var5 = b6l0Var.b.b;
                return ((k601) obj4).a ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), y6h1Var3, r6h1Var5, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_disable", 1, b7xVar), y6h1Var3, r6h1Var5, System.currentTimeMillis());
            case 12:
                qtl0 qtl0Var = (qtl0) obj;
                z601 z601Var = (z601) obj4;
                y6h1 y6h1Var4 = qtl0Var.b;
                if (z601Var.equals(w601.a)) {
                    return qtl0Var.h();
                }
                if (z601Var.equals(x601.a)) {
                    x6h1 x6h1VarC11 = y6h1Var4.c();
                    x6h1VarC11.i.add(new a7h1("expand_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC11.a(), qtl0Var.a, System.currentTimeMillis());
                }
                if (!z601Var.equals(y601.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC12 = y6h1Var4.c();
                x6h1VarC12.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC12.a(), qtl0Var.a, System.currentTimeMillis());
            case 13:
                qtl0 qtl0Var2 = (qtl0) obj;
                la01 la01Var = (la01) obj4;
                y6h1 y6h1Var5 = qtl0Var2.b;
                if (la01Var.equals(ia01.a)) {
                    return qtl0Var2.h();
                }
                if (la01Var.equals(ja01.a)) {
                    x6h1 x6h1VarC13 = y6h1Var5.c();
                    x6h1VarC13.i.add(new a7h1("expand_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC13.a(), qtl0Var2.a, System.currentTimeMillis());
                }
                if (!la01Var.equals(ka01.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC14 = y6h1Var5.c();
                x6h1VarC14.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC14.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC14.a(), qtl0Var2.a, System.currentTimeMillis());
            case 14:
                return null;
            case 15:
                ((Number) obj3).intValue();
                return new irl0((r6h1) obj4);
            case 16:
                ((Number) obj3).intValue();
                return new stl0((r6h1) obj4);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                stl0 stl0Var = (stl0) obj;
                lh01 lh01Var = (lh01) obj3;
                dh01 dh01Var = (dh01) obj4;
                r6h1 r6h1Var6 = stl0Var.a;
                y6h1 y6h1Var6 = stl0Var.b;
                String str6 = ((ah01) obj2).a;
                if (dh01Var.equals(bh01.a)) {
                    if (lh01Var.equals(kh01.a)) {
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str6 != null ? str6 : "")), y6h1Var6, r6h1Var6, System.currentTimeMillis());
                    } else if (lh01Var.equals(jh01.a)) {
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("stop", 1, Collections.singletonMap("item_to_be_stopped", str6 != null ? str6 : "")), y6h1Var6, r6h1Var6, System.currentTimeMillis());
                    } else if (lh01Var.equals(hh01.a)) {
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var6, r6h1Var6, System.currentTimeMillis());
                    } else if (!(lh01Var instanceof ih01)) {
                        eg.o();
                    }
                    return w7h1Var4;
                }
                if (!dh01Var.equals(ch01.a)) {
                    eg.o();
                }
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ci01 ci01Var = (ci01) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var7 = (r6h1) obj4;
                bi01 bi01Var = ci01Var.a;
                if (!(bi01Var instanceof yh01)) {
                    if (bi01Var.equals(zh01.a)) {
                        i2 = 2;
                    } else if (bi01Var.equals(ai01.a)) {
                        i2 = 4;
                    } else {
                        if (!bi01Var.equals(xh01.a)) {
                            eg.o();
                            return null;
                        }
                        i2 = 1;
                    }
                }
                return new rtl0(i2, ci01Var.b, r6h1Var7);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                rtl0 rtl0Var = (rtl0) obj;
                if (((wh01) obj4) == wh01.a) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), rtl0Var.b, rtl0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                yk01 yk01Var = (yk01) obj;
                ((Number) obj3).intValue();
                sqk0 sqk0Var = new sqk0(new uvk0(yk01Var.e), yk01Var.d);
                int iC = l1d.C(yk01Var.a);
                if (iC == 0) {
                    i2 = 2;
                } else if (iC != 1) {
                    if (iC == 2) {
                        i2 = 1;
                    } else {
                        if (iC != 3) {
                            eg.o();
                            return null;
                        }
                        i2 = 4;
                    }
                }
                return new tvk0(sqk0Var, i2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return null;
            case 22:
                ovl0 ovl0Var = (ovl0) obj;
                vm01 vm01Var = (vm01) obj3;
                tm01 tm01Var = (tm01) obj4;
                y6h1 y6h1Var7 = ovl0Var.a;
                boolean z2 = vm01Var.t;
                String str7 = ((um01) obj2).a;
                ck60 ck60VarQ = mqo1.q(str7);
                boolean z3 = vm01Var.i;
                ck60 ck60Var = ck60.h;
                if (z3) {
                    z = true;
                } else {
                    if (ck60VarQ == ck60Var ? false : o0c.F(vm01Var.I, vm01Var.g, vm01Var.h)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (tm01Var instanceof sm01) {
                    if (vm01Var.F) {
                        return ovl0Var.a(str7);
                    }
                    if (z) {
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var7, r6h1.c, System.currentTimeMillis());
                    } else {
                        if (ck60VarQ != ck60.b) {
                            return ovl0Var.a(str7);
                        }
                        if (vm01Var.B) {
                            return ovl0Var.a(str7);
                        }
                        if (!vm01Var.f) {
                            return ovl0Var.a(str7);
                        }
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str7)), y6h1Var7, r6h1.c, System.currentTimeMillis());
                    }
                } else {
                    if (tm01Var.equals(om01.a)) {
                        x6h1 x6h1VarC15 = y6h1Var7.c();
                        x6h1VarC15.i.add(new a7h1("add_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC15.j = false;
                        y6h1 y6h1VarA3 = x6h1VarC15.a();
                        if (z2) {
                            w7h1Var6 = (ck60VarQ == ck60Var || ck60VarQ == ck60.f) ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str7)), y6h1VarA3, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA3, r6h1.c, System.currentTimeMillis());
                        } else {
                            w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str7)), y6h1VarA3, r6h1.c, System.currentTimeMillis());
                        }
                        return w7h1Var6;
                    }
                    if (tm01Var.equals(rm01.a)) {
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_recent_searches_item", 1, b7xVar), y6h1Var7, r6h1.c, System.currentTimeMillis());
                    } else if (tm01Var.equals(qm01.a)) {
                        w7h1Var5 = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("add_item_to_queue", 1, Collections.singletonMap("item_to_add_to_queue", str7)), y6h1Var7, r6h1.c, System.currentTimeMillis());
                    } else {
                        if (!tm01Var.equals(pm01.a)) {
                            eg.o();
                            return null;
                        }
                        w7h1Var5 = z2 ? new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var7, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str7)), y6h1Var7, r6h1.c, System.currentTimeMillis());
                    }
                }
                return w7h1Var5;
            case 23:
                aw70 aw70Var = (aw70) obj;
                r6h1 r6h1Var8 = (r6h1) obj4;
                Integer numValueOf2 = Integer.valueOf(((Number) obj3).intValue());
                String str8 = aw70Var.t ? "has_sponsorship" : null;
                String str9 = aw70Var.i;
                if (str9.length() == 0) {
                    str9 = aw70Var.h;
                }
                return new ryl0(numValueOf2, str8, str9, r6h1Var8);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ryl0 ryl0Var = (ryl0) obj;
                aw70 aw70Var2 = (aw70) obj2;
                qt01 qt01Var = (qt01) obj4;
                if (qt01Var instanceof ot01) {
                    return ryl0Var.a(aw70Var2.h);
                }
                if (qt01Var instanceof pt01) {
                    return ryl0Var.g();
                }
                eg.o();
                return null;
            case 25:
                return null;
            case 26:
                ((Number) obj3).intValue();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new ttl0(new brl0(yon1.E4().c, (byte) 4));
            case 27:
                ct01 ct01Var = (ct01) obj4;
                y6h1 y6h1Var8 = ((ttl0) obj).a;
                if (ct01Var instanceof xs01) {
                    x6h1 x6h1VarC16 = y6h1Var8.c();
                    x6h1VarC16.i.add(new a7h1("clear_button", "", (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC16.a(), r6h1.c, System.currentTimeMillis());
                }
                if (ct01Var instanceof zs01) {
                    zs01 zs01Var = (zs01) ct01Var;
                    String str10 = zs01Var.b.a;
                    Integer numValueOf3 = Integer.valueOf(zs01Var.a);
                    x6h1 x6h1VarC17 = y6h1Var8.c();
                    x6h1VarC17.i.add(new a7h1("filter_chip", str10, numValueOf3, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC17.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (ct01Var instanceof ys01) {
                        ys01 ys01Var = (ys01) ct01Var;
                        String str11 = ys01Var.b.a;
                        Integer numValueOf4 = Integer.valueOf(ys01Var.a);
                        x6h1 x6h1VarC18 = y6h1Var8.c();
                        x6h1VarC18.i.add(new a7h1("filter_chip", str11, numValueOf4, (String) null, (String) null));
                        x6h1VarC18.j = false;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis());
                    }
                    if (ct01Var instanceof bt01) {
                        bt01 bt01Var = (bt01) ct01Var;
                        String strF = f4i1.f(bt01Var.b.a, "/", bt01Var.c.a);
                        Integer numValueOf5 = Integer.valueOf(bt01Var.a);
                        x6h1 x6h1VarC19 = y6h1Var8.c();
                        x6h1VarC19.i.add(new a7h1("filter_chip", strF, numValueOf5, (String) null, (String) null));
                        x6h1VarC19.j = false;
                        w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC19.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (!(ct01Var instanceof at01)) {
                            eg.o();
                            return null;
                        }
                        at01 at01Var = (at01) ct01Var;
                        String strF2 = f4i1.f(at01Var.b.a, "/", at01Var.c.a);
                        Integer numValueOf6 = Integer.valueOf(at01Var.a);
                        x6h1 x6h1VarC20 = y6h1Var8.c();
                        x6h1VarC20.i.add(new a7h1("filter_chip", strF2, numValueOf6, (String) null, (String) null));
                        x6h1VarC20.j = false;
                        w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC20.a(), r6h1.c, System.currentTimeMillis());
                    }
                }
                return w7h1Var7;
            case 28:
                return new syl0(Integer.valueOf(((Number) obj3).intValue()), ((cu01) obj).b, "", (r6h1) obj4);
            default:
                return null;
        }
    }
}
