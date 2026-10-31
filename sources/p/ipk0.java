package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ipk0 implements n8h1, o8h1 {
    public final y6h1 a;
    public final /* synthetic */ jpk0 b;

    public ipk0(jpk0 jpk0Var, String str, Integer num, String str2) {
        this.b = jpk0Var;
        x6h1 x6h1VarC = jpk0Var.b.c();
        x6h1VarC.i.add(new a7h1("carousel_item", str, num, str2, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = this.b.c.a;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.a);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final k6h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        ((xjn) k7h1Var).b = this.b.c.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        return new k6h1(k7h1Var.a());
    }
}
