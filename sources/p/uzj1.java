package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uzj1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vzj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uzj1(vzj1 vzj1Var, byte b) {
        super(3);
        this.a = b;
        this.b = vzj1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        vzj1 vzj1Var = this.b;
        switch (b) {
            case 0:
                vzj1Var.b.invoke();
                return rih1.a;
            default:
                boolean z = ((tzj1) obj).a;
                wzj1 wzj1Var = vzj1Var.a;
                b7x b7xVar = b7x.a;
                if (z) {
                    x6h1 x6h1VarC = wzj1Var.a.b.c();
                    x6h1VarC.i.add(new a7h1("deselect_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                x6h1 x6h1VarC2 = wzj1Var.a.b.c();
                x6h1VarC2.i.add(new a7h1("select_all_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        }
    }
}
