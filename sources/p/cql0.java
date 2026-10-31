package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cql0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ fql0 c;

    public cql0(fql0 fql0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = fql0Var;
                x6h1 x6h1VarC = fql0Var.a.c();
                x6h1VarC.i.add(new a7h1("public_playlists", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            case 2:
                this.c = fql0Var;
                x6h1 x6h1VarC2 = fql0Var.a.c();
                x6h1VarC2.i.add(new a7h1("recently_played_artists", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
            default:
                this.c = fql0Var;
                x6h1 x6h1VarC3 = fql0Var.a.c();
                x6h1VarC3.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                this.b = x6h1VarC3.a();
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                break;
            case 1:
                r6h1 r6h1Var2 = r6h1.c;
                break;
            default:
                r6h1 r6h1Var3 = r6h1.c;
                break;
        }
        return new r6h1(kk0.l(y6h1Var), (u8h1) null);
    }
}
