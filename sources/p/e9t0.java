package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e9t0 extends hab0 implements zu30 {
    public static final e9t0 N0;
    public static final e9t0 O0;
    public static final e9t0 P0;
    public static final e9t0 Q0;
    public static final e9t0 R0;
    public static final e9t0 S0;
    public static final e9t0 T0;
    public static final e9t0 U0;
    public static final e9t0 V0;
    public static final e9t0 W0;
    public static final e9t0 X;
    public static final e9t0 X0;
    public static final e9t0 Y;
    public static final e9t0 Y0;
    public static final e9t0 Z;
    public static final e9t0 Z0;
    public static final e9t0 a1;
    public static final e9t0 b;
    public static final e9t0 b1;
    public static final e9t0 c;
    public static final e9t0 c1;
    public static final e9t0 d;
    public static final e9t0 d1;
    public static final e9t0 e;
    public static final e9t0 e1;
    public static final e9t0 f;
    public static final e9t0 g;
    public static final e9t0 h;
    public static final e9t0 i;
    public static final e9t0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new e9t0(i2, (byte) 0);
        c = new e9t0(i2, (byte) 1);
        d = new e9t0(i2, (byte) 2);
        e = new e9t0(i2, (byte) 3);
        f = new e9t0(i2, (byte) 4);
        g = new e9t0(i2, (byte) 5);
        h = new e9t0(i2, (byte) 6);
        i = new e9t0(i2, (byte) 7);
        t = new e9t0(i2, (byte) 8);
        X = new e9t0(i2, (byte) 9);
        Y = new e9t0(i2, (byte) 10);
        Z = new e9t0(i2, (byte) 11);
        N0 = new e9t0(i2, (byte) 12);
        O0 = new e9t0(i2, (byte) 13);
        P0 = new e9t0(i2, (byte) 14);
        Q0 = new e9t0(i2, (byte) 15);
        R0 = new e9t0(i2, (byte) 16);
        S0 = new e9t0(i2, (byte) 17);
        T0 = new e9t0(i2, (byte) 18);
        U0 = new e9t0(i2, (byte) 19);
        V0 = new e9t0(i2, (byte) 20);
        W0 = new e9t0(i2, (byte) 21);
        X0 = new e9t0(i2, (byte) 22);
        Y0 = new e9t0(i2, (byte) 23);
        Z0 = new e9t0(i2, (byte) 24);
        a1 = new e9t0(i2, (byte) 25);
        b1 = new e9t0(i2, (byte) 26);
        c1 = new e9t0(i2, (byte) 27);
        d1 = new e9t0(i2, (byte) 28);
        e1 = new e9t0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9t0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        int i2;
        int i3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                epk0 epk0Var = (epk0) obj;
                c9t0 c9t0Var = (c9t0) obj2;
                y6h1 y6h1Var = epk0Var.b;
                boolean z = c9t0Var.e;
                v8t0 v8t0Var = c9t0Var.a;
                int i4 = c9t0Var.f;
                if (((b9t0) obj4) instanceof b9t0) {
                    if (v8t0Var instanceof u8t0) {
                        x6h1 x6h1VarC = y6h1Var.c();
                        x6h1VarC.i.add(new a7h1("plan_manager_account_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), epk0Var.a, System.currentTimeMillis());
                    } else if (v8t0Var instanceof w8t0) {
                        if (z) {
                            Integer numValueOf = Integer.valueOf(i4);
                            x6h1 x6h1VarC2 = y6h1Var.c();
                            x6h1VarC2.i.add(new a7h1("self_managed_account_row", (String) null, numValueOf, (String) null, (String) null));
                            x6h1VarC2.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("login", 1, b7xVar), x6h1VarC2.a(), epk0Var.a, System.currentTimeMillis());
                        } else {
                            Integer numValueOf2 = Integer.valueOf(i4);
                            x6h1 x6h1VarC3 = y6h1Var.c();
                            x6h1VarC3.i.add(new a7h1("self_managed_account_row", (String) null, numValueOf2, (String) null, (String) null));
                            x6h1VarC3.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("logout", 1, b7xVar), x6h1VarC3.a(), epk0Var.a, System.currentTimeMillis());
                        }
                    } else if (v8t0Var instanceof v8t0) {
                        if (v8t0Var.a) {
                            x6h1 x6h1VarC4 = y6h1Var.c();
                            x6h1VarC4.i.add(new a7h1("plan_manager_account_row", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC4.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), epk0Var.a, System.currentTimeMillis());
                        } else if (z) {
                            Integer numValueOf3 = Integer.valueOf(i4);
                            x6h1 x6h1VarC5 = y6h1Var.c();
                            x6h1VarC5.i.add(new a7h1("self_managed_account_row", (String) null, numValueOf3, (String) null, (String) null));
                            x6h1VarC5.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("login", 1, b7xVar), x6h1VarC5.a(), epk0Var.a, System.currentTimeMillis());
                        } else {
                            Integer numValueOf4 = Integer.valueOf(i4);
                            x6h1 x6h1VarC6 = y6h1Var.c();
                            x6h1VarC6.i.add(new a7h1("self_managed_account_row", (String) null, numValueOf4, (String) null, (String) null));
                            x6h1VarC6.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("logout", 1, b7xVar), x6h1VarC6.a(), epk0Var.a, System.currentTimeMillis());
                        }
                    } else if (v8t0Var instanceof s8t0) {
                        Integer numValueOf5 = Integer.valueOf(i4);
                        String strA = ((s8t0) v8t0Var).a();
                        x6h1 x6h1VarC7 = y6h1Var.c();
                        x6h1VarC7.i.add(new a7h1("managed_account_row", (String) null, numValueOf5, strA, (String) null));
                        x6h1VarC7.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("login", 1, b7xVar), x6h1VarC7.a(), epk0Var.a, System.currentTimeMillis());
                    } else {
                        eg.o();
                    }
                    return w7h1Var;
                }
                eg.o();
                return null;
            case 1:
                ((Number) obj3).intValue();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new v2m0(new ksk0(yon1.X4().a, nik1.g1.a, (byte) 22));
            case 2:
                v2m0 v2m0Var = (v2m0) obj;
                vbt0 vbt0Var = (vbt0) obj3;
                qbt0 qbt0Var = (qbt0) obj4;
                if (qbt0Var.equals(qbt0.b) || qbt0Var.equals(qbt0.a)) {
                    String str = vbt0Var.d;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), v2m0Var.a, v2m0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 3:
                kct0 kct0Var = (kct0) obj;
                ((Number) obj3).intValue();
                return new v6m0(new ksk0((byte) 24), Integer.valueOf(kct0Var.g), kct0Var.f);
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                ((Number) obj3).intValue();
                return new ill0((r6h1) obj4);
            case 7:
                ((Number) obj3).intValue();
                return new ill0((r6h1) obj4);
            case 8:
                ((Number) obj3).intValue();
                return new jxk0((r6h1) obj4);
            case 9:
                ill0 ill0Var = (ill0) obj;
                qet0 qet0Var = (qet0) obj2;
                met0 met0Var = (met0) obj4;
                String str2 = qet0Var.a;
                if (qet0Var.c) {
                    return ill0Var.l();
                }
                int iOrdinal = met0Var.ordinal();
                if (iOrdinal == 0) {
                    return ill0Var.e(str2);
                }
                if (iOrdinal == 1) {
                    return ill0Var.i(str2);
                }
                if (iOrdinal == 2) {
                    return ill0Var.h(str2);
                }
                if (iOrdinal == 3) {
                    return ill0Var.k(str2);
                }
                eg.o();
                return null;
            case 10:
                ill0 ill0Var2 = (ill0) obj;
                bft0 bft0Var = (bft0) obj3;
                String str3 = ((ret0) obj2).a;
                if (((xet0) obj4).equals(xet0.a)) {
                    gwt0 gwt0Var = bft0Var.a;
                    if ((gwt0Var instanceof uvt0) || (gwt0Var instanceof wvt0) || (gwt0Var instanceof dwt0)) {
                        return ill0Var2.h(str3);
                    }
                    if (gwt0Var.equals(cwt0.a)) {
                        return ill0Var2.e(str3);
                    }
                    if (gwt0Var.equals(fwt0.a)) {
                        return ill0Var2.i(str3);
                    }
                    if ((gwt0Var instanceof yvt0) || (gwt0Var instanceof zvt0)) {
                        return ill0Var2.l();
                    }
                    if ((gwt0Var instanceof bwt0) || (gwt0Var instanceof vvt0) || (gwt0Var instanceof xvt0)) {
                        return ill0Var2.j(str3);
                    }
                    if (!gwt0Var.equals(awt0.a)) {
                        eg.o();
                    }
                } else {
                    eg.o();
                }
                return null;
            case 11:
                ill0 ill0Var3 = (ill0) obj;
                uet0 uet0Var = (uet0) obj3;
                String str4 = uet0Var.a;
                boolean z2 = uet0Var.c;
                if (!((let0) obj4).equals(let0.a)) {
                    eg.o();
                    return null;
                }
                if (uet0Var.d || z2) {
                    return z2 ? ill0Var3.e(str4) : ill0Var3.i(str4);
                }
                return ill0Var3.h(str4);
            case 12:
                jxk0 jxk0Var = (jxk0) obj;
                tet0 tet0Var = (tet0) obj2;
                r6h1 r6h1Var = jxk0Var.a;
                y6h1 y6h1Var2 = jxk0Var.b;
                if (!((ket0) obj4).equals(ket0.a)) {
                    eg.o();
                    return null;
                }
                if (tet0Var.c == null) {
                    x6h1 x6h1VarC8 = y6h1Var2.c();
                    x6h1VarC8.i.add(new a7h1("play_from_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    y6h1 y6h1VarA = x6h1VarC8.a();
                    int i5 = tet0Var.d;
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    String strValueOf = String.valueOf(i5);
                    w7h1Var2 = new w7h1("", "", z7h1Var, new x7h1("seek_to_time", 1, Collections.singletonMap("ms_to_seek_to", strValueOf != null ? strValueOf : "")), y6h1VarA, r6h1Var, System.currentTimeMillis());
                } else {
                    x6h1 x6h1VarC9 = y6h1Var2.c();
                    x6h1VarC9.i.add(new a7h1("play_from_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC9.a();
                    String str5 = tet0Var.b;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str5 != null ? str5 : "")), y6h1VarA2, r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 13:
                wml0 wml0Var = (wml0) obj;
                git0 git0Var = (git0) obj2;
                lit0 lit0Var = (lit0) obj3;
                eit0 eit0Var = (eit0) obj4;
                y6h1 y6h1Var3 = wml0Var.a;
                yml0 yml0Var = wml0Var.b;
                ai90 ai90Var = git0Var.c;
                if (eit0Var.equals(cit0.a)) {
                    String strC = ai90Var.c();
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", strC != null ? strC : "")), y6h1Var3, yml0Var.a, System.currentTimeMillis());
                } else {
                    if (eit0Var.equals(bit0.a)) {
                        return wml0Var.e(ai90Var.c());
                    }
                    if (eit0Var.equals(zht0.a)) {
                        return wml0Var.e(ai90Var.c());
                    }
                    if (!eit0Var.equals(dit0.a)) {
                        if (eit0Var.equals(ait0.a)) {
                            return wml0Var.a(ai90Var.c());
                        }
                        if (eit0Var instanceof yht0) {
                            vb2.a.getClass();
                            return wml0Var.a(ub2.b);
                        }
                        eg.o();
                        return null;
                    }
                    if (lit0Var.b) {
                        String str6 = git0Var.b;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("shuffle_play", 1, Collections.singletonMap("context_to_be_played", str6 != null ? str6 : "")), y6h1Var3, yml0Var.a, System.currentTimeMillis());
                    } else {
                        String strC2 = ai90Var.c();
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", strC2 != null ? strC2 : "")), y6h1Var3, yml0Var.a, System.currentTimeMillis());
                    }
                }
                return w7h1Var3;
            case 14:
                ((Number) obj4).intValue();
                return new wml0((yml0) obj);
            case 15:
                ((Number) obj3).intValue();
                return new pkl0((r6h1) obj4);
            case 16:
                pkl0 pkl0Var = (pkl0) obj;
                String str7 = ((xjt0) obj2).b;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str7 != null ? str7 : "")), pkl0Var.b, pkl0Var.a, System.currentTimeMillis());
            case 17:
                ((Number) obj3).intValue();
                return new drl0((r6h1) obj4);
            case 18:
                drl0 drl0Var = (drl0) obj;
                iot0 iot0Var = (iot0) obj3;
                if (!((got0) obj4).equals(got0.a)) {
                    eg.o();
                    return null;
                }
                v6y0 v6y0Var = iot0Var.b;
                if (v6y0Var != null) {
                    i2 = 1;
                    i3 = 2;
                    if (v6y0Var.c) {
                        return drl0Var.h(2, 1);
                    }
                } else {
                    i2 = 1;
                    i3 = 2;
                }
                return drl0Var.h(i2, i3);
            case 19:
                ((Number) obj3).intValue();
                return new oil0((r6h1) obj4);
            case 20:
                oil0 oil0Var = (oil0) obj;
                r6h1 r6h1Var2 = oil0Var.a;
                y6h1 y6h1Var4 = oil0Var.b;
                String str8 = ((ept0) obj3).a;
                int iOrdinal2 = ((bpt0) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("resume", 1, Collections.singletonMap("item_to_be_resumed", str8 != null ? str8 : "")), y6h1Var4, r6h1Var2, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str8 != null ? str8 : "")), y6h1Var4, r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 21:
                lqt0 lqt0Var = (lqt0) obj3;
                iqt0 iqt0Var = (iqt0) obj4;
                y6h1 y6h1Var5 = ((svk0) obj).a;
                if (!(iqt0Var instanceof iqt0)) {
                    eg.o();
                    return null;
                }
                boolean z3 = iqt0Var.a;
                String str9 = lqt0Var.b;
                if (z3) {
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str9 != null ? str9 : "")), y6h1Var5, r6h1.c, System.currentTimeMillis());
                } else {
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str9 != null ? str9 : "")), y6h1Var5, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 22:
                ((Number) obj3).intValue();
                return new dvl0("", "", ((cvt0) obj).d, (r6h1) obj4);
            case 23:
                return ((dvl0) obj).a(((cvt0) obj2).d);
            case 24:
                return new qdl0(Integer.valueOf(((Number) obj3).intValue()), ((lvt0) obj).a, (r6h1) obj4);
            case 25:
                qdl0 qdl0Var = (qdl0) obj;
                mvt0 mvt0Var = (ovt0) obj3;
                jvt0 jvt0Var = (jvt0) obj4;
                String str10 = ((lvt0) obj2).a;
                if (mvt0Var instanceof mvt0) {
                    if (jvt0Var.equals(ivt0.a)) {
                        return qdl0Var.a(str10);
                    }
                    if (jvt0Var.equals(hvt0.a)) {
                        return mvt0Var.e ? qdl0Var.h(str10) : qdl0Var.i(str10);
                    }
                    eg.o();
                }
                return null;
            case 26:
                bwl0 bwl0Var = (bwl0) obj;
                fhu0 fhu0Var = (fhu0) obj2;
                ghu0 ghu0Var = (ghu0) obj3;
                ehu0 ehu0Var = (ehu0) obj4;
                String str11 = fhu0Var.a;
                if (ehu0Var instanceof dhu0) {
                    o940 o940Var = fhu0Var.l;
                    return (o940Var == null || !o940Var.a()) ? bwl0Var.a(str11) : bwl0Var.i();
                }
                if (ehu0Var.equals(chu0.a)) {
                    qgl0 qgl0Var = new qgl0(bwl0Var);
                    return ghu0Var.g ? qgl0Var.m(str11) : qgl0Var.l(str11);
                }
                if (!ehu0Var.equals(chu0.b)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC10 = bwl0Var.a.c();
                x6h1VarC10.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                wvl0 wvl0Var = (wvl0) obj;
                fhu0 fhu0Var2 = (fhu0) obj2;
                ghu0 ghu0Var2 = (ghu0) obj3;
                ehu0 ehu0Var2 = (ehu0) obj4;
                String str12 = fhu0Var2.a;
                if (ehu0Var2 instanceof dhu0) {
                    o940 o940Var2 = fhu0Var2.l;
                    return (o940Var2 == null || !o940Var2.a()) ? wvl0Var.a(str12) : wvl0Var.i();
                }
                if (ehu0Var2.equals(chu0.a)) {
                    qgl0 qgl0Var2 = new qgl0(wvl0Var);
                    return ghu0Var2.g ? qgl0Var2.m(str12) : qgl0Var2.l(str12);
                }
                if (!ehu0Var2.equals(chu0.b)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC11 = wvl0Var.a.c();
                x6h1VarC11.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis());
            case 28:
                ((Number) obj3).intValue();
                return new lll0((r6h1) obj4);
            default:
                lll0 lll0Var = (lll0) obj;
                xju0 xju0Var = (xju0) obj3;
                oju0 oju0Var = (tju0) obj4;
                r6h1 r6h1Var3 = lll0Var.a;
                y6h1 y6h1Var6 = lll0Var.b;
                String str13 = xju0Var.b;
                String str14 = xju0Var.a;
                if (oju0Var instanceof nju0) {
                    Boolean bool = xju0Var.c;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            x6h1 x6h1VarC12 = y6h1Var6.c();
                            x6h1VarC12.i.add(new a7h1("playlist_curation_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC12.j = false;
                            y6h1 y6h1VarA3 = x6h1VarC12.a();
                            z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                            if (str14 == null) {
                                str14 = "";
                            }
                            w7h1Var6 = new w7h1("", "", z7h1Var2, new x7h1("remove_item_from_playlist", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_removed_from_playlist", str14), new mmr0("playlist", str13 != null ? str13 : "")})), y6h1VarA3, r6h1Var3, System.currentTimeMillis());
                        } else {
                            x6h1 x6h1VarC13 = y6h1Var6.c();
                            x6h1VarC13.i.add(new a7h1("playlist_curation_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC13.j = false;
                            y6h1 y6h1VarA4 = x6h1VarC13.a();
                            z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                            if (str13 == null) {
                                str13 = "";
                            }
                            w7h1Var6 = new w7h1("", "", z7h1Var3, new x7h1("add_to_playlist", 2, sqg0.J(new mmr0[]{new mmr0("playlist", str13), new mmr0("item_to_be_added", str14 != null ? str14 : "")})), y6h1VarA4, r6h1Var3, System.currentTimeMillis());
                        }
                        return w7h1Var6;
                    }
                    return null;
                }
                if (!(oju0Var instanceof oju0)) {
                    if (oju0Var instanceof pju0) {
                        x6h1 x6h1VarC14 = y6h1Var6.c();
                        x6h1VarC14.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC14.j = false;
                        y6h1 y6h1VarA5 = x6h1VarC14.a();
                        pju0 pju0Var = (pju0) oju0Var;
                        String str15 = pju0Var.b;
                        String str16 = pju0Var.a;
                        z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                        if (str15 == null) {
                            str15 = "";
                        }
                        w7h1Var6 = new w7h1("", "", z7h1Var4, new x7h1("add_to_playlist", 2, sqg0.J(new mmr0[]{new mmr0("playlist", str15), new mmr0("item_to_be_added", str16 != null ? str16 : "")})), y6h1VarA5, r6h1Var3, System.currentTimeMillis());
                    }
                    return null;
                }
                x6h1 x6h1VarC15 = y6h1Var6.c();
                x6h1VarC15.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC15.j = false;
                y6h1 y6h1VarA6 = x6h1VarC15.a();
                oju0 oju0Var2 = oju0Var;
                String str17 = oju0Var2.a;
                String str18 = oju0Var2.b;
                z7h1 z7h1Var5 = new z7h1("hit", 1, b7xVar);
                if (str17 == null) {
                    str17 = "";
                }
                w7h1Var6 = new w7h1("", "", z7h1Var5, new x7h1("remove_item_from_playlist", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_removed_from_playlist", str17), new mmr0("playlist", str18 != null ? str18 : "")})), y6h1VarA6, r6h1Var3, System.currentTimeMillis());
                return w7h1Var6;
        }
    }
}
