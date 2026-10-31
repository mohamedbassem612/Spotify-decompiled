package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x7l0 implements n8h1 {
    public final y6h1 a;
    public final /* synthetic */ z7l0 b;

    public x7l0(z7l0 z7l0Var, int i) {
        String str;
        this.b = z7l0Var;
        x6h1 x6h1VarC = z7l0Var.b.c();
        if (i == 1) {
            str = "artist_already_allowed";
        } else if (i == 2) {
            str = "artist_already_blocked";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "globally_blocked";
        }
        x6h1VarC.i.add(new a7h1("information_button", (String) null, (Integer) null, (String) null, str));
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
