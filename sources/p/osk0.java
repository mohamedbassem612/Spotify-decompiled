package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class osk0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ psk0 b;

    public osk0(psk0 psk0Var) {
        this.b = psk0Var;
        x6h1 x6h1VarC = psk0Var.a.c();
        x6h1VarC.i.add(new a7h1("pairing_error_label", (String) null, (Integer) null, (String) null, (String) null));
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
