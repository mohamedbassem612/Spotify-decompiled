package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q3m0 implements n8h1 {
    public final y6h1 a;
    public final /* synthetic */ brl0 b;

    public q3m0(Integer num, String str, brl0 brl0Var) {
        this.b = brl0Var;
        x6h1 x6h1VarC = brl0Var.b.c();
        x6h1VarC.i.add(new a7h1("watch_feed_vertical_item", (String) null, num, (String) null, str));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }

    public final p3m0 e(String str, String str2, Integer num) {
        return new p3m0(this, num, str, str2);
    }
}
