package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p4m0 implements n8h1, p8h1 {
    public final /* synthetic */ byte a = 2;
    public final y6h1 b;
    public final /* synthetic */ brl0 c;

    public p4m0(Integer num, String str, brl0 brl0Var) {
        this.c = brl0Var;
        x6h1 x6h1VarC = brl0Var.b.c();
        x6h1VarC.i.add(new a7h1("manage_addon_entry", (String) null, num, str, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public final r6h1 b() {
        byte b = this.a;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                break;
            case 1:
                r6h1 r6h1Var2 = r6h1.c;
                break;
            default:
                r6h1 r6h1Var3 = r6h1.c;
                break;
        }
        return new r6h1(kk0.l(y6h1Var), (u8h1) null);
    }

    public final l7h1 e() {
        byte b = this.a;
        brl0 brl0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = brl0Var.c;
                return k7h1Var.a();
            case 1:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = brl0Var.c;
                return k7h1Var2.a();
            default:
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1Var;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var3.e = brl0Var.c;
                return k7h1Var3.a();
        }
    }

    public p4m0(brl0 brl0Var, String str) {
        this.c = brl0Var;
        x6h1 x6h1VarC = brl0Var.b.c();
        x6h1VarC.i.add(new a7h1("banner", (String) null, (Integer) null, (String) null, str));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public p4m0(brl0 brl0Var) {
        this.c = brl0Var;
        x6h1 x6h1VarC = brl0Var.b.c();
        x6h1VarC.i.add(new a7h1("available_addons_card", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }
}
