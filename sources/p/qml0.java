package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qml0 implements n8h1 {
    public final y6h1 a;
    public final /* synthetic */ fjl0 b;

    public qml0(fjl0 fjl0Var) {
        this.b = fjl0Var;
        x6h1 x6h1VarC = fjl0Var.c.c();
        x6h1VarC.i.add(new a7h1("artwork", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
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
}
