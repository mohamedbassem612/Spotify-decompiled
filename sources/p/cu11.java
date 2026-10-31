package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cu11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k811 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu11(k811 k811Var, String str, byte b) {
        super(1);
        this.a = b;
        this.b = k811Var;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        String str = this.c;
        k811 k811Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                x6h1 x6h1VarC = ((u3l0) k811Var.d().invoke(Integer.valueOf(iIntValue), str, (Object) null)).a.c();
                x6h1VarC.i.add(new a7h1("action_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("plugin_button_1", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                x6h1 x6h1VarC3 = ((u3l0) k811Var.d().invoke(Integer.valueOf(iIntValue2), str, (Object) null)).a.c();
                x6h1VarC3.i.add(new a7h1("action_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("plugin_button_2", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA2 = x6h1VarC4.a();
                r6h1 r6h1Var2 = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA2), (u8h1) null);
            case 2:
                int iIntValue3 = ((Number) obj).intValue();
                x6h1 x6h1VarC5 = ((u3l0) k811Var.d().invoke(Integer.valueOf(iIntValue3), str, (Object) null)).a.c();
                x6h1VarC5.i.add(new a7h1("action_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("plugin_button_3", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                y6h1 y6h1VarA3 = x6h1VarC6.a();
                r6h1 r6h1Var3 = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA3), (u8h1) null);
            case 3:
                int iIntValue4 = ((Number) obj).intValue();
                x6h1 x6h1VarC7 = ((u3l0) k811Var.d().invoke(Integer.valueOf(iIntValue4), str, (Object) null)).a.c();
                x6h1VarC7.i.add(new a7h1("action_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("plugin_button_4", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                y6h1 y6h1VarA4 = x6h1VarC8.a();
                r6h1 r6h1Var4 = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA4), (u8h1) null);
            case 4:
                int iIntValue5 = ((Number) obj).intValue();
                x6h1 x6h1VarC9 = ((u3l0) k811Var.d().invoke(Integer.valueOf(iIntValue5), str, (Object) null)).a.c();
                x6h1VarC9.i.add(new a7h1("plugin_body", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                y6h1 y6h1VarA5 = x6h1VarC9.a();
                r6h1 r6h1Var5 = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA5), (u8h1) null);
            default:
                int iIntValue6 = ((Number) obj).intValue();
                x6h1 x6h1VarC10 = ((u3l0) k811Var.d().invoke(Integer.valueOf(iIntValue6), str, (Object) null)).a.c();
                x6h1VarC10.i.add(new a7h1("action_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                x6h1VarC11.i.add(new a7h1("plugin_primary_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                y6h1 y6h1VarA6 = x6h1VarC11.a();
                r6h1 r6h1Var6 = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA6), (u8h1) null);
        }
    }
}
