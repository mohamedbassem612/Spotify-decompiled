package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a0m0 implements n8h1 {
    public final y6h1 a;

    public a0m0(brl0 brl0Var, int i, Integer num) {
        String str;
        x6h1 x6h1VarC = brl0Var.b.c();
        if (i == 1) {
            str = "fifteen_seconds";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "next_chapter";
        }
        x6h1VarC.i.add(new a7h1("option_row", str, num, (String) null, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }
}
