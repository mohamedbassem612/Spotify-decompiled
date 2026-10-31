package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ggu0 implements o86 {
    public final i8h1 a;
    public final brl0 b = new brl0((byte) 2);

    public ggu0(i8h1 i8h1Var) {
        this.a = i8h1Var;
    }

    public final tv80 a() {
        return null;
    }

    public final tv80 b() {
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("disclosure_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final tv80 c(String str) {
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("copy_prompt_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final tv80 e(String str) {
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("close_button", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final tv80 g() {
        x6h1 x6h1VarC = this.b.b.c();
        x6h1VarC.i.add(new a7h1("generate_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_playlist", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
