package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v1l0 implements n8h1 {
    public final y6h1 a;

    public v1l0(i3l0 i3l0Var) {
        x6h1 x6h1VarC = i3l0Var.a.c();
        x6h1VarC.i.add(new a7h1("remove_from_playlist_item", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }

    public final w7h1 e(String str, String str2) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        mmr0 mmr0Var = new mmr0("item_to_be_removed_from_playlist", str);
        if (str2 == null) {
            str2 = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("remove_item_from_playlist", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("playlist", str2)})), this.a, r6h1.c, System.currentTimeMillis());
    }
}
