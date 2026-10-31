package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wt1 {
    public final i8h1 a;
    public final gpk0 b;
    public final String c;

    public wt1(n6r0 n6r0Var, i8h1 i8h1Var, av1 av1Var) {
        this.a = i8h1Var;
        this.b = new gpk0(n6r0Var.path());
        String str = av1Var.c;
        this.c = str.length() == 0 ? "none" : str;
    }

    public final tv80 a(String str, String str2) {
        x6h1 x6h1VarC = this.b.a.c();
        x6h1VarC.i.add(new a7h1("item", (String) null, -1, str, this.c));
        x6h1VarC.j = false;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("add_to_playlist", 2, sqg0.J(new mmr0[]{new mmr0("playlist", str), new mmr0("item_to_be_added", str2)})), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final tv80 b(String str, String str2) {
        x6h1 x6h1VarC = this.b.a.c();
        x6h1VarC.i.add(new a7h1("item", (String) null, -1, str, this.c));
        x6h1VarC.j = false;
        return this.a.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("remove_item_from_playlist", 2, sqg0.J(new mmr0[]{new mmr0("item_to_be_removed_from_playlist", str2), new mmr0("playlist", str)})), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
