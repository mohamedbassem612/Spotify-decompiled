package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w2l0 implements n8h1 {
    public final y6h1 a;

    public w2l0(i3l0 i3l0Var, String str) {
        x6h1 x6h1VarC = i3l0Var.a.c();
        x6h1VarC.i.add(new a7h1("toggle_mark_as_played_item", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }

    public final w7h1 e(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("mark_as_played", 1, Collections.singletonMap("item_played", str)), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final w7h1 h(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("mark_as_unplayed", 1, Collections.singletonMap("item_unplayed", str)), this.a, r6h1.c, System.currentTimeMillis());
    }
}
