package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m5g extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ttk0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5g(ttk0 ttk0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ttk0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ttk0 ttk0Var = this.b;
        switch (b) {
            case 0:
                return ttk0Var.e();
            case 1:
                x6h1 x6h1VarC = ttk0Var.b.c();
                x6h1VarC.i.add(new a7h1("change_product_btn", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 2:
                x6h1 x6h1VarC2 = ttk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("billing_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
            case 3:
                x6h1 x6h1VarC3 = ttk0Var.b.c();
                x6h1VarC3.i.add(new a7h1("billing_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("legal_checkbox_container", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA3 = x6h1VarC4.a();
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1VarA3;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var3.a();
            case 4:
                x6h1 x6h1VarC5 = ttk0Var.b.c();
                x6h1VarC5.i.add(new a7h1("change_country_cta", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                y6h1 y6h1VarA4 = x6h1VarC5.a();
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1VarA4;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var4.a();
            case 5:
                x6h1 x6h1VarC6 = ttk0Var.b.c();
                x6h1VarC6.i.add(new a7h1("billing_unavailable_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = true;
                y6h1 y6h1VarA5 = x6h1VarC6.a();
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1VarA5;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var5.a();
            default:
                x6h1 x6h1VarC7 = ttk0Var.b.c();
                x6h1VarC7.i.add(new a7h1("billing_unavailable_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("billing_unavailable_btn", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = true;
                y6h1 y6h1VarA6 = x6h1VarC8.a();
                k7h1 k7h1Var6 = new k7h1();
                ((xjn) k7h1Var6).a = y6h1VarA6;
                ((xjn) k7h1Var6).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var6.a();
        }
    }
}
