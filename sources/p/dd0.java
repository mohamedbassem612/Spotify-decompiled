package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dd0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dd0(res resVar, byte b) {
        super(4);
        this.a = b;
        this.b = resVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        res resVar = this.b;
        switch (b) {
            case 0:
                zc0 zc0Var = (zc0) obj;
                ((Number) obj3).intValue();
                return zc0Var.a.g ? resVar.y(zc0Var) : resVar.v(zc0Var);
            default:
                zc0 zc0Var2 = (zc0) obj2;
                boolean z = zc0Var2.a.g;
                b7x b7xVar = b7x.a;
                if (z) {
                    x6h1 x6h1VarC = resVar.y(zc0Var2).b.c();
                    x6h1VarC.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                x6h1 x6h1VarC2 = resVar.v(zc0Var2).b.c();
                x6h1VarC2.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        }
    }
}
