package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i8l0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ h7l0 b;

    public i8l0(h7l0 h7l0Var, int i) {
        String str;
        this.b = h7l0Var;
        x6h1 x6h1VarC = h7l0Var.b.c();
        if (i == 1) {
            str = "empty_search_input";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "no_results";
        }
        x6h1VarC.i.add(new a7h1("empty_view", (String) null, (Integer) null, (String) null, str));
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
        k7h1Var.e = this.b.c;
        return k7h1Var.a();
    }
}
