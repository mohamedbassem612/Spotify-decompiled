package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ktl0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ mtl0 b;

    public ktl0(mtl0 mtl0Var, int i, Integer num) {
        String str;
        this.b = mtl0Var;
        x6h1 x6h1VarC = mtl0Var.a.c();
        if (i == 1) {
            str = "entity";
        } else if (i == 2) {
            str = "image";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "video";
        }
        x6h1VarC.i.add(new a7h1("companion_content", str, num, (String) null, (String) null));
        x6h1VarC.j = true;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = this.b.b.b.a;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.a);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        ((xjn) k7h1Var).b = this.b.b.b.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        return k7h1Var.a();
    }

    public final w7h1 h() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.a, this.b.b.b.a, System.currentTimeMillis());
    }
}
