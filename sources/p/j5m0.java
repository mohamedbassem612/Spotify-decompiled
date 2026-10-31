package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j5m0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ k5m0 b;

    public j5m0(k5m0 k5m0Var, String str, Integer num) {
        this.b = k5m0Var;
        x6h1 x6h1VarC = k5m0Var.a.c();
        x6h1VarC.i.add(new a7h1("filter_chip", str, num, (String) null, (String) null));
        x6h1VarC.j = true;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = this.b.b.c.b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.a);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        mjl0 mjl0Var = this.b.b;
        ((xjn) k7h1Var).b = mjl0Var.c.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = mjl0Var.c.d;
        return k7h1Var.a();
    }
}
