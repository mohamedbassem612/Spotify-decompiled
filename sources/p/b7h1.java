package p;

import com.spotify.messages.UbiProd1Impression;
import com.spotify.messages.d;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b7h1 {
    public static String a(Object obj) {
        String string = obj != null ? obj.toString() : null;
        return string == null ? "" : string;
    }

    public static String b(mla1 mla1Var) {
        if (mla1Var.equals(jla1.INSTANCE)) {
            return "non_contextual_page";
        }
        if (mla1Var.equals(kla1.INSTANCE)) {
            return "not_implemented";
        }
        if (mla1Var.equals(lla1.INSTANCE)) {
            return "unknown";
        }
        if (mla1Var instanceof ila1) {
            return f4i1.f("missing_context(", ((ila1) mla1Var).b(), ")");
        }
        eg.o();
        return null;
    }

    public static UbiProd1Impression c(l7h1 l7h1Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, LinkedHashMap linkedHashMap, String str8, Integer num, g6h1 g6h1Var, int i) {
        return d(linkedHashMap, str, l7h1Var, null, str2, str3, str4, str5, str6, str7, (i & 256) == 0, str8, (i & 4096) != 0 ? null : num, g6h1Var);
    }

    public static UbiProd1Impression d(Map map, String str, l7h1 l7h1Var, Long l, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, Integer num, g6h1 g6h1Var) {
        y6h1 y6h1VarB = l7h1Var.c.b();
        z6h1 z6h1Var = l7h1Var.c;
        r6h1 r6h1VarC = z6h1Var.c();
        com.spotify.messages.a aVarC = UbiProd1Impression.C();
        aVarC.T(str6);
        aVarC.N(str);
        aVarC.W(y6h1VarB.a);
        aVarC.M(y6h1VarB.b);
        aVarC.G(y6h1VarB.c);
        aVarC.U(str4);
        aVarC.V();
        aVarC.F(y6h1VarB.f);
        aVarC.E(y6h1VarB.g);
        aVarC.J(str7);
        if (str5.length() > 0) {
            aVarC.S(str5);
        }
        if (z) {
            aVarC.O();
        }
        if (str2 != null) {
            aVarC.R(str2);
        }
        if (str3 != null) {
            aVarC.P(str3);
        }
        ltf1 ltf1Var = e8h1.a;
        u8h1 u8h1Var = z6h1Var.a().b;
        String strC = e8h1.c(u8h1Var != null ? u8h1Var.a().a() : null);
        if (strC != null) {
            aVarC.Q(strC);
        }
        if (l != null) {
            aVarC.L(l.longValue());
        }
        if (map != null) {
            aVarC.C(map);
        }
        mla1 mla1VarA = g6h1Var.a();
        if (mla1VarA != null) {
            if (mla1VarA instanceof kla1) {
                mla1VarA = null;
            }
            if (mla1VarA != null) {
                aVarC.D(b(mla1VarA));
            }
        }
        aVarC.H(str8);
        if (num != null) {
            aVarC.I(num.intValue());
        }
        for (a7h1 a7h1Var : y6h1VarB.d) {
            aVarC.q(a7h1Var.a);
            aVarC.n(a(a7h1Var.b));
            aVarC.t(a(a7h1Var.c));
            aVarC.s(a(a7h1Var.e));
            aVarC.r(a(a7h1Var.d));
        }
        for (y6h1 y6h1Var : r6h1VarC.a) {
            int i = 0;
            for (Object obj : y6h1Var.d) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                a7h1 a7h1Var2 = (a7h1) obj;
                aVarC.w(a7h1Var2.a);
                aVarC.v(a(a7h1Var2.b));
                aVarC.z(a(a7h1Var2.c));
                aVarC.y(a(a7h1Var2.e));
                aVarC.x(a(a7h1Var2.d));
                if (i == 0) {
                    aVarC.A(y6h1Var.a);
                    aVarC.u("default");
                } else {
                    aVarC.A("");
                    aVarC.u("");
                }
                i = i2;
            }
        }
        long j = l7h1Var.a;
        if (j > 0) {
            aVarC.X(j);
        }
        for (d8h1 d8h1Var : g6h1Var.a) {
            com.spotify.messages.b bVarP = UbiProd1Impression.SourcePaths.p();
            for (y6h1 y6h1Var2 : d8h1Var.a().a) {
                com.spotify.messages.c cVarP = UbiProd1Impression.SourcePaths.Path.p();
                cVarP.r(y6h1Var2.a);
                for (a7h1 a7h1Var3 : y6h1Var2.d) {
                    d dVarN = UbiProd1Impression.SourcePaths.Path.Elements.n();
                    dVarN.q(a7h1Var3.a);
                    Integer num2 = a7h1Var3.d;
                    if (num2 != null) {
                        dVarN.r(String.valueOf(num2.intValue()));
                    }
                    String str9 = a7h1Var3.b;
                    if (str9 != null) {
                        dVarN.n(str9);
                    }
                    String str10 = a7h1Var3.c;
                    if (str10 != null) {
                        dVarN.t(str10);
                    }
                    String str11 = a7h1Var3.e;
                    if (str11 != null) {
                        dVarN.s(str11);
                    }
                    cVarP.n(dVarN);
                }
                if (cVarP.q() > 0) {
                    bVarP.n(cVarP);
                }
            }
            if (bVarP.q() > 0) {
                aVarC.B(bVarP);
            }
        }
        return (UbiProd1Impression) aVarC.build();
    }
}
