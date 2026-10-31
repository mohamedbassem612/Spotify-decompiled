package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oxl0 implements n8h1 {
    public final /* synthetic */ byte a = 0;
    public final y6h1 b;
    public final /* synthetic */ ksk0 c;

    public oxl0(ksk0 ksk0Var, int i) {
        String str;
        this.c = ksk0Var;
        x6h1 x6h1VarC = ksk0Var.c.c();
        if (i == 1) {
            str = "query";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "recents";
        }
        x6h1VarC.i.add(new a7h1("search_results", (String) null, (Integer) null, (String) null, str));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public final r6h1 b() {
        byte b = this.a;
        ksk0 ksk0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = ksk0Var.b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            default:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = ksk0Var.b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
        }
    }

    public oxl0(ksk0 ksk0Var) {
        this.c = ksk0Var;
        x6h1 x6h1VarC = ksk0Var.c.c();
        x6h1VarC.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }
}
