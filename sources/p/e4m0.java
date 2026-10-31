package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e4m0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ i4m0 b;

    public e4m0(i4m0 i4m0Var, Integer num, int i, String str) {
        String str2;
        this.b = i4m0Var;
        x6h1 x6h1VarC = i4m0Var.a.c();
        if (i == 1) {
            str2 = "expandable";
        } else {
            if (i != 2) {
                throw null;
            }
            str2 = "static";
        }
        x6h1VarC.i.add(new a7h1("entity_data_row", (String) null, num, str, str2));
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
        k7h1Var.e = this.b.b;
        return k7h1Var.a();
    }
}
