package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cml0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ fjl0 b;

    public cml0(fjl0 fjl0Var, int i) {
        String str;
        this.b = fjl0Var;
        x6h1 x6h1VarC = fjl0Var.c.c();
        if (i == 1) {
            str = "off";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "on";
        }
        x6h1VarC.i.add(new a7h1("notes_button", (String) null, (Integer) null, (String) null, str));
        x6h1VarC.j = true;
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

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        ((xjn) k7h1Var).b = this.b.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        return k7h1Var.a();
    }
}
