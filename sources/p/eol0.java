package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eol0 implements n8h1 {
    public final y6h1 a;

    public eol0(qgl0 qgl0Var, String str) {
        x6h1 x6h1VarC = qgl0Var.b.c();
        x6h1VarC.i.add(new a7h1("scannable_option", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }
}
