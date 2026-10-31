package p;

import com.spotify.messages.UbiProd1ImpressionNonAuth;
import com.spotify.messages.UbiProd1Interaction;
import com.spotify.messages.UbiProd1InteractionNonAuth;
import com.spotify.messages.e;
import com.spotify.messages.f;
import com.spotify.messages.g;
import com.spotify.messages.h;
import com.spotify.messages.i;
import com.spotify.messages.j;
import com.spotify.messages.k;
import com.spotify.messages.l;
import com.spotify.messages.m;
import com.spotify.messages.n;
import com.spotify.messages.o;
import com.spotify.messages.p;
import com.spotify.messages.q;
import com.spotify.messages.r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k8h1 implements i8h1 {
    public final t2j0 a;
    public final v6h1 b;
    public final t380 c;
    public final m8h1 d;
    public final yqg e;
    public final rj41 f;
    public final boolean g;

    public k8h1(t2j0 t2j0Var, v6h1 v6h1Var, t380 t380Var, s7h1 s7h1Var, m8h1 m8h1Var, yqg yqgVar, rj41 rj41Var, boolean z) {
        this.a = t2j0Var;
        this.b = v6h1Var;
        this.c = t380Var;
        this.d = m8h1Var;
        this.e = yqgVar;
        this.f = rj41Var;
        this.g = z;
    }

    public static u6h1 a(u6h1 u6h1Var, a8r0 a8r0Var) {
        y6r0 y6r0Var = a8r0Var.a;
        String str = a8r0Var.b;
        if (str == null) {
            str = "";
        }
        return u6h1.a(u6h1Var, y6r0Var, a8r0Var.c, str, 489);
    }

    public static g6h1 b(ou80 ou80Var, y6r0 y6r0Var, w7h1 w7h1Var) {
        r6h1 r6h1Var = r6h1.c;
        dlg1 dlg1VarS = b3o1.s();
        dlg1VarS.C(w7h1Var.c.c());
        dlg1VarS.s(w7h1Var.c.b());
        r6h1 r6h1VarF = dlg1VarS.f();
        f6h1 f6h1Var = g6h1.Companion;
        d8h1 d8h1Var = new d8h1(ou80Var, y6r0Var, r6h1VarF);
        f6h1Var.getClass();
        return new g6h1(k4p1.x(d8h1Var), null);
    }

    public static String k(r6h1 r6h1Var) {
        String str;
        Iterator it = r6h1Var.a.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            String str2 = ((y6h1) it.next()).h.a;
            if (str2.length() > 0) {
                str = str2;
            }
        } while (str == null);
        return str;
    }

    public static String l(w7h1 w7h1Var, g6h1 g6h1Var) {
        String strK;
        Iterator it = g6h1Var.a.iterator();
        do {
            if (!it.hasNext()) {
                strK = null;
                break;
            }
            strK = k(((d8h1) it.next()).a());
        } while (strK == null);
        if (strK != null) {
            return strK;
        }
        String strK2 = k(w7h1Var.c.c());
        if (strK2 != null) {
            return strK2;
        }
        String str = w7h1Var.c.b().h.a;
        if (str.length() > 0) {
            return str;
        }
        return null;
    }

    public final r480 c(l7h1 l7h1Var, String str, y6r0 y6r0Var, String str2, String str3, String str4, String str5, String str6, Set set, String str7, Integer num, g6h1 g6h1Var) {
        String str8 = y6r0Var != null ? y6r0Var.a : null;
        if (str8 == null) {
            str8 = "";
        }
        this.a.a(b7h1.c(l7h1Var, str, str8, str2, str3, str4, str5, str6, set != null ? f0o1.u(set) : null, str7, num, g6h1Var, 768));
        return new r480(new p480(str), y6r0Var);
    }

    public final tv80 d(w7h1 w7h1Var, String str, y6r0 y6r0Var, String str2, String str3, String str4, String str5, String str6, Set set, Integer num, String str7, Integer num2, g6h1 g6h1Var) {
        long jB = this.e.b();
        ou80 ou80Var = new ou80(str);
        long j = w7h1Var.a;
        String strL = l(w7h1Var, g6h1Var);
        z6h1 z6h1Var = w7h1Var.c;
        String str8 = z6h1Var.b().h.a;
        g6h1 g6h1VarB = b(ou80Var, y6r0Var, w7h1Var);
        y7h1 y7h1Var = w7h1Var.d;
        tv80 tv80Var = new tv80(ou80Var, y6r0Var, true, j, jB, num, g6h1VarB, str2, strL, str8, y7h1Var.c().b(), y7h1Var.c().d());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((uv80) it.next()).b(this.f, w7h1Var, tv80Var);
        }
        String str9 = y6r0Var != null ? y6r0Var.a : null;
        if (str9 == null) {
            str9 = "";
        }
        LinkedHashMap linkedHashMapU = set != null ? f0o1.u(set) : null;
        i iVarE = UbiProd1Interaction.E();
        iVarE.Z(str5);
        iVarE.R(str);
        iVarE.c0(z6h1Var.b().a);
        iVarE.Q(z6h1Var.b().b);
        iVarE.M(z6h1Var.b().c);
        iVarE.S(y7h1Var.c().b());
        iVarE.T(y7h1Var.c().d());
        iVarE.H(y7h1Var.a().b());
        iVarE.I(y7h1Var.a().d());
        iVarE.a0(str3);
        z6h1Var.b().getClass();
        iVarE.b0();
        iVarE.L(z6h1Var.b().f);
        iVarE.K(z6h1Var.b().g);
        iVarE.P(str6);
        if (str4.length() > 0) {
            iVarE.Y(str4);
        }
        if (linkedHashMapU != null) {
            iVarE.F(linkedHashMapU);
        }
        mla1 mla1VarA = g6h1Var.a();
        if (mla1VarA != null) {
            if (mla1VarA instanceof kla1) {
                mla1VarA = null;
            }
            if (mla1VarA != null) {
                iVarE.G(b7h1.b(mla1VarA));
            }
        }
        iVarE.W(str9);
        if (str2 != null) {
            iVarE.U(str2);
        }
        ltf1 ltf1Var = e8h1.a;
        u8h1 u8h1Var = z6h1Var.a().b;
        String strC = e8h1.c(u8h1Var != null ? u8h1Var.a().a() : null);
        if (strC != null) {
            iVarE.V(strC);
        }
        if (num != null) {
            iVarE.X(num.intValue());
        }
        iVarE.N(str7);
        if (num2 != null) {
            iVarE.O(num2.intValue());
        }
        for (a7h1 a7h1Var : z6h1Var.b().d) {
            iVarE.s(a7h1Var.a);
            iVarE.r(b7h1.a(a7h1Var.b));
            iVarE.v(b7h1.a(a7h1Var.c));
            iVarE.u(b7h1.a(a7h1Var.e));
            iVarE.t(b7h1.a(a7h1Var.d));
        }
        String strB = y7h1Var.b();
        if (strB.length() <= 0) {
            strB = null;
        }
        if (strB != null) {
            iVarE.J(strB);
        }
        for (Map.Entry entry : y7h1Var.c().c().entrySet()) {
            String str10 = (String) entry.getKey();
            String str11 = (String) entry.getValue();
            j jVarN = UbiProd1Interaction.InteractionTypeParameters.n();
            jVarN.n(b7h1.a(str10));
            jVarN.q(b7h1.a(str11));
            iVarE.w(jVarN);
        }
        for (Map.Entry entry2 : y7h1Var.a().c().entrySet()) {
            String str12 = (String) entry2.getKey();
            String str13 = (String) entry2.getValue();
            iVarE.n(b7h1.a(str12));
            iVarE.q(b7h1.a(str13));
        }
        for (y6h1 y6h1Var : z6h1Var.c().a) {
            int i = 0;
            for (Object obj : y6h1Var.d) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                a7h1 a7h1Var2 = (a7h1) obj;
                iVarE.z(a7h1Var2.a);
                iVarE.y(b7h1.a(a7h1Var2.b));
                iVarE.C(b7h1.a(a7h1Var2.c));
                iVarE.B(b7h1.a(a7h1Var2.e));
                iVarE.A(b7h1.a(a7h1Var2.d));
                if (i == 0) {
                    iVarE.D(y6h1Var.a);
                    iVarE.x("default");
                } else {
                    iVarE.D("");
                    iVarE.x("");
                }
                i = i2;
            }
        }
        long j2 = w7h1Var.a;
        if (j2 > 0) {
            iVarE.d0(j2);
        }
        for (d8h1 d8h1Var : g6h1Var.a) {
            k kVarP = UbiProd1Interaction.SourcePaths.p();
            for (y6h1 y6h1Var2 : d8h1Var.a().a) {
                l lVarP = UbiProd1Interaction.SourcePaths.Path.p();
                lVarP.r(y6h1Var2.a);
                for (a7h1 a7h1Var3 : y6h1Var2.d) {
                    m mVarN = UbiProd1Interaction.SourcePaths.Path.Elements.n();
                    mVarN.q(a7h1Var3.a);
                    Integer num3 = a7h1Var3.d;
                    if (num3 != null) {
                        mVarN.r(String.valueOf(num3.intValue()));
                    }
                    String str14 = a7h1Var3.b;
                    if (str14 != null) {
                        mVarN.n(str14);
                    }
                    String str15 = a7h1Var3.c;
                    if (str15 != null) {
                        mVarN.t(str15);
                    }
                    String str16 = a7h1Var3.e;
                    if (str16 != null) {
                        mVarN.s(str16);
                    }
                    lVarP.n(mVarN);
                }
                if (lVarP.q() > 0) {
                    kVarP.n(lVarP);
                }
            }
            if (kVarP.q() > 0) {
                iVarE.E(kVarP);
            }
        }
        UbiProd1Interaction ubiProd1InteractionBuild = iVarE.build();
        u2o1.p();
        this.a.a(ubiProd1InteractionBuild);
        return tv80Var;
    }

    public final r480 e(l7h1 l7h1Var, String str, y6r0 y6r0Var, String str2, String str3, String str4, String str5, String str6, Set set, String str7, Integer num, g6h1 g6h1Var) {
        String str8 = y6r0Var != null ? y6r0Var.a : null;
        LinkedHashMap linkedHashMapU = set != null ? f0o1.u(set) : null;
        z6h1 z6h1Var = l7h1Var.c;
        e eVarB = UbiProd1ImpressionNonAuth.B();
        eVarB.L(str);
        eVarB.T(z6h1Var.b().a);
        eVarB.K(z6h1Var.b().b);
        eVarB.G(z6h1Var.b().c);
        eVarB.R(str3);
        eVarB.Q(str5);
        z6h1Var.b().getClass();
        eVarB.S();
        eVarB.F(z6h1Var.b().f);
        eVarB.E(z6h1Var.b().g);
        eVarB.J(str6);
        if (str4.length() > 0) {
            eVarB.P(str4);
        }
        if (linkedHashMapU != null) {
            eVarB.C(linkedHashMapU);
        }
        mla1 mla1VarA = g6h1Var.a();
        if (mla1VarA != null) {
            if (mla1VarA instanceof kla1) {
                mla1VarA = null;
            }
            if (mla1VarA != null) {
                eVarB.D(b7h1.b(mla1VarA));
            }
        }
        if (str8 != null) {
            eVarB.O(str8);
        }
        if (str2 != null) {
            eVarB.M(str2);
        }
        ltf1 ltf1Var = e8h1.a;
        u8h1 u8h1Var = z6h1Var.a().b;
        String strC = e8h1.c(u8h1Var != null ? u8h1Var.a().a() : null);
        if (strC != null) {
            eVarB.N(strC);
        }
        eVarB.H(str7);
        if (num != null) {
            eVarB.I(num.intValue());
        }
        for (a7h1 a7h1Var : z6h1Var.b().d) {
            eVarB.q(a7h1Var.a);
            eVarB.n(b7h1.a(a7h1Var.b));
            eVarB.t(b7h1.a(a7h1Var.c));
            eVarB.s(b7h1.a(a7h1Var.e));
            eVarB.r(b7h1.a(a7h1Var.d));
        }
        for (y6h1 y6h1Var : z6h1Var.c().a) {
            int i = 0;
            for (Object obj : y6h1Var.d) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                a7h1 a7h1Var2 = (a7h1) obj;
                eVarB.w(a7h1Var2.a);
                eVarB.v(b7h1.a(a7h1Var2.b));
                eVarB.z(b7h1.a(a7h1Var2.c));
                eVarB.y(b7h1.a(a7h1Var2.e));
                eVarB.x(b7h1.a(a7h1Var2.d));
                if (i == 0) {
                    eVarB.A(y6h1Var.a);
                    eVarB.u("default");
                } else {
                    eVarB.A("");
                    eVarB.u("");
                }
                i = i2;
            }
        }
        long j = l7h1Var.a;
        if (j > 0) {
            eVarB.U(j);
        }
        for (d8h1 d8h1Var : g6h1Var.a) {
            f fVarP = UbiProd1ImpressionNonAuth.SourcePaths.p();
            for (y6h1 y6h1Var2 : d8h1Var.a().a) {
                g gVarP = UbiProd1ImpressionNonAuth.SourcePaths.Path.p();
                gVarP.r(y6h1Var2.a);
                for (a7h1 a7h1Var3 : y6h1Var2.d) {
                    h hVarN = UbiProd1ImpressionNonAuth.SourcePaths.Path.Elements.n();
                    hVarN.q(a7h1Var3.a);
                    Integer num2 = a7h1Var3.d;
                    if (num2 != null) {
                        hVarN.r(String.valueOf(num2.intValue()));
                    }
                    String str9 = a7h1Var3.b;
                    if (str9 != null) {
                        hVarN.n(str9);
                    }
                    String str10 = a7h1Var3.c;
                    if (str10 != null) {
                        hVarN.t(str10);
                    }
                    String str11 = a7h1Var3.e;
                    if (str11 != null) {
                        hVarN.s(str11);
                    }
                    gVarP.n(hVarN);
                }
                if (gVarP.q() > 0) {
                    fVarP.n(gVarP);
                }
            }
            if (fVarP.q() > 0) {
                eVarB.B(fVarP);
            }
        }
        this.a.a(eVarB.build());
        return new r480(new p480(str), y6r0Var);
    }

    @Override // p.i8h1
    public final r480 f(l7h1 l7h1Var, Set set) {
        this.d.a(l7h1Var);
        u6h1 u6h1VarA = this.b.a();
        String str = u6h1VarA.g;
        String str2 = u6h1VarA.f;
        String str3 = u6h1VarA.e;
        String str4 = u6h1VarA.d;
        String str5 = u6h1VarA.a;
        y6r0 y6r0Var = u6h1VarA.b;
        if (this.g) {
            String str6 = u6h1VarA.c;
            String str7 = u6h1VarA.h;
            Integer num = u6h1VarA.i;
            g6h1.Companion.getClass();
            return c(l7h1Var, str5, y6r0Var, str6, str4, str3, str2, str, set, str7, num, g6h1.e);
        }
        String str8 = u6h1VarA.c;
        String str9 = u6h1VarA.h;
        Integer num2 = u6h1VarA.i;
        g6h1.Companion.getClass();
        return e(l7h1Var, str5, y6r0Var, str8, str4, str3, str2, str, set, str9, num2, g6h1.e);
    }

    public final tv80 h(w7h1 w7h1Var, String str, y6r0 y6r0Var, String str2, String str3, String str4, String str5, String str6, Set set, Integer num, String str7, Integer num2, g6h1 g6h1Var) {
        long jB = this.e.b();
        ou80 ou80Var = new ou80(str);
        long j = w7h1Var.a;
        String strL = l(w7h1Var, g6h1Var);
        z6h1 z6h1Var = w7h1Var.c;
        String str8 = z6h1Var.b().h.a;
        g6h1 g6h1VarB = b(ou80Var, y6r0Var, w7h1Var);
        y7h1 y7h1Var = w7h1Var.d;
        tv80 tv80Var = new tv80(ou80Var, y6r0Var, false, j, jB, num, g6h1VarB, str2, strL, str8, y7h1Var.c().b(), y7h1Var.c().d());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((uv80) it.next()).b(this.f, w7h1Var, tv80Var);
        }
        String str9 = y6r0Var != null ? y6r0Var.a : null;
        LinkedHashMap linkedHashMapU = set != null ? f0o1.u(set) : null;
        n nVarE = UbiProd1InteractionNonAuth.E();
        nVarE.R(str);
        nVarE.Q(z6h1Var.b().b);
        nVarE.c0(z6h1Var.b().a);
        nVarE.M(z6h1Var.b().c);
        nVarE.S(y7h1Var.c().b());
        nVarE.T(y7h1Var.c().d());
        nVarE.H(y7h1Var.a().b());
        nVarE.I(y7h1Var.a().d());
        nVarE.a0(str3);
        nVarE.Z(str5);
        z6h1Var.b().getClass();
        nVarE.b0();
        nVarE.L(z6h1Var.b().f);
        nVarE.K(z6h1Var.b().g);
        nVarE.P(str6);
        if (str4.length() > 0) {
            nVarE.Y(str4);
        }
        if (linkedHashMapU != null) {
            nVarE.F(linkedHashMapU);
        }
        mla1 mla1VarA = g6h1Var.a();
        if (mla1VarA != null) {
            if (mla1VarA instanceof kla1) {
                mla1VarA = null;
            }
            if (mla1VarA != null) {
                nVarE.G(b7h1.b(mla1VarA));
            }
        }
        if (str9 != null) {
            nVarE.W(str9);
        }
        if (str2 != null) {
            nVarE.U(str2);
        }
        ltf1 ltf1Var = e8h1.a;
        u8h1 u8h1Var = z6h1Var.a().b;
        String strC = e8h1.c(u8h1Var != null ? u8h1Var.a().a() : null);
        if (strC != null) {
            nVarE.V(strC);
        }
        if (num != null) {
            nVarE.X(num.intValue());
        }
        nVarE.N(str7);
        if (num2 != null) {
            nVarE.O(num2.intValue());
        }
        for (a7h1 a7h1Var : z6h1Var.b().d) {
            nVarE.s(a7h1Var.a);
            nVarE.r(b7h1.a(a7h1Var.b));
            nVarE.v(b7h1.a(a7h1Var.c));
            nVarE.u(b7h1.a(a7h1Var.e));
            nVarE.t(b7h1.a(a7h1Var.d));
        }
        String strB = y7h1Var.b();
        if (strB.length() <= 0) {
            strB = null;
        }
        if (strB != null) {
            nVarE.J(strB);
        }
        for (Map.Entry entry : y7h1Var.c().c().entrySet()) {
            String str10 = (String) entry.getKey();
            String str11 = (String) entry.getValue();
            o oVarN = UbiProd1InteractionNonAuth.InteractionTypeParameters.n();
            oVarN.n(b7h1.a(str10));
            oVarN.q(b7h1.a(str11));
            nVarE.w(oVarN);
        }
        for (Map.Entry entry2 : y7h1Var.a().c().entrySet()) {
            String str12 = (String) entry2.getKey();
            String str13 = (String) entry2.getValue();
            nVarE.n(b7h1.a(str12));
            nVarE.q(b7h1.a(str13));
        }
        for (y6h1 y6h1Var : z6h1Var.c().a) {
            int i = 0;
            for (Object obj : y6h1Var.d) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                a7h1 a7h1Var2 = (a7h1) obj;
                nVarE.z(a7h1Var2.a);
                nVarE.y(b7h1.a(a7h1Var2.b));
                nVarE.C(b7h1.a(a7h1Var2.c));
                nVarE.B(b7h1.a(a7h1Var2.e));
                nVarE.A(b7h1.a(a7h1Var2.d));
                if (i == 0) {
                    nVarE.D(y6h1Var.a);
                    nVarE.x("default");
                } else {
                    nVarE.D("");
                    nVarE.x("");
                }
                i = i2;
            }
        }
        long j2 = w7h1Var.a;
        if (j2 > 0) {
            nVarE.d0(j2);
        }
        for (d8h1 d8h1Var : g6h1Var.a) {
            p pVarP = UbiProd1InteractionNonAuth.SourcePaths.p();
            for (y6h1 y6h1Var2 : d8h1Var.a().a) {
                q qVarP = UbiProd1InteractionNonAuth.SourcePaths.Path.p();
                qVarP.r(y6h1Var2.a);
                for (a7h1 a7h1Var3 : y6h1Var2.d) {
                    r rVarN = UbiProd1InteractionNonAuth.SourcePaths.Path.Elements.n();
                    rVarN.q(a7h1Var3.a);
                    Integer num3 = a7h1Var3.d;
                    if (num3 != null) {
                        rVarN.r(String.valueOf(num3.intValue()));
                    }
                    String str14 = a7h1Var3.b;
                    if (str14 != null) {
                        rVarN.n(str14);
                    }
                    String str15 = a7h1Var3.c;
                    if (str15 != null) {
                        rVarN.t(str15);
                    }
                    String str16 = a7h1Var3.e;
                    if (str16 != null) {
                        rVarN.s(str16);
                    }
                    qVarP.n(rVarN);
                }
                if (qVarP.q() > 0) {
                    pVarP.n(qVarP);
                }
            }
            if (pVarP.q() > 0) {
                nVarE.E(pVarP);
            }
        }
        UbiProd1InteractionNonAuth ubiProd1InteractionNonAuthBuild = nVarE.build();
        u2o1.p();
        this.a.a(ubiProd1InteractionNonAuthBuild);
        return tv80Var;
    }

    @Override // p.i8h1
    public final r480 i(l7h1 l7h1Var) {
        this.d.a(l7h1Var);
        u6h1 u6h1VarA = this.b.a();
        String str = u6h1VarA.a;
        y6r0 y6r0Var = u6h1VarA.b;
        String str2 = u6h1VarA.c;
        String str3 = u6h1VarA.d;
        String str4 = u6h1VarA.e;
        String str5 = u6h1VarA.f;
        String str6 = u6h1VarA.g;
        String str7 = u6h1VarA.h;
        Integer num = u6h1VarA.i;
        g6h1.Companion.getClass();
        return e(l7h1Var, str, y6r0Var, str2, str3, str4, str5, str6, null, str7, num, g6h1.e);
    }

    @Override // p.i8h1
    public final tv80 j(w7h1 w7h1Var) {
        this.d.a(w7h1Var);
        u6h1 u6h1VarA = this.b.a();
        String str = u6h1VarA.a;
        y6r0 y6r0Var = u6h1VarA.b;
        String str2 = u6h1VarA.c;
        String str3 = u6h1VarA.d;
        String str4 = u6h1VarA.e;
        String str5 = u6h1VarA.f;
        String str6 = u6h1VarA.g;
        String str7 = u6h1VarA.h;
        Integer num = u6h1VarA.i;
        g6h1.Companion.getClass();
        return h(w7h1Var, str, y6r0Var, str2, str3, str4, str5, str6, null, null, str7, num, g6h1.e);
    }

    @Override // p.i8h1
    public final tv80 m(w7h1 w7h1Var, xj61 xj61Var) {
        this.d.a(w7h1Var);
        u6h1 u6h1VarA = this.b.a();
        String str = u6h1VarA.g;
        String str2 = u6h1VarA.f;
        String str3 = u6h1VarA.e;
        String str4 = u6h1VarA.d;
        String str5 = u6h1VarA.a;
        y6r0 y6r0Var = u6h1VarA.b;
        if (this.g) {
            String str6 = u6h1VarA.c;
            String str7 = u6h1VarA.h;
            Integer num = u6h1VarA.i;
            g6h1.Companion.getClass();
            return d(w7h1Var, str5, y6r0Var, str6, str4, str3, str2, str, xj61Var, null, str7, num, g6h1.e);
        }
        String str8 = u6h1VarA.c;
        String str9 = u6h1VarA.h;
        Integer num2 = u6h1VarA.i;
        g6h1.Companion.getClass();
        return h(w7h1Var, str5, y6r0Var, str8, str4, str3, str2, str, xj61Var, null, str9, num2, g6h1.e);
    }
}
