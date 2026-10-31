package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iii1 {
    public final i8h1 a;
    public final r6m0 b = new r6m0();

    public iii1(i8h1 i8h1Var) {
        this.a = i8h1Var;
    }

    public final void a(rqe1 rqe1Var) {
        mqe1 mqe1Var = rqe1Var.b;
        if (mqe1Var instanceof jqe1) {
            int i = ((jqe1) mqe1Var).b;
            y6h1 y6h1Var = this.b.a;
            i8h1 i8h1Var = this.a;
            if (i <= 0) {
                x6h1 x6h1VarC = y6h1Var.c();
                x6h1VarC.i.add(new a7h1("loaded_all_content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return;
            }
            Integer numValueOf = Integer.valueOf(i - 1);
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("page_loaded", (String) null, numValueOf, (String) null, (String) null));
            x6h1VarC2.j = true;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            k7h1 k7h1Var2 = new k7h1();
            ((xjn) k7h1Var2).a = y6h1VarA2;
            ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var2.a(), (Set) null);
        }
    }
}
