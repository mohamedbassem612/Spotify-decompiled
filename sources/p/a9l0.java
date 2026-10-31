package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a9l0 implements n8h1 {
    public final y6h1 a;

    public a9l0(Integer num, String str, nqk0 nqk0Var) {
        x6h1 x6h1VarC = nqk0Var.b.c();
        x6h1VarC.i.add(new a7h1("managed_account_row", (String) null, num, str, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }
}
