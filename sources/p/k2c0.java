package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k2c0 {
    public final jly0 a;
    public final h7l0 b;
    public final b7l0 c;
    public final idd1 d = new idd1(new nzb0(this, 2));

    public k2c0(jly0 jly0Var, h7l0 h7l0Var, b7l0 b7l0Var) {
        this.a = jly0Var;
        this.b = h7l0Var;
        this.c = b7l0Var;
    }

    public final i8h1 a() {
        return (i8h1) this.d.getValue();
    }

    public final tv80 b(String str) {
        i8h1 i8h1VarA = a();
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
