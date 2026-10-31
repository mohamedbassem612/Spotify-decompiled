package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b601 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e601 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b601(e601 e601Var, byte b) {
        super(1);
        this.a = b;
        this.b = e601Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        e601 e601Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                e601Var.g.invoke(new y401(str));
                pux0 pux0Var = e601Var.b;
                i8h1 i8h1Var = (i8h1) pux0Var.b;
                x6h1 x6h1VarC = ((exk0) pux0Var.c).a.c();
                x6h1VarC.i.add(new a7h1("reaction_picker_button", str, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("add_reaction", 1, Collections.singletonMap("reaction_to_be_added", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                String str2 = (String) obj;
                e601Var.g.invoke(new x401(str2));
                pux0 pux0Var2 = e601Var.b;
                i8h1 i8h1Var2 = (i8h1) pux0Var2.b;
                x6h1 x6h1VarC2 = ((exk0) pux0Var2.c).a.c();
                x6h1VarC2.i.add(new a7h1("reaction_picker_button", str2, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_reaction", 1, Collections.singletonMap("reaction_to_be_removed", str2)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
        }
        return rih1Var;
    }
}
