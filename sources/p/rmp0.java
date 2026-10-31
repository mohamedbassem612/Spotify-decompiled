package p;

import com.spotify.eventcardinfoservice.v1.EventCardInfoResponse;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rmp0 extends hab0 implements zu30 {
    public static final rmp0 N0;
    public static final rmp0 O0;
    public static final rmp0 P0;
    public static final rmp0 Q0;
    public static final rmp0 R0;
    public static final rmp0 S0;
    public static final rmp0 T0;
    public static final rmp0 U0;
    public static final rmp0 V0;
    public static final rmp0 W0;
    public static final rmp0 X;
    public static final rmp0 X0;
    public static final rmp0 Y;
    public static final rmp0 Y0;
    public static final rmp0 Z;
    public static final rmp0 Z0;
    public static final rmp0 a1;
    public static final rmp0 b;
    public static final rmp0 b1;
    public static final rmp0 c;
    public static final rmp0 c1;
    public static final rmp0 d;
    public static final rmp0 d1;
    public static final rmp0 e;
    public static final rmp0 e1;
    public static final rmp0 f;
    public static final rmp0 g;
    public static final rmp0 h;
    public static final rmp0 i;
    public static final rmp0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new rmp0(i2, (byte) 0);
        c = new rmp0(i2, (byte) 1);
        d = new rmp0(i2, (byte) 2);
        e = new rmp0(i2, (byte) 3);
        f = new rmp0(i2, (byte) 4);
        g = new rmp0(i2, (byte) 5);
        h = new rmp0(i2, (byte) 6);
        i = new rmp0(i2, (byte) 7);
        t = new rmp0(i2, (byte) 8);
        X = new rmp0(i2, (byte) 9);
        Y = new rmp0(i2, (byte) 10);
        Z = new rmp0(i2, (byte) 11);
        N0 = new rmp0(i2, (byte) 12);
        O0 = new rmp0(i2, (byte) 13);
        P0 = new rmp0(i2, (byte) 14);
        Q0 = new rmp0(i2, (byte) 15);
        R0 = new rmp0(i2, (byte) 16);
        S0 = new rmp0(i2, (byte) 17);
        T0 = new rmp0(i2, (byte) 18);
        U0 = new rmp0(i2, (byte) 19);
        V0 = new rmp0(i2, (byte) 20);
        W0 = new rmp0(i2, (byte) 21);
        X0 = new rmp0(i2, (byte) 22);
        Y0 = new rmp0(i2, (byte) 23);
        Z0 = new rmp0(i2, (byte) 24);
        a1 = new rmp0(i2, (byte) 25);
        b1 = new rmp0(i2, (byte) 26);
        c1 = new rmp0(i2, (byte) 27);
        d1 = new rmp0(i2, (byte) 28);
        e1 = new rmp0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rmp0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0743 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x0745  */
    /* JADX WARN: Code duplicated, block: B:178:0x074c  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        w7h1 w7h1Var5;
        int i2;
        int i3;
        String strN;
        w7h1 w7h1Var6;
        w7h1 w7h1Var7;
        w7h1 w7h1Var8;
        w7h1 w7h1Var9;
        byte b2 = this.a;
        String strP = "";
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                omp0 omp0Var = (omp0) obj2;
                y6h1 y6h1Var = ((kwl0) obj).a;
                int iOrdinal = ((nmp0) obj4).ordinal();
                if (iOrdinal == 0) {
                    Set set = s4b1.f;
                    String strZ = uic.C(omp0Var.b, (String) null).z();
                    if (strZ == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("send_friend_link_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strZ)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("show_qr_code_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 1:
                qpl0 qpl0Var = (qpl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), qpl0Var.a, qpl0Var.b.c.b, System.currentTimeMillis());
            case 2:
                ((Number) obj3).intValue();
                return new e4l0(((cop0) obj).a, (r6h1) obj4);
            case 3:
                e4l0 e4l0Var = (e4l0) obj;
                cop0 cop0Var = (cop0) obj2;
                if (kop0.a[((aop0) obj4).ordinal()] == 1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", cop0Var.b)), e4l0Var.b, e4l0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 4:
                epp0 epp0Var = (epp0) obj4;
                y6h1 y6h1Var2 = ((iuk0) obj).a;
                if (epp0Var instanceof bpp0) {
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("filter_chips", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA = x6h1VarC3.a();
                    l820 l820Var = ((bpp0) epp0Var).a;
                    String str = l820Var.b;
                    Integer numValueOf = Integer.valueOf(l820Var.d);
                    x6h1 x6h1VarC4 = y6h1VarA.c();
                    x6h1VarC4.i.add(new a7h1("filter_chip", str, numValueOf, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                } else if (epp0Var instanceof cpp0) {
                    x6h1 x6h1VarC5 = y6h1Var2.c();
                    x6h1VarC5.i.add(new a7h1("filter_chips", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC5.a();
                    l820 l820Var2 = ((cpp0) epp0Var).a;
                    String str2 = l820Var2.b;
                    Integer numValueOf2 = Integer.valueOf(l820Var2.d);
                    x6h1 x6h1VarC6 = y6h1VarA2.c();
                    x6h1VarC6.i.add(new a7h1("filter_chip", str2, numValueOf2, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!epp0Var.equals(dpp0.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var2.c();
                    x6h1VarC7.i.add(new a7h1("filter_chips", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("clear_button", "", (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 5:
                return null;
            case 6:
                ((Number) obj3).intValue();
                return new rjl0(epo1.J(((yrp0) obj).a), (r6h1) obj4);
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                return new ryl0(Integer.valueOf(((Number) obj3).intValue()), (String) null, ((fvp0) obj).f, (r6h1) obj4);
            case 10:
                ryl0 ryl0Var = (ryl0) obj;
                fvp0 fvp0Var = (fvp0) obj2;
                evp0 evp0Var = (evp0) obj4;
                if (evp0Var instanceof cvp0) {
                    return ryl0Var.a(fvp0Var.f);
                }
                if (evp0Var instanceof dvp0) {
                    return ryl0Var.g();
                }
                eg.o();
                return null;
            case 11:
                xvp0 xvp0Var = (xvp0) obj3;
                vvp0 vvp0Var = (vvp0) obj4;
                y6h1 y6h1Var3 = ((rvl0) obj).a;
                String str3 = ((wvp0) obj2).a;
                boolean zF = o0c.F(xvp0Var.f, xvp0Var.g, xvp0Var.h);
                if (vvp0Var instanceof uvp0) {
                    if (zF || xvp0Var.j) {
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var3, r6h1.c, System.currentTimeMillis());
                    } else if (sgy.i(str3)) {
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str3 != null ? str3 : "")), y6h1Var3, r6h1.c, System.currentTimeMillis());
                    } else {
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1Var3, r6h1.c, System.currentTimeMillis());
                    }
                } else if (vvp0Var.equals(tvp0.a)) {
                    x6h1 x6h1VarC9 = y6h1Var3.c();
                    x6h1VarC9.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                } else if (vvp0Var.equals(tvp0.b)) {
                    w7h1Var3 = new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var3, r6h1.c, System.currentTimeMillis());
                } else if (vvp0Var.equals(svp0.a)) {
                    w7h1Var3 = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("add_item_to_queue", 1, Collections.singletonMap("item_to_add_to_queue", str3 != null ? str3 : "")), y6h1Var3, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!vvp0Var.equals(rvp0.a)) {
                        eg.o();
                        return null;
                    }
                    if (xvp0Var.n) {
                        w7h1Var3 = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var3, r6h1.c, System.currentTimeMillis());
                    } else {
                        w7h1Var3 = new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str3 != null ? str3 : "")), y6h1Var3, r6h1.c, System.currentTimeMillis());
                    }
                }
                return w7h1Var3;
            case 12:
                ((Number) obj3).intValue();
                return new ill0((r6h1) obj4);
            case 13:
                ill0 ill0Var = (ill0) obj;
                q0q0 q0q0Var = (q0q0) obj3;
                String str4 = q0q0Var.a;
                w4m w4mVar = q0q0Var.c;
                r840 r840Var = q0q0Var.d;
                if ((r840Var instanceof i840) || (r840Var instanceof e840) || (r840Var instanceof f840) || (r840Var instanceof m840) || (r840Var instanceof h840) || (r840Var instanceof k840)) {
                    return ill0Var.j(str4);
                }
                if ((w4mVar instanceof w4m) && !w4mVar.b) {
                    return ill0Var.l();
                }
                int iOrdinal2 = q0q0Var.e.ordinal();
                if (iOrdinal2 == 0) {
                    return ill0Var.e(str4);
                }
                if (iOrdinal2 == 1) {
                    return ill0Var.i(str4);
                }
                if (iOrdinal2 == 2) {
                    return ill0Var.h(str4);
                }
                eg.o();
                return null;
            case 14:
                ((Number) obj3).intValue();
                return new rqk0(String.valueOf(((b3q0) obj2).b), (r6h1) obj4);
            case 15:
                rqk0 rqk0Var = (rqk0) obj;
                z2q0 z2q0Var = (z2q0) obj4;
                r6h1 r6h1Var = rqk0Var.a;
                y6h1 y6h1Var4 = rqk0Var.b;
                if (z2q0Var.equals(y2q0.a)) {
                    x6h1 x6h1VarC10 = y6h1Var4.c();
                    x6h1VarC10.i.add(new a7h1("information_icon", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), r6h1Var, System.currentTimeMillis());
                } else if (z2q0Var.equals(x2q0.a)) {
                    x6h1 x6h1VarC11 = y6h1Var4.c();
                    x6h1VarC11.i.add(new a7h1("info_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = true;
                    x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                    x6h1VarC12.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC12.a();
                    String str5 = bhl.a;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), y6h1VarA3, r6h1Var, System.currentTimeMillis());
                } else {
                    if (!z2q0Var.equals(w2q0.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC13 = y6h1Var4.c();
                    x6h1VarC13.i.add(new a7h1("info_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = true;
                    x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                    x6h1VarC14.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC14.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 16:
                cyl0 cyl0Var = (n8h1) obj;
                l6q0 l6q0Var = (l6q0) obj2;
                if (!((k6q0) obj4).equals(k6q0.a)) {
                    eg.o();
                    return null;
                }
                x5q0 x5q0Var = l6q0Var.a;
                if (x5q0Var instanceof x5q0) {
                    dyl0 dyl0Var = (dyl0) cyl0Var;
                    String strD = x5q0Var.d.a.D();
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strD != null ? strD : "")), dyl0Var.a, dyl0Var.b.b.b, System.currentTimeMillis());
                } else {
                    if (!(x5q0Var instanceof v5q0)) {
                        return cyl0Var.a(x5q0Var.b().a.D());
                    }
                    byl0 byl0Var = (byl0) cyl0Var;
                    String strD2 = ((v5q0) x5q0Var).d.a.D();
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strD2 != null ? strD2 : "")), byl0Var.a, byl0Var.b.b.b, System.currentTimeMillis());
                }
                return w7h1Var5;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var2 = (r6h1) obj4;
                k900 k900Var = ((c9q0) obj2).b;
                EventCardInfoResponse eventCardInfoResponse = k900Var != null ? k900Var.a : null;
                if (eventCardInfoResponse != null) {
                    i2 = 1;
                    if (eventCardInfoResponse.q()) {
                        i3 = 2;
                    }
                    if (eventCardInfoResponse == null && eventCardInfoResponse.v() == i2) {
                        strP = eventCardInfoResponse.t().p();
                    } else {
                        strN = eventCardInfoResponse != null ? eventCardInfoResponse.n() : null;
                        if (strN != null) {
                            strP = strN;
                        }
                    }
                    return new til0(i3, Integer.valueOf(iIntValue), strP, r6h1Var2);
                }
                i2 = 1;
                i3 = i2;
                if (eventCardInfoResponse == null) {
                    if (eventCardInfoResponse != null) {
                    }
                    if (strN != null) {
                        strP = strN;
                    }
                } else {
                    if (eventCardInfoResponse != null) {
                    }
                    if (strN != null) {
                        strP = strN;
                    }
                }
                return new til0(i3, Integer.valueOf(iIntValue), strP, r6h1Var2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                til0 til0Var = (til0) obj;
                y8q0 y8q0Var = (a9q0) obj4;
                r6h1 r6h1Var3 = til0Var.a;
                y6h1 y6h1Var5 = til0Var.b;
                if (y8q0Var instanceof r8q0) {
                    return til0Var.a(((r8q0) y8q0Var).a);
                }
                if (y8q0Var instanceof y8q0) {
                    x6h1 x6h1VarC15 = y6h1Var5.c();
                    x6h1VarC15.i.add(new a7h1("see_all_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", y8q0Var.a)), x6h1VarC15.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if (y8q0Var instanceof s8q0) {
                        return til0Var.a(((s8q0) y8q0Var).a);
                    }
                    if (y8q0Var instanceof t8q0) {
                        x6h1 x6h1VarC16 = y6h1Var5.c();
                        x6h1VarC16.i.add(new a7h1("event_card_cta", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC16.j = false;
                        w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((t8q0) y8q0Var).a)), x6h1VarC16.a(), r6h1Var3, System.currentTimeMillis());
                    } else {
                        if (y8q0Var instanceof u8q0) {
                            return til0Var.h();
                        }
                        if (y8q0Var instanceof v8q0) {
                            x6h1 x6h1VarC17 = y6h1Var5.c();
                            x6h1VarC17.i.add(new a7h1("event_card_cta", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC17.j = false;
                            w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC17.a(), r6h1Var3, System.currentTimeMillis());
                        } else if (y8q0Var instanceof q8q0) {
                            x6h1 x6h1VarC18 = y6h1Var5.c();
                            x6h1VarC18.i.add(new a7h1("event_card_cta", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC18.j = false;
                            w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", ((q8q0) y8q0Var).a)), x6h1VarC18.a(), r6h1Var3, System.currentTimeMillis());
                        } else {
                            if (!(y8q0Var instanceof x8q0)) {
                                eg.o();
                                return null;
                            }
                            x6h1 x6h1VarC19 = y6h1Var5.c();
                            x6h1VarC19.i.add(new a7h1("event_card_cta", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC19.j = false;
                            w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", ((x8q0) y8q0Var).a)), x6h1VarC19.a(), r6h1Var3, System.currentTimeMillis());
                        }
                    }
                }
                return w7h1Var6;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                til0 til0Var2 = (til0) obj;
                g9q0 g9q0Var = (p9q0) obj4;
                r6h1 r6h1Var4 = til0Var2.a;
                y6h1 y6h1Var6 = til0Var2.b;
                if (g9q0Var instanceof g9q0) {
                    x6h1 x6h1VarC20 = y6h1Var6.c();
                    x6h1VarC20.i.add(new a7h1("event_card_cta", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC20.j = false;
                    w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", g9q0Var.a)), x6h1VarC20.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (g9q0Var instanceof h9q0) {
                        return til0Var2.a(((h9q0) g9q0Var).a);
                    }
                    if (g9q0Var instanceof i9q0) {
                        return til0Var2.a(((i9q0) g9q0Var).a);
                    }
                    if (g9q0Var instanceof j9q0) {
                        x6h1 x6h1VarC21 = y6h1Var6.c();
                        x6h1VarC21.i.add(new a7h1("event_card_cta", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC21.j = false;
                        w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((j9q0) g9q0Var).a)), x6h1VarC21.a(), r6h1Var4, System.currentTimeMillis());
                    } else {
                        if (g9q0Var instanceof k9q0) {
                            return til0Var2.h();
                        }
                        if (g9q0Var instanceof l9q0) {
                            x6h1 x6h1VarC22 = y6h1Var6.c();
                            x6h1VarC22.i.add(new a7h1("event_card_cta", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC22.j = false;
                            w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC22.a(), r6h1Var4, System.currentTimeMillis());
                        } else if (g9q0Var instanceof m9q0) {
                            x6h1 x6h1VarC23 = y6h1Var6.c();
                            x6h1VarC23.i.add(new a7h1("event_card_cta", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC23.j = false;
                            w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", ((m9q0) g9q0Var).a)), x6h1VarC23.a(), r6h1Var4, System.currentTimeMillis());
                        } else {
                            if (!(g9q0Var instanceof o9q0)) {
                                if (g9q0Var instanceof n9q0) {
                                    return null;
                                }
                                eg.o();
                                return null;
                            }
                            x6h1 x6h1VarC24 = y6h1Var6.c();
                            x6h1VarC24.i.add(new a7h1("see_all_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC24.j = false;
                            w7h1Var7 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((o9q0) g9q0Var).a)), x6h1VarC24.a(), r6h1Var4, System.currentTimeMillis());
                        }
                    }
                }
                return w7h1Var7;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj3).intValue();
                return new tul0(new brl0((byte) 6));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                tul0 tul0Var = (tul0) obj;
                if (!((obq0) obj4).equals(obq0.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC25 = tul0Var.a.c();
                x6h1VarC25.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC25.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC25.a(), r6h1.c, System.currentTimeMillis());
            case 22:
                ((Number) obj3).intValue();
                return new uul0(new brl0((byte) 6));
            case 23:
                uul0 uul0Var = (uul0) obj;
                String str6 = nik1.r5.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), uul0Var.a, r6h1.c, System.currentTimeMillis());
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                hdq0 hdq0Var = (hdq0) obj;
                ((Number) obj3).intValue();
                return new vul0(Integer.valueOf(hdq0Var.a), hdq0Var.b.a, new brl0((byte) 6));
            case 25:
                hdq0 hdq0Var2 = (hdq0) obj2;
                y6h1 y6h1Var7 = ((vul0) obj).a;
                String str7 = hdq0Var2.b.a;
                xbq0 xbq0Var = hdq0Var2.c;
                ept eptVar = hdq0Var2.d;
                if (eptVar == null) {
                    return null;
                }
                int i4 = eptVar.e;
                bpt bptVar = eptVar.b;
                String str8 = eptVar.c;
                if (xbq0Var.equals(vbq0.a) || xbq0Var.equals(ubq0.a)) {
                    String strValueOf = String.valueOf((int) bptVar.a);
                    String strValueOf2 = String.valueOf(i4);
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    if (str7 == null) {
                        str7 = "";
                    }
                    mmr0 mmr0Var = new mmr0("item_to_download", str7);
                    if (str8 == null) {
                        str8 = "";
                    }
                    mmr0 mmr0Var2 = new mmr0("remote_device_id", str8);
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                    w7h1Var8 = new w7h1("", "", z7h1Var, new x7h1("download_to_remote_device", 1, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("remote_device_type", strValueOf), new mmr0("remote_client_platform", strValueOf2 != null ? strValueOf2 : "")})), y6h1Var7, r6h1.c, System.currentTimeMillis());
                } else if (xbq0Var.equals(wbq0.a) || (xbq0Var instanceof tbq0)) {
                    String strValueOf3 = String.valueOf((int) bptVar.a);
                    String strValueOf4 = String.valueOf(i4);
                    z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                    if (str7 == null) {
                        str7 = "";
                    }
                    mmr0 mmr0Var3 = new mmr0("item_to_stop_download", str7);
                    if (str8 == null) {
                        str8 = "";
                    }
                    mmr0 mmr0Var4 = new mmr0("remote_device_id", str8);
                    if (strValueOf3 == null) {
                        strValueOf3 = "";
                    }
                    w7h1Var8 = new w7h1("", "", z7h1Var2, new x7h1("stop_download_to_remote_device", 1, sqg0.J(new mmr0[]{mmr0Var3, mmr0Var4, new mmr0("remote_device_type", strValueOf3), new mmr0("remote_client_platform", strValueOf4 != null ? strValueOf4 : "")})), y6h1Var7, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!xbq0Var.equals(sbq0.a)) {
                        return null;
                    }
                    w7h1Var8 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var7, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var8;
            case 26:
                ((Number) obj3).intValue();
                return new yfl0((r6h1) obj4);
            case 27:
                yfl0 yfl0Var = (yfl0) obj;
                ieq0 ieq0Var = (ieq0) obj4;
                if (ieq0Var instanceof heq0) {
                    x6h1 x6h1VarC26 = yfl0Var.b.c();
                    x6h1VarC26.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC26.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC26.a(), yfl0Var.a, System.currentTimeMillis());
                }
                if ((ieq0Var instanceof feq0) || (ieq0Var instanceof geq0)) {
                    return null;
                }
                eg.o();
                return null;
            case 28:
                ((Number) obj3).intValue();
                return new wul0(new brl0((byte) 6));
            default:
                agq0 agq0Var = (agq0) obj2;
                zfq0 zfq0Var = (zfq0) obj4;
                y6h1 y6h1Var8 = ((wul0) obj).a;
                ept eptVar2 = agq0Var.b;
                if (zfq0Var instanceof xfq0) {
                    x6h1 x6h1VarC27 = y6h1Var8.c();
                    x6h1VarC27.i.add(new a7h1("remove_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC27.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC27.a();
                    String str9 = agq0Var.a;
                    String str10 = eptVar2.c;
                    String strValueOf5 = String.valueOf((int) eptVar2.b.a);
                    String strValueOf6 = String.valueOf(eptVar2.e);
                    z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                    if (str9 == null) {
                        str9 = "";
                    }
                    mmr0 mmr0Var5 = new mmr0("item_to_remove_from_downloads", str9);
                    if (str10 == null) {
                        str10 = "";
                    }
                    mmr0 mmr0Var6 = new mmr0("remote_device_id", str10);
                    if (strValueOf5 == null) {
                        strValueOf5 = "";
                    }
                    w7h1Var9 = new w7h1("", "", z7h1Var3, new x7h1("remove_download_from_remote_device", 1, sqg0.J(new mmr0[]{mmr0Var5, mmr0Var6, new mmr0("remote_device_type", strValueOf5), new mmr0("remote_client_platform", strValueOf6 != null ? strValueOf6 : "")})), y6h1VarA4, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(zfq0Var instanceof yfq0)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC28 = y6h1Var8.c();
                    x6h1VarC28.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC28.j = false;
                    w7h1Var9 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC28.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var9;
        }
    }
}
