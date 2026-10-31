package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r2l0 implements n8h1 {
    public final y6h1 a;

    public r2l0(i3l0 i3l0Var) {
        x6h1 x6h1VarC = i3l0Var.a.c();
        x6h1VarC.i.add(new a7h1("toggle_follow_item", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }

    public final w7h1 e(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str)), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final w7h1 h(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str)), this.a, r6h1.c, System.currentTimeMillis());
    }
}
