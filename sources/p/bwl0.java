package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bwl0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ gwl0 b;

    public bwl0(gwl0 gwl0Var, Integer num, String str) {
        this.b = gwl0Var;
        x6h1 x6h1VarC = gwl0Var.a.c();
        x6h1VarC.i.add(new a7h1("crossword_result_item", (String) null, num, str, (String) null));
        x6h1VarC.j = true;
        this.a = x6h1VarC.a();
    }

    public final w7h1 a(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = ((mjl0) this.b.b.c.c).c.c;
        return k7h1Var.a();
    }

    public final w7h1 h(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str)), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final w7h1 i() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final w7h1 j(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str)), this.a, r6h1.c, System.currentTimeMillis());
    }
}
