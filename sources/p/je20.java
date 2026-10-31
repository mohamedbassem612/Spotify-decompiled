package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class je20 extends hab0 implements zu30 {
    public static final je20 N0;
    public static final je20 O0;
    public static final je20 P0;
    public static final je20 Q0;
    public static final je20 R0;
    public static final je20 S0;
    public static final je20 T0;
    public static final je20 U0;
    public static final je20 V0;
    public static final je20 W0;
    public static final je20 X;
    public static final je20 X0;
    public static final je20 Y;
    public static final je20 Y0;
    public static final je20 Z;
    public static final je20 Z0;
    public static final je20 a1;
    public static final je20 b;
    public static final je20 b1;
    public static final je20 c;
    public static final je20 c1;
    public static final je20 d;
    public static final je20 d1;
    public static final je20 e;
    public static final je20 e1;
    public static final je20 f;
    public static final je20 g;
    public static final je20 h;
    public static final je20 i;
    public static final je20 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new je20(i2, (byte) 0);
        c = new je20(i2, (byte) 1);
        d = new je20(i2, (byte) 2);
        e = new je20(i2, (byte) 3);
        f = new je20(i2, (byte) 4);
        g = new je20(i2, (byte) 5);
        h = new je20(i2, (byte) 6);
        i = new je20(i2, (byte) 7);
        t = new je20(i2, (byte) 8);
        X = new je20(i2, (byte) 9);
        Y = new je20(i2, (byte) 10);
        Z = new je20(i2, (byte) 11);
        N0 = new je20(i2, (byte) 12);
        O0 = new je20(i2, (byte) 13);
        P0 = new je20(i2, (byte) 14);
        Q0 = new je20(i2, (byte) 15);
        R0 = new je20(i2, (byte) 16);
        S0 = new je20(i2, (byte) 17);
        T0 = new je20(i2, (byte) 18);
        U0 = new je20(i2, (byte) 19);
        V0 = new je20(i2, (byte) 20);
        W0 = new je20(i2, (byte) 21);
        X0 = new je20(i2, (byte) 22);
        Y0 = new je20(i2, (byte) 23);
        Z0 = new je20(i2, (byte) 24);
        a1 = new je20(i2, (byte) 25);
        b1 = new je20(i2, (byte) 26);
        c1 = new je20(i2, (byte) 27);
        d1 = new je20(i2, (byte) 28);
        e1 = new je20(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je20(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        byte b2 = this.a;
        m330 m330Var = m330.a;
        b7x b7xVar = b7x.a;
        w7h1 w7h1Var5 = null;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                String str = ((fe20) obj).b;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-watch-feed-pivots";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str;
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("watchfeedpivots");
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var.a);
                arrayList.add(y6h1VarA);
                return new r3m0(new r6h1(arrayList, r6h1Var.b));
            case 1:
                r3m0 r3m0Var = (r3m0) obj;
                ce20 ce20Var = (ce20) obj4;
                y6h1 y6h1Var2 = r3m0Var.b;
                if (ce20Var instanceof zd20) {
                    de20 de20Var = ((zd20) ce20Var).a;
                    String str2 = de20Var.b;
                    Integer numValueOf = Integer.valueOf(de20Var.c);
                    String str3 = de20Var.a;
                    x6h1 x6h1VarC = y6h1Var2.c();
                    x6h1VarC.i.add(new a7h1("filter_chip", str2, numValueOf, str3, (String) null));
                    x6h1VarC.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), x6h1VarC.a(), r3m0Var.a, System.currentTimeMillis());
                } else {
                    if (ce20Var instanceof ae20) {
                        de20 de20Var2 = ((ae20) ce20Var).a;
                        String str4 = de20Var2.b;
                        Integer numValueOf2 = Integer.valueOf(de20Var2.c);
                        String str5 = de20Var2.a;
                        x6h1 x6h1VarC2 = y6h1Var2.c();
                        x6h1VarC2.i.add(new a7h1("filter_chip", str4, numValueOf2, str5, (String) null));
                        x6h1VarC2.j = true;
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), r3m0Var.a, System.currentTimeMillis());
                    }
                    if (!ce20Var.equals(be20.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("filter_chip", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), x6h1VarC3.a(), r3m0Var.a, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((gg20) obj2).b.a)), ((t3l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 3:
                jvl0 jvl0Var = (jvl0) obj;
                dm20 dm20Var = (dm20) obj2;
                cm20 cm20Var = (tm20) obj3;
                wl20 wl20Var = (wl20) obj4;
                kl20 kl20Var = dm20Var.c;
                String str6 = dm20Var.a;
                cm20 cm20Var2 = cm20Var instanceof cm20 ? cm20Var : null;
                boolean z = cm20Var2 != null && cm20Var2.a();
                fm20 fm20Var = cm20Var instanceof fm20 ? (fm20) cm20Var : null;
                em20 em20VarB = fm20Var != null ? fm20Var.b() : null;
                boolean z2 = cm20Var.c().k || o0c.F(cm20Var.c().f, cm20Var.c().g, cm20Var.c().h);
                if (wl20Var instanceof ul20) {
                    if (cm20Var.c().j) {
                        return jvl0Var.a(str6);
                    }
                    w7h1 w7h1Var6 = cm20Var.c().o.a;
                    w7h1 w7h1Var7 = w7h1Var6 instanceof xl20 ? (xl20) w7h1Var6 : null;
                    if (w7h1Var7 != null && w7h1Var7.a) {
                        return jvl0Var.j();
                    }
                    if (z2 || cm20Var.c().q != null) {
                        return jvl0Var.j();
                    }
                    if (kl20Var.a) {
                        return z ? jvl0Var.i(str6) : jvl0Var.a(str6);
                    }
                    return jvl0Var.a(str6);
                }
                if (wl20Var.equals(ql20.a)) {
                    qgl0 qgl0Var = new qgl0(jvl0Var);
                    if (em20VarB == null || !em20VarB.b) {
                        return qgl0Var.l(str6);
                    }
                    return (kl20Var == kl20.Album || kl20Var == kl20.Playlist) ? qgl0Var.m(str6) : qgl0Var.r();
                }
                if (wl20Var.equals(tl20.a)) {
                    x6h1 x6h1VarC4 = jvl0Var.a.c();
                    x6h1VarC4.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                }
                if (wl20Var.equals(vl20.a)) {
                    if (!z2 && cm20Var.c().q == null && z) {
                        return jvl0Var.g();
                    }
                    return null;
                }
                if (wl20Var.equals(sl20.a)) {
                    return jvl0Var.l(str6);
                }
                if (wl20Var.equals(rl20.a)) {
                    return (em20VarB == null || !em20VarB.b) ? jvl0Var.m(str6) : jvl0Var.n();
                }
                eg.o();
                return null;
            case 4:
                ((Number) obj3).intValue();
                return new dul0(((yw20) obj).b.b());
            case 5:
                lhb1 lhb1Var = (lhb1) obj4;
                y6h1 y6h1Var3 = ((dul0) obj).a;
                if (lhb1Var.equals(jhb1.a)) {
                    x6h1 x6h1VarC5 = y6h1Var3.c();
                    x6h1VarC5.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:premium-destination")), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!lhb1Var.equals(khb1.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC6 = y6h1Var3.c();
                x6h1VarC6.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
            case 6:
                ((Number) obj3).intValue();
                return new hgl0();
            case 7:
                e330 e330Var = (e330) obj2;
                d330 d330Var = (d330) obj4;
                y6h1 y6h1Var4 = ((hgl0) obj).a;
                if (d330Var.equals(b330.a)) {
                    x6h1 x6h1VarC7 = y6h1Var4.c();
                    x6h1VarC7.i.add(new a7h1("not_now_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!d330Var.equals(c330.a)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC8 = y6h1Var4.c();
                x6h1VarC8.i.add(new a7h1("send_message_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                y6h1 y6h1VarA2 = x6h1VarC8.a();
                String strG = e330Var.b;
                if (strG == null) {
                    strG = pcf.g(e330Var.a);
                }
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strG)), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            case 8:
                ((Number) obj3).intValue();
                return new t6l0((r6h1) obj4);
            case 9:
                t6l0 t6l0Var = (t6l0) obj;
                p330 p330Var = (p330) obj2;
                w330 w330Var = (w330) obj3;
                r6h1 r6h1Var3 = t6l0Var.a;
                y6h1 y6h1Var5 = t6l0Var.b;
                String str7 = p330Var.a;
                if (!((m330) obj4).equals(m330Var)) {
                    eg.o();
                    return null;
                }
                if (w330Var instanceof s330) {
                    String str8 = p330Var.a;
                    x6h1 x6h1VarC9 = y6h1Var5.c();
                    x6h1VarC9.i.add(new a7h1("follow_button", (String) null, (Integer) null, str8, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str7 != null ? str7 : "")), x6h1VarC9.a(), r6h1Var3, System.currentTimeMillis());
                } else if (w330Var instanceof t330) {
                    String str9 = p330Var.a;
                    x6h1 x6h1VarC10 = y6h1Var5.c();
                    x6h1VarC10.i.add(new a7h1("follow_button", (String) null, (Integer) null, str9, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str7 != null ? str7 : "")), x6h1VarC10.a(), r6h1Var3, System.currentTimeMillis());
                } else {
                    if (!(w330Var instanceof q330)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC11 = y6h1Var5.c();
                    x6h1VarC11.i.add(new a7h1("unban_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_hide_entity", 1, Collections.singletonMap("entity_to_remove_hide", str7 != null ? str7 : "")), x6h1VarC11.a(), r6h1Var3, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 10:
                ((Number) obj3).intValue();
                return new t6l0((r6h1) obj4);
            case 11:
                ((Number) obj3).intValue();
                return new t6l0((r6h1) obj4);
            case 12:
                t6l0 t6l0Var2 = (t6l0) obj;
                v330 v330Var = (v330) obj3;
                r6h1 r6h1Var4 = t6l0Var2.a;
                y6h1 y6h1Var6 = t6l0Var2.b;
                String str10 = ((o330) obj2).a;
                if (!((l330) obj4).equals(l330.a)) {
                    eg.o();
                    return null;
                }
                if (v330Var.equals(r330.a)) {
                    x6h1 x6h1VarC12 = y6h1Var6.c();
                    x6h1VarC12.i.add(new a7h1("follow_button", (String) null, (Integer) null, str10, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str10)), x6h1VarC12.a(), r6h1Var4, System.currentTimeMillis());
                } else {
                    if (!v330Var.equals(u330.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC13 = y6h1Var6.c();
                    x6h1VarC13.i.add(new a7h1("follow_button", (String) null, (Integer) null, str10, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str10)), x6h1VarC13.a(), r6h1Var4, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 13:
                t6l0 t6l0Var3 = (t6l0) obj;
                p330 p330Var2 = (p330) obj2;
                w330 w330Var2 = (w330) obj3;
                r6h1 r6h1Var5 = t6l0Var3.a;
                y6h1 y6h1Var7 = t6l0Var3.b;
                String str11 = p330Var2.a;
                if (!((m330) obj4).equals(m330Var)) {
                    eg.o();
                    return null;
                }
                if (w330Var2 instanceof s330) {
                    String str12 = p330Var2.a;
                    x6h1 x6h1VarC14 = y6h1Var7.c();
                    x6h1VarC14.i.add(new a7h1("follow_button", (String) null, (Integer) null, str12, (String) null));
                    x6h1VarC14.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str11 != null ? str11 : "")), x6h1VarC14.a(), r6h1Var5, System.currentTimeMillis());
                } else if (w330Var2 instanceof t330) {
                    String str13 = p330Var2.a;
                    x6h1 x6h1VarC15 = y6h1Var7.c();
                    x6h1VarC15.i.add(new a7h1("follow_button", (String) null, (Integer) null, str13, (String) null));
                    x6h1VarC15.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str11 != null ? str11 : "")), x6h1VarC15.a(), r6h1Var5, System.currentTimeMillis());
                } else {
                    if (!(w330Var2 instanceof q330)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC16 = y6h1Var7.c();
                    x6h1VarC16.i.add(new a7h1("unban_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_hide_entity", 1, Collections.singletonMap("entity_to_remove_hide", str11 != null ? str11 : "")), x6h1VarC16.a(), r6h1Var5, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 14:
                cpl0 cpl0Var = (cpl0) obj;
                r430 r430Var = (r430) obj4;
                String str14 = ((k430) obj2).a;
                if (r430Var instanceof p430) {
                    return cpl0Var.e(str14);
                }
                if (!(r430Var instanceof q430) || ((q430) r430Var).a) {
                    return null;
                }
                return cpl0Var.h(str14);
            case 15:
                cpl0 cpl0Var2 = (cpl0) obj;
                b730 b730Var = (b730) obj4;
                String str15 = ((d730) obj2).a;
                if (b730Var.equals(z630.a)) {
                    return cpl0Var2.e(str15);
                }
                if (b730Var.equals(a730.a)) {
                    return cpl0Var2.h(str15);
                }
                eg.o();
                return null;
            case 16:
                return new gql0(Integer.valueOf(((Number) obj3).intValue()), ((i830) obj).a, new mjl0(new hql0()));
            case 17:
                gql0 gql0Var = (gql0) obj;
                i830 i830Var = (i830) obj2;
                y6h1 y6h1Var8 = gql0Var.a;
                hql0 hql0Var = gql0Var.b.c;
                String str16 = i830Var.a;
                zis0 zis0Var = ((h830) obj4).a;
                if (!zis0Var.equals(yis0.b)) {
                    if (!zis0Var.equals(yis0.a)) {
                        if (zis0Var.equals(yis0.d)) {
                            return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var8, hql0Var.a, System.currentTimeMillis());
                        }
                        return null;
                    }
                    x6h1 x6h1VarC17 = y6h1Var8.c();
                    x6h1VarC17.i.add(new a7h1("context_menu", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC17.a(), hql0Var.a, System.currentTimeMillis());
                }
                if (i830Var.f) {
                    x6h1 x6h1VarC18 = y6h1Var8.c();
                    x6h1VarC18.i.add(new a7h1("follow_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str16 != null ? str16 : "")), x6h1VarC18.a(), hql0Var.a, System.currentTimeMillis());
                }
                x6h1 x6h1VarC19 = y6h1Var8.c();
                x6h1VarC19.i.add(new a7h1("follow_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC19.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str16 != null ? str16 : "")), x6h1VarC19.a(), hql0Var.a, System.currentTimeMillis());
            case 18:
                return new iql0(Integer.valueOf(((Number) obj3).intValue()), ((p830) obj).a, new mjl0(new jql0()));
            case 19:
                iql0 iql0Var = (iql0) obj;
                p830 p830Var = (p830) obj2;
                jql0 jql0Var = iql0Var.b.c;
                y6h1 y6h1Var9 = iql0Var.a;
                String str17 = p830Var.a;
                if (((o830) obj4).a.equals(yis0.b)) {
                    if (p830Var.f) {
                        x6h1 x6h1VarC20 = y6h1Var9.c();
                        x6h1VarC20.i.add(new a7h1("follow_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC20.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str17 != null ? str17 : "")), x6h1VarC20.a(), jql0Var.a, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC21 = y6h1Var9.c();
                        x6h1VarC21.i.add(new a7h1("follow_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC21.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str17 != null ? str17 : "")), x6h1VarC21.a(), jql0Var.a, System.currentTimeMillis());
                    }
                }
                return w7h1Var5;
            case 20:
                return new iql0(Integer.valueOf(((Number) obj3).intValue()), ((t830) obj).a, new mjl0(new jql0()));
            case 21:
                iql0 iql0Var2 = (iql0) obj;
                t830 t830Var = (t830) obj2;
                jql0 jql0Var2 = iql0Var2.b.c;
                y6h1 y6h1Var10 = iql0Var2.a;
                String str18 = t830Var.a;
                if (((s830) obj4).a.equals(yis0.b)) {
                    if (t830Var.f) {
                        x6h1 x6h1VarC22 = y6h1Var10.c();
                        x6h1VarC22.i.add(new a7h1("follow_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC22.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str18 != null ? str18 : "")), x6h1VarC22.a(), jql0Var2.a, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC23 = y6h1Var10.c();
                        x6h1VarC23.i.add(new a7h1("follow_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC23.j = false;
                        w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str18 != null ? str18 : "")), x6h1VarC23.a(), jql0Var2.a, System.currentTimeMillis());
                    }
                }
                return w7h1Var5;
            case 22:
                w3l0 w3l0Var = (w3l0) obj;
                if (((va30) obj4) != va30.a) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC24 = w3l0Var.a.c();
                x6h1VarC24.i.add(new a7h1("retrieval_content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC24.j = false;
                x6h1 x6h1VarC25 = x6h1VarC24.a().c();
                x6h1VarC25.i.add(new a7h1("remove_filters_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC25.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("clear_filter", 1, b7xVar), x6h1VarC25.a(), r6h1.c, System.currentTimeMillis());
            case 23:
                return new wc3((Context) obj2, (ViewGroup) obj3, (iu30) obj4);
            case 24:
                wa30 wa30Var = (wa30) obj;
                ((Number) obj3).intValue();
                xok0 xok0Var = new xok0((byte) 20);
                String str19 = wa30Var.a;
                return new l6l0(new n6l0(xok0Var, str19, Integer.valueOf(wa30Var.b)), str19);
            case 25:
                l6l0 l6l0Var = (l6l0) obj;
                cb30 cb30Var = ((wa30) obj2).c.f;
                f10 f10Var = cb30Var != null ? cb30Var.b : null;
                if (f10Var == null) {
                    return null;
                }
                if (f10Var instanceof vz) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((vz) f10Var).a)), l6l0Var.a, r6h1.c, System.currentTimeMillis());
                }
                if (f10Var instanceof iz) {
                    return l6l0Var.e();
                }
                if (f10Var instanceof m00) {
                    return l6l0Var.e();
                }
                return null;
            case 26:
                fb30 fb30Var = (fb30) obj;
                ((Number) obj3).intValue();
                return new m6l0(new n6l0(new xok0((byte) 20), fb30Var.a, Integer.valueOf(fb30Var.b)));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                m6l0 m6l0Var = (m6l0) obj;
                String str20 = ((eb30) obj4).a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str20 != null ? str20 : "")), m6l0Var.a, r6h1.c, System.currentTimeMillis());
            case 28:
                ((Number) obj3).intValue();
                return new anl0(1, ((fc30) obj2).a.b);
            default:
                o231 o231Var = (o231) obj2;
                y6h1 y6h1Var11 = ((anl0) obj).a;
                int iOrdinal = ((ec30) obj4).ordinal();
                if (iOrdinal == 0) {
                    x6h1 x6h1VarC26 = y6h1Var11.c();
                    x6h1VarC26.i.add(new a7h1("find_playlists_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC26.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:home")), x6h1VarC26.a(), r6h1.c, System.currentTimeMillis());
                }
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC27 = y6h1Var11.c();
                x6h1VarC27.i.add(new a7h1("remove_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC27.j = false;
                y6h1 y6h1VarA3 = x6h1VarC27.a();
                String str21 = o231Var.b;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("delete_playlist", 1, Collections.singletonMap("playlist_to_be_deleted", str21 != null ? str21 : "")), y6h1VarA3, r6h1.c, System.currentTimeMillis());
        }
    }
}
