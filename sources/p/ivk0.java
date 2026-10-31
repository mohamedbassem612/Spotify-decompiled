package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ivk0 implements n8h1 {
    public final y6h1 a;
    public final /* synthetic */ jpk0 b;

    public ivk0(int i, Integer num, String str, jpk0 jpk0Var) {
        this.b = jpk0Var;
        x6h1 x6h1VarC = jpk0Var.b.c();
        x6h1VarC.i.add(new a7h1("entity_row", (String) null, num, str, ktk0.c(i)));
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
}
