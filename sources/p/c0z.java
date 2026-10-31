package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c0z extends hab0 implements zu30 {
    public static final c0z N0;
    public static final c0z O0;
    public static final c0z P0;
    public static final c0z Q0;
    public static final c0z R0;
    public static final c0z S0;
    public static final c0z T0;
    public static final c0z U0;
    public static final c0z V0;
    public static final c0z W0;
    public static final c0z X;
    public static final c0z X0;
    public static final c0z Y;
    public static final c0z Y0;
    public static final c0z Z;
    public static final c0z Z0;
    public static final c0z a1;
    public static final c0z b;
    public static final c0z b1;
    public static final c0z c;
    public static final c0z c1;
    public static final c0z d;
    public static final c0z d1;
    public static final c0z e;
    public static final c0z e1;
    public static final c0z f;
    public static final c0z g;
    public static final c0z h;
    public static final c0z i;
    public static final c0z t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new c0z(i2, (byte) 0);
        c = new c0z(i2, (byte) 1);
        d = new c0z(i2, (byte) 2);
        e = new c0z(i2, (byte) 3);
        f = new c0z(i2, (byte) 4);
        g = new c0z(i2, (byte) 5);
        h = new c0z(i2, (byte) 6);
        i = new c0z(i2, (byte) 7);
        t = new c0z(i2, (byte) 8);
        X = new c0z(i2, (byte) 9);
        Y = new c0z(i2, (byte) 10);
        Z = new c0z(i2, (byte) 11);
        N0 = new c0z(i2, (byte) 12);
        O0 = new c0z(i2, (byte) 13);
        P0 = new c0z(i2, (byte) 14);
        Q0 = new c0z(i2, (byte) 15);
        R0 = new c0z(i2, (byte) 16);
        S0 = new c0z(i2, (byte) 17);
        T0 = new c0z(i2, (byte) 18);
        U0 = new c0z(i2, (byte) 19);
        V0 = new c0z(i2, (byte) 20);
        W0 = new c0z(i2, (byte) 21);
        X0 = new c0z(i2, (byte) 22);
        Y0 = new c0z(i2, (byte) 23);
        Z0 = new c0z(i2, (byte) 24);
        a1 = new c0z(i2, (byte) 25);
        b1 = new c0z(i2, (byte) 26);
        c1 = new c0z(i2, (byte) 27);
        d1 = new c0z(i2, (byte) 28);
        e1 = new c0z(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0z(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        int i2;
        w7h1 w7h1Var5;
        w7h1 w7h1Var6;
        byte b2 = this.a;
        k2z k2zVar = k2z.a;
        l2z l2zVar = l2z.a;
        j2z j2zVar = j2z.a;
        wfz wfzVar = wfz.a;
        mjz mjzVar = mjz.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                a0z a0zVar = (a0z) obj4;
                return yz10.f(a0zVar.b, a0zVar.a, a0zVar.c);
            case 1:
                bwl0 bwl0Var = (bwl0) obj;
                p2z p2zVar = (p2z) obj3;
                n2z n2zVar = (n2z) obj4;
                y6h1 y6h1Var = bwl0Var.a;
                String str = ((o2z) obj2).a;
                if (o0c.F(p2zVar.i, p2zVar.n, p2zVar.o) || p2zVar.s) {
                    return bwl0Var.i();
                }
                if (n2zVar instanceof m2z) {
                    return bwl0Var.a(str);
                }
                if (n2zVar.equals(j2zVar)) {
                    qgl0 qgl0Var = new qgl0(bwl0Var);
                    return p2zVar.q ? qgl0Var.r() : qgl0Var.l(str);
                }
                if (n2zVar.equals(l2zVar)) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("description_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    w7h1Var = p2zVar.r ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!n2zVar.equals(k2zVar)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 2:
                wvl0 wvl0Var = (wvl0) obj;
                p2z p2zVar2 = (p2z) obj3;
                n2z n2zVar2 = (n2z) obj4;
                y6h1 y6h1Var2 = wvl0Var.a;
                String str2 = ((o2z) obj2).a;
                if (o0c.F(p2zVar2.i, p2zVar2.n, p2zVar2.o) || p2zVar2.s) {
                    return wvl0Var.i();
                }
                if (n2zVar2 instanceof m2z) {
                    return wvl0Var.a(str2);
                }
                if (n2zVar2.equals(j2zVar)) {
                    qgl0 qgl0Var2 = new qgl0(wvl0Var);
                    return p2zVar2.q ? qgl0Var2.r() : qgl0Var2.l(str2);
                }
                if (n2zVar2.equals(l2zVar)) {
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("description_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    w7h1Var2 = p2zVar2.r ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!n2zVar2.equals(k2zVar)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 3:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                int iR = qon1.r((n4z) obj2);
                if (iR != 0) {
                    return new j9l0(iR, r6h1Var);
                }
                eg.m("Required value was null.");
                return null;
            case 4:
                j9l0 j9l0Var = (j9l0) obj;
                h4z h4zVar = (h4z) obj4;
                r6h1 r6h1Var2 = j9l0Var.a;
                y6h1 y6h1Var3 = j9l0Var.b;
                if (h4zVar.equals(g4z.a)) {
                    x6h1 x6h1VarC5 = y6h1Var3.c();
                    x6h1VarC5.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC5.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!h4zVar.equals(f4z.a)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC6 = y6h1Var3.c();
                    x6h1VarC6.i.add(new a7h1("get_credits_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC6.a();
                    String str3 = nik1.V2.a;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA3, r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 5:
                return new u4z((mdz) obj, (xkk1) obj3, (jo70) obj2, (zoy0) obj4);
            case 6:
                ((Number) obj3).intValue();
                return new d6l0(new wqk0(((iwh) obj).a, (r6h1) obj4, (byte) 9));
            case 7:
                d6l0 d6l0Var = (d6l0) obj;
                gwh gwhVar = (hwh) obj4;
                if ((gwhVar instanceof gwh) && gwhVar.a) {
                    return new w7h1("", "", new z7h1("scroll", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), d6l0Var.a, d6l0Var.b.b, System.currentTimeMillis());
                }
                return null;
            case 8:
                mpl0 mpl0Var = (mpl0) obj;
                s7z s7zVar = (s7z) obj3;
                q7z q7zVar = (q7z) obj4;
                r6h1 r6h1Var3 = mpl0Var.a;
                y6h1 y6h1Var4 = mpl0Var.b;
                String str4 = s7zVar.a.b;
                if (q7zVar.equals(o7z.a)) {
                    w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("pause", 1, Collections.singletonMap("item_to_be_paused", str4 != null ? str4 : "")), y6h1Var4, r6h1Var3, System.currentTimeMillis());
                } else {
                    if (!(q7zVar instanceof p7z)) {
                        eg.o();
                        return null;
                    }
                    zqt0 zqt0Var = s7zVar.b;
                    if ((zqt0Var instanceof zqt0) && zqt0Var.c == 2) {
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("show_paywall", 1, Collections.singletonMap("paywalled_item", str4 != null ? str4 : "")), y6h1Var4, r6h1Var3, System.currentTimeMillis());
                    } else {
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str4 != null ? str4 : "")), y6h1Var4, r6h1Var3, System.currentTimeMillis());
                    }
                }
                return w7h1Var4;
            case 9:
                jvl0 jvl0Var = (jvl0) obj;
                iaz iazVar = (iaz) obj3;
                faz fazVar = (faz) obj4;
                String str5 = ((haz) obj2).a;
                if (fazVar instanceof eaz) {
                    return (o0c.F(iazVar.h, iazVar.i, iazVar.j) || iazVar.q) ? jvl0Var.j() : jvl0Var.a(str5);
                }
                if (fazVar.equals(daz.a)) {
                    qgl0 qgl0Var3 = new qgl0(jvl0Var);
                    return iazVar.n ? qgl0Var3.r() : qgl0Var3.l(str5);
                }
                eg.o();
                return null;
            case 10:
                svl0 svl0Var = (p8h1) obj;
                if (((wfz) obj4) != wfzVar) {
                    eg.o();
                    return null;
                }
                if (svl0Var instanceof svl0) {
                    return svl0Var.h();
                }
                if (svl0Var instanceof hwl0) {
                    return ((hwl0) svl0Var).h();
                }
                if (svl0Var instanceof hvl0) {
                    return ((hvl0) svl0Var).h();
                }
                if (svl0Var instanceof mvl0) {
                    return ((mvl0) svl0Var).h();
                }
                return null;
            case 11:
                svl0 svl0Var2 = (p8h1) obj;
                if (((wfz) obj4) != wfzVar) {
                    eg.o();
                    return null;
                }
                if (svl0Var2 instanceof svl0) {
                    return svl0Var2.h();
                }
                if (svl0Var2 instanceof hwl0) {
                    return ((hwl0) svl0Var2).h();
                }
                if (svl0Var2 instanceof hvl0) {
                    return ((hvl0) svl0Var2).h();
                }
                if (svl0Var2 instanceof mvl0) {
                    return ((mvl0) svl0Var2).h();
                }
                return null;
            case 12:
                ((Number) obj3).intValue();
                return new ofl0((r6h1) obj4);
            case 13:
                ((Number) obj3).intValue();
                return new q5l0((r6h1) obj4);
            case 14:
                ofl0 ofl0Var = (ofl0) obj;
                chz chzVar = (chz) obj4;
                if (chzVar.equals(bhz.a)) {
                    x6h1 x6h1VarC7 = ofl0Var.b.c();
                    x6h1VarC7.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC7.a(), ofl0Var.a, System.currentTimeMillis());
                }
                if (chzVar.equals(zgz.a)) {
                    return null;
                }
                eg.o();
                return null;
            case 15:
                return null;
            case 16:
                ((Number) obj3).intValue();
                int iC = l1d.C(((diz) obj2).b);
                if (iC == 0) {
                    i2 = 2;
                } else if (iC == 1) {
                    i2 = 3;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i2 = 4;
                }
                return new ikl0(i2);
            case 17:
                return null;
            case 18:
                ((Number) obj3).intValue();
                return new j8l0(new h7l0((byte) 13));
            case 19:
                j8l0 j8l0Var = (j8l0) obj;
                if (!((mjz) obj4).equals(mjzVar)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC8 = j8l0Var.a.c();
                x6h1VarC8.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
            case 20:
                s8l0 s8l0Var = (s8l0) obj;
                if (!((mjz) obj4).equals(mjzVar)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC9 = s8l0Var.a.c();
                x6h1VarC9.i.add(new a7h1("retry_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC9.a(), s8l0Var.b.b, System.currentTimeMillis());
            case 21:
                f4m0 f4m0Var = (f4m0) obj;
                if (((njz) obj4).equals(njz.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), f4m0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 22:
                le00 le00Var = (le00) obj;
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var4 = (r6h1) obj4;
                Integer num = le00Var.d;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                return new syl0(Integer.valueOf(iIntValue), le00Var.c, "", r6h1Var4);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if (obj4 != null) {
                    bhn0.d();
                }
                return null;
            case 24:
                ((Number) obj3).intValue();
                return new gsl0((r6h1) obj4);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                gsl0 gsl0Var = (gsl0) obj;
                zm00 zm00Var = (zm00) obj4;
                r6h1 r6h1Var5 = gsl0Var.a;
                y6h1 y6h1Var5 = gsl0Var.b;
                if (zm00Var instanceof xm00) {
                    x6h1 x6h1VarC10 = y6h1Var5.c();
                    x6h1VarC10.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC10.a(), r6h1Var5, System.currentTimeMillis());
                } else {
                    if (!(zm00Var instanceof ym00)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC11 = y6h1Var5.c();
                    x6h1VarC11.i.add(new a7h1("exit_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC11.a(), r6h1Var5, System.currentTimeMillis());
                }
                return w7h1Var5;
            case 26:
                ((Number) obj3).intValue();
                return new c7l0(new xok0((byte) 22));
            case 27:
                gn00 gn00Var = (gn00) obj4;
                y6h1 y6h1Var6 = ((c7l0) obj).a;
                if (gn00Var instanceof fn00) {
                    x6h1 x6h1VarC12 = y6h1Var6.c();
                    x6h1VarC12.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis());
                } else if (gn00Var instanceof en00) {
                    x6h1 x6h1VarC13 = y6h1Var6.c();
                    x6h1VarC13.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(gn00Var instanceof dn00)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC14 = y6h1Var6.c();
                    x6h1VarC14.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    w7h1Var6 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var6;
            case 28:
                ((Number) obj3).intValue();
                return new hil0((r6h1) obj4);
            default:
                hil0 hil0Var = (hil0) obj;
                vp00 vp00Var = (vp00) obj4;
                if (vp00Var.equals(up00.a)) {
                    String str6 = nik1.p1.a;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), hil0Var.b, hil0Var.a, System.currentTimeMillis());
                }
                if (vp00Var.equals(tp00.a)) {
                    return hil0Var.e();
                }
                eg.o();
                return null;
        }
    }
}
