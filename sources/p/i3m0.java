package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i3m0 implements n8h1 {
    public final y6h1 a;
    public final /* synthetic */ j3m0 b;

    public i3m0(j3m0 j3m0Var, String str) {
        this.b = j3m0Var;
        x6h1 x6h1VarC = j3m0Var.b.c();
        x6h1VarC.i.add(new a7h1("voting_upsell_button", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
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
}
