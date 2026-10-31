package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class isk0 implements n8h1 {
    public final y6h1 a;
    public final /* synthetic */ jsk0 b;

    public isk0(jsk0 jsk0Var, String str, Integer num, String str2) {
        this.b = jsk0Var;
        x6h1 x6h1VarC = jsk0Var.a.c();
        x6h1VarC.i.add(new a7h1("filter_chip", str, num, str2, (String) null));
        x6h1VarC.j = false;
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
}
