package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o251 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q251 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o251(q251 q251Var, byte b) {
        super(4);
        this.a = b;
        this.b = q251Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        byte b = this.a;
        b251 b251Var = b251.a;
        b7x b7xVar = b7x.a;
        q251 q251Var = this.b;
        switch (b) {
            case 0:
                oyl0 oyl0Var = (oyl0) obj;
                k251 k251Var = (k251) obj4;
                r6h1 r6h1Var = oyl0Var.b.a;
                y6h1 y6h1Var = oyl0Var.a;
                if (k251Var instanceof h251) {
                    if (!q251Var.a) {
                        return null;
                    }
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("change_search_query", 1, Collections.singletonMap("search_query_string", ((h251) k251Var).a)), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                } else {
                    if (!k251Var.equals(b251Var)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("clear_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("text_clear", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                }
                return w7h1Var;
            case 1:
                vuk0 vuk0Var = (vuk0) obj;
                k251 k251Var2 = (k251) obj4;
                if (k251Var2 instanceof h251) {
                    if (q251Var.a) {
                        return new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("filter", 1, b7xVar), vuk0Var.a, r6h1.c, System.currentTimeMillis());
                    }
                    return null;
                }
                if (k251Var2.equals(b251Var)) {
                    return null;
                }
                eg.o();
                return null;
            default:
                suk0 suk0Var = (suk0) obj;
                k251 k251Var3 = (k251) obj4;
                if (!(k251Var3 instanceof h251)) {
                    if (k251Var3.equals(b251Var)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                if (!q251Var.a) {
                    return null;
                }
                x6h1 x6h1VarC3 = suk0Var.a.c();
                x6h1VarC3.i.add(new a7h1("search_text", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
        }
    }
}
