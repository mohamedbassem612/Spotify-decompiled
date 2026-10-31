package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oqk0 implements n8h1 {
    public final y6h1 a;
    public final /* synthetic */ py9 b;

    public oqk0(Integer num, String str, py9 py9Var) {
        this.b = py9Var;
        x6h1 x6h1VarC = py9Var.c.c();
        x6h1VarC.i.add(new a7h1("artist", (String) null, num, str, (String) null));
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
