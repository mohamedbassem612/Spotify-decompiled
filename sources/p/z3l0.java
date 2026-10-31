package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z3l0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ txk0 b;

    public z3l0(txk0 txk0Var, int i, Integer num) {
        String str;
        this.b = txk0Var;
        x6h1 x6h1VarC = txk0Var.b.c();
        if (i == 1) {
            str = "ai_persona";
        } else if (i == 2) {
            str = "ai_persona_likely";
        } else if (i == 3) {
            str = "fresh_finds_forward";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "verified";
        }
        x6h1VarC.i.add(new a7h1("badge", str, num, (String) null, (String) null));
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

    public final w7h1 h() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.a, r6h1.c, System.currentTimeMillis());
    }
}
