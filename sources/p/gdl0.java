package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gdl0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ jpk0 b;

    public gdl0(jpk0 jpk0Var, int i, String str) {
        String str2;
        this.b = jpk0Var;
        x6h1 x6h1VarC = jpk0Var.b.c();
        if (i == 1) {
            str2 = "locked_unregistered";
        } else if (i == 2) {
            str2 = "registered";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "unregistered";
        }
        x6h1VarC.i.add(new a7h1("upcoming_party_large_card", str2, (Integer) null, str, (String) null));
        x6h1VarC.j = true;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = this.b.c.c;
        return k7h1Var.a();
    }
}
