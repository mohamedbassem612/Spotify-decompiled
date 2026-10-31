package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mvl0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ lvl0 b;

    public mvl0(lvl0 lvl0Var) {
        this.b = lvl0Var;
        x6h1 x6h1VarC = lvl0Var.b.c();
        x6h1VarC.i.add(new a7h1("error_message", (String) null, (Integer) null, (String) null, (String) null));
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
        k7h1Var.e = ((mjl0) this.b.c.c).c.c;
        return k7h1Var.a();
    }

    public final w7h1 h() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), this.a, r6h1.c, System.currentTimeMillis());
    }
}
