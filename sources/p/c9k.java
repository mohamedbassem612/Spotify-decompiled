package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c9k extends hab0 implements zu30 {
    public static final c9k N0;
    public static final c9k O0;
    public static final c9k P0;
    public static final c9k Q0;
    public static final c9k R0;
    public static final c9k S0;
    public static final c9k T0;
    public static final c9k U0;
    public static final c9k V0;
    public static final c9k W0;
    public static final c9k X;
    public static final c9k X0;
    public static final c9k Y;
    public static final c9k Y0;
    public static final c9k Z;
    public static final c9k Z0;
    public static final c9k a1;
    public static final c9k b;
    public static final c9k b1;
    public static final c9k c;
    public static final c9k c1;
    public static final c9k d;
    public static final c9k d1;
    public static final c9k e;
    public static final c9k e1;
    public static final c9k f;
    public static final c9k g;
    public static final c9k h;
    public static final c9k i;
    public static final c9k t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new c9k(i2, (byte) 0);
        c = new c9k(i2, (byte) 1);
        d = new c9k(i2, (byte) 2);
        e = new c9k(i2, (byte) 3);
        f = new c9k(i2, (byte) 4);
        g = new c9k(i2, (byte) 5);
        h = new c9k(i2, (byte) 6);
        i = new c9k(i2, (byte) 7);
        t = new c9k(i2, (byte) 8);
        X = new c9k(i2, (byte) 9);
        Y = new c9k(i2, (byte) 10);
        Z = new c9k(i2, (byte) 11);
        N0 = new c9k(i2, (byte) 12);
        O0 = new c9k(i2, (byte) 13);
        P0 = new c9k(i2, (byte) 14);
        Q0 = new c9k(i2, (byte) 15);
        R0 = new c9k(i2, (byte) 16);
        S0 = new c9k(i2, (byte) 17);
        T0 = new c9k(i2, (byte) 18);
        U0 = new c9k(i2, (byte) 19);
        V0 = new c9k(i2, (byte) 20);
        W0 = new c9k(i2, (byte) 21);
        X0 = new c9k(i2, (byte) 22);
        Y0 = new c9k(i2, (byte) 23);
        Z0 = new c9k(i2, (byte) 24);
        a1 = new c9k(i2, (byte) 25);
        b1 = new c9k(i2, (byte) 26);
        c1 = new c9k(i2, (byte) 27);
        d1 = new c9k(i2, (byte) 28);
        e1 = new c9k(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9k(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        int i2;
        w7h1 w7h1Var4;
        int i3;
        Object obj5;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                a9k a9kVar = (a9k) obj2;
                ((Number) obj3).intValue();
                return new pxk0(e9k.o(a9kVar), a9kVar.a, (r6h1) obj4);
            case 1:
                pxk0 pxk0Var = (pxk0) obj;
                a9k a9kVar2 = (a9k) obj3;
                z8k z8kVar = (z8k) obj4;
                r6h1 r6h1Var = pxk0Var.a;
                y6h1 y6h1Var = pxk0Var.b;
                String str = a9kVar2.a;
                if (z8kVar.equals(m8k.a)) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("join_waitlist_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str != null ? str : "")), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                } else if (z8kVar.equals(t8k.a)) {
                    if (a9kVar2.l) {
                        x6h1 x6h1VarC3 = y6h1Var.c();
                        x6h1VarC3.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                        x6h1VarC4.i.add(new a7h1("remind_me_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str != null ? str : "")), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC5 = y6h1Var.c();
                        x6h1VarC5.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                        x6h1VarC6.i.add(new a7h1("remind_me_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str != null ? str : "")), x6h1VarC6.a(), r6h1Var, System.currentTimeMillis());
                    }
                } else if (z8kVar.equals(p8k.a)) {
                    x6h1 x6h1VarC7 = y6h1Var.c();
                    x6h1VarC7.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("not_interested_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", str != null ? str : "")), x6h1VarC8.a(), r6h1Var, System.currentTimeMillis());
                } else if (z8kVar.equals(x8k.a)) {
                    x6h1 x6h1VarC9 = y6h1Var.c();
                    x6h1VarC9.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                    x6h1VarC10.i.add(new a7h1("cant_attend_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), r6h1Var, System.currentTimeMillis());
                } else if (z8kVar.equals(h8k.a)) {
                    x6h1 x6h1VarC11 = y6h1Var.c();
                    x6h1VarC11.i.add(new a7h1("cant_attend_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", str != null ? str : "")), x6h1VarC11.a(), r6h1Var, System.currentTimeMillis());
                } else if (z8kVar.equals(k8k.a)) {
                    x6h1 x6h1VarC12 = y6h1Var.c();
                    x6h1VarC12.i.add(new a7h1("cant_attend_confirmation_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC12.a(), r6h1Var, System.currentTimeMillis());
                } else if (z8kVar instanceof g8k) {
                    x6h1 x6h1VarC13 = y6h1Var.c();
                    x6h1VarC13.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                    x6h1VarC14.i.add(new a7h1("buy_tickets_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", ((g8k) z8kVar).a)), x6h1VarC14.a(), r6h1Var, System.currentTimeMillis());
                } else if (z8kVar instanceof y8k) {
                    x6h1 x6h1VarC15 = y6h1Var.c();
                    x6h1VarC15.i.add(new a7h1("button_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    x6h1 x6h1VarC16 = x6h1VarC15.a().c();
                    x6h1VarC16.i.add(new a7h1("see_all_events_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    y6h1 y6h1VarA = x6h1VarC16.a();
                    String str2 = ((y8k) z8kVar).a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA, r6h1Var, System.currentTimeMillis());
                } else {
                    if (!(z8kVar instanceof w8k)) {
                        if (!(z8kVar instanceof r8k) && !(z8kVar instanceof j8k) && !(z8kVar instanceof i8k) && !(z8kVar instanceof n8k) && !(z8kVar instanceof o8k) && !(z8kVar instanceof q8k) && !(z8kVar instanceof u8k) && !(z8kVar instanceof l8k) && !(z8kVar instanceof v8k) && !(z8kVar instanceof s8k)) {
                            eg.o();
                        }
                        return null;
                    }
                    x6h1 x6h1VarC17 = y6h1Var.c();
                    x6h1VarC17.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC17.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                ((Number) obj3).intValue();
                return new qxk0(new bqk0(((nbk) obj).a, (byte) 29));
            case 3:
                qxk0 qxk0Var = (qxk0) obj;
                obk obkVar = (obk) obj3;
                kbk kbkVar = (mbk) obj4;
                String str3 = ((nbk) obj2).a;
                if (!kbkVar.equals(jbk.a)) {
                    if (kbkVar.equals(hbk.a)) {
                        r6h1 r6h1VarB = qxk0Var.b();
                        y6h1 y6h1Var2 = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-close-button";
                        x6h1VarI.f = "1.0.0";
                        x6h1VarI.g = "22.0.0";
                        y6h1 y6h1VarA2 = x6h1VarI.a();
                        p7h.M(new String[]{"song-dna", "artists-dna", "blend-dna"});
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA2, r6h1VarB, System.currentTimeMillis());
                    } else if (kbkVar.equals(lbk.a)) {
                        r6h1 r6h1VarB2 = qxk0Var.b();
                        y6h1 y6h1Var3 = y6h1.i;
                        x6h1 x6h1VarI2 = i3o1.i();
                        x6h1VarI2.h = "music";
                        x6h1VarI2.a = "mobile-share-button";
                        x6h1VarI2.f = "1.0.0";
                        x6h1VarI2.g = "22.0.0";
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), x6h1VarI2.a(), r6h1VarB2, System.currentTimeMillis());
                    } else if (kbkVar.equals(ibk.a)) {
                        r6h1 r6h1VarB3 = qxk0Var.b();
                        y6h1 y6h1Var4 = y6h1.i;
                        x6h1 x6h1VarI3 = i3o1.i();
                        x6h1VarI3.h = "music";
                        x6h1VarI3.a = "mobile-context-menu-button";
                        x6h1VarI3.f = "2.0.0";
                        x6h1VarI3.g = "22.0.0";
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarI3.a(), r6h1VarB3, System.currentTimeMillis());
                    } else {
                        if (kbkVar instanceof kbk) {
                            jpk0 jpk0Var = new jpk0(new k4l0(qxk0Var.b()), str3);
                            return kbkVar.a ? jpk0Var.p(str3) : jpk0Var.n(str3);
                        }
                        eg.o();
                    }
                    return w7h1Var2;
                }
                if (obkVar.i) {
                    x6h1 x6h1VarC18 = qxk0Var.a.c();
                    x6h1VarC18.i.add(new a7h1("reserved_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = true;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis());
                }
                return null;
            case 4:
                lxk0 lxk0Var = (lxk0) obj;
                hdk hdkVar = (jdk) obj3;
                ddk ddkVar = (ddk) obj4;
                r6h1 r6h1Var2 = lxk0Var.a;
                y6h1 y6h1Var5 = lxk0Var.b;
                String str4 = ((udk) obj2).a;
                if (ddkVar.equals(yck.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), lxk0Var.b, lxk0Var.a, System.currentTimeMillis());
                }
                if (ddkVar instanceof zck) {
                    int iOrdinal = ((zck) ddkVar).a.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        x6h1 x6h1VarC19 = y6h1Var5.c();
                        x6h1VarC19.i.add(new a7h1("see_tickets_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC19.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4)), x6h1VarC19.a(), r6h1Var2, System.currentTimeMillis());
                    } else {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                if (iOrdinal != 4) {
                                    if (iOrdinal != 5) {
                                        eg.o();
                                    }
                                }
                                x6h1 x6h1VarC110 = y6h1Var5.c();
                                x6h1VarC110.i.add(new a7h1("see_tickets_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC110.j = false;
                                w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4)), x6h1VarC110.a(), r6h1Var2, System.currentTimeMillis());
                            }
                            return null;
                        }
                        x6h1 x6h1VarC20 = y6h1Var5.c();
                        x6h1VarC20.i.add(new a7h1("join_waitlist_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC20.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str4)), x6h1VarC20.a(), r6h1Var2, System.currentTimeMillis());
                    }
                    return w7h1Var3;
                }
                if (ddkVar.equals(bdk.a)) {
                    x6h1 x6h1VarC21 = y6h1Var5.c();
                    x6h1VarC21.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC21.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC21.a(), r6h1Var2, System.currentTimeMillis());
                } else if (ddkVar.equals(cdk.a)) {
                    x6h1 x6h1VarC22 = y6h1Var5.c();
                    x6h1VarC22.i.add(new a7h1("share_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC22.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC22.a();
                    String strU = sok.u(hdkVar);
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", strU != null ? strU : ""), new mmr0("share_id", "share-campaign-promo-card")})), y6h1VarA3, r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!ddkVar.equals(adk.a)) {
                        eg.o();
                        return null;
                    }
                    if ((hdkVar instanceof hdk) && hdkVar.v) {
                        x6h1 x6h1VarC23 = y6h1Var5.c();
                        x6h1VarC23.i.add(new a7h1("expand_toggle_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC23.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC23.a(), r6h1Var2, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC24 = y6h1Var5.c();
                        x6h1VarC24.i.add(new a7h1("expand_toggle_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC24.j = false;
                        w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC24.a(), r6h1Var2, System.currentTimeMillis());
                    }
                }
                return w7h1Var3;
            case 5:
                return ((uvl0) obj).a(((bek) obj2).a);
            case 6:
                return new nek((j6k) obj, (lhe0) obj2, (jo70) obj3, (xkk1) obj4);
            case 7:
                tek tekVar = (tek) obj;
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                String str5 = tekVar.a;
                int iC = l1d.C(tekVar.b);
                if (iC == 0) {
                    i2 = 2;
                } else if (iC == 1) {
                    i2 = 3;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i2 = 1;
                }
                String str6 = tekVar.d;
                if (str6 == null) {
                    return new jdl0(i2, Integer.valueOf(iIntValue), str5, r6h1Var3);
                }
                Integer num = tekVar.e;
                y6h1 y6h1Var6 = y6h1.i;
                x6h1 x6h1VarI4 = i3o1.i();
                x6h1VarI4.h = "music";
                x6h1VarI4.a = "mobile-shelf-section";
                x6h1VarI4.f = "6.0.0";
                x6h1VarI4.g = "22.0.0";
                x6h1VarI4.b = str6;
                x6h1VarI4.c = num;
                x6h1VarI4.e = null;
                y6h1 y6h1VarA4 = x6h1VarI4.a();
                Integer num2 = tekVar.f;
                r6h1 r6h1Var4 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var3.a);
                arrayList.add(y6h1VarA4);
                return new jdl0(i2, num2, str5, new r6h1(arrayList, r6h1Var3.b));
            case 8:
                jdl0 jdl0Var = (jdl0) obj;
                uek uekVar = (uek) obj3;
                rek rekVar = (rek) obj4;
                y6h1 y6h1Var7 = jdl0Var.b;
                String str7 = uekVar.a;
                if (rekVar.equals(oek.a)) {
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7 != null ? str7 : "")), y6h1Var7, jdl0Var.a, System.currentTimeMillis());
                } else if (rekVar.equals(pek.a)) {
                    if (uekVar.h) {
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str7 != null ? str7 : "")), y6h1Var7, jdl0Var.a, System.currentTimeMillis());
                    } else {
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str7 != null ? str7 : "")), y6h1Var7, jdl0Var.a, System.currentTimeMillis());
                    }
                } else {
                    if (!rekVar.equals(qek.a)) {
                        eg.o();
                        return null;
                    }
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var7, jdl0Var.a, System.currentTimeMillis());
                }
                return w7h1Var4;
            case 9:
                return new uyl0(Integer.valueOf(((Number) obj3).intValue()), "concert_carousel", "unranked", (r6h1) obj4);
            case 10:
                return null;
            case 11:
                return ((bwl0) obj).a(((efk) obj2).a);
            case 12:
                return ((wvl0) obj).a(((efk) obj2).a);
            case 13:
                return new nxk0(Integer.valueOf(((Number) obj3).intValue()), ((ngk) obj).a, (r6h1) obj4);
            case 14:
                nxk0 nxk0Var = (nxk0) obj;
                ogk ogkVar = (ogk) obj3;
                lgk lgkVar = (lgk) obj4;
                String str8 = ogkVar.e;
                if (lgkVar.equals(jgk.a)) {
                    return nxk0Var.a(str8);
                }
                if (lgkVar.equals(kgk.a)) {
                    return ogkVar.d ? nxk0Var.i(str8) : nxk0Var.h(str8);
                }
                eg.o();
                return null;
            case 15:
                mxk0 mxk0Var = (mxk0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ((hqk) obj3).a)), mxk0Var.b, mxk0Var.a, System.currentTimeMillis());
            case 16:
                return new oqk((j6k) obj, (jo70) obj3, (lhe0) obj2, (xkk1) obj4, false);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                vqk vqkVar = (vqk) obj;
                int iIntValue2 = ((Number) obj3).intValue();
                r6h1 r6h1Var5 = (r6h1) obj4;
                String str9 = vqkVar.a;
                String str10 = vqkVar.l;
                if (str10 == null) {
                    return new nxk0(Integer.valueOf(iIntValue2), str9, r6h1Var5);
                }
                Integer num3 = vqkVar.m;
                y6h1 y6h1Var8 = y6h1.i;
                x6h1 x6h1VarI5 = i3o1.i();
                x6h1VarI5.h = "music";
                x6h1VarI5.a = "mobile-shelf-section";
                x6h1VarI5.f = "6.0.0";
                x6h1VarI5.g = "22.0.0";
                x6h1VarI5.b = str10;
                x6h1VarI5.c = num3;
                x6h1VarI5.e = null;
                y6h1 y6h1VarA5 = x6h1VarI5.a();
                Integer num4 = vqkVar.n;
                r6h1 r6h1Var6 = r6h1.c;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var5.a);
                arrayList2.add(y6h1VarA5);
                return new nxk0(num4, str9, new r6h1(arrayList2, r6h1Var5.b));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                nxk0 nxk0Var2 = (nxk0) obj;
                pqk pqkVar = (pqk) obj3;
                nqk nqkVar = (nqk) obj4;
                String str11 = pqkVar.a;
                if (nqkVar.equals(lqk.a)) {
                    return nxk0Var2.a(str11);
                }
                if (nqkVar.equals(mqk.a)) {
                    return pqkVar.h ? nxk0Var2.i(str11) : nxk0Var2.h(str11);
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new uyl0(Integer.valueOf(((Number) obj3).intValue()), ((krk) obj).a, "", (r6h1) obj4);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new uyl0(Integer.valueOf(((Number) obj3).intValue()), ((krk) obj).a, "", (r6h1) obj4);
            case 22:
                return null;
            case 23:
                ((Number) obj3).intValue();
                return new ull0(new mjl0(new fjl0((r6h1) obj4, (byte) 4)), ((trk) obj).e);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ull0 ull0Var = (ull0) obj;
                trk trkVar = (trk) obj2;
                srk srkVar = (srk) obj4;
                if (srkVar.equals(srk.a) || srkVar.equals(srk.b)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", trkVar.e)), ull0Var.a, ull0Var.b.c.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 25:
                ((Number) obj3).intValue();
                return new yql0(1, (r6h1) obj4);
            case 26:
                yql0 yql0Var = (yql0) obj;
                if (((k1l) obj4).equals(k1l.a)) {
                    return yql0Var.a(m1l.a);
                }
                eg.o();
                return null;
            case 27:
                ((Number) obj3).intValue();
                return new tfl0((r6h1) obj4);
            case 28:
                r6h1 r6h1Var7 = (r6h1) obj4;
                Integer numValueOf = Integer.valueOf(((Number) obj3).intValue());
                kdl kdlVar = ((hdl) obj).a;
                String str12 = kdlVar.a;
                cdl cdlVar = kdlVar.f;
                if (cdlVar.equals(zcl.a)) {
                    i3 = 1;
                } else if (cdlVar.equals(adl.a)) {
                    i3 = 2;
                } else {
                    if (!(cdlVar instanceof bdl)) {
                        eg.o();
                        return null;
                    }
                    i3 = 3;
                }
                return new g9l0(i3, numValueOf, str12, r6h1Var7);
            default:
                g9l0 g9l0Var = (g9l0) obj;
                hdl hdlVar = (hdl) obj3;
                fdl fdlVar = (gdl) obj4;
                if (fdlVar.equals(ddl.a) || fdlVar.equals(edl.a)) {
                    return g9l0Var.h();
                }
                if (!(fdlVar instanceof fdl)) {
                    eg.o();
                    return null;
                }
                char c2 = hdlVar.a.f.a ? (char) 2 : (char) 1;
                char c3 = fdlVar.a ? (char) 2 : (char) 1;
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                String str13 = "not_selected";
                if (c2 == 1) {
                    obj5 = "not_selected";
                } else {
                    if (c2 != 2) {
                        throw null;
                    }
                    obj5 = "selected";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj5);
                if (c3 != 1) {
                    if (c3 != 2) {
                        throw null;
                    }
                    str13 = "selected";
                }
                return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str13)})), g9l0Var.b, g9l0Var.a, System.currentTimeMillis());
        }
    }
}
