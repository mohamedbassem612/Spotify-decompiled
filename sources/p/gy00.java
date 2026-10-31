package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gy00 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n8h1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gy00(n8h1 n8h1Var, byte b) {
        super(1);
        this.a = b;
        this.b = n8h1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        owl0 owl0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return owl0Var.b();
            case 1:
                ((Number) obj).intValue();
                return owl0Var.b();
            case 2:
                ((Number) obj).intValue();
                return owl0Var.b();
            case 3:
                return (w7h1) ((um61) obj).b.invoke(owl0Var);
            case 4:
                return (w7h1) ((ym61) obj).b.invoke(owl0Var);
            case 5:
                return (w7h1) ((wm61) obj).b.invoke(owl0Var);
            case 6:
                return (w7h1) ((um61) obj).c.invoke(owl0Var);
            case 7:
                owl0 owl0Var2 = owl0Var;
                x6h1 x6h1VarC = owl0Var2.a.c();
                x6h1VarC.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, owl0Var2.b.b, System.currentTimeMillis());
            case 8:
                return (w7h1) ((wm61) obj).c.invoke(owl0Var);
            case 9:
                ((Number) obj).intValue();
                return owl0Var.b();
            case 10:
                if (owl0Var != null) {
                    return new h3h1(new gy00(owl0Var, (byte) 9));
                }
                return null;
            default:
                return new nar0(owl0Var);
        }
    }
}
