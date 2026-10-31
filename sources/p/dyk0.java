package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dyk0 implements n8h1, p8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ fyk0 c;

    public dyk0(fyk0 fyk0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = fyk0Var;
                x6h1 x6h1VarC = fyk0Var.a.c();
                x6h1VarC.i.add(new a7h1("no_devices_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                this.b = x6h1VarC.a();
                break;
            default:
                this.c = fyk0Var;
                x6h1 x6h1VarC2 = fyk0Var.a.c();
                x6h1VarC2.i.add(new a7h1("error_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                this.b = x6h1VarC2.a();
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
            default:
                r6h1 r6h1Var2 = r6h1.c;
                break;
        }
        return new r6h1(kk0.l(y6h1Var), (u8h1) null);
    }

    public final l7h1 e() {
        byte b = this.a;
        fyk0 fyk0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = fyk0Var.b;
                return k7h1Var.a();
            default:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = fyk0Var.b;
                return k7h1Var2.a();
        }
    }
}
