package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f1l0 implements n8h1 {
    public final y6h1 a;

    public f1l0(i3l0 i3l0Var) {
        x6h1 x6h1VarC = i3l0Var.a.c();
        x6h1VarC.i.add(new a7h1("notes_visibility_toggle_item", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }

    public final w7h1 e(int i, int i2) {
        Object obj;
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String str = "notes_hidden";
        if (i == 1) {
            obj = "notes_hidden";
        } else {
            if (i != 2) {
                throw null;
            }
            obj = "notes_visible";
        }
        mmr0 mmr0Var = new mmr0("state_before_toggle", obj);
        if (i2 != 1) {
            if (i2 != 2) {
                throw null;
            }
            str = "notes_visible";
        }
        return new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str)})), this.a, r6h1.c, System.currentTimeMillis());
    }
}
