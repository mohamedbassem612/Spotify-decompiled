package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qvk0 implements n8h1 {
    public final y6h1 a;

    public qvk0(uvk0 uvk0Var, String str) {
        x6h1 x6h1VarC = uvk0Var.a.c();
        x6h1VarC.i.add(new a7h1("message", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }

    public final w7h1 e() {
        return new w7h1("", "", new z7h1("double_hit", 1, b7x.a), new x7h1("add_reaction", 1, Collections.singletonMap("reaction_to_be_added", "❤️")), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final w7h1 g() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final w7h1 h(String str) {
        z7h1 z7h1Var = new z7h1("double_hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("remove_reaction", 1, Collections.singletonMap("reaction_to_be_removed", str)), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final w7h1 i() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), this.a, r6h1.c, System.currentTimeMillis());
    }
}
