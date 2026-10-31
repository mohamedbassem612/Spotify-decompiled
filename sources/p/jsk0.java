package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jsk0 implements n8h1 {
    public final y6h1 a;
    public final /* synthetic */ gsk0 b;

    public jsk0(gsk0 gsk0Var) {
        this.b = gsk0Var;
        x6h1 x6h1VarC = gsk0Var.b.c();
        x6h1VarC.i.add(new a7h1("filters", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = this.b.c.b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.a);
        return new r6h1(arrayList, r6h1Var2.b);
    }
}
