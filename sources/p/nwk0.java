package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nwk0 implements n8h1 {
    public final y6h1 a;
    public final /* synthetic */ wqk0 b;

    public nwk0(wqk0 wqk0Var, String str) {
        this.b = wqk0Var;
        x6h1 x6h1VarC = wqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("primary_button", str, (Integer) null, (String) null, (String) null));
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
