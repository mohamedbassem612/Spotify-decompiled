package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y7l0 implements n8h1 {
    public final y6h1 a;
    public final /* synthetic */ z7l0 b;

    public y7l0(z7l0 z7l0Var, int i) {
        String str;
        this.b = z7l0Var;
        x6h1 x6h1VarC = z7l0Var.b.c();
        if (i == 1) {
            str = "allowed";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "blocked";
        }
        x6h1VarC.i.add(new a7h1("remove_from_list_button", str, (Integer) null, (String) null, (String) null));
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

    public final w7h1 e() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), this.a, this.b.a, System.currentTimeMillis());
    }
}
