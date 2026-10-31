package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s6m0 implements n8h1, p8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ p6m0 c;

    public s6m0(p6m0 p6m0Var, byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.c = p6m0Var;
                x6h1 x6h1VarC = p6m0Var.b.c();
                x6h1VarC.i.add(new a7h1("subscription_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                this.b = x6h1VarC.a();
                break;
            case 4:
                this.c = p6m0Var;
                x6h1 x6h1VarC2 = p6m0Var.b.c();
                x6h1VarC2.i.add(new a7h1("your_addons_entry", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                this.b = x6h1VarC2.a();
                break;
            default:
                this.c = p6m0Var;
                x6h1 x6h1VarC3 = p6m0Var.b.c();
                x6h1VarC3.i.add(new a7h1("benefits_list_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                this.b = x6h1VarC3.a();
                break;
        }
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
            case 2:
                r6h1 r6h1Var3 = r6h1.c;
                break;
            case 3:
                r6h1 r6h1Var4 = r6h1.c;
                break;
            default:
                r6h1 r6h1Var5 = r6h1.c;
                break;
        }
        return new r6h1(kk0.l(y6h1Var), (u8h1) null);
    }

    public final l7h1 e() {
        byte b = this.a;
        p6m0 p6m0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = p6m0Var.c;
                return k7h1Var.a();
            case 1:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = p6m0Var.c;
                return k7h1Var2.a();
            case 2:
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1Var;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var3.e = p6m0Var.c;
                return k7h1Var3.a();
            case 3:
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1Var;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var4.e = p6m0Var.c;
                return k7h1Var4.a();
            default:
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1Var;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var5.e = p6m0Var.c;
                return k7h1Var5.a();
        }
    }

    public s6m0(p6m0 p6m0Var, Integer num, String str) {
        this.a = (byte) 2;
        this.c = p6m0Var;
        x6h1 x6h1VarC = p6m0Var.b.c();
        x6h1VarC.i.add(new a7h1("consumption_entry", (String) null, num, str, (String) null));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }

    public s6m0(p6m0 p6m0Var, String str) {
        this.a = (byte) 0;
        this.c = p6m0Var;
        x6h1 x6h1VarC = p6m0Var.b.c();
        x6h1VarC.i.add(new a7h1("banner", (String) null, (Integer) null, (String) null, str));
        x6h1VarC.j = true;
        this.b = x6h1VarC.a();
    }
}
