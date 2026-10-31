package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o3m0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ p3m0 b;

    public o3m0(p3m0 p3m0Var, String str, String str2, String str3) {
        this.b = p3m0Var;
        x6h1 x6h1VarC = p3m0Var.a.c();
        x6h1VarC.i.add(new a7h1("watch_feed_component", str, (Integer) null, str3, str2));
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
        k7h1Var.e = this.b.b.b.c;
        return k7h1Var.a();
    }

    public final w7h1 h(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str)), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final w7h1 i(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str)), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final w7h1 j(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str)), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final w7h1 k(Integer num, String str, Integer num2) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        mmr0 mmr0Var = new mmr0("item_to_be_skipped", str);
        String strValueOf = String.valueOf(0);
        if (strValueOf == null) {
            strValueOf = "";
        }
        mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
        String strValueOf2 = String.valueOf(0);
        return new w7h1("", "", z7h1Var, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final w7h1 l() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final w7h1 m() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), this.a, r6h1.c, System.currentTimeMillis());
    }

    public final w7h1 n(String str) {
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str)), this.a, r6h1.c, System.currentTimeMillis());
    }
}
