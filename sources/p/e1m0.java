package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e1m0 implements n8h1 {
    public final y6h1 a;

    public e1m0(brl0 brl0Var, int i) {
        String str;
        x6h1 x6h1VarC = brl0Var.b.c();
        if (i == 1) {
            str = "followed_artists";
        } else if (i == 2) {
            str = "liked_songs";
        } else if (i == 3) {
            str = "most_played";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "recently_played";
        }
        x6h1VarC.i.add(new a7h1("landing", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }
}
