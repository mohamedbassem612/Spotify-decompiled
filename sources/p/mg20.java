package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mg20 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ng20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mg20(ng20 ng20Var, byte b) {
        super(4);
        this.a = b;
        this.b = ng20Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        ng20 ng20Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new y5m0((l6m0) ng20Var.d);
            default:
                if (!((ig20) obj4).equals(ig20.a)) {
                    eg.o();
                    return null;
                }
                l6m0 l6m0Var = (l6m0) ng20Var.d;
                x6h1 x6h1VarC = l6m0Var.b.c();
                x6h1VarC.i.add(new a7h1("add_friends_banner", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("add_friends_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, l6m0Var.a, System.currentTimeMillis());
        }
    }
}
