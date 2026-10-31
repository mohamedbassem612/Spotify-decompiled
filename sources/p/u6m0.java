package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u6m0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ ksk0 b;

    public u6m0(ksk0 ksk0Var, String str) {
        this.b = ksk0Var;
        x6h1 x6h1VarC = ksk0Var.c.c();
        x6h1VarC.i.add(new a7h1("consumption_entrypoint_button", (String) null, (Integer) null, str, (String) null));
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
        ksk0 ksk0Var = this.b;
        ((xjn) k7h1Var).b = ksk0Var.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = ksk0Var.d;
        return k7h1Var.a();
    }
}
