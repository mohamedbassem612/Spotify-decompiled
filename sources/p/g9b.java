package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g9b implements m03 {
    public final q9l0 a = new q9l0(1);

    public final tv80 a(String str, i8h1 i8h1Var) {
        x6h1 x6h1VarC = this.a.a.c();
        x6h1VarC.i.add(new a7h1("disclaimer_link", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final tv80 b(i8h1 i8h1Var) {
        x6h1 x6h1VarC = this.a.a.c();
        x6h1VarC.i.add(new a7h1("disclosure_confirm", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
