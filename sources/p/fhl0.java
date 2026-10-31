package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fhl0 implements n8h1 {
    public final y6h1 a;
    public final /* synthetic */ sqk0 b;

    public fhl0(sqk0 sqk0Var, String str, String str2, String str3) {
        this.b = sqk0Var;
        x6h1 x6h1VarC = sqk0Var.b.c();
        x6h1VarC.i.add(new a7h1("trigger_dsa", str, (Integer) null, str3, str2));
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
