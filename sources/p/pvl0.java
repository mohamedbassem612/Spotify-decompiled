package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pvl0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ lvl0 c;

    public pvl0(lvl0 lvl0Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = lvl0Var;
                x6h1 x6h1VarC = lvl0Var.b.c();
                x6h1VarC.i.add(new a7h1("recommended_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                this.c = lvl0Var;
                x6h1 x6h1VarC2 = lvl0Var.b.c();
                x6h1VarC2.i.add(new a7h1("recents", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
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
            default:
                r6h1 r6h1Var2 = r6h1.c;
                break;
        }
        return new r6h1(kk0.l(y6h1Var), (u8h1) null);
    }
}
