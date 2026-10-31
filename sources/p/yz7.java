package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yz7 implements obw0 {
    public final rsk0 a;

    public yz7(rsk0 rsk0Var) {
        this.a = rsk0Var;
    }

    public final w7h1 a(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        x7h1 x7h1Var = new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str));
        rsk0 rsk0Var = this.a;
        return new w7h1("", "", z7h1Var, x7h1Var, rsk0Var.c, rsk0Var.b, System.currentTimeMillis());
    }

    public final r6h1 b() {
        return this.a.b();
    }

    public final xhe1 c() {
        return new fl1(this.a, (byte) 25);
    }

    public final k6h1 e() {
        return this.a.e();
    }

    public final pnm f() {
        return new yo31(this.a, (byte) 24);
    }

    public final w7h1 g() {
        b7x b7xVar = b7x.a;
        z7h1 z7h1Var = new z7h1("long_hit", 1, b7xVar);
        x7h1 x7h1Var = new x7h1("ui_reveal", 1, b7xVar);
        rsk0 rsk0Var = this.a;
        return new w7h1("", "", z7h1Var, x7h1Var, rsk0Var.c, rsk0Var.b, System.currentTimeMillis());
    }
}
