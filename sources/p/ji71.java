package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ji71 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ki71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji71(ki71 ki71Var, byte b) {
        super(4);
        this.a = b;
        this.b = ki71Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        ki71 ki71Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                ayl0 ayl0Var = ki71Var.c;
                ayl0Var.getClass();
                return new zxl0(ayl0Var);
            default:
                if (((di71) obj4) instanceof ai71) {
                    i8h1 i8h1Var = ki71Var.d;
                    ayl0 ayl0Var2 = ki71Var.c;
                    ayl0Var2.getClass();
                    x6h1 x6h1VarC = ayl0Var2.b.c();
                    x6h1VarC.i.add(new a7h1("error_view", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).b = ayl0Var2.a;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                }
                return null;
        }
    }
}
