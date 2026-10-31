package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xsk0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ ysk0 b;

    public xsk0(ysk0 ysk0Var) {
        this.b = ysk0Var;
        x6h1 x6h1VarC = ysk0Var.b.c();
        x6h1VarC.i.add(new a7h1("pre_purchase_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = this.b.a;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.a);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        ((xjn) k7h1Var).b = this.b.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        return k7h1Var.a();
    }
}
