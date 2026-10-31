package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sk71 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tk71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk71(tk71 tk71Var, byte b) {
        super(4);
        this.a = b;
        this.b = tk71Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        tk71 tk71Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                hyl0 hyl0Var = tk71Var.c;
                hyl0Var.getClass();
                return new gyl0(hyl0Var);
            default:
                ck71 ck71Var = (jk71) obj4;
                if (ck71Var instanceof ck71) {
                    ck71 ck71Var2 = ck71Var;
                    if (ck71Var2.c) {
                        hyl0 hyl0Var2 = tk71Var.c;
                        hyl0Var2.getClass();
                        x6h1 x6h1VarC = hyl0Var2.b.c();
                        x6h1VarC.i.add(new a7h1("share_cards_carousel", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        String str = ck71Var2.b;
                        Integer numValueOf = Integer.valueOf(ck71Var2.a);
                        x6h1 x6h1VarC2 = y6h1VarA.c();
                        x6h1VarC2.i.add(new a7h1("share_card", str, numValueOf, (String) null, (String) null));
                        x6h1VarC2.j = true;
                        y6h1 y6h1VarA2 = x6h1VarC2.a();
                        b7x b7xVar = b7x.a;
                        return new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA2, hyl0Var2.a, System.currentTimeMillis());
                    }
                }
                return null;
        }
    }
}
