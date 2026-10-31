package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lql0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ pql0 c;

    public lql0(pql0 pql0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = pql0Var;
                x6h1 x6h1VarC = pql0Var.a.c();
                x6h1VarC.i.add(new a7h1("friends_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            case 2:
                this.c = pql0Var;
                x6h1 x6h1VarC2 = pql0Var.a.c();
                x6h1VarC2.i.add(new a7h1("invited_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
            case 3:
                this.c = pql0Var;
                x6h1 x6h1VarC3 = pql0Var.a.c();
                x6h1VarC3.i.add(new a7h1("suggested_users_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                this.b = x6h1VarC3.a();
                break;
            default:
                this.c = pql0Var;
                x6h1 x6h1VarC4 = pql0Var.a.c();
                x6h1VarC4.i.add(new a7h1("friend_requests_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                this.b = x6h1VarC4.a();
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
            default:
                r6h1 r6h1Var4 = r6h1.c;
                break;
        }
        return new r6h1(kk0.l(y6h1Var), (u8h1) null);
    }
}
