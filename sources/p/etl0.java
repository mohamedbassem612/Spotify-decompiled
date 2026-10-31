package p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class etl0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ qtl0 b;

    public etl0(qtl0 qtl0Var, int i, String str) {
        String str2;
        this.b = qtl0Var;
        x6h1 x6h1VarC = qtl0Var.b.c();
        if (i == 1) {
            str2 = "artwork";
        } else if (i == 2) {
            str2 = "entity";
        } else if (i == 3) {
            str2 = "images";
        } else {
            if (i != 4) {
                throw null;
            }
            str2 = "video";
        }
        x6h1VarC.i.add(new a7h1("artwork_view", str2, (Integer) null, str, (String) null));
        x6h1VarC.j = true;
        this.a = x6h1VarC.a();
    }

    public final w7h1 a(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), this.a, this.b.a, System.currentTimeMillis());
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = this.b.a;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.a);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        ((xjn) k7h1Var).b = this.b.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        return k7h1Var.a();
    }

    public final w7h1 h() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.a, this.b.a, System.currentTimeMillis());
    }
}
