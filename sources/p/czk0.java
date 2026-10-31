package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class czk0 implements n8h1 {
    public final y6h1 a;

    public czk0(i3l0 i3l0Var, int i) {
        String str;
        x6h1 x6h1VarC = i3l0Var.a.c();
        if (i == 1) {
            str = "managed_account_flow";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "plan_manager_flow";
        }
        x6h1VarC.i.add(new a7h1("block_content_for_child_item", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }

    public final w7h1 e() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.a, r6h1.c, System.currentTimeMillis());
    }
}
