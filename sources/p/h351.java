package p;

import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h351 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SearchFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h351(SearchFragment searchFragment, byte b) {
        super(2);
        this.a = b;
        this.b = searchFragment;
    }

    public final Object invoke(Object obj, Object obj2) {
        hnn0 hnn0VarL;
        fe41 fe41Var;
        hnn0 hnn0VarL2;
        fe41 fe41Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        SearchFragment searchFragment = this.b;
        switch (b) {
            case 0:
                h951 h951Var = (h951) obj;
                String str = (String) obj2;
                if (searchFragment.q0()) {
                    xl81 xl81Var = h951Var.b;
                    if ((xl81Var instanceof qpl) && (hnn0VarL = pap1.w(searchFragment).l()) != null && (fe41Var = (fe41) hnn0VarL.X.getValue()) != null) {
                        fe41Var.b(new tam0(str, (qpl) xl81Var), "searchResult_mobius");
                    }
                    pap1.w(searchFragment).t();
                }
                return rih1Var;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                h951 h951Var2 = (h951) obj2;
                String str2 = h951Var2.c;
                int iC = l1d.C(h951Var2.a);
                b7x b7xVar = b7x.a;
                if (iC == 0) {
                    ffe1 ffe1VarZ0 = searchFragment.Z0();
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    i8h1 i8h1Var = (i8h1) ffe1VarZ0.b;
                    x6h1 x6h1VarC = ((bqk0) ffe1VarZ0.c).b.c();
                    x6h1VarC.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("results", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                    x6h1VarC3.i.add(new a7h1("default_item", (String) null, numValueOf, str2, (String) null));
                    x6h1VarC3.j = true;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (iC == 1) {
                    ffe1 ffe1VarZ1 = searchFragment.Z0();
                    i8h1 i8h1Var2 = (i8h1) ffe1VarZ1.b;
                    x6h1 x6h1VarC4 = ((bqk0) ffe1VarZ1.c).b.c();
                    x6h1VarC4.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = true;
                    x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                    x6h1VarC5.i.add(new a7h1("results", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    y6h1 y6h1VarA = x6h1VarC5.a();
                    Integer numValueOf2 = Integer.valueOf(iIntValue);
                    x6h1 x6h1VarC6 = y6h1VarA.c();
                    x6h1VarC6.i.add(new a7h1("artist_item", (String) null, numValueOf2, str2, (String) null));
                    x6h1VarC6.j = true;
                    i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    ffe1 ffe1VarZ2 = searchFragment.Z0();
                    i8h1 i8h1Var3 = (i8h1) ffe1VarZ2.b;
                    x6h1 x6h1VarC7 = ((bqk0) ffe1VarZ2.c).b.c();
                    x6h1VarC7.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = true;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("results", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC8.a();
                    Integer numValueOf3 = Integer.valueOf(iIntValue);
                    x6h1 x6h1VarC9 = y6h1VarA2.c();
                    x6h1VarC9.i.add(new a7h1("show_item", (String) null, numValueOf3, str2, (String) null));
                    x6h1VarC9.j = true;
                    i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                xl81 xl81Var2 = h951Var2.b;
                if ((xl81Var2 instanceof qpl) && (hnn0VarL2 = pap1.w(searchFragment).l()) != null && (fe41Var2 = (fe41) hnn0VarL2.X.getValue()) != null) {
                    fe41Var2.b(new tam0(h951Var2.g, (qpl) xl81Var2), "searchResult_mobius");
                }
                pap1.w(searchFragment).t();
                return rih1Var;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                h951 h951Var3 = (h951) obj2;
                String str3 = h951Var3.c;
                int iC2 = l1d.C(h951Var3.a);
                if (iC2 == 0) {
                    ffe1 ffe1VarZ3 = searchFragment.Z0();
                    Integer numValueOf4 = Integer.valueOf(iIntValue2);
                    i8h1 i8h1Var4 = (i8h1) ffe1VarZ3.b;
                    bqk0 bqk0Var = (bqk0) ffe1VarZ3.c;
                    x6h1 x6h1VarC10 = bqk0Var.b.c();
                    x6h1VarC10.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = true;
                    x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                    x6h1VarC11.i.add(new a7h1("results", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = true;
                    x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                    x6h1VarC12.i.add(new a7h1("default_item", (String) null, numValueOf4, str3, (String) null));
                    x6h1VarC12.j = true;
                    y6h1 y6h1VarA3 = x6h1VarC12.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA3;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = bqk0Var.c;
                    i8h1Var4.f(k7h1Var.a(), (Set) null);
                    return rih1Var;
                }
                if (iC2 == 1) {
                    ffe1 ffe1VarZ4 = searchFragment.Z0();
                    i8h1 i8h1Var5 = (i8h1) ffe1VarZ4.b;
                    bqk0 bqk0Var2 = (bqk0) ffe1VarZ4.c;
                    x6h1 x6h1VarC13 = bqk0Var2.b.c();
                    x6h1VarC13.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = true;
                    x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                    x6h1VarC14.i.add(new a7h1("results", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = true;
                    y6h1 y6h1VarA4 = x6h1VarC14.a();
                    Integer numValueOf5 = Integer.valueOf(iIntValue2);
                    x6h1 x6h1VarC15 = y6h1VarA4.c();
                    x6h1VarC15.i.add(new a7h1("artist_item", (String) null, numValueOf5, str3, (String) null));
                    x6h1VarC15.j = true;
                    y6h1 y6h1VarA5 = x6h1VarC15.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA5;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var2.e = bqk0Var2.c;
                    i8h1Var5.f(k7h1Var2.a(), (Set) null);
                    return rih1Var;
                }
                if (iC2 != 2) {
                    eg.o();
                    return null;
                }
                ffe1 ffe1VarZ5 = searchFragment.Z0();
                i8h1 i8h1Var6 = (i8h1) ffe1VarZ5.b;
                bqk0 bqk0Var3 = (bqk0) ffe1VarZ5.c;
                x6h1 x6h1VarC16 = bqk0Var3.b.c();
                x6h1VarC16.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC16.j = true;
                x6h1 x6h1VarC17 = x6h1VarC16.a().c();
                x6h1VarC17.i.add(new a7h1("results", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC17.j = true;
                y6h1 y6h1VarA6 = x6h1VarC17.a();
                Integer numValueOf6 = Integer.valueOf(iIntValue2);
                x6h1 x6h1VarC18 = y6h1VarA6.c();
                x6h1VarC18.i.add(new a7h1("show_item", (String) null, numValueOf6, str3, (String) null));
                x6h1VarC18.j = true;
                y6h1 y6h1VarA7 = x6h1VarC18.a();
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1VarA7;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var3.e = bqk0Var3.c;
                i8h1Var6.f(k7h1Var3.a(), (Set) null);
                return rih1Var;
        }
    }
}
