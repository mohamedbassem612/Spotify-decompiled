package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class irk0 implements n8h1, p8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ sqk0 c;

    public irk0(sqk0 sqk0Var, Integer num, String str, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = sqk0Var;
                x6h1 x6h1VarC = sqk0Var.b.c();
                x6h1VarC.i.add(new a7h1("default_item", (String) null, num, str, (String) null));
                x6h1VarC.j = true;
                this.b = x6h1VarC.a();
                break;
            case 2:
                this.c = sqk0Var;
                x6h1 x6h1VarC2 = sqk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("show_item", (String) null, num, str, (String) null));
                x6h1VarC2.j = true;
                this.b = x6h1VarC2.a();
                break;
            default:
                this.c = sqk0Var;
                x6h1 x6h1VarC3 = sqk0Var.b.c();
                x6h1VarC3.i.add(new a7h1("artist_item", (String) null, num, str, (String) null));
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
            default:
                r6h1 r6h1Var3 = r6h1.c;
                break;
        }
        return new r6h1(kk0.l(y6h1Var), (u8h1) null);
    }

    public final l7h1 e() {
        byte b = this.a;
        sqk0 sqk0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = ((jrk0) sqk0Var.c).b.c;
                return k7h1Var.a();
            case 1:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = ((jrk0) sqk0Var.c).b.c;
                return k7h1Var2.a();
            default:
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1Var;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var3.e = ((jrk0) sqk0Var.c).b.c;
                return k7h1Var3.a();
        }
    }
}
