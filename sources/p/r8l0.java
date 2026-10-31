package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r8l0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ g5l0 b;

    public r8l0(g5l0 g5l0Var, int i) {
        String str;
        this.b = g5l0Var;
        x6h1 x6h1VarC = g5l0Var.c.c();
        if (i == 1) {
            str = "empty_search_input";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "no_results";
        }
        x6h1VarC.i.add(new a7h1("empty_view", (String) null, (Integer) null, (String) null, str));
        x6h1VarC.j = true;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = this.b.b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.a);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        ((xjn) k7h1Var).b = this.b.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        return k7h1Var.a();
    }
}
