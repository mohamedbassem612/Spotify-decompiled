package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class keb0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o860 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ keb0(o860 o860Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = o860Var;
        this.c = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        o860 o860Var = this.b;
        switch (b) {
            case 0:
                o860Var.q(null);
                function0.invoke();
                break;
            default:
                uba ubaVar = (wnh1) o860Var.b;
                x6h1 x6h1VarC = ((tdl0) o860Var.e).b.c();
                x6h1VarC.i.add(new a7h1("ok_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                o860Var.q(ubaVar.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null));
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
