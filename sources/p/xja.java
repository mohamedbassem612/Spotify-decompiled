package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xja implements rqw {
    public final /* synthetic */ byte a;
    public final ell0 b;

    public xja(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new ell0(r6h1.c);
                break;
            case 2:
                this.b = new ell0(r6h1.c);
                break;
            default:
                this.b = new ell0(r6h1.c);
                break;
        }
    }

    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return null;
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        ell0 ell0Var = this.b;
        switch (b) {
            case 0:
                x6h1 x6h1VarC = ell0Var.a.c();
                x6h1VarC.i.add(new a7h1("benefit_list_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1.c;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 1:
                x6h1 x6h1VarC2 = ell0Var.a.c();
                x6h1VarC2.i.add(new a7h1("bottom_text", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).b = r6h1.c;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
            default:
                x6h1 x6h1VarC3 = ell0Var.a.c();
                x6h1VarC3.i.add(new a7h1("offer_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA3 = x6h1VarC3.a();
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1VarA3;
                ((xjn) k7h1Var3).b = r6h1.c;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var3.a();
        }
    }
}
