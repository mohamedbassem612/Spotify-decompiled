package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bb0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb0(cb0 cb0Var, byte b) {
        super(4);
        this.a = b;
        this.b = cb0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        cb0 cb0Var = this.b;
        switch (b) {
            case 0:
                ab0 ab0Var = (ab0) obj;
                ((Number) obj3).intValue();
                return ((cur) cb0Var.b.get()).a(ab0Var.a, ab0Var.b);
            default:
                ab0 ab0Var2 = (ab0) obj2;
                if (!((za0) obj4).equals(za0.a)) {
                    eg.o();
                    return null;
                }
                cur curVar = (cur) cb0Var.b.get();
                String str = ab0Var2.a;
                String str2 = ab0Var2.b;
                boolean z = ab0Var2.d;
                y6h1 y6h1Var = curVar.a(str, str2).b;
                b7x b7xVar = b7x.a;
                return z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
        }
    }
}
